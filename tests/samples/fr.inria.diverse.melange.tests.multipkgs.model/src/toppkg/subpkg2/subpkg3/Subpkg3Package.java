/**
 */
package toppkg.subpkg2.subpkg3;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see toppkg.subpkg2.subpkg3.Subpkg3Factory
 * @model kind="package"
 * @generated
 */
public interface Subpkg3Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "subpkg3";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://subpkg3";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "subpkg3";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Subpkg3Package eINSTANCE = toppkg.subpkg2.subpkg3.impl.Subpkg3PackageImpl.init();

	/**
	 * The meta object id for the '{@link toppkg.subpkg2.subpkg3.impl.Subpkg3Class1Impl <em>Class1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see toppkg.subpkg2.subpkg3.impl.Subpkg3Class1Impl
	 * @see toppkg.subpkg2.subpkg3.impl.Subpkg3PackageImpl#getSubpkg3Class1()
	 * @generated
	 */
	int SUBPKG3_CLASS1 = 0;

	/**
	 * The feature id for the '<em><b>My Subpkg3 Class2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPKG3_CLASS1__MY_SUBPKG3_CLASS2 = 0;

	/**
	 * The number of structural features of the '<em>Class1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPKG3_CLASS1_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Class1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPKG3_CLASS1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link toppkg.subpkg2.subpkg3.impl.Subpkg3Class2Impl <em>Class2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see toppkg.subpkg2.subpkg3.impl.Subpkg3Class2Impl
	 * @see toppkg.subpkg2.subpkg3.impl.Subpkg3PackageImpl#getSubpkg3Class2()
	 * @generated
	 */
	int SUBPKG3_CLASS2 = 1;

	/**
	 * The number of structural features of the '<em>Class2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPKG3_CLASS2_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Class2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPKG3_CLASS2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link toppkg.subpkg2.subpkg3.impl.ClassAImpl <em>Class A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see toppkg.subpkg2.subpkg3.impl.ClassAImpl
	 * @see toppkg.subpkg2.subpkg3.impl.Subpkg3PackageImpl#getClassA()
	 * @generated
	 */
	int CLASS_A = 2;

	/**
	 * The number of structural features of the '<em>Class A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_A_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Class A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_A_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link toppkg.subpkg2.subpkg3.Subpkg3Class1 <em>Class1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class1</em>'.
	 * @see toppkg.subpkg2.subpkg3.Subpkg3Class1
	 * @generated
	 */
	EClass getSubpkg3Class1();

	/**
	 * Returns the meta object for the containment reference list '{@link toppkg.subpkg2.subpkg3.Subpkg3Class1#getMySubpkg3Class2 <em>My Subpkg3 Class2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>My Subpkg3 Class2</em>'.
	 * @see toppkg.subpkg2.subpkg3.Subpkg3Class1#getMySubpkg3Class2()
	 * @see #getSubpkg3Class1()
	 * @generated
	 */
	EReference getSubpkg3Class1_MySubpkg3Class2();

	/**
	 * Returns the meta object for class '{@link toppkg.subpkg2.subpkg3.Subpkg3Class2 <em>Class2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class2</em>'.
	 * @see toppkg.subpkg2.subpkg3.Subpkg3Class2
	 * @generated
	 */
	EClass getSubpkg3Class2();

	/**
	 * Returns the meta object for class '{@link toppkg.subpkg2.subpkg3.ClassA <em>Class A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class A</em>'.
	 * @see toppkg.subpkg2.subpkg3.ClassA
	 * @generated
	 */
	EClass getClassA();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Subpkg3Factory getSubpkg3Factory();

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
		 * The meta object literal for the '{@link toppkg.subpkg2.subpkg3.impl.Subpkg3Class1Impl <em>Class1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see toppkg.subpkg2.subpkg3.impl.Subpkg3Class1Impl
		 * @see toppkg.subpkg2.subpkg3.impl.Subpkg3PackageImpl#getSubpkg3Class1()
		 * @generated
		 */
		EClass SUBPKG3_CLASS1 = eINSTANCE.getSubpkg3Class1();

		/**
		 * The meta object literal for the '<em><b>My Subpkg3 Class2</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBPKG3_CLASS1__MY_SUBPKG3_CLASS2 = eINSTANCE.getSubpkg3Class1_MySubpkg3Class2();

		/**
		 * The meta object literal for the '{@link toppkg.subpkg2.subpkg3.impl.Subpkg3Class2Impl <em>Class2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see toppkg.subpkg2.subpkg3.impl.Subpkg3Class2Impl
		 * @see toppkg.subpkg2.subpkg3.impl.Subpkg3PackageImpl#getSubpkg3Class2()
		 * @generated
		 */
		EClass SUBPKG3_CLASS2 = eINSTANCE.getSubpkg3Class2();

		/**
		 * The meta object literal for the '{@link toppkg.subpkg2.subpkg3.impl.ClassAImpl <em>Class A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see toppkg.subpkg2.subpkg3.impl.ClassAImpl
		 * @see toppkg.subpkg2.subpkg3.impl.Subpkg3PackageImpl#getClassA()
		 * @generated
		 */
		EClass CLASS_A = eINSTANCE.getClassA();

	}

} //Subpkg3Package
