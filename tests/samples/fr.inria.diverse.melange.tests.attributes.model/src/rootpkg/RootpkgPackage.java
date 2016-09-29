/**
 */
package rootpkg;

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
	String eNS_URI = "http://test.attributes/rootpkg/";

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
	 * The meta object id for the '{@link rootpkg.impl.AImpl <em>A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rootpkg.impl.AImpl
	 * @see rootpkg.impl.RootpkgPackageImpl#getA()
	 * @generated
	 */
	int A = 0;

	/**
	 * The number of structural features of the '<em>A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rootpkg.impl.BImpl <em>B</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rootpkg.impl.BImpl
	 * @see rootpkg.impl.RootpkgPackageImpl#getB()
	 * @generated
	 */
	int B = 1;

	/**
	 * The number of structural features of the '<em>B</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>B</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link rootpkg.A <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>A</em>'.
	 * @see rootpkg.A
	 * @generated
	 */
	EClass getA();

	/**
	 * Returns the meta object for class '{@link rootpkg.B <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>B</em>'.
	 * @see rootpkg.B
	 * @generated
	 */
	EClass getB();

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
		 * The meta object literal for the '{@link rootpkg.impl.AImpl <em>A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rootpkg.impl.AImpl
		 * @see rootpkg.impl.RootpkgPackageImpl#getA()
		 * @generated
		 */
		EClass A = eINSTANCE.getA();

		/**
		 * The meta object literal for the '{@link rootpkg.impl.BImpl <em>B</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rootpkg.impl.BImpl
		 * @see rootpkg.impl.RootpkgPackageImpl#getB()
		 * @generated
		 */
		EClass B = eINSTANCE.getB();

	}

} //RootpkgPackage
