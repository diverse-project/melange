/**
 */
package fr.inria.diverse.iot2.iot2.iot2.util;

import fr.inria.diverse.iot2.iot2.iot2.Action;
import fr.inria.diverse.iot2.iot2.iot2.Activity;
import fr.inria.diverse.iot2.iot2.iot2.ActivityEdge;
import fr.inria.diverse.iot2.iot2.iot2.ActivityFinalNode;
import fr.inria.diverse.iot2.iot2.iot2.ActivityNode;
import fr.inria.diverse.iot2.iot2.iot2.Actuator;
import fr.inria.diverse.iot2.iot2.iot2.Block;
import fr.inria.diverse.iot2.iot2.iot2.Board;
import fr.inria.diverse.iot2.iot2.iot2.BooleanBinaryExpression;
import fr.inria.diverse.iot2.iot2.iot2.BooleanExpression;
import fr.inria.diverse.iot2.iot2.iot2.BooleanUnaryExpression;
import fr.inria.diverse.iot2.iot2.iot2.BooleanValue;
import fr.inria.diverse.iot2.iot2.iot2.BooleanVariable;
import fr.inria.diverse.iot2.iot2.iot2.Chunk;
import fr.inria.diverse.iot2.iot2.iot2.Contained;
import fr.inria.diverse.iot2.iot2.iot2.Container;
import fr.inria.diverse.iot2.iot2.iot2.ControlFlow;
import fr.inria.diverse.iot2.iot2.iot2.ControlNode;
import fr.inria.diverse.iot2.iot2.iot2.DecisionNode;
import fr.inria.diverse.iot2.iot2.iot2.ExceptionDef;
import fr.inria.diverse.iot2.iot2.iot2.ExecutableNode;
import fr.inria.diverse.iot2.iot2.iot2.Expression;
import fr.inria.diverse.iot2.iot2.iot2.Expression_AccessArray;
import fr.inria.diverse.iot2.iot2.iot2.Expression_AccessMember;
import fr.inria.diverse.iot2.iot2.iot2.Expression_And;
import fr.inria.diverse.iot2.iot2.iot2.Expression_CallFunction;
import fr.inria.diverse.iot2.iot2.iot2.Expression_CallMemberFunction;
import fr.inria.diverse.iot2.iot2.iot2.Expression_Concatenation;
import fr.inria.diverse.iot2.iot2.iot2.Expression_Division;
import fr.inria.diverse.iot2.iot2.iot2.Expression_Equal;
import fr.inria.diverse.iot2.iot2.iot2.Expression_Exponentiation;
import fr.inria.diverse.iot2.iot2.iot2.Expression_False;
import fr.inria.diverse.iot2.iot2.iot2.Expression_Function;
import fr.inria.diverse.iot2.iot2.iot2.Expression_Invert;
import fr.inria.diverse.iot2.iot2.iot2.Expression_Larger;
import fr.inria.diverse.iot2.iot2.iot2.Expression_Larger_Equal;
import fr.inria.diverse.iot2.iot2.iot2.Expression_Length;
import fr.inria.diverse.iot2.iot2.iot2.Expression_Minus;
import fr.inria.diverse.iot2.iot2.iot2.Expression_Modulo;
import fr.inria.diverse.iot2.iot2.iot2.Expression_Multiplication;
import fr.inria.diverse.iot2.iot2.iot2.Expression_Negate;
import fr.inria.diverse.iot2.iot2.iot2.Expression_Nil;
import fr.inria.diverse.iot2.iot2.iot2.Expression_Not_Equal;
import fr.inria.diverse.iot2.iot2.iot2.Expression_Number;
import fr.inria.diverse.iot2.iot2.iot2.Expression_Or;
import fr.inria.diverse.iot2.iot2.iot2.Expression_Plus;
import fr.inria.diverse.iot2.iot2.iot2.Expression_Smaller;
import fr.inria.diverse.iot2.iot2.iot2.Expression_Smaller_Equal;
import fr.inria.diverse.iot2.iot2.iot2.Expression_String;
import fr.inria.diverse.iot2.iot2.iot2.Expression_TableConstructor;
import fr.inria.diverse.iot2.iot2.iot2.Expression_True;
import fr.inria.diverse.iot2.iot2.iot2.Expression_VarArgs;
import fr.inria.diverse.iot2.iot2.iot2.Expression_VariableName;
import fr.inria.diverse.iot2.iot2.iot2.Field;
import fr.inria.diverse.iot2.iot2.iot2.Field_AddEntryToTable;
import fr.inria.diverse.iot2.iot2.iot2.Field_AddEntryToTable_Brackets;
import fr.inria.diverse.iot2.iot2.iot2.Field_AppendEntryToTable;
import fr.inria.diverse.iot2.iot2.iot2.FinalNode;
import fr.inria.diverse.iot2.iot2.iot2.ForkNode;
import fr.inria.diverse.iot2.iot2.iot2.Function;
import fr.inria.diverse.iot2.iot2.iot2.Functioncall_Arguments;
import fr.inria.diverse.iot2.iot2.iot2.HWComponent;
import fr.inria.diverse.iot2.iot2.iot2.IDLType;
import fr.inria.diverse.iot2.iot2.iot2.InitialNode;
import fr.inria.diverse.iot2.iot2.iot2.Input;
import fr.inria.diverse.iot2.iot2.iot2.InputValue;
import fr.inria.diverse.iot2.iot2.iot2.IntegerCalculationExpression;
import fr.inria.diverse.iot2.iot2.iot2.IntegerComparisonExpression;
import fr.inria.diverse.iot2.iot2.iot2.IntegerExpression;
import fr.inria.diverse.iot2.iot2.iot2.IntegerValue;
import fr.inria.diverse.iot2.iot2.iot2.IntegerVariable;
import fr.inria.diverse.iot2.iot2.iot2.Iot2Package;
import fr.inria.diverse.iot2.iot2.iot2.JoinNode;
import fr.inria.diverse.iot2.iot2.iot2.LastStatement;
import fr.inria.diverse.iot2.iot2.iot2.LastStatement_Break;
import fr.inria.diverse.iot2.iot2.iot2.LastStatement_Return;
import fr.inria.diverse.iot2.iot2.iot2.LastStatement_ReturnWithValue;
import fr.inria.diverse.iot2.iot2.iot2.MergeNode;
import fr.inria.diverse.iot2.iot2.iot2.NamedElement;
import fr.inria.diverse.iot2.iot2.iot2.OpaqueAction;
import fr.inria.diverse.iot2.iot2.iot2.OperationDef;
import fr.inria.diverse.iot2.iot2.iot2.ParameterDef;
import fr.inria.diverse.iot2.iot2.iot2.PrimitiveDef;
import fr.inria.diverse.iot2.iot2.iot2.Sensor;
import fr.inria.diverse.iot2.iot2.iot2.Sketch;
import fr.inria.diverse.iot2.iot2.iot2.Statement;
import fr.inria.diverse.iot2.iot2.iot2.Statement_Assignment;
import fr.inria.diverse.iot2.iot2.iot2.Statement_Block;
import fr.inria.diverse.iot2.iot2.iot2.Statement_CallFunction;
import fr.inria.diverse.iot2.iot2.iot2.Statement_CallMemberFunction;
import fr.inria.diverse.iot2.iot2.iot2.Statement_For_Generic;
import fr.inria.diverse.iot2.iot2.iot2.Statement_For_Numeric;
import fr.inria.diverse.iot2.iot2.iot2.Statement_FunctioncallOrAssignment;
import fr.inria.diverse.iot2.iot2.iot2.Statement_GlobalFunction_Declaration;
import fr.inria.diverse.iot2.iot2.iot2.Statement_If_Then_Else;
import fr.inria.diverse.iot2.iot2.iot2.Statement_If_Then_Else_ElseIfPart;
import fr.inria.diverse.iot2.iot2.iot2.Statement_LocalFunction_Declaration;
import fr.inria.diverse.iot2.iot2.iot2.Statement_Local_Variable_Declaration;
import fr.inria.diverse.iot2.iot2.iot2.Statement_Repeat;
import fr.inria.diverse.iot2.iot2.iot2.Statement_While;
import fr.inria.diverse.iot2.iot2.iot2.Token;
import fr.inria.diverse.iot2.iot2.iot2.Trace;
import fr.inria.diverse.iot2.iot2.iot2.Typed;
import fr.inria.diverse.iot2.iot2.iot2.TypedefDef;
import fr.inria.diverse.iot2.iot2.iot2.Value;
import fr.inria.diverse.iot2.iot2.iot2.Variable;

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
 * @see fr.inria.diverse.iot2.iot2.iot2.Iot2Package
 * @generated
 */
public class Iot2Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Iot2Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Iot2Switch() {
		if (modelPackage == null) {
			modelPackage = Iot2Package.eINSTANCE;
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
			case Iot2Package.SYSTEM: {
				fr.inria.diverse.iot2.iot2.iot2.System system = (fr.inria.diverse.iot2.iot2.iot2.System)theEObject;
				T result = caseSystem(system);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.BOARD: {
				Board board = (Board)theEObject;
				T result = caseBoard(board);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.SKETCH: {
				Sketch sketch = (Sketch)theEObject;
				T result = caseSketch(sketch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.HW_COMPONENT: {
				HWComponent hwComponent = (HWComponent)theEObject;
				T result = caseHWComponent(hwComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.SENSOR: {
				Sensor sensor = (Sensor)theEObject;
				T result = caseSensor(sensor);
				if (result == null) result = caseHWComponent(sensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.ACTUATOR: {
				Actuator actuator = (Actuator)theEObject;
				T result = caseActuator(actuator);
				if (result == null) result = caseHWComponent(actuator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.ACTIVITY: {
				Activity activity = (Activity)theEObject;
				T result = caseActivity(activity);
				if (result == null) result = caseNamedElement(activity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.OPERATION_DEF: {
				OperationDef operationDef = (OperationDef)theEObject;
				T result = caseOperationDef(operationDef);
				if (result == null) result = caseContained(operationDef);
				if (result == null) result = caseTyped(operationDef);
				if (result == null) result = caseNamedElement(operationDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.CONTAINED: {
				Contained contained = (Contained)theEObject;
				T result = caseContained(contained);
				if (result == null) result = caseNamedElement(contained);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.CONTAINER: {
				Container container = (Container)theEObject;
				T result = caseContainer(container);
				if (result == null) result = caseContained(container);
				if (result == null) result = caseNamedElement(container);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.TYPED: {
				Typed typed = (Typed)theEObject;
				T result = caseTyped(typed);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.IDL_TYPE: {
				IDLType idlType = (IDLType)theEObject;
				T result = caseIDLType(idlType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.TYPEDEF_DEF: {
				TypedefDef typedefDef = (TypedefDef)theEObject;
				T result = caseTypedefDef(typedefDef);
				if (result == null) result = caseIDLType(typedefDef);
				if (result == null) result = caseContained(typedefDef);
				if (result == null) result = caseNamedElement(typedefDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.PARAMETER_DEF: {
				ParameterDef parameterDef = (ParameterDef)theEObject;
				T result = caseParameterDef(parameterDef);
				if (result == null) result = caseTyped(parameterDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.EXCEPTION_DEF: {
				ExceptionDef exceptionDef = (ExceptionDef)theEObject;
				T result = caseExceptionDef(exceptionDef);
				if (result == null) result = caseContained(exceptionDef);
				if (result == null) result = caseNamedElement(exceptionDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.FIELD: {
				Field field = (Field)theEObject;
				T result = caseField(field);
				if (result == null) result = caseTyped(field);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.PRIMITIVE_DEF: {
				PrimitiveDef primitiveDef = (PrimitiveDef)theEObject;
				T result = casePrimitiveDef(primitiveDef);
				if (result == null) result = caseIDLType(primitiveDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.CHUNK: {
				Chunk chunk = (Chunk)theEObject;
				T result = caseChunk(chunk);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.BLOCK: {
				Block block = (Block)theEObject;
				T result = caseBlock(block);
				if (result == null) result = caseChunk(block);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.LAST_STATEMENT: {
				LastStatement lastStatement = (LastStatement)theEObject;
				T result = caseLastStatement(lastStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.LAST_STATEMENT_RETURN: {
				LastStatement_Return lastStatement_Return = (LastStatement_Return)theEObject;
				T result = caseLastStatement_Return(lastStatement_Return);
				if (result == null) result = caseLastStatement(lastStatement_Return);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.LAST_STATEMENT_BREAK: {
				LastStatement_Break lastStatement_Break = (LastStatement_Break)theEObject;
				T result = caseLastStatement_Break(lastStatement_Break);
				if (result == null) result = caseLastStatement(lastStatement_Break);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.STATEMENT: {
				Statement statement = (Statement)theEObject;
				T result = caseStatement(statement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.STATEMENT_BLOCK: {
				Statement_Block statement_Block = (Statement_Block)theEObject;
				T result = caseStatement_Block(statement_Block);
				if (result == null) result = caseStatement(statement_Block);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.STATEMENT_WHILE: {
				Statement_While statement_While = (Statement_While)theEObject;
				T result = caseStatement_While(statement_While);
				if (result == null) result = caseStatement(statement_While);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.STATEMENT_REPEAT: {
				Statement_Repeat statement_Repeat = (Statement_Repeat)theEObject;
				T result = caseStatement_Repeat(statement_Repeat);
				if (result == null) result = caseStatement(statement_Repeat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.STATEMENT_IF_THEN_ELSE: {
				Statement_If_Then_Else statement_If_Then_Else = (Statement_If_Then_Else)theEObject;
				T result = caseStatement_If_Then_Else(statement_If_Then_Else);
				if (result == null) result = caseStatement(statement_If_Then_Else);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.STATEMENT_IF_THEN_ELSE_ELSE_IF_PART: {
				Statement_If_Then_Else_ElseIfPart statement_If_Then_Else_ElseIfPart = (Statement_If_Then_Else_ElseIfPart)theEObject;
				T result = caseStatement_If_Then_Else_ElseIfPart(statement_If_Then_Else_ElseIfPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.STATEMENT_FOR_NUMERIC: {
				Statement_For_Numeric statement_For_Numeric = (Statement_For_Numeric)theEObject;
				T result = caseStatement_For_Numeric(statement_For_Numeric);
				if (result == null) result = caseStatement(statement_For_Numeric);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.STATEMENT_FOR_GENERIC: {
				Statement_For_Generic statement_For_Generic = (Statement_For_Generic)theEObject;
				T result = caseStatement_For_Generic(statement_For_Generic);
				if (result == null) result = caseStatement(statement_For_Generic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.STATEMENT_GLOBAL_FUNCTION_DECLARATION: {
				Statement_GlobalFunction_Declaration statement_GlobalFunction_Declaration = (Statement_GlobalFunction_Declaration)theEObject;
				T result = caseStatement_GlobalFunction_Declaration(statement_GlobalFunction_Declaration);
				if (result == null) result = caseStatement(statement_GlobalFunction_Declaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.STATEMENT_LOCAL_FUNCTION_DECLARATION: {
				Statement_LocalFunction_Declaration statement_LocalFunction_Declaration = (Statement_LocalFunction_Declaration)theEObject;
				T result = caseStatement_LocalFunction_Declaration(statement_LocalFunction_Declaration);
				if (result == null) result = caseStatement(statement_LocalFunction_Declaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.STATEMENT_LOCAL_VARIABLE_DECLARATION: {
				Statement_Local_Variable_Declaration statement_Local_Variable_Declaration = (Statement_Local_Variable_Declaration)theEObject;
				T result = caseStatement_Local_Variable_Declaration(statement_Local_Variable_Declaration);
				if (result == null) result = caseStatement(statement_Local_Variable_Declaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.STATEMENT_FUNCTIONCALL_OR_ASSIGNMENT: {
				Statement_FunctioncallOrAssignment statement_FunctioncallOrAssignment = (Statement_FunctioncallOrAssignment)theEObject;
				T result = caseStatement_FunctioncallOrAssignment(statement_FunctioncallOrAssignment);
				if (result == null) result = caseStatement(statement_FunctioncallOrAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.EXPRESSION: {
				Expression expression = (Expression)theEObject;
				T result = caseExpression(expression);
				if (result == null) result = caseStatement_FunctioncallOrAssignment(expression);
				if (result == null) result = caseStatement(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.EXPRESSION_NIL: {
				Expression_Nil expression_Nil = (Expression_Nil)theEObject;
				T result = caseExpression_Nil(expression_Nil);
				if (result == null) result = caseExpression(expression_Nil);
				if (result == null) result = caseStatement_FunctioncallOrAssignment(expression_Nil);
				if (result == null) result = caseStatement(expression_Nil);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.EXPRESSION_TRUE: {
				Expression_True expression_True = (Expression_True)theEObject;
				T result = caseExpression_True(expression_True);
				if (result == null) result = caseExpression(expression_True);
				if (result == null) result = caseStatement_FunctioncallOrAssignment(expression_True);
				if (result == null) result = caseStatement(expression_True);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.EXPRESSION_FALSE: {
				Expression_False expression_False = (Expression_False)theEObject;
				T result = caseExpression_False(expression_False);
				if (result == null) result = caseExpression(expression_False);
				if (result == null) result = caseStatement_FunctioncallOrAssignment(expression_False);
				if (result == null) result = caseStatement(expression_False);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.EXPRESSION_NUMBER: {
				Expression_Number expression_Number = (Expression_Number)theEObject;
				T result = caseExpression_Number(expression_Number);
				if (result == null) result = caseExpression(expression_Number);
				if (result == null) result = caseStatement_FunctioncallOrAssignment(expression_Number);
				if (result == null) result = caseStatement(expression_Number);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.EXPRESSION_VAR_ARGS: {
				Expression_VarArgs expression_VarArgs = (Expression_VarArgs)theEObject;
				T result = caseExpression_VarArgs(expression_VarArgs);
				if (result == null) result = caseExpression(expression_VarArgs);
				if (result == null) result = caseStatement_FunctioncallOrAssignment(expression_VarArgs);
				if (result == null) result = caseStatement(expression_VarArgs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.EXPRESSION_STRING: {
				Expression_String expression_String = (Expression_String)theEObject;
				T result = caseExpression_String(expression_String);
				if (result == null) result = caseExpression(expression_String);
				if (result == null) result = caseStatement_FunctioncallOrAssignment(expression_String);
				if (result == null) result = caseStatement(expression_String);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.EXPRESSION_FUNCTION: {
				Expression_Function expression_Function = (Expression_Function)theEObject;
				T result = caseExpression_Function(expression_Function);
				if (result == null) result = caseExpression(expression_Function);
				if (result == null) result = caseStatement_FunctioncallOrAssignment(expression_Function);
				if (result == null) result = caseStatement(expression_Function);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.EXPRESSION_TABLE_CONSTRUCTOR: {
				Expression_TableConstructor expression_TableConstructor = (Expression_TableConstructor)theEObject;
				T result = caseExpression_TableConstructor(expression_TableConstructor);
				if (result == null) result = caseExpression(expression_TableConstructor);
				if (result == null) result = caseStatement_FunctioncallOrAssignment(expression_TableConstructor);
				if (result == null) result = caseStatement(expression_TableConstructor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.FUNCTION: {
				Function function = (Function)theEObject;
				T result = caseFunction(function);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.FUNCTIONCALL_ARGUMENTS: {
				Functioncall_Arguments functioncall_Arguments = (Functioncall_Arguments)theEObject;
				T result = caseFunctioncall_Arguments(functioncall_Arguments);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.FIELD_ADD_ENTRY_TO_TABLE_BRACKETS: {
				Field_AddEntryToTable_Brackets field_AddEntryToTable_Brackets = (Field_AddEntryToTable_Brackets)theEObject;
				T result = caseField_AddEntryToTable_Brackets(field_AddEntryToTable_Brackets);
				if (result == null) result = caseField(field_AddEntryToTable_Brackets);
				if (result == null) result = caseTyped(field_AddEntryToTable_Brackets);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.FIELD_ADD_ENTRY_TO_TABLE: {
				Field_AddEntryToTable field_AddEntryToTable = (Field_AddEntryToTable)theEObject;
				T result = caseField_AddEntryToTable(field_AddEntryToTable);
				if (result == null) result = caseField(field_AddEntryToTable);
				if (result == null) result = caseTyped(field_AddEntryToTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.FIELD_APPEND_ENTRY_TO_TABLE: {
				Field_AppendEntryToTable field_AppendEntryToTable = (Field_AppendEntryToTable)theEObject;
				T result = caseField_AppendEntryToTable(field_AppendEntryToTable);
				if (result == null) result = caseField(field_AppendEntryToTable);
				if (result == null) result = caseTyped(field_AppendEntryToTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.LAST_STATEMENT_RETURN_WITH_VALUE: {
				LastStatement_ReturnWithValue lastStatement_ReturnWithValue = (LastStatement_ReturnWithValue)theEObject;
				T result = caseLastStatement_ReturnWithValue(lastStatement_ReturnWithValue);
				if (result == null) result = caseLastStatement_Return(lastStatement_ReturnWithValue);
				if (result == null) result = caseLastStatement(lastStatement_ReturnWithValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.STATEMENT_ASSIGNMENT: {
				Statement_Assignment statement_Assignment = (Statement_Assignment)theEObject;
				T result = caseStatement_Assignment(statement_Assignment);
				if (result == null) result = caseStatement_FunctioncallOrAssignment(statement_Assignment);
				if (result == null) result = caseStatement(statement_Assignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.STATEMENT_CALL_MEMBER_FUNCTION: {
				Statement_CallMemberFunction statement_CallMemberFunction = (Statement_CallMemberFunction)theEObject;
				T result = caseStatement_CallMemberFunction(statement_CallMemberFunction);
				if (result == null) result = caseStatement_FunctioncallOrAssignment(statement_CallMemberFunction);
				if (result == null) result = caseStatement(statement_CallMemberFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.STATEMENT_CALL_FUNCTION: {
				Statement_CallFunction statement_CallFunction = (Statement_CallFunction)theEObject;
				T result = caseStatement_CallFunction(statement_CallFunction);
				if (result == null) result = caseStatement_FunctioncallOrAssignment(statement_CallFunction);
				if (result == null) result = caseStatement(statement_CallFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.EXPRESSION_OR: {
				Expression_Or expression_Or = (Expression_Or)theEObject;
				T result = caseExpression_Or(expression_Or);
				if (result == null) result = caseExpression(expression_Or);
				if (result == null) result = caseStatement_FunctioncallOrAssignment(expression_Or);
				if (result == null) result = caseStatement(expression_Or);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.EXPRESSION_AND: {
				Expression_And expression_And = (Expression_And)theEObject;
				T result = caseExpression_And(expression_And);
				if (result == null) result = caseExpression(expression_And);
				if (result == null) result = caseStatement_FunctioncallOrAssignment(expression_And);
				if (result == null) result = caseStatement(expression_And);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.EXPRESSION_LARGER: {
				Expression_Larger expression_Larger = (Expression_Larger)theEObject;
				T result = caseExpression_Larger(expression_Larger);
				if (result == null) result = caseExpression(expression_Larger);
				if (result == null) result = caseStatement_FunctioncallOrAssignment(expression_Larger);
				if (result == null) result = caseStatement(expression_Larger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.EXPRESSION_LARGER_EQUAL: {
				Expression_Larger_Equal expression_Larger_Equal = (Expression_Larger_Equal)theEObject;
				T result = caseExpression_Larger_Equal(expression_Larger_Equal);
				if (result == null) result = caseExpression(expression_Larger_Equal);
				if (result == null) result = caseStatement_FunctioncallOrAssignment(expression_Larger_Equal);
				if (result == null) result = caseStatement(expression_Larger_Equal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.EXPRESSION_SMALLER: {
				Expression_Smaller expression_Smaller = (Expression_Smaller)theEObject;
				T result = caseExpression_Smaller(expression_Smaller);
				if (result == null) result = caseExpression(expression_Smaller);
				if (result == null) result = caseStatement_FunctioncallOrAssignment(expression_Smaller);
				if (result == null) result = caseStatement(expression_Smaller);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.EXPRESSION_SMALLER_EQUAL: {
				Expression_Smaller_Equal expression_Smaller_Equal = (Expression_Smaller_Equal)theEObject;
				T result = caseExpression_Smaller_Equal(expression_Smaller_Equal);
				if (result == null) result = caseExpression(expression_Smaller_Equal);
				if (result == null) result = caseStatement_FunctioncallOrAssignment(expression_Smaller_Equal);
				if (result == null) result = caseStatement(expression_Smaller_Equal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.EXPRESSION_EQUAL: {
				Expression_Equal expression_Equal = (Expression_Equal)theEObject;
				T result = caseExpression_Equal(expression_Equal);
				if (result == null) result = caseExpression(expression_Equal);
				if (result == null) result = caseStatement_FunctioncallOrAssignment(expression_Equal);
				if (result == null) result = caseStatement(expression_Equal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.EXPRESSION_NOT_EQUAL: {
				Expression_Not_Equal expression_Not_Equal = (Expression_Not_Equal)theEObject;
				T result = caseExpression_Not_Equal(expression_Not_Equal);
				if (result == null) result = caseExpression(expression_Not_Equal);
				if (result == null) result = caseStatement_FunctioncallOrAssignment(expression_Not_Equal);
				if (result == null) result = caseStatement(expression_Not_Equal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.EXPRESSION_CONCATENATION: {
				Expression_Concatenation expression_Concatenation = (Expression_Concatenation)theEObject;
				T result = caseExpression_Concatenation(expression_Concatenation);
				if (result == null) result = caseExpression(expression_Concatenation);
				if (result == null) result = caseStatement_FunctioncallOrAssignment(expression_Concatenation);
				if (result == null) result = caseStatement(expression_Concatenation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.EXPRESSION_PLUS: {
				Expression_Plus expression_Plus = (Expression_Plus)theEObject;
				T result = caseExpression_Plus(expression_Plus);
				if (result == null) result = caseExpression(expression_Plus);
				if (result == null) result = caseStatement_FunctioncallOrAssignment(expression_Plus);
				if (result == null) result = caseStatement(expression_Plus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.EXPRESSION_MINUS: {
				Expression_Minus expression_Minus = (Expression_Minus)theEObject;
				T result = caseExpression_Minus(expression_Minus);
				if (result == null) result = caseExpression(expression_Minus);
				if (result == null) result = caseStatement_FunctioncallOrAssignment(expression_Minus);
				if (result == null) result = caseStatement(expression_Minus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.EXPRESSION_MULTIPLICATION: {
				Expression_Multiplication expression_Multiplication = (Expression_Multiplication)theEObject;
				T result = caseExpression_Multiplication(expression_Multiplication);
				if (result == null) result = caseExpression(expression_Multiplication);
				if (result == null) result = caseStatement_FunctioncallOrAssignment(expression_Multiplication);
				if (result == null) result = caseStatement(expression_Multiplication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.EXPRESSION_DIVISION: {
				Expression_Division expression_Division = (Expression_Division)theEObject;
				T result = caseExpression_Division(expression_Division);
				if (result == null) result = caseExpression(expression_Division);
				if (result == null) result = caseStatement_FunctioncallOrAssignment(expression_Division);
				if (result == null) result = caseStatement(expression_Division);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.EXPRESSION_MODULO: {
				Expression_Modulo expression_Modulo = (Expression_Modulo)theEObject;
				T result = caseExpression_Modulo(expression_Modulo);
				if (result == null) result = caseExpression(expression_Modulo);
				if (result == null) result = caseStatement_FunctioncallOrAssignment(expression_Modulo);
				if (result == null) result = caseStatement(expression_Modulo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.EXPRESSION_NEGATE: {
				Expression_Negate expression_Negate = (Expression_Negate)theEObject;
				T result = caseExpression_Negate(expression_Negate);
				if (result == null) result = caseExpression(expression_Negate);
				if (result == null) result = caseStatement_FunctioncallOrAssignment(expression_Negate);
				if (result == null) result = caseStatement(expression_Negate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.EXPRESSION_LENGTH: {
				Expression_Length expression_Length = (Expression_Length)theEObject;
				T result = caseExpression_Length(expression_Length);
				if (result == null) result = caseExpression(expression_Length);
				if (result == null) result = caseStatement_FunctioncallOrAssignment(expression_Length);
				if (result == null) result = caseStatement(expression_Length);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.EXPRESSION_INVERT: {
				Expression_Invert expression_Invert = (Expression_Invert)theEObject;
				T result = caseExpression_Invert(expression_Invert);
				if (result == null) result = caseExpression(expression_Invert);
				if (result == null) result = caseStatement_FunctioncallOrAssignment(expression_Invert);
				if (result == null) result = caseStatement(expression_Invert);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.EXPRESSION_EXPONENTIATION: {
				Expression_Exponentiation expression_Exponentiation = (Expression_Exponentiation)theEObject;
				T result = caseExpression_Exponentiation(expression_Exponentiation);
				if (result == null) result = caseExpression(expression_Exponentiation);
				if (result == null) result = caseStatement_FunctioncallOrAssignment(expression_Exponentiation);
				if (result == null) result = caseStatement(expression_Exponentiation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.EXPRESSION_CALL_MEMBER_FUNCTION: {
				Expression_CallMemberFunction expression_CallMemberFunction = (Expression_CallMemberFunction)theEObject;
				T result = caseExpression_CallMemberFunction(expression_CallMemberFunction);
				if (result == null) result = caseExpression(expression_CallMemberFunction);
				if (result == null) result = caseStatement_FunctioncallOrAssignment(expression_CallMemberFunction);
				if (result == null) result = caseStatement(expression_CallMemberFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.EXPRESSION_CALL_FUNCTION: {
				Expression_CallFunction expression_CallFunction = (Expression_CallFunction)theEObject;
				T result = caseExpression_CallFunction(expression_CallFunction);
				if (result == null) result = caseExpression(expression_CallFunction);
				if (result == null) result = caseStatement_FunctioncallOrAssignment(expression_CallFunction);
				if (result == null) result = caseStatement(expression_CallFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.EXPRESSION_ACCESS_ARRAY: {
				Expression_AccessArray expression_AccessArray = (Expression_AccessArray)theEObject;
				T result = caseExpression_AccessArray(expression_AccessArray);
				if (result == null) result = caseExpression(expression_AccessArray);
				if (result == null) result = caseStatement_FunctioncallOrAssignment(expression_AccessArray);
				if (result == null) result = caseStatement(expression_AccessArray);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.EXPRESSION_ACCESS_MEMBER: {
				Expression_AccessMember expression_AccessMember = (Expression_AccessMember)theEObject;
				T result = caseExpression_AccessMember(expression_AccessMember);
				if (result == null) result = caseExpression(expression_AccessMember);
				if (result == null) result = caseStatement_FunctioncallOrAssignment(expression_AccessMember);
				if (result == null) result = caseStatement(expression_AccessMember);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.EXPRESSION_VARIABLE_NAME: {
				Expression_VariableName expression_VariableName = (Expression_VariableName)theEObject;
				T result = caseExpression_VariableName(expression_VariableName);
				if (result == null) result = caseExpression(expression_VariableName);
				if (result == null) result = caseStatement_FunctioncallOrAssignment(expression_VariableName);
				if (result == null) result = caseStatement(expression_VariableName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.ACTIVITY_NODE: {
				ActivityNode activityNode = (ActivityNode)theEObject;
				T result = caseActivityNode(activityNode);
				if (result == null) result = caseNamedElement(activityNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.ACTIVITY_EDGE: {
				ActivityEdge activityEdge = (ActivityEdge)theEObject;
				T result = caseActivityEdge(activityEdge);
				if (result == null) result = caseNamedElement(activityEdge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.CONTROL_FLOW: {
				ControlFlow controlFlow = (ControlFlow)theEObject;
				T result = caseControlFlow(controlFlow);
				if (result == null) result = caseActivityEdge(controlFlow);
				if (result == null) result = caseNamedElement(controlFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.CONTROL_NODE: {
				ControlNode controlNode = (ControlNode)theEObject;
				T result = caseControlNode(controlNode);
				if (result == null) result = caseActivityNode(controlNode);
				if (result == null) result = caseNamedElement(controlNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.EXECUTABLE_NODE: {
				ExecutableNode executableNode = (ExecutableNode)theEObject;
				T result = caseExecutableNode(executableNode);
				if (result == null) result = caseActivityNode(executableNode);
				if (result == null) result = caseNamedElement(executableNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = caseExecutableNode(action);
				if (result == null) result = caseActivityNode(action);
				if (result == null) result = caseNamedElement(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.OPAQUE_ACTION: {
				OpaqueAction opaqueAction = (OpaqueAction)theEObject;
				T result = caseOpaqueAction(opaqueAction);
				if (result == null) result = caseAction(opaqueAction);
				if (result == null) result = caseExecutableNode(opaqueAction);
				if (result == null) result = caseActivityNode(opaqueAction);
				if (result == null) result = caseNamedElement(opaqueAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.INITIAL_NODE: {
				InitialNode initialNode = (InitialNode)theEObject;
				T result = caseInitialNode(initialNode);
				if (result == null) result = caseControlNode(initialNode);
				if (result == null) result = caseActivityNode(initialNode);
				if (result == null) result = caseNamedElement(initialNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.FINAL_NODE: {
				FinalNode finalNode = (FinalNode)theEObject;
				T result = caseFinalNode(finalNode);
				if (result == null) result = caseControlNode(finalNode);
				if (result == null) result = caseActivityNode(finalNode);
				if (result == null) result = caseNamedElement(finalNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.ACTIVITY_FINAL_NODE: {
				ActivityFinalNode activityFinalNode = (ActivityFinalNode)theEObject;
				T result = caseActivityFinalNode(activityFinalNode);
				if (result == null) result = caseFinalNode(activityFinalNode);
				if (result == null) result = caseControlNode(activityFinalNode);
				if (result == null) result = caseActivityNode(activityFinalNode);
				if (result == null) result = caseNamedElement(activityFinalNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.FORK_NODE: {
				ForkNode forkNode = (ForkNode)theEObject;
				T result = caseForkNode(forkNode);
				if (result == null) result = caseControlNode(forkNode);
				if (result == null) result = caseActivityNode(forkNode);
				if (result == null) result = caseNamedElement(forkNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.JOIN_NODE: {
				JoinNode joinNode = (JoinNode)theEObject;
				T result = caseJoinNode(joinNode);
				if (result == null) result = caseControlNode(joinNode);
				if (result == null) result = caseActivityNode(joinNode);
				if (result == null) result = caseNamedElement(joinNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.MERGE_NODE: {
				MergeNode mergeNode = (MergeNode)theEObject;
				T result = caseMergeNode(mergeNode);
				if (result == null) result = caseControlNode(mergeNode);
				if (result == null) result = caseActivityNode(mergeNode);
				if (result == null) result = caseNamedElement(mergeNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.DECISION_NODE: {
				DecisionNode decisionNode = (DecisionNode)theEObject;
				T result = caseDecisionNode(decisionNode);
				if (result == null) result = caseControlNode(decisionNode);
				if (result == null) result = caseActivityNode(decisionNode);
				if (result == null) result = caseNamedElement(decisionNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.VARIABLE: {
				Variable variable = (Variable)theEObject;
				T result = caseVariable(variable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.INTEGER_VARIABLE: {
				IntegerVariable integerVariable = (IntegerVariable)theEObject;
				T result = caseIntegerVariable(integerVariable);
				if (result == null) result = caseVariable(integerVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.BOOLEAN_VARIABLE: {
				BooleanVariable booleanVariable = (BooleanVariable)theEObject;
				T result = caseBooleanVariable(booleanVariable);
				if (result == null) result = caseVariable(booleanVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.VALUE: {
				Value value = (Value)theEObject;
				T result = caseValue(value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.BOOLEAN_VALUE: {
				BooleanValue booleanValue = (BooleanValue)theEObject;
				T result = caseBooleanValue(booleanValue);
				if (result == null) result = caseValue(booleanValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.INTEGER_VALUE: {
				IntegerValue integerValue = (IntegerValue)theEObject;
				T result = caseIntegerValue(integerValue);
				if (result == null) result = caseValue(integerValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.INTEGER_EXPRESSION: {
				IntegerExpression integerExpression = (IntegerExpression)theEObject;
				T result = caseIntegerExpression(integerExpression);
				if (result == null) result = caseExpression(integerExpression);
				if (result == null) result = caseStatement_FunctioncallOrAssignment(integerExpression);
				if (result == null) result = caseStatement(integerExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.BOOLEAN_EXPRESSION: {
				BooleanExpression booleanExpression = (BooleanExpression)theEObject;
				T result = caseBooleanExpression(booleanExpression);
				if (result == null) result = caseExpression(booleanExpression);
				if (result == null) result = caseStatement_FunctioncallOrAssignment(booleanExpression);
				if (result == null) result = caseStatement(booleanExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.INTEGER_CALCULATION_EXPRESSION: {
				IntegerCalculationExpression integerCalculationExpression = (IntegerCalculationExpression)theEObject;
				T result = caseIntegerCalculationExpression(integerCalculationExpression);
				if (result == null) result = caseIntegerExpression(integerCalculationExpression);
				if (result == null) result = caseExpression(integerCalculationExpression);
				if (result == null) result = caseStatement_FunctioncallOrAssignment(integerCalculationExpression);
				if (result == null) result = caseStatement(integerCalculationExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.INTEGER_COMPARISON_EXPRESSION: {
				IntegerComparisonExpression integerComparisonExpression = (IntegerComparisonExpression)theEObject;
				T result = caseIntegerComparisonExpression(integerComparisonExpression);
				if (result == null) result = caseIntegerExpression(integerComparisonExpression);
				if (result == null) result = caseExpression(integerComparisonExpression);
				if (result == null) result = caseStatement_FunctioncallOrAssignment(integerComparisonExpression);
				if (result == null) result = caseStatement(integerComparisonExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.BOOLEAN_UNARY_EXPRESSION: {
				BooleanUnaryExpression booleanUnaryExpression = (BooleanUnaryExpression)theEObject;
				T result = caseBooleanUnaryExpression(booleanUnaryExpression);
				if (result == null) result = caseBooleanExpression(booleanUnaryExpression);
				if (result == null) result = caseExpression(booleanUnaryExpression);
				if (result == null) result = caseStatement_FunctioncallOrAssignment(booleanUnaryExpression);
				if (result == null) result = caseStatement(booleanUnaryExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.BOOLEAN_BINARY_EXPRESSION: {
				BooleanBinaryExpression booleanBinaryExpression = (BooleanBinaryExpression)theEObject;
				T result = caseBooleanBinaryExpression(booleanBinaryExpression);
				if (result == null) result = caseBooleanExpression(booleanBinaryExpression);
				if (result == null) result = caseExpression(booleanBinaryExpression);
				if (result == null) result = caseStatement_FunctioncallOrAssignment(booleanBinaryExpression);
				if (result == null) result = caseStatement(booleanBinaryExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.INPUT_VALUE: {
				InputValue inputValue = (InputValue)theEObject;
				T result = caseInputValue(inputValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.INPUT: {
				Input input = (Input)theEObject;
				T result = caseInput(input);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.TOKEN: {
				Token token = (Token)theEObject;
				T result = caseToken(token);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot2Package.TRACE: {
				Trace trace = (Trace)theEObject;
				T result = caseTrace(trace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystem(fr.inria.diverse.iot2.iot2.iot2.System object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Board</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Board</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoard(Board object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sketch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sketch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSketch(Sketch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HW Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HW Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHWComponent(HWComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensor(Sensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actuator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actuator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActuator(Actuator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivity(Activity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationDef(OperationDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contained</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contained</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContained(Contained object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainer(Container object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTyped(Typed object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IDL Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IDL Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIDLType(IDLType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typedef Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typedef Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedefDef(TypedefDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterDef(ParameterDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exception Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exception Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExceptionDef(ExceptionDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseField(Field object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveDef(PrimitiveDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chunk</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chunk</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChunk(Chunk object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Last Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Last Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLastStatement(LastStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Last Statement Return</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Last Statement Return</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLastStatement_Return(LastStatement_Return object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Last Statement Break</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Last Statement Break</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLastStatement_Break(LastStatement_Break object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Statement Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatement_Block(Statement_Block object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement While</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement While</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatement_While(Statement_While object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement Repeat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement Repeat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatement_Repeat(Statement_Repeat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement If Then Else</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement If Then Else</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatement_If_Then_Else(Statement_If_Then_Else object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement If Then Else Else If Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement If Then Else Else If Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatement_If_Then_Else_ElseIfPart(Statement_If_Then_Else_ElseIfPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement For Numeric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement For Numeric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatement_For_Numeric(Statement_For_Numeric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement For Generic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement For Generic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatement_For_Generic(Statement_For_Generic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement Global Function Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement Global Function Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatement_GlobalFunction_Declaration(Statement_GlobalFunction_Declaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement Local Function Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement Local Function Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatement_LocalFunction_Declaration(Statement_LocalFunction_Declaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement Local Variable Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement Local Variable Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatement_Local_Variable_Declaration(Statement_Local_Variable_Declaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement Functioncall Or Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement Functioncall Or Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatement_FunctioncallOrAssignment(Statement_FunctioncallOrAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Nil</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Nil</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression_Nil(Expression_Nil object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression True</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression True</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression_True(Expression_True object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression False</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression False</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression_False(Expression_False object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Number</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Number</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression_Number(Expression_Number object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Var Args</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Var Args</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression_VarArgs(Expression_VarArgs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression_String(Expression_String object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression_Function(Expression_Function object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Table Constructor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Table Constructor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression_TableConstructor(Expression_TableConstructor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunction(Function object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Functioncall Arguments</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Functioncall Arguments</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctioncall_Arguments(Functioncall_Arguments object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Add Entry To Table Brackets</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Add Entry To Table Brackets</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseField_AddEntryToTable_Brackets(Field_AddEntryToTable_Brackets object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Add Entry To Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Add Entry To Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseField_AddEntryToTable(Field_AddEntryToTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Append Entry To Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Append Entry To Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseField_AppendEntryToTable(Field_AppendEntryToTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Last Statement Return With Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Last Statement Return With Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLastStatement_ReturnWithValue(LastStatement_ReturnWithValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatement_Assignment(Statement_Assignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement Call Member Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement Call Member Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatement_CallMemberFunction(Statement_CallMemberFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement Call Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement Call Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatement_CallFunction(Statement_CallFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Or</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Or</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression_Or(Expression_Or object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression And</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression And</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression_And(Expression_And object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Larger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Larger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression_Larger(Expression_Larger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Larger Equal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Larger Equal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression_Larger_Equal(Expression_Larger_Equal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Smaller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Smaller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression_Smaller(Expression_Smaller object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Smaller Equal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Smaller Equal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression_Smaller_Equal(Expression_Smaller_Equal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Equal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Equal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression_Equal(Expression_Equal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Not Equal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Not Equal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression_Not_Equal(Expression_Not_Equal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Concatenation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Concatenation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression_Concatenation(Expression_Concatenation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Plus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Plus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression_Plus(Expression_Plus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Minus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Minus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression_Minus(Expression_Minus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Multiplication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Multiplication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression_Multiplication(Expression_Multiplication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Division</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Division</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression_Division(Expression_Division object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Modulo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Modulo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression_Modulo(Expression_Modulo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Negate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Negate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression_Negate(Expression_Negate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Length</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Length</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression_Length(Expression_Length object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Invert</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Invert</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression_Invert(Expression_Invert object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Exponentiation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Exponentiation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression_Exponentiation(Expression_Exponentiation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Call Member Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Call Member Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression_CallMemberFunction(Expression_CallMemberFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Call Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Call Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression_CallFunction(Expression_CallFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Access Array</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Access Array</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression_AccessArray(Expression_AccessArray object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Access Member</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Access Member</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression_AccessMember(Expression_AccessMember object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Variable Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Variable Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression_VariableName(Expression_VariableName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityNode(ActivityNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityEdge(ActivityEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlFlow(ControlFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlNode(ControlNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Executable Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Executable Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutableNode(ExecutableNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Opaque Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Opaque Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpaqueAction(OpaqueAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initial Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initial Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitialNode(InitialNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Final Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Final Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFinalNode(FinalNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Final Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Final Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityFinalNode(ActivityFinalNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fork Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fork Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForkNode(ForkNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Join Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Join Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJoinNode(JoinNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Merge Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Merge Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMergeNode(MergeNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decision Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decision Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecisionNode(DecisionNode object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Integer Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerVariable(IntegerVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanVariable(BooleanVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValue(Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanValue(BooleanValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerValue(IntegerValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerExpression(IntegerExpression object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Integer Calculation Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Calculation Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerCalculationExpression(IntegerCalculationExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Comparison Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Comparison Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerComparisonExpression(IntegerComparisonExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Unary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Unary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanUnaryExpression(BooleanUnaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Binary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Binary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanBinaryExpression(BooleanBinaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputValue(InputValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInput(Input object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Token</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Token</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToken(Token object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrace(Trace object) {
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

} //Iot2Switch
