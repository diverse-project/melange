/**
 */
package fr.inria.diverse.melanger.melangedlangmt.minifsm;

import org.eclipse.emf.ecore.EAttribute;
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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmFactory
 * @model kind="package"
 * @generated
 */
public interface MinifsmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "minifsm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://melangedlangmt/minifsm/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "minifsm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MinifsmPackage eINSTANCE = fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.FSMImpl <em>FSM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.FSMImpl
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getFSM()
	 * @generated
	 */
	int FSM = 0;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM__STATES = 0;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM__TRANSITIONS = 1;

	/**
	 * The feature id for the '<em><b>Initial State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM__INITIAL_STATE = 2;

	/**
	 * The feature id for the '<em><b>Current State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM__CURRENT_STATE = 3;

	/**
	 * The feature id for the '<em><b>Current Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM__CURRENT_EVENT = 4;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM__CONTEXT = 5;

	/**
	 * The number of structural features of the '<em>FSM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.StateImpl
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getState()
	 * @generated
	 */
	int STATE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Fsm</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__FSM = 1;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__BLOCK = 2;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.FinalStateImpl <em>Final State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.FinalStateImpl
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getFinalState()
	 * @generated
	 */
	int FINAL_STATE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__NAME = STATE__NAME;

	/**
	 * The feature id for the '<em><b>Fsm</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__FSM = STATE__FSM;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__BLOCK = STATE__BLOCK;

	/**
	 * The number of structural features of the '<em>Final State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.TransitionImpl
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 3;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__INPUT = 0;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__OUTPUT = 1;

	/**
	 * The feature id for the '<em><b>Fsm</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__FSM = 2;

	/**
	 * The feature id for the '<em><b>Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__EVENT = 3;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__EXPRESSION = 4;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.IntExpressionImpl <em>Int Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.IntExpressionImpl
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getIntExpression()
	 * @generated
	 */
	int INT_EXPRESSION = 5;

	/**
	 * The number of structural features of the '<em>Int Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.IntegerImpl <em>Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.IntegerImpl
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getInteger()
	 * @generated
	 */
	int INTEGER = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__VALUE = INT_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FEATURE_COUNT = INT_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.ContextImpl
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 6;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__VARIABLES = 0;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.VariableImpl
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.BooleanExpressionImpl
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getBooleanExpression()
	 * @generated
	 */
	int BOOLEAN_EXPRESSION = 9;

	/**
	 * The number of structural features of the '<em>Boolean Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.BooleanImpl <em>Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.BooleanImpl
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getBoolean()
	 * @generated
	 */
	int BOOLEAN = 8;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__VALUE = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.IntComparisonImpl <em>Int Comparison</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.IntComparisonImpl
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getIntComparison()
	 * @generated
	 */
	int INT_COMPARISON = 11;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_COMPARISON__RIGHT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_COMPARISON__LEFT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Int Comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_COMPARISON_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.EqualImpl <em>Equal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.EqualImpl
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getEqual()
	 * @generated
	 */
	int EQUAL = 10;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL__RIGHT = INT_COMPARISON__RIGHT;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL__LEFT = INT_COMPARISON__LEFT;

	/**
	 * The number of structural features of the '<em>Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_FEATURE_COUNT = INT_COMPARISON_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.GreaterImpl <em>Greater</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.GreaterImpl
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getGreater()
	 * @generated
	 */
	int GREATER = 12;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER__RIGHT = INT_COMPARISON__RIGHT;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER__LEFT = INT_COMPARISON__LEFT;

	/**
	 * The number of structural features of the '<em>Greater</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_FEATURE_COUNT = INT_COMPARISON_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.GreaterOrEqualImpl <em>Greater Or Equal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.GreaterOrEqualImpl
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getGreaterOrEqual()
	 * @generated
	 */
	int GREATER_OR_EQUAL = 13;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_OR_EQUAL__RIGHT = INT_COMPARISON__RIGHT;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_OR_EQUAL__LEFT = INT_COMPARISON__LEFT;

	/**
	 * The number of structural features of the '<em>Greater Or Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_OR_EQUAL_FEATURE_COUNT = INT_COMPARISON_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.LessImpl <em>Less</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.LessImpl
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getLess()
	 * @generated
	 */
	int LESS = 14;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS__RIGHT = INT_COMPARISON__RIGHT;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS__LEFT = INT_COMPARISON__LEFT;

	/**
	 * The number of structural features of the '<em>Less</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_FEATURE_COUNT = INT_COMPARISON_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.LessOrEqualImpl <em>Less Or Equal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.LessOrEqualImpl
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getLessOrEqual()
	 * @generated
	 */
	int LESS_OR_EQUAL = 15;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_OR_EQUAL__RIGHT = INT_COMPARISON__RIGHT;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_OR_EQUAL__LEFT = INT_COMPARISON__LEFT;

	/**
	 * The number of structural features of the '<em>Less Or Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_OR_EQUAL_FEATURE_COUNT = INT_COMPARISON_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.NotImpl <em>Not</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.NotImpl
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getNot()
	 * @generated
	 */
	int NOT = 16;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__EXPRESSION = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.BooleanOperationImpl <em>Boolean Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.BooleanOperationImpl
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getBooleanOperation()
	 * @generated
	 */
	int BOOLEAN_OPERATION = 18;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATION__LEFT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATION__RIGHT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Boolean Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATION_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.OrImpl <em>Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.OrImpl
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getOr()
	 * @generated
	 */
	int OR = 17;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__LEFT = BOOLEAN_OPERATION__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__RIGHT = BOOLEAN_OPERATION__RIGHT;

	/**
	 * The number of structural features of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_COUNT = BOOLEAN_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.AndImpl <em>And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.AndImpl
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getAnd()
	 * @generated
	 */
	int AND = 19;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__LEFT = BOOLEAN_OPERATION__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__RIGHT = BOOLEAN_OPERATION__RIGHT;

	/**
	 * The number of structural features of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FEATURE_COUNT = BOOLEAN_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.IntOperationImpl <em>Int Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.IntOperationImpl
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getIntOperation()
	 * @generated
	 */
	int INT_OPERATION = 21;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_OPERATION__RIGHT = INT_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_OPERATION__LEFT = INT_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Int Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_OPERATION_FEATURE_COUNT = INT_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.PlusImpl <em>Plus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.PlusImpl
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getPlus()
	 * @generated
	 */
	int PLUS = 20;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS__RIGHT = INT_OPERATION__RIGHT;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS__LEFT = INT_OPERATION__LEFT;

	/**
	 * The number of structural features of the '<em>Plus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_FEATURE_COUNT = INT_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinusImpl <em>Minus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinusImpl
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getMinus()
	 * @generated
	 */
	int MINUS = 22;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS__RIGHT = INT_OPERATION__RIGHT;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS__LEFT = INT_OPERATION__LEFT;

	/**
	 * The number of structural features of the '<em>Minus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_FEATURE_COUNT = INT_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MultiplyImpl <em>Multiply</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MultiplyImpl
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getMultiply()
	 * @generated
	 */
	int MULTIPLY = 23;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLY__RIGHT = INT_OPERATION__RIGHT;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLY__LEFT = INT_OPERATION__LEFT;

	/**
	 * The number of structural features of the '<em>Multiply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLY_FEATURE_COUNT = INT_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.DivideImpl <em>Divide</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.DivideImpl
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getDivide()
	 * @generated
	 */
	int DIVIDE = 24;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDE__RIGHT = INT_OPERATION__RIGHT;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDE__LEFT = INT_OPERATION__LEFT;

	/**
	 * The number of structural features of the '<em>Divide</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDE_FEATURE_COUNT = INT_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.VariableRefImpl <em>Variable Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.VariableRefImpl
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getVariableRef()
	 * @generated
	 */
	int VARIABLE_REF = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_REF__NAME = 0;

	/**
	 * The number of structural features of the '<em>Variable Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_REF_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.BooleanVariableRefImpl <em>Boolean Variable Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.BooleanVariableRefImpl
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getBooleanVariableRef()
	 * @generated
	 */
	int BOOLEAN_VARIABLE_REF = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_REF__NAME = VARIABLE_REF__NAME;

	/**
	 * The number of structural features of the '<em>Boolean Variable Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_REF_FEATURE_COUNT = VARIABLE_REF_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.IntVariableRefImpl <em>Int Variable Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.IntVariableRefImpl
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getIntVariableRef()
	 * @generated
	 */
	int INT_VARIABLE_REF = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_VARIABLE_REF__NAME = VARIABLE_REF__NAME;

	/**
	 * The number of structural features of the '<em>Int Variable Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_VARIABLE_REF_FEATURE_COUNT = VARIABLE_REF_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.StatementImpl
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 29;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.BooleanAssignmentImpl <em>Boolean Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.BooleanAssignmentImpl
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getBooleanAssignment()
	 * @generated
	 */
	int BOOLEAN_ASSIGNMENT = 28;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ASSIGNMENT__VARIABLE = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ASSIGNMENT__VALUE = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Boolean Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ASSIGNMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.IntAssignmentImpl <em>Int Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.IntAssignmentImpl
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getIntAssignment()
	 * @generated
	 */
	int INT_ASSIGNMENT = 30;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_ASSIGNMENT__VARIABLE = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_ASSIGNMENT__VALUE = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Int Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_ASSIGNMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.PrintVarImpl <em>Print Var</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.PrintVarImpl
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getPrintVar()
	 * @generated
	 */
	int PRINT_VAR = 31;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT_VAR__VALUE = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Print Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT_VAR_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.PrintStrImpl <em>Print Str</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.PrintStrImpl
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getPrintStr()
	 * @generated
	 */
	int PRINT_STR = 32;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT_STR__VALUE = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Print Str</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT_STR_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.BlockImpl
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 33;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__STATEMENT = 0;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.IntegerVarImpl <em>Integer Var</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.IntegerVarImpl
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getIntegerVar()
	 * @generated
	 */
	int INTEGER_VAR = 34;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VAR__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VAR__VALUE = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VAR_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.BooleanVarImpl <em>Boolean Var</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.BooleanVarImpl
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getBooleanVar()
	 * @generated
	 */
	int BOOLEAN_VAR = 35;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VAR__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VAR__VALUE = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VAR_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.FSM <em>FSM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FSM</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.FSM
	 * @generated
	 */
	EClass getFSM();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.FSM#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.FSM#getStates()
	 * @see #getFSM()
	 * @generated
	 */
	EReference getFSM_States();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.FSM#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.FSM#getTransitions()
	 * @see #getFSM()
	 * @generated
	 */
	EReference getFSM_Transitions();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.FSM#getInitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initial State</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.FSM#getInitialState()
	 * @see #getFSM()
	 * @generated
	 */
	EReference getFSM_InitialState();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.FSM#getCurrentState <em>Current State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current State</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.FSM#getCurrentState()
	 * @see #getFSM()
	 * @generated
	 */
	EReference getFSM_CurrentState();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.FSM#getCurrentEvent <em>Current Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Event</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.FSM#getCurrentEvent()
	 * @see #getFSM()
	 * @generated
	 */
	EAttribute getFSM_CurrentEvent();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.FSM#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.FSM#getContext()
	 * @see #getFSM()
	 * @generated
	 */
	EReference getFSM_Context();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.State#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.State#getName()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Name();

	/**
	 * Returns the meta object for the container reference '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.State#getFsm <em>Fsm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Fsm</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.State#getFsm()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Fsm();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.State#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Block</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.State#getBlock()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Block();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.FinalState <em>Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final State</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.FinalState
	 * @generated
	 */
	EClass getFinalState();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.Transition#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.Transition#getInput()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Input();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.Transition#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.Transition#getOutput()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Output();

	/**
	 * Returns the meta object for the container reference '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.Transition#getFsm <em>Fsm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Fsm</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.Transition#getFsm()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Fsm();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.Transition#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.Transition#getEvent()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Event();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.Transition#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.Transition#getExpression()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Expression();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.Integer <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.Integer
	 * @generated
	 */
	EClass getInteger();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.Integer#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.Integer#getValue()
	 * @see #getInteger()
	 * @generated
	 */
	EAttribute getInteger_Value();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.IntExpression <em>Int Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Expression</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.IntExpression
	 * @generated
	 */
	EClass getIntExpression();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.Context
	 * @generated
	 */
	EClass getContext();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.Context#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.Context#getVariables()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_Variables();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.Boolean
	 * @generated
	 */
	EClass getBoolean();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.Boolean#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.Boolean#isValue()
	 * @see #getBoolean()
	 * @generated
	 */
	EAttribute getBoolean_Value();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.BooleanExpression <em>Boolean Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Expression</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.BooleanExpression
	 * @generated
	 */
	EClass getBooleanExpression();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.Equal <em>Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equal</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.Equal
	 * @generated
	 */
	EClass getEqual();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.IntComparison <em>Int Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Comparison</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.IntComparison
	 * @generated
	 */
	EClass getIntComparison();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.IntComparison#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.IntComparison#getRight()
	 * @see #getIntComparison()
	 * @generated
	 */
	EReference getIntComparison_Right();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.IntComparison#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.IntComparison#getLeft()
	 * @see #getIntComparison()
	 * @generated
	 */
	EReference getIntComparison_Left();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.Greater <em>Greater</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Greater</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.Greater
	 * @generated
	 */
	EClass getGreater();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.GreaterOrEqual <em>Greater Or Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Greater Or Equal</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.GreaterOrEqual
	 * @generated
	 */
	EClass getGreaterOrEqual();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.Less <em>Less</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Less</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.Less
	 * @generated
	 */
	EClass getLess();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.LessOrEqual <em>Less Or Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Less Or Equal</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.LessOrEqual
	 * @generated
	 */
	EClass getLessOrEqual();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.Not <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.Not
	 * @generated
	 */
	EClass getNot();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.Not#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.Not#getExpression()
	 * @see #getNot()
	 * @generated
	 */
	EReference getNot_Expression();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.Or
	 * @generated
	 */
	EClass getOr();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.BooleanOperation <em>Boolean Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Operation</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.BooleanOperation
	 * @generated
	 */
	EClass getBooleanOperation();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.BooleanOperation#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.BooleanOperation#getLeft()
	 * @see #getBooleanOperation()
	 * @generated
	 */
	EReference getBooleanOperation_Left();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.BooleanOperation#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.BooleanOperation#getRight()
	 * @see #getBooleanOperation()
	 * @generated
	 */
	EReference getBooleanOperation_Right();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.And
	 * @generated
	 */
	EClass getAnd();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.Plus <em>Plus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plus</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.Plus
	 * @generated
	 */
	EClass getPlus();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.IntOperation <em>Int Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Operation</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.IntOperation
	 * @generated
	 */
	EClass getIntOperation();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.IntOperation#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.IntOperation#getRight()
	 * @see #getIntOperation()
	 * @generated
	 */
	EReference getIntOperation_Right();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.IntOperation#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.IntOperation#getLeft()
	 * @see #getIntOperation()
	 * @generated
	 */
	EReference getIntOperation_Left();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.Minus <em>Minus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Minus</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.Minus
	 * @generated
	 */
	EClass getMinus();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.Multiply <em>Multiply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiply</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.Multiply
	 * @generated
	 */
	EClass getMultiply();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.Divide <em>Divide</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Divide</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.Divide
	 * @generated
	 */
	EClass getDivide();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.BooleanVariableRef <em>Boolean Variable Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Variable Ref</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.BooleanVariableRef
	 * @generated
	 */
	EClass getBooleanVariableRef();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.VariableRef <em>Variable Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Ref</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.VariableRef
	 * @generated
	 */
	EClass getVariableRef();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.VariableRef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.VariableRef#getName()
	 * @see #getVariableRef()
	 * @generated
	 */
	EAttribute getVariableRef_Name();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.IntVariableRef <em>Int Variable Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Variable Ref</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.IntVariableRef
	 * @generated
	 */
	EClass getIntVariableRef();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.BooleanAssignment <em>Boolean Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Assignment</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.BooleanAssignment
	 * @generated
	 */
	EClass getBooleanAssignment();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.BooleanAssignment#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.BooleanAssignment#getVariable()
	 * @see #getBooleanAssignment()
	 * @generated
	 */
	EReference getBooleanAssignment_Variable();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.BooleanAssignment#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.BooleanAssignment#getValue()
	 * @see #getBooleanAssignment()
	 * @generated
	 */
	EReference getBooleanAssignment_Value();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.IntAssignment <em>Int Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Assignment</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.IntAssignment
	 * @generated
	 */
	EClass getIntAssignment();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.IntAssignment#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.IntAssignment#getVariable()
	 * @see #getIntAssignment()
	 * @generated
	 */
	EReference getIntAssignment_Variable();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.IntAssignment#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.IntAssignment#getValue()
	 * @see #getIntAssignment()
	 * @generated
	 */
	EReference getIntAssignment_Value();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.PrintVar <em>Print Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Print Var</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.PrintVar
	 * @generated
	 */
	EClass getPrintVar();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.PrintVar#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.PrintVar#getValue()
	 * @see #getPrintVar()
	 * @generated
	 */
	EAttribute getPrintVar_Value();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.PrintStr <em>Print Str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Print Str</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.PrintStr
	 * @generated
	 */
	EClass getPrintStr();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.PrintStr#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.PrintStr#getValue()
	 * @see #getPrintStr()
	 * @generated
	 */
	EAttribute getPrintStr_Value();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.Block#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statement</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.Block#getStatement()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Statement();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.IntegerVar <em>Integer Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Var</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.IntegerVar
	 * @generated
	 */
	EClass getIntegerVar();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.IntegerVar#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.IntegerVar#getValue()
	 * @see #getIntegerVar()
	 * @generated
	 */
	EAttribute getIntegerVar_Value();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.BooleanVar <em>Boolean Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Var</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.BooleanVar
	 * @generated
	 */
	EClass getBooleanVar();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.BooleanVar#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.BooleanVar#isValue()
	 * @see #getBooleanVar()
	 * @generated
	 */
	EAttribute getBooleanVar_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MinifsmFactory getMinifsmFactory();

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
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.FSMImpl <em>FSM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.FSMImpl
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getFSM()
		 * @generated
		 */
		EClass FSM = eINSTANCE.getFSM();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSM__STATES = eINSTANCE.getFSM_States();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSM__TRANSITIONS = eINSTANCE.getFSM_Transitions();

		/**
		 * The meta object literal for the '<em><b>Initial State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSM__INITIAL_STATE = eINSTANCE.getFSM_InitialState();

		/**
		 * The meta object literal for the '<em><b>Current State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSM__CURRENT_STATE = eINSTANCE.getFSM_CurrentState();

		/**
		 * The meta object literal for the '<em><b>Current Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FSM__CURRENT_EVENT = eINSTANCE.getFSM_CurrentEvent();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSM__CONTEXT = eINSTANCE.getFSM_Context();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.StateImpl
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__NAME = eINSTANCE.getState_Name();

		/**
		 * The meta object literal for the '<em><b>Fsm</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__FSM = eINSTANCE.getState_Fsm();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__BLOCK = eINSTANCE.getState_Block();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.FinalStateImpl <em>Final State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.FinalStateImpl
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getFinalState()
		 * @generated
		 */
		EClass FINAL_STATE = eINSTANCE.getFinalState();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.TransitionImpl
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__INPUT = eINSTANCE.getTransition_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__OUTPUT = eINSTANCE.getTransition_Output();

		/**
		 * The meta object literal for the '<em><b>Fsm</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__FSM = eINSTANCE.getTransition_Fsm();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__EVENT = eINSTANCE.getTransition_Event();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__EXPRESSION = eINSTANCE.getTransition_Expression();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.IntegerImpl <em>Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.IntegerImpl
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getInteger()
		 * @generated
		 */
		EClass INTEGER = eINSTANCE.getInteger();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER__VALUE = eINSTANCE.getInteger_Value();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.IntExpressionImpl <em>Int Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.IntExpressionImpl
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getIntExpression()
		 * @generated
		 */
		EClass INT_EXPRESSION = eINSTANCE.getIntExpression();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.ContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.ContextImpl
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getContext()
		 * @generated
		 */
		EClass CONTEXT = eINSTANCE.getContext();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__VARIABLES = eINSTANCE.getContext_Variables();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.VariableImpl
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.BooleanImpl <em>Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.BooleanImpl
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getBoolean()
		 * @generated
		 */
		EClass BOOLEAN = eINSTANCE.getBoolean();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN__VALUE = eINSTANCE.getBoolean_Value();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.BooleanExpressionImpl
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getBooleanExpression()
		 * @generated
		 */
		EClass BOOLEAN_EXPRESSION = eINSTANCE.getBooleanExpression();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.EqualImpl <em>Equal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.EqualImpl
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getEqual()
		 * @generated
		 */
		EClass EQUAL = eINSTANCE.getEqual();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.IntComparisonImpl <em>Int Comparison</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.IntComparisonImpl
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getIntComparison()
		 * @generated
		 */
		EClass INT_COMPARISON = eINSTANCE.getIntComparison();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INT_COMPARISON__RIGHT = eINSTANCE.getIntComparison_Right();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INT_COMPARISON__LEFT = eINSTANCE.getIntComparison_Left();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.GreaterImpl <em>Greater</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.GreaterImpl
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getGreater()
		 * @generated
		 */
		EClass GREATER = eINSTANCE.getGreater();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.GreaterOrEqualImpl <em>Greater Or Equal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.GreaterOrEqualImpl
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getGreaterOrEqual()
		 * @generated
		 */
		EClass GREATER_OR_EQUAL = eINSTANCE.getGreaterOrEqual();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.LessImpl <em>Less</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.LessImpl
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getLess()
		 * @generated
		 */
		EClass LESS = eINSTANCE.getLess();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.LessOrEqualImpl <em>Less Or Equal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.LessOrEqualImpl
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getLessOrEqual()
		 * @generated
		 */
		EClass LESS_OR_EQUAL = eINSTANCE.getLessOrEqual();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.NotImpl <em>Not</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.NotImpl
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getNot()
		 * @generated
		 */
		EClass NOT = eINSTANCE.getNot();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOT__EXPRESSION = eINSTANCE.getNot_Expression();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.OrImpl <em>Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.OrImpl
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getOr()
		 * @generated
		 */
		EClass OR = eINSTANCE.getOr();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.BooleanOperationImpl <em>Boolean Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.BooleanOperationImpl
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getBooleanOperation()
		 * @generated
		 */
		EClass BOOLEAN_OPERATION = eINSTANCE.getBooleanOperation();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_OPERATION__LEFT = eINSTANCE.getBooleanOperation_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_OPERATION__RIGHT = eINSTANCE.getBooleanOperation_Right();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.AndImpl <em>And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.AndImpl
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getAnd()
		 * @generated
		 */
		EClass AND = eINSTANCE.getAnd();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.PlusImpl <em>Plus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.PlusImpl
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getPlus()
		 * @generated
		 */
		EClass PLUS = eINSTANCE.getPlus();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.IntOperationImpl <em>Int Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.IntOperationImpl
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getIntOperation()
		 * @generated
		 */
		EClass INT_OPERATION = eINSTANCE.getIntOperation();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INT_OPERATION__RIGHT = eINSTANCE.getIntOperation_Right();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INT_OPERATION__LEFT = eINSTANCE.getIntOperation_Left();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinusImpl <em>Minus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinusImpl
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getMinus()
		 * @generated
		 */
		EClass MINUS = eINSTANCE.getMinus();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MultiplyImpl <em>Multiply</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MultiplyImpl
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getMultiply()
		 * @generated
		 */
		EClass MULTIPLY = eINSTANCE.getMultiply();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.DivideImpl <em>Divide</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.DivideImpl
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getDivide()
		 * @generated
		 */
		EClass DIVIDE = eINSTANCE.getDivide();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.BooleanVariableRefImpl <em>Boolean Variable Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.BooleanVariableRefImpl
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getBooleanVariableRef()
		 * @generated
		 */
		EClass BOOLEAN_VARIABLE_REF = eINSTANCE.getBooleanVariableRef();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.VariableRefImpl <em>Variable Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.VariableRefImpl
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getVariableRef()
		 * @generated
		 */
		EClass VARIABLE_REF = eINSTANCE.getVariableRef();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_REF__NAME = eINSTANCE.getVariableRef_Name();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.IntVariableRefImpl <em>Int Variable Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.IntVariableRefImpl
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getIntVariableRef()
		 * @generated
		 */
		EClass INT_VARIABLE_REF = eINSTANCE.getIntVariableRef();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.BooleanAssignmentImpl <em>Boolean Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.BooleanAssignmentImpl
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getBooleanAssignment()
		 * @generated
		 */
		EClass BOOLEAN_ASSIGNMENT = eINSTANCE.getBooleanAssignment();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_ASSIGNMENT__VARIABLE = eINSTANCE.getBooleanAssignment_Variable();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_ASSIGNMENT__VALUE = eINSTANCE.getBooleanAssignment_Value();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.StatementImpl
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.IntAssignmentImpl <em>Int Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.IntAssignmentImpl
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getIntAssignment()
		 * @generated
		 */
		EClass INT_ASSIGNMENT = eINSTANCE.getIntAssignment();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INT_ASSIGNMENT__VARIABLE = eINSTANCE.getIntAssignment_Variable();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INT_ASSIGNMENT__VALUE = eINSTANCE.getIntAssignment_Value();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.PrintVarImpl <em>Print Var</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.PrintVarImpl
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getPrintVar()
		 * @generated
		 */
		EClass PRINT_VAR = eINSTANCE.getPrintVar();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRINT_VAR__VALUE = eINSTANCE.getPrintVar_Value();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.PrintStrImpl <em>Print Str</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.PrintStrImpl
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getPrintStr()
		 * @generated
		 */
		EClass PRINT_STR = eINSTANCE.getPrintStr();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRINT_STR__VALUE = eINSTANCE.getPrintStr_Value();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.BlockImpl
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__STATEMENT = eINSTANCE.getBlock_Statement();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.IntegerVarImpl <em>Integer Var</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.IntegerVarImpl
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getIntegerVar()
		 * @generated
		 */
		EClass INTEGER_VAR = eINSTANCE.getIntegerVar();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_VAR__VALUE = eINSTANCE.getIntegerVar_Value();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.BooleanVarImpl <em>Boolean Var</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.BooleanVarImpl
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getBooleanVar()
		 * @generated
		 */
		EClass BOOLEAN_VAR = eINSTANCE.getBooleanVar();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_VAR__VALUE = eINSTANCE.getBooleanVar_Value();

	}

} //MinifsmPackage
