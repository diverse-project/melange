/**
 */
package fr.inria.diverse.melanger.miniactionlangmt.minilang.util;

import fr.inria.diverse.melanger.miniactionlangmt.minilang.And;
import fr.inria.diverse.melanger.miniactionlangmt.minilang.Block;
import fr.inria.diverse.melanger.miniactionlangmt.minilang.BooleanAssignment;
import fr.inria.diverse.melanger.miniactionlangmt.minilang.BooleanExpression;
import fr.inria.diverse.melanger.miniactionlangmt.minilang.BooleanOperation;
import fr.inria.diverse.melanger.miniactionlangmt.minilang.BooleanVar;
import fr.inria.diverse.melanger.miniactionlangmt.minilang.BooleanVariableRef;
import fr.inria.diverse.melanger.miniactionlangmt.minilang.Context;
import fr.inria.diverse.melanger.miniactionlangmt.minilang.Divide;
import fr.inria.diverse.melanger.miniactionlangmt.minilang.Equal;
import fr.inria.diverse.melanger.miniactionlangmt.minilang.Greater;
import fr.inria.diverse.melanger.miniactionlangmt.minilang.GreaterOrEqual;
import fr.inria.diverse.melanger.miniactionlangmt.minilang.If;
import fr.inria.diverse.melanger.miniactionlangmt.minilang.IntAssignment;
import fr.inria.diverse.melanger.miniactionlangmt.minilang.IntComparison;
import fr.inria.diverse.melanger.miniactionlangmt.minilang.IntExpression;
import fr.inria.diverse.melanger.miniactionlangmt.minilang.IntOperation;
import fr.inria.diverse.melanger.miniactionlangmt.minilang.IntVariableRef;
import fr.inria.diverse.melanger.miniactionlangmt.minilang.IntegerVar;
import fr.inria.diverse.melanger.miniactionlangmt.minilang.Less;
import fr.inria.diverse.melanger.miniactionlangmt.minilang.LessOrEqual;
import fr.inria.diverse.melanger.miniactionlangmt.minilang.MinilangPackage;
import fr.inria.diverse.melanger.miniactionlangmt.minilang.Minus;
import fr.inria.diverse.melanger.miniactionlangmt.minilang.Multiply;
import fr.inria.diverse.melanger.miniactionlangmt.minilang.Not;
import fr.inria.diverse.melanger.miniactionlangmt.minilang.Or;
import fr.inria.diverse.melanger.miniactionlangmt.minilang.Plus;
import fr.inria.diverse.melanger.miniactionlangmt.minilang.PrintStr;
import fr.inria.diverse.melanger.miniactionlangmt.minilang.PrintVar;
import fr.inria.diverse.melanger.miniactionlangmt.minilang.Statement;
import fr.inria.diverse.melanger.miniactionlangmt.minilang.Variable;
import fr.inria.diverse.melanger.miniactionlangmt.minilang.VariableRef;
import fr.inria.diverse.melanger.miniactionlangmt.minilang.While;

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
 * @see fr.inria.diverse.melanger.miniactionlangmt.minilang.MinilangPackage
 * @generated
 */
public class MinilangSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MinilangPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MinilangSwitch() {
		if (modelPackage == null) {
			modelPackage = MinilangPackage.eINSTANCE;
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
			case MinilangPackage.INT_EXPRESSION: {
				IntExpression intExpression = (IntExpression)theEObject;
				T result = caseIntExpression(intExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinilangPackage.INTEGER: {
				fr.inria.diverse.melanger.miniactionlangmt.minilang.Integer integer = (fr.inria.diverse.melanger.miniactionlangmt.minilang.Integer)theEObject;
				T result = caseInteger(integer);
				if (result == null) result = caseIntExpression(integer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinilangPackage.BOOLEAN: {
				fr.inria.diverse.melanger.miniactionlangmt.minilang.Boolean boolean_ = (fr.inria.diverse.melanger.miniactionlangmt.minilang.Boolean)theEObject;
				T result = caseBoolean(boolean_);
				if (result == null) result = caseBooleanExpression(boolean_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinilangPackage.INT_OPERATION: {
				IntOperation intOperation = (IntOperation)theEObject;
				T result = caseIntOperation(intOperation);
				if (result == null) result = caseIntExpression(intOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinilangPackage.EQUAL: {
				Equal equal = (Equal)theEObject;
				T result = caseEqual(equal);
				if (result == null) result = caseIntComparison(equal);
				if (result == null) result = caseBooleanExpression(equal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinilangPackage.GREATER: {
				Greater greater = (Greater)theEObject;
				T result = caseGreater(greater);
				if (result == null) result = caseIntComparison(greater);
				if (result == null) result = caseBooleanExpression(greater);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinilangPackage.GREATER_OR_EQUAL: {
				GreaterOrEqual greaterOrEqual = (GreaterOrEqual)theEObject;
				T result = caseGreaterOrEqual(greaterOrEqual);
				if (result == null) result = caseIntComparison(greaterOrEqual);
				if (result == null) result = caseBooleanExpression(greaterOrEqual);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinilangPackage.LESS: {
				Less less = (Less)theEObject;
				T result = caseLess(less);
				if (result == null) result = caseIntComparison(less);
				if (result == null) result = caseBooleanExpression(less);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinilangPackage.LESS_OR_EQUAL: {
				LessOrEqual lessOrEqual = (LessOrEqual)theEObject;
				T result = caseLessOrEqual(lessOrEqual);
				if (result == null) result = caseIntComparison(lessOrEqual);
				if (result == null) result = caseBooleanExpression(lessOrEqual);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinilangPackage.NOT: {
				Not not = (Not)theEObject;
				T result = caseNot(not);
				if (result == null) result = caseBooleanExpression(not);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinilangPackage.OR: {
				Or or = (Or)theEObject;
				T result = caseOr(or);
				if (result == null) result = caseBooleanOperation(or);
				if (result == null) result = caseBooleanExpression(or);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinilangPackage.AND: {
				And and = (And)theEObject;
				T result = caseAnd(and);
				if (result == null) result = caseBooleanOperation(and);
				if (result == null) result = caseBooleanExpression(and);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinilangPackage.PLUS: {
				Plus plus = (Plus)theEObject;
				T result = casePlus(plus);
				if (result == null) result = caseIntOperation(plus);
				if (result == null) result = caseIntExpression(plus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinilangPackage.MINUS: {
				Minus minus = (Minus)theEObject;
				T result = caseMinus(minus);
				if (result == null) result = caseIntOperation(minus);
				if (result == null) result = caseIntExpression(minus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinilangPackage.MULTIPLY: {
				Multiply multiply = (Multiply)theEObject;
				T result = caseMultiply(multiply);
				if (result == null) result = caseIntOperation(multiply);
				if (result == null) result = caseIntExpression(multiply);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinilangPackage.DIVIDE: {
				Divide divide = (Divide)theEObject;
				T result = caseDivide(divide);
				if (result == null) result = caseIntOperation(divide);
				if (result == null) result = caseIntExpression(divide);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinilangPackage.INT_COMPARISON: {
				IntComparison intComparison = (IntComparison)theEObject;
				T result = caseIntComparison(intComparison);
				if (result == null) result = caseBooleanExpression(intComparison);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinilangPackage.BOOLEAN_EXPRESSION: {
				BooleanExpression booleanExpression = (BooleanExpression)theEObject;
				T result = caseBooleanExpression(booleanExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinilangPackage.BOOLEAN_OPERATION: {
				BooleanOperation booleanOperation = (BooleanOperation)theEObject;
				T result = caseBooleanOperation(booleanOperation);
				if (result == null) result = caseBooleanExpression(booleanOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinilangPackage.BOOLEAN_VARIABLE_REF: {
				BooleanVariableRef booleanVariableRef = (BooleanVariableRef)theEObject;
				T result = caseBooleanVariableRef(booleanVariableRef);
				if (result == null) result = caseVariableRef(booleanVariableRef);
				if (result == null) result = caseBooleanExpression(booleanVariableRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinilangPackage.INT_VARIABLE_REF: {
				IntVariableRef intVariableRef = (IntVariableRef)theEObject;
				T result = caseIntVariableRef(intVariableRef);
				if (result == null) result = caseVariableRef(intVariableRef);
				if (result == null) result = caseIntExpression(intVariableRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinilangPackage.VARIABLE_REF: {
				VariableRef variableRef = (VariableRef)theEObject;
				T result = caseVariableRef(variableRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinilangPackage.STATEMENT: {
				Statement statement = (Statement)theEObject;
				T result = caseStatement(statement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinilangPackage.BOOLEAN_ASSIGNMENT: {
				BooleanAssignment booleanAssignment = (BooleanAssignment)theEObject;
				T result = caseBooleanAssignment(booleanAssignment);
				if (result == null) result = caseStatement(booleanAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinilangPackage.INT_ASSIGNMENT: {
				IntAssignment intAssignment = (IntAssignment)theEObject;
				T result = caseIntAssignment(intAssignment);
				if (result == null) result = caseStatement(intAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinilangPackage.PRINT_VAR: {
				PrintVar printVar = (PrintVar)theEObject;
				T result = casePrintVar(printVar);
				if (result == null) result = caseStatement(printVar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinilangPackage.PRINT_STR: {
				PrintStr printStr = (PrintStr)theEObject;
				T result = casePrintStr(printStr);
				if (result == null) result = caseStatement(printStr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinilangPackage.BLOCK: {
				Block block = (Block)theEObject;
				T result = caseBlock(block);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinilangPackage.IF: {
				If if_ = (If)theEObject;
				T result = caseIf(if_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinilangPackage.WHILE: {
				While while_ = (While)theEObject;
				T result = caseWhile(while_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinilangPackage.CONTEXT: {
				Context context = (Context)theEObject;
				T result = caseContext(context);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinilangPackage.VARIABLE: {
				Variable variable = (Variable)theEObject;
				T result = caseVariable(variable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinilangPackage.INTEGER_VAR: {
				IntegerVar integerVar = (IntegerVar)theEObject;
				T result = caseIntegerVar(integerVar);
				if (result == null) result = caseVariable(integerVar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MinilangPackage.BOOLEAN_VAR: {
				BooleanVar booleanVar = (BooleanVar)theEObject;
				T result = caseBooleanVar(booleanVar);
				if (result == null) result = caseVariable(booleanVar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	public T caseInteger(fr.inria.diverse.melanger.miniactionlangmt.minilang.Integer object) {
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
	public T caseBoolean(fr.inria.diverse.melanger.miniactionlangmt.minilang.Boolean object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatement(Statement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanAssignment(BooleanAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Int Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Int Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntAssignment(IntAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Print Var</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Print Var</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrintVar(PrintVar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Print Str</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Print Str</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrintStr(PrintStr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlock(Block object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIf(If object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>While</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>While</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhile(While object) {
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

} //MinilangSwitch
