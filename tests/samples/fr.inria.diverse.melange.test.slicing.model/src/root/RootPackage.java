/**
 */
package root;

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
 * @see root.RootFactory
 * @model kind="package"
 * @generated
 */
public interface RootPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "root";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://slicing.test";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "root";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RootPackage eINSTANCE = root.impl.RootPackageImpl.init();

	/**
	 * The meta object id for the '{@link root.impl.SuperAImpl <em>Super A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see root.impl.SuperAImpl
	 * @see root.impl.RootPackageImpl#getSuperA()
	 * @generated
	 */
	int SUPER_A = 0;

	/**
	 * The number of structural features of the '<em>Super A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_A_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Super A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_A_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link root.impl.AImpl <em>A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see root.impl.AImpl
	 * @see root.impl.RootPackageImpl#getA()
	 * @generated
	 */
	int A = 1;

	/**
	 * The feature id for the '<em><b>To B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__TO_B = SUPER_A_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A_FEATURE_COUNT = SUPER_A_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A_OPERATION_COUNT = SUPER_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link root.impl.SubAImpl <em>Sub A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see root.impl.SubAImpl
	 * @see root.impl.RootPackageImpl#getSubA()
	 * @generated
	 */
	int SUB_A = 2;

	/**
	 * The feature id for the '<em><b>To B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_A__TO_B = A__TO_B;

	/**
	 * The number of structural features of the '<em>Sub A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_A_FEATURE_COUNT = A_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sub A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_A_OPERATION_COUNT = A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link root.impl.BImpl <em>B</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see root.impl.BImpl
	 * @see root.impl.RootPackageImpl#getB()
	 * @generated
	 */
	int B = 3;

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
	 * Returns the meta object for class '{@link root.SuperA <em>Super A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super A</em>'.
	 * @see root.SuperA
	 * @generated
	 */
	EClass getSuperA();

	/**
	 * Returns the meta object for class '{@link root.A <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>A</em>'.
	 * @see root.A
	 * @generated
	 */
	EClass getA();

	/**
	 * Returns the meta object for the reference '{@link root.A#getToB <em>To B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To B</em>'.
	 * @see root.A#getToB()
	 * @see #getA()
	 * @generated
	 */
	EReference getA_ToB();

	/**
	 * Returns the meta object for class '{@link root.SubA <em>Sub A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub A</em>'.
	 * @see root.SubA
	 * @generated
	 */
	EClass getSubA();

	/**
	 * Returns the meta object for class '{@link root.B <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>B</em>'.
	 * @see root.B
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
	RootFactory getRootFactory();

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
		 * The meta object literal for the '{@link root.impl.SuperAImpl <em>Super A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see root.impl.SuperAImpl
		 * @see root.impl.RootPackageImpl#getSuperA()
		 * @generated
		 */
		EClass SUPER_A = eINSTANCE.getSuperA();

		/**
		 * The meta object literal for the '{@link root.impl.AImpl <em>A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see root.impl.AImpl
		 * @see root.impl.RootPackageImpl#getA()
		 * @generated
		 */
		EClass A = eINSTANCE.getA();

		/**
		 * The meta object literal for the '<em><b>To B</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference A__TO_B = eINSTANCE.getA_ToB();

		/**
		 * The meta object literal for the '{@link root.impl.SubAImpl <em>Sub A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see root.impl.SubAImpl
		 * @see root.impl.RootPackageImpl#getSubA()
		 * @generated
		 */
		EClass SUB_A = eINSTANCE.getSubA();

		/**
		 * The meta object literal for the '{@link root.impl.BImpl <em>B</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see root.impl.BImpl
		 * @see root.impl.RootPackageImpl#getB()
		 * @generated
		 */
		EClass B = eINSTANCE.getB();

	}

} //RootPackage
