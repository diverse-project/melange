/**
 */
package some.basepackage.root.subpackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see some.basepackage.root.subpackage.SubpackageFactory
 * @model kind="package"
 * @generated
 */
public interface SubpackagePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "subpackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "test.root.subpackage";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "test.root.subpackage";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SubpackagePackage eINSTANCE = some.basepackage.root.subpackage.impl.SubpackagePackageImpl.init();

	/**
	 * The meta object id for the '{@link some.basepackage.root.subpackage.impl.SuperBImpl <em>Super B</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see some.basepackage.root.subpackage.impl.SuperBImpl
	 * @see some.basepackage.root.subpackage.impl.SubpackagePackageImpl#getSuperB()
	 * @generated
	 */
	int SUPER_B = 1;

	/**
	 * The number of structural features of the '<em>Super B</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_B_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Super B</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_B_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link some.basepackage.root.subpackage.impl.ClassBImpl <em>Class B</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see some.basepackage.root.subpackage.impl.ClassBImpl
	 * @see some.basepackage.root.subpackage.impl.SubpackagePackageImpl#getClassB()
	 * @generated
	 */
	int CLASS_B = 0;

	/**
	 * The number of structural features of the '<em>Class B</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_B_FEATURE_COUNT = SUPER_B_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Class B</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_B_OPERATION_COUNT = SUPER_B_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link some.basepackage.root.subpackage.impl.SubAImpl <em>Sub A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see some.basepackage.root.subpackage.impl.SubAImpl
	 * @see some.basepackage.root.subpackage.impl.SubpackagePackageImpl#getSubA()
	 * @generated
	 */
	int SUB_A = 2;

	/**
	 * The number of structural features of the '<em>Sub A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_A_FEATURE_COUNT = CLASS_B_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sub A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_A_OPERATION_COUNT = CLASS_B_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link some.basepackage.root.subpackage.ClassB <em>Class B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class B</em>'.
	 * @see some.basepackage.root.subpackage.ClassB
	 * @generated
	 */
	EClass getClassB();

	/**
	 * Returns the meta object for class '{@link some.basepackage.root.subpackage.SuperB <em>Super B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super B</em>'.
	 * @see some.basepackage.root.subpackage.SuperB
	 * @generated
	 */
	EClass getSuperB();

	/**
	 * Returns the meta object for class '{@link some.basepackage.root.subpackage.SubA <em>Sub A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub A</em>'.
	 * @see some.basepackage.root.subpackage.SubA
	 * @generated
	 */
	EClass getSubA();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SubpackageFactory getSubpackageFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link some.basepackage.root.subpackage.impl.ClassBImpl <em>Class B</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see some.basepackage.root.subpackage.impl.ClassBImpl
		 * @see some.basepackage.root.subpackage.impl.SubpackagePackageImpl#getClassB()
		 * @generated
		 */
		EClass CLASS_B = eINSTANCE.getClassB();

		/**
		 * The meta object literal for the '{@link some.basepackage.root.subpackage.impl.SuperBImpl <em>Super B</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see some.basepackage.root.subpackage.impl.SuperBImpl
		 * @see some.basepackage.root.subpackage.impl.SubpackagePackageImpl#getSuperB()
		 * @generated
		 */
		EClass SUPER_B = eINSTANCE.getSuperB();

		/**
		 * The meta object literal for the '{@link some.basepackage.root.subpackage.impl.SubAImpl <em>Sub A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see some.basepackage.root.subpackage.impl.SubAImpl
		 * @see some.basepackage.root.subpackage.impl.SubpackagePackageImpl#getSubA()
		 * @generated
		 */
		EClass SUB_A = eINSTANCE.getSubA();

	}

} //SubpackagePackage
