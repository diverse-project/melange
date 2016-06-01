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
	 * The number of structural features of the '<em>FSM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_FEATURE_COUNT = 3;

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
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 1;

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
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__CONDITION = 2;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.ConditionImpl
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 4;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__LANGUAGE = 1;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.ContextImpl
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 5;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' reference list.
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
	int VARIABLE = 6;

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
	 * The meta object id for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.IntegerVarImpl <em>Integer Var</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.IntegerVarImpl
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getIntegerVar()
	 * @generated
	 */
	int INTEGER_VAR = 7;

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
	int BOOLEAN_VAR = 8;

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
	 * The meta object id for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.IntExpressionImpl <em>Int Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.IntExpressionImpl
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getIntExpression()
	 * @generated
	 */
	int INT_EXPRESSION = 10;

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
	int INTEGER = 9;

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
	 * The meta object id for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.BooleanExpressionImpl
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getBooleanExpression()
	 * @generated
	 */
	int BOOLEAN_EXPRESSION = 12;

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
	int BOOLEAN = 11;

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
	int INT_COMPARISON = 14;

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
	int EQUAL = 13;

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
	int GREATER = 15;

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
	int GREATER_OR_EQUAL = 16;

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
	int LESS = 17;

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
	int LESS_OR_EQUAL = 18;

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
	int NOT = 19;

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
	int BOOLEAN_OPERATION = 21;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATION__LEFT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
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
	int OR = 20;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__LEFT = BOOLEAN_OPERATION__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
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
	int AND = 22;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__LEFT = BOOLEAN_OPERATION__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
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
	int INT_OPERATION = 24;

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
	int PLUS = 23;

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
	int MINUS = 25;

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
	int MULTIPLY = 26;

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
	int DIVIDE = 27;

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
	int VARIABLE_REF = 29;

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
	int BOOLEAN_VARIABLE_REF = 28;

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
	int INT_VARIABLE_REF = 30;

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
	 * The meta object id for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.IntExpressionAspectImpl <em>Int Expression Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.IntExpressionAspectImpl
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getIntExpressionAspect()
	 * @generated
	 */
	int INT_EXPRESSION_ASPECT = 31;

	/**
	 * The number of structural features of the '<em>Int Expression Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_EXPRESSION_ASPECT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.IntegerAspectImpl <em>Integer Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.IntegerAspectImpl
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getIntegerAspect()
	 * @generated
	 */
	int INTEGER_ASPECT = 32;

	/**
	 * The number of structural features of the '<em>Integer Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_ASPECT_FEATURE_COUNT = INT_EXPRESSION_ASPECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.VariableRefAspectImpl <em>Variable Ref Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.VariableRefAspectImpl
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getVariableRefAspect()
	 * @generated
	 */
	int VARIABLE_REF_ASPECT = 33;

	/**
	 * The number of structural features of the '<em>Variable Ref Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_REF_ASPECT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.IntVariableRefAspectImpl <em>Int Variable Ref Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.IntVariableRefAspectImpl
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getIntVariableRefAspect()
	 * @generated
	 */
	int INT_VARIABLE_REF_ASPECT = 34;

	/**
	 * The number of structural features of the '<em>Int Variable Ref Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_VARIABLE_REF_ASPECT_FEATURE_COUNT = VARIABLE_REF_ASPECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.BooleanExpressionAspectImpl <em>Boolean Expression Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.BooleanExpressionAspectImpl
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getBooleanExpressionAspect()
	 * @generated
	 */
	int BOOLEAN_EXPRESSION_ASPECT = 40;

	/**
	 * The number of structural features of the '<em>Boolean Expression Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION_ASPECT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.IntComparisonAspectImpl <em>Int Comparison Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.IntComparisonAspectImpl
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getIntComparisonAspect()
	 * @generated
	 */
	int INT_COMPARISON_ASPECT = 35;

	/**
	 * The number of structural features of the '<em>Int Comparison Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_COMPARISON_ASPECT_FEATURE_COUNT = BOOLEAN_EXPRESSION_ASPECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.LessAspectImpl <em>Less Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.LessAspectImpl
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getLessAspect()
	 * @generated
	 */
	int LESS_ASPECT = 36;

	/**
	 * The number of structural features of the '<em>Less Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_ASPECT_FEATURE_COUNT = INT_COMPARISON_ASPECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.StatementAspectImpl <em>Statement Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.StatementAspectImpl
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getStatementAspect()
	 * @generated
	 */
	int STATEMENT_ASPECT = 37;

	/**
	 * The number of structural features of the '<em>Statement Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_ASPECT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.IntAssignementAspectImpl <em>Int Assignement Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.IntAssignementAspectImpl
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getIntAssignementAspect()
	 * @generated
	 */
	int INT_ASSIGNEMENT_ASPECT = 38;

	/**
	 * The number of structural features of the '<em>Int Assignement Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_ASSIGNEMENT_ASPECT_FEATURE_COUNT = STATEMENT_ASPECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.IfAspectImpl <em>If Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.IfAspectImpl
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getIfAspect()
	 * @generated
	 */
	int IF_ASPECT = 39;

	/**
	 * The number of structural features of the '<em>If Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_ASPECT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.BooleanVariableRefAspectImpl <em>Boolean Variable Ref Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.BooleanVariableRefAspectImpl
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getBooleanVariableRefAspect()
	 * @generated
	 */
	int BOOLEAN_VARIABLE_REF_ASPECT = 41;

	/**
	 * The number of structural features of the '<em>Boolean Variable Ref Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_REF_ASPECT_FEATURE_COUNT = VARIABLE_REF_ASPECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.BlockAspectImpl <em>Block Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.BlockAspectImpl
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getBlockAspect()
	 * @generated
	 */
	int BLOCK_ASPECT = 42;

	/**
	 * The number of structural features of the '<em>Block Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_ASPECT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.IntOperationAspectImpl <em>Int Operation Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.IntOperationAspectImpl
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getIntOperationAspect()
	 * @generated
	 */
	int INT_OPERATION_ASPECT = 43;

	/**
	 * The number of structural features of the '<em>Int Operation Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_OPERATION_ASPECT_FEATURE_COUNT = INT_EXPRESSION_ASPECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.PlusAspectImpl <em>Plus Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.PlusAspectImpl
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getPlusAspect()
	 * @generated
	 */
	int PLUS_ASPECT = 44;

	/**
	 * The number of structural features of the '<em>Plus Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_ASPECT_FEATURE_COUNT = INT_OPERATION_ASPECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.BooleanAssignemntAspectImpl <em>Boolean Assignemnt Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.BooleanAssignemntAspectImpl
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getBooleanAssignemntAspect()
	 * @generated
	 */
	int BOOLEAN_ASSIGNEMNT_ASPECT = 45;

	/**
	 * The number of structural features of the '<em>Boolean Assignemnt Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ASSIGNEMNT_ASPECT_FEATURE_COUNT = STATEMENT_ASPECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.EqualAspectImpl <em>Equal Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.EqualAspectImpl
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getEqualAspect()
	 * @generated
	 */
	int EQUAL_ASPECT = 46;

	/**
	 * The number of structural features of the '<em>Equal Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_ASPECT_FEATURE_COUNT = INT_COMPARISON_ASPECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.GreaterAspectImpl <em>Greater Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.GreaterAspectImpl
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getGreaterAspect()
	 * @generated
	 */
	int GREATER_ASPECT = 47;

	/**
	 * The number of structural features of the '<em>Greater Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_ASPECT_FEATURE_COUNT = INT_COMPARISON_ASPECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.BooleanAspectImpl <em>Boolean Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.BooleanAspectImpl
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getBooleanAspect()
	 * @generated
	 */
	int BOOLEAN_ASPECT = 48;

	/**
	 * The number of structural features of the '<em>Boolean Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ASPECT_FEATURE_COUNT = BOOLEAN_EXPRESSION_ASPECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinusAspectImpl <em>Minus Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinusAspectImpl
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getMinusAspect()
	 * @generated
	 */
	int MINUS_ASPECT = 49;

	/**
	 * The number of structural features of the '<em>Minus Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_ASPECT_FEATURE_COUNT = INT_OPERATION_ASPECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.NotAspectImpl <em>Not Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.NotAspectImpl
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getNotAspect()
	 * @generated
	 */
	int NOT_ASPECT = 50;

	/**
	 * The number of structural features of the '<em>Not Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_ASPECT_FEATURE_COUNT = BOOLEAN_EXPRESSION_ASPECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.DivideAspectImpl <em>Divide Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.DivideAspectImpl
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getDivideAspect()
	 * @generated
	 */
	int DIVIDE_ASPECT = 51;

	/**
	 * The number of structural features of the '<em>Divide Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDE_ASPECT_FEATURE_COUNT = INT_OPERATION_ASPECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MultiplyAspectImpl <em>Multiply Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MultiplyAspectImpl
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getMultiplyAspect()
	 * @generated
	 */
	int MULTIPLY_ASPECT = 52;

	/**
	 * The number of structural features of the '<em>Multiply Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLY_ASPECT_FEATURE_COUNT = INT_OPERATION_ASPECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.LessOrEqualAspectImpl <em>Less Or Equal Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.LessOrEqualAspectImpl
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getLessOrEqualAspect()
	 * @generated
	 */
	int LESS_OR_EQUAL_ASPECT = 53;

	/**
	 * The number of structural features of the '<em>Less Or Equal Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_OR_EQUAL_ASPECT_FEATURE_COUNT = INT_COMPARISON_ASPECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.GreaterOrEqualAspectImpl <em>Greater Or Equal Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.GreaterOrEqualAspectImpl
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getGreaterOrEqualAspect()
	 * @generated
	 */
	int GREATER_OR_EQUAL_ASPECT = 54;

	/**
	 * The number of structural features of the '<em>Greater Or Equal Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_OR_EQUAL_ASPECT_FEATURE_COUNT = INT_COMPARISON_ASPECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.WhileAspectImpl <em>While Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.WhileAspectImpl
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getWhileAspect()
	 * @generated
	 */
	int WHILE_ASPECT = 55;

	/**
	 * The number of structural features of the '<em>While Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_ASPECT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.BooleanOperationAspectImpl <em>Boolean Operation Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.BooleanOperationAspectImpl
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getBooleanOperationAspect()
	 * @generated
	 */
	int BOOLEAN_OPERATION_ASPECT = 56;

	/**
	 * The number of structural features of the '<em>Boolean Operation Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATION_ASPECT_FEATURE_COUNT = BOOLEAN_EXPRESSION_ASPECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.AndAspectImpl <em>And Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.AndAspectImpl
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getAndAspect()
	 * @generated
	 */
	int AND_ASPECT = 57;

	/**
	 * The number of structural features of the '<em>And Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_ASPECT_FEATURE_COUNT = BOOLEAN_OPERATION_ASPECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.OrAspectImpl <em>Or Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.OrAspectImpl
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getOrAspect()
	 * @generated
	 */
	int OR_ASPECT = 58;

	/**
	 * The number of structural features of the '<em>Or Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_ASPECT_FEATURE_COUNT = BOOLEAN_OPERATION_ASPECT_FEATURE_COUNT + 0;


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
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.Transition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.Transition#getCondition()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Condition();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.Condition#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.Condition#getExpression()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Expression();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.Condition#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.Condition#getLanguage()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Language();

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
	 * Returns the meta object for the reference list '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.Context#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Variables</em>'.
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
	 * Returns the meta object for the reference '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.BooleanOperation#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right</em>'.
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
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.IntExpressionAspect <em>Int Expression Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Expression Aspect</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.IntExpressionAspect
	 * @generated
	 */
	EClass getIntExpressionAspect();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.IntegerAspect <em>Integer Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Aspect</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.IntegerAspect
	 * @generated
	 */
	EClass getIntegerAspect();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.VariableRefAspect <em>Variable Ref Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Ref Aspect</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.VariableRefAspect
	 * @generated
	 */
	EClass getVariableRefAspect();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.IntVariableRefAspect <em>Int Variable Ref Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Variable Ref Aspect</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.IntVariableRefAspect
	 * @generated
	 */
	EClass getIntVariableRefAspect();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.IntComparisonAspect <em>Int Comparison Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Comparison Aspect</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.IntComparisonAspect
	 * @generated
	 */
	EClass getIntComparisonAspect();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.LessAspect <em>Less Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Less Aspect</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.LessAspect
	 * @generated
	 */
	EClass getLessAspect();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.StatementAspect <em>Statement Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement Aspect</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.StatementAspect
	 * @generated
	 */
	EClass getStatementAspect();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.IntAssignementAspect <em>Int Assignement Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Assignement Aspect</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.IntAssignementAspect
	 * @generated
	 */
	EClass getIntAssignementAspect();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.IfAspect <em>If Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Aspect</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.IfAspect
	 * @generated
	 */
	EClass getIfAspect();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.BooleanExpressionAspect <em>Boolean Expression Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Expression Aspect</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.BooleanExpressionAspect
	 * @generated
	 */
	EClass getBooleanExpressionAspect();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.BooleanVariableRefAspect <em>Boolean Variable Ref Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Variable Ref Aspect</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.BooleanVariableRefAspect
	 * @generated
	 */
	EClass getBooleanVariableRefAspect();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.BlockAspect <em>Block Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block Aspect</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.BlockAspect
	 * @generated
	 */
	EClass getBlockAspect();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.IntOperationAspect <em>Int Operation Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Operation Aspect</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.IntOperationAspect
	 * @generated
	 */
	EClass getIntOperationAspect();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.PlusAspect <em>Plus Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plus Aspect</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.PlusAspect
	 * @generated
	 */
	EClass getPlusAspect();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.BooleanAssignemntAspect <em>Boolean Assignemnt Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Assignemnt Aspect</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.BooleanAssignemntAspect
	 * @generated
	 */
	EClass getBooleanAssignemntAspect();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.EqualAspect <em>Equal Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equal Aspect</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.EqualAspect
	 * @generated
	 */
	EClass getEqualAspect();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.GreaterAspect <em>Greater Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Greater Aspect</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.GreaterAspect
	 * @generated
	 */
	EClass getGreaterAspect();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.BooleanAspect <em>Boolean Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Aspect</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.BooleanAspect
	 * @generated
	 */
	EClass getBooleanAspect();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.MinusAspect <em>Minus Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Minus Aspect</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.MinusAspect
	 * @generated
	 */
	EClass getMinusAspect();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.NotAspect <em>Not Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Aspect</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.NotAspect
	 * @generated
	 */
	EClass getNotAspect();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.DivideAspect <em>Divide Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Divide Aspect</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.DivideAspect
	 * @generated
	 */
	EClass getDivideAspect();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.MultiplyAspect <em>Multiply Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiply Aspect</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.MultiplyAspect
	 * @generated
	 */
	EClass getMultiplyAspect();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.LessOrEqualAspect <em>Less Or Equal Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Less Or Equal Aspect</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.LessOrEqualAspect
	 * @generated
	 */
	EClass getLessOrEqualAspect();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.GreaterOrEqualAspect <em>Greater Or Equal Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Greater Or Equal Aspect</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.GreaterOrEqualAspect
	 * @generated
	 */
	EClass getGreaterOrEqualAspect();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.WhileAspect <em>While Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>While Aspect</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.WhileAspect
	 * @generated
	 */
	EClass getWhileAspect();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.BooleanOperationAspect <em>Boolean Operation Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Operation Aspect</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.BooleanOperationAspect
	 * @generated
	 */
	EClass getBooleanOperationAspect();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.AndAspect <em>And Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And Aspect</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.AndAspect
	 * @generated
	 */
	EClass getAndAspect();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.OrAspect <em>Or Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or Aspect</em>'.
	 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.OrAspect
	 * @generated
	 */
	EClass getOrAspect();

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
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__CONDITION = eINSTANCE.getTransition_Condition();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.ConditionImpl
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__EXPRESSION = eINSTANCE.getCondition_Expression();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__LANGUAGE = eINSTANCE.getCondition_Language();

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
		 * The meta object literal for the '<em><b>Variables</b></em>' reference list feature.
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
		 * The meta object literal for the '<em><b>Right</b></em>' reference feature.
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
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.IntExpressionAspectImpl <em>Int Expression Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.IntExpressionAspectImpl
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getIntExpressionAspect()
		 * @generated
		 */
		EClass INT_EXPRESSION_ASPECT = eINSTANCE.getIntExpressionAspect();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.IntegerAspectImpl <em>Integer Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.IntegerAspectImpl
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getIntegerAspect()
		 * @generated
		 */
		EClass INTEGER_ASPECT = eINSTANCE.getIntegerAspect();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.VariableRefAspectImpl <em>Variable Ref Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.VariableRefAspectImpl
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getVariableRefAspect()
		 * @generated
		 */
		EClass VARIABLE_REF_ASPECT = eINSTANCE.getVariableRefAspect();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.IntVariableRefAspectImpl <em>Int Variable Ref Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.IntVariableRefAspectImpl
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getIntVariableRefAspect()
		 * @generated
		 */
		EClass INT_VARIABLE_REF_ASPECT = eINSTANCE.getIntVariableRefAspect();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.IntComparisonAspectImpl <em>Int Comparison Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.IntComparisonAspectImpl
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getIntComparisonAspect()
		 * @generated
		 */
		EClass INT_COMPARISON_ASPECT = eINSTANCE.getIntComparisonAspect();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.LessAspectImpl <em>Less Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.LessAspectImpl
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getLessAspect()
		 * @generated
		 */
		EClass LESS_ASPECT = eINSTANCE.getLessAspect();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.StatementAspectImpl <em>Statement Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.StatementAspectImpl
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getStatementAspect()
		 * @generated
		 */
		EClass STATEMENT_ASPECT = eINSTANCE.getStatementAspect();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.IntAssignementAspectImpl <em>Int Assignement Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.IntAssignementAspectImpl
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getIntAssignementAspect()
		 * @generated
		 */
		EClass INT_ASSIGNEMENT_ASPECT = eINSTANCE.getIntAssignementAspect();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.IfAspectImpl <em>If Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.IfAspectImpl
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getIfAspect()
		 * @generated
		 */
		EClass IF_ASPECT = eINSTANCE.getIfAspect();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.BooleanExpressionAspectImpl <em>Boolean Expression Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.BooleanExpressionAspectImpl
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getBooleanExpressionAspect()
		 * @generated
		 */
		EClass BOOLEAN_EXPRESSION_ASPECT = eINSTANCE.getBooleanExpressionAspect();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.BooleanVariableRefAspectImpl <em>Boolean Variable Ref Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.BooleanVariableRefAspectImpl
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getBooleanVariableRefAspect()
		 * @generated
		 */
		EClass BOOLEAN_VARIABLE_REF_ASPECT = eINSTANCE.getBooleanVariableRefAspect();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.BlockAspectImpl <em>Block Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.BlockAspectImpl
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getBlockAspect()
		 * @generated
		 */
		EClass BLOCK_ASPECT = eINSTANCE.getBlockAspect();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.IntOperationAspectImpl <em>Int Operation Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.IntOperationAspectImpl
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getIntOperationAspect()
		 * @generated
		 */
		EClass INT_OPERATION_ASPECT = eINSTANCE.getIntOperationAspect();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.PlusAspectImpl <em>Plus Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.PlusAspectImpl
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getPlusAspect()
		 * @generated
		 */
		EClass PLUS_ASPECT = eINSTANCE.getPlusAspect();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.BooleanAssignemntAspectImpl <em>Boolean Assignemnt Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.BooleanAssignemntAspectImpl
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getBooleanAssignemntAspect()
		 * @generated
		 */
		EClass BOOLEAN_ASSIGNEMNT_ASPECT = eINSTANCE.getBooleanAssignemntAspect();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.EqualAspectImpl <em>Equal Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.EqualAspectImpl
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getEqualAspect()
		 * @generated
		 */
		EClass EQUAL_ASPECT = eINSTANCE.getEqualAspect();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.GreaterAspectImpl <em>Greater Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.GreaterAspectImpl
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getGreaterAspect()
		 * @generated
		 */
		EClass GREATER_ASPECT = eINSTANCE.getGreaterAspect();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.BooleanAspectImpl <em>Boolean Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.BooleanAspectImpl
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getBooleanAspect()
		 * @generated
		 */
		EClass BOOLEAN_ASPECT = eINSTANCE.getBooleanAspect();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinusAspectImpl <em>Minus Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinusAspectImpl
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getMinusAspect()
		 * @generated
		 */
		EClass MINUS_ASPECT = eINSTANCE.getMinusAspect();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.NotAspectImpl <em>Not Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.NotAspectImpl
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getNotAspect()
		 * @generated
		 */
		EClass NOT_ASPECT = eINSTANCE.getNotAspect();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.DivideAspectImpl <em>Divide Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.DivideAspectImpl
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getDivideAspect()
		 * @generated
		 */
		EClass DIVIDE_ASPECT = eINSTANCE.getDivideAspect();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MultiplyAspectImpl <em>Multiply Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MultiplyAspectImpl
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getMultiplyAspect()
		 * @generated
		 */
		EClass MULTIPLY_ASPECT = eINSTANCE.getMultiplyAspect();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.LessOrEqualAspectImpl <em>Less Or Equal Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.LessOrEqualAspectImpl
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getLessOrEqualAspect()
		 * @generated
		 */
		EClass LESS_OR_EQUAL_ASPECT = eINSTANCE.getLessOrEqualAspect();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.GreaterOrEqualAspectImpl <em>Greater Or Equal Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.GreaterOrEqualAspectImpl
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getGreaterOrEqualAspect()
		 * @generated
		 */
		EClass GREATER_OR_EQUAL_ASPECT = eINSTANCE.getGreaterOrEqualAspect();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.WhileAspectImpl <em>While Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.WhileAspectImpl
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getWhileAspect()
		 * @generated
		 */
		EClass WHILE_ASPECT = eINSTANCE.getWhileAspect();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.BooleanOperationAspectImpl <em>Boolean Operation Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.BooleanOperationAspectImpl
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getBooleanOperationAspect()
		 * @generated
		 */
		EClass BOOLEAN_OPERATION_ASPECT = eINSTANCE.getBooleanOperationAspect();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.AndAspectImpl <em>And Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.AndAspectImpl
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getAndAspect()
		 * @generated
		 */
		EClass AND_ASPECT = eINSTANCE.getAndAspect();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.OrAspectImpl <em>Or Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.OrAspectImpl
		 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.impl.MinifsmPackageImpl#getOrAspect()
		 * @generated
		 */
		EClass OR_ASPECT = eINSTANCE.getOrAspect();

	}

} //MinifsmPackage
