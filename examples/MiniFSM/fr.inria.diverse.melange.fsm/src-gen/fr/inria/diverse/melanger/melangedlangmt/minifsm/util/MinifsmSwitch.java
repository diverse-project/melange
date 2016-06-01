/**
 */
package fr.inria.diverse.melanger.melangedlangmt.minifsm.util;

import fr.inria.diverse.melanger.melangedlangmt.minifsm.And;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.AndAspect;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.BlockAspect;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.BooleanAspect;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.BooleanAssignemntAspect;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.BooleanExpression;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.BooleanExpressionAspect;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.BooleanOperation;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.BooleanOperationAspect;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.BooleanVar;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.BooleanVariableRef;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.BooleanVariableRefAspect;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.Condition;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.Context;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.Divide;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.DivideAspect;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.Equal;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.EqualAspect;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.FSM;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.FinalState;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.Greater;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.GreaterAspect;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.GreaterOrEqual;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.GreaterOrEqualAspect;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.IfAspect;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.IntAssignementAspect;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.IntComparison;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.IntComparisonAspect;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.IntExpression;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.IntExpressionAspect;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.IntOperation;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.IntOperationAspect;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.IntVariableRef;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.IntVariableRefAspect;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.IntegerAspect;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.IntegerVar;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.Less;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.LessAspect;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.LessOrEqual;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.LessOrEqualAspect;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmPackage;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.Minus;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.MinusAspect;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.Multiply;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.MultiplyAspect;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.Not;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.NotAspect;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.Or;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.OrAspect;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.Plus;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.PlusAspect;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.State;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.StatementAspect;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.Transition;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.Variable;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.VariableRef;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.VariableRefAspect;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.WhileAspect;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmPackage
 * @generated
 */
public class MinifsmSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MinifsmPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MinifsmSwitch() {
		if (modelPackage == null) {
			modelPackage = MinifsmPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case MinifsmPackage.FSM: {
				FSM fsm = (FSM)theEObject;
				T result = caseFSM(fsm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinifsmPackage.STATE: {
				State state = (State)theEObject;
				T result = caseState(state);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinifsmPackage.FINAL_STATE: {
				FinalState finalState = (FinalState)theEObject;
				T result = caseFinalState(finalState);
				if (result == null) result = caseState(finalState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinifsmPackage.TRANSITION: {
				Transition transition = (Transition)theEObject;
				T result = caseTransition(transition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinifsmPackage.CONDITION: {
				Condition condition = (Condition)theEObject;
				T result = caseCondition(condition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinifsmPackage.CONTEXT: {
				Context context = (Context)theEObject;
				T result = caseContext(context);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinifsmPackage.VARIABLE: {
				Variable variable = (Variable)theEObject;
				T result = caseVariable(variable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinifsmPackage.INTEGER_VAR: {
				IntegerVar integerVar = (IntegerVar)theEObject;
				T result = caseIntegerVar(integerVar);
				if (result == null) result = caseVariable(integerVar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinifsmPackage.BOOLEAN_VAR: {
				BooleanVar booleanVar = (BooleanVar)theEObject;
				T result = caseBooleanVar(booleanVar);
				if (result == null) result = caseVariable(booleanVar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinifsmPackage.INTEGER: {
				fr.inria.diverse.melanger.melangedlangmt.minifsm.Integer integer = (fr.inria.diverse.melanger.melangedlangmt.minifsm.Integer)theEObject;
				T result = caseInteger(integer);
				if (result == null) result = caseIntExpression(integer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinifsmPackage.INT_EXPRESSION: {
				IntExpression intExpression = (IntExpression)theEObject;
				T result = caseIntExpression(intExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinifsmPackage.BOOLEAN: {
				fr.inria.diverse.melanger.melangedlangmt.minifsm.Boolean boolean_ = (fr.inria.diverse.melanger.melangedlangmt.minifsm.Boolean)theEObject;
				T result = caseBoolean(boolean_);
				if (result == null) result = caseBooleanExpression(boolean_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinifsmPackage.BOOLEAN_EXPRESSION: {
				BooleanExpression booleanExpression = (BooleanExpression)theEObject;
				T result = caseBooleanExpression(booleanExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinifsmPackage.EQUAL: {
				Equal equal = (Equal)theEObject;
				T result = caseEqual(equal);
				if (result == null) result = caseIntComparison(equal);
				if (result == null) result = caseBooleanExpression(equal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinifsmPackage.INT_COMPARISON: {
				IntComparison intComparison = (IntComparison)theEObject;
				T result = caseIntComparison(intComparison);
				if (result == null) result = caseBooleanExpression(intComparison);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinifsmPackage.GREATER: {
				Greater greater = (Greater)theEObject;
				T result = caseGreater(greater);
				if (result == null) result = caseIntComparison(greater);
				if (result == null) result = caseBooleanExpression(greater);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinifsmPackage.GREATER_OR_EQUAL: {
				GreaterOrEqual greaterOrEqual = (GreaterOrEqual)theEObject;
				T result = caseGreaterOrEqual(greaterOrEqual);
				if (result == null) result = caseIntComparison(greaterOrEqual);
				if (result == null) result = caseBooleanExpression(greaterOrEqual);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinifsmPackage.LESS: {
				Less less = (Less)theEObject;
				T result = caseLess(less);
				if (result == null) result = caseIntComparison(less);
				if (result == null) result = caseBooleanExpression(less);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinifsmPackage.LESS_OR_EQUAL: {
				LessOrEqual lessOrEqual = (LessOrEqual)theEObject;
				T result = caseLessOrEqual(lessOrEqual);
				if (result == null) result = caseIntComparison(lessOrEqual);
				if (result == null) result = caseBooleanExpression(lessOrEqual);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinifsmPackage.NOT: {
				Not not = (Not)theEObject;
				T result = caseNot(not);
				if (result == null) result = caseBooleanExpression(not);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinifsmPackage.OR: {
				Or or = (Or)theEObject;
				T result = caseOr(or);
				if (result == null) result = caseBooleanOperation(or);
				if (result == null) result = caseBooleanExpression(or);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinifsmPackage.BOOLEAN_OPERATION: {
				BooleanOperation booleanOperation = (BooleanOperation)theEObject;
				T result = caseBooleanOperation(booleanOperation);
				if (result == null) result = caseBooleanExpression(booleanOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinifsmPackage.AND: {
				And and = (And)theEObject;
				T result = caseAnd(and);
				if (result == null) result = caseBooleanOperation(and);
				if (result == null) result = caseBooleanExpression(and);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinifsmPackage.PLUS: {
				Plus plus = (Plus)theEObject;
				T result = casePlus(plus);
				if (result == null) result = caseIntOperation(plus);
				if (result == null) result = caseIntExpression(plus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinifsmPackage.INT_OPERATION: {
				IntOperation intOperation = (IntOperation)theEObject;
				T result = caseIntOperation(intOperation);
				if (result == null) result = caseIntExpression(intOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinifsmPackage.MINUS: {
				Minus minus = (Minus)theEObject;
				T result = caseMinus(minus);
				if (result == null) result = caseIntOperation(minus);
				if (result == null) result = caseIntExpression(minus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinifsmPackage.MULTIPLY: {
				Multiply multiply = (Multiply)theEObject;
				T result = caseMultiply(multiply);
				if (result == null) result = caseIntOperation(multiply);
				if (result == null) result = caseIntExpression(multiply);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinifsmPackage.DIVIDE: {
				Divide divide = (Divide)theEObject;
				T result = caseDivide(divide);
				if (result == null) result = caseIntOperation(divide);
				if (result == null) result = caseIntExpression(divide);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinifsmPackage.BOOLEAN_VARIABLE_REF: {
				BooleanVariableRef booleanVariableRef = (BooleanVariableRef)theEObject;
				T result = caseBooleanVariableRef(booleanVariableRef);
				if (result == null) result = caseVariableRef(booleanVariableRef);
				if (result == null) result = caseBooleanExpression(booleanVariableRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinifsmPackage.VARIABLE_REF: {
				VariableRef variableRef = (VariableRef)theEObject;
				T result = caseVariableRef(variableRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinifsmPackage.INT_VARIABLE_REF: {
				IntVariableRef intVariableRef = (IntVariableRef)theEObject;
				T result = caseIntVariableRef(intVariableRef);
				if (result == null) result = caseVariableRef(intVariableRef);
				if (result == null) result = caseIntExpression(intVariableRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinifsmPackage.INT_EXPRESSION_ASPECT: {
				IntExpressionAspect intExpressionAspect = (IntExpressionAspect)theEObject;
				T result = caseIntExpressionAspect(intExpressionAspect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinifsmPackage.INTEGER_ASPECT: {
				IntegerAspect integerAspect = (IntegerAspect)theEObject;
				T result = caseIntegerAspect(integerAspect);
				if (result == null) result = caseIntExpressionAspect(integerAspect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinifsmPackage.VARIABLE_REF_ASPECT: {
				VariableRefAspect variableRefAspect = (VariableRefAspect)theEObject;
				T result = caseVariableRefAspect(variableRefAspect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinifsmPackage.INT_VARIABLE_REF_ASPECT: {
				IntVariableRefAspect intVariableRefAspect = (IntVariableRefAspect)theEObject;
				T result = caseIntVariableRefAspect(intVariableRefAspect);
				if (result == null) result = caseVariableRefAspect(intVariableRefAspect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinifsmPackage.INT_COMPARISON_ASPECT: {
				IntComparisonAspect intComparisonAspect = (IntComparisonAspect)theEObject;
				T result = caseIntComparisonAspect(intComparisonAspect);
				if (result == null) result = caseBooleanExpressionAspect(intComparisonAspect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinifsmPackage.LESS_ASPECT: {
				LessAspect lessAspect = (LessAspect)theEObject;
				T result = caseLessAspect(lessAspect);
				if (result == null) result = caseIntComparisonAspect(lessAspect);
				if (result == null) result = caseBooleanExpressionAspect(lessAspect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinifsmPackage.STATEMENT_ASPECT: {
				StatementAspect statementAspect = (StatementAspect)theEObject;
				T result = caseStatementAspect(statementAspect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinifsmPackage.INT_ASSIGNEMENT_ASPECT: {
				IntAssignementAspect intAssignementAspect = (IntAssignementAspect)theEObject;
				T result = caseIntAssignementAspect(intAssignementAspect);
				if (result == null) result = caseStatementAspect(intAssignementAspect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinifsmPackage.IF_ASPECT: {
				IfAspect ifAspect = (IfAspect)theEObject;
				T result = caseIfAspect(ifAspect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinifsmPackage.BOOLEAN_EXPRESSION_ASPECT: {
				BooleanExpressionAspect booleanExpressionAspect = (BooleanExpressionAspect)theEObject;
				T result = caseBooleanExpressionAspect(booleanExpressionAspect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinifsmPackage.BOOLEAN_VARIABLE_REF_ASPECT: {
				BooleanVariableRefAspect booleanVariableRefAspect = (BooleanVariableRefAspect)theEObject;
				T result = caseBooleanVariableRefAspect(booleanVariableRefAspect);
				if (result == null) result = caseVariableRefAspect(booleanVariableRefAspect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinifsmPackage.BLOCK_ASPECT: {
				BlockAspect blockAspect = (BlockAspect)theEObject;
				T result = caseBlockAspect(blockAspect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinifsmPackage.INT_OPERATION_ASPECT: {
				IntOperationAspect intOperationAspect = (IntOperationAspect)theEObject;
				T result = caseIntOperationAspect(intOperationAspect);
				if (result == null) result = caseIntExpressionAspect(intOperationAspect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinifsmPackage.PLUS_ASPECT: {
				PlusAspect plusAspect = (PlusAspect)theEObject;
				T result = casePlusAspect(plusAspect);
				if (result == null) result = caseIntOperationAspect(plusAspect);
				if (result == null) result = caseIntExpressionAspect(plusAspect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinifsmPackage.BOOLEAN_ASSIGNEMNT_ASPECT: {
				BooleanAssignemntAspect booleanAssignemntAspect = (BooleanAssignemntAspect)theEObject;
				T result = caseBooleanAssignemntAspect(booleanAssignemntAspect);
				if (result == null) result = caseStatementAspect(booleanAssignemntAspect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinifsmPackage.EQUAL_ASPECT: {
				EqualAspect equalAspect = (EqualAspect)theEObject;
				T result = caseEqualAspect(equalAspect);
				if (result == null) result = caseIntComparisonAspect(equalAspect);
				if (result == null) result = caseBooleanExpressionAspect(equalAspect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinifsmPackage.GREATER_ASPECT: {
				GreaterAspect greaterAspect = (GreaterAspect)theEObject;
				T result = caseGreaterAspect(greaterAspect);
				if (result == null) result = caseIntComparisonAspect(greaterAspect);
				if (result == null) result = caseBooleanExpressionAspect(greaterAspect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinifsmPackage.BOOLEAN_ASPECT: {
				BooleanAspect booleanAspect = (BooleanAspect)theEObject;
				T result = caseBooleanAspect(booleanAspect);
				if (result == null) result = caseBooleanExpressionAspect(booleanAspect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinifsmPackage.MINUS_ASPECT: {
				MinusAspect minusAspect = (MinusAspect)theEObject;
				T result = caseMinusAspect(minusAspect);
				if (result == null) result = caseIntOperationAspect(minusAspect);
				if (result == null) result = caseIntExpressionAspect(minusAspect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinifsmPackage.NOT_ASPECT: {
				NotAspect notAspect = (NotAspect)theEObject;
				T result = caseNotAspect(notAspect);
				if (result == null) result = caseBooleanExpressionAspect(notAspect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinifsmPackage.DIVIDE_ASPECT: {
				DivideAspect divideAspect = (DivideAspect)theEObject;
				T result = caseDivideAspect(divideAspect);
				if (result == null) result = caseIntOperationAspect(divideAspect);
				if (result == null) result = caseIntExpressionAspect(divideAspect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinifsmPackage.MULTIPLY_ASPECT: {
				MultiplyAspect multiplyAspect = (MultiplyAspect)theEObject;
				T result = caseMultiplyAspect(multiplyAspect);
				if (result == null) result = caseIntOperationAspect(multiplyAspect);
				if (result == null) result = caseIntExpressionAspect(multiplyAspect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinifsmPackage.LESS_OR_EQUAL_ASPECT: {
				LessOrEqualAspect lessOrEqualAspect = (LessOrEqualAspect)theEObject;
				T result = caseLessOrEqualAspect(lessOrEqualAspect);
				if (result == null) result = caseIntComparisonAspect(lessOrEqualAspect);
				if (result == null) result = caseBooleanExpressionAspect(lessOrEqualAspect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinifsmPackage.GREATER_OR_EQUAL_ASPECT: {
				GreaterOrEqualAspect greaterOrEqualAspect = (GreaterOrEqualAspect)theEObject;
				T result = caseGreaterOrEqualAspect(greaterOrEqualAspect);
				if (result == null) result = caseIntComparisonAspect(greaterOrEqualAspect);
				if (result == null) result = caseBooleanExpressionAspect(greaterOrEqualAspect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinifsmPackage.WHILE_ASPECT: {
				WhileAspect whileAspect = (WhileAspect)theEObject;
				T result = caseWhileAspect(whileAspect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinifsmPackage.BOOLEAN_OPERATION_ASPECT: {
				BooleanOperationAspect booleanOperationAspect = (BooleanOperationAspect)theEObject;
				T result = caseBooleanOperationAspect(booleanOperationAspect);
				if (result == null) result = caseBooleanExpressionAspect(booleanOperationAspect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinifsmPackage.AND_ASPECT: {
				AndAspect andAspect = (AndAspect)theEObject;
				T result = caseAndAspect(andAspect);
				if (result == null) result = caseBooleanOperationAspect(andAspect);
				if (result == null) result = caseBooleanExpressionAspect(andAspect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinifsmPackage.OR_ASPECT: {
				OrAspect orAspect = (OrAspect)theEObject;
				T result = caseOrAspect(orAspect);
				if (result == null) result = caseBooleanOperationAspect(orAspect);
				if (result == null) result = caseBooleanExpressionAspect(orAspect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FSM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FSM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFSM(FSM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseState(State object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Final State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Final State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFinalState(FinalState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransition(Transition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCondition(Condition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContext(Context object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Var</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Var</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerVar(IntegerVar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Var</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Var</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanVar(BooleanVar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteger(fr.inria.diverse.melanger.melangedlangmt.minifsm.Integer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Int Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Int Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntExpression(IntExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolean(fr.inria.diverse.melanger.melangedlangmt.minifsm.Boolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanExpression(BooleanExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEqual(Equal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Int Comparison</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Int Comparison</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntComparison(IntComparison object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Greater</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Greater</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGreater(Greater object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Greater Or Equal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Greater Or Equal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGreaterOrEqual(GreaterOrEqual object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Less</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Less</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLess(Less object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Less Or Equal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Less Or Equal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLessOrEqual(LessOrEqual object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNot(Not object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOr(Or object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanOperation(BooleanOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnd(And object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlus(Plus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Int Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Int Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntOperation(IntOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Minus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Minus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMinus(Minus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiply</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiply</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiply(Multiply object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Divide</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Divide</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDivide(Divide object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Variable Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Variable Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanVariableRef(BooleanVariableRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableRef(VariableRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Int Variable Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Int Variable Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntVariableRef(IntVariableRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Int Expression Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Int Expression Aspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntExpressionAspect(IntExpressionAspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Aspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerAspect(IntegerAspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Ref Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Ref Aspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableRefAspect(VariableRefAspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Int Variable Ref Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Int Variable Ref Aspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntVariableRefAspect(IntVariableRefAspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Int Comparison Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Int Comparison Aspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntComparisonAspect(IntComparisonAspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Less Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Less Aspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLessAspect(LessAspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement Aspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatementAspect(StatementAspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Int Assignement Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Int Assignement Aspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntAssignementAspect(IntAssignementAspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If Aspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIfAspect(IfAspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Expression Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Expression Aspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanExpressionAspect(BooleanExpressionAspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Variable Ref Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Variable Ref Aspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanVariableRefAspect(BooleanVariableRefAspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block Aspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlockAspect(BlockAspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Int Operation Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Int Operation Aspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntOperationAspect(IntOperationAspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plus Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plus Aspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlusAspect(PlusAspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Assignemnt Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Assignemnt Aspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanAssignemntAspect(BooleanAssignemntAspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equal Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equal Aspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEqualAspect(EqualAspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Greater Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Greater Aspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGreaterAspect(GreaterAspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Aspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanAspect(BooleanAspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Minus Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Minus Aspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMinusAspect(MinusAspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not Aspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotAspect(NotAspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Divide Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Divide Aspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDivideAspect(DivideAspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiply Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiply Aspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiplyAspect(MultiplyAspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Less Or Equal Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Less Or Equal Aspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLessOrEqualAspect(LessOrEqualAspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Greater Or Equal Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Greater Or Equal Aspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGreaterOrEqualAspect(GreaterOrEqualAspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>While Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>While Aspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhileAspect(WhileAspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Operation Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Operation Aspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanOperationAspect(BooleanOperationAspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And Aspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAndAspect(AndAspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or Aspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrAspect(OrAspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //MinifsmSwitch
