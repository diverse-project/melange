/**
 */
package dispatchroot;

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
 * @see dispatchroot.DispatchrootFactory
 * @model kind="package"
 * @generated
 */
public interface DispatchrootPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dispatchroot";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://dispatchroot/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dispatchroot";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DispatchrootPackage eINSTANCE = dispatchroot.impl.DispatchrootPackageImpl.init();

	/**
	 * The meta object id for the '{@link dispatchroot.impl.AImpl <em>A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dispatchroot.impl.AImpl
	 * @see dispatchroot.impl.DispatchrootPackageImpl#getA()
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
	 * The meta object id for the '{@link dispatchroot.impl.BImpl <em>B</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dispatchroot.impl.BImpl
	 * @see dispatchroot.impl.DispatchrootPackageImpl#getB()
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
	int B_FEATURE_COUNT = A_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>B</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B_OPERATION_COUNT = A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dispatchroot.impl.CImpl <em>C</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dispatchroot.impl.CImpl
	 * @see dispatchroot.impl.DispatchrootPackageImpl#getC()
	 * @generated
	 */
	int C = 2;

	/**
	 * The number of structural features of the '<em>C</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>C</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link dispatchroot.A <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>A</em>'.
	 * @see dispatchroot.A
	 * @generated
	 */
	EClass getA();

	/**
	 * Returns the meta object for class '{@link dispatchroot.B <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>B</em>'.
	 * @see dispatchroot.B
	 * @generated
	 */
	EClass getB();

	/**
	 * Returns the meta object for class '{@link dispatchroot.C <em>C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>C</em>'.
	 * @see dispatchroot.C
	 * @generated
	 */
	EClass getC();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DispatchrootFactory getDispatchrootFactory();

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
		 * The meta object literal for the '{@link dispatchroot.impl.AImpl <em>A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dispatchroot.impl.AImpl
		 * @see dispatchroot.impl.DispatchrootPackageImpl#getA()
		 * @generated
		 */
		EClass A = eINSTANCE.getA();

		/**
		 * The meta object literal for the '{@link dispatchroot.impl.BImpl <em>B</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dispatchroot.impl.BImpl
		 * @see dispatchroot.impl.DispatchrootPackageImpl#getB()
		 * @generated
		 */
		EClass B = eINSTANCE.getB();

		/**
		 * The meta object literal for the '{@link dispatchroot.impl.CImpl <em>C</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dispatchroot.impl.CImpl
		 * @see dispatchroot.impl.DispatchrootPackageImpl#getC()
		 * @generated
		 */
		EClass C = eINSTANCE.getC();

	}

} //DispatchrootPackage
