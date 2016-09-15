/**
 */
package extension.dispatchroot.impl;

import extension.dispatchroot.*;

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
public class DispatchrootFactoryImpl extends EFactoryImpl implements DispatchrootFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DispatchrootFactory init() {
		try {
			DispatchrootFactory theDispatchrootFactory = (DispatchrootFactory)EPackage.Registry.INSTANCE.getEFactory(DispatchrootPackage.eNS_URI);
			if (theDispatchrootFactory != null) {
				return theDispatchrootFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DispatchrootFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DispatchrootFactoryImpl() {
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
			case DispatchrootPackage.B: return createB();
			case DispatchrootPackage.SUB_B: return createSubB();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public B createB() {
		BImpl b = new BImpl();
		return b;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubB createSubB() {
		SubBImpl subB = new SubBImpl();
		return subB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DispatchrootPackage getDispatchrootPackage() {
		return (DispatchrootPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DispatchrootPackage getPackage() {
		return DispatchrootPackage.eINSTANCE;
	}

} //DispatchrootFactoryImpl
