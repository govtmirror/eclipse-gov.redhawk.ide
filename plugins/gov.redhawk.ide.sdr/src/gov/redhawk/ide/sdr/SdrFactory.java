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
package gov.redhawk.ide.sdr;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * @noimplement This interface is not intended to be implemented by clients.
 * <!-- end-user-doc -->
 * @see gov.redhawk.ide.sdr.SdrPackage
 * @generated
 */
public interface SdrFactory extends EFactory {

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SdrFactory eINSTANCE = gov.redhawk.ide.sdr.impl.SdrFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root</em>'.
	 * @generated
	 */
	SdrRoot createSdrRoot();

	/**
	 * Returns a new object of class '<em>Components Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Components Container</em>'.
	 * @generated
	 */
	ComponentsContainer createComponentsContainer();

	/**
	 * Returns a new object of class '<em>Components Sub Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Components Sub Container</em>'.
	 * @generated
	 */
	ComponentsSubContainer createComponentsSubContainer();

	/**
	 * Returns a new object of class '<em>Waveforms Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Waveforms Container</em>'.
	 * @generated
	 */
	WaveformsContainer createWaveformsContainer();

	/**
	 * Returns a new object of class '<em>Waveforms Sub Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Waveforms Sub Container</em>'.
	 * @generated
	 */
	WaveformsSubContainer createWaveformsSubContainer();

	/**
	 * Returns a new object of class '<em>Devices Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Devices Container</em>'.
	 * @generated
	 */
	DevicesContainer createDevicesContainer();

	/**
	 * Returns a new object of class '<em>Services Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Services Container</em>'.
	 * @generated
	 */
	ServicesContainer createServicesContainer();

	/**
	 * Returns a new object of class '<em>Shared Libraries Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shared Libraries Container</em>'.
	 * @generated
	 */
	SharedLibrariesContainer createSharedLibrariesContainer();

	/**
	 * Returns a new object of class '<em>Nodes Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nodes Container</em>'.
	 * @generated
	 */
	NodesContainer createNodesContainer();

	/**
	 * Returns a new object of class '<em>Nodes Sub Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nodes Sub Container</em>'.
	 * @generated
	 */
	NodesSubContainer createNodesSubContainer();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SdrPackage getSdrPackage();

} //SdrFactory
