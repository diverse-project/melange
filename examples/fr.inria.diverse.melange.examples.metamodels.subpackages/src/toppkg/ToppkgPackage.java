/**
 */
package toppkg;

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
 * @see toppkg.ToppkgFactory
 * @model kind="package"
 * @generated
 */
public interface ToppkgPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "toppkg";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://toppkg";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "toppkg";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ToppkgPackage eINSTANCE = toppkg.impl.ToppkgPackageImpl.init();

	/**
	 * The meta object id for the '{@link toppkg.impl.TopClass1Impl <em>Top Class1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see toppkg.impl.TopClass1Impl
	 * @see toppkg.impl.ToppkgPackageImpl#getTopClass1()
	 * @generated
	 */
	int TOP_CLASS1 = 0;

	/**
	 * The feature id for the '<em><b>My Top Class2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_CLASS1__MY_TOP_CLASS2 = 0;

	/**
	 * The feature id for the '<em><b>My Sub Pkg1 Class1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_CLASS1__MY_SUB_PKG1_CLASS1 = 1;

	/**
	 * The feature id for the '<em><b>My Subpkg2 Class1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_CLASS1__MY_SUBPKG2_CLASS1 = 2;

	/**
	 * The number of structural features of the '<em>Top Class1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_CLASS1_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Top Class1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_CLASS1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link toppkg.impl.TopClass2Impl <em>Top Class2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see toppkg.impl.TopClass2Impl
	 * @see toppkg.impl.ToppkgPackageImpl#getTopClass2()
	 * @generated
	 */
	int TOP_CLASS2 = 1;

	/**
	 * The feature id for the '<em><b>My Top Class1</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_CLASS2__MY_TOP_CLASS1 = 0;

	/**
	 * The number of structural features of the '<em>Top Class2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_CLASS2_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Top Class2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_CLASS2_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link toppkg.TopClass1 <em>Top Class1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Top Class1</em>'.
	 * @see toppkg.TopClass1
	 * @generated
	 */
	EClass getTopClass1();

	/**
	 * Returns the meta object for the containment reference list '{@link toppkg.TopClass1#getMyTopClass2 <em>My Top Class2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>My Top Class2</em>'.
	 * @see toppkg.TopClass1#getMyTopClass2()
	 * @see #getTopClass1()
	 * @generated
	 */
	EReference getTopClass1_MyTopClass2();

	/**
	 * Returns the meta object for the containment reference list '{@link toppkg.TopClass1#getMySubPkg1Class1 <em>My Sub Pkg1 Class1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>My Sub Pkg1 Class1</em>'.
	 * @see toppkg.TopClass1#getMySubPkg1Class1()
	 * @see #getTopClass1()
	 * @generated
	 */
	EReference getTopClass1_MySubPkg1Class1();

	/**
	 * Returns the meta object for the containment reference list '{@link toppkg.TopClass1#getMySubpkg2Class1 <em>My Subpkg2 Class1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>My Subpkg2 Class1</em>'.
	 * @see toppkg.TopClass1#getMySubpkg2Class1()
	 * @see #getTopClass1()
	 * @generated
	 */
	EReference getTopClass1_MySubpkg2Class1();

	/**
	 * Returns the meta object for class '{@link toppkg.TopClass2 <em>Top Class2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Top Class2</em>'.
	 * @see toppkg.TopClass2
	 * @generated
	 */
	EClass getTopClass2();

	/**
	 * Returns the meta object for the container reference '{@link toppkg.TopClass2#getMyTopClass1 <em>My Top Class1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>My Top Class1</em>'.
	 * @see toppkg.TopClass2#getMyTopClass1()
	 * @see #getTopClass2()
	 * @generated
	 */
	EReference getTopClass2_MyTopClass1();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ToppkgFactory getToppkgFactory();

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
		 * The meta object literal for the '{@link toppkg.impl.TopClass1Impl <em>Top Class1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see toppkg.impl.TopClass1Impl
		 * @see toppkg.impl.ToppkgPackageImpl#getTopClass1()
		 * @generated
		 */
		EClass TOP_CLASS1 = eINSTANCE.getTopClass1();

		/**
		 * The meta object literal for the '<em><b>My Top Class2</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOP_CLASS1__MY_TOP_CLASS2 = eINSTANCE.getTopClass1_MyTopClass2();

		/**
		 * The meta object literal for the '<em><b>My Sub Pkg1 Class1</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOP_CLASS1__MY_SUB_PKG1_CLASS1 = eINSTANCE.getTopClass1_MySubPkg1Class1();

		/**
		 * The meta object literal for the '<em><b>My Subpkg2 Class1</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOP_CLASS1__MY_SUBPKG2_CLASS1 = eINSTANCE.getTopClass1_MySubpkg2Class1();

		/**
		 * The meta object literal for the '{@link toppkg.impl.TopClass2Impl <em>Top Class2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see toppkg.impl.TopClass2Impl
		 * @see toppkg.impl.ToppkgPackageImpl#getTopClass2()
		 * @generated
		 */
		EClass TOP_CLASS2 = eINSTANCE.getTopClass2();

		/**
		 * The meta object literal for the '<em><b>My Top Class1</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOP_CLASS2__MY_TOP_CLASS1 = eINSTANCE.getTopClass2_MyTopClass1();

	}

} //ToppkgPackage
