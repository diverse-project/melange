/**
 */
package toppkg.subpkg2.subpkg3.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import toppkg.subpkg2.subpkg3.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Subpkg3FactoryImpl extends EFactoryImpl implements Subpkg3Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Subpkg3Factory init() {
		try {
			Subpkg3Factory theSubpkg3Factory = (Subpkg3Factory)EPackage.Registry.INSTANCE.getEFactory(Subpkg3Package.eNS_URI);
			if (theSubpkg3Factory != null) {
				return theSubpkg3Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Subpkg3FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subpkg3FactoryImpl() {
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
			case Subpkg3Package.SUBPKG3_CLASS1: return createSubpkg3Class1();
			case Subpkg3Package.SUBPKG3_CLASS2: return createSubpkg3Class2();
			case Subpkg3Package.CLASS_A: return createClassA();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subpkg3Class1 createSubpkg3Class1() {
		Subpkg3Class1Impl subpkg3Class1 = new Subpkg3Class1Impl();
		return subpkg3Class1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subpkg3Class2 createSubpkg3Class2() {
		Subpkg3Class2Impl subpkg3Class2 = new Subpkg3Class2Impl();
		return subpkg3Class2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassA createClassA() {
		ClassAImpl classA = new ClassAImpl();
		return classA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subpkg3Package getSubpkg3Package() {
		return (Subpkg3Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Subpkg3Package getPackage() {
		return Subpkg3Package.eINSTANCE;
	}

} //Subpkg3FactoryImpl
