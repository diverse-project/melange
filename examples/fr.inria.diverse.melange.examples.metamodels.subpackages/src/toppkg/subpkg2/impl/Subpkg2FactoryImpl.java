/**
 */
package toppkg.subpkg2.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import toppkg.subpkg2.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Subpkg2FactoryImpl extends EFactoryImpl implements Subpkg2Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Subpkg2Factory init() {
		try {
			Subpkg2Factory theSubpkg2Factory = (Subpkg2Factory)EPackage.Registry.INSTANCE.getEFactory(Subpkg2Package.eNS_URI);
			if (theSubpkg2Factory != null) {
				return theSubpkg2Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Subpkg2FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subpkg2FactoryImpl() {
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
			case Subpkg2Package.SUBPKG2_CLASS1: return createSubpkg2Class1();
			case Subpkg2Package.SUBPKG2_CLASS2: return createSubpkg2Class2();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subpkg2Class1 createSubpkg2Class1() {
		Subpkg2Class1Impl subpkg2Class1 = new Subpkg2Class1Impl();
		return subpkg2Class1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subpkg2Class2 createSubpkg2Class2() {
		Subpkg2Class2Impl subpkg2Class2 = new Subpkg2Class2Impl();
		return subpkg2Class2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subpkg2Package getSubpkg2Package() {
		return (Subpkg2Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Subpkg2Package getPackage() {
		return Subpkg2Package.eINSTANCE;
	}

} //Subpkg2FactoryImpl
