/**
 */
package activitydiagram;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see activitydiagram.ActivitydiagramFactory
 * @model kind="package"
 * @generated
 */
public interface ActivitydiagramPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "activitydiagram";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://activitydiagram/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "activitydiagram";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ActivitydiagramPackage eINSTANCE = activitydiagram.impl.ActivitydiagramPackageImpl.init();

	/**
	 * The meta object id for the '{@link activitydiagram.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.NamedElementImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link activitydiagram.impl.ActivityNodeImpl <em>Activity Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.ActivityNodeImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getActivityNode()
	 * @generated
	 */
	int ACTIVITY_NODE = 3;

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
	 * The meta object id for the '{@link activitydiagram.impl.ExecutableNodeImpl <em>Executable Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.ExecutableNodeImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getExecutableNode()
	 * @generated
	 */
	int EXECUTABLE_NODE = 2;

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
	 * The meta object id for the '{@link activitydiagram.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.ActionImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 1;

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
	 * The meta object id for the '{@link activitydiagram.impl.OpaqueActionImpl <em>Opaque Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.OpaqueActionImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getOpaqueAction()
	 * @generated
	 */
	int OPAQUE_ACTION = 0;

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
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION__EXPRESSIONS = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Opaque Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link activitydiagram.impl.ActivityEdgeImpl <em>Activity Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.ActivityEdgeImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getActivityEdge()
	 * @generated
	 */
	int ACTIVITY_EDGE = 5;

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
	 * The feature id for the '<em><b>Offers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE__OFFERS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Activity Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link activitydiagram.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.ActivityImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 6;

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
	 * The meta object id for the '{@link activitydiagram.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.VariableImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 7;

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
	 * The meta object id for the '{@link activitydiagram.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.ValueImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 8;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagram.impl.InputValueImpl <em>Input Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.InputValueImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getInputValue()
	 * @generated
	 */
	int INPUT_VALUE = 9;

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
	 * The meta object id for the '{@link activitydiagram.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.ExpressionImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 10;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagram.impl.EModelElementImpl <em>EModel Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.EModelElementImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEModelElement()
	 * @generated
	 */
	int EMODEL_ELEMENT = 19;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMODEL_ELEMENT__EANNOTATIONS = 0;

	/**
	 * The number of structural features of the '<em>EModel Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMODEL_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link activitydiagram.impl.ENamedElementImpl <em>ENamed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.ENamedElementImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getENamedElement()
	 * @generated
	 */
	int ENAMED_ELEMENT = 20;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENAMED_ELEMENT__EANNOTATIONS = EMODEL_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENAMED_ELEMENT__NAME = EMODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ENamed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENAMED_ELEMENT_FEATURE_COUNT = EMODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link activitydiagram.impl.ETypedElementImpl <em>ETyped Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.ETypedElementImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getETypedElement()
	 * @generated
	 */
	int ETYPED_ELEMENT = 27;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPED_ELEMENT__EANNOTATIONS = ENAMED_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPED_ELEMENT__NAME = ENAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPED_ELEMENT__ORDERED = ENAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPED_ELEMENT__UNIQUE = ENAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPED_ELEMENT__LOWER_BOUND = ENAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPED_ELEMENT__UPPER_BOUND = ENAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPED_ELEMENT__MANY = ENAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPED_ELEMENT__REQUIRED = ENAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPED_ELEMENT__ETYPE = ENAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>EGeneric Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPED_ELEMENT__EGENERIC_TYPE = ENAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>ETyped Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPED_ELEMENT_FEATURE_COUNT = ENAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link activitydiagram.impl.EStructuralFeatureImpl <em>EStructural Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.EStructuralFeatureImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEStructuralFeature()
	 * @generated
	 */
	int ESTRUCTURAL_FEATURE = 26;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE__EANNOTATIONS = ETYPED_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE__NAME = ETYPED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE__ORDERED = ETYPED_ELEMENT__ORDERED;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE__UNIQUE = ETYPED_ELEMENT__UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE__LOWER_BOUND = ETYPED_ELEMENT__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE__UPPER_BOUND = ETYPED_ELEMENT__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE__MANY = ETYPED_ELEMENT__MANY;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE__REQUIRED = ETYPED_ELEMENT__REQUIRED;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE__ETYPE = ETYPED_ELEMENT__ETYPE;

	/**
	 * The feature id for the '<em><b>EGeneric Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE__EGENERIC_TYPE = ETYPED_ELEMENT__EGENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>Changeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE__CHANGEABLE = ETYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE__VOLATILE = ETYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE__TRANSIENT = ETYPED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Default Value Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE__DEFAULT_VALUE_LITERAL = ETYPED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE__DEFAULT_VALUE = ETYPED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Unsettable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE__UNSETTABLE = ETYPED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE__DERIVED = ETYPED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>EContaining Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE__ECONTAINING_CLASS = ETYPED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>EStructural Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_FEATURE_COUNT = ETYPED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link activitydiagram.impl.EAttributeImpl <em>EAttribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.EAttributeImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEAttribute()
	 * @generated
	 */
	int EATTRIBUTE = 11;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__EANNOTATIONS = ESTRUCTURAL_FEATURE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__NAME = ESTRUCTURAL_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__ORDERED = ESTRUCTURAL_FEATURE__ORDERED;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__UNIQUE = ESTRUCTURAL_FEATURE__UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__LOWER_BOUND = ESTRUCTURAL_FEATURE__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__UPPER_BOUND = ESTRUCTURAL_FEATURE__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__MANY = ESTRUCTURAL_FEATURE__MANY;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__REQUIRED = ESTRUCTURAL_FEATURE__REQUIRED;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__ETYPE = ESTRUCTURAL_FEATURE__ETYPE;

	/**
	 * The feature id for the '<em><b>EGeneric Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__EGENERIC_TYPE = ESTRUCTURAL_FEATURE__EGENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>Changeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__CHANGEABLE = ESTRUCTURAL_FEATURE__CHANGEABLE;

	/**
	 * The feature id for the '<em><b>Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__VOLATILE = ESTRUCTURAL_FEATURE__VOLATILE;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__TRANSIENT = ESTRUCTURAL_FEATURE__TRANSIENT;

	/**
	 * The feature id for the '<em><b>Default Value Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__DEFAULT_VALUE_LITERAL = ESTRUCTURAL_FEATURE__DEFAULT_VALUE_LITERAL;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__DEFAULT_VALUE = ESTRUCTURAL_FEATURE__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Unsettable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__UNSETTABLE = ESTRUCTURAL_FEATURE__UNSETTABLE;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__DERIVED = ESTRUCTURAL_FEATURE__DERIVED;

	/**
	 * The feature id for the '<em><b>EContaining Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__ECONTAINING_CLASS = ESTRUCTURAL_FEATURE__ECONTAINING_CLASS;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__ID = ESTRUCTURAL_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EAttribute Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__EATTRIBUTE_TYPE = ESTRUCTURAL_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE_FEATURE_COUNT = ESTRUCTURAL_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link activitydiagram.impl.EAnnotationImpl <em>EAnnotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.EAnnotationImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEAnnotation()
	 * @generated
	 */
	int EANNOTATION = 12;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EANNOTATION__EANNOTATIONS = EMODEL_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EANNOTATION__SOURCE = EMODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Details</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EANNOTATION__DETAILS = EMODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EANNOTATION__EMODEL_ELEMENT = EMODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EANNOTATION__CONTENTS = EMODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EANNOTATION__REFERENCES = EMODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>EAnnotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EANNOTATION_FEATURE_COUNT = EMODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link activitydiagram.impl.EClassifierImpl <em>EClassifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.EClassifierImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEClassifier()
	 * @generated
	 */
	int ECLASSIFIER = 14;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASSIFIER__EANNOTATIONS = ENAMED_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASSIFIER__NAME = ENAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Instance Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASSIFIER__INSTANCE_CLASS_NAME = ENAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASSIFIER__INSTANCE_CLASS = ENAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASSIFIER__DEFAULT_VALUE = ENAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Instance Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASSIFIER__INSTANCE_TYPE_NAME = ENAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>EPackage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASSIFIER__EPACKAGE = ENAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>EType Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASSIFIER__ETYPE_PARAMETERS = ENAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>EClassifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASSIFIER_FEATURE_COUNT = ENAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link activitydiagram.impl.EClassImpl <em>EClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.EClassImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEClass()
	 * @generated
	 */
	int ECLASS = 13;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__EANNOTATIONS = ECLASSIFIER__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__NAME = ECLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Instance Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__INSTANCE_CLASS_NAME = ECLASSIFIER__INSTANCE_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Instance Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__INSTANCE_CLASS = ECLASSIFIER__INSTANCE_CLASS;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__DEFAULT_VALUE = ECLASSIFIER__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Instance Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__INSTANCE_TYPE_NAME = ECLASSIFIER__INSTANCE_TYPE_NAME;

	/**
	 * The feature id for the '<em><b>EPackage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__EPACKAGE = ECLASSIFIER__EPACKAGE;

	/**
	 * The feature id for the '<em><b>EType Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__ETYPE_PARAMETERS = ECLASSIFIER__ETYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__ABSTRACT = ECLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__INTERFACE = ECLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>ESuper Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__ESUPER_TYPES = ECLASSIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>EOperations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__EOPERATIONS = ECLASSIFIER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>EAll Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__EALL_ATTRIBUTES = ECLASSIFIER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>EAll References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__EALL_REFERENCES = ECLASSIFIER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>EReferences</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__EREFERENCES = ECLASSIFIER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>EAttributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__EATTRIBUTES = ECLASSIFIER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>EAll Containments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__EALL_CONTAINMENTS = ECLASSIFIER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>EAll Operations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__EALL_OPERATIONS = ECLASSIFIER_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>EAll Structural Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__EALL_STRUCTURAL_FEATURES = ECLASSIFIER_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>EAll Super Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__EALL_SUPER_TYPES = ECLASSIFIER_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>EID Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__EID_ATTRIBUTE = ECLASSIFIER_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>EStructural Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__ESTRUCTURAL_FEATURES = ECLASSIFIER_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>EGeneric Super Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__EGENERIC_SUPER_TYPES = ECLASSIFIER_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>EAll Generic Super Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__EALL_GENERIC_SUPER_TYPES = ECLASSIFIER_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>EClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_FEATURE_COUNT = ECLASSIFIER_FEATURE_COUNT + 16;

	/**
	 * The meta object id for the '{@link activitydiagram.impl.EDataTypeImpl <em>EData Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.EDataTypeImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEDataType()
	 * @generated
	 */
	int EDATA_TYPE = 15;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDATA_TYPE__EANNOTATIONS = ECLASSIFIER__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDATA_TYPE__NAME = ECLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Instance Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDATA_TYPE__INSTANCE_CLASS_NAME = ECLASSIFIER__INSTANCE_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Instance Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDATA_TYPE__INSTANCE_CLASS = ECLASSIFIER__INSTANCE_CLASS;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDATA_TYPE__DEFAULT_VALUE = ECLASSIFIER__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Instance Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDATA_TYPE__INSTANCE_TYPE_NAME = ECLASSIFIER__INSTANCE_TYPE_NAME;

	/**
	 * The feature id for the '<em><b>EPackage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDATA_TYPE__EPACKAGE = ECLASSIFIER__EPACKAGE;

	/**
	 * The feature id for the '<em><b>EType Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDATA_TYPE__ETYPE_PARAMETERS = ECLASSIFIER__ETYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Serializable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDATA_TYPE__SERIALIZABLE = ECLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EData Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDATA_TYPE_FEATURE_COUNT = ECLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link activitydiagram.impl.EEnumImpl <em>EEnum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.EEnumImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEEnum()
	 * @generated
	 */
	int EENUM = 16;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM__EANNOTATIONS = EDATA_TYPE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM__NAME = EDATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Instance Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM__INSTANCE_CLASS_NAME = EDATA_TYPE__INSTANCE_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Instance Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM__INSTANCE_CLASS = EDATA_TYPE__INSTANCE_CLASS;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM__DEFAULT_VALUE = EDATA_TYPE__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Instance Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM__INSTANCE_TYPE_NAME = EDATA_TYPE__INSTANCE_TYPE_NAME;

	/**
	 * The feature id for the '<em><b>EPackage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM__EPACKAGE = EDATA_TYPE__EPACKAGE;

	/**
	 * The feature id for the '<em><b>EType Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM__ETYPE_PARAMETERS = EDATA_TYPE__ETYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Serializable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM__SERIALIZABLE = EDATA_TYPE__SERIALIZABLE;

	/**
	 * The feature id for the '<em><b>ELiterals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM__ELITERALS = EDATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EEnum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM_FEATURE_COUNT = EDATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link activitydiagram.impl.EEnumLiteralImpl <em>EEnum Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.EEnumLiteralImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEEnumLiteral()
	 * @generated
	 */
	int EENUM_LITERAL = 17;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM_LITERAL__EANNOTATIONS = ENAMED_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM_LITERAL__NAME = ENAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM_LITERAL__VALUE = ENAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM_LITERAL__INSTANCE = ENAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM_LITERAL__LITERAL = ENAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>EEnum</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM_LITERAL__EENUM = ENAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>EEnum Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM_LITERAL_FEATURE_COUNT = ENAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link activitydiagram.impl.EFactoryImpl <em>EFactory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.EFactoryImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEFactory()
	 * @generated
	 */
	int EFACTORY = 18;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFACTORY__EANNOTATIONS = EMODEL_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>EPackage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFACTORY__EPACKAGE = EMODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EFactory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFACTORY_FEATURE_COUNT = EMODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link activitydiagram.impl.EObjectImpl <em>EObject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.EObjectImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEObject()
	 * @generated
	 */
	int EOBJECT = 21;

	/**
	 * The number of structural features of the '<em>EObject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagram.impl.EOperationImpl <em>EOperation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.EOperationImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEOperation()
	 * @generated
	 */
	int EOPERATION = 22;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION__EANNOTATIONS = ETYPED_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION__NAME = ETYPED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION__ORDERED = ETYPED_ELEMENT__ORDERED;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION__UNIQUE = ETYPED_ELEMENT__UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION__LOWER_BOUND = ETYPED_ELEMENT__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION__UPPER_BOUND = ETYPED_ELEMENT__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION__MANY = ETYPED_ELEMENT__MANY;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION__REQUIRED = ETYPED_ELEMENT__REQUIRED;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION__ETYPE = ETYPED_ELEMENT__ETYPE;

	/**
	 * The feature id for the '<em><b>EGeneric Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION__EGENERIC_TYPE = ETYPED_ELEMENT__EGENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>EContaining Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION__ECONTAINING_CLASS = ETYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EType Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION__ETYPE_PARAMETERS = ETYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>EParameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION__EPARAMETERS = ETYPED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>EExceptions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION__EEXCEPTIONS = ETYPED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>EGeneric Exceptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION__EGENERIC_EXCEPTIONS = ETYPED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION__BEHAVIOR = ETYPED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>EOperation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION_FEATURE_COUNT = ETYPED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link activitydiagram.impl.EPackageImpl <em>EPackage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.EPackageImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEPackage()
	 * @generated
	 */
	int EPACKAGE = 23;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE__EANNOTATIONS = ENAMED_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE__NAME = ENAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Ns URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE__NS_URI = ENAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ns Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE__NS_PREFIX = ENAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>EFactory Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE__EFACTORY_INSTANCE = ENAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>EClassifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE__ECLASSIFIERS = ENAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>ESubpackages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE__ESUBPACKAGES = ENAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>ESuper Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE__ESUPER_PACKAGE = ENAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>EPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE_FEATURE_COUNT = ENAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link activitydiagram.impl.EParameterImpl <em>EParameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.EParameterImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEParameter()
	 * @generated
	 */
	int EPARAMETER = 24;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPARAMETER__EANNOTATIONS = ETYPED_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPARAMETER__NAME = ETYPED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPARAMETER__ORDERED = ETYPED_ELEMENT__ORDERED;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPARAMETER__UNIQUE = ETYPED_ELEMENT__UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPARAMETER__LOWER_BOUND = ETYPED_ELEMENT__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPARAMETER__UPPER_BOUND = ETYPED_ELEMENT__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPARAMETER__MANY = ETYPED_ELEMENT__MANY;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPARAMETER__REQUIRED = ETYPED_ELEMENT__REQUIRED;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPARAMETER__ETYPE = ETYPED_ELEMENT__ETYPE;

	/**
	 * The feature id for the '<em><b>EGeneric Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPARAMETER__EGENERIC_TYPE = ETYPED_ELEMENT__EGENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>EOperation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPARAMETER__EOPERATION = ETYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EParameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPARAMETER_FEATURE_COUNT = ETYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link activitydiagram.impl.EReferenceImpl <em>EReference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.EReferenceImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEReference()
	 * @generated
	 */
	int EREFERENCE = 25;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__EANNOTATIONS = ESTRUCTURAL_FEATURE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__NAME = ESTRUCTURAL_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__ORDERED = ESTRUCTURAL_FEATURE__ORDERED;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__UNIQUE = ESTRUCTURAL_FEATURE__UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__LOWER_BOUND = ESTRUCTURAL_FEATURE__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__UPPER_BOUND = ESTRUCTURAL_FEATURE__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__MANY = ESTRUCTURAL_FEATURE__MANY;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__REQUIRED = ESTRUCTURAL_FEATURE__REQUIRED;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__ETYPE = ESTRUCTURAL_FEATURE__ETYPE;

	/**
	 * The feature id for the '<em><b>EGeneric Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__EGENERIC_TYPE = ESTRUCTURAL_FEATURE__EGENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>Changeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__CHANGEABLE = ESTRUCTURAL_FEATURE__CHANGEABLE;

	/**
	 * The feature id for the '<em><b>Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__VOLATILE = ESTRUCTURAL_FEATURE__VOLATILE;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__TRANSIENT = ESTRUCTURAL_FEATURE__TRANSIENT;

	/**
	 * The feature id for the '<em><b>Default Value Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__DEFAULT_VALUE_LITERAL = ESTRUCTURAL_FEATURE__DEFAULT_VALUE_LITERAL;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__DEFAULT_VALUE = ESTRUCTURAL_FEATURE__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Unsettable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__UNSETTABLE = ESTRUCTURAL_FEATURE__UNSETTABLE;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__DERIVED = ESTRUCTURAL_FEATURE__DERIVED;

	/**
	 * The feature id for the '<em><b>EContaining Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__ECONTAINING_CLASS = ESTRUCTURAL_FEATURE__ECONTAINING_CLASS;

	/**
	 * The feature id for the '<em><b>Containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__CONTAINMENT = ESTRUCTURAL_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Container</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__CONTAINER = ESTRUCTURAL_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Resolve Proxies</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__RESOLVE_PROXIES = ESTRUCTURAL_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>EOpposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__EOPPOSITE = ESTRUCTURAL_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>EReference Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__EREFERENCE_TYPE = ESTRUCTURAL_FEATURE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>EKeys</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__EKEYS = ESTRUCTURAL_FEATURE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>EReference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE_FEATURE_COUNT = ESTRUCTURAL_FEATURE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link activitydiagram.impl.EStringToStringMapEntryImpl <em>EString To String Map Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.EStringToStringMapEntryImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEStringToStringMapEntry()
	 * @generated
	 */
	int ESTRING_TO_STRING_MAP_ENTRY = 28;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING_TO_STRING_MAP_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING_TO_STRING_MAP_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>EString To String Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING_TO_STRING_MAP_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link activitydiagram.impl.EGenericTypeImpl <em>EGeneric Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.EGenericTypeImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEGenericType()
	 * @generated
	 */
	int EGENERIC_TYPE = 29;

	/**
	 * The feature id for the '<em><b>EUpper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGENERIC_TYPE__EUPPER_BOUND = 0;

	/**
	 * The feature id for the '<em><b>EType Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGENERIC_TYPE__ETYPE_ARGUMENTS = 1;

	/**
	 * The feature id for the '<em><b>ERaw Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGENERIC_TYPE__ERAW_TYPE = 2;

	/**
	 * The feature id for the '<em><b>ELower Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGENERIC_TYPE__ELOWER_BOUND = 3;

	/**
	 * The feature id for the '<em><b>EType Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGENERIC_TYPE__ETYPE_PARAMETER = 4;

	/**
	 * The feature id for the '<em><b>EClassifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGENERIC_TYPE__ECLASSIFIER = 5;

	/**
	 * The number of structural features of the '<em>EGeneric Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGENERIC_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link activitydiagram.impl.ETypeParameterImpl <em>EType Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.ETypeParameterImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getETypeParameter()
	 * @generated
	 */
	int ETYPE_PARAMETER = 30;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPE_PARAMETER__EANNOTATIONS = ENAMED_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPE_PARAMETER__NAME = ENAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>EBounds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPE_PARAMETER__EBOUNDS = ENAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EType Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPE_PARAMETER_FEATURE_COUNT = ENAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '<em>Context</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.operationalsemantics.gemoc.sequential.dynamic.Context
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 31;

	/**
	 * The meta object id for the '<em>Offer</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.operationalsemantics.gemoc.sequential.dynamic.Offer
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getOffer()
	 * @generated
	 */
	int OFFER = 32;

	/**
	 * The meta object id for the '<em>Token</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.operationalsemantics.gemoc.sequential.dynamic.Token
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getToken()
	 * @generated
	 */
	int TOKEN = 33;

	/**
	 * The meta object id for the '<em>EBig Decimal</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEBigDecimal()
	 * @generated
	 */
	int EBIG_DECIMAL = 34;

	/**
	 * The meta object id for the '<em>EBig Integer</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEBigInteger()
	 * @generated
	 */
	int EBIG_INTEGER = 35;

	/**
	 * The meta object id for the '<em>EBoolean</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEBoolean()
	 * @generated
	 */
	int EBOOLEAN = 36;

	/**
	 * The meta object id for the '<em>EBoolean Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Boolean
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEBooleanObject()
	 * @generated
	 */
	int EBOOLEAN_OBJECT = 37;

	/**
	 * The meta object id for the '<em>EByte</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEByte()
	 * @generated
	 */
	int EBYTE = 38;

	/**
	 * The meta object id for the '<em>EByte Array</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEByteArray()
	 * @generated
	 */
	int EBYTE_ARRAY = 39;

	/**
	 * The meta object id for the '<em>EByte Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Byte
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEByteObject()
	 * @generated
	 */
	int EBYTE_OBJECT = 40;

	/**
	 * The meta object id for the '<em>EChar</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEChar()
	 * @generated
	 */
	int ECHAR = 41;

	/**
	 * The meta object id for the '<em>ECharacter Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Character
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getECharacterObject()
	 * @generated
	 */
	int ECHARACTER_OBJECT = 42;

	/**
	 * The meta object id for the '<em>EDate</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Date
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEDate()
	 * @generated
	 */
	int EDATE = 43;

	/**
	 * The meta object id for the '<em>EDiagnostic Chain</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.DiagnosticChain
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEDiagnosticChain()
	 * @generated
	 */
	int EDIAGNOSTIC_CHAIN = 44;

	/**
	 * The meta object id for the '<em>EDouble</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEDouble()
	 * @generated
	 */
	int EDOUBLE = 45;

	/**
	 * The meta object id for the '<em>EDouble Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEDoubleObject()
	 * @generated
	 */
	int EDOUBLE_OBJECT = 46;

	/**
	 * The meta object id for the '<em>EE List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.EList
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEEList()
	 * @generated
	 */
	int EE_LIST = 47;

	/**
	 * The meta object id for the '<em>EEnumerator</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Enumerator
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEEnumerator()
	 * @generated
	 */
	int EENUMERATOR = 48;

	/**
	 * The meta object id for the '<em>EFeature Map</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.util.FeatureMap
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEFeatureMap()
	 * @generated
	 */
	int EFEATURE_MAP = 49;

	/**
	 * The meta object id for the '<em>EFeature Map Entry</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.util.FeatureMap.Entry
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEFeatureMapEntry()
	 * @generated
	 */
	int EFEATURE_MAP_ENTRY = 50;

	/**
	 * The meta object id for the '<em>EFloat</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEFloat()
	 * @generated
	 */
	int EFLOAT = 51;

	/**
	 * The meta object id for the '<em>EFloat Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Float
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEFloatObject()
	 * @generated
	 */
	int EFLOAT_OBJECT = 52;

	/**
	 * The meta object id for the '<em>EInt</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEInt()
	 * @generated
	 */
	int EINT = 53;

	/**
	 * The meta object id for the '<em>EInteger Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEIntegerObject()
	 * @generated
	 */
	int EINTEGER_OBJECT = 54;

	/**
	 * The meta object id for the '<em>EJava Class</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Class
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEJavaClass()
	 * @generated
	 */
	int EJAVA_CLASS = 55;

	/**
	 * The meta object id for the '<em>EJava Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEJavaObject()
	 * @generated
	 */
	int EJAVA_OBJECT = 56;

	/**
	 * The meta object id for the '<em>ELong</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getELong()
	 * @generated
	 */
	int ELONG = 57;

	/**
	 * The meta object id for the '<em>ELong Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Long
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getELongObject()
	 * @generated
	 */
	int ELONG_OBJECT = 58;

	/**
	 * The meta object id for the '<em>EMap</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Map
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEMap()
	 * @generated
	 */
	int EMAP = 59;

	/**
	 * The meta object id for the '<em>EResource</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.resource.Resource
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEResource()
	 * @generated
	 */
	int ERESOURCE = 60;

	/**
	 * The meta object id for the '<em>EResource Set</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.resource.ResourceSet
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEResourceSet()
	 * @generated
	 */
	int ERESOURCE_SET = 61;

	/**
	 * The meta object id for the '<em>EShort</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEShort()
	 * @generated
	 */
	int ESHORT = 62;

	/**
	 * The meta object id for the '<em>EShort Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Short
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEShortObject()
	 * @generated
	 */
	int ESHORT_OBJECT = 63;

	/**
	 * The meta object id for the '<em>EString</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEString()
	 * @generated
	 */
	int ESTRING = 64;

	/**
	 * The meta object id for the '<em>ETree Iterator</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.TreeIterator
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getETreeIterator()
	 * @generated
	 */
	int ETREE_ITERATOR = 65;

	/**
	 * The meta object id for the '<em>EInvocation Target Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.reflect.InvocationTargetException
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEInvocationTargetException()
	 * @generated
	 */
	int EINVOCATION_TARGET_EXCEPTION = 66;


	/**
	 * Returns the meta object for class '{@link activitydiagram.OpaqueAction <em>Opaque Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opaque Action</em>'.
	 * @see activitydiagram.OpaqueAction
	 * @generated
	 */
	EClass getOpaqueAction();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagram.OpaqueAction#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see activitydiagram.OpaqueAction#getExpressions()
	 * @see #getOpaqueAction()
	 * @generated
	 */
	EReference getOpaqueAction_Expressions();

	/**
	 * Returns the meta object for class '{@link activitydiagram.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see activitydiagram.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for class '{@link activitydiagram.ExecutableNode <em>Executable Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Executable Node</em>'.
	 * @see activitydiagram.ExecutableNode
	 * @generated
	 */
	EClass getExecutableNode();

	/**
	 * Returns the meta object for class '{@link activitydiagram.ActivityNode <em>Activity Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Node</em>'.
	 * @see activitydiagram.ActivityNode
	 * @generated
	 */
	EClass getActivityNode();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagram.ActivityNode#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing</em>'.
	 * @see activitydiagram.ActivityNode#getOutgoing()
	 * @see #getActivityNode()
	 * @generated
	 */
	EReference getActivityNode_Outgoing();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagram.ActivityNode#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming</em>'.
	 * @see activitydiagram.ActivityNode#getIncoming()
	 * @see #getActivityNode()
	 * @generated
	 */
	EReference getActivityNode_Incoming();

	/**
	 * Returns the meta object for the container reference '{@link activitydiagram.ActivityNode#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Activity</em>'.
	 * @see activitydiagram.ActivityNode#getActivity()
	 * @see #getActivityNode()
	 * @generated
	 */
	EReference getActivityNode_Activity();

	/**
	 * Returns the meta object for the attribute '{@link activitydiagram.ActivityNode#isRunning <em>Running</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Running</em>'.
	 * @see activitydiagram.ActivityNode#isRunning()
	 * @see #getActivityNode()
	 * @generated
	 */
	EAttribute getActivityNode_Running();

	/**
	 * Returns the meta object for class '{@link activitydiagram.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see activitydiagram.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link activitydiagram.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see activitydiagram.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link activitydiagram.ActivityEdge <em>Activity Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Edge</em>'.
	 * @see activitydiagram.ActivityEdge
	 * @generated
	 */
	EClass getActivityEdge();

	/**
	 * Returns the meta object for the reference '{@link activitydiagram.ActivityEdge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see activitydiagram.ActivityEdge#getSource()
	 * @see #getActivityEdge()
	 * @generated
	 */
	EReference getActivityEdge_Source();

	/**
	 * Returns the meta object for the reference '{@link activitydiagram.ActivityEdge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see activitydiagram.ActivityEdge#getTarget()
	 * @see #getActivityEdge()
	 * @generated
	 */
	EReference getActivityEdge_Target();

	/**
	 * Returns the meta object for the attribute list '{@link activitydiagram.ActivityEdge#getOffers <em>Offers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Offers</em>'.
	 * @see activitydiagram.ActivityEdge#getOffers()
	 * @see #getActivityEdge()
	 * @generated
	 */
	EAttribute getActivityEdge_Offers();

	/**
	 * Returns the meta object for class '{@link activitydiagram.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see activitydiagram.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagram.Activity#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see activitydiagram.Activity#getNodes()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Nodes();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagram.Activity#getEdges <em>Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Edges</em>'.
	 * @see activitydiagram.Activity#getEdges()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Edges();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagram.Activity#getLocals <em>Locals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Locals</em>'.
	 * @see activitydiagram.Activity#getLocals()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Locals();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagram.Activity#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see activitydiagram.Activity#getInputs()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Inputs();

	/**
	 * Returns the meta object for class '{@link activitydiagram.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see activitydiagram.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the containment reference '{@link activitydiagram.Variable#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initial Value</em>'.
	 * @see activitydiagram.Variable#getInitialValue()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_InitialValue();

	/**
	 * Returns the meta object for the attribute '{@link activitydiagram.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see activitydiagram.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for the containment reference '{@link activitydiagram.Variable#getCurrentValue <em>Current Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Current Value</em>'.
	 * @see activitydiagram.Variable#getCurrentValue()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_CurrentValue();

	/**
	 * Returns the meta object for class '{@link activitydiagram.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see activitydiagram.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for class '{@link activitydiagram.InputValue <em>Input Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Value</em>'.
	 * @see activitydiagram.InputValue
	 * @generated
	 */
	EClass getInputValue();

	/**
	 * Returns the meta object for the containment reference '{@link activitydiagram.InputValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see activitydiagram.InputValue#getValue()
	 * @see #getInputValue()
	 * @generated
	 */
	EReference getInputValue_Value();

	/**
	 * Returns the meta object for the reference '{@link activitydiagram.InputValue#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see activitydiagram.InputValue#getVariable()
	 * @see #getInputValue()
	 * @generated
	 */
	EReference getInputValue_Variable();

	/**
	 * Returns the meta object for class '{@link activitydiagram.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see activitydiagram.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link activitydiagram.EAttribute <em>EAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EAttribute</em>'.
	 * @see activitydiagram.EAttribute
	 * @generated
	 */
	EClass getEAttribute();

	/**
	 * Returns the meta object for the attribute '{@link activitydiagram.EAttribute#isID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see activitydiagram.EAttribute#isID()
	 * @see #getEAttribute()
	 * @generated
	 */
	EAttribute getEAttribute_ID();

	/**
	 * Returns the meta object for the reference '{@link activitydiagram.EAttribute#getEAttributeType <em>EAttribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EAttribute Type</em>'.
	 * @see activitydiagram.EAttribute#getEAttributeType()
	 * @see #getEAttribute()
	 * @generated
	 */
	EReference getEAttribute_EAttributeType();

	/**
	 * Returns the meta object for class '{@link activitydiagram.EAnnotation <em>EAnnotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EAnnotation</em>'.
	 * @see activitydiagram.EAnnotation
	 * @generated
	 */
	EClass getEAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link activitydiagram.EAnnotation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see activitydiagram.EAnnotation#getSource()
	 * @see #getEAnnotation()
	 * @generated
	 */
	EAttribute getEAnnotation_Source();

	/**
	 * Returns the meta object for the map '{@link activitydiagram.EAnnotation#getDetails <em>Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Details</em>'.
	 * @see activitydiagram.EAnnotation#getDetails()
	 * @see #getEAnnotation()
	 * @generated
	 */
	EReference getEAnnotation_Details();

	/**
	 * Returns the meta object for the container reference '{@link activitydiagram.EAnnotation#getEModelElement <em>EModel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>EModel Element</em>'.
	 * @see activitydiagram.EAnnotation#getEModelElement()
	 * @see #getEAnnotation()
	 * @generated
	 */
	EReference getEAnnotation_EModelElement();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagram.EAnnotation#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contents</em>'.
	 * @see activitydiagram.EAnnotation#getContents()
	 * @see #getEAnnotation()
	 * @generated
	 */
	EReference getEAnnotation_Contents();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagram.EAnnotation#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>References</em>'.
	 * @see activitydiagram.EAnnotation#getReferences()
	 * @see #getEAnnotation()
	 * @generated
	 */
	EReference getEAnnotation_References();

	/**
	 * Returns the meta object for class '{@link activitydiagram.EClass <em>EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EClass</em>'.
	 * @see activitydiagram.EClass
	 * @generated
	 */
	EClass getEClass();

	/**
	 * Returns the meta object for the attribute '{@link activitydiagram.EClass#isAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see activitydiagram.EClass#isAbstract()
	 * @see #getEClass()
	 * @generated
	 */
	EAttribute getEClass_Abstract();

	/**
	 * Returns the meta object for the attribute '{@link activitydiagram.EClass#isInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface</em>'.
	 * @see activitydiagram.EClass#isInterface()
	 * @see #getEClass()
	 * @generated
	 */
	EAttribute getEClass_Interface();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagram.EClass#getESuperTypes <em>ESuper Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>ESuper Types</em>'.
	 * @see activitydiagram.EClass#getESuperTypes()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_ESuperTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagram.EClass#getEOperations <em>EOperations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EOperations</em>'.
	 * @see activitydiagram.EClass#getEOperations()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_EOperations();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagram.EClass#getEAllAttributes <em>EAll Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>EAll Attributes</em>'.
	 * @see activitydiagram.EClass#getEAllAttributes()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_EAllAttributes();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagram.EClass#getEAllReferences <em>EAll References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>EAll References</em>'.
	 * @see activitydiagram.EClass#getEAllReferences()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_EAllReferences();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagram.EClass#getEReferences <em>EReferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>EReferences</em>'.
	 * @see activitydiagram.EClass#getEReferences()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_EReferences();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagram.EClass#getEAttributes <em>EAttributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>EAttributes</em>'.
	 * @see activitydiagram.EClass#getEAttributes()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_EAttributes();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagram.EClass#getEAllContainments <em>EAll Containments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>EAll Containments</em>'.
	 * @see activitydiagram.EClass#getEAllContainments()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_EAllContainments();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagram.EClass#getEAllOperations <em>EAll Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>EAll Operations</em>'.
	 * @see activitydiagram.EClass#getEAllOperations()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_EAllOperations();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagram.EClass#getEAllStructuralFeatures <em>EAll Structural Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>EAll Structural Features</em>'.
	 * @see activitydiagram.EClass#getEAllStructuralFeatures()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_EAllStructuralFeatures();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagram.EClass#getEAllSuperTypes <em>EAll Super Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>EAll Super Types</em>'.
	 * @see activitydiagram.EClass#getEAllSuperTypes()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_EAllSuperTypes();

	/**
	 * Returns the meta object for the reference '{@link activitydiagram.EClass#getEIDAttribute <em>EID Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EID Attribute</em>'.
	 * @see activitydiagram.EClass#getEIDAttribute()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_EIDAttribute();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagram.EClass#getEStructuralFeatures <em>EStructural Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EStructural Features</em>'.
	 * @see activitydiagram.EClass#getEStructuralFeatures()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_EStructuralFeatures();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagram.EClass#getEGenericSuperTypes <em>EGeneric Super Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EGeneric Super Types</em>'.
	 * @see activitydiagram.EClass#getEGenericSuperTypes()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_EGenericSuperTypes();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagram.EClass#getEAllGenericSuperTypes <em>EAll Generic Super Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>EAll Generic Super Types</em>'.
	 * @see activitydiagram.EClass#getEAllGenericSuperTypes()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_EAllGenericSuperTypes();

	/**
	 * Returns the meta object for class '{@link activitydiagram.EClassifier <em>EClassifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EClassifier</em>'.
	 * @see activitydiagram.EClassifier
	 * @generated
	 */
	EClass getEClassifier();

	/**
	 * Returns the meta object for the attribute '{@link activitydiagram.EClassifier#getInstanceClassName <em>Instance Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Class Name</em>'.
	 * @see activitydiagram.EClassifier#getInstanceClassName()
	 * @see #getEClassifier()
	 * @generated
	 */
	EAttribute getEClassifier_InstanceClassName();

	/**
	 * Returns the meta object for the attribute '{@link activitydiagram.EClassifier#getInstanceClass <em>Instance Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Class</em>'.
	 * @see activitydiagram.EClassifier#getInstanceClass()
	 * @see #getEClassifier()
	 * @generated
	 */
	EAttribute getEClassifier_InstanceClass();

	/**
	 * Returns the meta object for the attribute '{@link activitydiagram.EClassifier#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see activitydiagram.EClassifier#getDefaultValue()
	 * @see #getEClassifier()
	 * @generated
	 */
	EAttribute getEClassifier_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link activitydiagram.EClassifier#getInstanceTypeName <em>Instance Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type Name</em>'.
	 * @see activitydiagram.EClassifier#getInstanceTypeName()
	 * @see #getEClassifier()
	 * @generated
	 */
	EAttribute getEClassifier_InstanceTypeName();

	/**
	 * Returns the meta object for the container reference '{@link activitydiagram.EClassifier#getEPackage <em>EPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>EPackage</em>'.
	 * @see activitydiagram.EClassifier#getEPackage()
	 * @see #getEClassifier()
	 * @generated
	 */
	EReference getEClassifier_EPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagram.EClassifier#getETypeParameters <em>EType Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EType Parameters</em>'.
	 * @see activitydiagram.EClassifier#getETypeParameters()
	 * @see #getEClassifier()
	 * @generated
	 */
	EReference getEClassifier_ETypeParameters();

	/**
	 * Returns the meta object for class '{@link activitydiagram.EDataType <em>EData Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EData Type</em>'.
	 * @see activitydiagram.EDataType
	 * @generated
	 */
	EClass getEDataType();

	/**
	 * Returns the meta object for the attribute '{@link activitydiagram.EDataType#isSerializable <em>Serializable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Serializable</em>'.
	 * @see activitydiagram.EDataType#isSerializable()
	 * @see #getEDataType()
	 * @generated
	 */
	EAttribute getEDataType_Serializable();

	/**
	 * Returns the meta object for class '{@link activitydiagram.EEnum <em>EEnum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEnum</em>'.
	 * @see activitydiagram.EEnum
	 * @generated
	 */
	EClass getEEnum();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagram.EEnum#getELiterals <em>ELiterals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ELiterals</em>'.
	 * @see activitydiagram.EEnum#getELiterals()
	 * @see #getEEnum()
	 * @generated
	 */
	EReference getEEnum_ELiterals();

	/**
	 * Returns the meta object for class '{@link activitydiagram.EEnumLiteral <em>EEnum Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEnum Literal</em>'.
	 * @see activitydiagram.EEnumLiteral
	 * @generated
	 */
	EClass getEEnumLiteral();

	/**
	 * Returns the meta object for the attribute '{@link activitydiagram.EEnumLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see activitydiagram.EEnumLiteral#getValue()
	 * @see #getEEnumLiteral()
	 * @generated
	 */
	EAttribute getEEnumLiteral_Value();

	/**
	 * Returns the meta object for the attribute '{@link activitydiagram.EEnumLiteral#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance</em>'.
	 * @see activitydiagram.EEnumLiteral#getInstance()
	 * @see #getEEnumLiteral()
	 * @generated
	 */
	EAttribute getEEnumLiteral_Instance();

	/**
	 * Returns the meta object for the attribute '{@link activitydiagram.EEnumLiteral#getLiteral <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Literal</em>'.
	 * @see activitydiagram.EEnumLiteral#getLiteral()
	 * @see #getEEnumLiteral()
	 * @generated
	 */
	EAttribute getEEnumLiteral_Literal();

	/**
	 * Returns the meta object for the container reference '{@link activitydiagram.EEnumLiteral#getEEnum <em>EEnum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>EEnum</em>'.
	 * @see activitydiagram.EEnumLiteral#getEEnum()
	 * @see #getEEnumLiteral()
	 * @generated
	 */
	EReference getEEnumLiteral_EEnum();

	/**
	 * Returns the meta object for class '{@link activitydiagram.EFactory <em>EFactory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EFactory</em>'.
	 * @see activitydiagram.EFactory
	 * @generated
	 */
	EClass getEFactory();

	/**
	 * Returns the meta object for the reference '{@link activitydiagram.EFactory#getEPackage <em>EPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EPackage</em>'.
	 * @see activitydiagram.EFactory#getEPackage()
	 * @see #getEFactory()
	 * @generated
	 */
	EReference getEFactory_EPackage();

	/**
	 * Returns the meta object for class '{@link activitydiagram.EModelElement <em>EModel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EModel Element</em>'.
	 * @see activitydiagram.EModelElement
	 * @generated
	 */
	EClass getEModelElement();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagram.EModelElement#getEAnnotations <em>EAnnotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EAnnotations</em>'.
	 * @see activitydiagram.EModelElement#getEAnnotations()
	 * @see #getEModelElement()
	 * @generated
	 */
	EReference getEModelElement_EAnnotations();

	/**
	 * Returns the meta object for class '{@link activitydiagram.ENamedElement <em>ENamed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ENamed Element</em>'.
	 * @see activitydiagram.ENamedElement
	 * @generated
	 */
	EClass getENamedElement();

	/**
	 * Returns the meta object for the attribute '{@link activitydiagram.ENamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see activitydiagram.ENamedElement#getName()
	 * @see #getENamedElement()
	 * @generated
	 */
	EAttribute getENamedElement_Name();

	/**
	 * Returns the meta object for class '{@link activitydiagram.EObject <em>EObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EObject</em>'.
	 * @see activitydiagram.EObject
	 * @generated
	 */
	EClass getEObject();

	/**
	 * Returns the meta object for class '{@link activitydiagram.EOperation <em>EOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EOperation</em>'.
	 * @see activitydiagram.EOperation
	 * @generated
	 */
	EClass getEOperation();

	/**
	 * Returns the meta object for the container reference '{@link activitydiagram.EOperation#getEContainingClass <em>EContaining Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>EContaining Class</em>'.
	 * @see activitydiagram.EOperation#getEContainingClass()
	 * @see #getEOperation()
	 * @generated
	 */
	EReference getEOperation_EContainingClass();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagram.EOperation#getETypeParameters <em>EType Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EType Parameters</em>'.
	 * @see activitydiagram.EOperation#getETypeParameters()
	 * @see #getEOperation()
	 * @generated
	 */
	EReference getEOperation_ETypeParameters();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagram.EOperation#getEParameters <em>EParameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EParameters</em>'.
	 * @see activitydiagram.EOperation#getEParameters()
	 * @see #getEOperation()
	 * @generated
	 */
	EReference getEOperation_EParameters();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagram.EOperation#getEExceptions <em>EExceptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>EExceptions</em>'.
	 * @see activitydiagram.EOperation#getEExceptions()
	 * @see #getEOperation()
	 * @generated
	 */
	EReference getEOperation_EExceptions();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagram.EOperation#getEGenericExceptions <em>EGeneric Exceptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EGeneric Exceptions</em>'.
	 * @see activitydiagram.EOperation#getEGenericExceptions()
	 * @see #getEOperation()
	 * @generated
	 */
	EReference getEOperation_EGenericExceptions();

	/**
	 * Returns the meta object for the reference '{@link activitydiagram.EOperation#getBehavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Behavior</em>'.
	 * @see activitydiagram.EOperation#getBehavior()
	 * @see #getEOperation()
	 * @generated
	 */
	EReference getEOperation_Behavior();

	/**
	 * Returns the meta object for class '{@link activitydiagram.EPackage <em>EPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EPackage</em>'.
	 * @see activitydiagram.EPackage
	 * @generated
	 */
	EClass getEPackage();

	/**
	 * Returns the meta object for the attribute '{@link activitydiagram.EPackage#getNsURI <em>Ns URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ns URI</em>'.
	 * @see activitydiagram.EPackage#getNsURI()
	 * @see #getEPackage()
	 * @generated
	 */
	EAttribute getEPackage_NsURI();

	/**
	 * Returns the meta object for the attribute '{@link activitydiagram.EPackage#getNsPrefix <em>Ns Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ns Prefix</em>'.
	 * @see activitydiagram.EPackage#getNsPrefix()
	 * @see #getEPackage()
	 * @generated
	 */
	EAttribute getEPackage_NsPrefix();

	/**
	 * Returns the meta object for the reference '{@link activitydiagram.EPackage#getEFactoryInstance <em>EFactory Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EFactory Instance</em>'.
	 * @see activitydiagram.EPackage#getEFactoryInstance()
	 * @see #getEPackage()
	 * @generated
	 */
	EReference getEPackage_EFactoryInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagram.EPackage#getEClassifiers <em>EClassifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EClassifiers</em>'.
	 * @see activitydiagram.EPackage#getEClassifiers()
	 * @see #getEPackage()
	 * @generated
	 */
	EReference getEPackage_EClassifiers();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagram.EPackage#getESubpackages <em>ESubpackages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ESubpackages</em>'.
	 * @see activitydiagram.EPackage#getESubpackages()
	 * @see #getEPackage()
	 * @generated
	 */
	EReference getEPackage_ESubpackages();

	/**
	 * Returns the meta object for the container reference '{@link activitydiagram.EPackage#getESuperPackage <em>ESuper Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>ESuper Package</em>'.
	 * @see activitydiagram.EPackage#getESuperPackage()
	 * @see #getEPackage()
	 * @generated
	 */
	EReference getEPackage_ESuperPackage();

	/**
	 * Returns the meta object for class '{@link activitydiagram.EParameter <em>EParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EParameter</em>'.
	 * @see activitydiagram.EParameter
	 * @generated
	 */
	EClass getEParameter();

	/**
	 * Returns the meta object for the container reference '{@link activitydiagram.EParameter#getEOperation <em>EOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>EOperation</em>'.
	 * @see activitydiagram.EParameter#getEOperation()
	 * @see #getEParameter()
	 * @generated
	 */
	EReference getEParameter_EOperation();

	/**
	 * Returns the meta object for class '{@link activitydiagram.EReference <em>EReference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EReference</em>'.
	 * @see activitydiagram.EReference
	 * @generated
	 */
	EClass getEReference();

	/**
	 * Returns the meta object for the attribute '{@link activitydiagram.EReference#isContainment <em>Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Containment</em>'.
	 * @see activitydiagram.EReference#isContainment()
	 * @see #getEReference()
	 * @generated
	 */
	EAttribute getEReference_Containment();

	/**
	 * Returns the meta object for the attribute '{@link activitydiagram.EReference#isContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Container</em>'.
	 * @see activitydiagram.EReference#isContainer()
	 * @see #getEReference()
	 * @generated
	 */
	EAttribute getEReference_Container();

	/**
	 * Returns the meta object for the attribute '{@link activitydiagram.EReference#isResolveProxies <em>Resolve Proxies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolve Proxies</em>'.
	 * @see activitydiagram.EReference#isResolveProxies()
	 * @see #getEReference()
	 * @generated
	 */
	EAttribute getEReference_ResolveProxies();

	/**
	 * Returns the meta object for the reference '{@link activitydiagram.EReference#getEOpposite <em>EOpposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EOpposite</em>'.
	 * @see activitydiagram.EReference#getEOpposite()
	 * @see #getEReference()
	 * @generated
	 */
	EReference getEReference_EOpposite();

	/**
	 * Returns the meta object for the reference '{@link activitydiagram.EReference#getEReferenceType <em>EReference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference Type</em>'.
	 * @see activitydiagram.EReference#getEReferenceType()
	 * @see #getEReference()
	 * @generated
	 */
	EReference getEReference_EReferenceType();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagram.EReference#getEKeys <em>EKeys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>EKeys</em>'.
	 * @see activitydiagram.EReference#getEKeys()
	 * @see #getEReference()
	 * @generated
	 */
	EReference getEReference_EKeys();

	/**
	 * Returns the meta object for class '{@link activitydiagram.EStructuralFeature <em>EStructural Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EStructural Feature</em>'.
	 * @see activitydiagram.EStructuralFeature
	 * @generated
	 */
	EClass getEStructuralFeature();

	/**
	 * Returns the meta object for the attribute '{@link activitydiagram.EStructuralFeature#isChangeable <em>Changeable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Changeable</em>'.
	 * @see activitydiagram.EStructuralFeature#isChangeable()
	 * @see #getEStructuralFeature()
	 * @generated
	 */
	EAttribute getEStructuralFeature_Changeable();

	/**
	 * Returns the meta object for the attribute '{@link activitydiagram.EStructuralFeature#isVolatile <em>Volatile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volatile</em>'.
	 * @see activitydiagram.EStructuralFeature#isVolatile()
	 * @see #getEStructuralFeature()
	 * @generated
	 */
	EAttribute getEStructuralFeature_Volatile();

	/**
	 * Returns the meta object for the attribute '{@link activitydiagram.EStructuralFeature#isTransient <em>Transient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transient</em>'.
	 * @see activitydiagram.EStructuralFeature#isTransient()
	 * @see #getEStructuralFeature()
	 * @generated
	 */
	EAttribute getEStructuralFeature_Transient();

	/**
	 * Returns the meta object for the attribute '{@link activitydiagram.EStructuralFeature#getDefaultValueLiteral <em>Default Value Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value Literal</em>'.
	 * @see activitydiagram.EStructuralFeature#getDefaultValueLiteral()
	 * @see #getEStructuralFeature()
	 * @generated
	 */
	EAttribute getEStructuralFeature_DefaultValueLiteral();

	/**
	 * Returns the meta object for the attribute '{@link activitydiagram.EStructuralFeature#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see activitydiagram.EStructuralFeature#getDefaultValue()
	 * @see #getEStructuralFeature()
	 * @generated
	 */
	EAttribute getEStructuralFeature_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link activitydiagram.EStructuralFeature#isUnsettable <em>Unsettable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unsettable</em>'.
	 * @see activitydiagram.EStructuralFeature#isUnsettable()
	 * @see #getEStructuralFeature()
	 * @generated
	 */
	EAttribute getEStructuralFeature_Unsettable();

	/**
	 * Returns the meta object for the attribute '{@link activitydiagram.EStructuralFeature#isDerived <em>Derived</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Derived</em>'.
	 * @see activitydiagram.EStructuralFeature#isDerived()
	 * @see #getEStructuralFeature()
	 * @generated
	 */
	EAttribute getEStructuralFeature_Derived();

	/**
	 * Returns the meta object for the container reference '{@link activitydiagram.EStructuralFeature#getEContainingClass <em>EContaining Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>EContaining Class</em>'.
	 * @see activitydiagram.EStructuralFeature#getEContainingClass()
	 * @see #getEStructuralFeature()
	 * @generated
	 */
	EReference getEStructuralFeature_EContainingClass();

	/**
	 * Returns the meta object for class '{@link activitydiagram.ETypedElement <em>ETyped Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ETyped Element</em>'.
	 * @see activitydiagram.ETypedElement
	 * @generated
	 */
	EClass getETypedElement();

	/**
	 * Returns the meta object for the attribute '{@link activitydiagram.ETypedElement#isOrdered <em>Ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ordered</em>'.
	 * @see activitydiagram.ETypedElement#isOrdered()
	 * @see #getETypedElement()
	 * @generated
	 */
	EAttribute getETypedElement_Ordered();

	/**
	 * Returns the meta object for the attribute '{@link activitydiagram.ETypedElement#isUnique <em>Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique</em>'.
	 * @see activitydiagram.ETypedElement#isUnique()
	 * @see #getETypedElement()
	 * @generated
	 */
	EAttribute getETypedElement_Unique();

	/**
	 * Returns the meta object for the attribute '{@link activitydiagram.ETypedElement#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see activitydiagram.ETypedElement#getLowerBound()
	 * @see #getETypedElement()
	 * @generated
	 */
	EAttribute getETypedElement_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link activitydiagram.ETypedElement#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see activitydiagram.ETypedElement#getUpperBound()
	 * @see #getETypedElement()
	 * @generated
	 */
	EAttribute getETypedElement_UpperBound();

	/**
	 * Returns the meta object for the attribute '{@link activitydiagram.ETypedElement#isMany <em>Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Many</em>'.
	 * @see activitydiagram.ETypedElement#isMany()
	 * @see #getETypedElement()
	 * @generated
	 */
	EAttribute getETypedElement_Many();

	/**
	 * Returns the meta object for the attribute '{@link activitydiagram.ETypedElement#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see activitydiagram.ETypedElement#isRequired()
	 * @see #getETypedElement()
	 * @generated
	 */
	EAttribute getETypedElement_Required();

	/**
	 * Returns the meta object for the reference '{@link activitydiagram.ETypedElement#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see activitydiagram.ETypedElement#getEType()
	 * @see #getETypedElement()
	 * @generated
	 */
	EReference getETypedElement_EType();

	/**
	 * Returns the meta object for the containment reference '{@link activitydiagram.ETypedElement#getEGenericType <em>EGeneric Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EGeneric Type</em>'.
	 * @see activitydiagram.ETypedElement#getEGenericType()
	 * @see #getETypedElement()
	 * @generated
	 */
	EReference getETypedElement_EGenericType();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>EString To String Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EString To String Map Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="activitydiagram.EString"
	 *        valueDataType="activitydiagram.EString"
	 * @generated
	 */
	EClass getEStringToStringMapEntry();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getEStringToStringMapEntry()
	 * @generated
	 */
	EAttribute getEStringToStringMapEntry_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getEStringToStringMapEntry()
	 * @generated
	 */
	EAttribute getEStringToStringMapEntry_Value();

	/**
	 * Returns the meta object for class '{@link activitydiagram.EGenericType <em>EGeneric Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EGeneric Type</em>'.
	 * @see activitydiagram.EGenericType
	 * @generated
	 */
	EClass getEGenericType();

	/**
	 * Returns the meta object for the containment reference '{@link activitydiagram.EGenericType#getEUpperBound <em>EUpper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EUpper Bound</em>'.
	 * @see activitydiagram.EGenericType#getEUpperBound()
	 * @see #getEGenericType()
	 * @generated
	 */
	EReference getEGenericType_EUpperBound();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagram.EGenericType#getETypeArguments <em>EType Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EType Arguments</em>'.
	 * @see activitydiagram.EGenericType#getETypeArguments()
	 * @see #getEGenericType()
	 * @generated
	 */
	EReference getEGenericType_ETypeArguments();

	/**
	 * Returns the meta object for the reference '{@link activitydiagram.EGenericType#getERawType <em>ERaw Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>ERaw Type</em>'.
	 * @see activitydiagram.EGenericType#getERawType()
	 * @see #getEGenericType()
	 * @generated
	 */
	EReference getEGenericType_ERawType();

	/**
	 * Returns the meta object for the containment reference '{@link activitydiagram.EGenericType#getELowerBound <em>ELower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ELower Bound</em>'.
	 * @see activitydiagram.EGenericType#getELowerBound()
	 * @see #getEGenericType()
	 * @generated
	 */
	EReference getEGenericType_ELowerBound();

	/**
	 * Returns the meta object for the reference '{@link activitydiagram.EGenericType#getETypeParameter <em>EType Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType Parameter</em>'.
	 * @see activitydiagram.EGenericType#getETypeParameter()
	 * @see #getEGenericType()
	 * @generated
	 */
	EReference getEGenericType_ETypeParameter();

	/**
	 * Returns the meta object for the reference '{@link activitydiagram.EGenericType#getEClassifier <em>EClassifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EClassifier</em>'.
	 * @see activitydiagram.EGenericType#getEClassifier()
	 * @see #getEGenericType()
	 * @generated
	 */
	EReference getEGenericType_EClassifier();

	/**
	 * Returns the meta object for class '{@link activitydiagram.ETypeParameter <em>EType Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EType Parameter</em>'.
	 * @see activitydiagram.ETypeParameter
	 * @generated
	 */
	EClass getETypeParameter();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagram.ETypeParameter#getEBounds <em>EBounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EBounds</em>'.
	 * @see activitydiagram.ETypeParameter#getEBounds()
	 * @see #getETypeParameter()
	 * @generated
	 */
	EReference getETypeParameter_EBounds();

	/**
	 * Returns the meta object for data type '{@link org.modelexecution.operationalsemantics.gemoc.sequential.dynamic.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Context</em>'.
	 * @see org.modelexecution.operationalsemantics.gemoc.sequential.dynamic.Context
	 * @model instanceClass="org.modelexecution.operationalsemantics.gemoc.sequential.dynamic.Context"
	 * @generated
	 */
	EDataType getContext();

	/**
	 * Returns the meta object for data type '{@link org.modelexecution.operationalsemantics.gemoc.sequential.dynamic.Offer <em>Offer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Offer</em>'.
	 * @see org.modelexecution.operationalsemantics.gemoc.sequential.dynamic.Offer
	 * @model instanceClass="org.modelexecution.operationalsemantics.gemoc.sequential.dynamic.Offer"
	 * @generated
	 */
	EDataType getOffer();

	/**
	 * Returns the meta object for data type '{@link org.modelexecution.operationalsemantics.gemoc.sequential.dynamic.Token <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Token</em>'.
	 * @see org.modelexecution.operationalsemantics.gemoc.sequential.dynamic.Token
	 * @model instanceClass="org.modelexecution.operationalsemantics.gemoc.sequential.dynamic.Token"
	 * @generated
	 */
	EDataType getToken();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>EBig Decimal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EBig Decimal</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#decimal'"
	 * @generated
	 */
	EDataType getEBigDecimal();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>EBig Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EBig Integer</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#integer'"
	 * @generated
	 */
	EDataType getEBigInteger();

	/**
	 * Returns the meta object for data type '<em>EBoolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EBoolean</em>'.
	 * @model instanceClass="boolean"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#boolean'"
	 * @generated
	 */
	EDataType getEBoolean();

	/**
	 * Returns the meta object for data type '{@link java.lang.Boolean <em>EBoolean Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EBoolean Object</em>'.
	 * @see java.lang.Boolean
	 * @model instanceClass="java.lang.Boolean"
	 *        extendedMetaData="baseType='EBoolean' name='EBoolean:Object'"
	 * @generated
	 */
	EDataType getEBooleanObject();

	/**
	 * Returns the meta object for data type '<em>EByte</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EByte</em>'.
	 * @model instanceClass="byte"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#byte'"
	 * @generated
	 */
	EDataType getEByte();

	/**
	 * Returns the meta object for data type '<em>EByte Array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EByte Array</em>'.
	 * @model instanceClass="byte[]"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#hexBinary'"
	 * @generated
	 */
	EDataType getEByteArray();

	/**
	 * Returns the meta object for data type '{@link java.lang.Byte <em>EByte Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EByte Object</em>'.
	 * @see java.lang.Byte
	 * @model instanceClass="java.lang.Byte"
	 *        extendedMetaData="baseType='EByte' name='EByte:Object'"
	 * @generated
	 */
	EDataType getEByteObject();

	/**
	 * Returns the meta object for data type '<em>EChar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EChar</em>'.
	 * @model instanceClass="char"
	 * @generated
	 */
	EDataType getEChar();

	/**
	 * Returns the meta object for data type '{@link java.lang.Character <em>ECharacter Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ECharacter Object</em>'.
	 * @see java.lang.Character
	 * @model instanceClass="java.lang.Character"
	 *        extendedMetaData="baseType='EChar' name='EChar:Object'"
	 * @generated
	 */
	EDataType getECharacterObject();

	/**
	 * Returns the meta object for data type '{@link java.util.Date <em>EDate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EDate</em>'.
	 * @see java.util.Date
	 * @model instanceClass="java.util.Date"
	 * @generated
	 */
	EDataType getEDate();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.common.util.DiagnosticChain <em>EDiagnostic Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EDiagnostic Chain</em>'.
	 * @see org.eclipse.emf.common.util.DiagnosticChain
	 * @model instanceClass="org.eclipse.emf.common.util.DiagnosticChain" serializeable="false"
	 * @generated
	 */
	EDataType getEDiagnosticChain();

	/**
	 * Returns the meta object for data type '<em>EDouble</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EDouble</em>'.
	 * @model instanceClass="double"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#double'"
	 * @generated
	 */
	EDataType getEDouble();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>EDouble Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EDouble Object</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 *        extendedMetaData="baseType='EDouble' name='EDouble:Object'"
	 * @generated
	 */
	EDataType getEDoubleObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.common.util.EList <em>EE List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EE List</em>'.
	 * @see org.eclipse.emf.common.util.EList
	 * @model instanceClass="org.eclipse.emf.common.util.EList" serializeable="false" typeParameters="E"
	 * @generated
	 */
	EDataType getEEList();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.common.util.Enumerator <em>EEnumerator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EEnumerator</em>'.
	 * @see org.eclipse.emf.common.util.Enumerator
	 * @model instanceClass="org.eclipse.emf.common.util.Enumerator" serializeable="false"
	 * @generated
	 */
	EDataType getEEnumerator();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.ecore.util.FeatureMap <em>EFeature Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EFeature Map</em>'.
	 * @see org.eclipse.emf.ecore.util.FeatureMap
	 * @model instanceClass="org.eclipse.emf.ecore.util.FeatureMap" serializeable="false"
	 * @generated
	 */
	EDataType getEFeatureMap();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.ecore.util.FeatureMap.Entry <em>EFeature Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EFeature Map Entry</em>'.
	 * @see org.eclipse.emf.ecore.util.FeatureMap.Entry
	 * @model instanceClass="org.eclipse.emf.ecore.util.FeatureMap$Entry" serializeable="false"
	 * @generated
	 */
	EDataType getEFeatureMapEntry();

	/**
	 * Returns the meta object for data type '<em>EFloat</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EFloat</em>'.
	 * @model instanceClass="float"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#float'"
	 * @generated
	 */
	EDataType getEFloat();

	/**
	 * Returns the meta object for data type '{@link java.lang.Float <em>EFloat Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EFloat Object</em>'.
	 * @see java.lang.Float
	 * @model instanceClass="java.lang.Float"
	 *        extendedMetaData="baseType='EFloat' name='EFloat:Object'"
	 * @generated
	 */
	EDataType getEFloatObject();

	/**
	 * Returns the meta object for data type '<em>EInt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EInt</em>'.
	 * @model instanceClass="int"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#int'"
	 * @generated
	 */
	EDataType getEInt();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>EInteger Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EInteger Object</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 *        extendedMetaData="baseType='EInt' name='EInt:Object'"
	 * @generated
	 */
	EDataType getEIntegerObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.Class <em>EJava Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EJava Class</em>'.
	 * @see java.lang.Class
	 * @model instanceClass="java.lang.Class" typeParameters="T"
	 * @generated
	 */
	EDataType getEJavaClass();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>EJava Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EJava Object</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getEJavaObject();

	/**
	 * Returns the meta object for data type '<em>ELong</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ELong</em>'.
	 * @model instanceClass="long"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#long'"
	 * @generated
	 */
	EDataType getELong();

	/**
	 * Returns the meta object for data type '{@link java.lang.Long <em>ELong Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ELong Object</em>'.
	 * @see java.lang.Long
	 * @model instanceClass="java.lang.Long"
	 *        extendedMetaData="baseType='ELong' name='ELong:Object'"
	 * @generated
	 */
	EDataType getELongObject();

	/**
	 * Returns the meta object for data type '{@link java.util.Map <em>EMap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EMap</em>'.
	 * @see java.util.Map
	 * @model instanceClass="java.util.Map" serializeable="false" typeParameters="K V"
	 * @generated
	 */
	EDataType getEMap();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.ecore.resource.Resource <em>EResource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EResource</em>'.
	 * @see org.eclipse.emf.ecore.resource.Resource
	 * @model instanceClass="org.eclipse.emf.ecore.resource.Resource" serializeable="false"
	 * @generated
	 */
	EDataType getEResource();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.ecore.resource.ResourceSet <em>EResource Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EResource Set</em>'.
	 * @see org.eclipse.emf.ecore.resource.ResourceSet
	 * @model instanceClass="org.eclipse.emf.ecore.resource.ResourceSet" serializeable="false"
	 * @generated
	 */
	EDataType getEResourceSet();

	/**
	 * Returns the meta object for data type '<em>EShort</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EShort</em>'.
	 * @model instanceClass="short"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#short'"
	 * @generated
	 */
	EDataType getEShort();

	/**
	 * Returns the meta object for data type '{@link java.lang.Short <em>EShort Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EShort Object</em>'.
	 * @see java.lang.Short
	 * @model instanceClass="java.lang.Short"
	 *        extendedMetaData="baseType='EShort' name='EShort:Object'"
	 * @generated
	 */
	EDataType getEShortObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>EString</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EString</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#string'"
	 * @generated
	 */
	EDataType getEString();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.common.util.TreeIterator <em>ETree Iterator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ETree Iterator</em>'.
	 * @see org.eclipse.emf.common.util.TreeIterator
	 * @model instanceClass="org.eclipse.emf.common.util.TreeIterator" serializeable="false" typeParameters="E"
	 * @generated
	 */
	EDataType getETreeIterator();

	/**
	 * Returns the meta object for data type '{@link java.lang.reflect.InvocationTargetException <em>EInvocation Target Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EInvocation Target Exception</em>'.
	 * @see java.lang.reflect.InvocationTargetException
	 * @model instanceClass="java.lang.reflect.InvocationTargetException" serializeable="false"
	 * @generated
	 */
	EDataType getEInvocationTargetException();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ActivitydiagramFactory getActivitydiagramFactory();

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
		 * The meta object literal for the '{@link activitydiagram.impl.OpaqueActionImpl <em>Opaque Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagram.impl.OpaqueActionImpl
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getOpaqueAction()
		 * @generated
		 */
		EClass OPAQUE_ACTION = eINSTANCE.getOpaqueAction();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPAQUE_ACTION__EXPRESSIONS = eINSTANCE.getOpaqueAction_Expressions();

		/**
		 * The meta object literal for the '{@link activitydiagram.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagram.impl.ActionImpl
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '{@link activitydiagram.impl.ExecutableNodeImpl <em>Executable Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagram.impl.ExecutableNodeImpl
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getExecutableNode()
		 * @generated
		 */
		EClass EXECUTABLE_NODE = eINSTANCE.getExecutableNode();

		/**
		 * The meta object literal for the '{@link activitydiagram.impl.ActivityNodeImpl <em>Activity Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagram.impl.ActivityNodeImpl
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getActivityNode()
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
		 * The meta object literal for the '{@link activitydiagram.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagram.impl.NamedElementImpl
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link activitydiagram.impl.ActivityEdgeImpl <em>Activity Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagram.impl.ActivityEdgeImpl
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getActivityEdge()
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
		 * The meta object literal for the '<em><b>Offers</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_EDGE__OFFERS = eINSTANCE.getActivityEdge_Offers();

		/**
		 * The meta object literal for the '{@link activitydiagram.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagram.impl.ActivityImpl
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getActivity()
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
		 * The meta object literal for the '{@link activitydiagram.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagram.impl.VariableImpl
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getVariable()
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
		 * The meta object literal for the '{@link activitydiagram.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagram.impl.ValueImpl
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '{@link activitydiagram.impl.InputValueImpl <em>Input Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagram.impl.InputValueImpl
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getInputValue()
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
		 * The meta object literal for the '{@link activitydiagram.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagram.impl.ExpressionImpl
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link activitydiagram.impl.EAttributeImpl <em>EAttribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagram.impl.EAttributeImpl
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEAttribute()
		 * @generated
		 */
		EClass EATTRIBUTE = eINSTANCE.getEAttribute();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EATTRIBUTE__ID = eINSTANCE.getEAttribute_ID();

		/**
		 * The meta object literal for the '<em><b>EAttribute Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EATTRIBUTE__EATTRIBUTE_TYPE = eINSTANCE.getEAttribute_EAttributeType();

		/**
		 * The meta object literal for the '{@link activitydiagram.impl.EAnnotationImpl <em>EAnnotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagram.impl.EAnnotationImpl
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEAnnotation()
		 * @generated
		 */
		EClass EANNOTATION = eINSTANCE.getEAnnotation();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EANNOTATION__SOURCE = eINSTANCE.getEAnnotation_Source();

		/**
		 * The meta object literal for the '<em><b>Details</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EANNOTATION__DETAILS = eINSTANCE.getEAnnotation_Details();

		/**
		 * The meta object literal for the '<em><b>EModel Element</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EANNOTATION__EMODEL_ELEMENT = eINSTANCE.getEAnnotation_EModelElement();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EANNOTATION__CONTENTS = eINSTANCE.getEAnnotation_Contents();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EANNOTATION__REFERENCES = eINSTANCE.getEAnnotation_References();

		/**
		 * The meta object literal for the '{@link activitydiagram.impl.EClassImpl <em>EClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagram.impl.EClassImpl
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEClass()
		 * @generated
		 */
		EClass ECLASS = eINSTANCE.getEClass();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECLASS__ABSTRACT = eINSTANCE.getEClass_Abstract();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECLASS__INTERFACE = eINSTANCE.getEClass_Interface();

		/**
		 * The meta object literal for the '<em><b>ESuper Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASS__ESUPER_TYPES = eINSTANCE.getEClass_ESuperTypes();

		/**
		 * The meta object literal for the '<em><b>EOperations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASS__EOPERATIONS = eINSTANCE.getEClass_EOperations();

		/**
		 * The meta object literal for the '<em><b>EAll Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASS__EALL_ATTRIBUTES = eINSTANCE.getEClass_EAllAttributes();

		/**
		 * The meta object literal for the '<em><b>EAll References</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASS__EALL_REFERENCES = eINSTANCE.getEClass_EAllReferences();

		/**
		 * The meta object literal for the '<em><b>EReferences</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASS__EREFERENCES = eINSTANCE.getEClass_EReferences();

		/**
		 * The meta object literal for the '<em><b>EAttributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASS__EATTRIBUTES = eINSTANCE.getEClass_EAttributes();

		/**
		 * The meta object literal for the '<em><b>EAll Containments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASS__EALL_CONTAINMENTS = eINSTANCE.getEClass_EAllContainments();

		/**
		 * The meta object literal for the '<em><b>EAll Operations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASS__EALL_OPERATIONS = eINSTANCE.getEClass_EAllOperations();

		/**
		 * The meta object literal for the '<em><b>EAll Structural Features</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASS__EALL_STRUCTURAL_FEATURES = eINSTANCE.getEClass_EAllStructuralFeatures();

		/**
		 * The meta object literal for the '<em><b>EAll Super Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASS__EALL_SUPER_TYPES = eINSTANCE.getEClass_EAllSuperTypes();

		/**
		 * The meta object literal for the '<em><b>EID Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASS__EID_ATTRIBUTE = eINSTANCE.getEClass_EIDAttribute();

		/**
		 * The meta object literal for the '<em><b>EStructural Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASS__ESTRUCTURAL_FEATURES = eINSTANCE.getEClass_EStructuralFeatures();

		/**
		 * The meta object literal for the '<em><b>EGeneric Super Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASS__EGENERIC_SUPER_TYPES = eINSTANCE.getEClass_EGenericSuperTypes();

		/**
		 * The meta object literal for the '<em><b>EAll Generic Super Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASS__EALL_GENERIC_SUPER_TYPES = eINSTANCE.getEClass_EAllGenericSuperTypes();

		/**
		 * The meta object literal for the '{@link activitydiagram.impl.EClassifierImpl <em>EClassifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagram.impl.EClassifierImpl
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEClassifier()
		 * @generated
		 */
		EClass ECLASSIFIER = eINSTANCE.getEClassifier();

		/**
		 * The meta object literal for the '<em><b>Instance Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECLASSIFIER__INSTANCE_CLASS_NAME = eINSTANCE.getEClassifier_InstanceClassName();

		/**
		 * The meta object literal for the '<em><b>Instance Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECLASSIFIER__INSTANCE_CLASS = eINSTANCE.getEClassifier_InstanceClass();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECLASSIFIER__DEFAULT_VALUE = eINSTANCE.getEClassifier_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Instance Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECLASSIFIER__INSTANCE_TYPE_NAME = eINSTANCE.getEClassifier_InstanceTypeName();

		/**
		 * The meta object literal for the '<em><b>EPackage</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASSIFIER__EPACKAGE = eINSTANCE.getEClassifier_EPackage();

		/**
		 * The meta object literal for the '<em><b>EType Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASSIFIER__ETYPE_PARAMETERS = eINSTANCE.getEClassifier_ETypeParameters();

		/**
		 * The meta object literal for the '{@link activitydiagram.impl.EDataTypeImpl <em>EData Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagram.impl.EDataTypeImpl
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEDataType()
		 * @generated
		 */
		EClass EDATA_TYPE = eINSTANCE.getEDataType();

		/**
		 * The meta object literal for the '<em><b>Serializable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDATA_TYPE__SERIALIZABLE = eINSTANCE.getEDataType_Serializable();

		/**
		 * The meta object literal for the '{@link activitydiagram.impl.EEnumImpl <em>EEnum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagram.impl.EEnumImpl
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEEnum()
		 * @generated
		 */
		EClass EENUM = eINSTANCE.getEEnum();

		/**
		 * The meta object literal for the '<em><b>ELiterals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EENUM__ELITERALS = eINSTANCE.getEEnum_ELiterals();

		/**
		 * The meta object literal for the '{@link activitydiagram.impl.EEnumLiteralImpl <em>EEnum Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagram.impl.EEnumLiteralImpl
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEEnumLiteral()
		 * @generated
		 */
		EClass EENUM_LITERAL = eINSTANCE.getEEnumLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EENUM_LITERAL__VALUE = eINSTANCE.getEEnumLiteral_Value();

		/**
		 * The meta object literal for the '<em><b>Instance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EENUM_LITERAL__INSTANCE = eINSTANCE.getEEnumLiteral_Instance();

		/**
		 * The meta object literal for the '<em><b>Literal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EENUM_LITERAL__LITERAL = eINSTANCE.getEEnumLiteral_Literal();

		/**
		 * The meta object literal for the '<em><b>EEnum</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EENUM_LITERAL__EENUM = eINSTANCE.getEEnumLiteral_EEnum();

		/**
		 * The meta object literal for the '{@link activitydiagram.impl.EFactoryImpl <em>EFactory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagram.impl.EFactoryImpl
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEFactory()
		 * @generated
		 */
		EClass EFACTORY = eINSTANCE.getEFactory();

		/**
		 * The meta object literal for the '<em><b>EPackage</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EFACTORY__EPACKAGE = eINSTANCE.getEFactory_EPackage();

		/**
		 * The meta object literal for the '{@link activitydiagram.impl.EModelElementImpl <em>EModel Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagram.impl.EModelElementImpl
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEModelElement()
		 * @generated
		 */
		EClass EMODEL_ELEMENT = eINSTANCE.getEModelElement();

		/**
		 * The meta object literal for the '<em><b>EAnnotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMODEL_ELEMENT__EANNOTATIONS = eINSTANCE.getEModelElement_EAnnotations();

		/**
		 * The meta object literal for the '{@link activitydiagram.impl.ENamedElementImpl <em>ENamed Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagram.impl.ENamedElementImpl
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getENamedElement()
		 * @generated
		 */
		EClass ENAMED_ELEMENT = eINSTANCE.getENamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENAMED_ELEMENT__NAME = eINSTANCE.getENamedElement_Name();

		/**
		 * The meta object literal for the '{@link activitydiagram.impl.EObjectImpl <em>EObject</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagram.impl.EObjectImpl
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEObject()
		 * @generated
		 */
		EClass EOBJECT = eINSTANCE.getEObject();

		/**
		 * The meta object literal for the '{@link activitydiagram.impl.EOperationImpl <em>EOperation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagram.impl.EOperationImpl
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEOperation()
		 * @generated
		 */
		EClass EOPERATION = eINSTANCE.getEOperation();

		/**
		 * The meta object literal for the '<em><b>EContaining Class</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOPERATION__ECONTAINING_CLASS = eINSTANCE.getEOperation_EContainingClass();

		/**
		 * The meta object literal for the '<em><b>EType Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOPERATION__ETYPE_PARAMETERS = eINSTANCE.getEOperation_ETypeParameters();

		/**
		 * The meta object literal for the '<em><b>EParameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOPERATION__EPARAMETERS = eINSTANCE.getEOperation_EParameters();

		/**
		 * The meta object literal for the '<em><b>EExceptions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOPERATION__EEXCEPTIONS = eINSTANCE.getEOperation_EExceptions();

		/**
		 * The meta object literal for the '<em><b>EGeneric Exceptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOPERATION__EGENERIC_EXCEPTIONS = eINSTANCE.getEOperation_EGenericExceptions();

		/**
		 * The meta object literal for the '<em><b>Behavior</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOPERATION__BEHAVIOR = eINSTANCE.getEOperation_Behavior();

		/**
		 * The meta object literal for the '{@link activitydiagram.impl.EPackageImpl <em>EPackage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagram.impl.EPackageImpl
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEPackage()
		 * @generated
		 */
		EClass EPACKAGE = eINSTANCE.getEPackage();

		/**
		 * The meta object literal for the '<em><b>Ns URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPACKAGE__NS_URI = eINSTANCE.getEPackage_NsURI();

		/**
		 * The meta object literal for the '<em><b>Ns Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPACKAGE__NS_PREFIX = eINSTANCE.getEPackage_NsPrefix();

		/**
		 * The meta object literal for the '<em><b>EFactory Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EPACKAGE__EFACTORY_INSTANCE = eINSTANCE.getEPackage_EFactoryInstance();

		/**
		 * The meta object literal for the '<em><b>EClassifiers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EPACKAGE__ECLASSIFIERS = eINSTANCE.getEPackage_EClassifiers();

		/**
		 * The meta object literal for the '<em><b>ESubpackages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EPACKAGE__ESUBPACKAGES = eINSTANCE.getEPackage_ESubpackages();

		/**
		 * The meta object literal for the '<em><b>ESuper Package</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EPACKAGE__ESUPER_PACKAGE = eINSTANCE.getEPackage_ESuperPackage();

		/**
		 * The meta object literal for the '{@link activitydiagram.impl.EParameterImpl <em>EParameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagram.impl.EParameterImpl
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEParameter()
		 * @generated
		 */
		EClass EPARAMETER = eINSTANCE.getEParameter();

		/**
		 * The meta object literal for the '<em><b>EOperation</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EPARAMETER__EOPERATION = eINSTANCE.getEParameter_EOperation();

		/**
		 * The meta object literal for the '{@link activitydiagram.impl.EReferenceImpl <em>EReference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagram.impl.EReferenceImpl
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEReference()
		 * @generated
		 */
		EClass EREFERENCE = eINSTANCE.getEReference();

		/**
		 * The meta object literal for the '<em><b>Containment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EREFERENCE__CONTAINMENT = eINSTANCE.getEReference_Containment();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EREFERENCE__CONTAINER = eINSTANCE.getEReference_Container();

		/**
		 * The meta object literal for the '<em><b>Resolve Proxies</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EREFERENCE__RESOLVE_PROXIES = eINSTANCE.getEReference_ResolveProxies();

		/**
		 * The meta object literal for the '<em><b>EOpposite</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EREFERENCE__EOPPOSITE = eINSTANCE.getEReference_EOpposite();

		/**
		 * The meta object literal for the '<em><b>EReference Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EREFERENCE__EREFERENCE_TYPE = eINSTANCE.getEReference_EReferenceType();

		/**
		 * The meta object literal for the '<em><b>EKeys</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EREFERENCE__EKEYS = eINSTANCE.getEReference_EKeys();

		/**
		 * The meta object literal for the '{@link activitydiagram.impl.EStructuralFeatureImpl <em>EStructural Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagram.impl.EStructuralFeatureImpl
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEStructuralFeature()
		 * @generated
		 */
		EClass ESTRUCTURAL_FEATURE = eINSTANCE.getEStructuralFeature();

		/**
		 * The meta object literal for the '<em><b>Changeable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTRUCTURAL_FEATURE__CHANGEABLE = eINSTANCE.getEStructuralFeature_Changeable();

		/**
		 * The meta object literal for the '<em><b>Volatile</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTRUCTURAL_FEATURE__VOLATILE = eINSTANCE.getEStructuralFeature_Volatile();

		/**
		 * The meta object literal for the '<em><b>Transient</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTRUCTURAL_FEATURE__TRANSIENT = eINSTANCE.getEStructuralFeature_Transient();

		/**
		 * The meta object literal for the '<em><b>Default Value Literal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTRUCTURAL_FEATURE__DEFAULT_VALUE_LITERAL = eINSTANCE.getEStructuralFeature_DefaultValueLiteral();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTRUCTURAL_FEATURE__DEFAULT_VALUE = eINSTANCE.getEStructuralFeature_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Unsettable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTRUCTURAL_FEATURE__UNSETTABLE = eINSTANCE.getEStructuralFeature_Unsettable();

		/**
		 * The meta object literal for the '<em><b>Derived</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTRUCTURAL_FEATURE__DERIVED = eINSTANCE.getEStructuralFeature_Derived();

		/**
		 * The meta object literal for the '<em><b>EContaining Class</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESTRUCTURAL_FEATURE__ECONTAINING_CLASS = eINSTANCE.getEStructuralFeature_EContainingClass();

		/**
		 * The meta object literal for the '{@link activitydiagram.impl.ETypedElementImpl <em>ETyped Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagram.impl.ETypedElementImpl
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getETypedElement()
		 * @generated
		 */
		EClass ETYPED_ELEMENT = eINSTANCE.getETypedElement();

		/**
		 * The meta object literal for the '<em><b>Ordered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETYPED_ELEMENT__ORDERED = eINSTANCE.getETypedElement_Ordered();

		/**
		 * The meta object literal for the '<em><b>Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETYPED_ELEMENT__UNIQUE = eINSTANCE.getETypedElement_Unique();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETYPED_ELEMENT__LOWER_BOUND = eINSTANCE.getETypedElement_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETYPED_ELEMENT__UPPER_BOUND = eINSTANCE.getETypedElement_UpperBound();

		/**
		 * The meta object literal for the '<em><b>Many</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETYPED_ELEMENT__MANY = eINSTANCE.getETypedElement_Many();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETYPED_ELEMENT__REQUIRED = eINSTANCE.getETypedElement_Required();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ETYPED_ELEMENT__ETYPE = eINSTANCE.getETypedElement_EType();

		/**
		 * The meta object literal for the '<em><b>EGeneric Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ETYPED_ELEMENT__EGENERIC_TYPE = eINSTANCE.getETypedElement_EGenericType();

		/**
		 * The meta object literal for the '{@link activitydiagram.impl.EStringToStringMapEntryImpl <em>EString To String Map Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagram.impl.EStringToStringMapEntryImpl
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEStringToStringMapEntry()
		 * @generated
		 */
		EClass ESTRING_TO_STRING_MAP_ENTRY = eINSTANCE.getEStringToStringMapEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTRING_TO_STRING_MAP_ENTRY__KEY = eINSTANCE.getEStringToStringMapEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTRING_TO_STRING_MAP_ENTRY__VALUE = eINSTANCE.getEStringToStringMapEntry_Value();

		/**
		 * The meta object literal for the '{@link activitydiagram.impl.EGenericTypeImpl <em>EGeneric Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagram.impl.EGenericTypeImpl
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEGenericType()
		 * @generated
		 */
		EClass EGENERIC_TYPE = eINSTANCE.getEGenericType();

		/**
		 * The meta object literal for the '<em><b>EUpper Bound</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EGENERIC_TYPE__EUPPER_BOUND = eINSTANCE.getEGenericType_EUpperBound();

		/**
		 * The meta object literal for the '<em><b>EType Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EGENERIC_TYPE__ETYPE_ARGUMENTS = eINSTANCE.getEGenericType_ETypeArguments();

		/**
		 * The meta object literal for the '<em><b>ERaw Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EGENERIC_TYPE__ERAW_TYPE = eINSTANCE.getEGenericType_ERawType();

		/**
		 * The meta object literal for the '<em><b>ELower Bound</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EGENERIC_TYPE__ELOWER_BOUND = eINSTANCE.getEGenericType_ELowerBound();

		/**
		 * The meta object literal for the '<em><b>EType Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EGENERIC_TYPE__ETYPE_PARAMETER = eINSTANCE.getEGenericType_ETypeParameter();

		/**
		 * The meta object literal for the '<em><b>EClassifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EGENERIC_TYPE__ECLASSIFIER = eINSTANCE.getEGenericType_EClassifier();

		/**
		 * The meta object literal for the '{@link activitydiagram.impl.ETypeParameterImpl <em>EType Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagram.impl.ETypeParameterImpl
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getETypeParameter()
		 * @generated
		 */
		EClass ETYPE_PARAMETER = eINSTANCE.getETypeParameter();

		/**
		 * The meta object literal for the '<em><b>EBounds</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ETYPE_PARAMETER__EBOUNDS = eINSTANCE.getETypeParameter_EBounds();

		/**
		 * The meta object literal for the '<em>Context</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.operationalsemantics.gemoc.sequential.dynamic.Context
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getContext()
		 * @generated
		 */
		EDataType CONTEXT = eINSTANCE.getContext();

		/**
		 * The meta object literal for the '<em>Offer</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.operationalsemantics.gemoc.sequential.dynamic.Offer
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getOffer()
		 * @generated
		 */
		EDataType OFFER = eINSTANCE.getOffer();

		/**
		 * The meta object literal for the '<em>Token</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.operationalsemantics.gemoc.sequential.dynamic.Token
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getToken()
		 * @generated
		 */
		EDataType TOKEN = eINSTANCE.getToken();

		/**
		 * The meta object literal for the '<em>EBig Decimal</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEBigDecimal()
		 * @generated
		 */
		EDataType EBIG_DECIMAL = eINSTANCE.getEBigDecimal();

		/**
		 * The meta object literal for the '<em>EBig Integer</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEBigInteger()
		 * @generated
		 */
		EDataType EBIG_INTEGER = eINSTANCE.getEBigInteger();

		/**
		 * The meta object literal for the '<em>EBoolean</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEBoolean()
		 * @generated
		 */
		EDataType EBOOLEAN = eINSTANCE.getEBoolean();

		/**
		 * The meta object literal for the '<em>EBoolean Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Boolean
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEBooleanObject()
		 * @generated
		 */
		EDataType EBOOLEAN_OBJECT = eINSTANCE.getEBooleanObject();

		/**
		 * The meta object literal for the '<em>EByte</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEByte()
		 * @generated
		 */
		EDataType EBYTE = eINSTANCE.getEByte();

		/**
		 * The meta object literal for the '<em>EByte Array</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEByteArray()
		 * @generated
		 */
		EDataType EBYTE_ARRAY = eINSTANCE.getEByteArray();

		/**
		 * The meta object literal for the '<em>EByte Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Byte
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEByteObject()
		 * @generated
		 */
		EDataType EBYTE_OBJECT = eINSTANCE.getEByteObject();

		/**
		 * The meta object literal for the '<em>EChar</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEChar()
		 * @generated
		 */
		EDataType ECHAR = eINSTANCE.getEChar();

		/**
		 * The meta object literal for the '<em>ECharacter Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Character
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getECharacterObject()
		 * @generated
		 */
		EDataType ECHARACTER_OBJECT = eINSTANCE.getECharacterObject();

		/**
		 * The meta object literal for the '<em>EDate</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Date
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEDate()
		 * @generated
		 */
		EDataType EDATE = eINSTANCE.getEDate();

		/**
		 * The meta object literal for the '<em>EDiagnostic Chain</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.common.util.DiagnosticChain
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEDiagnosticChain()
		 * @generated
		 */
		EDataType EDIAGNOSTIC_CHAIN = eINSTANCE.getEDiagnosticChain();

		/**
		 * The meta object literal for the '<em>EDouble</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEDouble()
		 * @generated
		 */
		EDataType EDOUBLE = eINSTANCE.getEDouble();

		/**
		 * The meta object literal for the '<em>EDouble Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEDoubleObject()
		 * @generated
		 */
		EDataType EDOUBLE_OBJECT = eINSTANCE.getEDoubleObject();

		/**
		 * The meta object literal for the '<em>EE List</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.common.util.EList
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEEList()
		 * @generated
		 */
		EDataType EE_LIST = eINSTANCE.getEEList();

		/**
		 * The meta object literal for the '<em>EEnumerator</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.common.util.Enumerator
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEEnumerator()
		 * @generated
		 */
		EDataType EENUMERATOR = eINSTANCE.getEEnumerator();

		/**
		 * The meta object literal for the '<em>EFeature Map</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecore.util.FeatureMap
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEFeatureMap()
		 * @generated
		 */
		EDataType EFEATURE_MAP = eINSTANCE.getEFeatureMap();

		/**
		 * The meta object literal for the '<em>EFeature Map Entry</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecore.util.FeatureMap.Entry
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEFeatureMapEntry()
		 * @generated
		 */
		EDataType EFEATURE_MAP_ENTRY = eINSTANCE.getEFeatureMapEntry();

		/**
		 * The meta object literal for the '<em>EFloat</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEFloat()
		 * @generated
		 */
		EDataType EFLOAT = eINSTANCE.getEFloat();

		/**
		 * The meta object literal for the '<em>EFloat Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Float
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEFloatObject()
		 * @generated
		 */
		EDataType EFLOAT_OBJECT = eINSTANCE.getEFloatObject();

		/**
		 * The meta object literal for the '<em>EInt</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEInt()
		 * @generated
		 */
		EDataType EINT = eINSTANCE.getEInt();

		/**
		 * The meta object literal for the '<em>EInteger Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEIntegerObject()
		 * @generated
		 */
		EDataType EINTEGER_OBJECT = eINSTANCE.getEIntegerObject();

		/**
		 * The meta object literal for the '<em>EJava Class</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Class
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEJavaClass()
		 * @generated
		 */
		EDataType EJAVA_CLASS = eINSTANCE.getEJavaClass();

		/**
		 * The meta object literal for the '<em>EJava Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEJavaObject()
		 * @generated
		 */
		EDataType EJAVA_OBJECT = eINSTANCE.getEJavaObject();

		/**
		 * The meta object literal for the '<em>ELong</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getELong()
		 * @generated
		 */
		EDataType ELONG = eINSTANCE.getELong();

		/**
		 * The meta object literal for the '<em>ELong Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Long
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getELongObject()
		 * @generated
		 */
		EDataType ELONG_OBJECT = eINSTANCE.getELongObject();

		/**
		 * The meta object literal for the '<em>EMap</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Map
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEMap()
		 * @generated
		 */
		EDataType EMAP = eINSTANCE.getEMap();

		/**
		 * The meta object literal for the '<em>EResource</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecore.resource.Resource
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEResource()
		 * @generated
		 */
		EDataType ERESOURCE = eINSTANCE.getEResource();

		/**
		 * The meta object literal for the '<em>EResource Set</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecore.resource.ResourceSet
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEResourceSet()
		 * @generated
		 */
		EDataType ERESOURCE_SET = eINSTANCE.getEResourceSet();

		/**
		 * The meta object literal for the '<em>EShort</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEShort()
		 * @generated
		 */
		EDataType ESHORT = eINSTANCE.getEShort();

		/**
		 * The meta object literal for the '<em>EShort Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Short
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEShortObject()
		 * @generated
		 */
		EDataType ESHORT_OBJECT = eINSTANCE.getEShortObject();

		/**
		 * The meta object literal for the '<em>EString</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEString()
		 * @generated
		 */
		EDataType ESTRING = eINSTANCE.getEString();

		/**
		 * The meta object literal for the '<em>ETree Iterator</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.common.util.TreeIterator
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getETreeIterator()
		 * @generated
		 */
		EDataType ETREE_ITERATOR = eINSTANCE.getETreeIterator();

		/**
		 * The meta object literal for the '<em>EInvocation Target Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.reflect.InvocationTargetException
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEInvocationTargetException()
		 * @generated
		 */
		EDataType EINVOCATION_TARGET_EXCEPTION = eINSTANCE.getEInvocationTargetException();

	}

} //ActivitydiagramPackage
