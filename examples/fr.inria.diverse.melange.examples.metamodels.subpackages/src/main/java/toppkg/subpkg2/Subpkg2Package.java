/**
 */
package toppkg.subpkg2;

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
 * @see toppkg.subpkg2.Subpkg2Factory
 * @model kind="package"
 * @generated
 */
public interface Subpkg2Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "subpkg2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://subpkg2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "subpkg2";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Subpkg2Package eINSTANCE = toppkg.subpkg2.impl.Subpkg2PackageImpl.init();

	/**
	 * The meta object id for the '{@link toppkg.subpkg2.impl.Subpkg2Class1Impl <em>Class1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see toppkg.subpkg2.impl.Subpkg2Class1Impl
	 * @see toppkg.subpkg2.impl.Subpkg2PackageImpl#getSubpkg2Class1()
	 * @generated
	 */
	int SUBPKG2_CLASS1 = 0;

	/**
	 * The feature id for the '<em><b>My Subpkg2 Class2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPKG2_CLASS1__MY_SUBPKG2_CLASS2 = 0;

	/**
	 * The number of structural features of the '<em>Class1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPKG2_CLASS1_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Class1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPKG2_CLASS1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link toppkg.subpkg2.impl.Subpkg2Class2Impl <em>Class2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see toppkg.subpkg2.impl.Subpkg2Class2Impl
	 * @see toppkg.subpkg2.impl.Subpkg2PackageImpl#getSubpkg2Class2()
	 * @generated
	 */
	int SUBPKG2_CLASS2 = 1;

	/**
	 * The feature id for the '<em><b>My Subpkg3 Class1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPKG2_CLASS2__MY_SUBPKG3_CLASS1 = 0;

	/**
	 * The number of structural features of the '<em>Class2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPKG2_CLASS2_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Class2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPKG2_CLASS2_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link toppkg.subpkg2.Subpkg2Class1 <em>Class1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class1</em>'.
	 * @see toppkg.subpkg2.Subpkg2Class1
	 * @generated
	 */
	EClass getSubpkg2Class1();

	/**
	 * Returns the meta object for the containment reference list '{@link toppkg.subpkg2.Subpkg2Class1#getMySubpkg2Class2 <em>My Subpkg2 Class2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>My Subpkg2 Class2</em>'.
	 * @see toppkg.subpkg2.Subpkg2Class1#getMySubpkg2Class2()
	 * @see #getSubpkg2Class1()
	 * @generated
	 */
	EReference getSubpkg2Class1_MySubpkg2Class2();

	/**
	 * Returns the meta object for class '{@link toppkg.subpkg2.Subpkg2Class2 <em>Class2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class2</em>'.
	 * @see toppkg.subpkg2.Subpkg2Class2
	 * @generated
	 */
	EClass getSubpkg2Class2();

	/**
	 * Returns the meta object for the containment reference list '{@link toppkg.subpkg2.Subpkg2Class2#getMySubpkg3Class1 <em>My Subpkg3 Class1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>My Subpkg3 Class1</em>'.
	 * @see toppkg.subpkg2.Subpkg2Class2#getMySubpkg3Class1()
	 * @see #getSubpkg2Class2()
	 * @generated
	 */
	EReference getSubpkg2Class2_MySubpkg3Class1();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Subpkg2Factory getSubpkg2Factory();

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
		 * The meta object literal for the '{@link toppkg.subpkg2.impl.Subpkg2Class1Impl <em>Class1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see toppkg.subpkg2.impl.Subpkg2Class1Impl
		 * @see toppkg.subpkg2.impl.Subpkg2PackageImpl#getSubpkg2Class1()
		 * @generated
		 */
		EClass SUBPKG2_CLASS1 = eINSTANCE.getSubpkg2Class1();

		/**
		 * The meta object literal for the '<em><b>My Subpkg2 Class2</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBPKG2_CLASS1__MY_SUBPKG2_CLASS2 = eINSTANCE.getSubpkg2Class1_MySubpkg2Class2();

		/**
		 * The meta object literal for the '{@link toppkg.subpkg2.impl.Subpkg2Class2Impl <em>Class2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see toppkg.subpkg2.impl.Subpkg2Class2Impl
		 * @see toppkg.subpkg2.impl.Subpkg2PackageImpl#getSubpkg2Class2()
		 * @generated
		 */
		EClass SUBPKG2_CLASS2 = eINSTANCE.getSubpkg2Class2();

		/**
		 * The meta object literal for the '<em><b>My Subpkg3 Class1</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBPKG2_CLASS2__MY_SUBPKG3_CLASS1 = eINSTANCE.getSubpkg2Class2_MySubpkg3Class1();

	}

} //Subpkg2Package
