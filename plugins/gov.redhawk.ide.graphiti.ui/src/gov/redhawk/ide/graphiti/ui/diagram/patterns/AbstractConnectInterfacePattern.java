/*******************************************************************************
 * This file is protected by Copyright. 
 * Please refer to the COPYRIGHT file distributed with this source distribution.
 *
 * This file is part of REDHAWK IDE.
 *
 * All rights reserved.  This program and the accompanying materials are made available under 
 * the terms of the Eclipse Public License v1.0 which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package gov.redhawk.ide.graphiti.ui.diagram.patterns;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.graphiti.features.context.IAddConnectionContext;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.IConnectionContext;
import org.eclipse.graphiti.features.context.ICreateConnectionContext;
import org.eclipse.graphiti.mm.algorithms.Polygon;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.ConnectionDecorator;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.pattern.AbstractConnectionPattern;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;

import gov.redhawk.ide.graphiti.ext.RHContainerShape;
import gov.redhawk.ide.graphiti.ui.diagram.providers.AbstractGraphitiToolBehaviorProvider;
import gov.redhawk.ide.graphiti.ui.diagram.providers.ConnectionHighlightingDecoratorProvider;
import gov.redhawk.ide.graphiti.ui.diagram.providers.IDecoratorProvider;
import gov.redhawk.ide.graphiti.ui.diagram.util.DUtil;
import gov.redhawk.ide.graphiti.ui.diagram.util.StyleUtil;
import gov.redhawk.sca.util.StringUtil;
import mil.jpeojtrs.sca.partitioning.ConnectInterface;
import mil.jpeojtrs.sca.partitioning.ConnectionTarget;
import mil.jpeojtrs.sca.partitioning.Connections;
import mil.jpeojtrs.sca.partitioning.UsesPortStub;
import mil.jpeojtrs.sca.util.ScaEcoreUtils;

public class AbstractConnectInterfacePattern extends AbstractConnectionPattern {

	public static final String NAME = "Connection";
	public static final String SHAPE_IMG_CONNECTION_DECORATOR = "imgConnectionDecorator";
	public static final String SHAPE_TEXT_CONNECTION_DECORATOR = "textConnectionDecorator";
	public static final String OVERRIDE_CONNECTION_ID = "OverrideConnectionId";

	private Anchor source;

	@Override
	public String getCreateName() {
		return NAME;
	}

	@Override
	public String getCreateDescription() {
		return "Create new Connect Interface";
	}

	@Override
	public boolean canStartConnection(ICreateConnectionContext context) {
		// Not allowed in the explorer or if read-only
		Diagram diagram = getDiagram();
		if (DUtil.isDiagramExplorer(diagram) || DUtil.isDiagramReadOnly(diagram)) {
			return false;
		}

		// Check if the source anchor belongs to a component, and disallow the connection if it's disabled
		RHContainerShape component = ScaEcoreUtils.getEContainerOfType(context.getSourceAnchor(), RHContainerShape.class);
		if (component != null && !component.isEnabled()) {
			return false;
		}

		// We must be able to find a UsesPortStub or ConnectionTarget
		if (getUsesPortStub(context) != null || getConnectionTarget(context) != null) {
			source = context.getSourceAnchor();
			return true;
		}

		return false;
	}

	@Override
	public void startConnecting() {
		// Highlight ports that may be valid for completing the connection
		highlightCompatibleAnchors(source);
	}

	protected void highlightCompatibleAnchors(Anchor source) {
		AbstractGraphitiToolBehaviorProvider provider = (AbstractGraphitiToolBehaviorProvider) getDiagramBehavior().getDiagramContainer().getDiagramTypeProvider().getCurrentToolBehaviorProvider();
		for (IDecoratorProvider decoratorProvider : provider.getDecoratorProviders()) {
			if (decoratorProvider instanceof ConnectionHighlightingDecoratorProvider) {
				((ConnectionHighlightingDecoratorProvider) decoratorProvider).startHighlighting(source);
				getDiagramBehavior().refreshContent();
				return;
			}
		}
	}

	@Override
	public boolean canCreate(ICreateConnectionContext context) {
		// Check if the target anchor belongs to a component, and disallow the connection if it's disabled; the source
		// was already checked in canStart().
		RHContainerShape component = ScaEcoreUtils.getEContainerOfType(context.getTargetAnchor(), RHContainerShape.class);
		if (component != null && !component.isEnabled()) {
			return false;
		}

		// In any other case, assume it's a valid connection so that the mouse pointer doesn't give negative feedback.
		return true;
	}

	@Override
	public PictogramElement add(IAddContext addContext) {
		IAddConnectionContext context = (IAddConnectionContext) addContext;

		// source and target
		UsesPortStub source = getUsesPortStub(context);
		ConnectionTarget target = getConnectionTarget(context);

		// Create connection (handle user selecting source or target)
		Connection connectionPE = Graphiti.getPeCreateService().createFreeFormConnection(getFeatureProvider().getDiagramTypeProvider().getDiagram());
		if (source == getUsesPortStub(context.getSourceAnchor()) && target == getConnectionTarget(context.getTargetAnchor())) {
			connectionPE.setStart(context.getSourceAnchor());
			connectionPE.setEnd(context.getTargetAnchor());
		} else if (source == getUsesPortStub(context.getTargetAnchor()) && target == getConnectionTarget(context.getSourceAnchor())) {
			connectionPE.setStart(context.getTargetAnchor());
			connectionPE.setEnd(context.getSourceAnchor());
		}

		// create line
		IGaService gaService = Graphiti.getGaService();
		Polyline line = gaService.createPlainPolyline(connectionPE);
		String styleId = (String) context.getProperty("LineStyle");
		if (styleId == null) {
			styleId = StyleUtil.CONNECTION;
		}
		StyleUtil.setStyle(line, styleId);

		// link ports to connection
		getFeatureProvider().link(connectionPE, new Object[] { context.getNewObject(), source, target });

		return connectionPE;
	}

	/**
	 * Add graphical X to the middle of an erroneous connection
	 */
	protected static void addErrorDecorator(Diagram diagram, Connection connection) {
		IGaService gaService = Graphiti.getGaService();
		ConnectionDecorator errorDecorator = Graphiti.getPeCreateService().createConnectionDecorator(connection, false, 0.5, true);
		Polyline errPolyline = gaService.createPlainPolyline(errorDecorator, new int[] { -7, 7, 0, 0, -7, -7, 0, 0, 7, -7, 0, 0, 7, 7 });
		StyleUtil.setStyle(errPolyline, StyleUtil.CONNECTION_ERROR);
	}

	/**
	 *  Add a graphical arrow to end of the connection
	 */
	protected static void addConnectionArrow(Diagram diagram, Connection connection, String styleId) {
		IGaService gaService = Graphiti.getGaService();
		ConnectionDecorator arrowDecorator = Graphiti.getPeCreateService().createConnectionDecorator(connection, false, 1.0, true);
		Polygon polyArrow = gaService.createPlainPolygon(arrowDecorator, new int[] { -10, 5, 0, 0, -10, -5 });
		StyleUtil.setStyle(polyArrow, styleId);
	}

	@Override
	public void endConnecting() {
		// Turns off highlighting ports for the connection
		AbstractGraphitiToolBehaviorProvider provider = (AbstractGraphitiToolBehaviorProvider) getDiagramBehavior().getDiagramContainer().getDiagramTypeProvider().getCurrentToolBehaviorProvider();
		for (IDecoratorProvider decoratorProvider : provider.getDecoratorProviders()) {
			if (decoratorProvider instanceof ConnectionHighlightingDecoratorProvider) {
				((ConnectionHighlightingDecoratorProvider) decoratorProvider).endHighlighting();
			}
		}
		getDiagramBehavior().refreshContent();

		super.endConnecting();
	}

	/**
	 * Return UsesPortStub from either the source or target anchor. Depends on how user drew connection.
	 * @param context
	 * @return
	 */
	protected UsesPortStub getUsesPortStub(IConnectionContext context) {
		UsesPortStub source = getUsesPortStub(context.getSourceAnchor());
		if (source != null) {
			return source;
		}
		source = getUsesPortStub(context.getTargetAnchor());
		return source;
	}

	protected UsesPortStub getUsesPortStub(Anchor anchor) {
		if (anchor != null) {
			Object object = getBusinessObjectForPictogramElement(anchor.getParent());
			if (object instanceof UsesPortStub) {
				return (UsesPortStub) object;
			}
		}
		return null;
	}

	/**
	 * Return ConnectionTarget from either the source or target anchor. Depends on how user drew connection.
	 * @param context
	 * @return
	 */
	protected ConnectionTarget getConnectionTarget(IConnectionContext context) {
		ConnectionTarget connectionTarget = getConnectionTarget(context.getSourceAnchor());
		if (connectionTarget != null) {
			return connectionTarget;
		}
		connectionTarget = getConnectionTarget(context.getTargetAnchor());
		return connectionTarget;
	}

	protected ConnectionTarget getConnectionTarget(Anchor anchor) {
		if (anchor != null) {
			Object object = getBusinessObjectForPictogramElement(anchor.getParent());
			if (object instanceof ConnectionTarget) {
				return (ConnectionTarget) object;
			}
		}
		return null;
	}

	/**
	 * Returns the next available connection id
	 * @param sad SoftwareAssembly
	 */
	protected String createConnectionId(Connections< ? > connections) {
		final List<String> ids = new ArrayList<String>();
		if (connections != null) {
			for (final ConnectInterface< ? , ? , ? > connection : connections.getConnectInterface()) {
				ids.add(connection.getId());
			}
		}
		return StringUtil.defaultCreateUniqueString("connection_1", ids);
	}

}
