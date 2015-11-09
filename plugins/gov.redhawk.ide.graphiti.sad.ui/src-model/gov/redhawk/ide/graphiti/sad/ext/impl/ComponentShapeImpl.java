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
// BEGIN GENERATED CODE
package gov.redhawk.ide.graphiti.sad.ext.impl;

import gov.redhawk.ide.graphiti.ext.impl.RHContainerShapeImpl;
import gov.redhawk.ide.graphiti.sad.ext.ComponentShape;
import gov.redhawk.ide.graphiti.sad.ext.RHSadGxPackage;
import gov.redhawk.ide.graphiti.sad.ui.diagram.patterns.ComponentPattern;
import gov.redhawk.ide.graphiti.ui.diagram.util.DUtil;
import gov.redhawk.ide.graphiti.ui.diagram.util.StyleUtil;
import java.math.BigInteger;
import mil.jpeojtrs.sca.sad.AssemblyController;
import mil.jpeojtrs.sca.sad.ExternalPorts;
import mil.jpeojtrs.sca.sad.SadComponentInstantiation;
import mil.jpeojtrs.sca.sad.SoftwareAssembly;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.graphiti.datatypes.IDimension;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.impl.Reason;
import org.eclipse.graphiti.mm.algorithms.Ellipse;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Shape</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ComponentShapeImpl extends RHContainerShapeImpl implements ComponentShape {

	// END GENERATED CODE

	// These are property key/value pairs that help us resize an existing shape by properly identifying
	// graphicsAlgorithms
	public static final String GA_START_ORDER_ELLIPSE = "startOrderEllipse";
	public static final String GA_START_ORDER_TEXT = "startOrderText";

	// Property key/value pairs help us identify Shapes to enable/disable user actions (move, resize, delete, remove
	// etc.)
	public static final String SHAPE_START_ORDER_ELLIPSE_SHAPE = "startOrderEllipseShape";

	// Shape size constants
	public static final int START_ORDER_ELLIPSE_DIAMETER = 17;
	public static final int START_ORDER_TOP_TEXT_PADDING = 0;
	public static final int START_ORDER_ELLIPSE_LEFT_PADDING = 20;
	public static final int START_ORDER_ELLIPSE_RIGHT_PADDING = 5;
	public static final int START_ORDER_ELLIPSE_TOP_PADDING = 5;

	// Default start order text value for components that do not have a start order declared
	private static final String NO_START_ORDER_STRING = "";

	// BEGIN GENERATED CODE

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentShapeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RHSadGxPackage.Literals.COMPONENT_SHAPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Creates the inner shapes that make up this container shape
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void init(IAddContext context, ComponentPattern pattern) {
		// END GENERATED CODE
		if (!(context.getNewObject() instanceof SadComponentInstantiation)) {
			return;
		}
		SadComponentInstantiation ci = (SadComponentInstantiation) context.getNewObject();
		IFeatureProvider featureProvider = pattern.getFeatureProvider();
		Diagram diagram = featureProvider.getDiagramTypeProvider().getDiagram();
		final SoftwareAssembly sad = DUtil.getDiagramSAD(diagram);
		AssemblyController assemblyController = SoftwareAssembly.Util.isAssemblyController(ci) ? sad.getAssemblyController() : null;

		// create graphical representation
		super.init(context, pattern);

		// add start order ellipse
		if (sad.getId() != null && !(DUtil.isDiagramRuntime(DUtil.findDiagram(this)))) {
			addStartOrderEllipse(ci, assemblyController, featureProvider);
		}

		// set innerContainer color based on started value
		updateStyleForComponentInner();

		// runtimeAdapter = new ComponentRuntimeAdapter(this, featureProvider);
		// BEGIN GENERATED CODE
	}

	/**
	 * <!-- begin-user-doc -->
	 * Updates the shape's contents using the supplied fields. Return true if an update occurred, false otherwise.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Reason update(final IUpdateContext context, ComponentPattern pattern) {
		// END GENERATED CODE
		SadComponentInstantiation ci = (SadComponentInstantiation) DUtil.getBusinessObject(context.getPictogramElement());
		return this.internalUpdate(pattern, ci, true);
		// BEGIN GENERATED CODE
	}

	/**
	 * <!-- begin-user-doc -->
	 * Return true (through Reason) if the shape's contents require an update based on the field supplied.
	 * Also returns a textual reason why an update is needed. Returns false otherwise.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Reason updateNeeded(final IUpdateContext context, ComponentPattern pattern) {
		// END GENERATED CODE
		SadComponentInstantiation ci = (SadComponentInstantiation) DUtil.getBusinessObject(context.getPictogramElement());
		return this.internalUpdate(pattern, ci, false);
		// BEGIN GENERATED CODE
	}

	// END GENERATED CODE

	/**
	 * Add an Ellipse to provided container shape that will contain the start order from sadComponentInstantiation
	 */
	protected ContainerShape addStartOrderEllipse(SadComponentInstantiation sadComponentInstantiation, AssemblyController assemblyController,
		IFeatureProvider featureProvider) {

		// Create ellipse shape to display component start order
		ContainerShape startOrderEllipseShape = Graphiti.getCreateService().createContainerShape(getInnerContainerShape(), false);
		Graphiti.getPeService().setPropertyValue(startOrderEllipseShape, DUtil.SHAPE_TYPE, SHAPE_START_ORDER_ELLIPSE_SHAPE);
		Ellipse startOrderEllipse = Graphiti.getCreateService().createEllipse(startOrderEllipseShape);

		if (assemblyController != null) {
			// If component is assembly controller, then set background to a different color
			StyleUtil.setStyle(startOrderEllipse, StyleUtil.ASSEMBLY_CONTROLLER_ELLIPSE);
			featureProvider.link(startOrderEllipseShape, assemblyController);
		} else {
			StyleUtil.setStyle(startOrderEllipse, StyleUtil.START_ORDER_ELLIPSE);
		}
		Graphiti.getPeService().setPropertyValue(startOrderEllipse, DUtil.GA_TYPE, GA_START_ORDER_ELLIPSE);
		Graphiti.getGaLayoutService().setSize(startOrderEllipse, START_ORDER_ELLIPSE_DIAMETER, START_ORDER_ELLIPSE_DIAMETER);

		// Set start order value for pictogram element
		String startOrder;
		if (sadComponentInstantiation.getStartOrder() == null) {
			// if business object start order is null (possible in legacy waveforms), then set to an empty string
			startOrder = NO_START_ORDER_STRING;
		} else {
			// if business object start order != null, then set text to that value
			startOrder = sadComponentInstantiation.getStartOrder().toString();
		}

		// Create text shape to display start order
		Shape startOrderTextShape = Graphiti.getPeCreateService().createShape(startOrderEllipseShape, false);
		Text startOrderText = Graphiti.getCreateService().createText(startOrderTextShape, startOrder);
		Graphiti.getPeService().setPropertyValue(startOrderText, DUtil.GA_TYPE, GA_START_ORDER_TEXT);
		StyleUtil.setStyle(startOrderText, StyleUtil.START_ORDER);
		Graphiti.getGaLayoutService().setSize(startOrderText, START_ORDER_ELLIPSE_DIAMETER, START_ORDER_ELLIPSE_DIAMETER);

		return startOrderEllipseShape;
	}

	/**
	 * Return the startOrderEllipseShape
	 */
	public ContainerShape getStartOrderEllipseShape() {
		return (ContainerShape) DUtil.findFirstPropertyContainer(this, SHAPE_START_ORDER_ELLIPSE_SHAPE);
	}

	/**
	 * Return the startOrderText
	 */
	public Text getStartOrderText() {
		return (Text) DUtil.findFirstPropertyContainer(getStartOrderEllipseShape(), GA_START_ORDER_TEXT);
	}

	@Override
	protected void layoutInnerShape(ContainerShape innerShape) {
		super.layoutInnerShape(innerShape);

		ContainerShape startOrderEllipse = (ContainerShape) DUtil.findFirstPropertyContainer(innerShape, SHAPE_START_ORDER_ELLIPSE_SHAPE);
		if (startOrderEllipse != null && !DUtil.isDiagramRuntime(DUtil.findDiagram(this))) {
			// Set the layout for the start order ellipse
			int xOffset = innerShape.getGraphicsAlgorithm().getWidth() - (START_ORDER_ELLIPSE_DIAMETER + START_ORDER_ELLIPSE_RIGHT_PADDING);
			Graphiti.getGaLayoutService().setLocation(startOrderEllipse.getGraphicsAlgorithm(), xOffset, START_ORDER_ELLIPSE_TOP_PADDING);

			// Position the text
			Text startOrderText = getStartOrderText();
			IDimension textDimension = DUtil.calculateTextSize(startOrderText);
			int textX = START_ORDER_ELLIPSE_DIAMETER / 2 - textDimension.getWidth() / 2;
			Graphiti.getGaLayoutService().setLocation(startOrderText, textX, START_ORDER_TOP_TEXT_PADDING);
		}
	}

	/**
	 * Performs either an update or a check to determine if update is required.
	 * if performUpdate flag is true it will update the shape,
	 * otherwise it will return reason why update is required.
	 * @param component instantiation
	 * @param performUpdate
	 * @return
	 */
	protected Reason internalUpdate(ComponentPattern pattern, SadComponentInstantiation ci, boolean performUpdate) {
		Diagram diagram = DUtil.findDiagram(this);
		IFeatureProvider featureProvider = pattern.getFeatureProvider();
		SoftwareAssembly sad = DUtil.getDiagramSAD(diagram);
		ExternalPorts externalPorts = DUtil.getDiagramSAD(diagram).getExternalPorts();
		AssemblyController assemblyController = SoftwareAssembly.Util.isAssemblyController(ci) ? sad.getAssemblyController() : null;

		// get external ports relevant to component instantiation
		Reason superReason = super.internalUpdate(pattern, ci, performUpdate);

		boolean updateStatus;

		// if parent says we need to update, return now
		if (!performUpdate && superReason.toBoolean()) {
			return superReason;
		} else {
			updateStatus = superReason.toBoolean();
		}

		if (sad.getId() != null && !(DUtil.isDiagramRuntime(DUtil.findDiagram(this)))) {
			// update startOrderText
			Text startOrderTextGA = getStartOrderText();
			if (ci.getStartOrder() == null && !startOrderTextGA.getValue().equals(NO_START_ORDER_STRING)) {
				// Start order was removed from component business object that previously had one.
				if (performUpdate) {
					updateStatus = true;
					startOrderTextGA.setValue(NO_START_ORDER_STRING);
				} else {
					return new Reason(true, "Component start order removed, update required");
				}
			} else if (ci.getStartOrder() != null && startOrderTextGA.getValue().equals(NO_START_ORDER_STRING)) {
				// Start order was add to component business object that previously DID NOT have one
				if (performUpdate) {
					updateStatus = true;
					startOrderTextGA.setValue(ci.getStartOrder().toString());
				} else {
					return new Reason(true, "Component has been assigned a start order, update required");
				}
			} else if (ci.getStartOrder() != null && !startOrderTextGA.getValue().equals(NO_START_ORDER_STRING)
				&& ci.getStartOrder().compareTo(new BigInteger(startOrderTextGA.getValue())) != 0) {
				// Handle all other start order changes
				if (performUpdate) {
					updateStatus = true;
					startOrderTextGA.setValue(ci.getStartOrder().toString());
				} else {
					return new Reason(true, "Component start order changed, update required");
				}
			}

			// update assembly controller styling and text
			Ellipse startOrderEllipse = (Ellipse) getStartOrderEllipseShape().getGraphicsAlgorithm();
			boolean needsUpdate = !StyleUtil.isStyleSet(startOrderEllipse, StyleUtil.ASSEMBLY_CONTROLLER_ELLIPSE);
			boolean isTextCorrect = (ci.getStartOrder() != null) ? (ci.getStartOrder().compareTo(BigInteger.ZERO) == 0) : startOrderTextGA.getValue().isEmpty();
			if ((needsUpdate || !isTextCorrect) && assemblyController != null) {
				// if assembly controller, then use special style
				if (performUpdate) {
					updateStatus = true;
					StyleUtil.setStyle(startOrderEllipse, StyleUtil.ASSEMBLY_CONTROLLER_ELLIPSE);
					if (ci.getStartOrder() != null && ci.getStartOrder().compareTo(BigInteger.ZERO) != 0) {
						// Make sure start order is set to zero for assembly controller, if the update occurred from
						// elsewhere in the model
						ci.setStartOrder(BigInteger.ZERO);
						ComponentPattern.organizeStartOrder(sad, diagram, featureProvider);
					} else {
						// Organization check to make sure start order sequence is correct, if the update occurred from
						// elsewhere in the model
						ComponentPattern.organizeStartOrder(sad, diagram, featureProvider);
					}
					featureProvider.link(startOrderEllipse.getPictogramElement(), assemblyController);
				} else {
					return new Reason(true, "Component start order requires update");
				}
			} else if (!StyleUtil.isStyleSet(startOrderEllipse, StyleUtil.START_ORDER_ELLIPSE) && assemblyController == null) {
				if (performUpdate) {
					StyleUtil.setStyle(startOrderEllipse, StyleUtil.START_ORDER_ELLIPSE);
					// remove assembly controller links
					EcoreUtil.delete((EObject) startOrderEllipse.getPictogramElement().getLink());
				} else {
					return new Reason(true, "Component start order requires update");
				}
			}
		}
		// we must make sure externalPorts is linked with this object if its set, otherwise we need to remove it
		if (performUpdate) {
			if (externalPorts != null && !this.getLink().getBusinessObjects().contains(externalPorts)) {
				this.getLink().getBusinessObjects().add(externalPorts);
			} else if (externalPorts == null) {
				EObject objectToRemove = null;
				for (EObject obj : this.getLink().getBusinessObjects()) {
					if (obj instanceof ExternalPorts) {
						objectToRemove = obj;
					}
				}
				if (objectToRemove != null) {
					this.getLink().getBusinessObjects().remove(objectToRemove);
				}
			}
		}

		if (updateStatus && performUpdate) {
			return new Reason(true, "Update successful");
		}

		return new Reason(false, "No updates required");
	}

	@Override
	protected int getInnerWidth(Text innerTitle) {
		return super.getInnerWidth(innerTitle) + ComponentShapeImpl.START_ORDER_ELLIPSE_DIAMETER + ComponentShapeImpl.START_ORDER_ELLIPSE_LEFT_PADDING
			+ ComponentShapeImpl.START_ORDER_ELLIPSE_RIGHT_PADDING;
	}

	// BEGIN GENERATED CODE

} // ComponentShapeImpl
