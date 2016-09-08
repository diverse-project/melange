/**
 */
package rootpkg;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import root.RootPackage;

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
 * @see rootpkg.RootpkgFactory
 * @model kind="package"
 * @generated
 */
public interface RootpkgPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rootpkg";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://rootpkg";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rootpkg";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RootpkgPackage eINSTANCE = rootpkg.impl.RootpkgPackageImpl.init();

	/**
	 * The meta object id for the '{@link rootpkg.impl.NewClassImpl <em>New Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rootpkg.impl.NewClassImpl
	 * @see rootpkg.impl.RootpkgPackageImpl#getNewClass()
	 * @generated
	 */
	int NEW_CLASS = 0;

	/**
	 * The feature id for the '<em><b>To Subpkg2 Class1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_CLASS__TO_SUBPKG2_CLASS1 = RootPackage.CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>New Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_CLASS_FEATURE_COUNT = RootPackage.CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>New Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_CLASS_OPERATION_COUNT = RootPackage.CLASS_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link rootpkg.NewClass <em>New Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>New Class</em>'.
	 * @see rootpkg.NewClass
	 * @generated
	 */
	EClass getNewClass();

	/**
	 * Returns the meta object for the reference '{@link rootpkg.NewClass#getToSubpkg2Class1 <em>To Subpkg2 Class1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Subpkg2 Class1</em>'.
	 * @see rootpkg.NewClass#getToSubpkg2Class1()
	 * @see #getNewClass()
	 * @generated
	 */
	EReference getNewClass_ToSubpkg2Class1();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RootpkgFactory getRootpkgFactory();

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
		 * The meta object literal for the '{@link rootpkg.impl.NewClassImpl <em>New Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rootpkg.impl.NewClassImpl
		 * @see rootpkg.impl.RootpkgPackageImpl#getNewClass()
		 * @generated
		 */
		EClass NEW_CLASS = eINSTANCE.getNewClass();

		/**
		 * The meta object literal for the '<em><b>To Subpkg2 Class1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEW_CLASS__TO_SUBPKG2_CLASS1 = eINSTANCE.getNewClass_ToSubpkg2Class1();

	}

} //RootpkgPackage
