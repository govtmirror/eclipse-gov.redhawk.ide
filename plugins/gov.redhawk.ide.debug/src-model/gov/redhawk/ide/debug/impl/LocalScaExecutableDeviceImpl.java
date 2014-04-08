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
package gov.redhawk.ide.debug.impl;

import gov.redhawk.ide.debug.LocalAbstractComponent;
import gov.redhawk.ide.debug.LocalLaunch;
import gov.redhawk.ide.debug.LocalScaExecutableDevice;
import gov.redhawk.ide.debug.ScaDebugPackage;
import gov.redhawk.model.sca.impl.ScaExecutableDeviceImpl;

import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import CF.LifeCyclePackage.ReleaseError;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Local Sca Executable Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link gov.redhawk.ide.debug.impl.LocalScaExecutableDeviceImpl#getLaunch <em>Launch</em>}</li>
 * <li>{@link gov.redhawk.ide.debug.impl.LocalScaExecutableDeviceImpl#getMode <em>Mode</em>}</li>
 * <li>{@link gov.redhawk.ide.debug.impl.LocalScaExecutableDeviceImpl#getImplementationID <em>Implementation ID</em>}
 * </li>
 * <li>{@link gov.redhawk.ide.debug.impl.LocalScaExecutableDeviceImpl#getExecParam <em>Exec Param</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LocalScaExecutableDeviceImpl extends ScaExecutableDeviceImpl implements LocalScaExecutableDevice {
	/**
	 * The default value of the '{@link #getLaunch() <em>Launch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaunch()
	 * @generated
	 * @ordered
	 */
	protected static final ILaunch LAUNCH_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getLaunch() <em>Launch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaunch()
	 * @generated
	 * @ordered
	 */
	protected ILaunch launch = LocalScaExecutableDeviceImpl.LAUNCH_EDEFAULT;
	/**
	 * The default value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected static final String MODE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected String mode = LocalScaExecutableDeviceImpl.MODE_EDEFAULT;
	/**
	 * The default value of the '{@link #getImplementationID() <em>Implementation ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationID()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPLEMENTATION_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getImplementationID() <em>Implementation ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationID()
	 * @generated
	 * @ordered
	 */
	protected String implementationID = LocalScaExecutableDeviceImpl.IMPLEMENTATION_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getExecParam() <em>Exec Param</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * @since 4.0
	 * <!-- end-user-doc -->
	 * @see #getExecParam()
	 * @generated
	 * @ordered
	 */
	protected static final String EXEC_PARAM_EDEFAULT = "";
	/**
	 * The cached value of the '{@link #getExecParam() <em>Exec Param</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * @since 4.0
	 * <!-- end-user-doc -->
	 * @see #getExecParam()
	 * @generated
	 * @ordered
	 */
	protected String execParam = LocalScaExecutableDeviceImpl.EXEC_PARAM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocalScaExecutableDeviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScaDebugPackage.Literals.LOCAL_SCA_EXECUTABLE_DEVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ILaunch getLaunch() {
		return launch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLaunch(ILaunch newLaunch) {
		ILaunch oldLaunch = launch;
		launch = newLaunch;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, ScaDebugPackage.LOCAL_SCA_EXECUTABLE_DEVICE__LAUNCH, oldLaunch, launch));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMode(String newMode) {
		String oldMode = mode;
		mode = newMode;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, ScaDebugPackage.LOCAL_SCA_EXECUTABLE_DEVICE__MODE, oldMode, mode));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImplementationID() {
		return implementationID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImplementationID(String newImplementationID) {
		String oldImplementationID = implementationID;
		implementationID = newImplementationID;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, ScaDebugPackage.LOCAL_SCA_EXECUTABLE_DEVICE__IMPLEMENTATION_ID, oldImplementationID,
				implementationID));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 4.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExecParam() {
		return execParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 4.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExecParam(String newExecParam) {
		String oldExecParam = execParam;
		execParam = newExecParam;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, ScaDebugPackage.LOCAL_SCA_EXECUTABLE_DEVICE__EXEC_PARAM, oldExecParam, execParam));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ScaDebugPackage.LOCAL_SCA_EXECUTABLE_DEVICE__LAUNCH:
			return getLaunch();
		case ScaDebugPackage.LOCAL_SCA_EXECUTABLE_DEVICE__MODE:
			return getMode();
		case ScaDebugPackage.LOCAL_SCA_EXECUTABLE_DEVICE__IMPLEMENTATION_ID:
			return getImplementationID();
		case ScaDebugPackage.LOCAL_SCA_EXECUTABLE_DEVICE__EXEC_PARAM:
			return getExecParam();
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
		case ScaDebugPackage.LOCAL_SCA_EXECUTABLE_DEVICE__LAUNCH:
			setLaunch((ILaunch) newValue);
			return;
		case ScaDebugPackage.LOCAL_SCA_EXECUTABLE_DEVICE__MODE:
			setMode((String) newValue);
			return;
		case ScaDebugPackage.LOCAL_SCA_EXECUTABLE_DEVICE__IMPLEMENTATION_ID:
			setImplementationID((String) newValue);
			return;
		case ScaDebugPackage.LOCAL_SCA_EXECUTABLE_DEVICE__EXEC_PARAM:
			setExecParam((String) newValue);
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
		case ScaDebugPackage.LOCAL_SCA_EXECUTABLE_DEVICE__LAUNCH:
			setLaunch(LocalScaExecutableDeviceImpl.LAUNCH_EDEFAULT);
			return;
		case ScaDebugPackage.LOCAL_SCA_EXECUTABLE_DEVICE__MODE:
			setMode(LocalScaExecutableDeviceImpl.MODE_EDEFAULT);
			return;
		case ScaDebugPackage.LOCAL_SCA_EXECUTABLE_DEVICE__IMPLEMENTATION_ID:
			setImplementationID(LocalScaExecutableDeviceImpl.IMPLEMENTATION_ID_EDEFAULT);
			return;
		case ScaDebugPackage.LOCAL_SCA_EXECUTABLE_DEVICE__EXEC_PARAM:
			setExecParam(LocalScaExecutableDeviceImpl.EXEC_PARAM_EDEFAULT);
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
		case ScaDebugPackage.LOCAL_SCA_EXECUTABLE_DEVICE__LAUNCH:
			return LocalScaExecutableDeviceImpl.LAUNCH_EDEFAULT == null ? launch != null : !LocalScaExecutableDeviceImpl.LAUNCH_EDEFAULT.equals(launch);
		case ScaDebugPackage.LOCAL_SCA_EXECUTABLE_DEVICE__MODE:
			return LocalScaExecutableDeviceImpl.MODE_EDEFAULT == null ? mode != null : !LocalScaExecutableDeviceImpl.MODE_EDEFAULT.equals(mode);
		case ScaDebugPackage.LOCAL_SCA_EXECUTABLE_DEVICE__IMPLEMENTATION_ID:
			return LocalScaExecutableDeviceImpl.IMPLEMENTATION_ID_EDEFAULT == null ? implementationID != null
				: !LocalScaExecutableDeviceImpl.IMPLEMENTATION_ID_EDEFAULT.equals(implementationID);
		case ScaDebugPackage.LOCAL_SCA_EXECUTABLE_DEVICE__EXEC_PARAM:
			return LocalScaExecutableDeviceImpl.EXEC_PARAM_EDEFAULT == null ? execParam != null
				: !LocalScaExecutableDeviceImpl.EXEC_PARAM_EDEFAULT.equals(execParam);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class< ? > baseClass) {
		if (baseClass == LocalLaunch.class) {
			switch (derivedFeatureID) {
			case ScaDebugPackage.LOCAL_SCA_EXECUTABLE_DEVICE__LAUNCH:
				return ScaDebugPackage.LOCAL_LAUNCH__LAUNCH;
			case ScaDebugPackage.LOCAL_SCA_EXECUTABLE_DEVICE__MODE:
				return ScaDebugPackage.LOCAL_LAUNCH__MODE;
			default:
				return -1;
			}
		}
		if (baseClass == LocalAbstractComponent.class) {
			switch (derivedFeatureID) {
			case ScaDebugPackage.LOCAL_SCA_EXECUTABLE_DEVICE__IMPLEMENTATION_ID:
				return ScaDebugPackage.LOCAL_ABSTRACT_COMPONENT__IMPLEMENTATION_ID;
			case ScaDebugPackage.LOCAL_SCA_EXECUTABLE_DEVICE__EXEC_PARAM:
				return ScaDebugPackage.LOCAL_ABSTRACT_COMPONENT__EXEC_PARAM;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class< ? > baseClass) {
		if (baseClass == LocalLaunch.class) {
			switch (baseFeatureID) {
			case ScaDebugPackage.LOCAL_LAUNCH__LAUNCH:
				return ScaDebugPackage.LOCAL_SCA_EXECUTABLE_DEVICE__LAUNCH;
			case ScaDebugPackage.LOCAL_LAUNCH__MODE:
				return ScaDebugPackage.LOCAL_SCA_EXECUTABLE_DEVICE__MODE;
			default:
				return -1;
			}
		}
		if (baseClass == LocalAbstractComponent.class) {
			switch (baseFeatureID) {
			case ScaDebugPackage.LOCAL_ABSTRACT_COMPONENT__IMPLEMENTATION_ID:
				return ScaDebugPackage.LOCAL_SCA_EXECUTABLE_DEVICE__IMPLEMENTATION_ID;
			case ScaDebugPackage.LOCAL_ABSTRACT_COMPONENT__EXEC_PARAM:
				return ScaDebugPackage.LOCAL_SCA_EXECUTABLE_DEVICE__EXEC_PARAM;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) {
			return super.toString();
		}

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (launch: ");
		result.append(launch);
		result.append(", mode: ");
		result.append(mode);
		result.append(", implementationID: ");
		result.append(implementationID);
		result.append(", execParam: ");
		result.append(execParam);
		result.append(')');
		return result.toString();
	}

	@Override
	public void releaseObject() throws ReleaseError {
		final String tmpName = getLabel();
		super.releaseObject();
		if (this.launch != null) {
			final Job terminateJob = new TerminateJob(this, tmpName);
			terminateJob.schedule(5000);
		}
	}

	@Override
	public void dispose() {
		try {
			releaseObject();
		} catch (final ReleaseError e) {
			// PASS
		}
		super.dispose();
	}

	@Override
	public void unsetProfileURI() {

	}

	@Override
	public void unsetProfile() {

	}

	@Override
	public boolean isSetPorts() {
		// Always return false for is set ports.  
		// This allows the user to call initialize more than once while developing
		return false;
	}

} //LocalScaExecutableDeviceImpl
