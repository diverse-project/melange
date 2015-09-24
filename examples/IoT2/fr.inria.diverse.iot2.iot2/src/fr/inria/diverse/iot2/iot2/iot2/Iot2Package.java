/**
 */
package fr.inria.diverse.iot2.iot2.iot2;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.inria.diverse.iot2.iot2.iot2.Iot2Factory
 * @model kind="package"
 * @generated
 */
public interface Iot2Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "iot2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://iot2/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "iot2";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Iot2Package eINSTANCE = fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.SystemImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__COMPONENTS = 1;

	/**
	 * The feature id for the '<em><b>Boards</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__BOARDS = 2;

	/**
	 * The feature id for the '<em><b>Sketch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__SKETCH = 3;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.BoardImpl <em>Board</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.BoardImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getBoard()
	 * @generated
	 */
	int BOARD = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__COMPONENTS = 2;

	/**
	 * The number of structural features of the '<em>Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.SketchImpl <em>Sketch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.SketchImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getSketch()
	 * @generated
	 */
	int SKETCH = 2;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH__ACTIVITY = 0;

	/**
	 * The number of structural features of the '<em>Sketch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.HWComponentImpl <em>HW Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.HWComponentImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getHWComponent()
	 * @generated
	 */
	int HW_COMPONENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMPONENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMPONENT__SERVICES = 1;

	/**
	 * The number of structural features of the '<em>HW Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMPONENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.SensorImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__NAME = HW_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__SERVICES = HW_COMPONENT__SERVICES;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = HW_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.ActuatorImpl <em>Actuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.ActuatorImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getActuator()
	 * @generated
	 */
	int ACTUATOR = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__NAME = HW_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__SERVICES = HW_COMPONENT__SERVICES;

	/**
	 * The number of structural features of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_FEATURE_COUNT = HW_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.NamedElementImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 9;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__IDENTIFIER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 1;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.ActivityImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 6;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__IDENTIFIER = NAMED_ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NODES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__EDGES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Locals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__LOCALS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__INPUTS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.ContainedImpl <em>Contained</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.ContainedImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getContained()
	 * @generated
	 */
	int CONTAINED = 8;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED__IDENTIFIER = NAMED_ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Repository Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED__REPOSITORY_ID = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED__VERSION = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Absolute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED__ABSOLUTE_NAME = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Defined In</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED__DEFINED_IN = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Contained</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.OperationDefImpl <em>Operation Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.OperationDefImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getOperationDef()
	 * @generated
	 */
	int OPERATION_DEF = 7;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_DEF__IDENTIFIER = CONTAINED__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_DEF__NAME = CONTAINED__NAME;

	/**
	 * The feature id for the '<em><b>Repository Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_DEF__REPOSITORY_ID = CONTAINED__REPOSITORY_ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_DEF__VERSION = CONTAINED__VERSION;

	/**
	 * The feature id for the '<em><b>Absolute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_DEF__ABSOLUTE_NAME = CONTAINED__ABSOLUTE_NAME;

	/**
	 * The feature id for the '<em><b>Defined In</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_DEF__DEFINED_IN = CONTAINED__DEFINED_IN;

	/**
	 * The feature id for the '<em><b>Contained Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_DEF__CONTAINED_TYPE = CONTAINED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Shared Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_DEF__SHARED_TYPE = CONTAINED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_DEF__PARAMETERS = CONTAINED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Oneway</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_DEF__IS_ONEWAY = CONTAINED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Contexts</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_DEF__CONTEXTS = CONTAINED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Can Raise</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_DEF__CAN_RAISE = CONTAINED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Lua</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_DEF__LUA = CONTAINED_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Operation Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_DEF_FEATURE_COUNT = CONTAINED_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.ContainerImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 10;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__IDENTIFIER = CONTAINED__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__NAME = CONTAINED__NAME;

	/**
	 * The feature id for the '<em><b>Repository Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__REPOSITORY_ID = CONTAINED__REPOSITORY_ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__VERSION = CONTAINED__VERSION;

	/**
	 * The feature id for the '<em><b>Absolute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ABSOLUTE_NAME = CONTAINED__ABSOLUTE_NAME;

	/**
	 * The feature id for the '<em><b>Defined In</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__DEFINED_IN = CONTAINED__DEFINED_IN;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__CONTAINS = CONTAINED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = CONTAINED_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.TypedImpl <em>Typed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.TypedImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getTyped()
	 * @generated
	 */
	int TYPED = 11;

	/**
	 * The feature id for the '<em><b>Contained Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED__CONTAINED_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Shared Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED__SHARED_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Typed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.IDLTypeImpl <em>IDL Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.IDLTypeImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getIDLType()
	 * @generated
	 */
	int IDL_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Type Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_TYPE__TYPE_CODE = 0;

	/**
	 * The number of structural features of the '<em>IDL Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.TypedefDefImpl <em>Typedef Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.TypedefDefImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getTypedefDef()
	 * @generated
	 */
	int TYPEDEF_DEF = 13;

	/**
	 * The feature id for the '<em><b>Type Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPEDEF_DEF__TYPE_CODE = IDL_TYPE__TYPE_CODE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPEDEF_DEF__IDENTIFIER = IDL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPEDEF_DEF__NAME = IDL_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Repository Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPEDEF_DEF__REPOSITORY_ID = IDL_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPEDEF_DEF__VERSION = IDL_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Absolute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPEDEF_DEF__ABSOLUTE_NAME = IDL_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Defined In</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPEDEF_DEF__DEFINED_IN = IDL_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Typedef Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPEDEF_DEF_FEATURE_COUNT = IDL_TYPE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.ParameterDefImpl <em>Parameter Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.ParameterDefImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getParameterDef()
	 * @generated
	 */
	int PARAMETER_DEF = 14;

	/**
	 * The feature id for the '<em><b>Contained Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEF__CONTAINED_TYPE = TYPED__CONTAINED_TYPE;

	/**
	 * The feature id for the '<em><b>Shared Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEF__SHARED_TYPE = TYPED__SHARED_TYPE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEF__IDENTIFIER = TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEF__DIRECTION = TYPED_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parameter Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEF_FEATURE_COUNT = TYPED_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.ExceptionDefImpl <em>Exception Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.ExceptionDefImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getExceptionDef()
	 * @generated
	 */
	int EXCEPTION_DEF = 15;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_DEF__IDENTIFIER = CONTAINED__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_DEF__NAME = CONTAINED__NAME;

	/**
	 * The feature id for the '<em><b>Repository Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_DEF__REPOSITORY_ID = CONTAINED__REPOSITORY_ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_DEF__VERSION = CONTAINED__VERSION;

	/**
	 * The feature id for the '<em><b>Absolute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_DEF__ABSOLUTE_NAME = CONTAINED__ABSOLUTE_NAME;

	/**
	 * The feature id for the '<em><b>Defined In</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_DEF__DEFINED_IN = CONTAINED__DEFINED_IN;

	/**
	 * The feature id for the '<em><b>Type Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_DEF__TYPE_CODE = CONTAINED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_DEF__MEMBERS = CONTAINED_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Exception Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_DEF_FEATURE_COUNT = CONTAINED_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.FieldImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getField()
	 * @generated
	 */
	int FIELD = 16;

	/**
	 * The feature id for the '<em><b>Contained Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__CONTAINED_TYPE = TYPED__CONTAINED_TYPE;

	/**
	 * The feature id for the '<em><b>Shared Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__SHARED_TYPE = TYPED__SHARED_TYPE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__IDENTIFIER = TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__VALUE = TYPED_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = TYPED_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.PrimitiveDefImpl <em>Primitive Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.PrimitiveDefImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getPrimitiveDef()
	 * @generated
	 */
	int PRIMITIVE_DEF = 17;

	/**
	 * The feature id for the '<em><b>Type Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DEF__TYPE_CODE = IDL_TYPE__TYPE_CODE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DEF__KIND = IDL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Primitive Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DEF_FEATURE_COUNT = IDL_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.ChunkImpl <em>Chunk</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.ChunkImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getChunk()
	 * @generated
	 */
	int CHUNK = 18;

	/**
	 * The number of structural features of the '<em>Chunk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.BlockImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 19;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__STATEMENTS = CHUNK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Return Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__RETURN_VALUE = CHUNK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = CHUNK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.LastStatementImpl <em>Last Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.LastStatementImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getLastStatement()
	 * @generated
	 */
	int LAST_STATEMENT = 20;

	/**
	 * The number of structural features of the '<em>Last Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STATEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.LastStatement_ReturnImpl <em>Last Statement Return</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.LastStatement_ReturnImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getLastStatement_Return()
	 * @generated
	 */
	int LAST_STATEMENT_RETURN = 21;

	/**
	 * The number of structural features of the '<em>Last Statement Return</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STATEMENT_RETURN_FEATURE_COUNT = LAST_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.LastStatement_BreakImpl <em>Last Statement Break</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.LastStatement_BreakImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getLastStatement_Break()
	 * @generated
	 */
	int LAST_STATEMENT_BREAK = 22;

	/**
	 * The number of structural features of the '<em>Last Statement Break</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STATEMENT_BREAK_FEATURE_COUNT = LAST_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.StatementImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 23;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Statement_BlockImpl <em>Statement Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Statement_BlockImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getStatement_Block()
	 * @generated
	 */
	int STATEMENT_BLOCK = 24;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_BLOCK__BLOCK = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Statement Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_BLOCK_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Statement_WhileImpl <em>Statement While</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Statement_WhileImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getStatement_While()
	 * @generated
	 */
	int STATEMENT_WHILE = 25;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_WHILE__EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_WHILE__BLOCK = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Statement While</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_WHILE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Statement_RepeatImpl <em>Statement Repeat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Statement_RepeatImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getStatement_Repeat()
	 * @generated
	 */
	int STATEMENT_REPEAT = 26;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_REPEAT__BLOCK = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_REPEAT__EXPRESSION = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Statement Repeat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_REPEAT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Statement_If_Then_ElseImpl <em>Statement If Then Else</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Statement_If_Then_ElseImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getStatement_If_Then_Else()
	 * @generated
	 */
	int STATEMENT_IF_THEN_ELSE = 27;

	/**
	 * The feature id for the '<em><b>If Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_IF_THEN_ELSE__IF_EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>If Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_IF_THEN_ELSE__IF_BLOCK = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else If</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_IF_THEN_ELSE__ELSE_IF = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Else Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_IF_THEN_ELSE__ELSE_BLOCK = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Statement If Then Else</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_IF_THEN_ELSE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Statement_If_Then_Else_ElseIfPartImpl <em>Statement If Then Else Else If Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Statement_If_Then_Else_ElseIfPartImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getStatement_If_Then_Else_ElseIfPart()
	 * @generated
	 */
	int STATEMENT_IF_THEN_ELSE_ELSE_IF_PART = 28;

	/**
	 * The feature id for the '<em><b>Elseif Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_IF_THEN_ELSE_ELSE_IF_PART__ELSEIF_EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Elseif Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_IF_THEN_ELSE_ELSE_IF_PART__ELSEIF_BLOCK = 1;

	/**
	 * The number of structural features of the '<em>Statement If Then Else Else If Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_IF_THEN_ELSE_ELSE_IF_PART_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Statement_For_NumericImpl <em>Statement For Numeric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Statement_For_NumericImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getStatement_For_Numeric()
	 * @generated
	 */
	int STATEMENT_FOR_NUMERIC = 29;

	/**
	 * The feature id for the '<em><b>Iterator Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FOR_NUMERIC__ITERATOR_NAME = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Start Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FOR_NUMERIC__START_EXPR = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Until Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FOR_NUMERIC__UNTIL_EXPR = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Step Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FOR_NUMERIC__STEP_EXPR = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FOR_NUMERIC__BLOCK = STATEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Statement For Numeric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FOR_NUMERIC_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Statement_For_GenericImpl <em>Statement For Generic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Statement_For_GenericImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getStatement_For_Generic()
	 * @generated
	 */
	int STATEMENT_FOR_GENERIC = 30;

	/**
	 * The feature id for the '<em><b>Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FOR_GENERIC__NAMES = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FOR_GENERIC__EXPRESSIONS = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FOR_GENERIC__BLOCK = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Statement For Generic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FOR_GENERIC_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Statement_GlobalFunction_DeclarationImpl <em>Statement Global Function Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Statement_GlobalFunction_DeclarationImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getStatement_GlobalFunction_Declaration()
	 * @generated
	 */
	int STATEMENT_GLOBAL_FUNCTION_DECLARATION = 31;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_GLOBAL_FUNCTION_DECLARATION__PREFIX = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Function Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_GLOBAL_FUNCTION_DECLARATION__FUNCTION_NAME = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_GLOBAL_FUNCTION_DECLARATION__FUNCTION = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Statement Global Function Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_GLOBAL_FUNCTION_DECLARATION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Statement_LocalFunction_DeclarationImpl <em>Statement Local Function Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Statement_LocalFunction_DeclarationImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getStatement_LocalFunction_Declaration()
	 * @generated
	 */
	int STATEMENT_LOCAL_FUNCTION_DECLARATION = 32;

	/**
	 * The feature id for the '<em><b>Function Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_LOCAL_FUNCTION_DECLARATION__FUNCTION_NAME = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_LOCAL_FUNCTION_DECLARATION__FUNCTION = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Statement Local Function Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_LOCAL_FUNCTION_DECLARATION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Statement_Local_Variable_DeclarationImpl <em>Statement Local Variable Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Statement_Local_Variable_DeclarationImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getStatement_Local_Variable_Declaration()
	 * @generated
	 */
	int STATEMENT_LOCAL_VARIABLE_DECLARATION = 33;

	/**
	 * The feature id for the '<em><b>Variable Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_LOCAL_VARIABLE_DECLARATION__VARIABLE_NAMES = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_LOCAL_VARIABLE_DECLARATION__INITIAL_VALUE = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Statement Local Variable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_LOCAL_VARIABLE_DECLARATION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Statement_FunctioncallOrAssignmentImpl <em>Statement Functioncall Or Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Statement_FunctioncallOrAssignmentImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getStatement_FunctioncallOrAssignment()
	 * @generated
	 */
	int STATEMENT_FUNCTIONCALL_OR_ASSIGNMENT = 34;

	/**
	 * The number of structural features of the '<em>Statement Functioncall Or Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FUNCTIONCALL_OR_ASSIGNMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.ExpressionImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 35;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = STATEMENT_FUNCTIONCALL_OR_ASSIGNMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Expression_NilImpl <em>Expression Nil</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Expression_NilImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getExpression_Nil()
	 * @generated
	 */
	int EXPRESSION_NIL = 36;

	/**
	 * The number of structural features of the '<em>Expression Nil</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_NIL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Expression_TrueImpl <em>Expression True</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Expression_TrueImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getExpression_True()
	 * @generated
	 */
	int EXPRESSION_TRUE = 37;

	/**
	 * The number of structural features of the '<em>Expression True</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_TRUE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Expression_FalseImpl <em>Expression False</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Expression_FalseImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getExpression_False()
	 * @generated
	 */
	int EXPRESSION_FALSE = 38;

	/**
	 * The number of structural features of the '<em>Expression False</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FALSE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Expression_NumberImpl <em>Expression Number</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Expression_NumberImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getExpression_Number()
	 * @generated
	 */
	int EXPRESSION_NUMBER = 39;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_NUMBER__VALUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_NUMBER_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Expression_VarArgsImpl <em>Expression Var Args</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Expression_VarArgsImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getExpression_VarArgs()
	 * @generated
	 */
	int EXPRESSION_VAR_ARGS = 40;

	/**
	 * The number of structural features of the '<em>Expression Var Args</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_VAR_ARGS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Expression_StringImpl <em>Expression String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Expression_StringImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getExpression_String()
	 * @generated
	 */
	int EXPRESSION_STRING = 41;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_STRING__VALUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_STRING_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Expression_FunctionImpl <em>Expression Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Expression_FunctionImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getExpression_Function()
	 * @generated
	 */
	int EXPRESSION_FUNCTION = 42;

	/**
	 * The feature id for the '<em><b>Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FUNCTION__FUNCTION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FUNCTION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Expression_TableConstructorImpl <em>Expression Table Constructor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Expression_TableConstructorImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getExpression_TableConstructor()
	 * @generated
	 */
	int EXPRESSION_TABLE_CONSTRUCTOR = 43;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_TABLE_CONSTRUCTOR__FIELDS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression Table Constructor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_TABLE_CONSTRUCTOR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.FunctionImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 44;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__PARAMETERS = 0;

	/**
	 * The feature id for the '<em><b>Var Args</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__VAR_ARGS = 1;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__BODY = 2;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Functioncall_ArgumentsImpl <em>Functioncall Arguments</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Functioncall_ArgumentsImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getFunctioncall_Arguments()
	 * @generated
	 */
	int FUNCTIONCALL_ARGUMENTS = 45;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONCALL_ARGUMENTS__ARGUMENTS = 0;

	/**
	 * The number of structural features of the '<em>Functioncall Arguments</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONCALL_ARGUMENTS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Field_AddEntryToTable_BracketsImpl <em>Field Add Entry To Table Brackets</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Field_AddEntryToTable_BracketsImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getField_AddEntryToTable_Brackets()
	 * @generated
	 */
	int FIELD_ADD_ENTRY_TO_TABLE_BRACKETS = 46;

	/**
	 * The feature id for the '<em><b>Contained Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ADD_ENTRY_TO_TABLE_BRACKETS__CONTAINED_TYPE = FIELD__CONTAINED_TYPE;

	/**
	 * The feature id for the '<em><b>Shared Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ADD_ENTRY_TO_TABLE_BRACKETS__SHARED_TYPE = FIELD__SHARED_TYPE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ADD_ENTRY_TO_TABLE_BRACKETS__IDENTIFIER = FIELD__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ADD_ENTRY_TO_TABLE_BRACKETS__VALUE = FIELD__VALUE;

	/**
	 * The feature id for the '<em><b>Index Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ADD_ENTRY_TO_TABLE_BRACKETS__INDEX_EXPRESSION = FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Field Add Entry To Table Brackets</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ADD_ENTRY_TO_TABLE_BRACKETS_FEATURE_COUNT = FIELD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Field_AddEntryToTableImpl <em>Field Add Entry To Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Field_AddEntryToTableImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getField_AddEntryToTable()
	 * @generated
	 */
	int FIELD_ADD_ENTRY_TO_TABLE = 47;

	/**
	 * The feature id for the '<em><b>Contained Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ADD_ENTRY_TO_TABLE__CONTAINED_TYPE = FIELD__CONTAINED_TYPE;

	/**
	 * The feature id for the '<em><b>Shared Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ADD_ENTRY_TO_TABLE__SHARED_TYPE = FIELD__SHARED_TYPE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ADD_ENTRY_TO_TABLE__IDENTIFIER = FIELD__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ADD_ENTRY_TO_TABLE__VALUE = FIELD__VALUE;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ADD_ENTRY_TO_TABLE__KEY = FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Field Add Entry To Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ADD_ENTRY_TO_TABLE_FEATURE_COUNT = FIELD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Field_AppendEntryToTableImpl <em>Field Append Entry To Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Field_AppendEntryToTableImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getField_AppendEntryToTable()
	 * @generated
	 */
	int FIELD_APPEND_ENTRY_TO_TABLE = 48;

	/**
	 * The feature id for the '<em><b>Contained Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_APPEND_ENTRY_TO_TABLE__CONTAINED_TYPE = FIELD__CONTAINED_TYPE;

	/**
	 * The feature id for the '<em><b>Shared Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_APPEND_ENTRY_TO_TABLE__SHARED_TYPE = FIELD__SHARED_TYPE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_APPEND_ENTRY_TO_TABLE__IDENTIFIER = FIELD__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_APPEND_ENTRY_TO_TABLE__VALUE = FIELD__VALUE;

	/**
	 * The number of structural features of the '<em>Field Append Entry To Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_APPEND_ENTRY_TO_TABLE_FEATURE_COUNT = FIELD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.LastStatement_ReturnWithValueImpl <em>Last Statement Return With Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.LastStatement_ReturnWithValueImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getLastStatement_ReturnWithValue()
	 * @generated
	 */
	int LAST_STATEMENT_RETURN_WITH_VALUE = 49;

	/**
	 * The feature id for the '<em><b>Return Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STATEMENT_RETURN_WITH_VALUE__RETURN_VALUES = LAST_STATEMENT_RETURN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Last Statement Return With Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STATEMENT_RETURN_WITH_VALUE_FEATURE_COUNT = LAST_STATEMENT_RETURN_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Statement_AssignmentImpl <em>Statement Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Statement_AssignmentImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getStatement_Assignment()
	 * @generated
	 */
	int STATEMENT_ASSIGNMENT = 50;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_ASSIGNMENT__VARIABLE = STATEMENT_FUNCTIONCALL_OR_ASSIGNMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_ASSIGNMENT__VALUES = STATEMENT_FUNCTIONCALL_OR_ASSIGNMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Statement Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_ASSIGNMENT_FEATURE_COUNT = STATEMENT_FUNCTIONCALL_OR_ASSIGNMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Statement_CallMemberFunctionImpl <em>Statement Call Member Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Statement_CallMemberFunctionImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getStatement_CallMemberFunction()
	 * @generated
	 */
	int STATEMENT_CALL_MEMBER_FUNCTION = 51;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_CALL_MEMBER_FUNCTION__OBJECT = STATEMENT_FUNCTIONCALL_OR_ASSIGNMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Member Function Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_CALL_MEMBER_FUNCTION__MEMBER_FUNCTION_NAME = STATEMENT_FUNCTIONCALL_OR_ASSIGNMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_CALL_MEMBER_FUNCTION__ARGUMENTS = STATEMENT_FUNCTIONCALL_OR_ASSIGNMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Statement Call Member Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_CALL_MEMBER_FUNCTION_FEATURE_COUNT = STATEMENT_FUNCTIONCALL_OR_ASSIGNMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Statement_CallFunctionImpl <em>Statement Call Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Statement_CallFunctionImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getStatement_CallFunction()
	 * @generated
	 */
	int STATEMENT_CALL_FUNCTION = 52;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_CALL_FUNCTION__OBJECT = STATEMENT_FUNCTIONCALL_OR_ASSIGNMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_CALL_FUNCTION__ARGUMENTS = STATEMENT_FUNCTIONCALL_OR_ASSIGNMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Statement Call Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_CALL_FUNCTION_FEATURE_COUNT = STATEMENT_FUNCTIONCALL_OR_ASSIGNMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Expression_OrImpl <em>Expression Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Expression_OrImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getExpression_Or()
	 * @generated
	 */
	int EXPRESSION_OR = 53;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OR__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OR__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Expression Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Expression_AndImpl <em>Expression And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Expression_AndImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getExpression_And()
	 * @generated
	 */
	int EXPRESSION_AND = 54;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_AND__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_AND__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Expression And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_AND_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Expression_LargerImpl <em>Expression Larger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Expression_LargerImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getExpression_Larger()
	 * @generated
	 */
	int EXPRESSION_LARGER = 55;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_LARGER__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_LARGER__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Expression Larger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_LARGER_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Expression_Larger_EqualImpl <em>Expression Larger Equal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Expression_Larger_EqualImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getExpression_Larger_Equal()
	 * @generated
	 */
	int EXPRESSION_LARGER_EQUAL = 56;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_LARGER_EQUAL__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_LARGER_EQUAL__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Expression Larger Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_LARGER_EQUAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Expression_SmallerImpl <em>Expression Smaller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Expression_SmallerImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getExpression_Smaller()
	 * @generated
	 */
	int EXPRESSION_SMALLER = 57;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_SMALLER__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_SMALLER__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Expression Smaller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_SMALLER_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Expression_Smaller_EqualImpl <em>Expression Smaller Equal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Expression_Smaller_EqualImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getExpression_Smaller_Equal()
	 * @generated
	 */
	int EXPRESSION_SMALLER_EQUAL = 58;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_SMALLER_EQUAL__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_SMALLER_EQUAL__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Expression Smaller Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_SMALLER_EQUAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Expression_EqualImpl <em>Expression Equal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Expression_EqualImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getExpression_Equal()
	 * @generated
	 */
	int EXPRESSION_EQUAL = 59;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_EQUAL__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_EQUAL__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Expression Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_EQUAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Expression_Not_EqualImpl <em>Expression Not Equal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Expression_Not_EqualImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getExpression_Not_Equal()
	 * @generated
	 */
	int EXPRESSION_NOT_EQUAL = 60;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_NOT_EQUAL__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_NOT_EQUAL__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Expression Not Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_NOT_EQUAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Expression_ConcatenationImpl <em>Expression Concatenation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Expression_ConcatenationImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getExpression_Concatenation()
	 * @generated
	 */
	int EXPRESSION_CONCATENATION = 61;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_CONCATENATION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_CONCATENATION__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Expression Concatenation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_CONCATENATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Expression_PlusImpl <em>Expression Plus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Expression_PlusImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getExpression_Plus()
	 * @generated
	 */
	int EXPRESSION_PLUS = 62;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_PLUS__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_PLUS__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Expression Plus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_PLUS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Expression_MinusImpl <em>Expression Minus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Expression_MinusImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getExpression_Minus()
	 * @generated
	 */
	int EXPRESSION_MINUS = 63;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_MINUS__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_MINUS__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Expression Minus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_MINUS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Expression_MultiplicationImpl <em>Expression Multiplication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Expression_MultiplicationImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getExpression_Multiplication()
	 * @generated
	 */
	int EXPRESSION_MULTIPLICATION = 64;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_MULTIPLICATION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_MULTIPLICATION__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Expression Multiplication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_MULTIPLICATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Expression_DivisionImpl <em>Expression Division</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Expression_DivisionImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getExpression_Division()
	 * @generated
	 */
	int EXPRESSION_DIVISION = 65;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_DIVISION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_DIVISION__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Expression Division</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_DIVISION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Expression_ModuloImpl <em>Expression Modulo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Expression_ModuloImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getExpression_Modulo()
	 * @generated
	 */
	int EXPRESSION_MODULO = 66;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_MODULO__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_MODULO__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Expression Modulo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_MODULO_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Expression_NegateImpl <em>Expression Negate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Expression_NegateImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getExpression_Negate()
	 * @generated
	 */
	int EXPRESSION_NEGATE = 67;

	/**
	 * The feature id for the '<em><b>Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_NEGATE__EXP = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression Negate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_NEGATE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Expression_LengthImpl <em>Expression Length</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Expression_LengthImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getExpression_Length()
	 * @generated
	 */
	int EXPRESSION_LENGTH = 68;

	/**
	 * The feature id for the '<em><b>Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_LENGTH__EXP = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression Length</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_LENGTH_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Expression_InvertImpl <em>Expression Invert</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Expression_InvertImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getExpression_Invert()
	 * @generated
	 */
	int EXPRESSION_INVERT = 69;

	/**
	 * The feature id for the '<em><b>Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_INVERT__EXP = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression Invert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_INVERT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Expression_ExponentiationImpl <em>Expression Exponentiation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Expression_ExponentiationImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getExpression_Exponentiation()
	 * @generated
	 */
	int EXPRESSION_EXPONENTIATION = 70;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_EXPONENTIATION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_EXPONENTIATION__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Expression Exponentiation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_EXPONENTIATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Expression_CallMemberFunctionImpl <em>Expression Call Member Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Expression_CallMemberFunctionImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getExpression_CallMemberFunction()
	 * @generated
	 */
	int EXPRESSION_CALL_MEMBER_FUNCTION = 71;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_CALL_MEMBER_FUNCTION__OBJECT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Member Function Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_CALL_MEMBER_FUNCTION__MEMBER_FUNCTION_NAME = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_CALL_MEMBER_FUNCTION__ARGUMENTS = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Expression Call Member Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_CALL_MEMBER_FUNCTION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Expression_CallFunctionImpl <em>Expression Call Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Expression_CallFunctionImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getExpression_CallFunction()
	 * @generated
	 */
	int EXPRESSION_CALL_FUNCTION = 72;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_CALL_FUNCTION__OBJECT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_CALL_FUNCTION__ARGUMENTS = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Expression Call Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_CALL_FUNCTION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Expression_AccessArrayImpl <em>Expression Access Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Expression_AccessArrayImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getExpression_AccessArray()
	 * @generated
	 */
	int EXPRESSION_ACCESS_ARRAY = 73;

	/**
	 * The feature id for the '<em><b>Array</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ACCESS_ARRAY__ARRAY = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ACCESS_ARRAY__INDEX = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Expression Access Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ACCESS_ARRAY_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Expression_AccessMemberImpl <em>Expression Access Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Expression_AccessMemberImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getExpression_AccessMember()
	 * @generated
	 */
	int EXPRESSION_ACCESS_MEMBER = 74;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ACCESS_MEMBER__OBJECT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Member Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ACCESS_MEMBER__MEMBER_NAME = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Expression Access Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ACCESS_MEMBER_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Expression_VariableNameImpl <em>Expression Variable Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Expression_VariableNameImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getExpression_VariableName()
	 * @generated
	 */
	int EXPRESSION_VARIABLE_NAME = 75;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_VARIABLE_NAME__VARIABLE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression Variable Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_VARIABLE_NAME_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.ActivityNodeImpl <em>Activity Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.ActivityNodeImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getActivityNode()
	 * @generated
	 */
	int ACTIVITY_NODE = 76;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE__IDENTIFIER = NAMED_ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE__OUTGOING = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE__INCOMING = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE__ACTIVITY = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE__RUNNING = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Activity Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.ActivityEdgeImpl <em>Activity Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.ActivityEdgeImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getActivityEdge()
	 * @generated
	 */
	int ACTIVITY_EDGE = 77;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE__IDENTIFIER = NAMED_ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE__SOURCE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE__TARGET = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Activity Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.ControlFlowImpl <em>Control Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.ControlFlowImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getControlFlow()
	 * @generated
	 */
	int CONTROL_FLOW = 78;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__IDENTIFIER = ACTIVITY_EDGE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__NAME = ACTIVITY_EDGE__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__SOURCE = ACTIVITY_EDGE__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__TARGET = ACTIVITY_EDGE__TARGET;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__GUARD = ACTIVITY_EDGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Control Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_FEATURE_COUNT = ACTIVITY_EDGE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.ControlNodeImpl <em>Control Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.ControlNodeImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getControlNode()
	 * @generated
	 */
	int CONTROL_NODE = 79;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE__IDENTIFIER = ACTIVITY_NODE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE__NAME = ACTIVITY_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE__OUTGOING = ACTIVITY_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE__INCOMING = ACTIVITY_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE__ACTIVITY = ACTIVITY_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE__RUNNING = ACTIVITY_NODE__RUNNING;

	/**
	 * The number of structural features of the '<em>Control Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_FEATURE_COUNT = ACTIVITY_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.ExecutableNodeImpl <em>Executable Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.ExecutableNodeImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getExecutableNode()
	 * @generated
	 */
	int EXECUTABLE_NODE = 80;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__IDENTIFIER = ACTIVITY_NODE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__NAME = ACTIVITY_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__OUTGOING = ACTIVITY_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__INCOMING = ACTIVITY_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__ACTIVITY = ACTIVITY_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__RUNNING = ACTIVITY_NODE__RUNNING;

	/**
	 * The number of structural features of the '<em>Executable Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE_FEATURE_COUNT = ACTIVITY_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.ActionImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 81;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__IDENTIFIER = EXECUTABLE_NODE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = EXECUTABLE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__OUTGOING = EXECUTABLE_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__INCOMING = EXECUTABLE_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ACTIVITY = EXECUTABLE_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__RUNNING = EXECUTABLE_NODE__RUNNING;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = EXECUTABLE_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.OpaqueActionImpl <em>Opaque Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.OpaqueActionImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getOpaqueAction()
	 * @generated
	 */
	int OPAQUE_ACTION = 82;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION__IDENTIFIER = ACTION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION__OUTGOING = ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION__INCOMING = ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION__ACTIVITY = ACTION__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION__RUNNING = ACTION__RUNNING;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION__EXPRESSIONS = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION__SERVICE = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Opaque Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.InitialNodeImpl <em>Initial Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.InitialNodeImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getInitialNode()
	 * @generated
	 */
	int INITIAL_NODE = 83;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE__IDENTIFIER = CONTROL_NODE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE__NAME = CONTROL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE__OUTGOING = CONTROL_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE__INCOMING = CONTROL_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE__ACTIVITY = CONTROL_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE__RUNNING = CONTROL_NODE__RUNNING;

	/**
	 * The number of structural features of the '<em>Initial Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_FEATURE_COUNT = CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.FinalNodeImpl <em>Final Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.FinalNodeImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getFinalNode()
	 * @generated
	 */
	int FINAL_NODE = 84;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE__IDENTIFIER = CONTROL_NODE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE__NAME = CONTROL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE__OUTGOING = CONTROL_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE__INCOMING = CONTROL_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE__ACTIVITY = CONTROL_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE__RUNNING = CONTROL_NODE__RUNNING;

	/**
	 * The number of structural features of the '<em>Final Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE_FEATURE_COUNT = CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.ActivityFinalNodeImpl <em>Activity Final Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.ActivityFinalNodeImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getActivityFinalNode()
	 * @generated
	 */
	int ACTIVITY_FINAL_NODE = 85;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE__IDENTIFIER = FINAL_NODE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE__NAME = FINAL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE__OUTGOING = FINAL_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE__INCOMING = FINAL_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE__ACTIVITY = FINAL_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE__RUNNING = FINAL_NODE__RUNNING;

	/**
	 * The number of structural features of the '<em>Activity Final Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE_FEATURE_COUNT = FINAL_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.ForkNodeImpl <em>Fork Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.ForkNodeImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getForkNode()
	 * @generated
	 */
	int FORK_NODE = 86;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE__IDENTIFIER = CONTROL_NODE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE__NAME = CONTROL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE__OUTGOING = CONTROL_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE__INCOMING = CONTROL_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE__ACTIVITY = CONTROL_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE__RUNNING = CONTROL_NODE__RUNNING;

	/**
	 * The number of structural features of the '<em>Fork Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_FEATURE_COUNT = CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.JoinNodeImpl <em>Join Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.JoinNodeImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getJoinNode()
	 * @generated
	 */
	int JOIN_NODE = 87;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE__IDENTIFIER = CONTROL_NODE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE__NAME = CONTROL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE__OUTGOING = CONTROL_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE__INCOMING = CONTROL_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE__ACTIVITY = CONTROL_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE__RUNNING = CONTROL_NODE__RUNNING;

	/**
	 * The number of structural features of the '<em>Join Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_FEATURE_COUNT = CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.MergeNodeImpl <em>Merge Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.MergeNodeImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getMergeNode()
	 * @generated
	 */
	int MERGE_NODE = 88;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE__IDENTIFIER = CONTROL_NODE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE__NAME = CONTROL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE__OUTGOING = CONTROL_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE__INCOMING = CONTROL_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE__ACTIVITY = CONTROL_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE__RUNNING = CONTROL_NODE__RUNNING;

	/**
	 * The number of structural features of the '<em>Merge Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_FEATURE_COUNT = CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.DecisionNodeImpl <em>Decision Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.DecisionNodeImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getDecisionNode()
	 * @generated
	 */
	int DECISION_NODE = 89;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE__IDENTIFIER = CONTROL_NODE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE__NAME = CONTROL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE__OUTGOING = CONTROL_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE__INCOMING = CONTROL_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE__ACTIVITY = CONTROL_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE__RUNNING = CONTROL_NODE__RUNNING;

	/**
	 * The number of structural features of the '<em>Decision Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_FEATURE_COUNT = CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.VariableImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 90;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__INITIAL_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Current Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__CURRENT_VALUE = 2;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.IntegerVariableImpl <em>Integer Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.IntegerVariableImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getIntegerVariable()
	 * @generated
	 */
	int INTEGER_VARIABLE = 91;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE__INITIAL_VALUE = VARIABLE__INITIAL_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Current Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE__CURRENT_VALUE = VARIABLE__CURRENT_VALUE;

	/**
	 * The number of structural features of the '<em>Integer Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.BooleanVariableImpl <em>Boolean Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.BooleanVariableImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getBooleanVariable()
	 * @generated
	 */
	int BOOLEAN_VARIABLE = 92;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE__INITIAL_VALUE = VARIABLE__INITIAL_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Current Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE__CURRENT_VALUE = VARIABLE__CURRENT_VALUE;

	/**
	 * The number of structural features of the '<em>Boolean Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.ValueImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 93;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.BooleanValueImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getBooleanValue()
	 * @generated
	 */
	int BOOLEAN_VALUE = 94;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE__VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.IntegerValueImpl <em>Integer Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.IntegerValueImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getIntegerValue()
	 * @generated
	 */
	int INTEGER_VALUE = 95;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE__VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.IntegerExpressionImpl <em>Integer Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.IntegerExpressionImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getIntegerExpression()
	 * @generated
	 */
	int INTEGER_EXPRESSION = 96;

	/**
	 * The feature id for the '<em><b>Operand2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXPRESSION__OPERAND2 = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operand1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXPRESSION__OPERAND1 = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Integer Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.BooleanExpressionImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getBooleanExpression()
	 * @generated
	 */
	int BOOLEAN_EXPRESSION = 97;

	/**
	 * The feature id for the '<em><b>Assignee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION__ASSIGNEE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.IntegerCalculationExpressionImpl <em>Integer Calculation Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.IntegerCalculationExpressionImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getIntegerCalculationExpression()
	 * @generated
	 */
	int INTEGER_CALCULATION_EXPRESSION = 98;

	/**
	 * The feature id for the '<em><b>Operand2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CALCULATION_EXPRESSION__OPERAND2 = INTEGER_EXPRESSION__OPERAND2;

	/**
	 * The feature id for the '<em><b>Operand1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CALCULATION_EXPRESSION__OPERAND1 = INTEGER_EXPRESSION__OPERAND1;

	/**
	 * The feature id for the '<em><b>Assignee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CALCULATION_EXPRESSION__ASSIGNEE = INTEGER_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CALCULATION_EXPRESSION__OPERATOR = INTEGER_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Integer Calculation Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CALCULATION_EXPRESSION_FEATURE_COUNT = INTEGER_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.IntegerComparisonExpressionImpl <em>Integer Comparison Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.IntegerComparisonExpressionImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getIntegerComparisonExpression()
	 * @generated
	 */
	int INTEGER_COMPARISON_EXPRESSION = 99;

	/**
	 * The feature id for the '<em><b>Operand2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_COMPARISON_EXPRESSION__OPERAND2 = INTEGER_EXPRESSION__OPERAND2;

	/**
	 * The feature id for the '<em><b>Operand1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_COMPARISON_EXPRESSION__OPERAND1 = INTEGER_EXPRESSION__OPERAND1;

	/**
	 * The feature id for the '<em><b>Assignee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_COMPARISON_EXPRESSION__ASSIGNEE = INTEGER_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_COMPARISON_EXPRESSION__OPERATOR = INTEGER_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Integer Comparison Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_COMPARISON_EXPRESSION_FEATURE_COUNT = INTEGER_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.BooleanUnaryExpressionImpl <em>Boolean Unary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.BooleanUnaryExpressionImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getBooleanUnaryExpression()
	 * @generated
	 */
	int BOOLEAN_UNARY_EXPRESSION = 100;

	/**
	 * The feature id for the '<em><b>Assignee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_UNARY_EXPRESSION__ASSIGNEE = BOOLEAN_EXPRESSION__ASSIGNEE;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_UNARY_EXPRESSION__OPERAND = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_UNARY_EXPRESSION__OPERATOR = BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Boolean Unary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_UNARY_EXPRESSION_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.BooleanBinaryExpressionImpl <em>Boolean Binary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.BooleanBinaryExpressionImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getBooleanBinaryExpression()
	 * @generated
	 */
	int BOOLEAN_BINARY_EXPRESSION = 101;

	/**
	 * The feature id for the '<em><b>Assignee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BINARY_EXPRESSION__ASSIGNEE = BOOLEAN_EXPRESSION__ASSIGNEE;

	/**
	 * The feature id for the '<em><b>Operand1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BINARY_EXPRESSION__OPERAND1 = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operand2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BINARY_EXPRESSION__OPERAND2 = BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BINARY_EXPRESSION__OPERATOR = BOOLEAN_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Boolean Binary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BINARY_EXPRESSION_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.InputValueImpl <em>Input Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.InputValueImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getInputValue()
	 * @generated
	 */
	int INPUT_VALUE = 102;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VALUE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VALUE__VARIABLE = 1;

	/**
	 * The number of structural features of the '<em>Input Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VALUE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.InputImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 103;

	/**
	 * The feature id for the '<em><b>Input Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__INPUT_VALUES = 0;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.TokenImpl <em>Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.TokenImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getToken()
	 * @generated
	 */
	int TOKEN = 104;

	/**
	 * The feature id for the '<em><b>Holder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__HOLDER = 0;

	/**
	 * The number of structural features of the '<em>Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.TraceImpl <em>Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.TraceImpl
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getTrace()
	 * @generated
	 */
	int TRACE = 105;

	/**
	 * The feature id for the '<em><b>Executed Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__EXECUTED_NODES = 0;

	/**
	 * The number of structural features of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.BoardType <em>Board Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.BoardType
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getBoardType()
	 * @generated
	 */
	int BOARD_TYPE = 106;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.ParameterMode <em>Parameter Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.ParameterMode
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getParameterMode()
	 * @generated
	 */
	int PARAMETER_MODE = 107;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.PrimitiveKind <em>Primitive Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.PrimitiveKind
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getPrimitiveKind()
	 * @generated
	 */
	int PRIMITIVE_KIND = 108;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.IntegerCalculationOperator <em>Integer Calculation Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.IntegerCalculationOperator
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getIntegerCalculationOperator()
	 * @generated
	 */
	int INTEGER_CALCULATION_OPERATOR = 109;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.IntegerComparisonOperator <em>Integer Comparison Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.IntegerComparisonOperator
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getIntegerComparisonOperator()
	 * @generated
	 */
	int INTEGER_COMPARISON_OPERATOR = 110;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.BooleanUnaryOperator <em>Boolean Unary Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.BooleanUnaryOperator
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getBooleanUnaryOperator()
	 * @generated
	 */
	int BOOLEAN_UNARY_OPERATOR = 111;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.iot2.iot2.iot2.BooleanBinaryOperator <em>Boolean Binary Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.iot2.iot2.iot2.BooleanBinaryOperator
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getBooleanBinaryOperator()
	 * @generated
	 */
	int BOOLEAN_BINARY_OPERATOR = 112;

	/**
	 * The meta object id for the '<em>EType Code</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getETypeCode()
	 * @generated
	 */
	int ETYPE_CODE = 113;

	/**
	 * The meta object id for the '<em>Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getObject()
	 * @generated
	 */
	int OBJECT = 114;

	/**
	 * The meta object id for the '<em>Stack</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Stack
	 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getStack()
	 * @generated
	 */
	int STACK = 115;


	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.iot2.iot2.iot2.System#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.System#getName()
	 * @see #getSystem()
	 * @generated
	 */
	EAttribute getSystem_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.iot2.iot2.iot2.System#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.System#getComponents()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Components();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.iot2.iot2.iot2.System#getBoards <em>Boards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Boards</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.System#getBoards()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Boards();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.iot2.iot2.iot2.System#getSketch <em>Sketch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sketch</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.System#getSketch()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Sketch();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.Board <em>Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Board</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Board
	 * @generated
	 */
	EClass getBoard();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.iot2.iot2.iot2.Board#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Board#getName()
	 * @see #getBoard()
	 * @generated
	 */
	EAttribute getBoard_Name();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.iot2.iot2.iot2.Board#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Board#getType()
	 * @see #getBoard()
	 * @generated
	 */
	EAttribute getBoard_Type();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.diverse.iot2.iot2.iot2.Board#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Components</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Board#getComponents()
	 * @see #getBoard()
	 * @generated
	 */
	EReference getBoard_Components();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.Sketch <em>Sketch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sketch</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Sketch
	 * @generated
	 */
	EClass getSketch();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.iot2.iot2.iot2.Sketch#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activity</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Sketch#getActivity()
	 * @see #getSketch()
	 * @generated
	 */
	EReference getSketch_Activity();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.HWComponent <em>HW Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HW Component</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.HWComponent
	 * @generated
	 */
	EClass getHWComponent();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.iot2.iot2.iot2.HWComponent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.HWComponent#getName()
	 * @see #getHWComponent()
	 * @generated
	 */
	EAttribute getHWComponent_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.iot2.iot2.iot2.HWComponent#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Services</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.HWComponent#getServices()
	 * @see #getHWComponent()
	 * @generated
	 */
	EReference getHWComponent_Services();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.Actuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actuator</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Actuator
	 * @generated
	 */
	EClass getActuator();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.iot2.iot2.iot2.Activity#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Activity#getNodes()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Nodes();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.iot2.iot2.iot2.Activity#getEdges <em>Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Edges</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Activity#getEdges()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Edges();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.iot2.iot2.iot2.Activity#getLocals <em>Locals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Locals</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Activity#getLocals()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Locals();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.iot2.iot2.iot2.Activity#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Activity#getInputs()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Inputs();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.OperationDef <em>Operation Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Def</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.OperationDef
	 * @generated
	 */
	EClass getOperationDef();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.iot2.iot2.iot2.OperationDef#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.OperationDef#getParameters()
	 * @see #getOperationDef()
	 * @generated
	 */
	EReference getOperationDef_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.iot2.iot2.iot2.OperationDef#isIsOneway <em>Is Oneway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Oneway</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.OperationDef#isIsOneway()
	 * @see #getOperationDef()
	 * @generated
	 */
	EAttribute getOperationDef_IsOneway();

	/**
	 * Returns the meta object for the attribute list '{@link fr.inria.diverse.iot2.iot2.iot2.OperationDef#getContexts <em>Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Contexts</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.OperationDef#getContexts()
	 * @see #getOperationDef()
	 * @generated
	 */
	EAttribute getOperationDef_Contexts();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.diverse.iot2.iot2.iot2.OperationDef#getCanRaise <em>Can Raise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Can Raise</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.OperationDef#getCanRaise()
	 * @see #getOperationDef()
	 * @generated
	 */
	EReference getOperationDef_CanRaise();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.iot2.iot2.iot2.OperationDef#getLua <em>Lua</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lua</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.OperationDef#getLua()
	 * @see #getOperationDef()
	 * @generated
	 */
	EReference getOperationDef_Lua();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.Contained <em>Contained</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contained</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Contained
	 * @generated
	 */
	EClass getContained();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.iot2.iot2.iot2.Contained#getRepositoryId <em>Repository Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repository Id</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Contained#getRepositoryId()
	 * @see #getContained()
	 * @generated
	 */
	EAttribute getContained_RepositoryId();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.iot2.iot2.iot2.Contained#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Contained#getVersion()
	 * @see #getContained()
	 * @generated
	 */
	EAttribute getContained_Version();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.iot2.iot2.iot2.Contained#getAbsoluteName <em>Absolute Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Absolute Name</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Contained#getAbsoluteName()
	 * @see #getContained()
	 * @generated
	 */
	EAttribute getContained_AbsoluteName();

	/**
	 * Returns the meta object for the container reference '{@link fr.inria.diverse.iot2.iot2.iot2.Contained#getDefinedIn <em>Defined In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Defined In</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Contained#getDefinedIn()
	 * @see #getContained()
	 * @generated
	 */
	EReference getContained_DefinedIn();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.iot2.iot2.iot2.NamedElement#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.NamedElement#getIdentifier()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.iot2.iot2.iot2.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.iot2.iot2.iot2.Container#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Container#getContains()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Contains();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.Typed <em>Typed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Typed
	 * @generated
	 */
	EClass getTyped();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.iot2.iot2.iot2.Typed#getContainedType <em>Contained Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contained Type</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Typed#getContainedType()
	 * @see #getTyped()
	 * @generated
	 */
	EReference getTyped_ContainedType();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.diverse.iot2.iot2.iot2.Typed#getSharedType <em>Shared Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Shared Type</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Typed#getSharedType()
	 * @see #getTyped()
	 * @generated
	 */
	EReference getTyped_SharedType();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.IDLType <em>IDL Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IDL Type</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.IDLType
	 * @generated
	 */
	EClass getIDLType();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.iot2.iot2.iot2.IDLType#getTypeCode <em>Type Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Code</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.IDLType#getTypeCode()
	 * @see #getIDLType()
	 * @generated
	 */
	EAttribute getIDLType_TypeCode();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.TypedefDef <em>Typedef Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typedef Def</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.TypedefDef
	 * @generated
	 */
	EClass getTypedefDef();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.ParameterDef <em>Parameter Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Def</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.ParameterDef
	 * @generated
	 */
	EClass getParameterDef();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.iot2.iot2.iot2.ParameterDef#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.ParameterDef#getIdentifier()
	 * @see #getParameterDef()
	 * @generated
	 */
	EAttribute getParameterDef_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.iot2.iot2.iot2.ParameterDef#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.ParameterDef#getDirection()
	 * @see #getParameterDef()
	 * @generated
	 */
	EAttribute getParameterDef_Direction();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.ExceptionDef <em>Exception Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exception Def</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.ExceptionDef
	 * @generated
	 */
	EClass getExceptionDef();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.iot2.iot2.iot2.ExceptionDef#getTypeCode <em>Type Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Code</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.ExceptionDef#getTypeCode()
	 * @see #getExceptionDef()
	 * @generated
	 */
	EAttribute getExceptionDef_TypeCode();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.iot2.iot2.iot2.ExceptionDef#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.ExceptionDef#getMembers()
	 * @see #getExceptionDef()
	 * @generated
	 */
	EReference getExceptionDef_Members();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.iot2.iot2.iot2.Field#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Field#getIdentifier()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Identifier();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.iot2.iot2.iot2.Field#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Field#getValue()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_Value();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.PrimitiveDef <em>Primitive Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Def</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.PrimitiveDef
	 * @generated
	 */
	EClass getPrimitiveDef();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.iot2.iot2.iot2.PrimitiveDef#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.PrimitiveDef#getKind()
	 * @see #getPrimitiveDef()
	 * @generated
	 */
	EAttribute getPrimitiveDef_Kind();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.Chunk <em>Chunk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chunk</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Chunk
	 * @generated
	 */
	EClass getChunk();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.iot2.iot2.iot2.Block#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Block#getStatements()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Statements();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.iot2.iot2.iot2.Block#getReturnValue <em>Return Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return Value</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Block#getReturnValue()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_ReturnValue();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.LastStatement <em>Last Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Last Statement</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.LastStatement
	 * @generated
	 */
	EClass getLastStatement();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.LastStatement_Return <em>Last Statement Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Last Statement Return</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.LastStatement_Return
	 * @generated
	 */
	EClass getLastStatement_Return();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.LastStatement_Break <em>Last Statement Break</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Last Statement Break</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.LastStatement_Break
	 * @generated
	 */
	EClass getLastStatement_Break();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.Statement_Block <em>Statement Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement Block</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Statement_Block
	 * @generated
	 */
	EClass getStatement_Block();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.iot2.iot2.iot2.Statement_Block#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Block</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Statement_Block#getBlock()
	 * @see #getStatement_Block()
	 * @generated
	 */
	EReference getStatement_Block_Block();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.Statement_While <em>Statement While</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement While</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Statement_While
	 * @generated
	 */
	EClass getStatement_While();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.iot2.iot2.iot2.Statement_While#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Statement_While#getExpression()
	 * @see #getStatement_While()
	 * @generated
	 */
	EReference getStatement_While_Expression();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.iot2.iot2.iot2.Statement_While#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Block</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Statement_While#getBlock()
	 * @see #getStatement_While()
	 * @generated
	 */
	EReference getStatement_While_Block();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.Statement_Repeat <em>Statement Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement Repeat</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Statement_Repeat
	 * @generated
	 */
	EClass getStatement_Repeat();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.iot2.iot2.iot2.Statement_Repeat#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Block</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Statement_Repeat#getBlock()
	 * @see #getStatement_Repeat()
	 * @generated
	 */
	EReference getStatement_Repeat_Block();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.iot2.iot2.iot2.Statement_Repeat#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Statement_Repeat#getExpression()
	 * @see #getStatement_Repeat()
	 * @generated
	 */
	EReference getStatement_Repeat_Expression();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.Statement_If_Then_Else <em>Statement If Then Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement If Then Else</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Statement_If_Then_Else
	 * @generated
	 */
	EClass getStatement_If_Then_Else();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.iot2.iot2.iot2.Statement_If_Then_Else#getIfExpression <em>If Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If Expression</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Statement_If_Then_Else#getIfExpression()
	 * @see #getStatement_If_Then_Else()
	 * @generated
	 */
	EReference getStatement_If_Then_Else_IfExpression();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.iot2.iot2.iot2.Statement_If_Then_Else#getIfBlock <em>If Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If Block</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Statement_If_Then_Else#getIfBlock()
	 * @see #getStatement_If_Then_Else()
	 * @generated
	 */
	EReference getStatement_If_Then_Else_IfBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.iot2.iot2.iot2.Statement_If_Then_Else#getElseIf <em>Else If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Else If</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Statement_If_Then_Else#getElseIf()
	 * @see #getStatement_If_Then_Else()
	 * @generated
	 */
	EReference getStatement_If_Then_Else_ElseIf();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.iot2.iot2.iot2.Statement_If_Then_Else#getElseBlock <em>Else Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else Block</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Statement_If_Then_Else#getElseBlock()
	 * @see #getStatement_If_Then_Else()
	 * @generated
	 */
	EReference getStatement_If_Then_Else_ElseBlock();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.Statement_If_Then_Else_ElseIfPart <em>Statement If Then Else Else If Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement If Then Else Else If Part</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Statement_If_Then_Else_ElseIfPart
	 * @generated
	 */
	EClass getStatement_If_Then_Else_ElseIfPart();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.iot2.iot2.iot2.Statement_If_Then_Else_ElseIfPart#getElseifExpression <em>Elseif Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Elseif Expression</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Statement_If_Then_Else_ElseIfPart#getElseifExpression()
	 * @see #getStatement_If_Then_Else_ElseIfPart()
	 * @generated
	 */
	EReference getStatement_If_Then_Else_ElseIfPart_ElseifExpression();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.iot2.iot2.iot2.Statement_If_Then_Else_ElseIfPart#getElseifBlock <em>Elseif Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Elseif Block</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Statement_If_Then_Else_ElseIfPart#getElseifBlock()
	 * @see #getStatement_If_Then_Else_ElseIfPart()
	 * @generated
	 */
	EReference getStatement_If_Then_Else_ElseIfPart_ElseifBlock();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.Statement_For_Numeric <em>Statement For Numeric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement For Numeric</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Statement_For_Numeric
	 * @generated
	 */
	EClass getStatement_For_Numeric();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.iot2.iot2.iot2.Statement_For_Numeric#getIteratorName <em>Iterator Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iterator Name</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Statement_For_Numeric#getIteratorName()
	 * @see #getStatement_For_Numeric()
	 * @generated
	 */
	EAttribute getStatement_For_Numeric_IteratorName();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.iot2.iot2.iot2.Statement_For_Numeric#getStartExpr <em>Start Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start Expr</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Statement_For_Numeric#getStartExpr()
	 * @see #getStatement_For_Numeric()
	 * @generated
	 */
	EReference getStatement_For_Numeric_StartExpr();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.iot2.iot2.iot2.Statement_For_Numeric#getUntilExpr <em>Until Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Until Expr</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Statement_For_Numeric#getUntilExpr()
	 * @see #getStatement_For_Numeric()
	 * @generated
	 */
	EReference getStatement_For_Numeric_UntilExpr();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.iot2.iot2.iot2.Statement_For_Numeric#getStepExpr <em>Step Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Step Expr</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Statement_For_Numeric#getStepExpr()
	 * @see #getStatement_For_Numeric()
	 * @generated
	 */
	EReference getStatement_For_Numeric_StepExpr();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.iot2.iot2.iot2.Statement_For_Numeric#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Block</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Statement_For_Numeric#getBlock()
	 * @see #getStatement_For_Numeric()
	 * @generated
	 */
	EReference getStatement_For_Numeric_Block();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.Statement_For_Generic <em>Statement For Generic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement For Generic</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Statement_For_Generic
	 * @generated
	 */
	EClass getStatement_For_Generic();

	/**
	 * Returns the meta object for the attribute list '{@link fr.inria.diverse.iot2.iot2.iot2.Statement_For_Generic#getNames <em>Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Names</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Statement_For_Generic#getNames()
	 * @see #getStatement_For_Generic()
	 * @generated
	 */
	EAttribute getStatement_For_Generic_Names();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.iot2.iot2.iot2.Statement_For_Generic#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Statement_For_Generic#getExpressions()
	 * @see #getStatement_For_Generic()
	 * @generated
	 */
	EReference getStatement_For_Generic_Expressions();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.iot2.iot2.iot2.Statement_For_Generic#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Block</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Statement_For_Generic#getBlock()
	 * @see #getStatement_For_Generic()
	 * @generated
	 */
	EReference getStatement_For_Generic_Block();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.Statement_GlobalFunction_Declaration <em>Statement Global Function Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement Global Function Declaration</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Statement_GlobalFunction_Declaration
	 * @generated
	 */
	EClass getStatement_GlobalFunction_Declaration();

	/**
	 * Returns the meta object for the attribute list '{@link fr.inria.diverse.iot2.iot2.iot2.Statement_GlobalFunction_Declaration#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Prefix</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Statement_GlobalFunction_Declaration#getPrefix()
	 * @see #getStatement_GlobalFunction_Declaration()
	 * @generated
	 */
	EAttribute getStatement_GlobalFunction_Declaration_Prefix();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.iot2.iot2.iot2.Statement_GlobalFunction_Declaration#getFunctionName <em>Function Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function Name</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Statement_GlobalFunction_Declaration#getFunctionName()
	 * @see #getStatement_GlobalFunction_Declaration()
	 * @generated
	 */
	EAttribute getStatement_GlobalFunction_Declaration_FunctionName();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.iot2.iot2.iot2.Statement_GlobalFunction_Declaration#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Function</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Statement_GlobalFunction_Declaration#getFunction()
	 * @see #getStatement_GlobalFunction_Declaration()
	 * @generated
	 */
	EReference getStatement_GlobalFunction_Declaration_Function();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.Statement_LocalFunction_Declaration <em>Statement Local Function Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement Local Function Declaration</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Statement_LocalFunction_Declaration
	 * @generated
	 */
	EClass getStatement_LocalFunction_Declaration();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.iot2.iot2.iot2.Statement_LocalFunction_Declaration#getFunctionName <em>Function Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function Name</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Statement_LocalFunction_Declaration#getFunctionName()
	 * @see #getStatement_LocalFunction_Declaration()
	 * @generated
	 */
	EAttribute getStatement_LocalFunction_Declaration_FunctionName();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.iot2.iot2.iot2.Statement_LocalFunction_Declaration#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Function</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Statement_LocalFunction_Declaration#getFunction()
	 * @see #getStatement_LocalFunction_Declaration()
	 * @generated
	 */
	EReference getStatement_LocalFunction_Declaration_Function();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.Statement_Local_Variable_Declaration <em>Statement Local Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement Local Variable Declaration</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Statement_Local_Variable_Declaration
	 * @generated
	 */
	EClass getStatement_Local_Variable_Declaration();

	/**
	 * Returns the meta object for the attribute list '{@link fr.inria.diverse.iot2.iot2.iot2.Statement_Local_Variable_Declaration#getVariableNames <em>Variable Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Variable Names</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Statement_Local_Variable_Declaration#getVariableNames()
	 * @see #getStatement_Local_Variable_Declaration()
	 * @generated
	 */
	EAttribute getStatement_Local_Variable_Declaration_VariableNames();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.iot2.iot2.iot2.Statement_Local_Variable_Declaration#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Initial Value</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Statement_Local_Variable_Declaration#getInitialValue()
	 * @see #getStatement_Local_Variable_Declaration()
	 * @generated
	 */
	EReference getStatement_Local_Variable_Declaration_InitialValue();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.Statement_FunctioncallOrAssignment <em>Statement Functioncall Or Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement Functioncall Or Assignment</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Statement_FunctioncallOrAssignment
	 * @generated
	 */
	EClass getStatement_FunctioncallOrAssignment();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_Nil <em>Expression Nil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Nil</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_Nil
	 * @generated
	 */
	EClass getExpression_Nil();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_True <em>Expression True</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression True</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_True
	 * @generated
	 */
	EClass getExpression_True();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_False <em>Expression False</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression False</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_False
	 * @generated
	 */
	EClass getExpression_False();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_Number <em>Expression Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Number</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_Number
	 * @generated
	 */
	EClass getExpression_Number();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_Number#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_Number#getValue()
	 * @see #getExpression_Number()
	 * @generated
	 */
	EAttribute getExpression_Number_Value();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_VarArgs <em>Expression Var Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Var Args</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_VarArgs
	 * @generated
	 */
	EClass getExpression_VarArgs();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_String <em>Expression String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression String</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_String
	 * @generated
	 */
	EClass getExpression_String();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_String#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_String#getValue()
	 * @see #getExpression_String()
	 * @generated
	 */
	EAttribute getExpression_String_Value();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_Function <em>Expression Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Function</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_Function
	 * @generated
	 */
	EClass getExpression_Function();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_Function#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Function</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_Function#getFunction()
	 * @see #getExpression_Function()
	 * @generated
	 */
	EReference getExpression_Function_Function();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_TableConstructor <em>Expression Table Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Table Constructor</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_TableConstructor
	 * @generated
	 */
	EClass getExpression_TableConstructor();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_TableConstructor#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_TableConstructor#getFields()
	 * @see #getExpression_TableConstructor()
	 * @generated
	 */
	EReference getExpression_TableConstructor_Fields();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the attribute list '{@link fr.inria.diverse.iot2.iot2.iot2.Function#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Parameters</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Function#getParameters()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.iot2.iot2.iot2.Function#isVarArgs <em>Var Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Args</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Function#isVarArgs()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_VarArgs();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.iot2.iot2.iot2.Function#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Function#getBody()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Body();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.Functioncall_Arguments <em>Functioncall Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functioncall Arguments</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Functioncall_Arguments
	 * @generated
	 */
	EClass getFunctioncall_Arguments();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.iot2.iot2.iot2.Functioncall_Arguments#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Functioncall_Arguments#getArguments()
	 * @see #getFunctioncall_Arguments()
	 * @generated
	 */
	EReference getFunctioncall_Arguments_Arguments();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.Field_AddEntryToTable_Brackets <em>Field Add Entry To Table Brackets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Add Entry To Table Brackets</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Field_AddEntryToTable_Brackets
	 * @generated
	 */
	EClass getField_AddEntryToTable_Brackets();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.iot2.iot2.iot2.Field_AddEntryToTable_Brackets#getIndexExpression <em>Index Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Index Expression</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Field_AddEntryToTable_Brackets#getIndexExpression()
	 * @see #getField_AddEntryToTable_Brackets()
	 * @generated
	 */
	EReference getField_AddEntryToTable_Brackets_IndexExpression();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.Field_AddEntryToTable <em>Field Add Entry To Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Add Entry To Table</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Field_AddEntryToTable
	 * @generated
	 */
	EClass getField_AddEntryToTable();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.iot2.iot2.iot2.Field_AddEntryToTable#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Field_AddEntryToTable#getKey()
	 * @see #getField_AddEntryToTable()
	 * @generated
	 */
	EAttribute getField_AddEntryToTable_Key();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.Field_AppendEntryToTable <em>Field Append Entry To Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Append Entry To Table</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Field_AppendEntryToTable
	 * @generated
	 */
	EClass getField_AppendEntryToTable();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.LastStatement_ReturnWithValue <em>Last Statement Return With Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Last Statement Return With Value</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.LastStatement_ReturnWithValue
	 * @generated
	 */
	EClass getLastStatement_ReturnWithValue();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.iot2.iot2.iot2.LastStatement_ReturnWithValue#getReturnValues <em>Return Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Return Values</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.LastStatement_ReturnWithValue#getReturnValues()
	 * @see #getLastStatement_ReturnWithValue()
	 * @generated
	 */
	EReference getLastStatement_ReturnWithValue_ReturnValues();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.Statement_Assignment <em>Statement Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement Assignment</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Statement_Assignment
	 * @generated
	 */
	EClass getStatement_Assignment();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.iot2.iot2.iot2.Statement_Assignment#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Statement_Assignment#getVariable()
	 * @see #getStatement_Assignment()
	 * @generated
	 */
	EReference getStatement_Assignment_Variable();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.iot2.iot2.iot2.Statement_Assignment#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Statement_Assignment#getValues()
	 * @see #getStatement_Assignment()
	 * @generated
	 */
	EReference getStatement_Assignment_Values();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.Statement_CallMemberFunction <em>Statement Call Member Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement Call Member Function</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Statement_CallMemberFunction
	 * @generated
	 */
	EClass getStatement_CallMemberFunction();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.iot2.iot2.iot2.Statement_CallMemberFunction#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Statement_CallMemberFunction#getObject()
	 * @see #getStatement_CallMemberFunction()
	 * @generated
	 */
	EReference getStatement_CallMemberFunction_Object();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.iot2.iot2.iot2.Statement_CallMemberFunction#getMemberFunctionName <em>Member Function Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Member Function Name</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Statement_CallMemberFunction#getMemberFunctionName()
	 * @see #getStatement_CallMemberFunction()
	 * @generated
	 */
	EAttribute getStatement_CallMemberFunction_MemberFunctionName();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.iot2.iot2.iot2.Statement_CallMemberFunction#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arguments</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Statement_CallMemberFunction#getArguments()
	 * @see #getStatement_CallMemberFunction()
	 * @generated
	 */
	EReference getStatement_CallMemberFunction_Arguments();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.Statement_CallFunction <em>Statement Call Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement Call Function</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Statement_CallFunction
	 * @generated
	 */
	EClass getStatement_CallFunction();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.iot2.iot2.iot2.Statement_CallFunction#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Statement_CallFunction#getObject()
	 * @see #getStatement_CallFunction()
	 * @generated
	 */
	EReference getStatement_CallFunction_Object();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.iot2.iot2.iot2.Statement_CallFunction#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arguments</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Statement_CallFunction#getArguments()
	 * @see #getStatement_CallFunction()
	 * @generated
	 */
	EReference getStatement_CallFunction_Arguments();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_Or <em>Expression Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Or</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_Or
	 * @generated
	 */
	EClass getExpression_Or();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_Or#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_Or#getLeft()
	 * @see #getExpression_Or()
	 * @generated
	 */
	EReference getExpression_Or_Left();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_Or#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_Or#getRight()
	 * @see #getExpression_Or()
	 * @generated
	 */
	EReference getExpression_Or_Right();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_And <em>Expression And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression And</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_And
	 * @generated
	 */
	EClass getExpression_And();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_And#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_And#getLeft()
	 * @see #getExpression_And()
	 * @generated
	 */
	EReference getExpression_And_Left();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_And#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_And#getRight()
	 * @see #getExpression_And()
	 * @generated
	 */
	EReference getExpression_And_Right();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_Larger <em>Expression Larger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Larger</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_Larger
	 * @generated
	 */
	EClass getExpression_Larger();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_Larger#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_Larger#getLeft()
	 * @see #getExpression_Larger()
	 * @generated
	 */
	EReference getExpression_Larger_Left();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_Larger#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_Larger#getRight()
	 * @see #getExpression_Larger()
	 * @generated
	 */
	EReference getExpression_Larger_Right();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_Larger_Equal <em>Expression Larger Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Larger Equal</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_Larger_Equal
	 * @generated
	 */
	EClass getExpression_Larger_Equal();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_Larger_Equal#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_Larger_Equal#getLeft()
	 * @see #getExpression_Larger_Equal()
	 * @generated
	 */
	EReference getExpression_Larger_Equal_Left();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_Larger_Equal#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_Larger_Equal#getRight()
	 * @see #getExpression_Larger_Equal()
	 * @generated
	 */
	EReference getExpression_Larger_Equal_Right();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_Smaller <em>Expression Smaller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Smaller</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_Smaller
	 * @generated
	 */
	EClass getExpression_Smaller();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_Smaller#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_Smaller#getLeft()
	 * @see #getExpression_Smaller()
	 * @generated
	 */
	EReference getExpression_Smaller_Left();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_Smaller#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_Smaller#getRight()
	 * @see #getExpression_Smaller()
	 * @generated
	 */
	EReference getExpression_Smaller_Right();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_Smaller_Equal <em>Expression Smaller Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Smaller Equal</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_Smaller_Equal
	 * @generated
	 */
	EClass getExpression_Smaller_Equal();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_Smaller_Equal#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_Smaller_Equal#getLeft()
	 * @see #getExpression_Smaller_Equal()
	 * @generated
	 */
	EReference getExpression_Smaller_Equal_Left();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_Smaller_Equal#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_Smaller_Equal#getRight()
	 * @see #getExpression_Smaller_Equal()
	 * @generated
	 */
	EReference getExpression_Smaller_Equal_Right();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_Equal <em>Expression Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Equal</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_Equal
	 * @generated
	 */
	EClass getExpression_Equal();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_Equal#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_Equal#getLeft()
	 * @see #getExpression_Equal()
	 * @generated
	 */
	EReference getExpression_Equal_Left();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_Equal#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_Equal#getRight()
	 * @see #getExpression_Equal()
	 * @generated
	 */
	EReference getExpression_Equal_Right();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_Not_Equal <em>Expression Not Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Not Equal</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_Not_Equal
	 * @generated
	 */
	EClass getExpression_Not_Equal();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_Not_Equal#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_Not_Equal#getLeft()
	 * @see #getExpression_Not_Equal()
	 * @generated
	 */
	EReference getExpression_Not_Equal_Left();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_Not_Equal#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_Not_Equal#getRight()
	 * @see #getExpression_Not_Equal()
	 * @generated
	 */
	EReference getExpression_Not_Equal_Right();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_Concatenation <em>Expression Concatenation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Concatenation</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_Concatenation
	 * @generated
	 */
	EClass getExpression_Concatenation();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_Concatenation#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_Concatenation#getLeft()
	 * @see #getExpression_Concatenation()
	 * @generated
	 */
	EReference getExpression_Concatenation_Left();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_Concatenation#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_Concatenation#getRight()
	 * @see #getExpression_Concatenation()
	 * @generated
	 */
	EReference getExpression_Concatenation_Right();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_Plus <em>Expression Plus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Plus</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_Plus
	 * @generated
	 */
	EClass getExpression_Plus();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_Plus#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_Plus#getLeft()
	 * @see #getExpression_Plus()
	 * @generated
	 */
	EReference getExpression_Plus_Left();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_Plus#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_Plus#getRight()
	 * @see #getExpression_Plus()
	 * @generated
	 */
	EReference getExpression_Plus_Right();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_Minus <em>Expression Minus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Minus</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_Minus
	 * @generated
	 */
	EClass getExpression_Minus();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_Minus#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_Minus#getLeft()
	 * @see #getExpression_Minus()
	 * @generated
	 */
	EReference getExpression_Minus_Left();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_Minus#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_Minus#getRight()
	 * @see #getExpression_Minus()
	 * @generated
	 */
	EReference getExpression_Minus_Right();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_Multiplication <em>Expression Multiplication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Multiplication</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_Multiplication
	 * @generated
	 */
	EClass getExpression_Multiplication();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_Multiplication#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_Multiplication#getLeft()
	 * @see #getExpression_Multiplication()
	 * @generated
	 */
	EReference getExpression_Multiplication_Left();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_Multiplication#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_Multiplication#getRight()
	 * @see #getExpression_Multiplication()
	 * @generated
	 */
	EReference getExpression_Multiplication_Right();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_Division <em>Expression Division</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Division</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_Division
	 * @generated
	 */
	EClass getExpression_Division();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_Division#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_Division#getLeft()
	 * @see #getExpression_Division()
	 * @generated
	 */
	EReference getExpression_Division_Left();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_Division#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_Division#getRight()
	 * @see #getExpression_Division()
	 * @generated
	 */
	EReference getExpression_Division_Right();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_Modulo <em>Expression Modulo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Modulo</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_Modulo
	 * @generated
	 */
	EClass getExpression_Modulo();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_Modulo#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_Modulo#getLeft()
	 * @see #getExpression_Modulo()
	 * @generated
	 */
	EReference getExpression_Modulo_Left();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_Modulo#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_Modulo#getRight()
	 * @see #getExpression_Modulo()
	 * @generated
	 */
	EReference getExpression_Modulo_Right();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_Negate <em>Expression Negate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Negate</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_Negate
	 * @generated
	 */
	EClass getExpression_Negate();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_Negate#getExp <em>Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exp</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_Negate#getExp()
	 * @see #getExpression_Negate()
	 * @generated
	 */
	EReference getExpression_Negate_Exp();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_Length <em>Expression Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Length</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_Length
	 * @generated
	 */
	EClass getExpression_Length();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_Length#getExp <em>Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exp</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_Length#getExp()
	 * @see #getExpression_Length()
	 * @generated
	 */
	EReference getExpression_Length_Exp();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_Invert <em>Expression Invert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Invert</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_Invert
	 * @generated
	 */
	EClass getExpression_Invert();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_Invert#getExp <em>Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exp</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_Invert#getExp()
	 * @see #getExpression_Invert()
	 * @generated
	 */
	EReference getExpression_Invert_Exp();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_Exponentiation <em>Expression Exponentiation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Exponentiation</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_Exponentiation
	 * @generated
	 */
	EClass getExpression_Exponentiation();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_Exponentiation#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_Exponentiation#getLeft()
	 * @see #getExpression_Exponentiation()
	 * @generated
	 */
	EReference getExpression_Exponentiation_Left();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_Exponentiation#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_Exponentiation#getRight()
	 * @see #getExpression_Exponentiation()
	 * @generated
	 */
	EReference getExpression_Exponentiation_Right();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_CallMemberFunction <em>Expression Call Member Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Call Member Function</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_CallMemberFunction
	 * @generated
	 */
	EClass getExpression_CallMemberFunction();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_CallMemberFunction#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_CallMemberFunction#getObject()
	 * @see #getExpression_CallMemberFunction()
	 * @generated
	 */
	EReference getExpression_CallMemberFunction_Object();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_CallMemberFunction#getMemberFunctionName <em>Member Function Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Member Function Name</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_CallMemberFunction#getMemberFunctionName()
	 * @see #getExpression_CallMemberFunction()
	 * @generated
	 */
	EAttribute getExpression_CallMemberFunction_MemberFunctionName();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_CallMemberFunction#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arguments</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_CallMemberFunction#getArguments()
	 * @see #getExpression_CallMemberFunction()
	 * @generated
	 */
	EReference getExpression_CallMemberFunction_Arguments();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_CallFunction <em>Expression Call Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Call Function</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_CallFunction
	 * @generated
	 */
	EClass getExpression_CallFunction();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_CallFunction#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_CallFunction#getObject()
	 * @see #getExpression_CallFunction()
	 * @generated
	 */
	EReference getExpression_CallFunction_Object();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_CallFunction#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arguments</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_CallFunction#getArguments()
	 * @see #getExpression_CallFunction()
	 * @generated
	 */
	EReference getExpression_CallFunction_Arguments();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_AccessArray <em>Expression Access Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Access Array</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_AccessArray
	 * @generated
	 */
	EClass getExpression_AccessArray();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_AccessArray#getArray <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Array</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_AccessArray#getArray()
	 * @see #getExpression_AccessArray()
	 * @generated
	 */
	EReference getExpression_AccessArray_Array();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_AccessArray#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Index</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_AccessArray#getIndex()
	 * @see #getExpression_AccessArray()
	 * @generated
	 */
	EReference getExpression_AccessArray_Index();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_AccessMember <em>Expression Access Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Access Member</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_AccessMember
	 * @generated
	 */
	EClass getExpression_AccessMember();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_AccessMember#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_AccessMember#getObject()
	 * @see #getExpression_AccessMember()
	 * @generated
	 */
	EReference getExpression_AccessMember_Object();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_AccessMember#getMemberName <em>Member Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Member Name</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_AccessMember#getMemberName()
	 * @see #getExpression_AccessMember()
	 * @generated
	 */
	EAttribute getExpression_AccessMember_MemberName();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_VariableName <em>Expression Variable Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Variable Name</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_VariableName
	 * @generated
	 */
	EClass getExpression_VariableName();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_VariableName#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_VariableName#getVariable()
	 * @see #getExpression_VariableName()
	 * @generated
	 */
	EAttribute getExpression_VariableName_Variable();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.ActivityNode <em>Activity Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Node</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.ActivityNode
	 * @generated
	 */
	EClass getActivityNode();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.diverse.iot2.iot2.iot2.ActivityNode#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.ActivityNode#getOutgoing()
	 * @see #getActivityNode()
	 * @generated
	 */
	EReference getActivityNode_Outgoing();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.diverse.iot2.iot2.iot2.ActivityNode#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.ActivityNode#getIncoming()
	 * @see #getActivityNode()
	 * @generated
	 */
	EReference getActivityNode_Incoming();

	/**
	 * Returns the meta object for the container reference '{@link fr.inria.diverse.iot2.iot2.iot2.ActivityNode#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Activity</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.ActivityNode#getActivity()
	 * @see #getActivityNode()
	 * @generated
	 */
	EReference getActivityNode_Activity();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.iot2.iot2.iot2.ActivityNode#isRunning <em>Running</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Running</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.ActivityNode#isRunning()
	 * @see #getActivityNode()
	 * @generated
	 */
	EAttribute getActivityNode_Running();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.ActivityEdge <em>Activity Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Edge</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.ActivityEdge
	 * @generated
	 */
	EClass getActivityEdge();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.diverse.iot2.iot2.iot2.ActivityEdge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.ActivityEdge#getSource()
	 * @see #getActivityEdge()
	 * @generated
	 */
	EReference getActivityEdge_Source();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.diverse.iot2.iot2.iot2.ActivityEdge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.ActivityEdge#getTarget()
	 * @see #getActivityEdge()
	 * @generated
	 */
	EReference getActivityEdge_Target();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.ControlFlow <em>Control Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Flow</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.ControlFlow
	 * @generated
	 */
	EClass getControlFlow();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.diverse.iot2.iot2.iot2.ControlFlow#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Guard</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.ControlFlow#getGuard()
	 * @see #getControlFlow()
	 * @generated
	 */
	EReference getControlFlow_Guard();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.ControlNode <em>Control Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Node</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.ControlNode
	 * @generated
	 */
	EClass getControlNode();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.ExecutableNode <em>Executable Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Executable Node</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.ExecutableNode
	 * @generated
	 */
	EClass getExecutableNode();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.OpaqueAction <em>Opaque Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opaque Action</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.OpaqueAction
	 * @generated
	 */
	EClass getOpaqueAction();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.diverse.iot2.iot2.iot2.OpaqueAction#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Expressions</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.OpaqueAction#getExpressions()
	 * @see #getOpaqueAction()
	 * @generated
	 */
	EReference getOpaqueAction_Expressions();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.diverse.iot2.iot2.iot2.OpaqueAction#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.OpaqueAction#getService()
	 * @see #getOpaqueAction()
	 * @generated
	 */
	EReference getOpaqueAction_Service();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.InitialNode <em>Initial Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial Node</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.InitialNode
	 * @generated
	 */
	EClass getInitialNode();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.FinalNode <em>Final Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final Node</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.FinalNode
	 * @generated
	 */
	EClass getFinalNode();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.ActivityFinalNode <em>Activity Final Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Final Node</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.ActivityFinalNode
	 * @generated
	 */
	EClass getActivityFinalNode();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.ForkNode <em>Fork Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fork Node</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.ForkNode
	 * @generated
	 */
	EClass getForkNode();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.JoinNode <em>Join Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join Node</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.JoinNode
	 * @generated
	 */
	EClass getJoinNode();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.MergeNode <em>Merge Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merge Node</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.MergeNode
	 * @generated
	 */
	EClass getMergeNode();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.DecisionNode <em>Decision Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision Node</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.DecisionNode
	 * @generated
	 */
	EClass getDecisionNode();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.iot2.iot2.iot2.Variable#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initial Value</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Variable#getInitialValue()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_InitialValue();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.iot2.iot2.iot2.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.iot2.iot2.iot2.Variable#getCurrentValue <em>Current Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Current Value</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Variable#getCurrentValue()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_CurrentValue();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.IntegerVariable <em>Integer Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Variable</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.IntegerVariable
	 * @generated
	 */
	EClass getIntegerVariable();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.BooleanVariable <em>Boolean Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Variable</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.BooleanVariable
	 * @generated
	 */
	EClass getBooleanVariable();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.BooleanValue <em>Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Value</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.BooleanValue
	 * @generated
	 */
	EClass getBooleanValue();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.iot2.iot2.iot2.BooleanValue#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.BooleanValue#isValue()
	 * @see #getBooleanValue()
	 * @generated
	 */
	EAttribute getBooleanValue_Value();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.IntegerValue <em>Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Value</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.IntegerValue
	 * @generated
	 */
	EClass getIntegerValue();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.iot2.iot2.iot2.IntegerValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.IntegerValue#getValue()
	 * @see #getIntegerValue()
	 * @generated
	 */
	EAttribute getIntegerValue_Value();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.IntegerExpression <em>Integer Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Expression</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.IntegerExpression
	 * @generated
	 */
	EClass getIntegerExpression();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.diverse.iot2.iot2.iot2.IntegerExpression#getOperand2 <em>Operand2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operand2</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.IntegerExpression#getOperand2()
	 * @see #getIntegerExpression()
	 * @generated
	 */
	EReference getIntegerExpression_Operand2();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.diverse.iot2.iot2.iot2.IntegerExpression#getOperand1 <em>Operand1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operand1</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.IntegerExpression#getOperand1()
	 * @see #getIntegerExpression()
	 * @generated
	 */
	EReference getIntegerExpression_Operand1();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.BooleanExpression <em>Boolean Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Expression</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.BooleanExpression
	 * @generated
	 */
	EClass getBooleanExpression();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.diverse.iot2.iot2.iot2.BooleanExpression#getAssignee <em>Assignee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assignee</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.BooleanExpression#getAssignee()
	 * @see #getBooleanExpression()
	 * @generated
	 */
	EReference getBooleanExpression_Assignee();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.IntegerCalculationExpression <em>Integer Calculation Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Calculation Expression</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.IntegerCalculationExpression
	 * @generated
	 */
	EClass getIntegerCalculationExpression();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.diverse.iot2.iot2.iot2.IntegerCalculationExpression#getAssignee <em>Assignee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assignee</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.IntegerCalculationExpression#getAssignee()
	 * @see #getIntegerCalculationExpression()
	 * @generated
	 */
	EReference getIntegerCalculationExpression_Assignee();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.iot2.iot2.iot2.IntegerCalculationExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.IntegerCalculationExpression#getOperator()
	 * @see #getIntegerCalculationExpression()
	 * @generated
	 */
	EAttribute getIntegerCalculationExpression_Operator();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.IntegerComparisonExpression <em>Integer Comparison Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Comparison Expression</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.IntegerComparisonExpression
	 * @generated
	 */
	EClass getIntegerComparisonExpression();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.diverse.iot2.iot2.iot2.IntegerComparisonExpression#getAssignee <em>Assignee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assignee</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.IntegerComparisonExpression#getAssignee()
	 * @see #getIntegerComparisonExpression()
	 * @generated
	 */
	EReference getIntegerComparisonExpression_Assignee();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.iot2.iot2.iot2.IntegerComparisonExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.IntegerComparisonExpression#getOperator()
	 * @see #getIntegerComparisonExpression()
	 * @generated
	 */
	EAttribute getIntegerComparisonExpression_Operator();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.BooleanUnaryExpression <em>Boolean Unary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Unary Expression</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.BooleanUnaryExpression
	 * @generated
	 */
	EClass getBooleanUnaryExpression();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.diverse.iot2.iot2.iot2.BooleanUnaryExpression#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operand</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.BooleanUnaryExpression#getOperand()
	 * @see #getBooleanUnaryExpression()
	 * @generated
	 */
	EReference getBooleanUnaryExpression_Operand();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.iot2.iot2.iot2.BooleanUnaryExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.BooleanUnaryExpression#getOperator()
	 * @see #getBooleanUnaryExpression()
	 * @generated
	 */
	EAttribute getBooleanUnaryExpression_Operator();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.BooleanBinaryExpression <em>Boolean Binary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Binary Expression</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.BooleanBinaryExpression
	 * @generated
	 */
	EClass getBooleanBinaryExpression();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.diverse.iot2.iot2.iot2.BooleanBinaryExpression#getOperand1 <em>Operand1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operand1</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.BooleanBinaryExpression#getOperand1()
	 * @see #getBooleanBinaryExpression()
	 * @generated
	 */
	EReference getBooleanBinaryExpression_Operand1();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.diverse.iot2.iot2.iot2.BooleanBinaryExpression#getOperand2 <em>Operand2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operand2</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.BooleanBinaryExpression#getOperand2()
	 * @see #getBooleanBinaryExpression()
	 * @generated
	 */
	EReference getBooleanBinaryExpression_Operand2();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.iot2.iot2.iot2.BooleanBinaryExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.BooleanBinaryExpression#getOperator()
	 * @see #getBooleanBinaryExpression()
	 * @generated
	 */
	EAttribute getBooleanBinaryExpression_Operator();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.InputValue <em>Input Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Value</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.InputValue
	 * @generated
	 */
	EClass getInputValue();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.iot2.iot2.iot2.InputValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.InputValue#getValue()
	 * @see #getInputValue()
	 * @generated
	 */
	EReference getInputValue_Value();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.diverse.iot2.iot2.iot2.InputValue#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.InputValue#getVariable()
	 * @see #getInputValue()
	 * @generated
	 */
	EReference getInputValue_Variable();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.iot2.iot2.iot2.Input#getInputValues <em>Input Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Values</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Input#getInputValues()
	 * @see #getInput()
	 * @generated
	 */
	EReference getInput_InputValues();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.Token <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Token</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Token
	 * @generated
	 */
	EClass getToken();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.diverse.iot2.iot2.iot2.Token#getHolder <em>Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Holder</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Token#getHolder()
	 * @see #getToken()
	 * @generated
	 */
	EReference getToken_Holder();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.iot2.iot2.iot2.Trace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Trace
	 * @generated
	 */
	EClass getTrace();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.diverse.iot2.iot2.iot2.Trace#getExecutedNodes <em>Executed Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Executed Nodes</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Trace#getExecutedNodes()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_ExecutedNodes();

	/**
	 * Returns the meta object for enum '{@link fr.inria.diverse.iot2.iot2.iot2.BoardType <em>Board Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Board Type</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.BoardType
	 * @generated
	 */
	EEnum getBoardType();

	/**
	 * Returns the meta object for enum '{@link fr.inria.diverse.iot2.iot2.iot2.ParameterMode <em>Parameter Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Parameter Mode</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.ParameterMode
	 * @generated
	 */
	EEnum getParameterMode();

	/**
	 * Returns the meta object for enum '{@link fr.inria.diverse.iot2.iot2.iot2.PrimitiveKind <em>Primitive Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Primitive Kind</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.PrimitiveKind
	 * @generated
	 */
	EEnum getPrimitiveKind();

	/**
	 * Returns the meta object for enum '{@link fr.inria.diverse.iot2.iot2.iot2.IntegerCalculationOperator <em>Integer Calculation Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Integer Calculation Operator</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.IntegerCalculationOperator
	 * @generated
	 */
	EEnum getIntegerCalculationOperator();

	/**
	 * Returns the meta object for enum '{@link fr.inria.diverse.iot2.iot2.iot2.IntegerComparisonOperator <em>Integer Comparison Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Integer Comparison Operator</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.IntegerComparisonOperator
	 * @generated
	 */
	EEnum getIntegerComparisonOperator();

	/**
	 * Returns the meta object for enum '{@link fr.inria.diverse.iot2.iot2.iot2.BooleanUnaryOperator <em>Boolean Unary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Boolean Unary Operator</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.BooleanUnaryOperator
	 * @generated
	 */
	EEnum getBooleanUnaryOperator();

	/**
	 * Returns the meta object for enum '{@link fr.inria.diverse.iot2.iot2.iot2.BooleanBinaryOperator <em>Boolean Binary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Boolean Binary Operator</em>'.
	 * @see fr.inria.diverse.iot2.iot2.iot2.BooleanBinaryOperator
	 * @generated
	 */
	EEnum getBooleanBinaryOperator();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>EType Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EType Code</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getETypeCode();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Object</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getObject();

	/**
	 * Returns the meta object for data type '{@link java.util.Stack <em>Stack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Stack</em>'.
	 * @see java.util.Stack
	 * @model instanceClass="java.util.Stack"
	 * @generated
	 */
	EDataType getStack();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Iot2Factory getIot2Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.SystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.SystemImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getSystem()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getSystem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__NAME = eINSTANCE.getSystem_Name();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__COMPONENTS = eINSTANCE.getSystem_Components();

		/**
		 * The meta object literal for the '<em><b>Boards</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__BOARDS = eINSTANCE.getSystem_Boards();

		/**
		 * The meta object literal for the '<em><b>Sketch</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__SKETCH = eINSTANCE.getSystem_Sketch();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.BoardImpl <em>Board</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.BoardImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getBoard()
		 * @generated
		 */
		EClass BOARD = eINSTANCE.getBoard();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOARD__NAME = eINSTANCE.getBoard_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOARD__TYPE = eINSTANCE.getBoard_Type();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOARD__COMPONENTS = eINSTANCE.getBoard_Components();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.SketchImpl <em>Sketch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.SketchImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getSketch()
		 * @generated
		 */
		EClass SKETCH = eINSTANCE.getSketch();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SKETCH__ACTIVITY = eINSTANCE.getSketch_Activity();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.HWComponentImpl <em>HW Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.HWComponentImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getHWComponent()
		 * @generated
		 */
		EClass HW_COMPONENT = eINSTANCE.getHWComponent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HW_COMPONENT__NAME = eINSTANCE.getHWComponent_Name();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_COMPONENT__SERVICES = eINSTANCE.getHWComponent_Services();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.SensorImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.ActuatorImpl <em>Actuator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.ActuatorImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getActuator()
		 * @generated
		 */
		EClass ACTUATOR = eINSTANCE.getActuator();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.ActivityImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__NODES = eINSTANCE.getActivity_Nodes();

		/**
		 * The meta object literal for the '<em><b>Edges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__EDGES = eINSTANCE.getActivity_Edges();

		/**
		 * The meta object literal for the '<em><b>Locals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__LOCALS = eINSTANCE.getActivity_Locals();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__INPUTS = eINSTANCE.getActivity_Inputs();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.OperationDefImpl <em>Operation Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.OperationDefImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getOperationDef()
		 * @generated
		 */
		EClass OPERATION_DEF = eINSTANCE.getOperationDef();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_DEF__PARAMETERS = eINSTANCE.getOperationDef_Parameters();

		/**
		 * The meta object literal for the '<em><b>Is Oneway</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_DEF__IS_ONEWAY = eINSTANCE.getOperationDef_IsOneway();

		/**
		 * The meta object literal for the '<em><b>Contexts</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_DEF__CONTEXTS = eINSTANCE.getOperationDef_Contexts();

		/**
		 * The meta object literal for the '<em><b>Can Raise</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_DEF__CAN_RAISE = eINSTANCE.getOperationDef_CanRaise();

		/**
		 * The meta object literal for the '<em><b>Lua</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_DEF__LUA = eINSTANCE.getOperationDef_Lua();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.ContainedImpl <em>Contained</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.ContainedImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getContained()
		 * @generated
		 */
		EClass CONTAINED = eINSTANCE.getContained();

		/**
		 * The meta object literal for the '<em><b>Repository Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINED__REPOSITORY_ID = eINSTANCE.getContained_RepositoryId();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINED__VERSION = eINSTANCE.getContained_Version();

		/**
		 * The meta object literal for the '<em><b>Absolute Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINED__ABSOLUTE_NAME = eINSTANCE.getContained_AbsoluteName();

		/**
		 * The meta object literal for the '<em><b>Defined In</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINED__DEFINED_IN = eINSTANCE.getContained_DefinedIn();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.NamedElementImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__IDENTIFIER = eINSTANCE.getNamedElement_Identifier();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.ContainerImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__CONTAINS = eINSTANCE.getContainer_Contains();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.TypedImpl <em>Typed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.TypedImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getTyped()
		 * @generated
		 */
		EClass TYPED = eINSTANCE.getTyped();

		/**
		 * The meta object literal for the '<em><b>Contained Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPED__CONTAINED_TYPE = eINSTANCE.getTyped_ContainedType();

		/**
		 * The meta object literal for the '<em><b>Shared Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPED__SHARED_TYPE = eINSTANCE.getTyped_SharedType();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.IDLTypeImpl <em>IDL Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.IDLTypeImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getIDLType()
		 * @generated
		 */
		EClass IDL_TYPE = eINSTANCE.getIDLType();

		/**
		 * The meta object literal for the '<em><b>Type Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDL_TYPE__TYPE_CODE = eINSTANCE.getIDLType_TypeCode();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.TypedefDefImpl <em>Typedef Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.TypedefDefImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getTypedefDef()
		 * @generated
		 */
		EClass TYPEDEF_DEF = eINSTANCE.getTypedefDef();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.ParameterDefImpl <em>Parameter Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.ParameterDefImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getParameterDef()
		 * @generated
		 */
		EClass PARAMETER_DEF = eINSTANCE.getParameterDef();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_DEF__IDENTIFIER = eINSTANCE.getParameterDef_Identifier();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_DEF__DIRECTION = eINSTANCE.getParameterDef_Direction();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.ExceptionDefImpl <em>Exception Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.ExceptionDefImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getExceptionDef()
		 * @generated
		 */
		EClass EXCEPTION_DEF = eINSTANCE.getExceptionDef();

		/**
		 * The meta object literal for the '<em><b>Type Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEPTION_DEF__TYPE_CODE = eINSTANCE.getExceptionDef_TypeCode();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCEPTION_DEF__MEMBERS = eINSTANCE.getExceptionDef_Members();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.FieldImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__IDENTIFIER = eINSTANCE.getField_Identifier();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__VALUE = eINSTANCE.getField_Value();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.PrimitiveDefImpl <em>Primitive Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.PrimitiveDefImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getPrimitiveDef()
		 * @generated
		 */
		EClass PRIMITIVE_DEF = eINSTANCE.getPrimitiveDef();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMITIVE_DEF__KIND = eINSTANCE.getPrimitiveDef_Kind();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.ChunkImpl <em>Chunk</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.ChunkImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getChunk()
		 * @generated
		 */
		EClass CHUNK = eINSTANCE.getChunk();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.BlockImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__STATEMENTS = eINSTANCE.getBlock_Statements();

		/**
		 * The meta object literal for the '<em><b>Return Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__RETURN_VALUE = eINSTANCE.getBlock_ReturnValue();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.LastStatementImpl <em>Last Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.LastStatementImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getLastStatement()
		 * @generated
		 */
		EClass LAST_STATEMENT = eINSTANCE.getLastStatement();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.LastStatement_ReturnImpl <em>Last Statement Return</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.LastStatement_ReturnImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getLastStatement_Return()
		 * @generated
		 */
		EClass LAST_STATEMENT_RETURN = eINSTANCE.getLastStatement_Return();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.LastStatement_BreakImpl <em>Last Statement Break</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.LastStatement_BreakImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getLastStatement_Break()
		 * @generated
		 */
		EClass LAST_STATEMENT_BREAK = eINSTANCE.getLastStatement_Break();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.StatementImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Statement_BlockImpl <em>Statement Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Statement_BlockImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getStatement_Block()
		 * @generated
		 */
		EClass STATEMENT_BLOCK = eINSTANCE.getStatement_Block();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT_BLOCK__BLOCK = eINSTANCE.getStatement_Block_Block();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Statement_WhileImpl <em>Statement While</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Statement_WhileImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getStatement_While()
		 * @generated
		 */
		EClass STATEMENT_WHILE = eINSTANCE.getStatement_While();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT_WHILE__EXPRESSION = eINSTANCE.getStatement_While_Expression();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT_WHILE__BLOCK = eINSTANCE.getStatement_While_Block();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Statement_RepeatImpl <em>Statement Repeat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Statement_RepeatImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getStatement_Repeat()
		 * @generated
		 */
		EClass STATEMENT_REPEAT = eINSTANCE.getStatement_Repeat();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT_REPEAT__BLOCK = eINSTANCE.getStatement_Repeat_Block();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT_REPEAT__EXPRESSION = eINSTANCE.getStatement_Repeat_Expression();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Statement_If_Then_ElseImpl <em>Statement If Then Else</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Statement_If_Then_ElseImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getStatement_If_Then_Else()
		 * @generated
		 */
		EClass STATEMENT_IF_THEN_ELSE = eINSTANCE.getStatement_If_Then_Else();

		/**
		 * The meta object literal for the '<em><b>If Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT_IF_THEN_ELSE__IF_EXPRESSION = eINSTANCE.getStatement_If_Then_Else_IfExpression();

		/**
		 * The meta object literal for the '<em><b>If Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT_IF_THEN_ELSE__IF_BLOCK = eINSTANCE.getStatement_If_Then_Else_IfBlock();

		/**
		 * The meta object literal for the '<em><b>Else If</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT_IF_THEN_ELSE__ELSE_IF = eINSTANCE.getStatement_If_Then_Else_ElseIf();

		/**
		 * The meta object literal for the '<em><b>Else Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT_IF_THEN_ELSE__ELSE_BLOCK = eINSTANCE.getStatement_If_Then_Else_ElseBlock();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Statement_If_Then_Else_ElseIfPartImpl <em>Statement If Then Else Else If Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Statement_If_Then_Else_ElseIfPartImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getStatement_If_Then_Else_ElseIfPart()
		 * @generated
		 */
		EClass STATEMENT_IF_THEN_ELSE_ELSE_IF_PART = eINSTANCE.getStatement_If_Then_Else_ElseIfPart();

		/**
		 * The meta object literal for the '<em><b>Elseif Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT_IF_THEN_ELSE_ELSE_IF_PART__ELSEIF_EXPRESSION = eINSTANCE.getStatement_If_Then_Else_ElseIfPart_ElseifExpression();

		/**
		 * The meta object literal for the '<em><b>Elseif Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT_IF_THEN_ELSE_ELSE_IF_PART__ELSEIF_BLOCK = eINSTANCE.getStatement_If_Then_Else_ElseIfPart_ElseifBlock();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Statement_For_NumericImpl <em>Statement For Numeric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Statement_For_NumericImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getStatement_For_Numeric()
		 * @generated
		 */
		EClass STATEMENT_FOR_NUMERIC = eINSTANCE.getStatement_For_Numeric();

		/**
		 * The meta object literal for the '<em><b>Iterator Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATEMENT_FOR_NUMERIC__ITERATOR_NAME = eINSTANCE.getStatement_For_Numeric_IteratorName();

		/**
		 * The meta object literal for the '<em><b>Start Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT_FOR_NUMERIC__START_EXPR = eINSTANCE.getStatement_For_Numeric_StartExpr();

		/**
		 * The meta object literal for the '<em><b>Until Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT_FOR_NUMERIC__UNTIL_EXPR = eINSTANCE.getStatement_For_Numeric_UntilExpr();

		/**
		 * The meta object literal for the '<em><b>Step Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT_FOR_NUMERIC__STEP_EXPR = eINSTANCE.getStatement_For_Numeric_StepExpr();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT_FOR_NUMERIC__BLOCK = eINSTANCE.getStatement_For_Numeric_Block();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Statement_For_GenericImpl <em>Statement For Generic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Statement_For_GenericImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getStatement_For_Generic()
		 * @generated
		 */
		EClass STATEMENT_FOR_GENERIC = eINSTANCE.getStatement_For_Generic();

		/**
		 * The meta object literal for the '<em><b>Names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATEMENT_FOR_GENERIC__NAMES = eINSTANCE.getStatement_For_Generic_Names();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT_FOR_GENERIC__EXPRESSIONS = eINSTANCE.getStatement_For_Generic_Expressions();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT_FOR_GENERIC__BLOCK = eINSTANCE.getStatement_For_Generic_Block();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Statement_GlobalFunction_DeclarationImpl <em>Statement Global Function Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Statement_GlobalFunction_DeclarationImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getStatement_GlobalFunction_Declaration()
		 * @generated
		 */
		EClass STATEMENT_GLOBAL_FUNCTION_DECLARATION = eINSTANCE.getStatement_GlobalFunction_Declaration();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATEMENT_GLOBAL_FUNCTION_DECLARATION__PREFIX = eINSTANCE.getStatement_GlobalFunction_Declaration_Prefix();

		/**
		 * The meta object literal for the '<em><b>Function Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATEMENT_GLOBAL_FUNCTION_DECLARATION__FUNCTION_NAME = eINSTANCE.getStatement_GlobalFunction_Declaration_FunctionName();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT_GLOBAL_FUNCTION_DECLARATION__FUNCTION = eINSTANCE.getStatement_GlobalFunction_Declaration_Function();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Statement_LocalFunction_DeclarationImpl <em>Statement Local Function Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Statement_LocalFunction_DeclarationImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getStatement_LocalFunction_Declaration()
		 * @generated
		 */
		EClass STATEMENT_LOCAL_FUNCTION_DECLARATION = eINSTANCE.getStatement_LocalFunction_Declaration();

		/**
		 * The meta object literal for the '<em><b>Function Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATEMENT_LOCAL_FUNCTION_DECLARATION__FUNCTION_NAME = eINSTANCE.getStatement_LocalFunction_Declaration_FunctionName();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT_LOCAL_FUNCTION_DECLARATION__FUNCTION = eINSTANCE.getStatement_LocalFunction_Declaration_Function();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Statement_Local_Variable_DeclarationImpl <em>Statement Local Variable Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Statement_Local_Variable_DeclarationImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getStatement_Local_Variable_Declaration()
		 * @generated
		 */
		EClass STATEMENT_LOCAL_VARIABLE_DECLARATION = eINSTANCE.getStatement_Local_Variable_Declaration();

		/**
		 * The meta object literal for the '<em><b>Variable Names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATEMENT_LOCAL_VARIABLE_DECLARATION__VARIABLE_NAMES = eINSTANCE.getStatement_Local_Variable_Declaration_VariableNames();

		/**
		 * The meta object literal for the '<em><b>Initial Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT_LOCAL_VARIABLE_DECLARATION__INITIAL_VALUE = eINSTANCE.getStatement_Local_Variable_Declaration_InitialValue();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Statement_FunctioncallOrAssignmentImpl <em>Statement Functioncall Or Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Statement_FunctioncallOrAssignmentImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getStatement_FunctioncallOrAssignment()
		 * @generated
		 */
		EClass STATEMENT_FUNCTIONCALL_OR_ASSIGNMENT = eINSTANCE.getStatement_FunctioncallOrAssignment();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.ExpressionImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Expression_NilImpl <em>Expression Nil</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Expression_NilImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getExpression_Nil()
		 * @generated
		 */
		EClass EXPRESSION_NIL = eINSTANCE.getExpression_Nil();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Expression_TrueImpl <em>Expression True</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Expression_TrueImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getExpression_True()
		 * @generated
		 */
		EClass EXPRESSION_TRUE = eINSTANCE.getExpression_True();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Expression_FalseImpl <em>Expression False</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Expression_FalseImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getExpression_False()
		 * @generated
		 */
		EClass EXPRESSION_FALSE = eINSTANCE.getExpression_False();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Expression_NumberImpl <em>Expression Number</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Expression_NumberImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getExpression_Number()
		 * @generated
		 */
		EClass EXPRESSION_NUMBER = eINSTANCE.getExpression_Number();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION_NUMBER__VALUE = eINSTANCE.getExpression_Number_Value();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Expression_VarArgsImpl <em>Expression Var Args</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Expression_VarArgsImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getExpression_VarArgs()
		 * @generated
		 */
		EClass EXPRESSION_VAR_ARGS = eINSTANCE.getExpression_VarArgs();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Expression_StringImpl <em>Expression String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Expression_StringImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getExpression_String()
		 * @generated
		 */
		EClass EXPRESSION_STRING = eINSTANCE.getExpression_String();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION_STRING__VALUE = eINSTANCE.getExpression_String_Value();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Expression_FunctionImpl <em>Expression Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Expression_FunctionImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getExpression_Function()
		 * @generated
		 */
		EClass EXPRESSION_FUNCTION = eINSTANCE.getExpression_Function();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_FUNCTION__FUNCTION = eINSTANCE.getExpression_Function_Function();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Expression_TableConstructorImpl <em>Expression Table Constructor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Expression_TableConstructorImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getExpression_TableConstructor()
		 * @generated
		 */
		EClass EXPRESSION_TABLE_CONSTRUCTOR = eINSTANCE.getExpression_TableConstructor();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_TABLE_CONSTRUCTOR__FIELDS = eINSTANCE.getExpression_TableConstructor_Fields();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.FunctionImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__PARAMETERS = eINSTANCE.getFunction_Parameters();

		/**
		 * The meta object literal for the '<em><b>Var Args</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__VAR_ARGS = eINSTANCE.getFunction_VarArgs();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__BODY = eINSTANCE.getFunction_Body();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Functioncall_ArgumentsImpl <em>Functioncall Arguments</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Functioncall_ArgumentsImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getFunctioncall_Arguments()
		 * @generated
		 */
		EClass FUNCTIONCALL_ARGUMENTS = eINSTANCE.getFunctioncall_Arguments();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONCALL_ARGUMENTS__ARGUMENTS = eINSTANCE.getFunctioncall_Arguments_Arguments();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Field_AddEntryToTable_BracketsImpl <em>Field Add Entry To Table Brackets</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Field_AddEntryToTable_BracketsImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getField_AddEntryToTable_Brackets()
		 * @generated
		 */
		EClass FIELD_ADD_ENTRY_TO_TABLE_BRACKETS = eINSTANCE.getField_AddEntryToTable_Brackets();

		/**
		 * The meta object literal for the '<em><b>Index Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_ADD_ENTRY_TO_TABLE_BRACKETS__INDEX_EXPRESSION = eINSTANCE.getField_AddEntryToTable_Brackets_IndexExpression();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Field_AddEntryToTableImpl <em>Field Add Entry To Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Field_AddEntryToTableImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getField_AddEntryToTable()
		 * @generated
		 */
		EClass FIELD_ADD_ENTRY_TO_TABLE = eINSTANCE.getField_AddEntryToTable();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_ADD_ENTRY_TO_TABLE__KEY = eINSTANCE.getField_AddEntryToTable_Key();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Field_AppendEntryToTableImpl <em>Field Append Entry To Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Field_AppendEntryToTableImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getField_AppendEntryToTable()
		 * @generated
		 */
		EClass FIELD_APPEND_ENTRY_TO_TABLE = eINSTANCE.getField_AppendEntryToTable();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.LastStatement_ReturnWithValueImpl <em>Last Statement Return With Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.LastStatement_ReturnWithValueImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getLastStatement_ReturnWithValue()
		 * @generated
		 */
		EClass LAST_STATEMENT_RETURN_WITH_VALUE = eINSTANCE.getLastStatement_ReturnWithValue();

		/**
		 * The meta object literal for the '<em><b>Return Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAST_STATEMENT_RETURN_WITH_VALUE__RETURN_VALUES = eINSTANCE.getLastStatement_ReturnWithValue_ReturnValues();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Statement_AssignmentImpl <em>Statement Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Statement_AssignmentImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getStatement_Assignment()
		 * @generated
		 */
		EClass STATEMENT_ASSIGNMENT = eINSTANCE.getStatement_Assignment();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT_ASSIGNMENT__VARIABLE = eINSTANCE.getStatement_Assignment_Variable();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT_ASSIGNMENT__VALUES = eINSTANCE.getStatement_Assignment_Values();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Statement_CallMemberFunctionImpl <em>Statement Call Member Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Statement_CallMemberFunctionImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getStatement_CallMemberFunction()
		 * @generated
		 */
		EClass STATEMENT_CALL_MEMBER_FUNCTION = eINSTANCE.getStatement_CallMemberFunction();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT_CALL_MEMBER_FUNCTION__OBJECT = eINSTANCE.getStatement_CallMemberFunction_Object();

		/**
		 * The meta object literal for the '<em><b>Member Function Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATEMENT_CALL_MEMBER_FUNCTION__MEMBER_FUNCTION_NAME = eINSTANCE.getStatement_CallMemberFunction_MemberFunctionName();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT_CALL_MEMBER_FUNCTION__ARGUMENTS = eINSTANCE.getStatement_CallMemberFunction_Arguments();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Statement_CallFunctionImpl <em>Statement Call Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Statement_CallFunctionImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getStatement_CallFunction()
		 * @generated
		 */
		EClass STATEMENT_CALL_FUNCTION = eINSTANCE.getStatement_CallFunction();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT_CALL_FUNCTION__OBJECT = eINSTANCE.getStatement_CallFunction_Object();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT_CALL_FUNCTION__ARGUMENTS = eINSTANCE.getStatement_CallFunction_Arguments();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Expression_OrImpl <em>Expression Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Expression_OrImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getExpression_Or()
		 * @generated
		 */
		EClass EXPRESSION_OR = eINSTANCE.getExpression_Or();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_OR__LEFT = eINSTANCE.getExpression_Or_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_OR__RIGHT = eINSTANCE.getExpression_Or_Right();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Expression_AndImpl <em>Expression And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Expression_AndImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getExpression_And()
		 * @generated
		 */
		EClass EXPRESSION_AND = eINSTANCE.getExpression_And();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_AND__LEFT = eINSTANCE.getExpression_And_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_AND__RIGHT = eINSTANCE.getExpression_And_Right();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Expression_LargerImpl <em>Expression Larger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Expression_LargerImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getExpression_Larger()
		 * @generated
		 */
		EClass EXPRESSION_LARGER = eINSTANCE.getExpression_Larger();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_LARGER__LEFT = eINSTANCE.getExpression_Larger_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_LARGER__RIGHT = eINSTANCE.getExpression_Larger_Right();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Expression_Larger_EqualImpl <em>Expression Larger Equal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Expression_Larger_EqualImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getExpression_Larger_Equal()
		 * @generated
		 */
		EClass EXPRESSION_LARGER_EQUAL = eINSTANCE.getExpression_Larger_Equal();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_LARGER_EQUAL__LEFT = eINSTANCE.getExpression_Larger_Equal_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_LARGER_EQUAL__RIGHT = eINSTANCE.getExpression_Larger_Equal_Right();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Expression_SmallerImpl <em>Expression Smaller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Expression_SmallerImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getExpression_Smaller()
		 * @generated
		 */
		EClass EXPRESSION_SMALLER = eINSTANCE.getExpression_Smaller();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_SMALLER__LEFT = eINSTANCE.getExpression_Smaller_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_SMALLER__RIGHT = eINSTANCE.getExpression_Smaller_Right();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Expression_Smaller_EqualImpl <em>Expression Smaller Equal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Expression_Smaller_EqualImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getExpression_Smaller_Equal()
		 * @generated
		 */
		EClass EXPRESSION_SMALLER_EQUAL = eINSTANCE.getExpression_Smaller_Equal();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_SMALLER_EQUAL__LEFT = eINSTANCE.getExpression_Smaller_Equal_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_SMALLER_EQUAL__RIGHT = eINSTANCE.getExpression_Smaller_Equal_Right();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Expression_EqualImpl <em>Expression Equal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Expression_EqualImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getExpression_Equal()
		 * @generated
		 */
		EClass EXPRESSION_EQUAL = eINSTANCE.getExpression_Equal();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_EQUAL__LEFT = eINSTANCE.getExpression_Equal_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_EQUAL__RIGHT = eINSTANCE.getExpression_Equal_Right();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Expression_Not_EqualImpl <em>Expression Not Equal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Expression_Not_EqualImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getExpression_Not_Equal()
		 * @generated
		 */
		EClass EXPRESSION_NOT_EQUAL = eINSTANCE.getExpression_Not_Equal();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_NOT_EQUAL__LEFT = eINSTANCE.getExpression_Not_Equal_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_NOT_EQUAL__RIGHT = eINSTANCE.getExpression_Not_Equal_Right();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Expression_ConcatenationImpl <em>Expression Concatenation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Expression_ConcatenationImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getExpression_Concatenation()
		 * @generated
		 */
		EClass EXPRESSION_CONCATENATION = eINSTANCE.getExpression_Concatenation();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_CONCATENATION__LEFT = eINSTANCE.getExpression_Concatenation_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_CONCATENATION__RIGHT = eINSTANCE.getExpression_Concatenation_Right();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Expression_PlusImpl <em>Expression Plus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Expression_PlusImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getExpression_Plus()
		 * @generated
		 */
		EClass EXPRESSION_PLUS = eINSTANCE.getExpression_Plus();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_PLUS__LEFT = eINSTANCE.getExpression_Plus_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_PLUS__RIGHT = eINSTANCE.getExpression_Plus_Right();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Expression_MinusImpl <em>Expression Minus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Expression_MinusImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getExpression_Minus()
		 * @generated
		 */
		EClass EXPRESSION_MINUS = eINSTANCE.getExpression_Minus();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_MINUS__LEFT = eINSTANCE.getExpression_Minus_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_MINUS__RIGHT = eINSTANCE.getExpression_Minus_Right();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Expression_MultiplicationImpl <em>Expression Multiplication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Expression_MultiplicationImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getExpression_Multiplication()
		 * @generated
		 */
		EClass EXPRESSION_MULTIPLICATION = eINSTANCE.getExpression_Multiplication();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_MULTIPLICATION__LEFT = eINSTANCE.getExpression_Multiplication_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_MULTIPLICATION__RIGHT = eINSTANCE.getExpression_Multiplication_Right();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Expression_DivisionImpl <em>Expression Division</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Expression_DivisionImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getExpression_Division()
		 * @generated
		 */
		EClass EXPRESSION_DIVISION = eINSTANCE.getExpression_Division();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_DIVISION__LEFT = eINSTANCE.getExpression_Division_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_DIVISION__RIGHT = eINSTANCE.getExpression_Division_Right();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Expression_ModuloImpl <em>Expression Modulo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Expression_ModuloImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getExpression_Modulo()
		 * @generated
		 */
		EClass EXPRESSION_MODULO = eINSTANCE.getExpression_Modulo();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_MODULO__LEFT = eINSTANCE.getExpression_Modulo_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_MODULO__RIGHT = eINSTANCE.getExpression_Modulo_Right();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Expression_NegateImpl <em>Expression Negate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Expression_NegateImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getExpression_Negate()
		 * @generated
		 */
		EClass EXPRESSION_NEGATE = eINSTANCE.getExpression_Negate();

		/**
		 * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_NEGATE__EXP = eINSTANCE.getExpression_Negate_Exp();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Expression_LengthImpl <em>Expression Length</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Expression_LengthImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getExpression_Length()
		 * @generated
		 */
		EClass EXPRESSION_LENGTH = eINSTANCE.getExpression_Length();

		/**
		 * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_LENGTH__EXP = eINSTANCE.getExpression_Length_Exp();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Expression_InvertImpl <em>Expression Invert</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Expression_InvertImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getExpression_Invert()
		 * @generated
		 */
		EClass EXPRESSION_INVERT = eINSTANCE.getExpression_Invert();

		/**
		 * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_INVERT__EXP = eINSTANCE.getExpression_Invert_Exp();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Expression_ExponentiationImpl <em>Expression Exponentiation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Expression_ExponentiationImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getExpression_Exponentiation()
		 * @generated
		 */
		EClass EXPRESSION_EXPONENTIATION = eINSTANCE.getExpression_Exponentiation();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_EXPONENTIATION__LEFT = eINSTANCE.getExpression_Exponentiation_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_EXPONENTIATION__RIGHT = eINSTANCE.getExpression_Exponentiation_Right();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Expression_CallMemberFunctionImpl <em>Expression Call Member Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Expression_CallMemberFunctionImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getExpression_CallMemberFunction()
		 * @generated
		 */
		EClass EXPRESSION_CALL_MEMBER_FUNCTION = eINSTANCE.getExpression_CallMemberFunction();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_CALL_MEMBER_FUNCTION__OBJECT = eINSTANCE.getExpression_CallMemberFunction_Object();

		/**
		 * The meta object literal for the '<em><b>Member Function Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION_CALL_MEMBER_FUNCTION__MEMBER_FUNCTION_NAME = eINSTANCE.getExpression_CallMemberFunction_MemberFunctionName();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_CALL_MEMBER_FUNCTION__ARGUMENTS = eINSTANCE.getExpression_CallMemberFunction_Arguments();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Expression_CallFunctionImpl <em>Expression Call Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Expression_CallFunctionImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getExpression_CallFunction()
		 * @generated
		 */
		EClass EXPRESSION_CALL_FUNCTION = eINSTANCE.getExpression_CallFunction();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_CALL_FUNCTION__OBJECT = eINSTANCE.getExpression_CallFunction_Object();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_CALL_FUNCTION__ARGUMENTS = eINSTANCE.getExpression_CallFunction_Arguments();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Expression_AccessArrayImpl <em>Expression Access Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Expression_AccessArrayImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getExpression_AccessArray()
		 * @generated
		 */
		EClass EXPRESSION_ACCESS_ARRAY = eINSTANCE.getExpression_AccessArray();

		/**
		 * The meta object literal for the '<em><b>Array</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_ACCESS_ARRAY__ARRAY = eINSTANCE.getExpression_AccessArray_Array();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_ACCESS_ARRAY__INDEX = eINSTANCE.getExpression_AccessArray_Index();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Expression_AccessMemberImpl <em>Expression Access Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Expression_AccessMemberImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getExpression_AccessMember()
		 * @generated
		 */
		EClass EXPRESSION_ACCESS_MEMBER = eINSTANCE.getExpression_AccessMember();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_ACCESS_MEMBER__OBJECT = eINSTANCE.getExpression_AccessMember_Object();

		/**
		 * The meta object literal for the '<em><b>Member Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION_ACCESS_MEMBER__MEMBER_NAME = eINSTANCE.getExpression_AccessMember_MemberName();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.Expression_VariableNameImpl <em>Expression Variable Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Expression_VariableNameImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getExpression_VariableName()
		 * @generated
		 */
		EClass EXPRESSION_VARIABLE_NAME = eINSTANCE.getExpression_VariableName();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION_VARIABLE_NAME__VARIABLE = eINSTANCE.getExpression_VariableName_Variable();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.ActivityNodeImpl <em>Activity Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.ActivityNodeImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getActivityNode()
		 * @generated
		 */
		EClass ACTIVITY_NODE = eINSTANCE.getActivityNode();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE__OUTGOING = eINSTANCE.getActivityNode_Outgoing();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE__INCOMING = eINSTANCE.getActivityNode_Incoming();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE__ACTIVITY = eINSTANCE.getActivityNode_Activity();

		/**
		 * The meta object literal for the '<em><b>Running</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_NODE__RUNNING = eINSTANCE.getActivityNode_Running();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.ActivityEdgeImpl <em>Activity Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.ActivityEdgeImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getActivityEdge()
		 * @generated
		 */
		EClass ACTIVITY_EDGE = eINSTANCE.getActivityEdge();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EDGE__SOURCE = eINSTANCE.getActivityEdge_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EDGE__TARGET = eINSTANCE.getActivityEdge_Target();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.ControlFlowImpl <em>Control Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.ControlFlowImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getControlFlow()
		 * @generated
		 */
		EClass CONTROL_FLOW = eINSTANCE.getControlFlow();

		/**
		 * The meta object literal for the '<em><b>Guard</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_FLOW__GUARD = eINSTANCE.getControlFlow_Guard();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.ControlNodeImpl <em>Control Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.ControlNodeImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getControlNode()
		 * @generated
		 */
		EClass CONTROL_NODE = eINSTANCE.getControlNode();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.ExecutableNodeImpl <em>Executable Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.ExecutableNodeImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getExecutableNode()
		 * @generated
		 */
		EClass EXECUTABLE_NODE = eINSTANCE.getExecutableNode();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.ActionImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.OpaqueActionImpl <em>Opaque Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.OpaqueActionImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getOpaqueAction()
		 * @generated
		 */
		EClass OPAQUE_ACTION = eINSTANCE.getOpaqueAction();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPAQUE_ACTION__EXPRESSIONS = eINSTANCE.getOpaqueAction_Expressions();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPAQUE_ACTION__SERVICE = eINSTANCE.getOpaqueAction_Service();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.InitialNodeImpl <em>Initial Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.InitialNodeImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getInitialNode()
		 * @generated
		 */
		EClass INITIAL_NODE = eINSTANCE.getInitialNode();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.FinalNodeImpl <em>Final Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.FinalNodeImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getFinalNode()
		 * @generated
		 */
		EClass FINAL_NODE = eINSTANCE.getFinalNode();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.ActivityFinalNodeImpl <em>Activity Final Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.ActivityFinalNodeImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getActivityFinalNode()
		 * @generated
		 */
		EClass ACTIVITY_FINAL_NODE = eINSTANCE.getActivityFinalNode();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.ForkNodeImpl <em>Fork Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.ForkNodeImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getForkNode()
		 * @generated
		 */
		EClass FORK_NODE = eINSTANCE.getForkNode();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.JoinNodeImpl <em>Join Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.JoinNodeImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getJoinNode()
		 * @generated
		 */
		EClass JOIN_NODE = eINSTANCE.getJoinNode();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.MergeNodeImpl <em>Merge Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.MergeNodeImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getMergeNode()
		 * @generated
		 */
		EClass MERGE_NODE = eINSTANCE.getMergeNode();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.DecisionNodeImpl <em>Decision Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.DecisionNodeImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getDecisionNode()
		 * @generated
		 */
		EClass DECISION_NODE = eINSTANCE.getDecisionNode();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.VariableImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Initial Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__INITIAL_VALUE = eINSTANCE.getVariable_InitialValue();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

		/**
		 * The meta object literal for the '<em><b>Current Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__CURRENT_VALUE = eINSTANCE.getVariable_CurrentValue();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.IntegerVariableImpl <em>Integer Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.IntegerVariableImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getIntegerVariable()
		 * @generated
		 */
		EClass INTEGER_VARIABLE = eINSTANCE.getIntegerVariable();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.BooleanVariableImpl <em>Boolean Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.BooleanVariableImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getBooleanVariable()
		 * @generated
		 */
		EClass BOOLEAN_VARIABLE = eINSTANCE.getBooleanVariable();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.ValueImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.BooleanValueImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getBooleanValue()
		 * @generated
		 */
		EClass BOOLEAN_VALUE = eINSTANCE.getBooleanValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_VALUE__VALUE = eINSTANCE.getBooleanValue_Value();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.IntegerValueImpl <em>Integer Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.IntegerValueImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getIntegerValue()
		 * @generated
		 */
		EClass INTEGER_VALUE = eINSTANCE.getIntegerValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_VALUE__VALUE = eINSTANCE.getIntegerValue_Value();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.IntegerExpressionImpl <em>Integer Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.IntegerExpressionImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getIntegerExpression()
		 * @generated
		 */
		EClass INTEGER_EXPRESSION = eINSTANCE.getIntegerExpression();

		/**
		 * The meta object literal for the '<em><b>Operand2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGER_EXPRESSION__OPERAND2 = eINSTANCE.getIntegerExpression_Operand2();

		/**
		 * The meta object literal for the '<em><b>Operand1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGER_EXPRESSION__OPERAND1 = eINSTANCE.getIntegerExpression_Operand1();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.BooleanExpressionImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getBooleanExpression()
		 * @generated
		 */
		EClass BOOLEAN_EXPRESSION = eINSTANCE.getBooleanExpression();

		/**
		 * The meta object literal for the '<em><b>Assignee</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_EXPRESSION__ASSIGNEE = eINSTANCE.getBooleanExpression_Assignee();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.IntegerCalculationExpressionImpl <em>Integer Calculation Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.IntegerCalculationExpressionImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getIntegerCalculationExpression()
		 * @generated
		 */
		EClass INTEGER_CALCULATION_EXPRESSION = eINSTANCE.getIntegerCalculationExpression();

		/**
		 * The meta object literal for the '<em><b>Assignee</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGER_CALCULATION_EXPRESSION__ASSIGNEE = eINSTANCE.getIntegerCalculationExpression_Assignee();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_CALCULATION_EXPRESSION__OPERATOR = eINSTANCE.getIntegerCalculationExpression_Operator();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.IntegerComparisonExpressionImpl <em>Integer Comparison Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.IntegerComparisonExpressionImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getIntegerComparisonExpression()
		 * @generated
		 */
		EClass INTEGER_COMPARISON_EXPRESSION = eINSTANCE.getIntegerComparisonExpression();

		/**
		 * The meta object literal for the '<em><b>Assignee</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGER_COMPARISON_EXPRESSION__ASSIGNEE = eINSTANCE.getIntegerComparisonExpression_Assignee();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_COMPARISON_EXPRESSION__OPERATOR = eINSTANCE.getIntegerComparisonExpression_Operator();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.BooleanUnaryExpressionImpl <em>Boolean Unary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.BooleanUnaryExpressionImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getBooleanUnaryExpression()
		 * @generated
		 */
		EClass BOOLEAN_UNARY_EXPRESSION = eINSTANCE.getBooleanUnaryExpression();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_UNARY_EXPRESSION__OPERAND = eINSTANCE.getBooleanUnaryExpression_Operand();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_UNARY_EXPRESSION__OPERATOR = eINSTANCE.getBooleanUnaryExpression_Operator();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.BooleanBinaryExpressionImpl <em>Boolean Binary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.BooleanBinaryExpressionImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getBooleanBinaryExpression()
		 * @generated
		 */
		EClass BOOLEAN_BINARY_EXPRESSION = eINSTANCE.getBooleanBinaryExpression();

		/**
		 * The meta object literal for the '<em><b>Operand1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_BINARY_EXPRESSION__OPERAND1 = eINSTANCE.getBooleanBinaryExpression_Operand1();

		/**
		 * The meta object literal for the '<em><b>Operand2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_BINARY_EXPRESSION__OPERAND2 = eINSTANCE.getBooleanBinaryExpression_Operand2();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_BINARY_EXPRESSION__OPERATOR = eINSTANCE.getBooleanBinaryExpression_Operator();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.InputValueImpl <em>Input Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.InputValueImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getInputValue()
		 * @generated
		 */
		EClass INPUT_VALUE = eINSTANCE.getInputValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_VALUE__VALUE = eINSTANCE.getInputValue_Value();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_VALUE__VARIABLE = eINSTANCE.getInputValue_Variable();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.InputImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getInput()
		 * @generated
		 */
		EClass INPUT = eINSTANCE.getInput();

		/**
		 * The meta object literal for the '<em><b>Input Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT__INPUT_VALUES = eINSTANCE.getInput_InputValues();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.TokenImpl <em>Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.TokenImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getToken()
		 * @generated
		 */
		EClass TOKEN = eINSTANCE.getToken();

		/**
		 * The meta object literal for the '<em><b>Holder</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN__HOLDER = eINSTANCE.getToken_Holder();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.impl.TraceImpl <em>Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.TraceImpl
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getTrace()
		 * @generated
		 */
		EClass TRACE = eINSTANCE.getTrace();

		/**
		 * The meta object literal for the '<em><b>Executed Nodes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__EXECUTED_NODES = eINSTANCE.getTrace_ExecutedNodes();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.BoardType <em>Board Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.BoardType
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getBoardType()
		 * @generated
		 */
		EEnum BOARD_TYPE = eINSTANCE.getBoardType();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.ParameterMode <em>Parameter Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.ParameterMode
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getParameterMode()
		 * @generated
		 */
		EEnum PARAMETER_MODE = eINSTANCE.getParameterMode();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.PrimitiveKind <em>Primitive Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.PrimitiveKind
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getPrimitiveKind()
		 * @generated
		 */
		EEnum PRIMITIVE_KIND = eINSTANCE.getPrimitiveKind();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.IntegerCalculationOperator <em>Integer Calculation Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.IntegerCalculationOperator
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getIntegerCalculationOperator()
		 * @generated
		 */
		EEnum INTEGER_CALCULATION_OPERATOR = eINSTANCE.getIntegerCalculationOperator();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.IntegerComparisonOperator <em>Integer Comparison Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.IntegerComparisonOperator
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getIntegerComparisonOperator()
		 * @generated
		 */
		EEnum INTEGER_COMPARISON_OPERATOR = eINSTANCE.getIntegerComparisonOperator();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.BooleanUnaryOperator <em>Boolean Unary Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.BooleanUnaryOperator
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getBooleanUnaryOperator()
		 * @generated
		 */
		EEnum BOOLEAN_UNARY_OPERATOR = eINSTANCE.getBooleanUnaryOperator();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.iot2.iot2.iot2.BooleanBinaryOperator <em>Boolean Binary Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.iot2.iot2.iot2.BooleanBinaryOperator
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getBooleanBinaryOperator()
		 * @generated
		 */
		EEnum BOOLEAN_BINARY_OPERATOR = eINSTANCE.getBooleanBinaryOperator();

		/**
		 * The meta object literal for the '<em>EType Code</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getETypeCode()
		 * @generated
		 */
		EDataType ETYPE_CODE = eINSTANCE.getETypeCode();

		/**
		 * The meta object literal for the '<em>Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getObject()
		 * @generated
		 */
		EDataType OBJECT = eINSTANCE.getObject();

		/**
		 * The meta object literal for the '<em>Stack</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Stack
		 * @see fr.inria.diverse.iot2.iot2.iot2.impl.Iot2PackageImpl#getStack()
		 * @generated
		 */
		EDataType STACK = eINSTANCE.getStack();

	}

} //Iot2Package
