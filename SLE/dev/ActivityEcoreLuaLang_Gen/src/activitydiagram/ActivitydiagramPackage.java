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
	 * The meta object id for the '{@link activitydiagram.impl.ChunkImpl <em>Chunk</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.ChunkImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getChunk()
	 * @generated
	 */
	int CHUNK = 10;

	/**
	 * The number of structural features of the '<em>Chunk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagram.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.BlockImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 11;

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
	 * The meta object id for the '{@link activitydiagram.impl.LastStatementImpl <em>Last Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.LastStatementImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getLastStatement()
	 * @generated
	 */
	int LAST_STATEMENT = 12;

	/**
	 * The number of structural features of the '<em>Last Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STATEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagram.impl.LastStatement_ReturnImpl <em>Last Statement Return</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.LastStatement_ReturnImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getLastStatement_Return()
	 * @generated
	 */
	int LAST_STATEMENT_RETURN = 13;

	/**
	 * The number of structural features of the '<em>Last Statement Return</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STATEMENT_RETURN_FEATURE_COUNT = LAST_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagram.impl.LastStatement_BreakImpl <em>Last Statement Break</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.LastStatement_BreakImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getLastStatement_Break()
	 * @generated
	 */
	int LAST_STATEMENT_BREAK = 14;

	/**
	 * The number of structural features of the '<em>Last Statement Break</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STATEMENT_BREAK_FEATURE_COUNT = LAST_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagram.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.StatementImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 15;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagram.impl.Statement_BlockImpl <em>Statement Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.Statement_BlockImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getStatement_Block()
	 * @generated
	 */
	int STATEMENT_BLOCK = 16;

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
	 * The meta object id for the '{@link activitydiagram.impl.Statement_WhileImpl <em>Statement While</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.Statement_WhileImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getStatement_While()
	 * @generated
	 */
	int STATEMENT_WHILE = 17;

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
	 * The meta object id for the '{@link activitydiagram.impl.Statement_RepeatImpl <em>Statement Repeat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.Statement_RepeatImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getStatement_Repeat()
	 * @generated
	 */
	int STATEMENT_REPEAT = 18;

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
	 * The meta object id for the '{@link activitydiagram.impl.Statement_If_Then_ElseImpl <em>Statement If Then Else</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.Statement_If_Then_ElseImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getStatement_If_Then_Else()
	 * @generated
	 */
	int STATEMENT_IF_THEN_ELSE = 19;

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
	 * The meta object id for the '{@link activitydiagram.impl.Statement_If_Then_Else_ElseIfPartImpl <em>Statement If Then Else Else If Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.Statement_If_Then_Else_ElseIfPartImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getStatement_If_Then_Else_ElseIfPart()
	 * @generated
	 */
	int STATEMENT_IF_THEN_ELSE_ELSE_IF_PART = 20;

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
	 * The meta object id for the '{@link activitydiagram.impl.Statement_For_NumericImpl <em>Statement For Numeric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.Statement_For_NumericImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getStatement_For_Numeric()
	 * @generated
	 */
	int STATEMENT_FOR_NUMERIC = 21;

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
	 * The meta object id for the '{@link activitydiagram.impl.Statement_For_GenericImpl <em>Statement For Generic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.Statement_For_GenericImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getStatement_For_Generic()
	 * @generated
	 */
	int STATEMENT_FOR_GENERIC = 22;

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
	 * The meta object id for the '{@link activitydiagram.impl.Statement_GlobalFunction_DeclarationImpl <em>Statement Global Function Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.Statement_GlobalFunction_DeclarationImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getStatement_GlobalFunction_Declaration()
	 * @generated
	 */
	int STATEMENT_GLOBAL_FUNCTION_DECLARATION = 23;

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
	 * The meta object id for the '{@link activitydiagram.impl.Statement_LocalFunction_DeclarationImpl <em>Statement Local Function Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.Statement_LocalFunction_DeclarationImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getStatement_LocalFunction_Declaration()
	 * @generated
	 */
	int STATEMENT_LOCAL_FUNCTION_DECLARATION = 24;

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
	 * The meta object id for the '{@link activitydiagram.impl.Statement_Local_Variable_DeclarationImpl <em>Statement Local Variable Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.Statement_Local_Variable_DeclarationImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getStatement_Local_Variable_Declaration()
	 * @generated
	 */
	int STATEMENT_LOCAL_VARIABLE_DECLARATION = 25;

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
	 * The meta object id for the '{@link activitydiagram.impl.Statement_FunctioncallOrAssignmentImpl <em>Statement Functioncall Or Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.Statement_FunctioncallOrAssignmentImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getStatement_FunctioncallOrAssignment()
	 * @generated
	 */
	int STATEMENT_FUNCTIONCALL_OR_ASSIGNMENT = 26;

	/**
	 * The number of structural features of the '<em>Statement Functioncall Or Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FUNCTIONCALL_OR_ASSIGNMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagram.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.ExpressionImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 27;

	/**
	 * The feature id for the '<em><b>Lua</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__LUA = STATEMENT_FUNCTIONCALL_OR_ASSIGNMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = STATEMENT_FUNCTIONCALL_OR_ASSIGNMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link activitydiagram.impl.Expression_NilImpl <em>Expression Nil</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.Expression_NilImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getExpression_Nil()
	 * @generated
	 */
	int EXPRESSION_NIL = 28;

	/**
	 * The feature id for the '<em><b>Lua</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_NIL__LUA = EXPRESSION__LUA;

	/**
	 * The number of structural features of the '<em>Expression Nil</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_NIL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagram.impl.Expression_TrueImpl <em>Expression True</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.Expression_TrueImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getExpression_True()
	 * @generated
	 */
	int EXPRESSION_TRUE = 29;

	/**
	 * The feature id for the '<em><b>Lua</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_TRUE__LUA = EXPRESSION__LUA;

	/**
	 * The number of structural features of the '<em>Expression True</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_TRUE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagram.impl.Expression_FalseImpl <em>Expression False</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.Expression_FalseImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getExpression_False()
	 * @generated
	 */
	int EXPRESSION_FALSE = 30;

	/**
	 * The feature id for the '<em><b>Lua</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FALSE__LUA = EXPRESSION__LUA;

	/**
	 * The number of structural features of the '<em>Expression False</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FALSE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagram.impl.Expression_NumberImpl <em>Expression Number</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.Expression_NumberImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getExpression_Number()
	 * @generated
	 */
	int EXPRESSION_NUMBER = 31;

	/**
	 * The feature id for the '<em><b>Lua</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_NUMBER__LUA = EXPRESSION__LUA;

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
	 * The meta object id for the '{@link activitydiagram.impl.Expression_VarArgsImpl <em>Expression Var Args</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.Expression_VarArgsImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getExpression_VarArgs()
	 * @generated
	 */
	int EXPRESSION_VAR_ARGS = 32;

	/**
	 * The feature id for the '<em><b>Lua</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_VAR_ARGS__LUA = EXPRESSION__LUA;

	/**
	 * The number of structural features of the '<em>Expression Var Args</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_VAR_ARGS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagram.impl.Expression_StringImpl <em>Expression String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.Expression_StringImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getExpression_String()
	 * @generated
	 */
	int EXPRESSION_STRING = 33;

	/**
	 * The feature id for the '<em><b>Lua</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_STRING__LUA = EXPRESSION__LUA;

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
	 * The meta object id for the '{@link activitydiagram.impl.Expression_FunctionImpl <em>Expression Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.Expression_FunctionImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getExpression_Function()
	 * @generated
	 */
	int EXPRESSION_FUNCTION = 34;

	/**
	 * The feature id for the '<em><b>Lua</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FUNCTION__LUA = EXPRESSION__LUA;

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
	 * The meta object id for the '{@link activitydiagram.impl.Expression_TableConstructorImpl <em>Expression Table Constructor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.Expression_TableConstructorImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getExpression_TableConstructor()
	 * @generated
	 */
	int EXPRESSION_TABLE_CONSTRUCTOR = 35;

	/**
	 * The feature id for the '<em><b>Lua</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_TABLE_CONSTRUCTOR__LUA = EXPRESSION__LUA;

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
	 * The meta object id for the '{@link activitydiagram.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.FunctionImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 36;

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
	 * The meta object id for the '{@link activitydiagram.impl.Functioncall_ArgumentsImpl <em>Functioncall Arguments</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.Functioncall_ArgumentsImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getFunctioncall_Arguments()
	 * @generated
	 */
	int FUNCTIONCALL_ARGUMENTS = 37;

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
	 * The meta object id for the '{@link activitydiagram.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.FieldImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 38;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link activitydiagram.impl.Field_AddEntryToTable_BracketsImpl <em>Field Add Entry To Table Brackets</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.Field_AddEntryToTable_BracketsImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getField_AddEntryToTable_Brackets()
	 * @generated
	 */
	int FIELD_ADD_ENTRY_TO_TABLE_BRACKETS = 39;

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
	 * The meta object id for the '{@link activitydiagram.impl.Field_AddEntryToTableImpl <em>Field Add Entry To Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.Field_AddEntryToTableImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getField_AddEntryToTable()
	 * @generated
	 */
	int FIELD_ADD_ENTRY_TO_TABLE = 40;

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
	 * The meta object id for the '{@link activitydiagram.impl.Field_AppendEntryToTableImpl <em>Field Append Entry To Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.Field_AppendEntryToTableImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getField_AppendEntryToTable()
	 * @generated
	 */
	int FIELD_APPEND_ENTRY_TO_TABLE = 41;

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
	 * The meta object id for the '{@link activitydiagram.impl.LastStatement_ReturnWithValueImpl <em>Last Statement Return With Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.LastStatement_ReturnWithValueImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getLastStatement_ReturnWithValue()
	 * @generated
	 */
	int LAST_STATEMENT_RETURN_WITH_VALUE = 42;

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
	 * The meta object id for the '{@link activitydiagram.impl.Statement_AssignmentImpl <em>Statement Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.Statement_AssignmentImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getStatement_Assignment()
	 * @generated
	 */
	int STATEMENT_ASSIGNMENT = 43;

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
	 * The meta object id for the '{@link activitydiagram.impl.Statement_CallMemberFunctionImpl <em>Statement Call Member Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.Statement_CallMemberFunctionImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getStatement_CallMemberFunction()
	 * @generated
	 */
	int STATEMENT_CALL_MEMBER_FUNCTION = 44;

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
	 * The meta object id for the '{@link activitydiagram.impl.Statement_CallFunctionImpl <em>Statement Call Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.Statement_CallFunctionImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getStatement_CallFunction()
	 * @generated
	 */
	int STATEMENT_CALL_FUNCTION = 45;

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
	 * The meta object id for the '{@link activitydiagram.impl.Expression_OrImpl <em>Expression Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.Expression_OrImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getExpression_Or()
	 * @generated
	 */
	int EXPRESSION_OR = 46;

	/**
	 * The feature id for the '<em><b>Lua</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OR__LUA = EXPRESSION__LUA;

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
	 * The meta object id for the '{@link activitydiagram.impl.Expression_AndImpl <em>Expression And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.Expression_AndImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getExpression_And()
	 * @generated
	 */
	int EXPRESSION_AND = 47;

	/**
	 * The feature id for the '<em><b>Lua</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_AND__LUA = EXPRESSION__LUA;

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
	 * The meta object id for the '{@link activitydiagram.impl.Expression_LargerImpl <em>Expression Larger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.Expression_LargerImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getExpression_Larger()
	 * @generated
	 */
	int EXPRESSION_LARGER = 48;

	/**
	 * The feature id for the '<em><b>Lua</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_LARGER__LUA = EXPRESSION__LUA;

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
	 * The meta object id for the '{@link activitydiagram.impl.Expression_Larger_EqualImpl <em>Expression Larger Equal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.Expression_Larger_EqualImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getExpression_Larger_Equal()
	 * @generated
	 */
	int EXPRESSION_LARGER_EQUAL = 49;

	/**
	 * The feature id for the '<em><b>Lua</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_LARGER_EQUAL__LUA = EXPRESSION__LUA;

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
	 * The meta object id for the '{@link activitydiagram.impl.Expression_SmallerImpl <em>Expression Smaller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.Expression_SmallerImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getExpression_Smaller()
	 * @generated
	 */
	int EXPRESSION_SMALLER = 50;

	/**
	 * The feature id for the '<em><b>Lua</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_SMALLER__LUA = EXPRESSION__LUA;

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
	 * The meta object id for the '{@link activitydiagram.impl.Expression_Smaller_EqualImpl <em>Expression Smaller Equal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.Expression_Smaller_EqualImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getExpression_Smaller_Equal()
	 * @generated
	 */
	int EXPRESSION_SMALLER_EQUAL = 51;

	/**
	 * The feature id for the '<em><b>Lua</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_SMALLER_EQUAL__LUA = EXPRESSION__LUA;

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
	 * The meta object id for the '{@link activitydiagram.impl.Expression_EqualImpl <em>Expression Equal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.Expression_EqualImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getExpression_Equal()
	 * @generated
	 */
	int EXPRESSION_EQUAL = 52;

	/**
	 * The feature id for the '<em><b>Lua</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_EQUAL__LUA = EXPRESSION__LUA;

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
	 * The meta object id for the '{@link activitydiagram.impl.Expression_Not_EqualImpl <em>Expression Not Equal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.Expression_Not_EqualImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getExpression_Not_Equal()
	 * @generated
	 */
	int EXPRESSION_NOT_EQUAL = 53;

	/**
	 * The feature id for the '<em><b>Lua</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_NOT_EQUAL__LUA = EXPRESSION__LUA;

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
	 * The meta object id for the '{@link activitydiagram.impl.Expression_ConcatenationImpl <em>Expression Concatenation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.Expression_ConcatenationImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getExpression_Concatenation()
	 * @generated
	 */
	int EXPRESSION_CONCATENATION = 54;

	/**
	 * The feature id for the '<em><b>Lua</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_CONCATENATION__LUA = EXPRESSION__LUA;

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
	 * The meta object id for the '{@link activitydiagram.impl.Expression_PlusImpl <em>Expression Plus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.Expression_PlusImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getExpression_Plus()
	 * @generated
	 */
	int EXPRESSION_PLUS = 55;

	/**
	 * The feature id for the '<em><b>Lua</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_PLUS__LUA = EXPRESSION__LUA;

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
	 * The meta object id for the '{@link activitydiagram.impl.Expression_MinusImpl <em>Expression Minus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.Expression_MinusImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getExpression_Minus()
	 * @generated
	 */
	int EXPRESSION_MINUS = 56;

	/**
	 * The feature id for the '<em><b>Lua</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_MINUS__LUA = EXPRESSION__LUA;

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
	 * The meta object id for the '{@link activitydiagram.impl.Expression_MultiplicationImpl <em>Expression Multiplication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.Expression_MultiplicationImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getExpression_Multiplication()
	 * @generated
	 */
	int EXPRESSION_MULTIPLICATION = 57;

	/**
	 * The feature id for the '<em><b>Lua</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_MULTIPLICATION__LUA = EXPRESSION__LUA;

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
	 * The meta object id for the '{@link activitydiagram.impl.Expression_DivisionImpl <em>Expression Division</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.Expression_DivisionImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getExpression_Division()
	 * @generated
	 */
	int EXPRESSION_DIVISION = 58;

	/**
	 * The feature id for the '<em><b>Lua</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_DIVISION__LUA = EXPRESSION__LUA;

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
	 * The meta object id for the '{@link activitydiagram.impl.Expression_ModuloImpl <em>Expression Modulo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.Expression_ModuloImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getExpression_Modulo()
	 * @generated
	 */
	int EXPRESSION_MODULO = 59;

	/**
	 * The feature id for the '<em><b>Lua</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_MODULO__LUA = EXPRESSION__LUA;

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
	 * The meta object id for the '{@link activitydiagram.impl.Expression_NegateImpl <em>Expression Negate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.Expression_NegateImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getExpression_Negate()
	 * @generated
	 */
	int EXPRESSION_NEGATE = 60;

	/**
	 * The feature id for the '<em><b>Lua</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_NEGATE__LUA = EXPRESSION__LUA;

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
	 * The meta object id for the '{@link activitydiagram.impl.Expression_LengthImpl <em>Expression Length</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.Expression_LengthImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getExpression_Length()
	 * @generated
	 */
	int EXPRESSION_LENGTH = 61;

	/**
	 * The feature id for the '<em><b>Lua</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_LENGTH__LUA = EXPRESSION__LUA;

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
	 * The meta object id for the '{@link activitydiagram.impl.Expression_InvertImpl <em>Expression Invert</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.Expression_InvertImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getExpression_Invert()
	 * @generated
	 */
	int EXPRESSION_INVERT = 62;

	/**
	 * The feature id for the '<em><b>Lua</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_INVERT__LUA = EXPRESSION__LUA;

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
	 * The meta object id for the '{@link activitydiagram.impl.Expression_ExponentiationImpl <em>Expression Exponentiation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.Expression_ExponentiationImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getExpression_Exponentiation()
	 * @generated
	 */
	int EXPRESSION_EXPONENTIATION = 63;

	/**
	 * The feature id for the '<em><b>Lua</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_EXPONENTIATION__LUA = EXPRESSION__LUA;

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
	 * The meta object id for the '{@link activitydiagram.impl.Expression_CallMemberFunctionImpl <em>Expression Call Member Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.Expression_CallMemberFunctionImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getExpression_CallMemberFunction()
	 * @generated
	 */
	int EXPRESSION_CALL_MEMBER_FUNCTION = 64;

	/**
	 * The feature id for the '<em><b>Lua</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_CALL_MEMBER_FUNCTION__LUA = EXPRESSION__LUA;

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
	 * The meta object id for the '{@link activitydiagram.impl.Expression_CallFunctionImpl <em>Expression Call Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.Expression_CallFunctionImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getExpression_CallFunction()
	 * @generated
	 */
	int EXPRESSION_CALL_FUNCTION = 65;

	/**
	 * The feature id for the '<em><b>Lua</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_CALL_FUNCTION__LUA = EXPRESSION__LUA;

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
	 * The meta object id for the '{@link activitydiagram.impl.Expression_AccessArrayImpl <em>Expression Access Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.Expression_AccessArrayImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getExpression_AccessArray()
	 * @generated
	 */
	int EXPRESSION_ACCESS_ARRAY = 66;

	/**
	 * The feature id for the '<em><b>Lua</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ACCESS_ARRAY__LUA = EXPRESSION__LUA;

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
	 * The meta object id for the '{@link activitydiagram.impl.Expression_AccessMemberImpl <em>Expression Access Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.Expression_AccessMemberImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getExpression_AccessMember()
	 * @generated
	 */
	int EXPRESSION_ACCESS_MEMBER = 67;

	/**
	 * The feature id for the '<em><b>Lua</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ACCESS_MEMBER__LUA = EXPRESSION__LUA;

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
	 * The meta object id for the '{@link activitydiagram.impl.Expression_VariableNameImpl <em>Expression Variable Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.Expression_VariableNameImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getExpression_VariableName()
	 * @generated
	 */
	int EXPRESSION_VARIABLE_NAME = 68;

	/**
	 * The feature id for the '<em><b>Lua</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_VARIABLE_NAME__LUA = EXPRESSION__LUA;

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
	 * The meta object id for the '{@link activitydiagram.impl.EModelElementImpl <em>EModel Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.EModelElementImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEModelElement()
	 * @generated
	 */
	int EMODEL_ELEMENT = 77;

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
	int ENAMED_ELEMENT = 78;

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
	int ETYPED_ELEMENT = 85;

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
	int ESTRUCTURAL_FEATURE = 84;

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
	int EATTRIBUTE = 69;

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
	int EANNOTATION = 70;

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
	int ECLASSIFIER = 72;

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
	int ECLASS = 71;

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
	int EDATA_TYPE = 73;

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
	int EENUM = 74;

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
	int EENUM_LITERAL = 75;

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
	int EFACTORY = 76;

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
	int EOBJECT = 79;

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
	int EOPERATION = 80;

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
	int EPACKAGE = 81;

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
	int EPARAMETER = 82;

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
	int EREFERENCE = 83;

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
	int ESTRING_TO_STRING_MAP_ENTRY = 86;

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
	int EGENERIC_TYPE = 87;

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
	int ETYPE_PARAMETER = 88;

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
	int CONTEXT = 89;

	/**
	 * The meta object id for the '<em>Offer</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.operationalsemantics.gemoc.sequential.dynamic.Offer
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getOffer()
	 * @generated
	 */
	int OFFER = 90;

	/**
	 * The meta object id for the '<em>Token</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.operationalsemantics.gemoc.sequential.dynamic.Token
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getToken()
	 * @generated
	 */
	int TOKEN = 91;

	/**
	 * The meta object id for the '<em>environment</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.k3.lua.dynamic.environment
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getenvironment()
	 * @generated
	 */
	int ENVIRONMENT = 92;

	/**
	 * The meta object id for the '<em>EBig Decimal</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEBigDecimal()
	 * @generated
	 */
	int EBIG_DECIMAL = 93;

	/**
	 * The meta object id for the '<em>EBig Integer</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEBigInteger()
	 * @generated
	 */
	int EBIG_INTEGER = 94;

	/**
	 * The meta object id for the '<em>EBoolean</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEBoolean()
	 * @generated
	 */
	int EBOOLEAN = 95;

	/**
	 * The meta object id for the '<em>EBoolean Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Boolean
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEBooleanObject()
	 * @generated
	 */
	int EBOOLEAN_OBJECT = 96;

	/**
	 * The meta object id for the '<em>EByte</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEByte()
	 * @generated
	 */
	int EBYTE = 97;

	/**
	 * The meta object id for the '<em>EByte Array</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEByteArray()
	 * @generated
	 */
	int EBYTE_ARRAY = 98;

	/**
	 * The meta object id for the '<em>EByte Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Byte
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEByteObject()
	 * @generated
	 */
	int EBYTE_OBJECT = 99;

	/**
	 * The meta object id for the '<em>EChar</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEChar()
	 * @generated
	 */
	int ECHAR = 100;

	/**
	 * The meta object id for the '<em>ECharacter Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Character
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getECharacterObject()
	 * @generated
	 */
	int ECHARACTER_OBJECT = 101;

	/**
	 * The meta object id for the '<em>EDate</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Date
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEDate()
	 * @generated
	 */
	int EDATE = 102;

	/**
	 * The meta object id for the '<em>EDiagnostic Chain</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.DiagnosticChain
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEDiagnosticChain()
	 * @generated
	 */
	int EDIAGNOSTIC_CHAIN = 103;

	/**
	 * The meta object id for the '<em>EDouble</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEDouble()
	 * @generated
	 */
	int EDOUBLE = 104;

	/**
	 * The meta object id for the '<em>EDouble Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEDoubleObject()
	 * @generated
	 */
	int EDOUBLE_OBJECT = 105;

	/**
	 * The meta object id for the '<em>EE List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.EList
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEEList()
	 * @generated
	 */
	int EE_LIST = 106;

	/**
	 * The meta object id for the '<em>EEnumerator</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Enumerator
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEEnumerator()
	 * @generated
	 */
	int EENUMERATOR = 107;

	/**
	 * The meta object id for the '<em>EFeature Map</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.util.FeatureMap
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEFeatureMap()
	 * @generated
	 */
	int EFEATURE_MAP = 108;

	/**
	 * The meta object id for the '<em>EFeature Map Entry</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.util.FeatureMap.Entry
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEFeatureMapEntry()
	 * @generated
	 */
	int EFEATURE_MAP_ENTRY = 109;

	/**
	 * The meta object id for the '<em>EFloat</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEFloat()
	 * @generated
	 */
	int EFLOAT = 110;

	/**
	 * The meta object id for the '<em>EFloat Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Float
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEFloatObject()
	 * @generated
	 */
	int EFLOAT_OBJECT = 111;

	/**
	 * The meta object id for the '<em>EInt</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEInt()
	 * @generated
	 */
	int EINT = 112;

	/**
	 * The meta object id for the '<em>EInteger Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEIntegerObject()
	 * @generated
	 */
	int EINTEGER_OBJECT = 113;

	/**
	 * The meta object id for the '<em>EJava Class</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Class
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEJavaClass()
	 * @generated
	 */
	int EJAVA_CLASS = 114;

	/**
	 * The meta object id for the '<em>EJava Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEJavaObject()
	 * @generated
	 */
	int EJAVA_OBJECT = 115;

	/**
	 * The meta object id for the '<em>ELong</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getELong()
	 * @generated
	 */
	int ELONG = 116;

	/**
	 * The meta object id for the '<em>ELong Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Long
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getELongObject()
	 * @generated
	 */
	int ELONG_OBJECT = 117;

	/**
	 * The meta object id for the '<em>EMap</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Map
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEMap()
	 * @generated
	 */
	int EMAP = 118;

	/**
	 * The meta object id for the '<em>EResource</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.resource.Resource
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEResource()
	 * @generated
	 */
	int ERESOURCE = 119;

	/**
	 * The meta object id for the '<em>EResource Set</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.resource.ResourceSet
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEResourceSet()
	 * @generated
	 */
	int ERESOURCE_SET = 120;

	/**
	 * The meta object id for the '<em>EShort</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEShort()
	 * @generated
	 */
	int ESHORT = 121;

	/**
	 * The meta object id for the '<em>EShort Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Short
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEShortObject()
	 * @generated
	 */
	int ESHORT_OBJECT = 122;

	/**
	 * The meta object id for the '<em>EString</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEString()
	 * @generated
	 */
	int ESTRING = 123;

	/**
	 * The meta object id for the '<em>ETree Iterator</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.TreeIterator
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getETreeIterator()
	 * @generated
	 */
	int ETREE_ITERATOR = 124;

	/**
	 * The meta object id for the '<em>EInvocation Target Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.reflect.InvocationTargetException
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getEInvocationTargetException()
	 * @generated
	 */
	int EINVOCATION_TARGET_EXCEPTION = 125;


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
	 * Returns the meta object for class '{@link activitydiagram.Chunk <em>Chunk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chunk</em>'.
	 * @see activitydiagram.Chunk
	 * @generated
	 */
	EClass getChunk();

	/**
	 * Returns the meta object for class '{@link activitydiagram.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see activitydiagram.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagram.Block#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see activitydiagram.Block#getStatements()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Statements();

	/**
	 * Returns the meta object for the containment reference '{@link activitydiagram.Block#getReturnValue <em>Return Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return Value</em>'.
	 * @see activitydiagram.Block#getReturnValue()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_ReturnValue();

	/**
	 * Returns the meta object for class '{@link activitydiagram.LastStatement <em>Last Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Last Statement</em>'.
	 * @see activitydiagram.LastStatement
	 * @generated
	 */
	EClass getLastStatement();

	/**
	 * Returns the meta object for class '{@link activitydiagram.LastStatement_Return <em>Last Statement Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Last Statement Return</em>'.
	 * @see activitydiagram.LastStatement_Return
	 * @generated
	 */
	EClass getLastStatement_Return();

	/**
	 * Returns the meta object for class '{@link activitydiagram.LastStatement_Break <em>Last Statement Break</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Last Statement Break</em>'.
	 * @see activitydiagram.LastStatement_Break
	 * @generated
	 */
	EClass getLastStatement_Break();

	/**
	 * Returns the meta object for class '{@link activitydiagram.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see activitydiagram.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for class '{@link activitydiagram.Statement_Block <em>Statement Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement Block</em>'.
	 * @see activitydiagram.Statement_Block
	 * @generated
	 */
	EClass getStatement_Block();

	/**
	 * Returns the meta object for the containment reference '{@link activitydiagram.Statement_Block#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Block</em>'.
	 * @see activitydiagram.Statement_Block#getBlock()
	 * @see #getStatement_Block()
	 * @generated
	 */
	EReference getStatement_Block_Block();

	/**
	 * Returns the meta object for class '{@link activitydiagram.Statement_While <em>Statement While</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement While</em>'.
	 * @see activitydiagram.Statement_While
	 * @generated
	 */
	EClass getStatement_While();

	/**
	 * Returns the meta object for the containment reference '{@link activitydiagram.Statement_While#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see activitydiagram.Statement_While#getExpression()
	 * @see #getStatement_While()
	 * @generated
	 */
	EReference getStatement_While_Expression();

	/**
	 * Returns the meta object for the containment reference '{@link activitydiagram.Statement_While#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Block</em>'.
	 * @see activitydiagram.Statement_While#getBlock()
	 * @see #getStatement_While()
	 * @generated
	 */
	EReference getStatement_While_Block();

	/**
	 * Returns the meta object for class '{@link activitydiagram.Statement_Repeat <em>Statement Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement Repeat</em>'.
	 * @see activitydiagram.Statement_Repeat
	 * @generated
	 */
	EClass getStatement_Repeat();

	/**
	 * Returns the meta object for the containment reference '{@link activitydiagram.Statement_Repeat#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Block</em>'.
	 * @see activitydiagram.Statement_Repeat#getBlock()
	 * @see #getStatement_Repeat()
	 * @generated
	 */
	EReference getStatement_Repeat_Block();

	/**
	 * Returns the meta object for the containment reference '{@link activitydiagram.Statement_Repeat#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see activitydiagram.Statement_Repeat#getExpression()
	 * @see #getStatement_Repeat()
	 * @generated
	 */
	EReference getStatement_Repeat_Expression();

	/**
	 * Returns the meta object for class '{@link activitydiagram.Statement_If_Then_Else <em>Statement If Then Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement If Then Else</em>'.
	 * @see activitydiagram.Statement_If_Then_Else
	 * @generated
	 */
	EClass getStatement_If_Then_Else();

	/**
	 * Returns the meta object for the containment reference '{@link activitydiagram.Statement_If_Then_Else#getIfExpression <em>If Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If Expression</em>'.
	 * @see activitydiagram.Statement_If_Then_Else#getIfExpression()
	 * @see #getStatement_If_Then_Else()
	 * @generated
	 */
	EReference getStatement_If_Then_Else_IfExpression();

	/**
	 * Returns the meta object for the containment reference '{@link activitydiagram.Statement_If_Then_Else#getIfBlock <em>If Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If Block</em>'.
	 * @see activitydiagram.Statement_If_Then_Else#getIfBlock()
	 * @see #getStatement_If_Then_Else()
	 * @generated
	 */
	EReference getStatement_If_Then_Else_IfBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagram.Statement_If_Then_Else#getElseIf <em>Else If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Else If</em>'.
	 * @see activitydiagram.Statement_If_Then_Else#getElseIf()
	 * @see #getStatement_If_Then_Else()
	 * @generated
	 */
	EReference getStatement_If_Then_Else_ElseIf();

	/**
	 * Returns the meta object for the containment reference '{@link activitydiagram.Statement_If_Then_Else#getElseBlock <em>Else Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else Block</em>'.
	 * @see activitydiagram.Statement_If_Then_Else#getElseBlock()
	 * @see #getStatement_If_Then_Else()
	 * @generated
	 */
	EReference getStatement_If_Then_Else_ElseBlock();

	/**
	 * Returns the meta object for class '{@link activitydiagram.Statement_If_Then_Else_ElseIfPart <em>Statement If Then Else Else If Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement If Then Else Else If Part</em>'.
	 * @see activitydiagram.Statement_If_Then_Else_ElseIfPart
	 * @generated
	 */
	EClass getStatement_If_Then_Else_ElseIfPart();

	/**
	 * Returns the meta object for the containment reference '{@link activitydiagram.Statement_If_Then_Else_ElseIfPart#getElseifExpression <em>Elseif Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Elseif Expression</em>'.
	 * @see activitydiagram.Statement_If_Then_Else_ElseIfPart#getElseifExpression()
	 * @see #getStatement_If_Then_Else_ElseIfPart()
	 * @generated
	 */
	EReference getStatement_If_Then_Else_ElseIfPart_ElseifExpression();

	/**
	 * Returns the meta object for the containment reference '{@link activitydiagram.Statement_If_Then_Else_ElseIfPart#getElseifBlock <em>Elseif Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Elseif Block</em>'.
	 * @see activitydiagram.Statement_If_Then_Else_ElseIfPart#getElseifBlock()
	 * @see #getStatement_If_Then_Else_ElseIfPart()
	 * @generated
	 */
	EReference getStatement_If_Then_Else_ElseIfPart_ElseifBlock();

	/**
	 * Returns the meta object for class '{@link activitydiagram.Statement_For_Numeric <em>Statement For Numeric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement For Numeric</em>'.
	 * @see activitydiagram.Statement_For_Numeric
	 * @generated
	 */
	EClass getStatement_For_Numeric();

	/**
	 * Returns the meta object for the attribute '{@link activitydiagram.Statement_For_Numeric#getIteratorName <em>Iterator Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iterator Name</em>'.
	 * @see activitydiagram.Statement_For_Numeric#getIteratorName()
	 * @see #getStatement_For_Numeric()
	 * @generated
	 */
	EAttribute getStatement_For_Numeric_IteratorName();

	/**
	 * Returns the meta object for the containment reference '{@link activitydiagram.Statement_For_Numeric#getStartExpr <em>Start Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start Expr</em>'.
	 * @see activitydiagram.Statement_For_Numeric#getStartExpr()
	 * @see #getStatement_For_Numeric()
	 * @generated
	 */
	EReference getStatement_For_Numeric_StartExpr();

	/**
	 * Returns the meta object for the containment reference '{@link activitydiagram.Statement_For_Numeric#getUntilExpr <em>Until Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Until Expr</em>'.
	 * @see activitydiagram.Statement_For_Numeric#getUntilExpr()
	 * @see #getStatement_For_Numeric()
	 * @generated
	 */
	EReference getStatement_For_Numeric_UntilExpr();

	/**
	 * Returns the meta object for the containment reference '{@link activitydiagram.Statement_For_Numeric#getStepExpr <em>Step Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Step Expr</em>'.
	 * @see activitydiagram.Statement_For_Numeric#getStepExpr()
	 * @see #getStatement_For_Numeric()
	 * @generated
	 */
	EReference getStatement_For_Numeric_StepExpr();

	/**
	 * Returns the meta object for the containment reference '{@link activitydiagram.Statement_For_Numeric#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Block</em>'.
	 * @see activitydiagram.Statement_For_Numeric#getBlock()
	 * @see #getStatement_For_Numeric()
	 * @generated
	 */
	EReference getStatement_For_Numeric_Block();

	/**
	 * Returns the meta object for class '{@link activitydiagram.Statement_For_Generic <em>Statement For Generic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement For Generic</em>'.
	 * @see activitydiagram.Statement_For_Generic
	 * @generated
	 */
	EClass getStatement_For_Generic();

	/**
	 * Returns the meta object for the attribute list '{@link activitydiagram.Statement_For_Generic#getNames <em>Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Names</em>'.
	 * @see activitydiagram.Statement_For_Generic#getNames()
	 * @see #getStatement_For_Generic()
	 * @generated
	 */
	EAttribute getStatement_For_Generic_Names();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagram.Statement_For_Generic#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see activitydiagram.Statement_For_Generic#getExpressions()
	 * @see #getStatement_For_Generic()
	 * @generated
	 */
	EReference getStatement_For_Generic_Expressions();

	/**
	 * Returns the meta object for the containment reference '{@link activitydiagram.Statement_For_Generic#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Block</em>'.
	 * @see activitydiagram.Statement_For_Generic#getBlock()
	 * @see #getStatement_For_Generic()
	 * @generated
	 */
	EReference getStatement_For_Generic_Block();

	/**
	 * Returns the meta object for class '{@link activitydiagram.Statement_GlobalFunction_Declaration <em>Statement Global Function Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement Global Function Declaration</em>'.
	 * @see activitydiagram.Statement_GlobalFunction_Declaration
	 * @generated
	 */
	EClass getStatement_GlobalFunction_Declaration();

	/**
	 * Returns the meta object for the attribute list '{@link activitydiagram.Statement_GlobalFunction_Declaration#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Prefix</em>'.
	 * @see activitydiagram.Statement_GlobalFunction_Declaration#getPrefix()
	 * @see #getStatement_GlobalFunction_Declaration()
	 * @generated
	 */
	EAttribute getStatement_GlobalFunction_Declaration_Prefix();

	/**
	 * Returns the meta object for the attribute '{@link activitydiagram.Statement_GlobalFunction_Declaration#getFunctionName <em>Function Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function Name</em>'.
	 * @see activitydiagram.Statement_GlobalFunction_Declaration#getFunctionName()
	 * @see #getStatement_GlobalFunction_Declaration()
	 * @generated
	 */
	EAttribute getStatement_GlobalFunction_Declaration_FunctionName();

	/**
	 * Returns the meta object for the containment reference '{@link activitydiagram.Statement_GlobalFunction_Declaration#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Function</em>'.
	 * @see activitydiagram.Statement_GlobalFunction_Declaration#getFunction()
	 * @see #getStatement_GlobalFunction_Declaration()
	 * @generated
	 */
	EReference getStatement_GlobalFunction_Declaration_Function();

	/**
	 * Returns the meta object for class '{@link activitydiagram.Statement_LocalFunction_Declaration <em>Statement Local Function Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement Local Function Declaration</em>'.
	 * @see activitydiagram.Statement_LocalFunction_Declaration
	 * @generated
	 */
	EClass getStatement_LocalFunction_Declaration();

	/**
	 * Returns the meta object for the attribute '{@link activitydiagram.Statement_LocalFunction_Declaration#getFunctionName <em>Function Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function Name</em>'.
	 * @see activitydiagram.Statement_LocalFunction_Declaration#getFunctionName()
	 * @see #getStatement_LocalFunction_Declaration()
	 * @generated
	 */
	EAttribute getStatement_LocalFunction_Declaration_FunctionName();

	/**
	 * Returns the meta object for the containment reference '{@link activitydiagram.Statement_LocalFunction_Declaration#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Function</em>'.
	 * @see activitydiagram.Statement_LocalFunction_Declaration#getFunction()
	 * @see #getStatement_LocalFunction_Declaration()
	 * @generated
	 */
	EReference getStatement_LocalFunction_Declaration_Function();

	/**
	 * Returns the meta object for class '{@link activitydiagram.Statement_Local_Variable_Declaration <em>Statement Local Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement Local Variable Declaration</em>'.
	 * @see activitydiagram.Statement_Local_Variable_Declaration
	 * @generated
	 */
	EClass getStatement_Local_Variable_Declaration();

	/**
	 * Returns the meta object for the attribute list '{@link activitydiagram.Statement_Local_Variable_Declaration#getVariableNames <em>Variable Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Variable Names</em>'.
	 * @see activitydiagram.Statement_Local_Variable_Declaration#getVariableNames()
	 * @see #getStatement_Local_Variable_Declaration()
	 * @generated
	 */
	EAttribute getStatement_Local_Variable_Declaration_VariableNames();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagram.Statement_Local_Variable_Declaration#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Initial Value</em>'.
	 * @see activitydiagram.Statement_Local_Variable_Declaration#getInitialValue()
	 * @see #getStatement_Local_Variable_Declaration()
	 * @generated
	 */
	EReference getStatement_Local_Variable_Declaration_InitialValue();

	/**
	 * Returns the meta object for class '{@link activitydiagram.Statement_FunctioncallOrAssignment <em>Statement Functioncall Or Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement Functioncall Or Assignment</em>'.
	 * @see activitydiagram.Statement_FunctioncallOrAssignment
	 * @generated
	 */
	EClass getStatement_FunctioncallOrAssignment();

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
	 * Returns the meta object for the reference '{@link activitydiagram.Expression#getLua <em>Lua</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lua</em>'.
	 * @see activitydiagram.Expression#getLua()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_Lua();

	/**
	 * Returns the meta object for class '{@link activitydiagram.Expression_Nil <em>Expression Nil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Nil</em>'.
	 * @see activitydiagram.Expression_Nil
	 * @generated
	 */
	EClass getExpression_Nil();

	/**
	 * Returns the meta object for class '{@link activitydiagram.Expression_True <em>Expression True</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression True</em>'.
	 * @see activitydiagram.Expression_True
	 * @generated
	 */
	EClass getExpression_True();

	/**
	 * Returns the meta object for class '{@link activitydiagram.Expression_False <em>Expression False</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression False</em>'.
	 * @see activitydiagram.Expression_False
	 * @generated
	 */
	EClass getExpression_False();

	/**
	 * Returns the meta object for class '{@link activitydiagram.Expression_Number <em>Expression Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Number</em>'.
	 * @see activitydiagram.Expression_Number
	 * @generated
	 */
	EClass getExpression_Number();

	/**
	 * Returns the meta object for the attribute '{@link activitydiagram.Expression_Number#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see activitydiagram.Expression_Number#getValue()
	 * @see #getExpression_Number()
	 * @generated
	 */
	EAttribute getExpression_Number_Value();

	/**
	 * Returns the meta object for class '{@link activitydiagram.Expression_VarArgs <em>Expression Var Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Var Args</em>'.
	 * @see activitydiagram.Expression_VarArgs
	 * @generated
	 */
	EClass getExpression_VarArgs();

	/**
	 * Returns the meta object for class '{@link activitydiagram.Expression_String <em>Expression String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression String</em>'.
	 * @see activitydiagram.Expression_String
	 * @generated
	 */
	EClass getExpression_String();

	/**
	 * Returns the meta object for the attribute '{@link activitydiagram.Expression_String#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see activitydiagram.Expression_String#getValue()
	 * @see #getExpression_String()
	 * @generated
	 */
	EAttribute getExpression_String_Value();

	/**
	 * Returns the meta object for class '{@link activitydiagram.Expression_Function <em>Expression Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Function</em>'.
	 * @see activitydiagram.Expression_Function
	 * @generated
	 */
	EClass getExpression_Function();

	/**
	 * Returns the meta object for the containment reference '{@link activitydiagram.Expression_Function#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Function</em>'.
	 * @see activitydiagram.Expression_Function#getFunction()
	 * @see #getExpression_Function()
	 * @generated
	 */
	EReference getExpression_Function_Function();

	/**
	 * Returns the meta object for class '{@link activitydiagram.Expression_TableConstructor <em>Expression Table Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Table Constructor</em>'.
	 * @see activitydiagram.Expression_TableConstructor
	 * @generated
	 */
	EClass getExpression_TableConstructor();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagram.Expression_TableConstructor#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see activitydiagram.Expression_TableConstructor#getFields()
	 * @see #getExpression_TableConstructor()
	 * @generated
	 */
	EReference getExpression_TableConstructor_Fields();

	/**
	 * Returns the meta object for class '{@link activitydiagram.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see activitydiagram.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the attribute list '{@link activitydiagram.Function#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Parameters</em>'.
	 * @see activitydiagram.Function#getParameters()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link activitydiagram.Function#isVarArgs <em>Var Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Args</em>'.
	 * @see activitydiagram.Function#isVarArgs()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_VarArgs();

	/**
	 * Returns the meta object for the containment reference '{@link activitydiagram.Function#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see activitydiagram.Function#getBody()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Body();

	/**
	 * Returns the meta object for class '{@link activitydiagram.Functioncall_Arguments <em>Functioncall Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functioncall Arguments</em>'.
	 * @see activitydiagram.Functioncall_Arguments
	 * @generated
	 */
	EClass getFunctioncall_Arguments();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagram.Functioncall_Arguments#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see activitydiagram.Functioncall_Arguments#getArguments()
	 * @see #getFunctioncall_Arguments()
	 * @generated
	 */
	EReference getFunctioncall_Arguments_Arguments();

	/**
	 * Returns the meta object for class '{@link activitydiagram.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see activitydiagram.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the containment reference '{@link activitydiagram.Field#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see activitydiagram.Field#getValue()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_Value();

	/**
	 * Returns the meta object for class '{@link activitydiagram.Field_AddEntryToTable_Brackets <em>Field Add Entry To Table Brackets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Add Entry To Table Brackets</em>'.
	 * @see activitydiagram.Field_AddEntryToTable_Brackets
	 * @generated
	 */
	EClass getField_AddEntryToTable_Brackets();

	/**
	 * Returns the meta object for the containment reference '{@link activitydiagram.Field_AddEntryToTable_Brackets#getIndexExpression <em>Index Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Index Expression</em>'.
	 * @see activitydiagram.Field_AddEntryToTable_Brackets#getIndexExpression()
	 * @see #getField_AddEntryToTable_Brackets()
	 * @generated
	 */
	EReference getField_AddEntryToTable_Brackets_IndexExpression();

	/**
	 * Returns the meta object for class '{@link activitydiagram.Field_AddEntryToTable <em>Field Add Entry To Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Add Entry To Table</em>'.
	 * @see activitydiagram.Field_AddEntryToTable
	 * @generated
	 */
	EClass getField_AddEntryToTable();

	/**
	 * Returns the meta object for the attribute '{@link activitydiagram.Field_AddEntryToTable#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see activitydiagram.Field_AddEntryToTable#getKey()
	 * @see #getField_AddEntryToTable()
	 * @generated
	 */
	EAttribute getField_AddEntryToTable_Key();

	/**
	 * Returns the meta object for class '{@link activitydiagram.Field_AppendEntryToTable <em>Field Append Entry To Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Append Entry To Table</em>'.
	 * @see activitydiagram.Field_AppendEntryToTable
	 * @generated
	 */
	EClass getField_AppendEntryToTable();

	/**
	 * Returns the meta object for class '{@link activitydiagram.LastStatement_ReturnWithValue <em>Last Statement Return With Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Last Statement Return With Value</em>'.
	 * @see activitydiagram.LastStatement_ReturnWithValue
	 * @generated
	 */
	EClass getLastStatement_ReturnWithValue();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagram.LastStatement_ReturnWithValue#getReturnValues <em>Return Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Return Values</em>'.
	 * @see activitydiagram.LastStatement_ReturnWithValue#getReturnValues()
	 * @see #getLastStatement_ReturnWithValue()
	 * @generated
	 */
	EReference getLastStatement_ReturnWithValue_ReturnValues();

	/**
	 * Returns the meta object for class '{@link activitydiagram.Statement_Assignment <em>Statement Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement Assignment</em>'.
	 * @see activitydiagram.Statement_Assignment
	 * @generated
	 */
	EClass getStatement_Assignment();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagram.Statement_Assignment#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable</em>'.
	 * @see activitydiagram.Statement_Assignment#getVariable()
	 * @see #getStatement_Assignment()
	 * @generated
	 */
	EReference getStatement_Assignment_Variable();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagram.Statement_Assignment#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see activitydiagram.Statement_Assignment#getValues()
	 * @see #getStatement_Assignment()
	 * @generated
	 */
	EReference getStatement_Assignment_Values();

	/**
	 * Returns the meta object for class '{@link activitydiagram.Statement_CallMemberFunction <em>Statement Call Member Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement Call Member Function</em>'.
	 * @see activitydiagram.Statement_CallMemberFunction
	 * @generated
	 */
	EClass getStatement_CallMemberFunction();

	/**
	 * Returns the meta object for the containment reference '{@link activitydiagram.Statement_CallMemberFunction#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object</em>'.
	 * @see activitydiagram.Statement_CallMemberFunction#getObject()
	 * @see #getStatement_CallMemberFunction()
	 * @generated
	 */
	EReference getStatement_CallMemberFunction_Object();

	/**
	 * Returns the meta object for the attribute '{@link activitydiagram.Statement_CallMemberFunction#getMemberFunctionName <em>Member Function Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Member Function Name</em>'.
	 * @see activitydiagram.Statement_CallMemberFunction#getMemberFunctionName()
	 * @see #getStatement_CallMemberFunction()
	 * @generated
	 */
	EAttribute getStatement_CallMemberFunction_MemberFunctionName();

	/**
	 * Returns the meta object for the containment reference '{@link activitydiagram.Statement_CallMemberFunction#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arguments</em>'.
	 * @see activitydiagram.Statement_CallMemberFunction#getArguments()
	 * @see #getStatement_CallMemberFunction()
	 * @generated
	 */
	EReference getStatement_CallMemberFunction_Arguments();

	/**
	 * Returns the meta object for class '{@link activitydiagram.Statement_CallFunction <em>Statement Call Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement Call Function</em>'.
	 * @see activitydiagram.Statement_CallFunction
	 * @generated
	 */
	EClass getStatement_CallFunction();

	/**
	 * Returns the meta object for the containment reference '{@link activitydiagram.Statement_CallFunction#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object</em>'.
	 * @see activitydiagram.Statement_CallFunction#getObject()
	 * @see #getStatement_CallFunction()
	 * @generated
	 */
	EReference getStatement_CallFunction_Object();

	/**
	 * Returns the meta object for the containment reference '{@link activitydiagram.Statement_CallFunction#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arguments</em>'.
	 * @see activitydiagram.Statement_CallFunction#getArguments()
	 * @see #getStatement_CallFunction()
	 * @generated
	 */
	EReference getStatement_CallFunction_Arguments();

	/**
	 * Returns the meta object for class '{@link activitydiagram.Expression_Or <em>Expression Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Or</em>'.
	 * @see activitydiagram.Expression_Or
	 * @generated
	 */
	EClass getExpression_Or();

	/**
	 * Returns the meta object for the containment reference '{@link activitydiagram.Expression_Or#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see activitydiagram.Expression_Or#getLeft()
	 * @see #getExpression_Or()
	 * @generated
	 */
	EReference getExpression_Or_Left();

	/**
	 * Returns the meta object for the containment reference '{@link activitydiagram.Expression_Or#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see activitydiagram.Expression_Or#getRight()
	 * @see #getExpression_Or()
	 * @generated
	 */
	EReference getExpression_Or_Right();

	/**
	 * Returns the meta object for class '{@link activitydiagram.Expression_And <em>Expression And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression And</em>'.
	 * @see activitydiagram.Expression_And
	 * @generated
	 */
	EClass getExpression_And();

	/**
	 * Returns the meta object for the containment reference '{@link activitydiagram.Expression_And#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see activitydiagram.Expression_And#getLeft()
	 * @see #getExpression_And()
	 * @generated
	 */
	EReference getExpression_And_Left();

	/**
	 * Returns the meta object for the containment reference '{@link activitydiagram.Expression_And#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see activitydiagram.Expression_And#getRight()
	 * @see #getExpression_And()
	 * @generated
	 */
	EReference getExpression_And_Right();

	/**
	 * Returns the meta object for class '{@link activitydiagram.Expression_Larger <em>Expression Larger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Larger</em>'.
	 * @see activitydiagram.Expression_Larger
	 * @generated
	 */
	EClass getExpression_Larger();

	/**
	 * Returns the meta object for the containment reference '{@link activitydiagram.Expression_Larger#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see activitydiagram.Expression_Larger#getLeft()
	 * @see #getExpression_Larger()
	 * @generated
	 */
	EReference getExpression_Larger_Left();

	/**
	 * Returns the meta object for the containment reference '{@link activitydiagram.Expression_Larger#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see activitydiagram.Expression_Larger#getRight()
	 * @see #getExpression_Larger()
	 * @generated
	 */
	EReference getExpression_Larger_Right();

	/**
	 * Returns the meta object for class '{@link activitydiagram.Expression_Larger_Equal <em>Expression Larger Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Larger Equal</em>'.
	 * @see activitydiagram.Expression_Larger_Equal
	 * @generated
	 */
	EClass getExpression_Larger_Equal();

	/**
	 * Returns the meta object for the containment reference '{@link activitydiagram.Expression_Larger_Equal#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see activitydiagram.Expression_Larger_Equal#getLeft()
	 * @see #getExpression_Larger_Equal()
	 * @generated
	 */
	EReference getExpression_Larger_Equal_Left();

	/**
	 * Returns the meta object for the containment reference '{@link activitydiagram.Expression_Larger_Equal#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see activitydiagram.Expression_Larger_Equal#getRight()
	 * @see #getExpression_Larger_Equal()
	 * @generated
	 */
	EReference getExpression_Larger_Equal_Right();

	/**
	 * Returns the meta object for class '{@link activitydiagram.Expression_Smaller <em>Expression Smaller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Smaller</em>'.
	 * @see activitydiagram.Expression_Smaller
	 * @generated
	 */
	EClass getExpression_Smaller();

	/**
	 * Returns the meta object for the containment reference '{@link activitydiagram.Expression_Smaller#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see activitydiagram.Expression_Smaller#getLeft()
	 * @see #getExpression_Smaller()
	 * @generated
	 */
	EReference getExpression_Smaller_Left();

	/**
	 * Returns the meta object for the containment reference '{@link activitydiagram.Expression_Smaller#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see activitydiagram.Expression_Smaller#getRight()
	 * @see #getExpression_Smaller()
	 * @generated
	 */
	EReference getExpression_Smaller_Right();

	/**
	 * Returns the meta object for class '{@link activitydiagram.Expression_Smaller_Equal <em>Expression Smaller Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Smaller Equal</em>'.
	 * @see activitydiagram.Expression_Smaller_Equal
	 * @generated
	 */
	EClass getExpression_Smaller_Equal();

	/**
	 * Returns the meta object for the containment reference '{@link activitydiagram.Expression_Smaller_Equal#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see activitydiagram.Expression_Smaller_Equal#getLeft()
	 * @see #getExpression_Smaller_Equal()
	 * @generated
	 */
	EReference getExpression_Smaller_Equal_Left();

	/**
	 * Returns the meta object for the containment reference '{@link activitydiagram.Expression_Smaller_Equal#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see activitydiagram.Expression_Smaller_Equal#getRight()
	 * @see #getExpression_Smaller_Equal()
	 * @generated
	 */
	EReference getExpression_Smaller_Equal_Right();

	/**
	 * Returns the meta object for class '{@link activitydiagram.Expression_Equal <em>Expression Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Equal</em>'.
	 * @see activitydiagram.Expression_Equal
	 * @generated
	 */
	EClass getExpression_Equal();

	/**
	 * Returns the meta object for the containment reference '{@link activitydiagram.Expression_Equal#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see activitydiagram.Expression_Equal#getLeft()
	 * @see #getExpression_Equal()
	 * @generated
	 */
	EReference getExpression_Equal_Left();

	/**
	 * Returns the meta object for the containment reference '{@link activitydiagram.Expression_Equal#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see activitydiagram.Expression_Equal#getRight()
	 * @see #getExpression_Equal()
	 * @generated
	 */
	EReference getExpression_Equal_Right();

	/**
	 * Returns the meta object for class '{@link activitydiagram.Expression_Not_Equal <em>Expression Not Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Not Equal</em>'.
	 * @see activitydiagram.Expression_Not_Equal
	 * @generated
	 */
	EClass getExpression_Not_Equal();

	/**
	 * Returns the meta object for the containment reference '{@link activitydiagram.Expression_Not_Equal#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see activitydiagram.Expression_Not_Equal#getLeft()
	 * @see #getExpression_Not_Equal()
	 * @generated
	 */
	EReference getExpression_Not_Equal_Left();

	/**
	 * Returns the meta object for the containment reference '{@link activitydiagram.Expression_Not_Equal#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see activitydiagram.Expression_Not_Equal#getRight()
	 * @see #getExpression_Not_Equal()
	 * @generated
	 */
	EReference getExpression_Not_Equal_Right();

	/**
	 * Returns the meta object for class '{@link activitydiagram.Expression_Concatenation <em>Expression Concatenation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Concatenation</em>'.
	 * @see activitydiagram.Expression_Concatenation
	 * @generated
	 */
	EClass getExpression_Concatenation();

	/**
	 * Returns the meta object for the containment reference '{@link activitydiagram.Expression_Concatenation#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see activitydiagram.Expression_Concatenation#getLeft()
	 * @see #getExpression_Concatenation()
	 * @generated
	 */
	EReference getExpression_Concatenation_Left();

	/**
	 * Returns the meta object for the containment reference '{@link activitydiagram.Expression_Concatenation#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see activitydiagram.Expression_Concatenation#getRight()
	 * @see #getExpression_Concatenation()
	 * @generated
	 */
	EReference getExpression_Concatenation_Right();

	/**
	 * Returns the meta object for class '{@link activitydiagram.Expression_Plus <em>Expression Plus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Plus</em>'.
	 * @see activitydiagram.Expression_Plus
	 * @generated
	 */
	EClass getExpression_Plus();

	/**
	 * Returns the meta object for the containment reference '{@link activitydiagram.Expression_Plus#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see activitydiagram.Expression_Plus#getLeft()
	 * @see #getExpression_Plus()
	 * @generated
	 */
	EReference getExpression_Plus_Left();

	/**
	 * Returns the meta object for the containment reference '{@link activitydiagram.Expression_Plus#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see activitydiagram.Expression_Plus#getRight()
	 * @see #getExpression_Plus()
	 * @generated
	 */
	EReference getExpression_Plus_Right();

	/**
	 * Returns the meta object for class '{@link activitydiagram.Expression_Minus <em>Expression Minus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Minus</em>'.
	 * @see activitydiagram.Expression_Minus
	 * @generated
	 */
	EClass getExpression_Minus();

	/**
	 * Returns the meta object for the containment reference '{@link activitydiagram.Expression_Minus#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see activitydiagram.Expression_Minus#getLeft()
	 * @see #getExpression_Minus()
	 * @generated
	 */
	EReference getExpression_Minus_Left();

	/**
	 * Returns the meta object for the containment reference '{@link activitydiagram.Expression_Minus#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see activitydiagram.Expression_Minus#getRight()
	 * @see #getExpression_Minus()
	 * @generated
	 */
	EReference getExpression_Minus_Right();

	/**
	 * Returns the meta object for class '{@link activitydiagram.Expression_Multiplication <em>Expression Multiplication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Multiplication</em>'.
	 * @see activitydiagram.Expression_Multiplication
	 * @generated
	 */
	EClass getExpression_Multiplication();

	/**
	 * Returns the meta object for the containment reference '{@link activitydiagram.Expression_Multiplication#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see activitydiagram.Expression_Multiplication#getLeft()
	 * @see #getExpression_Multiplication()
	 * @generated
	 */
	EReference getExpression_Multiplication_Left();

	/**
	 * Returns the meta object for the containment reference '{@link activitydiagram.Expression_Multiplication#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see activitydiagram.Expression_Multiplication#getRight()
	 * @see #getExpression_Multiplication()
	 * @generated
	 */
	EReference getExpression_Multiplication_Right();

	/**
	 * Returns the meta object for class '{@link activitydiagram.Expression_Division <em>Expression Division</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Division</em>'.
	 * @see activitydiagram.Expression_Division
	 * @generated
	 */
	EClass getExpression_Division();

	/**
	 * Returns the meta object for the containment reference '{@link activitydiagram.Expression_Division#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see activitydiagram.Expression_Division#getLeft()
	 * @see #getExpression_Division()
	 * @generated
	 */
	EReference getExpression_Division_Left();

	/**
	 * Returns the meta object for the containment reference '{@link activitydiagram.Expression_Division#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see activitydiagram.Expression_Division#getRight()
	 * @see #getExpression_Division()
	 * @generated
	 */
	EReference getExpression_Division_Right();

	/**
	 * Returns the meta object for class '{@link activitydiagram.Expression_Modulo <em>Expression Modulo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Modulo</em>'.
	 * @see activitydiagram.Expression_Modulo
	 * @generated
	 */
	EClass getExpression_Modulo();

	/**
	 * Returns the meta object for the containment reference '{@link activitydiagram.Expression_Modulo#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see activitydiagram.Expression_Modulo#getLeft()
	 * @see #getExpression_Modulo()
	 * @generated
	 */
	EReference getExpression_Modulo_Left();

	/**
	 * Returns the meta object for the containment reference '{@link activitydiagram.Expression_Modulo#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see activitydiagram.Expression_Modulo#getRight()
	 * @see #getExpression_Modulo()
	 * @generated
	 */
	EReference getExpression_Modulo_Right();

	/**
	 * Returns the meta object for class '{@link activitydiagram.Expression_Negate <em>Expression Negate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Negate</em>'.
	 * @see activitydiagram.Expression_Negate
	 * @generated
	 */
	EClass getExpression_Negate();

	/**
	 * Returns the meta object for the containment reference '{@link activitydiagram.Expression_Negate#getExp <em>Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exp</em>'.
	 * @see activitydiagram.Expression_Negate#getExp()
	 * @see #getExpression_Negate()
	 * @generated
	 */
	EReference getExpression_Negate_Exp();

	/**
	 * Returns the meta object for class '{@link activitydiagram.Expression_Length <em>Expression Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Length</em>'.
	 * @see activitydiagram.Expression_Length
	 * @generated
	 */
	EClass getExpression_Length();

	/**
	 * Returns the meta object for the containment reference '{@link activitydiagram.Expression_Length#getExp <em>Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exp</em>'.
	 * @see activitydiagram.Expression_Length#getExp()
	 * @see #getExpression_Length()
	 * @generated
	 */
	EReference getExpression_Length_Exp();

	/**
	 * Returns the meta object for class '{@link activitydiagram.Expression_Invert <em>Expression Invert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Invert</em>'.
	 * @see activitydiagram.Expression_Invert
	 * @generated
	 */
	EClass getExpression_Invert();

	/**
	 * Returns the meta object for the containment reference '{@link activitydiagram.Expression_Invert#getExp <em>Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exp</em>'.
	 * @see activitydiagram.Expression_Invert#getExp()
	 * @see #getExpression_Invert()
	 * @generated
	 */
	EReference getExpression_Invert_Exp();

	/**
	 * Returns the meta object for class '{@link activitydiagram.Expression_Exponentiation <em>Expression Exponentiation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Exponentiation</em>'.
	 * @see activitydiagram.Expression_Exponentiation
	 * @generated
	 */
	EClass getExpression_Exponentiation();

	/**
	 * Returns the meta object for the containment reference '{@link activitydiagram.Expression_Exponentiation#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see activitydiagram.Expression_Exponentiation#getLeft()
	 * @see #getExpression_Exponentiation()
	 * @generated
	 */
	EReference getExpression_Exponentiation_Left();

	/**
	 * Returns the meta object for the containment reference '{@link activitydiagram.Expression_Exponentiation#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see activitydiagram.Expression_Exponentiation#getRight()
	 * @see #getExpression_Exponentiation()
	 * @generated
	 */
	EReference getExpression_Exponentiation_Right();

	/**
	 * Returns the meta object for class '{@link activitydiagram.Expression_CallMemberFunction <em>Expression Call Member Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Call Member Function</em>'.
	 * @see activitydiagram.Expression_CallMemberFunction
	 * @generated
	 */
	EClass getExpression_CallMemberFunction();

	/**
	 * Returns the meta object for the containment reference '{@link activitydiagram.Expression_CallMemberFunction#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object</em>'.
	 * @see activitydiagram.Expression_CallMemberFunction#getObject()
	 * @see #getExpression_CallMemberFunction()
	 * @generated
	 */
	EReference getExpression_CallMemberFunction_Object();

	/**
	 * Returns the meta object for the attribute '{@link activitydiagram.Expression_CallMemberFunction#getMemberFunctionName <em>Member Function Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Member Function Name</em>'.
	 * @see activitydiagram.Expression_CallMemberFunction#getMemberFunctionName()
	 * @see #getExpression_CallMemberFunction()
	 * @generated
	 */
	EAttribute getExpression_CallMemberFunction_MemberFunctionName();

	/**
	 * Returns the meta object for the containment reference '{@link activitydiagram.Expression_CallMemberFunction#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arguments</em>'.
	 * @see activitydiagram.Expression_CallMemberFunction#getArguments()
	 * @see #getExpression_CallMemberFunction()
	 * @generated
	 */
	EReference getExpression_CallMemberFunction_Arguments();

	/**
	 * Returns the meta object for class '{@link activitydiagram.Expression_CallFunction <em>Expression Call Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Call Function</em>'.
	 * @see activitydiagram.Expression_CallFunction
	 * @generated
	 */
	EClass getExpression_CallFunction();

	/**
	 * Returns the meta object for the containment reference '{@link activitydiagram.Expression_CallFunction#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object</em>'.
	 * @see activitydiagram.Expression_CallFunction#getObject()
	 * @see #getExpression_CallFunction()
	 * @generated
	 */
	EReference getExpression_CallFunction_Object();

	/**
	 * Returns the meta object for the containment reference '{@link activitydiagram.Expression_CallFunction#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arguments</em>'.
	 * @see activitydiagram.Expression_CallFunction#getArguments()
	 * @see #getExpression_CallFunction()
	 * @generated
	 */
	EReference getExpression_CallFunction_Arguments();

	/**
	 * Returns the meta object for class '{@link activitydiagram.Expression_AccessArray <em>Expression Access Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Access Array</em>'.
	 * @see activitydiagram.Expression_AccessArray
	 * @generated
	 */
	EClass getExpression_AccessArray();

	/**
	 * Returns the meta object for the containment reference '{@link activitydiagram.Expression_AccessArray#getArray <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Array</em>'.
	 * @see activitydiagram.Expression_AccessArray#getArray()
	 * @see #getExpression_AccessArray()
	 * @generated
	 */
	EReference getExpression_AccessArray_Array();

	/**
	 * Returns the meta object for the containment reference '{@link activitydiagram.Expression_AccessArray#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Index</em>'.
	 * @see activitydiagram.Expression_AccessArray#getIndex()
	 * @see #getExpression_AccessArray()
	 * @generated
	 */
	EReference getExpression_AccessArray_Index();

	/**
	 * Returns the meta object for class '{@link activitydiagram.Expression_AccessMember <em>Expression Access Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Access Member</em>'.
	 * @see activitydiagram.Expression_AccessMember
	 * @generated
	 */
	EClass getExpression_AccessMember();

	/**
	 * Returns the meta object for the containment reference '{@link activitydiagram.Expression_AccessMember#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object</em>'.
	 * @see activitydiagram.Expression_AccessMember#getObject()
	 * @see #getExpression_AccessMember()
	 * @generated
	 */
	EReference getExpression_AccessMember_Object();

	/**
	 * Returns the meta object for the attribute '{@link activitydiagram.Expression_AccessMember#getMemberName <em>Member Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Member Name</em>'.
	 * @see activitydiagram.Expression_AccessMember#getMemberName()
	 * @see #getExpression_AccessMember()
	 * @generated
	 */
	EAttribute getExpression_AccessMember_MemberName();

	/**
	 * Returns the meta object for class '{@link activitydiagram.Expression_VariableName <em>Expression Variable Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Variable Name</em>'.
	 * @see activitydiagram.Expression_VariableName
	 * @generated
	 */
	EClass getExpression_VariableName();

	/**
	 * Returns the meta object for the attribute '{@link activitydiagram.Expression_VariableName#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable</em>'.
	 * @see activitydiagram.Expression_VariableName#getVariable()
	 * @see #getExpression_VariableName()
	 * @generated
	 */
	EAttribute getExpression_VariableName_Variable();

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
	 * Returns the meta object for data type '{@link org.k3.lua.dynamic.environment <em>environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>environment</em>'.
	 * @see org.k3.lua.dynamic.environment
	 * @model instanceClass="org.k3.lua.dynamic.environment"
	 * @generated
	 */
	EDataType getenvironment();

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

} //ActivitydiagramPackage
