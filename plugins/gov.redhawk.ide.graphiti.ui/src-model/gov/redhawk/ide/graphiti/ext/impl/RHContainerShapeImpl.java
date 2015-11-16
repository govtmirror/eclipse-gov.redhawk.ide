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
package gov.redhawk.ide.graphiti.ext.impl;

import gov.redhawk.ide.graphiti.ext.RHContainerShape;
import gov.redhawk.ide.graphiti.ext.RHGxPackage;
import gov.redhawk.ide.graphiti.ui.diagram.patterns.AbstractPortSupplierPattern;
import gov.redhawk.ide.graphiti.ui.diagram.util.DUtil;
import gov.redhawk.ide.graphiti.ui.diagram.util.StyleUtil;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import mil.jpeojtrs.sca.partitioning.ProvidesPortStub;
import mil.jpeojtrs.sca.partitioning.UsesPortStub;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.graphiti.datatypes.IDimension;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.impl.Reason;
import org.eclipse.graphiti.mm.algorithms.Image;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.algorithms.RoundedRectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Point;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.FixPointAnchor;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.mm.pictograms.impl.ContainerShapeImpl;
import org.eclipse.graphiti.services.Graphiti;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RH Container Shape</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.redhawk.ide.graphiti.ext.impl.RHContainerShapeImpl#isStarted <em>Started</em>}</li>
 *   <li>{@link gov.redhawk.ide.graphiti.ext.impl.RHContainerShapeImpl#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link gov.redhawk.ide.graphiti.ext.impl.RHContainerShapeImpl#getIStatusSeverity <em>IStatus Severity</em>}</li>
 *   <li>{@link gov.redhawk.ide.graphiti.ext.impl.RHContainerShapeImpl#isCollapsed <em>Collapsed</em>}</li>
 *   <li>{@link gov.redhawk.ide.graphiti.ext.impl.RHContainerShapeImpl#isHasSuperPortsContainerShape <em>Has Super Ports Container Shape</em>}</li>
 *   <li>{@link gov.redhawk.ide.graphiti.ext.impl.RHContainerShapeImpl#isHasPortsContainerShape <em>Has Ports Container Shape</em>}</li>
 *   <li>{@link gov.redhawk.ide.graphiti.ext.impl.RHContainerShapeImpl#isHideUnusedPorts <em>Hide Unused Ports</em>}</li>
 * </ul>
 *
 * @generated
 */
@SuppressWarnings("restriction")
public class RHContainerShapeImpl extends ContainerShapeImpl implements RHContainerShape {
	/**
	 * The default value of the '{@link #isStarted() <em>Started</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStarted()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STARTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStarted() <em>Started</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStarted()
	 * @generated
	 * @ordered
	 */
	protected boolean started = STARTED_EDEFAULT;

	/**
	 * The default value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean enabled = ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getIStatusSeverity() <em>IStatus Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIStatusSeverity()
	 * @generated NOT
	 * @ordered
	 */
	protected static final int ISTATUS_SEVERITY_EDEFAULT = IStatus.OK;

	/**
	 * The cached value of the '{@link #getIStatusSeverity() <em>IStatus Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIStatusSeverity()
	 * @generated
	 * @ordered
	 */
	protected int iStatusSeverity = ISTATUS_SEVERITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConnectionMap() <em>Connection Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionMap()
	 * @generated NOT
	 * @ordered
	 */
	protected Map<String, String> connectionMap = Collections.synchronizedMap(new HashMap<String, String>());

	/**
	 * The default value of the '{@link #isCollapsed() <em>Collapsed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCollapsed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COLLAPSED_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isHasSuperPortsContainerShape() <em>Has Super Ports Container Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasSuperPortsContainerShape()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_SUPER_PORTS_CONTAINER_SHAPE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHasSuperPortsContainerShape() <em>Has Super Ports Container Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasSuperPortsContainerShape()
	 * @generated
	 * @ordered
	 */
	protected boolean hasSuperPortsContainerShape = HAS_SUPER_PORTS_CONTAINER_SHAPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isHasPortsContainerShape() <em>Has Ports Container Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasPortsContainerShape()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_PORTS_CONTAINER_SHAPE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHasPortsContainerShape() <em>Has Ports Container Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasPortsContainerShape()
	 * @generated
	 * @ordered
	 */
	protected boolean hasPortsContainerShape = HAS_PORTS_CONTAINER_SHAPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isHideUnusedPorts() <em>Hide Unused Ports</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHideUnusedPorts()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HIDE_UNUSED_PORTS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHideUnusedPorts() <em>Hide Unused Ports</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHideUnusedPorts()
	 * @generated
	 * @ordered
	 */
	protected boolean hideUnusedPorts = HIDE_UNUSED_PORTS_EDEFAULT;

	// END GENERATED CODE

	// These are property key/value pairs that help us resize an existing shape by properly identifying
	// graphicsAlgorithms
	public static final String GA_OUTER_ROUNDED_RECTANGLE = "outerRoundedRectangle", GA_INNER_ROUNDED_RECTANGLE = "innerRoundedRectangle",
			GA_OUTER_ROUNDED_RECTANGLE_TEXT = "outerRoundedRectangleText", GA_INNER_ROUNDED_RECTANGLE_TEXT = "innerRoundedRectangleText",
			GA_OUTER_ROUNDED_RECTANGLE_IMAGE = "outerRoundedRectangleImage", GA_INNER_ROUNDED_RECTANGLE_IMAGE = "innerRoundedRectangleImage",
			GA_INNER_ROUNDED_RECTANGLE_LINE = "innerRoundedRectangleLine", GA_PROVIDES_PORT_RECTANGLE = "providesPortsRectangle",
			GA_FIX_POINT_ANCHOR_RECTANGLE = "fixPointAnchorRectangle", GA_USES_PORTS_RECTANGLE = "usesPortsRectangle";

	// Property key/value pairs help us identify Shapes to enable/disable user actions
	// (move, resize, delete, remove, etc.)
	public static final String SHAPE_OUTER_CONTAINER = "outerContainerShape", SHAPE_INNER_CONTAINER = "innerContainerShape",
			SHAPE_USES_PORTS_CONTAINER = "usesPortsContainerShape", SHAPE_PROVIDES_PORTS_CONTAINER = "providesPortsContainerShape",
			SHAPE_INTERFACE_CONTAINER = "interfaceContainerShape", SUPER_PROVIDES_PORTS_RECTANGLE = "superProvidesPortsContainer",
			SUPER_USES_PORTS_RECTANGLE = "superUsesPortsContainer";

	// Shape size constants
	public static final int OUTER_CONTAINER_SHAPE_TITLE_HORIZONTAL_RIGHT_PADDING = 10, INNER_CONTAINER_SHAPE_TOP_PADDING = 20,
			INNER_CONTAINER_SHAPE_HORIZONTAL_PADDING = 15, INNER_CONTAINER_SHAPE_TITLE_HORIZONTAL_PADDING = 60, PROVIDES_PORTS_LEFT_PADDING = 5,
			INNER_CONTAINER_SHAPE_HORIZONTAL_LEFT_PADDING = INNER_CONTAINER_SHAPE_HORIZONTAL_PADDING + PROVIDES_PORTS_LEFT_PADDING,
			PORTS_CONTAINER_SHAPE_TOP_PADDING = 60, INNER_ROUNDED_RECTANGLE_TEXT_TOP_PADDING = 8, INNER_ROUNDED_RECTANGLE_LINE_Y = 28,
			SUPER_PORT_SHAPE_HEIGHT = 25, SUPER_PORT_SHAPE_WIDTH = 10, SUPER_PORT_SHAPE_HEIGHT_MARGIN = 5, LOLLIPOP_ELLIPSE_DIAMETER = 10,
			INTERFACE_SHAPE_WIDTH = INNER_CONTAINER_SHAPE_HORIZONTAL_PADDING + PROVIDES_PORTS_LEFT_PADDING, INTERFACE_SHAPE_HEIGHT = 10, ICON_IMAGE_LENGTH = 16;

	protected static final int INNER_ROUNDED_RECTANGLE_CORNER_WIDTH = 10;
	protected static final int INNER_ROUNDED_RECTANGLE_CORNER_HEIGHT = 10;
	protected static final int PORT_ROW_PADDING_HEIGHT = 5;
	protected static final int REQ_PADDING_BETWEEN_PORT_TYPES = 10;
	// BEGIN GENERATED CODE

	/**
	 * 
	 * @generated
	 */
	protected RHContainerShapeImpl() {
		super();
	}

	/**
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RHGxPackage.Literals.RH_CONTAINER_SHAPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStarted() {
		return started;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartedGen(boolean newStarted) {
		boolean oldStarted = started;
		started = newStarted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RHGxPackage.RH_CONTAINER_SHAPE__STARTED, oldStarted, started));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setStarted(boolean newStarted) {
		setStartedGen(newStarted);
		updateStyleForComponentInner();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnabled() {
		return enabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnabledGen(boolean newEnabled) {
		boolean oldEnabled = enabled;
		enabled = newEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RHGxPackage.RH_CONTAINER_SHAPE__ENABLED, oldEnabled, enabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setEnabled(boolean newEnabled) {
		setEnabledGen(newEnabled);
		updateStyleForComponentInner();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIStatusSeverity() {
		return iStatusSeverity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIStatusSeverityGen(int newIStatusSeverity) {
		int oldIStatusSeverity = iStatusSeverity;
		iStatusSeverity = newIStatusSeverity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RHGxPackage.RH_CONTAINER_SHAPE__ISTATUS_SEVERITY, oldIStatusSeverity, iStatusSeverity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setIStatusSeverity(int newIStatusSeverity) {
		setIStatusSeverityGen(newIStatusSeverity);
		updateStyleForComponentInner();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isCollapsed() {
		return isHasSuperPortsContainerShape();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setCollapsed(boolean newCollapsed) {
		if (newCollapsed) {
			setHasSuperPortsContainerShape(true);
			setHasPortsContainerShape(false);
		} else {
			setHasSuperPortsContainerShape(false);
			setHasPortsContainerShape(true);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHasSuperPortsContainerShape() {
		return hasSuperPortsContainerShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasSuperPortsContainerShape(boolean newHasSuperPortsContainerShape) {
		boolean oldHasSuperPortsContainerShape = hasSuperPortsContainerShape;
		hasSuperPortsContainerShape = newHasSuperPortsContainerShape;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RHGxPackage.RH_CONTAINER_SHAPE__HAS_SUPER_PORTS_CONTAINER_SHAPE,
				oldHasSuperPortsContainerShape, hasSuperPortsContainerShape));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHasPortsContainerShape() {
		return hasPortsContainerShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasPortsContainerShape(boolean newHasPortsContainerShape) {
		boolean oldHasPortsContainerShape = hasPortsContainerShape;
		hasPortsContainerShape = newHasPortsContainerShape;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RHGxPackage.RH_CONTAINER_SHAPE__HAS_PORTS_CONTAINER_SHAPE, oldHasPortsContainerShape,
				hasPortsContainerShape));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHideUnusedPorts() {
		return hideUnusedPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHideUnusedPorts(boolean newHideUnusedPorts) {
		boolean oldHideUnusedPorts = hideUnusedPorts;
		hideUnusedPorts = newHideUnusedPorts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RHGxPackage.RH_CONTAINER_SHAPE__HIDE_UNUSED_PORTS, oldHideUnusedPorts, hideUnusedPorts));
	}

	// END GENERATED CODE

	/**
	 * Creates the inner shapes that make up this container shape
	 */
	@Override
	public void init(final IAddContext context, AbstractPortSupplierPattern pattern) {
		EObject newObject = (EObject) context.getNewObject();

		// add property for this shape
		Graphiti.getPeService().setPropertyValue(this, DUtil.GA_TYPE, SHAPE_OUTER_CONTAINER);

		// graphic
		RoundedRectangle outerRoundedRectangle = Graphiti.getCreateService().createPlainRoundedRectangle(this, 5, 5);
		Graphiti.getPeService().setPropertyValue(outerRoundedRectangle, DUtil.GA_TYPE, GA_OUTER_ROUNDED_RECTANGLE);
		StyleUtil.setStyle(outerRoundedRectangle, pattern.getStyleForOuter());
		outerRoundedRectangle.setTransparency(null); // inherit from style

		// image
		Image imgIcon = Graphiti.getGaCreateService().createImage(outerRoundedRectangle, pattern.getOuterImageId());
		Graphiti.getPeService().setPropertyValue(imgIcon, DUtil.GA_TYPE, GA_OUTER_ROUNDED_RECTANGLE_IMAGE);

		// text
		Text cText = Graphiti.getCreateService().createPlainText(outerRoundedRectangle, pattern.getOuterTitle(newObject));
		StyleUtil.setStyle(cText, StyleUtil.OUTER_TEXT);
		Graphiti.getPeService().setPropertyValue(cText, DUtil.GA_TYPE, GA_OUTER_ROUNDED_RECTANGLE_TEXT);

		addInnerContainer(pattern.getInnerTitle(newObject), pattern.getInnerImageId(), pattern.getStyleForInner());
	}

	/**
	 * 
	 */
	public EList<ProvidesPortStub> getProvidesPortStubs() {
		return getInternalProvidesPortStubs();
	}

	/**
	 * Updates the shape's contents using the supplied fields. Return true if an update occurred, false otherwise.
	 */
	@Override
	public Reason update(IUpdateContext context, AbstractPortSupplierPattern pattern) {
		boolean updateStatus = false;

		if (isCollapsed()) {
			if (getSuperProvidesPortsContainerShape() == null) {
				addSuperProvidesPortContainerShape();
				updateStatus = true;
			}
			if (getSuperUsesPortsContainerShape() == null) {
				addSuperUsesPortContainerShape();
				updateStatus = true;
			}
		} else {
			if (getProvidesPortsContainerShape() == null) {
				addProvidesPortsContainerShape();
				updateStatus = true;
			}
			if (getUsesPortsContainerShape() == null) {
				addUsesPortsContainerShape();
				updateStatus = true;
			}
		}
		return new Reason(updateStatus);
	}

	/**
	 * Return true (through Reason) if the shape's contents require an update based on the field supplied.
	 * Also returns a textual reason why an update is needed. Returns false otherwise.
	 */
	@Override
	public Reason updateNeeded(final IUpdateContext context, final AbstractPortSupplierPattern pattern) {
		return new Reason(false);
	}

	// BEGIN GENERATED CODE

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RHGxPackage.RH_CONTAINER_SHAPE__STARTED:
			return isStarted();
		case RHGxPackage.RH_CONTAINER_SHAPE__ENABLED:
			return isEnabled();
		case RHGxPackage.RH_CONTAINER_SHAPE__ISTATUS_SEVERITY:
			return getIStatusSeverity();
		case RHGxPackage.RH_CONTAINER_SHAPE__COLLAPSED:
			return isCollapsed();
		case RHGxPackage.RH_CONTAINER_SHAPE__HAS_SUPER_PORTS_CONTAINER_SHAPE:
			return isHasSuperPortsContainerShape();
		case RHGxPackage.RH_CONTAINER_SHAPE__HAS_PORTS_CONTAINER_SHAPE:
			return isHasPortsContainerShape();
		case RHGxPackage.RH_CONTAINER_SHAPE__HIDE_UNUSED_PORTS:
			return isHideUnusedPorts();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case RHGxPackage.RH_CONTAINER_SHAPE__STARTED:
			setStarted((Boolean) newValue);
			return;
		case RHGxPackage.RH_CONTAINER_SHAPE__ENABLED:
			setEnabled((Boolean) newValue);
			return;
		case RHGxPackage.RH_CONTAINER_SHAPE__ISTATUS_SEVERITY:
			setIStatusSeverity((Integer) newValue);
			return;
		case RHGxPackage.RH_CONTAINER_SHAPE__COLLAPSED:
			setCollapsed((Boolean) newValue);
			return;
		case RHGxPackage.RH_CONTAINER_SHAPE__HAS_SUPER_PORTS_CONTAINER_SHAPE:
			setHasSuperPortsContainerShape((Boolean) newValue);
			return;
		case RHGxPackage.RH_CONTAINER_SHAPE__HAS_PORTS_CONTAINER_SHAPE:
			setHasPortsContainerShape((Boolean) newValue);
			return;
		case RHGxPackage.RH_CONTAINER_SHAPE__HIDE_UNUSED_PORTS:
			setHideUnusedPorts((Boolean) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case RHGxPackage.RH_CONTAINER_SHAPE__STARTED:
			setStarted(STARTED_EDEFAULT);
			return;
		case RHGxPackage.RH_CONTAINER_SHAPE__ENABLED:
			setEnabled(ENABLED_EDEFAULT);
			return;
		case RHGxPackage.RH_CONTAINER_SHAPE__ISTATUS_SEVERITY:
			setIStatusSeverity(ISTATUS_SEVERITY_EDEFAULT);
			return;
		case RHGxPackage.RH_CONTAINER_SHAPE__COLLAPSED:
			setCollapsed(COLLAPSED_EDEFAULT);
			return;
		case RHGxPackage.RH_CONTAINER_SHAPE__HAS_SUPER_PORTS_CONTAINER_SHAPE:
			setHasSuperPortsContainerShape(HAS_SUPER_PORTS_CONTAINER_SHAPE_EDEFAULT);
			return;
		case RHGxPackage.RH_CONTAINER_SHAPE__HAS_PORTS_CONTAINER_SHAPE:
			setHasPortsContainerShape(HAS_PORTS_CONTAINER_SHAPE_EDEFAULT);
			return;
		case RHGxPackage.RH_CONTAINER_SHAPE__HIDE_UNUSED_PORTS:
			setHideUnusedPorts(HIDE_UNUSED_PORTS_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case RHGxPackage.RH_CONTAINER_SHAPE__STARTED:
			return started != STARTED_EDEFAULT;
		case RHGxPackage.RH_CONTAINER_SHAPE__ENABLED:
			return enabled != ENABLED_EDEFAULT;
		case RHGxPackage.RH_CONTAINER_SHAPE__ISTATUS_SEVERITY:
			return iStatusSeverity != ISTATUS_SEVERITY_EDEFAULT;
		case RHGxPackage.RH_CONTAINER_SHAPE__COLLAPSED:
			return isCollapsed() != COLLAPSED_EDEFAULT;
		case RHGxPackage.RH_CONTAINER_SHAPE__HAS_SUPER_PORTS_CONTAINER_SHAPE:
			return hasSuperPortsContainerShape != HAS_SUPER_PORTS_CONTAINER_SHAPE_EDEFAULT;
		case RHGxPackage.RH_CONTAINER_SHAPE__HAS_PORTS_CONTAINER_SHAPE:
			return hasPortsContainerShape != HAS_PORTS_CONTAINER_SHAPE_EDEFAULT;
		case RHGxPackage.RH_CONTAINER_SHAPE__HIDE_UNUSED_PORTS:
			return hideUnusedPorts != HIDE_UNUSED_PORTS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (started: ");
		result.append(started);
		result.append(", enabled: ");
		result.append(enabled);
		result.append(", iStatusSeverity: ");
		result.append(iStatusSeverity);
		result.append(", hasSuperPortsContainerShape: ");
		result.append(hasSuperPortsContainerShape);
		result.append(", hasPortsContainerShape: ");
		result.append(hasPortsContainerShape);
		result.append(", hideUnusedPorts: ");
		result.append(hideUnusedPorts);
		result.append(')');
		return result.toString();
	}

	// END GENERATED CODE

	/**
	 * add inner container
	 */
	protected ContainerShape addInnerContainer(String text, String imageId, String styleId) {
		ContainerShape innerContainerShape = Graphiti.getCreateService().createContainerShape(this, false);
		Graphiti.getPeService().setPropertyValue(innerContainerShape, DUtil.GA_TYPE, SHAPE_INNER_CONTAINER);
		RoundedRectangle innerRoundedRectangle = Graphiti.getCreateService().createPlainRoundedRectangle(innerContainerShape,
			INNER_ROUNDED_RECTANGLE_CORNER_WIDTH, INNER_ROUNDED_RECTANGLE_CORNER_HEIGHT);
		StyleUtil.setStyle(innerRoundedRectangle, styleId);
		Graphiti.getPeService().setPropertyValue(innerRoundedRectangle, DUtil.GA_TYPE, GA_INNER_ROUNDED_RECTANGLE);
		Graphiti.getGaLayoutService().setLocation(innerRoundedRectangle, INNER_CONTAINER_SHAPE_HORIZONTAL_LEFT_PADDING, INNER_CONTAINER_SHAPE_TOP_PADDING);

		// image
		Image imgIcon = Graphiti.getGaCreateService().createImage(innerRoundedRectangle, imageId);
		Graphiti.getPeService().setPropertyValue(imgIcon, DUtil.GA_TYPE, GA_INNER_ROUNDED_RECTANGLE_IMAGE);

		// text
		Text ciText = Graphiti.getCreateService().createPlainText(innerRoundedRectangle, text);
		StyleUtil.setStyle(ciText, StyleUtil.INNER_TEXT);
		Graphiti.getPeService().setPropertyValue(ciText, DUtil.GA_TYPE, GA_INNER_ROUNDED_RECTANGLE_TEXT);

		// draw line if showing shape details (ports)
		Polyline polyline = Graphiti.getGaCreateService().createPlainPolyline(innerRoundedRectangle,
			new int[] { 0, INNER_ROUNDED_RECTANGLE_LINE_Y, innerRoundedRectangle.getWidth(), INNER_ROUNDED_RECTANGLE_LINE_Y });
		StyleUtil.setStyle(polyline, styleId);
		Graphiti.getPeService().setPropertyValue(polyline, DUtil.GA_TYPE, GA_INNER_ROUNDED_RECTANGLE_LINE);

		return innerContainerShape;
	}

	/**
	 * Adds Super Uses Port to shape
	 * @param usesPortStubs
	 * @param featureProvider
	 */
	private void addSuperUsesPortContainerShape() {
		// port shape
		ContainerShape superUsesPortsRectangleShape = Graphiti.getCreateService().createContainerShape(this, true);
		// ref prevent move
		Graphiti.getPeService().setPropertyValue(superUsesPortsRectangleShape, DUtil.SHAPE_TYPE, SUPER_USES_PORTS_RECTANGLE);
		Rectangle superUsesPortsRectangle = Graphiti.getCreateService().createRectangle(superUsesPortsRectangleShape);
		StyleUtil.setStyle(superUsesPortsRectangle, StyleUtil.SUPER_USES_PORT);

		// fix point anchor
		createPortAnchor(superUsesPortsRectangleShape, SUPER_PORT_SHAPE_WIDTH);
	}

	/**
	 * Adds Super Provides Port to shape
	 * @param providesPortStubs
	 * @param featureProvider
	 */
	private void addSuperProvidesPortContainerShape() {

		// port shape
		ContainerShape superProvidesPortsRectangleShape = Graphiti.getCreateService().createContainerShape(this, true);
		Graphiti.getPeService().setPropertyValue(superProvidesPortsRectangleShape, DUtil.SHAPE_TYPE, SUPER_PROVIDES_PORTS_RECTANGLE); // ref

		Rectangle superProvidesPortsRectangle = Graphiti.getCreateService().createRectangle(superProvidesPortsRectangleShape);
		StyleUtil.setStyle(superProvidesPortsRectangle, StyleUtil.SUPER_PROVIDES_PORT);
		Graphiti.getGaLayoutService().setLocation(superProvidesPortsRectangle, INNER_CONTAINER_SHAPE_HORIZONTAL_LEFT_PADDING - SUPER_PORT_SHAPE_WIDTH,
			INNER_CONTAINER_SHAPE_TOP_PADDING + SUPER_PORT_SHAPE_HEIGHT_MARGIN);

		// fix point anchor
		createPortAnchor(superProvidesPortsRectangleShape, 0);
	}

	/**
	 * Create an anchor overlay for a port, with the anchor point vertically centered at horizontal position x.
	 * The returned anchor has an invisible rectangle for its graphics algorithm.
	 */
	private FixPointAnchor createPortAnchor(ContainerShape portShape, int x) {
		FixPointAnchor fixPointAnchor = DUtil.createOverlayAnchor(portShape, x);
		Rectangle fixPointAnchorRectangle = Graphiti.getCreateService().createPlainRectangle(fixPointAnchor);
		Graphiti.getPeService().setPropertyValue(fixPointAnchorRectangle, DUtil.GA_TYPE, GA_FIX_POINT_ANCHOR_RECTANGLE);
		fixPointAnchorRectangle.setFilled(false);
		fixPointAnchorRectangle.setLineVisible(false);
		layoutAnchor(portShape);
		return fixPointAnchor;
	}

	private void layoutAnchor(Shape parentShape) {
		// Layout and resize anchor
		IDimension parentSize = Graphiti.getGaLayoutService().calculateSize(parentShape.getGraphicsAlgorithm());
		FixPointAnchor portAnchor = (FixPointAnchor) parentShape.getAnchors().get(0);
		Point anchorLocation = portAnchor.getLocation();
		anchorLocation.setY(parentSize.getHeight() / 2);
		Graphiti.getGaLayoutService().setLocationAndSize(portAnchor.getGraphicsAlgorithm(), -anchorLocation.getX(), -anchorLocation.getY(),
			parentSize.getWidth(), parentSize.getHeight());
	}

	/**
	 * Adds an empty uses port container to provided container shape.
	 */
	private ContainerShape addUsesPortsContainerShape() {
		ContainerShape usesPortsContainerShape = Graphiti.getPeService().createContainerShape(this, true);
		Graphiti.getPeService().setPropertyValue(usesPortsContainerShape, DUtil.SHAPE_TYPE, SHAPE_USES_PORTS_CONTAINER);
		Rectangle usesPortsRectangle = Graphiti.getCreateService().createRectangle(usesPortsContainerShape);
		usesPortsRectangle.setTransparency(1d);
		Graphiti.getPeService().setPropertyValue(usesPortsRectangle, DUtil.GA_TYPE, GA_USES_PORTS_RECTANGLE);
		return usesPortsContainerShape;
	}

	/**
	 * Return the usesPortsContainerShape
	 * @generated NOT
	 */
	@Override
	public ContainerShape getUsesPortsContainerShape() {
		return (ContainerShape) DUtil.findChildShapeByProperty(this, DUtil.SHAPE_TYPE, SHAPE_USES_PORTS_CONTAINER);
	}

	/**
	 * Adds an empty provides port container to provided container shape.
	 */
	private ContainerShape addProvidesPortsContainerShape() {
		// provides (input)
		ContainerShape providesPortsContainerShape = Graphiti.getCreateService().createContainerShape(this, true);
		Graphiti.getPeService().setPropertyValue(providesPortsContainerShape, DUtil.SHAPE_TYPE, SHAPE_PROVIDES_PORTS_CONTAINER);
		Rectangle providesPortsRectangle = Graphiti.getCreateService().createRectangle(providesPortsContainerShape);
		providesPortsRectangle.setTransparency(1d);
		Graphiti.getPeService().setPropertyValue(providesPortsRectangle, DUtil.GA_TYPE, GA_PROVIDES_PORT_RECTANGLE);
		Graphiti.getGaLayoutService().setLocation(providesPortsRectangle, PROVIDES_PORTS_LEFT_PADDING, PORTS_CONTAINER_SHAPE_TOP_PADDING);
		return providesPortsContainerShape;
	}

	/**
	 * Return the providesPortsContainerShape
	 * @generated NOT
	 */
	@Override
	public ContainerShape getProvidesPortsContainerShape() {
		return (ContainerShape) DUtil.findChildShapeByProperty(this, DUtil.SHAPE_TYPE, SHAPE_PROVIDES_PORTS_CONTAINER);
	}

	/**
	 * Returns usesPortsStubs business object list linked to getUsesPortsContainerShape()
	 */
	@SuppressWarnings("unchecked")
	public EList<UsesPortStub> getUsesPortStubs() {
		if (isCollapsed()) {
			ContainerShape usesSuperPortsContainerShape = getSuperUsesPortsContainerShape();
			if (usesSuperPortsContainerShape != null && usesSuperPortsContainerShape.getLink() != null) {
				return (EList<UsesPortStub>) (EList< ? >) usesSuperPortsContainerShape.getLink().getBusinessObjects();
			}
		} else {
			ContainerShape usesPortsContainerShape = getUsesPortsContainerShape();
			if (usesPortsContainerShape != null && usesPortsContainerShape.getLink() != null) {
				return (EList<UsesPortStub>) (EList< ? >) usesPortsContainerShape.getLink().getBusinessObjects();
			}
		}
		return new BasicEList<UsesPortStub>();
	}

	/**
	 * Returns providesPortsStubs business object list linked to getProvidesPortsContainerShape()
	 */
	@SuppressWarnings("unchecked")
	public EList<ProvidesPortStub> getInternalProvidesPortStubs() {
		if (isCollapsed()) {
			ContainerShape providesSuperPortsContainerShape = getSuperProvidesPortsContainerShape();
			if (providesSuperPortsContainerShape != null && providesSuperPortsContainerShape.getLink() != null) {
				EList<ProvidesPortStub> returnList = new BasicEList<ProvidesPortStub>();
				EList<EObject> providesAndInterfaceObjects = (EList<EObject>) (EList< ? >) providesSuperPortsContainerShape.getLink().getBusinessObjects();
				for (EObject o : providesAndInterfaceObjects) {
					if (o instanceof ProvidesPortStub) {
						returnList.add((ProvidesPortStub) o);
					}
				}

				return returnList;
			}
		} else {
			ContainerShape providesPortsContainerShape = getProvidesPortsContainerShape();
			if (providesPortsContainerShape != null && providesPortsContainerShape.getLink() != null) {
				return (EList<ProvidesPortStub>) (EList< ? >) providesPortsContainerShape.getLink().getBusinessObjects();
			}
		}
		return new BasicEList<ProvidesPortStub>();
	}

	/**
	 * Return the text for outer container
	 * @generated NOT
	 */
	@Override
	public Text getOuterText() {
		return (Text) DUtil.findFirstPropertyContainer(this, GA_OUTER_ROUNDED_RECTANGLE_TEXT);
	}

	/**
	 * Return the image for outer container
	 * @generated NOT
	 */
	@Override
	public Image getOuterImage() {
		return (Image) DUtil.findFirstPropertyContainer(this, GA_OUTER_ROUNDED_RECTANGLE_IMAGE);
	}

	/**
	 * Return the text for inner container
	 * @generated NOT
	 */
	@Override
	public Text getInnerText() {
		return (Text) DUtil.findFirstPropertyContainer(this, GA_INNER_ROUNDED_RECTANGLE_TEXT);
	}

	/**
	 * Return the image for inner container
	 * @generated NOT
	 */
	@Override
	public Image getInnerImage() {
		return (Image) DUtil.findFirstPropertyContainer(this, RHContainerShapeImpl.GA_INNER_ROUNDED_RECTANGLE_IMAGE);
	}

	/**
	 * Return the inner container polyline
	 * @generated NOT
	 */
	@Override
	public Polyline getInnerPolyline() {
		return (Polyline) DUtil.findFirstPropertyContainer(this, GA_INNER_ROUNDED_RECTANGLE_LINE);
	}

	/**
	 * Return the innerContainerShape
	 * @generated NOT
	 */
	@Override
	public ContainerShape getInnerContainerShape() {
		// Note: the inner shape is tagged with the GA_TYPE instead of the SHAPE_TYPE property
		return (ContainerShape) DUtil.findChildShapeByProperty(this, DUtil.GA_TYPE, SHAPE_INNER_CONTAINER);
	}

	/**
	 * Return the lollipop container shape
	 * @generated NOT
	 */
	@Override
	public ContainerShape getLollipop() {
		// Note: the lollipop shape is tagged with the GA_TYPE instead of the SHAPE_TYPE property
		return (ContainerShape) DUtil.findChildShapeByProperty(this, DUtil.GA_TYPE, SHAPE_INTERFACE_CONTAINER);
	}

	/**
	 * Return Super Provides Ports ContainerShape
	 * @generated NOT
	 */
	@Override
	public ContainerShape getSuperProvidesPortsContainerShape() {
		return (ContainerShape) DUtil.findChildShapeByProperty(this, DUtil.SHAPE_TYPE, SUPER_PROVIDES_PORTS_RECTANGLE);
	}

	/**
	 * Return Super Uses Ports ContainerShape
	 * @generated NOT
	 */
	@Override
	public ContainerShape getSuperUsesPortsContainerShape() {
		return (ContainerShape) DUtil.findChildShapeByProperty(this, DUtil.SHAPE_TYPE, SUPER_USES_PORTS_RECTANGLE);
	}

	/**
	 * Updates the style of the component's inner rounded rectangle based on the current state.
	 */
	protected void updateStyleForComponentInner() {
		String styleId;
		if (iStatusSeverity == IStatus.ERROR) {
			styleId = StyleUtil.COMPONENT_INNER_ERROR;
		} else if (!enabled) {
			styleId = StyleUtil.COMPONENT_INNER_DISABLED;
		} else if (started) {
			styleId = StyleUtil.COMPONENT_INNER_STARTED;
		} else {
			styleId = StyleUtil.COMPONENT_INNER;
		}
		StyleUtil.setStyle(getInnerContainerShape().getGraphicsAlgorithm(), styleId);
		StyleUtil.setStyle(getInnerPolyline(), styleId);
	}

} // RHContainerShapeImpl
