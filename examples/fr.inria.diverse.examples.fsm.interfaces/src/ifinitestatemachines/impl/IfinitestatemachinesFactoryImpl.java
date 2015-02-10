/**
 */
package ifinitestatemachines.impl;

import ifinitestatemachines.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IfinitestatemachinesFactoryImpl extends EFactoryImpl implements IfinitestatemachinesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfinitestatemachinesFactory init() {
		try {
			IfinitestatemachinesFactory theIfinitestatemachinesFactory = (IfinitestatemachinesFactory)EPackage.Registry.INSTANCE.getEFactory(IfinitestatemachinesPackage.eNS_URI);
			if (theIfinitestatemachinesFactory != null) {
				return theIfinitestatemachinesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IfinitestatemachinesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfinitestatemachinesFactoryImpl() {
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
			case IfinitestatemachinesPackage.STATE_MACHINE: return createStateMachine();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine createStateMachine() {
		StateMachineImpl stateMachine = new StateMachineImpl();
		return stateMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfinitestatemachinesPackage getIfinitestatemachinesPackage() {
		return (IfinitestatemachinesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IfinitestatemachinesPackage getPackage() {
		return IfinitestatemachinesPackage.eINSTANCE;
	}

} //IfinitestatemachinesFactoryImpl
