/**
 */
package some.basepackage.root.subpackage.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import some.basepackage.root.subpackage.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubpackageFactoryImpl extends EFactoryImpl implements SubpackageFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SubpackageFactory init() {
		try {
			SubpackageFactory theSubpackageFactory = (SubpackageFactory)EPackage.Registry.INSTANCE.getEFactory(SubpackagePackage.eNS_URI);
			if (theSubpackageFactory != null) {
				return theSubpackageFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SubpackageFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubpackageFactoryImpl() {
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
			case SubpackagePackage.CLASS_B: return createClassB();
			case SubpackagePackage.SUPER_B: return createSuperB();
			case SubpackagePackage.SUB_A: return createSubA();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassB createClassB() {
		ClassBImpl classB = new ClassBImpl();
		return classB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperB createSuperB() {
		SuperBImpl superB = new SuperBImpl();
		return superB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubA createSubA() {
		SubAImpl subA = new SubAImpl();
		return subA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubpackagePackage getSubpackagePackage() {
		return (SubpackagePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SubpackagePackage getPackage() {
		return SubpackagePackage.eINSTANCE;
	}

} //SubpackageFactoryImpl
