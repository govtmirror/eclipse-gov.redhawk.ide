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
package gov.redhawk.ide.sad.graphiti.ext.impl;

import gov.redhawk.ide.sad.graphiti.ext.*;
import java.util.List;
import mil.jpeojtrs.sca.partitioning.ComponentSupportedInterfaceStub;
import mil.jpeojtrs.sca.partitioning.ProvidesPortStub;
import mil.jpeojtrs.sca.partitioning.UsesPortStub;
import mil.jpeojtrs.sca.sad.AssemblyController;
import mil.jpeojtrs.sca.sad.ExternalPorts;
import mil.jpeojtrs.sca.sad.Port;
import mil.jpeojtrs.sca.sad.SadComponentInstantiation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.impl.Reason;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RHGxFactoryImpl extends EFactoryImpl implements RHGxFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RHGxFactory init() {
		try {
			RHGxFactory theRHGxFactory = (RHGxFactory) EPackage.Registry.INSTANCE.getEFactory(RHGxPackage.eNS_URI);
			if (theRHGxFactory != null) {
				return theRHGxFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RHGxFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RHGxFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case RHGxPackage.RH_CONTAINER_SHAPE:
			return createRHContainerShape();
		case RHGxPackage.COMPONENT_SHAPE:
			return createComponentShape();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case RHGxPackage.COMPONENT_SUPPORTED_INTERFACE_STUB:
			return createComponentSupportedInterfaceStubFromString(eDataType, initialValue);
		case RHGxPackage.IFEATURE_PROVIDER:
			return createIFeatureProviderFromString(eDataType, initialValue);
		case RHGxPackage.USES_PORT_STUB:
			return createUsesPortStubFromString(eDataType, initialValue);
		case RHGxPackage.PROVIDES_PORT_STUB:
			return createProvidesPortStubFromString(eDataType, initialValue);
		case RHGxPackage.PORT:
			return createPortFromString(eDataType, initialValue);
		case RHGxPackage.ASSEMBLY_CONTROLLER:
			return createAssemblyControllerFromString(eDataType, initialValue);
		case RHGxPackage.EXTERNAL_PORTS:
			return createExternalPortsFromString(eDataType, initialValue);
		case RHGxPackage.REASON:
			return createReasonFromString(eDataType, initialValue);
		case RHGxPackage.LIST:
			return createListFromString(eDataType, initialValue);
		case RHGxPackage.SAD_COMPONENT_INSTANTIATION:
			return createSadComponentInstantiationFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case RHGxPackage.COMPONENT_SUPPORTED_INTERFACE_STUB:
			return convertComponentSupportedInterfaceStubToString(eDataType, instanceValue);
		case RHGxPackage.IFEATURE_PROVIDER:
			return convertIFeatureProviderToString(eDataType, instanceValue);
		case RHGxPackage.USES_PORT_STUB:
			return convertUsesPortStubToString(eDataType, instanceValue);
		case RHGxPackage.PROVIDES_PORT_STUB:
			return convertProvidesPortStubToString(eDataType, instanceValue);
		case RHGxPackage.PORT:
			return convertPortToString(eDataType, instanceValue);
		case RHGxPackage.ASSEMBLY_CONTROLLER:
			return convertAssemblyControllerToString(eDataType, instanceValue);
		case RHGxPackage.EXTERNAL_PORTS:
			return convertExternalPortsToString(eDataType, instanceValue);
		case RHGxPackage.REASON:
			return convertReasonToString(eDataType, instanceValue);
		case RHGxPackage.LIST:
			return convertListToString(eDataType, instanceValue);
		case RHGxPackage.SAD_COMPONENT_INSTANTIATION:
			return convertSadComponentInstantiationToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RHContainerShape createRHContainerShape() {
		RHContainerShapeImpl rhContainerShape = new RHContainerShapeImpl();
		return rhContainerShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentShape createComponentShape() {
		ComponentShapeImpl componentShape = new ComponentShapeImpl();
		return componentShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentSupportedInterfaceStub createComponentSupportedInterfaceStubFromString(EDataType eDataType, String initialValue) {
		return (ComponentSupportedInterfaceStub) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComponentSupportedInterfaceStubToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFeatureProvider createIFeatureProviderFromString(EDataType eDataType, String initialValue) {
		return (IFeatureProvider) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIFeatureProviderToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsesPortStub createUsesPortStubFromString(EDataType eDataType, String initialValue) {
		return (UsesPortStub) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUsesPortStubToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidesPortStub createProvidesPortStubFromString(EDataType eDataType, String initialValue) {
		return (ProvidesPortStub) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProvidesPortStubToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port createPortFromString(EDataType eDataType, String initialValue) {
		return (Port) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPortToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyController createAssemblyControllerFromString(EDataType eDataType, String initialValue) {
		return (AssemblyController) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAssemblyControllerToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalPorts createExternalPortsFromString(EDataType eDataType, String initialValue) {
		return (ExternalPorts) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExternalPortsToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reason createReasonFromString(EDataType eDataType, String initialValue) {
		return (Reason) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReasonToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List< ? > createListFromString(EDataType eDataType, String initialValue) {
		return (List< ? >) super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertListToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SadComponentInstantiation createSadComponentInstantiationFromString(EDataType eDataType, String initialValue) {
		return (SadComponentInstantiation) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSadComponentInstantiationToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RHGxPackage getRHGxPackage() {
		return (RHGxPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RHGxPackage getPackage() {
		return RHGxPackage.eINSTANCE;
	}

} // RHGxFactoryImpl
