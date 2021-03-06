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
package gov.redhawk.ide.debug;

import gov.redhawk.model.sca.ScaWaveform;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jdt.annotation.NonNull;

import CF.ApplicationOperations;
import CF.DataType;

/**
 * <!-- begin-user-doc -->
 * A model object to represent sandbox waveforms. It is used both for waveforms launched locally as well as domain
 * waveforms which have been opened with the sandbox.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.redhawk.ide.debug.LocalScaWaveform#getNamingContext <em>Naming Context</em>}</li>
 *   <li>{@link gov.redhawk.ide.debug.LocalScaWaveform#getLocalApp <em>Local App</em>}</li>
 * </ul>
 *
 * @see gov.redhawk.ide.debug.ScaDebugPackage#getLocalScaWaveform()
 * @model
 * @generated
 */
public interface LocalScaWaveform extends ScaWaveform, LocalLaunch {

	/**
	 * Returns the value of the '<em><b>Naming Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * This is the naming context of the waveform, which should contain entries for each component in the waveform.
	 * As components launch, they register themselves with the waveform's naming context which is how they become known
	 * to the waveform.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Naming Context</em>' reference.
	 * @see #setNamingContext(NotifyingNamingContext)
	 * @see gov.redhawk.ide.debug.ScaDebugPackage#getLocalScaWaveform_NamingContext()
	 * @model required="true" transient="true"
	 * @generated
	 */
	NotifyingNamingContext getNamingContext();

	/**
	 * Sets the value of the '{@link gov.redhawk.ide.debug.LocalScaWaveform#getNamingContext <em>Naming Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Naming Context</em>' reference.
	 * @see #getNamingContext()
	 * @generated
	 */
	void setNamingContext(NotifyingNamingContext value);

	/**
	 * Returns the value of the '<em><b>Local App</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Gets the CORBA object ({@link ApplicationOperations}) for the waveform. In a domain this is the proxy object
	 * running inside the domain manager process. It responds to the {@link ApplicationOperation} methods and proxies
	 * the methods inherited from interface {@link CF.Resource} to the waveform's assembly controller.
	 * </p>
	 * @since 4.0
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local App</em>' attribute.
	 * @see #setLocalApp(ApplicationOperations)
	 * @see gov.redhawk.ide.debug.ScaDebugPackage#getLocalScaWaveform_LocalApp()
	 * @model unique="false" dataType="gov.redhawk.ide.debug.AttrApplicationOperations" transient="true" ordered="false"
	 * @generated
	 */
	ApplicationOperations getLocalApp();

	/**
	 * Sets the value of the '{@link gov.redhawk.ide.debug.LocalScaWaveform#getLocalApp <em>Local App</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * @since 4.0
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local App</em>' attribute.
	 * @see #getLocalApp()
	 * @generated
	 */
	void setLocalApp(ApplicationOperations value);

	/**
	 * <!-- begin-user-doc -->
	 * This method is used to launch a component locally in this waveform.
	 * @since 4.0
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param initConfiguration The initial configuration of the resource (properties including exec params, configure params, etc).
	 * <!-- end-model-doc -->
	 * @model exceptions="gov.redhawk.ide.debug.CoreException" initConfigurationDataType="gov.redhawk.model.sca.DataTypeArray" spdURIDataType="mil.jpeojtrs.sca.spd.URI"
	 * @generated
	 */
	@NonNull
	LocalScaComponent launch(String id, DataType[] initConfiguration, URI spdURI, String implID, String mode) throws CoreException;
} // LocalScaWaveform
