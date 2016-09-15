/**
 */
package extension.dispatchroot;

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
 * @see extension.dispatchroot.DispatchrootFactory
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
	String eNS_URI = "http://dispatchroot/extension";

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
	DispatchrootPackage eINSTANCE = extension.dispatchroot.impl.DispatchrootPackageImpl.init();

	/**
	 * The meta object id for the '{@link extension.dispatchroot.impl.BImpl <em>B</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extension.dispatchroot.impl.BImpl
	 * @see extension.dispatchroot.impl.DispatchrootPackageImpl#getB()
	 * @generated
	 */
	int B = 0;

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
	 * The meta object id for the '{@link extension.dispatchroot.impl.SubBImpl <em>Sub B</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extension.dispatchroot.impl.SubBImpl
	 * @see extension.dispatchroot.impl.DispatchrootPackageImpl#getSubB()
	 * @generated
	 */
	int SUB_B = 1;

	/**
	 * The number of structural features of the '<em>Sub B</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_B_FEATURE_COUNT = B_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sub B</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_B_OPERATION_COUNT = B_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link extension.dispatchroot.B <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>B</em>'.
	 * @see extension.dispatchroot.B
	 * @generated
	 */
	EClass getB();

	/**
	 * Returns the meta object for class '{@link extension.dispatchroot.SubB <em>Sub B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub B</em>'.
	 * @see extension.dispatchroot.SubB
	 * @generated
	 */
	EClass getSubB();

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
		 * The meta object literal for the '{@link extension.dispatchroot.impl.BImpl <em>B</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extension.dispatchroot.impl.BImpl
		 * @see extension.dispatchroot.impl.DispatchrootPackageImpl#getB()
		 * @generated
		 */
		EClass B = eINSTANCE.getB();

		/**
		 * The meta object literal for the '{@link extension.dispatchroot.impl.SubBImpl <em>Sub B</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extension.dispatchroot.impl.SubBImpl
		 * @see extension.dispatchroot.impl.DispatchrootPackageImpl#getSubB()
		 * @generated
		 */
		EClass SUB_B = eINSTANCE.getSubB();

	}

} //DispatchrootPackage
