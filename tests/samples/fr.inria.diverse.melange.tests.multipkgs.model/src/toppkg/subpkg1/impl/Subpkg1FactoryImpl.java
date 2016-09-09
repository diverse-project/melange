/**
 */
package toppkg.subpkg1.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import toppkg.subpkg1.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Subpkg1FactoryImpl extends EFactoryImpl implements Subpkg1Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Subpkg1Factory init() {
		try {
			Subpkg1Factory theSubpkg1Factory = (Subpkg1Factory)EPackage.Registry.INSTANCE.getEFactory(Subpkg1Package.eNS_URI);
			if (theSubpkg1Factory != null) {
				return theSubpkg1Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Subpkg1FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subpkg1FactoryImpl() {
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
			case Subpkg1Package.SUBPKG1_CLASS1: return createSubpkg1Class1();
			case Subpkg1Package.SUBPKG1_CLASS2: return createSubpkg1Class2();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subpkg1Class1 createSubpkg1Class1() {
		Subpkg1Class1Impl subpkg1Class1 = new Subpkg1Class1Impl();
		return subpkg1Class1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subpkg1Class2 createSubpkg1Class2() {
		Subpkg1Class2Impl subpkg1Class2 = new Subpkg1Class2Impl();
		return subpkg1Class2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subpkg1Package getSubpkg1Package() {
		return (Subpkg1Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Subpkg1Package getPackage() {
		return Subpkg1Package.eINSTANCE;
	}

} //Subpkg1FactoryImpl
