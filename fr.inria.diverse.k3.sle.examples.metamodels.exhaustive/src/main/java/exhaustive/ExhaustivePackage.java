/**
 */
package exhaustive;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
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
 * @see exhaustive.ExhaustiveFactory
 * @model kind="package"
 * @generated
 */
public interface ExhaustivePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "exhaustive";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://exhaustive/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "exhaustive";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExhaustivePackage eINSTANCE = exhaustive.impl.ExhaustivePackageImpl.init();

	/**
	 * The meta object id for the '{@link exhaustive.impl.OperationsTestImpl <em>Operations Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see exhaustive.impl.OperationsTestImpl
	 * @see exhaustive.impl.ExhaustivePackageImpl#getOperationsTest()
	 * @generated
	 */
	int OPERATIONS_TEST = 5;

	/**
	 * The number of structural features of the '<em>Operations Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONS_TEST_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Empty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONS_TEST___EMPTY = 0;

	/**
	 * The operation id for the '<em>Lower Bound1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONS_TEST___LOWER_BOUND1 = 1;

	/**
	 * The operation id for the '<em>Lower Bound2</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONS_TEST___LOWER_BOUND2 = 2;

	/**
	 * The operation id for the '<em>Ordered No</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONS_TEST___ORDERED_NO = 3;

	/**
	 * The operation id for the '<em>Unique No</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONS_TEST___UNIQUE_NO = 4;

	/**
	 * The operation id for the '<em>Upper Bound2</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONS_TEST___UPPER_BOUND2 = 5;

	/**
	 * The operation id for the '<em>Upper Bound N</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONS_TEST___UPPER_BOUND_N = 6;

	/**
	 * The operation id for the '<em>Many Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONS_TEST___MANY_PARAMETERS__ABSTRACTTEST_INT = 7;

	/**
	 * The number of operations of the '<em>Operations Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONS_TEST_OPERATION_COUNT = 8;

	/**
	 * The meta object id for the '{@link exhaustive.impl.AbstractTestImpl <em>Abstract Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see exhaustive.impl.AbstractTestImpl
	 * @see exhaustive.impl.ExhaustivePackageImpl#getAbstractTest()
	 * @generated
	 */
	int ABSTRACT_TEST = 0;

	/**
	 * The number of structural features of the '<em>Abstract Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TEST_FEATURE_COUNT = OPERATIONS_TEST_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Empty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TEST___EMPTY = OPERATIONS_TEST___EMPTY;

	/**
	 * The operation id for the '<em>Lower Bound1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TEST___LOWER_BOUND1 = OPERATIONS_TEST___LOWER_BOUND1;

	/**
	 * The operation id for the '<em>Lower Bound2</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TEST___LOWER_BOUND2 = OPERATIONS_TEST___LOWER_BOUND2;

	/**
	 * The operation id for the '<em>Ordered No</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TEST___ORDERED_NO = OPERATIONS_TEST___ORDERED_NO;

	/**
	 * The operation id for the '<em>Unique No</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TEST___UNIQUE_NO = OPERATIONS_TEST___UNIQUE_NO;

	/**
	 * The operation id for the '<em>Upper Bound2</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TEST___UPPER_BOUND2 = OPERATIONS_TEST___UPPER_BOUND2;

	/**
	 * The operation id for the '<em>Upper Bound N</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TEST___UPPER_BOUND_N = OPERATIONS_TEST___UPPER_BOUND_N;

	/**
	 * The operation id for the '<em>Many Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TEST___MANY_PARAMETERS__ABSTRACTTEST_INT = OPERATIONS_TEST___MANY_PARAMETERS__ABSTRACTTEST_INT;

	/**
	 * The number of operations of the '<em>Abstract Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TEST_OPERATION_COUNT = OPERATIONS_TEST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link exhaustive.InterfaceTest <em>Interface Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see exhaustive.InterfaceTest
	 * @see exhaustive.impl.ExhaustivePackageImpl#getInterfaceTest()
	 * @generated
	 */
	int INTERFACE_TEST = 1;

	/**
	 * The number of structural features of the '<em>Interface Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TEST_FEATURE_COUNT = OPERATIONS_TEST_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Empty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TEST___EMPTY = OPERATIONS_TEST___EMPTY;

	/**
	 * The operation id for the '<em>Lower Bound1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TEST___LOWER_BOUND1 = OPERATIONS_TEST___LOWER_BOUND1;

	/**
	 * The operation id for the '<em>Lower Bound2</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TEST___LOWER_BOUND2 = OPERATIONS_TEST___LOWER_BOUND2;

	/**
	 * The operation id for the '<em>Ordered No</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TEST___ORDERED_NO = OPERATIONS_TEST___ORDERED_NO;

	/**
	 * The operation id for the '<em>Unique No</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TEST___UNIQUE_NO = OPERATIONS_TEST___UNIQUE_NO;

	/**
	 * The operation id for the '<em>Upper Bound2</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TEST___UPPER_BOUND2 = OPERATIONS_TEST___UPPER_BOUND2;

	/**
	 * The operation id for the '<em>Upper Bound N</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TEST___UPPER_BOUND_N = OPERATIONS_TEST___UPPER_BOUND_N;

	/**
	 * The operation id for the '<em>Many Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TEST___MANY_PARAMETERS__ABSTRACTTEST_INT = OPERATIONS_TEST___MANY_PARAMETERS__ABSTRACTTEST_INT;

	/**
	 * The number of operations of the '<em>Interface Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TEST_OPERATION_COUNT = OPERATIONS_TEST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link exhaustive.impl.MultipleSuperTestImpl <em>Multiple Super Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see exhaustive.impl.MultipleSuperTestImpl
	 * @see exhaustive.impl.ExhaustivePackageImpl#getMultipleSuperTest()
	 * @generated
	 */
	int MULTIPLE_SUPER_TEST = 2;

	/**
	 * The number of structural features of the '<em>Multiple Super Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_SUPER_TEST_FEATURE_COUNT = ABSTRACT_TEST_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Empty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_SUPER_TEST___EMPTY = ABSTRACT_TEST___EMPTY;

	/**
	 * The operation id for the '<em>Lower Bound1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_SUPER_TEST___LOWER_BOUND1 = ABSTRACT_TEST___LOWER_BOUND1;

	/**
	 * The operation id for the '<em>Lower Bound2</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_SUPER_TEST___LOWER_BOUND2 = ABSTRACT_TEST___LOWER_BOUND2;

	/**
	 * The operation id for the '<em>Ordered No</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_SUPER_TEST___ORDERED_NO = ABSTRACT_TEST___ORDERED_NO;

	/**
	 * The operation id for the '<em>Unique No</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_SUPER_TEST___UNIQUE_NO = ABSTRACT_TEST___UNIQUE_NO;

	/**
	 * The operation id for the '<em>Upper Bound2</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_SUPER_TEST___UPPER_BOUND2 = ABSTRACT_TEST___UPPER_BOUND2;

	/**
	 * The operation id for the '<em>Upper Bound N</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_SUPER_TEST___UPPER_BOUND_N = ABSTRACT_TEST___UPPER_BOUND_N;

	/**
	 * The operation id for the '<em>Many Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_SUPER_TEST___MANY_PARAMETERS__ABSTRACTTEST_INT = ABSTRACT_TEST___MANY_PARAMETERS__ABSTRACTTEST_INT;

	/**
	 * The number of operations of the '<em>Multiple Super Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_SUPER_TEST_OPERATION_COUNT = ABSTRACT_TEST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link exhaustive.impl.ReferencesTestImpl <em>References Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see exhaustive.impl.ReferencesTestImpl
	 * @see exhaustive.impl.ExhaustivePackageImpl#getReferencesTest()
	 * @generated
	 */
	int REFERENCES_TEST = 3;

	/**
	 * The feature id for the '<em><b>Changeable Yes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCES_TEST__CHANGEABLE_YES = ABSTRACT_TEST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Changeable No</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCES_TEST__CHANGEABLE_NO = ABSTRACT_TEST_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Containment Yes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCES_TEST__CONTAINMENT_YES = ABSTRACT_TEST_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Reference To Generics</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCES_TEST__REFERENCE_TO_GENERICS = ABSTRACT_TEST_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Opposite1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCES_TEST__OPPOSITE1 = ABSTRACT_TEST_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Ordered False</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCES_TEST__ORDERED_FALSE = ABSTRACT_TEST_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Resolve Proxies False</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCES_TEST__RESOLVE_PROXIES_FALSE = ABSTRACT_TEST_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Transient True</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCES_TEST__TRANSIENT_TRUE = ABSTRACT_TEST_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Unique False</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCES_TEST__UNIQUE_FALSE = ABSTRACT_TEST_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Unsettable True</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCES_TEST__UNSETTABLE_TRUE = ABSTRACT_TEST_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Volatile True</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCES_TEST__VOLATILE_TRUE = ABSTRACT_TEST_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Derived Yes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCES_TEST__DERIVED_YES = ABSTRACT_TEST_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Upper Bound N</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCES_TEST__UPPER_BOUND_N = ABSTRACT_TEST_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Upper Bound2</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCES_TEST__UPPER_BOUND2 = ABSTRACT_TEST_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Lower Bound1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCES_TEST__LOWER_BOUND1 = ABSTRACT_TEST_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Lower Bound2</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCES_TEST__LOWER_BOUND2 = ABSTRACT_TEST_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>References Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCES_TEST_FEATURE_COUNT = ABSTRACT_TEST_FEATURE_COUNT + 16;

	/**
	 * The operation id for the '<em>Empty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCES_TEST___EMPTY = ABSTRACT_TEST___EMPTY;

	/**
	 * The operation id for the '<em>Lower Bound1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCES_TEST___LOWER_BOUND1 = ABSTRACT_TEST___LOWER_BOUND1;

	/**
	 * The operation id for the '<em>Lower Bound2</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCES_TEST___LOWER_BOUND2 = ABSTRACT_TEST___LOWER_BOUND2;

	/**
	 * The operation id for the '<em>Ordered No</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCES_TEST___ORDERED_NO = ABSTRACT_TEST___ORDERED_NO;

	/**
	 * The operation id for the '<em>Unique No</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCES_TEST___UNIQUE_NO = ABSTRACT_TEST___UNIQUE_NO;

	/**
	 * The operation id for the '<em>Upper Bound2</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCES_TEST___UPPER_BOUND2 = ABSTRACT_TEST___UPPER_BOUND2;

	/**
	 * The operation id for the '<em>Upper Bound N</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCES_TEST___UPPER_BOUND_N = ABSTRACT_TEST___UPPER_BOUND_N;

	/**
	 * The operation id for the '<em>Many Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCES_TEST___MANY_PARAMETERS__ABSTRACTTEST_INT = ABSTRACT_TEST___MANY_PARAMETERS__ABSTRACTTEST_INT;

	/**
	 * The number of operations of the '<em>References Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCES_TEST_OPERATION_COUNT = ABSTRACT_TEST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link exhaustive.impl.AttributesTestImpl <em>Attributes Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see exhaustive.impl.AttributesTestImpl
	 * @see exhaustive.impl.ExhaustivePackageImpl#getAttributesTest()
	 * @generated
	 */
	int ATTRIBUTES_TEST = 4;

	/**
	 * The feature id for the '<em><b>Changeable Yes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES_TEST__CHANGEABLE_YES = MULTIPLE_SUPER_TEST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Changeable No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES_TEST__CHANGEABLE_NO = MULTIPLE_SUPER_TEST_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES_TEST__DEFAULT_VALUE = MULTIPLE_SUPER_TEST_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Derived Yes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES_TEST__DERIVED_YES = MULTIPLE_SUPER_TEST_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Derived No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES_TEST__DERIVED_NO = MULTIPLE_SUPER_TEST_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Id Yes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES_TEST__ID_YES = MULTIPLE_SUPER_TEST_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Id No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES_TEST__ID_NO = MULTIPLE_SUPER_TEST_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Lower Bound0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES_TEST__LOWER_BOUND0 = MULTIPLE_SUPER_TEST_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Lower Bound1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES_TEST__LOWER_BOUND1 = MULTIPLE_SUPER_TEST_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Lower Bound2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES_TEST__LOWER_BOUND2 = MULTIPLE_SUPER_TEST_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Lower Bound N</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES_TEST__LOWER_BOUND_N = MULTIPLE_SUPER_TEST_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Upper Bound0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES_TEST__UPPER_BOUND0 = MULTIPLE_SUPER_TEST_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Upper Bound1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES_TEST__UPPER_BOUND1 = MULTIPLE_SUPER_TEST_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Upper Bound2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES_TEST__UPPER_BOUND2 = MULTIPLE_SUPER_TEST_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Upper Bound N</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES_TEST__UPPER_BOUND_N = MULTIPLE_SUPER_TEST_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Ordered Yes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES_TEST__ORDERED_YES = MULTIPLE_SUPER_TEST_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Orderened No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES_TEST__ORDERENED_NO = MULTIPLE_SUPER_TEST_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Transient Yes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES_TEST__TRANSIENT_YES = MULTIPLE_SUPER_TEST_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Transient No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES_TEST__TRANSIENT_NO = MULTIPLE_SUPER_TEST_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Unique Yes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES_TEST__UNIQUE_YES = MULTIPLE_SUPER_TEST_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Unique No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES_TEST__UNIQUE_NO = MULTIPLE_SUPER_TEST_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Unsettable Yes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES_TEST__UNSETTABLE_YES = MULTIPLE_SUPER_TEST_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Unsettable No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES_TEST__UNSETTABLE_NO = MULTIPLE_SUPER_TEST_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Volatile Yes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES_TEST__VOLATILE_YES = MULTIPLE_SUPER_TEST_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Volatile No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES_TEST__VOLATILE_NO = MULTIPLE_SUPER_TEST_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Opposite2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES_TEST__OPPOSITE2 = MULTIPLE_SUPER_TEST_FEATURE_COUNT + 25;

	/**
	 * The number of structural features of the '<em>Attributes Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES_TEST_FEATURE_COUNT = MULTIPLE_SUPER_TEST_FEATURE_COUNT + 26;

	/**
	 * The operation id for the '<em>Empty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES_TEST___EMPTY = MULTIPLE_SUPER_TEST___EMPTY;

	/**
	 * The operation id for the '<em>Lower Bound1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES_TEST___LOWER_BOUND1 = MULTIPLE_SUPER_TEST___LOWER_BOUND1;

	/**
	 * The operation id for the '<em>Lower Bound2</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES_TEST___LOWER_BOUND2 = MULTIPLE_SUPER_TEST___LOWER_BOUND2;

	/**
	 * The operation id for the '<em>Ordered No</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES_TEST___ORDERED_NO = MULTIPLE_SUPER_TEST___ORDERED_NO;

	/**
	 * The operation id for the '<em>Unique No</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES_TEST___UNIQUE_NO = MULTIPLE_SUPER_TEST___UNIQUE_NO;

	/**
	 * The operation id for the '<em>Upper Bound2</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES_TEST___UPPER_BOUND2 = MULTIPLE_SUPER_TEST___UPPER_BOUND2;

	/**
	 * The operation id for the '<em>Upper Bound N</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES_TEST___UPPER_BOUND_N = MULTIPLE_SUPER_TEST___UPPER_BOUND_N;

	/**
	 * The operation id for the '<em>Many Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES_TEST___MANY_PARAMETERS__ABSTRACTTEST_INT = MULTIPLE_SUPER_TEST___MANY_PARAMETERS__ABSTRACTTEST_INT;

	/**
	 * The number of operations of the '<em>Attributes Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES_TEST_OPERATION_COUNT = MULTIPLE_SUPER_TEST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link exhaustive.impl.GenericTestImpl <em>Generic Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see exhaustive.impl.GenericTestImpl
	 * @see exhaustive.impl.ExhaustivePackageImpl#getGenericTest()
	 * @generated
	 */
	int GENERIC_TEST = 6;

	/**
	 * The feature id for the '<em><b>Generic Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TEST__GENERIC_ATTR = 0;

	/**
	 * The number of structural features of the '<em>Generic Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TEST_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Generic Operation Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TEST___GENERIC_OPERATION_RETURN = 0;

	/**
	 * The operation id for the '<em>Generic Operation Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TEST___GENERIC_OPERATION_PARAMETERS = 1;

	/**
	 * The operation id for the '<em>Generic Operation Throw</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TEST___GENERIC_OPERATION_THROW = 2;

	/**
	 * The number of operations of the '<em>Generic Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TEST_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link exhaustive.impl.GenericChildTestImpl <em>Generic Child Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see exhaustive.impl.GenericChildTestImpl
	 * @see exhaustive.impl.ExhaustivePackageImpl#getGenericChildTest()
	 * @generated
	 */
	int GENERIC_CHILD_TEST = 7;

	/**
	 * The feature id for the '<em><b>Generic Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CHILD_TEST__GENERIC_ATTR = GENERIC_TEST__GENERIC_ATTR;

	/**
	 * The number of structural features of the '<em>Generic Child Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CHILD_TEST_FEATURE_COUNT = GENERIC_TEST_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Generic Operation Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CHILD_TEST___GENERIC_OPERATION_RETURN = GENERIC_TEST___GENERIC_OPERATION_RETURN;

	/**
	 * The operation id for the '<em>Generic Operation Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CHILD_TEST___GENERIC_OPERATION_PARAMETERS = GENERIC_TEST___GENERIC_OPERATION_PARAMETERS;

	/**
	 * The operation id for the '<em>Generic Operation Throw</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CHILD_TEST___GENERIC_OPERATION_THROW = GENERIC_TEST___GENERIC_OPERATION_THROW;

	/**
	 * The number of operations of the '<em>Generic Child Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CHILD_TEST_OPERATION_COUNT = GENERIC_TEST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link exhaustive.UnserializableEnumTest <em>Unserializable Enum Test</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see exhaustive.UnserializableEnumTest
	 * @see exhaustive.impl.ExhaustivePackageImpl#getUnserializableEnumTest()
	 * @generated
	 */
	int UNSERIALIZABLE_ENUM_TEST = 8;

	/**
	 * The meta object id for the '{@link exhaustive.SerializableEnumTest <em>Serializable Enum Test</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see exhaustive.SerializableEnumTest
	 * @see exhaustive.impl.ExhaustivePackageImpl#getSerializableEnumTest()
	 * @generated
	 */
	int SERIALIZABLE_ENUM_TEST = 9;

	/**
	 * The meta object id for the '<em>Unserializable Datatype Test</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see exhaustive.impl.ExhaustivePackageImpl#getUnserializableDatatypeTest()
	 * @generated
	 */
	int UNSERIALIZABLE_DATATYPE_TEST = 10;

	/**
	 * The meta object id for the '<em>Serializable Datatype Test</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see exhaustive.impl.ExhaustivePackageImpl#getSerializableDatatypeTest()
	 * @generated
	 */
	int SERIALIZABLE_DATATYPE_TEST = 11;

	/**
	 * The meta object id for the '<em>Custom Exception Test</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Exception
	 * @see exhaustive.impl.ExhaustivePackageImpl#getCustomExceptionTest()
	 * @generated
	 */
	int CUSTOM_EXCEPTION_TEST = 12;


	/**
	 * Returns the meta object for class '{@link exhaustive.AbstractTest <em>Abstract Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Test</em>'.
	 * @see exhaustive.AbstractTest
	 * @generated
	 */
	EClass getAbstractTest();

	/**
	 * Returns the meta object for class '{@link exhaustive.InterfaceTest <em>Interface Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Test</em>'.
	 * @see exhaustive.InterfaceTest
	 * @generated
	 */
	EClass getInterfaceTest();

	/**
	 * Returns the meta object for class '{@link exhaustive.MultipleSuperTest <em>Multiple Super Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiple Super Test</em>'.
	 * @see exhaustive.MultipleSuperTest
	 * @generated
	 */
	EClass getMultipleSuperTest();

	/**
	 * Returns the meta object for class '{@link exhaustive.ReferencesTest <em>References Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>References Test</em>'.
	 * @see exhaustive.ReferencesTest
	 * @generated
	 */
	EClass getReferencesTest();

	/**
	 * Returns the meta object for the reference '{@link exhaustive.ReferencesTest#getChangeableYes <em>Changeable Yes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Changeable Yes</em>'.
	 * @see exhaustive.ReferencesTest#getChangeableYes()
	 * @see #getReferencesTest()
	 * @generated
	 */
	EReference getReferencesTest_ChangeableYes();

	/**
	 * Returns the meta object for the reference '{@link exhaustive.ReferencesTest#getChangeableNo <em>Changeable No</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Changeable No</em>'.
	 * @see exhaustive.ReferencesTest#getChangeableNo()
	 * @see #getReferencesTest()
	 * @generated
	 */
	EReference getReferencesTest_ChangeableNo();

	/**
	 * Returns the meta object for the containment reference '{@link exhaustive.ReferencesTest#getContainmentYes <em>Containment Yes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Containment Yes</em>'.
	 * @see exhaustive.ReferencesTest#getContainmentYes()
	 * @see #getReferencesTest()
	 * @generated
	 */
	EReference getReferencesTest_ContainmentYes();

	/**
	 * Returns the meta object for the reference '{@link exhaustive.ReferencesTest#getReferenceToGenerics <em>Reference To Generics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference To Generics</em>'.
	 * @see exhaustive.ReferencesTest#getReferenceToGenerics()
	 * @see #getReferencesTest()
	 * @generated
	 */
	EReference getReferencesTest_ReferenceToGenerics();

	/**
	 * Returns the meta object for the reference '{@link exhaustive.ReferencesTest#getOpposite1 <em>Opposite1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Opposite1</em>'.
	 * @see exhaustive.ReferencesTest#getOpposite1()
	 * @see #getReferencesTest()
	 * @generated
	 */
	EReference getReferencesTest_Opposite1();

	/**
	 * Returns the meta object for the reference '{@link exhaustive.ReferencesTest#getOrderedFalse <em>Ordered False</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ordered False</em>'.
	 * @see exhaustive.ReferencesTest#getOrderedFalse()
	 * @see #getReferencesTest()
	 * @generated
	 */
	EReference getReferencesTest_OrderedFalse();

	/**
	 * Returns the meta object for the reference '{@link exhaustive.ReferencesTest#getResolveProxiesFalse <em>Resolve Proxies False</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resolve Proxies False</em>'.
	 * @see exhaustive.ReferencesTest#getResolveProxiesFalse()
	 * @see #getReferencesTest()
	 * @generated
	 */
	EReference getReferencesTest_ResolveProxiesFalse();

	/**
	 * Returns the meta object for the reference '{@link exhaustive.ReferencesTest#getTransientTrue <em>Transient True</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transient True</em>'.
	 * @see exhaustive.ReferencesTest#getTransientTrue()
	 * @see #getReferencesTest()
	 * @generated
	 */
	EReference getReferencesTest_TransientTrue();

	/**
	 * Returns the meta object for the reference '{@link exhaustive.ReferencesTest#getUniqueFalse <em>Unique False</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Unique False</em>'.
	 * @see exhaustive.ReferencesTest#getUniqueFalse()
	 * @see #getReferencesTest()
	 * @generated
	 */
	EReference getReferencesTest_UniqueFalse();

	/**
	 * Returns the meta object for the reference '{@link exhaustive.ReferencesTest#getUnsettableTrue <em>Unsettable True</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Unsettable True</em>'.
	 * @see exhaustive.ReferencesTest#getUnsettableTrue()
	 * @see #getReferencesTest()
	 * @generated
	 */
	EReference getReferencesTest_UnsettableTrue();

	/**
	 * Returns the meta object for the reference '{@link exhaustive.ReferencesTest#getVolatileTrue <em>Volatile True</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Volatile True</em>'.
	 * @see exhaustive.ReferencesTest#getVolatileTrue()
	 * @see #getReferencesTest()
	 * @generated
	 */
	EReference getReferencesTest_VolatileTrue();

	/**
	 * Returns the meta object for the reference '{@link exhaustive.ReferencesTest#getDerivedYes <em>Derived Yes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Derived Yes</em>'.
	 * @see exhaustive.ReferencesTest#getDerivedYes()
	 * @see #getReferencesTest()
	 * @generated
	 */
	EReference getReferencesTest_DerivedYes();

	/**
	 * Returns the meta object for the reference list '{@link exhaustive.ReferencesTest#getUpperBoundN <em>Upper Bound N</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Upper Bound N</em>'.
	 * @see exhaustive.ReferencesTest#getUpperBoundN()
	 * @see #getReferencesTest()
	 * @generated
	 */
	EReference getReferencesTest_UpperBoundN();

	/**
	 * Returns the meta object for the reference list '{@link exhaustive.ReferencesTest#getUpperBound2 <em>Upper Bound2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Upper Bound2</em>'.
	 * @see exhaustive.ReferencesTest#getUpperBound2()
	 * @see #getReferencesTest()
	 * @generated
	 */
	EReference getReferencesTest_UpperBound2();

	/**
	 * Returns the meta object for the reference '{@link exhaustive.ReferencesTest#getLowerBound1 <em>Lower Bound1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lower Bound1</em>'.
	 * @see exhaustive.ReferencesTest#getLowerBound1()
	 * @see #getReferencesTest()
	 * @generated
	 */
	EReference getReferencesTest_LowerBound1();

	/**
	 * Returns the meta object for the reference list '{@link exhaustive.ReferencesTest#getLowerBound2 <em>Lower Bound2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lower Bound2</em>'.
	 * @see exhaustive.ReferencesTest#getLowerBound2()
	 * @see #getReferencesTest()
	 * @generated
	 */
	EReference getReferencesTest_LowerBound2();

	/**
	 * Returns the meta object for class '{@link exhaustive.AttributesTest <em>Attributes Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attributes Test</em>'.
	 * @see exhaustive.AttributesTest
	 * @generated
	 */
	EClass getAttributesTest();

	/**
	 * Returns the meta object for the attribute '{@link exhaustive.AttributesTest#getChangeableYes <em>Changeable Yes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Changeable Yes</em>'.
	 * @see exhaustive.AttributesTest#getChangeableYes()
	 * @see #getAttributesTest()
	 * @generated
	 */
	EAttribute getAttributesTest_ChangeableYes();

	/**
	 * Returns the meta object for the attribute '{@link exhaustive.AttributesTest#getChangeableNo <em>Changeable No</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Changeable No</em>'.
	 * @see exhaustive.AttributesTest#getChangeableNo()
	 * @see #getAttributesTest()
	 * @generated
	 */
	EAttribute getAttributesTest_ChangeableNo();

	/**
	 * Returns the meta object for the attribute '{@link exhaustive.AttributesTest#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see exhaustive.AttributesTest#getDefaultValue()
	 * @see #getAttributesTest()
	 * @generated
	 */
	EAttribute getAttributesTest_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link exhaustive.AttributesTest#getDerivedYes <em>Derived Yes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Derived Yes</em>'.
	 * @see exhaustive.AttributesTest#getDerivedYes()
	 * @see #getAttributesTest()
	 * @generated
	 */
	EAttribute getAttributesTest_DerivedYes();

	/**
	 * Returns the meta object for the attribute '{@link exhaustive.AttributesTest#getDerivedNo <em>Derived No</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Derived No</em>'.
	 * @see exhaustive.AttributesTest#getDerivedNo()
	 * @see #getAttributesTest()
	 * @generated
	 */
	EAttribute getAttributesTest_DerivedNo();

	/**
	 * Returns the meta object for the attribute '{@link exhaustive.AttributesTest#getIdYes <em>Id Yes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Yes</em>'.
	 * @see exhaustive.AttributesTest#getIdYes()
	 * @see #getAttributesTest()
	 * @generated
	 */
	EAttribute getAttributesTest_IdYes();

	/**
	 * Returns the meta object for the attribute '{@link exhaustive.AttributesTest#getIdNo <em>Id No</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id No</em>'.
	 * @see exhaustive.AttributesTest#getIdNo()
	 * @see #getAttributesTest()
	 * @generated
	 */
	EAttribute getAttributesTest_IdNo();

	/**
	 * Returns the meta object for the attribute '{@link exhaustive.AttributesTest#getLowerBound0 <em>Lower Bound0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound0</em>'.
	 * @see exhaustive.AttributesTest#getLowerBound0()
	 * @see #getAttributesTest()
	 * @generated
	 */
	EAttribute getAttributesTest_LowerBound0();

	/**
	 * Returns the meta object for the attribute '{@link exhaustive.AttributesTest#getLowerBound1 <em>Lower Bound1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound1</em>'.
	 * @see exhaustive.AttributesTest#getLowerBound1()
	 * @see #getAttributesTest()
	 * @generated
	 */
	EAttribute getAttributesTest_LowerBound1();

	/**
	 * Returns the meta object for the attribute '{@link exhaustive.AttributesTest#getLowerBound2 <em>Lower Bound2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound2</em>'.
	 * @see exhaustive.AttributesTest#getLowerBound2()
	 * @see #getAttributesTest()
	 * @generated
	 */
	EAttribute getAttributesTest_LowerBound2();

	/**
	 * Returns the meta object for the attribute '{@link exhaustive.AttributesTest#getLowerBoundN <em>Lower Bound N</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound N</em>'.
	 * @see exhaustive.AttributesTest#getLowerBoundN()
	 * @see #getAttributesTest()
	 * @generated
	 */
	EAttribute getAttributesTest_LowerBoundN();

	/**
	 * Returns the meta object for the attribute '{@link exhaustive.AttributesTest#getUpperBound0 <em>Upper Bound0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound0</em>'.
	 * @see exhaustive.AttributesTest#getUpperBound0()
	 * @see #getAttributesTest()
	 * @generated
	 */
	EAttribute getAttributesTest_UpperBound0();

	/**
	 * Returns the meta object for the attribute '{@link exhaustive.AttributesTest#getUpperBound1 <em>Upper Bound1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound1</em>'.
	 * @see exhaustive.AttributesTest#getUpperBound1()
	 * @see #getAttributesTest()
	 * @generated
	 */
	EAttribute getAttributesTest_UpperBound1();

	/**
	 * Returns the meta object for the attribute '{@link exhaustive.AttributesTest#getUpperBound2 <em>Upper Bound2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound2</em>'.
	 * @see exhaustive.AttributesTest#getUpperBound2()
	 * @see #getAttributesTest()
	 * @generated
	 */
	EAttribute getAttributesTest_UpperBound2();

	/**
	 * Returns the meta object for the attribute '{@link exhaustive.AttributesTest#getUpperBoundN <em>Upper Bound N</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound N</em>'.
	 * @see exhaustive.AttributesTest#getUpperBoundN()
	 * @see #getAttributesTest()
	 * @generated
	 */
	EAttribute getAttributesTest_UpperBoundN();

	/**
	 * Returns the meta object for the attribute '{@link exhaustive.AttributesTest#getOrderedYes <em>Ordered Yes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ordered Yes</em>'.
	 * @see exhaustive.AttributesTest#getOrderedYes()
	 * @see #getAttributesTest()
	 * @generated
	 */
	EAttribute getAttributesTest_OrderedYes();

	/**
	 * Returns the meta object for the attribute '{@link exhaustive.AttributesTest#getOrderenedNo <em>Orderened No</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orderened No</em>'.
	 * @see exhaustive.AttributesTest#getOrderenedNo()
	 * @see #getAttributesTest()
	 * @generated
	 */
	EAttribute getAttributesTest_OrderenedNo();

	/**
	 * Returns the meta object for the attribute '{@link exhaustive.AttributesTest#getTransientYes <em>Transient Yes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transient Yes</em>'.
	 * @see exhaustive.AttributesTest#getTransientYes()
	 * @see #getAttributesTest()
	 * @generated
	 */
	EAttribute getAttributesTest_TransientYes();

	/**
	 * Returns the meta object for the attribute '{@link exhaustive.AttributesTest#getTransientNo <em>Transient No</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transient No</em>'.
	 * @see exhaustive.AttributesTest#getTransientNo()
	 * @see #getAttributesTest()
	 * @generated
	 */
	EAttribute getAttributesTest_TransientNo();

	/**
	 * Returns the meta object for the attribute '{@link exhaustive.AttributesTest#getUniqueYes <em>Unique Yes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique Yes</em>'.
	 * @see exhaustive.AttributesTest#getUniqueYes()
	 * @see #getAttributesTest()
	 * @generated
	 */
	EAttribute getAttributesTest_UniqueYes();

	/**
	 * Returns the meta object for the attribute '{@link exhaustive.AttributesTest#getUniqueNo <em>Unique No</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique No</em>'.
	 * @see exhaustive.AttributesTest#getUniqueNo()
	 * @see #getAttributesTest()
	 * @generated
	 */
	EAttribute getAttributesTest_UniqueNo();

	/**
	 * Returns the meta object for the attribute '{@link exhaustive.AttributesTest#getUnsettableYes <em>Unsettable Yes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unsettable Yes</em>'.
	 * @see exhaustive.AttributesTest#getUnsettableYes()
	 * @see #getAttributesTest()
	 * @generated
	 */
	EAttribute getAttributesTest_UnsettableYes();

	/**
	 * Returns the meta object for the attribute '{@link exhaustive.AttributesTest#getUnsettableNo <em>Unsettable No</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unsettable No</em>'.
	 * @see exhaustive.AttributesTest#getUnsettableNo()
	 * @see #getAttributesTest()
	 * @generated
	 */
	EAttribute getAttributesTest_UnsettableNo();

	/**
	 * Returns the meta object for the attribute '{@link exhaustive.AttributesTest#getVolatileYes <em>Volatile Yes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volatile Yes</em>'.
	 * @see exhaustive.AttributesTest#getVolatileYes()
	 * @see #getAttributesTest()
	 * @generated
	 */
	EAttribute getAttributesTest_VolatileYes();

	/**
	 * Returns the meta object for the attribute '{@link exhaustive.AttributesTest#getVolatileNo <em>Volatile No</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volatile No</em>'.
	 * @see exhaustive.AttributesTest#getVolatileNo()
	 * @see #getAttributesTest()
	 * @generated
	 */
	EAttribute getAttributesTest_VolatileNo();

	/**
	 * Returns the meta object for the reference '{@link exhaustive.AttributesTest#getOpposite2 <em>Opposite2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Opposite2</em>'.
	 * @see exhaustive.AttributesTest#getOpposite2()
	 * @see #getAttributesTest()
	 * @generated
	 */
	EReference getAttributesTest_Opposite2();

	/**
	 * Returns the meta object for class '{@link exhaustive.OperationsTest <em>Operations Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operations Test</em>'.
	 * @see exhaustive.OperationsTest
	 * @generated
	 */
	EClass getOperationsTest();

	/**
	 * Returns the meta object for the '{@link exhaustive.OperationsTest#empty() <em>Empty</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Empty</em>' operation.
	 * @see exhaustive.OperationsTest#empty()
	 * @generated
	 */
	EOperation getOperationsTest__Empty();

	/**
	 * Returns the meta object for the '{@link exhaustive.OperationsTest#lowerBound1() <em>Lower Bound1</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Lower Bound1</em>' operation.
	 * @see exhaustive.OperationsTest#lowerBound1()
	 * @generated
	 */
	EOperation getOperationsTest__LowerBound1();

	/**
	 * Returns the meta object for the '{@link exhaustive.OperationsTest#lowerBound2() <em>Lower Bound2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Lower Bound2</em>' operation.
	 * @see exhaustive.OperationsTest#lowerBound2()
	 * @generated
	 */
	EOperation getOperationsTest__LowerBound2();

	/**
	 * Returns the meta object for the '{@link exhaustive.OperationsTest#orderedNo() <em>Ordered No</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Ordered No</em>' operation.
	 * @see exhaustive.OperationsTest#orderedNo()
	 * @generated
	 */
	EOperation getOperationsTest__OrderedNo();

	/**
	 * Returns the meta object for the '{@link exhaustive.OperationsTest#uniqueNo() <em>Unique No</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique No</em>' operation.
	 * @see exhaustive.OperationsTest#uniqueNo()
	 * @generated
	 */
	EOperation getOperationsTest__UniqueNo();

	/**
	 * Returns the meta object for the '{@link exhaustive.OperationsTest#upperBound2() <em>Upper Bound2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Upper Bound2</em>' operation.
	 * @see exhaustive.OperationsTest#upperBound2()
	 * @generated
	 */
	EOperation getOperationsTest__UpperBound2();

	/**
	 * Returns the meta object for the '{@link exhaustive.OperationsTest#upperBoundN() <em>Upper Bound N</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Upper Bound N</em>' operation.
	 * @see exhaustive.OperationsTest#upperBoundN()
	 * @generated
	 */
	EOperation getOperationsTest__UpperBoundN();

	/**
	 * Returns the meta object for the '{@link exhaustive.OperationsTest#manyParameters(exhaustive.AbstractTest, int) <em>Many Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Many Parameters</em>' operation.
	 * @see exhaustive.OperationsTest#manyParameters(exhaustive.AbstractTest, int)
	 * @generated
	 */
	EOperation getOperationsTest__ManyParameters__AbstractTest_int();

	/**
	 * Returns the meta object for class '{@link exhaustive.GenericTest <em>Generic Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Test</em>'.
	 * @see exhaustive.GenericTest
	 * @generated
	 */
	EClass getGenericTest();

	/**
	 * Returns the meta object for the attribute '{@link exhaustive.GenericTest#getGenericAttr <em>Generic Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generic Attr</em>'.
	 * @see exhaustive.GenericTest#getGenericAttr()
	 * @see #getGenericTest()
	 * @generated
	 */
	EAttribute getGenericTest_GenericAttr();

	/**
	 * Returns the meta object for the '{@link exhaustive.GenericTest#genericOperationReturn() <em>Generic Operation Return</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generic Operation Return</em>' operation.
	 * @see exhaustive.GenericTest#genericOperationReturn()
	 * @generated
	 */
	EOperation getGenericTest__GenericOperationReturn();

	/**
	 * Returns the meta object for the '{@link exhaustive.GenericTest#genericOperationParameters() <em>Generic Operation Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generic Operation Parameters</em>' operation.
	 * @see exhaustive.GenericTest#genericOperationParameters()
	 * @generated
	 */
	EOperation getGenericTest__GenericOperationParameters();

	/**
	 * Returns the meta object for the '{@link exhaustive.GenericTest#genericOperationThrow() <em>Generic Operation Throw</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generic Operation Throw</em>' operation.
	 * @see exhaustive.GenericTest#genericOperationThrow()
	 * @generated
	 */
	EOperation getGenericTest__GenericOperationThrow();

	/**
	 * Returns the meta object for class '{@link exhaustive.GenericChildTest <em>Generic Child Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Child Test</em>'.
	 * @see exhaustive.GenericChildTest
	 * @generated
	 */
	EClass getGenericChildTest();

	/**
	 * Returns the meta object for enum '{@link exhaustive.UnserializableEnumTest <em>Unserializable Enum Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unserializable Enum Test</em>'.
	 * @see exhaustive.UnserializableEnumTest
	 * @generated
	 */
	EEnum getUnserializableEnumTest();

	/**
	 * Returns the meta object for enum '{@link exhaustive.SerializableEnumTest <em>Serializable Enum Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Serializable Enum Test</em>'.
	 * @see exhaustive.SerializableEnumTest
	 * @generated
	 */
	EEnum getSerializableEnumTest();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>Unserializable Datatype Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Unserializable Datatype Test</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer" serializeable="false"
	 * @generated
	 */
	EDataType getUnserializableDatatypeTest();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Serializable Datatype Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Serializable Datatype Test</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getSerializableDatatypeTest();

	/**
	 * Returns the meta object for data type '{@link java.lang.Exception <em>Custom Exception Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Custom Exception Test</em>'.
	 * @see java.lang.Exception
	 * @model instanceClass="java.lang.Exception"
	 * @generated
	 */
	EDataType getCustomExceptionTest();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExhaustiveFactory getExhaustiveFactory();

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
		 * The meta object literal for the '{@link exhaustive.impl.AbstractTestImpl <em>Abstract Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see exhaustive.impl.AbstractTestImpl
		 * @see exhaustive.impl.ExhaustivePackageImpl#getAbstractTest()
		 * @generated
		 */
		EClass ABSTRACT_TEST = eINSTANCE.getAbstractTest();

		/**
		 * The meta object literal for the '{@link exhaustive.InterfaceTest <em>Interface Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see exhaustive.InterfaceTest
		 * @see exhaustive.impl.ExhaustivePackageImpl#getInterfaceTest()
		 * @generated
		 */
		EClass INTERFACE_TEST = eINSTANCE.getInterfaceTest();

		/**
		 * The meta object literal for the '{@link exhaustive.impl.MultipleSuperTestImpl <em>Multiple Super Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see exhaustive.impl.MultipleSuperTestImpl
		 * @see exhaustive.impl.ExhaustivePackageImpl#getMultipleSuperTest()
		 * @generated
		 */
		EClass MULTIPLE_SUPER_TEST = eINSTANCE.getMultipleSuperTest();

		/**
		 * The meta object literal for the '{@link exhaustive.impl.ReferencesTestImpl <em>References Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see exhaustive.impl.ReferencesTestImpl
		 * @see exhaustive.impl.ExhaustivePackageImpl#getReferencesTest()
		 * @generated
		 */
		EClass REFERENCES_TEST = eINSTANCE.getReferencesTest();

		/**
		 * The meta object literal for the '<em><b>Changeable Yes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCES_TEST__CHANGEABLE_YES = eINSTANCE.getReferencesTest_ChangeableYes();

		/**
		 * The meta object literal for the '<em><b>Changeable No</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCES_TEST__CHANGEABLE_NO = eINSTANCE.getReferencesTest_ChangeableNo();

		/**
		 * The meta object literal for the '<em><b>Containment Yes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCES_TEST__CONTAINMENT_YES = eINSTANCE.getReferencesTest_ContainmentYes();

		/**
		 * The meta object literal for the '<em><b>Reference To Generics</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCES_TEST__REFERENCE_TO_GENERICS = eINSTANCE.getReferencesTest_ReferenceToGenerics();

		/**
		 * The meta object literal for the '<em><b>Opposite1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCES_TEST__OPPOSITE1 = eINSTANCE.getReferencesTest_Opposite1();

		/**
		 * The meta object literal for the '<em><b>Ordered False</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCES_TEST__ORDERED_FALSE = eINSTANCE.getReferencesTest_OrderedFalse();

		/**
		 * The meta object literal for the '<em><b>Resolve Proxies False</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCES_TEST__RESOLVE_PROXIES_FALSE = eINSTANCE.getReferencesTest_ResolveProxiesFalse();

		/**
		 * The meta object literal for the '<em><b>Transient True</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCES_TEST__TRANSIENT_TRUE = eINSTANCE.getReferencesTest_TransientTrue();

		/**
		 * The meta object literal for the '<em><b>Unique False</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCES_TEST__UNIQUE_FALSE = eINSTANCE.getReferencesTest_UniqueFalse();

		/**
		 * The meta object literal for the '<em><b>Unsettable True</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCES_TEST__UNSETTABLE_TRUE = eINSTANCE.getReferencesTest_UnsettableTrue();

		/**
		 * The meta object literal for the '<em><b>Volatile True</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCES_TEST__VOLATILE_TRUE = eINSTANCE.getReferencesTest_VolatileTrue();

		/**
		 * The meta object literal for the '<em><b>Derived Yes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCES_TEST__DERIVED_YES = eINSTANCE.getReferencesTest_DerivedYes();

		/**
		 * The meta object literal for the '<em><b>Upper Bound N</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCES_TEST__UPPER_BOUND_N = eINSTANCE.getReferencesTest_UpperBoundN();

		/**
		 * The meta object literal for the '<em><b>Upper Bound2</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCES_TEST__UPPER_BOUND2 = eINSTANCE.getReferencesTest_UpperBound2();

		/**
		 * The meta object literal for the '<em><b>Lower Bound1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCES_TEST__LOWER_BOUND1 = eINSTANCE.getReferencesTest_LowerBound1();

		/**
		 * The meta object literal for the '<em><b>Lower Bound2</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCES_TEST__LOWER_BOUND2 = eINSTANCE.getReferencesTest_LowerBound2();

		/**
		 * The meta object literal for the '{@link exhaustive.impl.AttributesTestImpl <em>Attributes Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see exhaustive.impl.AttributesTestImpl
		 * @see exhaustive.impl.ExhaustivePackageImpl#getAttributesTest()
		 * @generated
		 */
		EClass ATTRIBUTES_TEST = eINSTANCE.getAttributesTest();

		/**
		 * The meta object literal for the '<em><b>Changeable Yes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTES_TEST__CHANGEABLE_YES = eINSTANCE.getAttributesTest_ChangeableYes();

		/**
		 * The meta object literal for the '<em><b>Changeable No</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTES_TEST__CHANGEABLE_NO = eINSTANCE.getAttributesTest_ChangeableNo();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTES_TEST__DEFAULT_VALUE = eINSTANCE.getAttributesTest_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Derived Yes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTES_TEST__DERIVED_YES = eINSTANCE.getAttributesTest_DerivedYes();

		/**
		 * The meta object literal for the '<em><b>Derived No</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTES_TEST__DERIVED_NO = eINSTANCE.getAttributesTest_DerivedNo();

		/**
		 * The meta object literal for the '<em><b>Id Yes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTES_TEST__ID_YES = eINSTANCE.getAttributesTest_IdYes();

		/**
		 * The meta object literal for the '<em><b>Id No</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTES_TEST__ID_NO = eINSTANCE.getAttributesTest_IdNo();

		/**
		 * The meta object literal for the '<em><b>Lower Bound0</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTES_TEST__LOWER_BOUND0 = eINSTANCE.getAttributesTest_LowerBound0();

		/**
		 * The meta object literal for the '<em><b>Lower Bound1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTES_TEST__LOWER_BOUND1 = eINSTANCE.getAttributesTest_LowerBound1();

		/**
		 * The meta object literal for the '<em><b>Lower Bound2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTES_TEST__LOWER_BOUND2 = eINSTANCE.getAttributesTest_LowerBound2();

		/**
		 * The meta object literal for the '<em><b>Lower Bound N</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTES_TEST__LOWER_BOUND_N = eINSTANCE.getAttributesTest_LowerBoundN();

		/**
		 * The meta object literal for the '<em><b>Upper Bound0</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTES_TEST__UPPER_BOUND0 = eINSTANCE.getAttributesTest_UpperBound0();

		/**
		 * The meta object literal for the '<em><b>Upper Bound1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTES_TEST__UPPER_BOUND1 = eINSTANCE.getAttributesTest_UpperBound1();

		/**
		 * The meta object literal for the '<em><b>Upper Bound2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTES_TEST__UPPER_BOUND2 = eINSTANCE.getAttributesTest_UpperBound2();

		/**
		 * The meta object literal for the '<em><b>Upper Bound N</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTES_TEST__UPPER_BOUND_N = eINSTANCE.getAttributesTest_UpperBoundN();

		/**
		 * The meta object literal for the '<em><b>Ordered Yes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTES_TEST__ORDERED_YES = eINSTANCE.getAttributesTest_OrderedYes();

		/**
		 * The meta object literal for the '<em><b>Orderened No</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTES_TEST__ORDERENED_NO = eINSTANCE.getAttributesTest_OrderenedNo();

		/**
		 * The meta object literal for the '<em><b>Transient Yes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTES_TEST__TRANSIENT_YES = eINSTANCE.getAttributesTest_TransientYes();

		/**
		 * The meta object literal for the '<em><b>Transient No</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTES_TEST__TRANSIENT_NO = eINSTANCE.getAttributesTest_TransientNo();

		/**
		 * The meta object literal for the '<em><b>Unique Yes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTES_TEST__UNIQUE_YES = eINSTANCE.getAttributesTest_UniqueYes();

		/**
		 * The meta object literal for the '<em><b>Unique No</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTES_TEST__UNIQUE_NO = eINSTANCE.getAttributesTest_UniqueNo();

		/**
		 * The meta object literal for the '<em><b>Unsettable Yes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTES_TEST__UNSETTABLE_YES = eINSTANCE.getAttributesTest_UnsettableYes();

		/**
		 * The meta object literal for the '<em><b>Unsettable No</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTES_TEST__UNSETTABLE_NO = eINSTANCE.getAttributesTest_UnsettableNo();

		/**
		 * The meta object literal for the '<em><b>Volatile Yes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTES_TEST__VOLATILE_YES = eINSTANCE.getAttributesTest_VolatileYes();

		/**
		 * The meta object literal for the '<em><b>Volatile No</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTES_TEST__VOLATILE_NO = eINSTANCE.getAttributesTest_VolatileNo();

		/**
		 * The meta object literal for the '<em><b>Opposite2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTES_TEST__OPPOSITE2 = eINSTANCE.getAttributesTest_Opposite2();

		/**
		 * The meta object literal for the '{@link exhaustive.impl.OperationsTestImpl <em>Operations Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see exhaustive.impl.OperationsTestImpl
		 * @see exhaustive.impl.ExhaustivePackageImpl#getOperationsTest()
		 * @generated
		 */
		EClass OPERATIONS_TEST = eINSTANCE.getOperationsTest();

		/**
		 * The meta object literal for the '<em><b>Empty</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPERATIONS_TEST___EMPTY = eINSTANCE.getOperationsTest__Empty();

		/**
		 * The meta object literal for the '<em><b>Lower Bound1</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPERATIONS_TEST___LOWER_BOUND1 = eINSTANCE.getOperationsTest__LowerBound1();

		/**
		 * The meta object literal for the '<em><b>Lower Bound2</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPERATIONS_TEST___LOWER_BOUND2 = eINSTANCE.getOperationsTest__LowerBound2();

		/**
		 * The meta object literal for the '<em><b>Ordered No</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPERATIONS_TEST___ORDERED_NO = eINSTANCE.getOperationsTest__OrderedNo();

		/**
		 * The meta object literal for the '<em><b>Unique No</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPERATIONS_TEST___UNIQUE_NO = eINSTANCE.getOperationsTest__UniqueNo();

		/**
		 * The meta object literal for the '<em><b>Upper Bound2</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPERATIONS_TEST___UPPER_BOUND2 = eINSTANCE.getOperationsTest__UpperBound2();

		/**
		 * The meta object literal for the '<em><b>Upper Bound N</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPERATIONS_TEST___UPPER_BOUND_N = eINSTANCE.getOperationsTest__UpperBoundN();

		/**
		 * The meta object literal for the '<em><b>Many Parameters</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPERATIONS_TEST___MANY_PARAMETERS__ABSTRACTTEST_INT = eINSTANCE.getOperationsTest__ManyParameters__AbstractTest_int();

		/**
		 * The meta object literal for the '{@link exhaustive.impl.GenericTestImpl <em>Generic Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see exhaustive.impl.GenericTestImpl
		 * @see exhaustive.impl.ExhaustivePackageImpl#getGenericTest()
		 * @generated
		 */
		EClass GENERIC_TEST = eINSTANCE.getGenericTest();

		/**
		 * The meta object literal for the '<em><b>Generic Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_TEST__GENERIC_ATTR = eINSTANCE.getGenericTest_GenericAttr();

		/**
		 * The meta object literal for the '<em><b>Generic Operation Return</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GENERIC_TEST___GENERIC_OPERATION_RETURN = eINSTANCE.getGenericTest__GenericOperationReturn();

		/**
		 * The meta object literal for the '<em><b>Generic Operation Parameters</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GENERIC_TEST___GENERIC_OPERATION_PARAMETERS = eINSTANCE.getGenericTest__GenericOperationParameters();

		/**
		 * The meta object literal for the '<em><b>Generic Operation Throw</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GENERIC_TEST___GENERIC_OPERATION_THROW = eINSTANCE.getGenericTest__GenericOperationThrow();

		/**
		 * The meta object literal for the '{@link exhaustive.impl.GenericChildTestImpl <em>Generic Child Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see exhaustive.impl.GenericChildTestImpl
		 * @see exhaustive.impl.ExhaustivePackageImpl#getGenericChildTest()
		 * @generated
		 */
		EClass GENERIC_CHILD_TEST = eINSTANCE.getGenericChildTest();

		/**
		 * The meta object literal for the '{@link exhaustive.UnserializableEnumTest <em>Unserializable Enum Test</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see exhaustive.UnserializableEnumTest
		 * @see exhaustive.impl.ExhaustivePackageImpl#getUnserializableEnumTest()
		 * @generated
		 */
		EEnum UNSERIALIZABLE_ENUM_TEST = eINSTANCE.getUnserializableEnumTest();

		/**
		 * The meta object literal for the '{@link exhaustive.SerializableEnumTest <em>Serializable Enum Test</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see exhaustive.SerializableEnumTest
		 * @see exhaustive.impl.ExhaustivePackageImpl#getSerializableEnumTest()
		 * @generated
		 */
		EEnum SERIALIZABLE_ENUM_TEST = eINSTANCE.getSerializableEnumTest();

		/**
		 * The meta object literal for the '<em>Unserializable Datatype Test</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see exhaustive.impl.ExhaustivePackageImpl#getUnserializableDatatypeTest()
		 * @generated
		 */
		EDataType UNSERIALIZABLE_DATATYPE_TEST = eINSTANCE.getUnserializableDatatypeTest();

		/**
		 * The meta object literal for the '<em>Serializable Datatype Test</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see exhaustive.impl.ExhaustivePackageImpl#getSerializableDatatypeTest()
		 * @generated
		 */
		EDataType SERIALIZABLE_DATATYPE_TEST = eINSTANCE.getSerializableDatatypeTest();

		/**
		 * The meta object literal for the '<em>Custom Exception Test</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Exception
		 * @see exhaustive.impl.ExhaustivePackageImpl#getCustomExceptionTest()
		 * @generated
		 */
		EDataType CUSTOM_EXCEPTION_TEST = eINSTANCE.getCustomExceptionTest();

	}

} //ExhaustivePackage
