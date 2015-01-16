/**
 */
package toppkg.subpkg1;

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
 * @see toppkg.subpkg1.Subpkg1Factory
 * @model kind="package"
 * @generated
 */
public interface Subpkg1Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "subpkg1";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://subpkg1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "subpkg1";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Subpkg1Package eINSTANCE = toppkg.subpkg1.impl.Subpkg1PackageImpl.init();

	/**
	 * The meta object id for the '{@link toppkg.subpkg1.impl.Subpkg1Class1Impl <em>Class1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see toppkg.subpkg1.impl.Subpkg1Class1Impl
	 * @see toppkg.subpkg1.impl.Subpkg1PackageImpl#getSubpkg1Class1()
	 * @generated
	 */
	int SUBPKG1_CLASS1 = 0;

	/**
	 * The feature id for the '<em><b>My Subpkg1 Class2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPKG1_CLASS1__MY_SUBPKG1_CLASS2 = 0;

	/**
	 * The number of structural features of the '<em>Class1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPKG1_CLASS1_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Class1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPKG1_CLASS1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link toppkg.subpkg1.impl.Subpkg1Class2Impl <em>Class2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see toppkg.subpkg1.impl.Subpkg1Class2Impl
	 * @see toppkg.subpkg1.impl.Subpkg1PackageImpl#getSubpkg1Class2()
	 * @generated
	 */
	int SUBPKG1_CLASS2 = 1;

	/**
	 * The number of structural features of the '<em>Class2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPKG1_CLASS2_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Class2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPKG1_CLASS2_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link toppkg.subpkg1.Subpkg1Class1 <em>Class1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class1</em>'.
	 * @see toppkg.subpkg1.Subpkg1Class1
	 * @generated
	 */
	EClass getSubpkg1Class1();

	/**
	 * Returns the meta object for the containment reference list '{@link toppkg.subpkg1.Subpkg1Class1#getMySubpkg1Class2 <em>My Subpkg1 Class2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>My Subpkg1 Class2</em>'.
	 * @see toppkg.subpkg1.Subpkg1Class1#getMySubpkg1Class2()
	 * @see #getSubpkg1Class1()
	 * @generated
	 */
	EReference getSubpkg1Class1_MySubpkg1Class2();

	/**
	 * Returns the meta object for class '{@link toppkg.subpkg1.Subpkg1Class2 <em>Class2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class2</em>'.
	 * @see toppkg.subpkg1.Subpkg1Class2
	 * @generated
	 */
	EClass getSubpkg1Class2();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Subpkg1Factory getSubpkg1Factory();

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
		 * The meta object literal for the '{@link toppkg.subpkg1.impl.Subpkg1Class1Impl <em>Class1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see toppkg.subpkg1.impl.Subpkg1Class1Impl
		 * @see toppkg.subpkg1.impl.Subpkg1PackageImpl#getSubpkg1Class1()
		 * @generated
		 */
		EClass SUBPKG1_CLASS1 = eINSTANCE.getSubpkg1Class1();

		/**
		 * The meta object literal for the '<em><b>My Subpkg1 Class2</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBPKG1_CLASS1__MY_SUBPKG1_CLASS2 = eINSTANCE.getSubpkg1Class1_MySubpkg1Class2();

		/**
		 * The meta object literal for the '{@link toppkg.subpkg1.impl.Subpkg1Class2Impl <em>Class2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see toppkg.subpkg1.impl.Subpkg1Class2Impl
		 * @see toppkg.subpkg1.impl.Subpkg1PackageImpl#getSubpkg1Class2()
		 * @generated
		 */
		EClass SUBPKG1_CLASS2 = eINSTANCE.getSubpkg1Class2();

	}

} //Subpkg1Package
