/**
 */
package fr.inria.diverse.iot2.iot2.iot2.impl;

import fr.inria.diverse.iot2.iot2.iot2.Activity;
import fr.inria.diverse.iot2.iot2.iot2.ActivityFinalNode;
import fr.inria.diverse.iot2.iot2.iot2.ActivityNode;
import fr.inria.diverse.iot2.iot2.iot2.Actuator;
import fr.inria.diverse.iot2.iot2.iot2.Block;
import fr.inria.diverse.iot2.iot2.iot2.Board;
import fr.inria.diverse.iot2.iot2.iot2.BoardType;
import fr.inria.diverse.iot2.iot2.iot2.BooleanBinaryExpression;
import fr.inria.diverse.iot2.iot2.iot2.BooleanBinaryOperator;
import fr.inria.diverse.iot2.iot2.iot2.BooleanUnaryExpression;
import fr.inria.diverse.iot2.iot2.iot2.BooleanUnaryOperator;
import fr.inria.diverse.iot2.iot2.iot2.BooleanValue;
import fr.inria.diverse.iot2.iot2.iot2.BooleanVariable;
import fr.inria.diverse.iot2.iot2.iot2.Chunk;
import fr.inria.diverse.iot2.iot2.iot2.ControlFlow;
import fr.inria.diverse.iot2.iot2.iot2.DecisionNode;
import fr.inria.diverse.iot2.iot2.iot2.ExceptionDef;
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
import fr.inria.diverse.iot2.iot2.iot2.ForkNode;
import fr.inria.diverse.iot2.iot2.iot2.Function;
import fr.inria.diverse.iot2.iot2.iot2.Functioncall_Arguments;
import fr.inria.diverse.iot2.iot2.iot2.InitialNode;
import fr.inria.diverse.iot2.iot2.iot2.Input;
import fr.inria.diverse.iot2.iot2.iot2.InputValue;
import fr.inria.diverse.iot2.iot2.iot2.IntegerCalculationExpression;
import fr.inria.diverse.iot2.iot2.iot2.IntegerCalculationOperator;
import fr.inria.diverse.iot2.iot2.iot2.IntegerComparisonExpression;
import fr.inria.diverse.iot2.iot2.iot2.IntegerComparisonOperator;
import fr.inria.diverse.iot2.iot2.iot2.IntegerValue;
import fr.inria.diverse.iot2.iot2.iot2.IntegerVariable;
import fr.inria.diverse.iot2.iot2.iot2.Iot2Factory;
import fr.inria.diverse.iot2.iot2.iot2.Iot2Package;
import fr.inria.diverse.iot2.iot2.iot2.JoinNode;
import fr.inria.diverse.iot2.iot2.iot2.LastStatement;
import fr.inria.diverse.iot2.iot2.iot2.LastStatement_Break;
import fr.inria.diverse.iot2.iot2.iot2.LastStatement_Return;
import fr.inria.diverse.iot2.iot2.iot2.LastStatement_ReturnWithValue;
import fr.inria.diverse.iot2.iot2.iot2.MergeNode;
import fr.inria.diverse.iot2.iot2.iot2.OpaqueAction;
import fr.inria.diverse.iot2.iot2.iot2.OperationDef;
import fr.inria.diverse.iot2.iot2.iot2.ParameterDef;
import fr.inria.diverse.iot2.iot2.iot2.ParameterMode;
import fr.inria.diverse.iot2.iot2.iot2.PrimitiveDef;
import fr.inria.diverse.iot2.iot2.iot2.PrimitiveKind;
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
import fr.inria.diverse.iot2.iot2.iot2.Value;
import fr.inria.diverse.iot2.iot2.iot2.Variable;

import java.util.Stack;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Iot2FactoryImpl extends EFactoryImpl implements Iot2Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Iot2Factory init() {
		try {
			Iot2Factory theIot2Factory = (Iot2Factory)EPackage.Registry.INSTANCE.getEFactory(Iot2Package.eNS_URI);
			if (theIot2Factory != null) {
				return theIot2Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Iot2FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Iot2FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Iot2Package.SYSTEM: return createSystem();
			case Iot2Package.BOARD: return createBoard();
			case Iot2Package.SKETCH: return createSketch();
			case Iot2Package.SENSOR: return createSensor();
			case Iot2Package.ACTUATOR: return createActuator();
			case Iot2Package.ACTIVITY: return createActivity();
			case Iot2Package.OPERATION_DEF: return createOperationDef();
			case Iot2Package.PARAMETER_DEF: return createParameterDef();
			case Iot2Package.EXCEPTION_DEF: return createExceptionDef();
			case Iot2Package.FIELD: return createField();
			case Iot2Package.PRIMITIVE_DEF: return createPrimitiveDef();
			case Iot2Package.CHUNK: return createChunk();
			case Iot2Package.BLOCK: return createBlock();
			case Iot2Package.LAST_STATEMENT: return createLastStatement();
			case Iot2Package.LAST_STATEMENT_RETURN: return createLastStatement_Return();
			case Iot2Package.LAST_STATEMENT_BREAK: return createLastStatement_Break();
			case Iot2Package.STATEMENT: return createStatement();
			case Iot2Package.STATEMENT_BLOCK: return createStatement_Block();
			case Iot2Package.STATEMENT_WHILE: return createStatement_While();
			case Iot2Package.STATEMENT_REPEAT: return createStatement_Repeat();
			case Iot2Package.STATEMENT_IF_THEN_ELSE: return createStatement_If_Then_Else();
			case Iot2Package.STATEMENT_IF_THEN_ELSE_ELSE_IF_PART: return createStatement_If_Then_Else_ElseIfPart();
			case Iot2Package.STATEMENT_FOR_NUMERIC: return createStatement_For_Numeric();
			case Iot2Package.STATEMENT_FOR_GENERIC: return createStatement_For_Generic();
			case Iot2Package.STATEMENT_GLOBAL_FUNCTION_DECLARATION: return createStatement_GlobalFunction_Declaration();
			case Iot2Package.STATEMENT_LOCAL_FUNCTION_DECLARATION: return createStatement_LocalFunction_Declaration();
			case Iot2Package.STATEMENT_LOCAL_VARIABLE_DECLARATION: return createStatement_Local_Variable_Declaration();
			case Iot2Package.STATEMENT_FUNCTIONCALL_OR_ASSIGNMENT: return createStatement_FunctioncallOrAssignment();
			case Iot2Package.EXPRESSION: return createExpression();
			case Iot2Package.EXPRESSION_NIL: return createExpression_Nil();
			case Iot2Package.EXPRESSION_TRUE: return createExpression_True();
			case Iot2Package.EXPRESSION_FALSE: return createExpression_False();
			case Iot2Package.EXPRESSION_NUMBER: return createExpression_Number();
			case Iot2Package.EXPRESSION_VAR_ARGS: return createExpression_VarArgs();
			case Iot2Package.EXPRESSION_STRING: return createExpression_String();
			case Iot2Package.EXPRESSION_FUNCTION: return createExpression_Function();
			case Iot2Package.EXPRESSION_TABLE_CONSTRUCTOR: return createExpression_TableConstructor();
			case Iot2Package.FUNCTION: return createFunction();
			case Iot2Package.FUNCTIONCALL_ARGUMENTS: return createFunctioncall_Arguments();
			case Iot2Package.FIELD_ADD_ENTRY_TO_TABLE_BRACKETS: return createField_AddEntryToTable_Brackets();
			case Iot2Package.FIELD_ADD_ENTRY_TO_TABLE: return createField_AddEntryToTable();
			case Iot2Package.FIELD_APPEND_ENTRY_TO_TABLE: return createField_AppendEntryToTable();
			case Iot2Package.LAST_STATEMENT_RETURN_WITH_VALUE: return createLastStatement_ReturnWithValue();
			case Iot2Package.STATEMENT_ASSIGNMENT: return createStatement_Assignment();
			case Iot2Package.STATEMENT_CALL_MEMBER_FUNCTION: return createStatement_CallMemberFunction();
			case Iot2Package.STATEMENT_CALL_FUNCTION: return createStatement_CallFunction();
			case Iot2Package.EXPRESSION_OR: return createExpression_Or();
			case Iot2Package.EXPRESSION_AND: return createExpression_And();
			case Iot2Package.EXPRESSION_LARGER: return createExpression_Larger();
			case Iot2Package.EXPRESSION_LARGER_EQUAL: return createExpression_Larger_Equal();
			case Iot2Package.EXPRESSION_SMALLER: return createExpression_Smaller();
			case Iot2Package.EXPRESSION_SMALLER_EQUAL: return createExpression_Smaller_Equal();
			case Iot2Package.EXPRESSION_EQUAL: return createExpression_Equal();
			case Iot2Package.EXPRESSION_NOT_EQUAL: return createExpression_Not_Equal();
			case Iot2Package.EXPRESSION_CONCATENATION: return createExpression_Concatenation();
			case Iot2Package.EXPRESSION_PLUS: return createExpression_Plus();
			case Iot2Package.EXPRESSION_MINUS: return createExpression_Minus();
			case Iot2Package.EXPRESSION_MULTIPLICATION: return createExpression_Multiplication();
			case Iot2Package.EXPRESSION_DIVISION: return createExpression_Division();
			case Iot2Package.EXPRESSION_MODULO: return createExpression_Modulo();
			case Iot2Package.EXPRESSION_NEGATE: return createExpression_Negate();
			case Iot2Package.EXPRESSION_LENGTH: return createExpression_Length();
			case Iot2Package.EXPRESSION_INVERT: return createExpression_Invert();
			case Iot2Package.EXPRESSION_EXPONENTIATION: return createExpression_Exponentiation();
			case Iot2Package.EXPRESSION_CALL_MEMBER_FUNCTION: return createExpression_CallMemberFunction();
			case Iot2Package.EXPRESSION_CALL_FUNCTION: return createExpression_CallFunction();
			case Iot2Package.EXPRESSION_ACCESS_ARRAY: return createExpression_AccessArray();
			case Iot2Package.EXPRESSION_ACCESS_MEMBER: return createExpression_AccessMember();
			case Iot2Package.EXPRESSION_VARIABLE_NAME: return createExpression_VariableName();
			case Iot2Package.ACTIVITY_NODE: return createActivityNode();
			case Iot2Package.CONTROL_FLOW: return createControlFlow();
			case Iot2Package.OPAQUE_ACTION: return createOpaqueAction();
			case Iot2Package.INITIAL_NODE: return createInitialNode();
			case Iot2Package.ACTIVITY_FINAL_NODE: return createActivityFinalNode();
			case Iot2Package.FORK_NODE: return createForkNode();
			case Iot2Package.JOIN_NODE: return createJoinNode();
			case Iot2Package.MERGE_NODE: return createMergeNode();
			case Iot2Package.DECISION_NODE: return createDecisionNode();
			case Iot2Package.VARIABLE: return createVariable();
			case Iot2Package.INTEGER_VARIABLE: return createIntegerVariable();
			case Iot2Package.BOOLEAN_VARIABLE: return createBooleanVariable();
			case Iot2Package.VALUE: return createValue();
			case Iot2Package.BOOLEAN_VALUE: return createBooleanValue();
			case Iot2Package.INTEGER_VALUE: return createIntegerValue();
			case Iot2Package.INTEGER_CALCULATION_EXPRESSION: return createIntegerCalculationExpression();
			case Iot2Package.INTEGER_COMPARISON_EXPRESSION: return createIntegerComparisonExpression();
			case Iot2Package.BOOLEAN_UNARY_EXPRESSION: return createBooleanUnaryExpression();
			case Iot2Package.BOOLEAN_BINARY_EXPRESSION: return createBooleanBinaryExpression();
			case Iot2Package.INPUT_VALUE: return createInputValue();
			case Iot2Package.INPUT: return createInput();
			case Iot2Package.TOKEN: return createToken();
			case Iot2Package.TRACE: return createTrace();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Iot2Package.BOARD_TYPE:
				return createBoardTypeFromString(eDataType, initialValue);
			case Iot2Package.PARAMETER_MODE:
				return createParameterModeFromString(eDataType, initialValue);
			case Iot2Package.PRIMITIVE_KIND:
				return createPrimitiveKindFromString(eDataType, initialValue);
			case Iot2Package.INTEGER_CALCULATION_OPERATOR:
				return createIntegerCalculationOperatorFromString(eDataType, initialValue);
			case Iot2Package.INTEGER_COMPARISON_OPERATOR:
				return createIntegerComparisonOperatorFromString(eDataType, initialValue);
			case Iot2Package.BOOLEAN_UNARY_OPERATOR:
				return createBooleanUnaryOperatorFromString(eDataType, initialValue);
			case Iot2Package.BOOLEAN_BINARY_OPERATOR:
				return createBooleanBinaryOperatorFromString(eDataType, initialValue);
			case Iot2Package.ETYPE_CODE:
				return createETypeCodeFromString(eDataType, initialValue);
			case Iot2Package.OBJECT:
				return createObjectFromString(eDataType, initialValue);
			case Iot2Package.STACK:
				return createStackFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Iot2Package.BOARD_TYPE:
				return convertBoardTypeToString(eDataType, instanceValue);
			case Iot2Package.PARAMETER_MODE:
				return convertParameterModeToString(eDataType, instanceValue);
			case Iot2Package.PRIMITIVE_KIND:
				return convertPrimitiveKindToString(eDataType, instanceValue);
			case Iot2Package.INTEGER_CALCULATION_OPERATOR:
				return convertIntegerCalculationOperatorToString(eDataType, instanceValue);
			case Iot2Package.INTEGER_COMPARISON_OPERATOR:
				return convertIntegerComparisonOperatorToString(eDataType, instanceValue);
			case Iot2Package.BOOLEAN_UNARY_OPERATOR:
				return convertBooleanUnaryOperatorToString(eDataType, instanceValue);
			case Iot2Package.BOOLEAN_BINARY_OPERATOR:
				return convertBooleanBinaryOperatorToString(eDataType, instanceValue);
			case Iot2Package.ETYPE_CODE:
				return convertETypeCodeToString(eDataType, instanceValue);
			case Iot2Package.OBJECT:
				return convertObjectToString(eDataType, instanceValue);
			case Iot2Package.STACK:
				return convertStackToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fr.inria.diverse.iot2.iot2.iot2.System createSystem() {
		SystemImpl system = new SystemImpl();
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Board createBoard() {
		BoardImpl board = new BoardImpl();
		return board;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sketch createSketch() {
		SketchImpl sketch = new SketchImpl();
		return sketch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sensor createSensor() {
		SensorImpl sensor = new SensorImpl();
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actuator createActuator() {
		ActuatorImpl actuator = new ActuatorImpl();
		return actuator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity createActivity() {
		ActivityImpl activity = new ActivityImpl();
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationDef createOperationDef() {
		OperationDefImpl operationDef = new OperationDefImpl();
		return operationDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterDef createParameterDef() {
		ParameterDefImpl parameterDef = new ParameterDefImpl();
		return parameterDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExceptionDef createExceptionDef() {
		ExceptionDefImpl exceptionDef = new ExceptionDefImpl();
		return exceptionDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field createField() {
		FieldImpl field = new FieldImpl();
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveDef createPrimitiveDef() {
		PrimitiveDefImpl primitiveDef = new PrimitiveDefImpl();
		return primitiveDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Chunk createChunk() {
		ChunkImpl chunk = new ChunkImpl();
		return chunk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block createBlock() {
		BlockImpl block = new BlockImpl();
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LastStatement createLastStatement() {
		LastStatementImpl lastStatement = new LastStatementImpl();
		return lastStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LastStatement_Return createLastStatement_Return() {
		LastStatement_ReturnImpl lastStatement_Return = new LastStatement_ReturnImpl();
		return lastStatement_Return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LastStatement_Break createLastStatement_Break() {
		LastStatement_BreakImpl lastStatement_Break = new LastStatement_BreakImpl();
		return lastStatement_Break;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement createStatement() {
		StatementImpl statement = new StatementImpl();
		return statement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement_Block createStatement_Block() {
		Statement_BlockImpl statement_Block = new Statement_BlockImpl();
		return statement_Block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement_While createStatement_While() {
		Statement_WhileImpl statement_While = new Statement_WhileImpl();
		return statement_While;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement_Repeat createStatement_Repeat() {
		Statement_RepeatImpl statement_Repeat = new Statement_RepeatImpl();
		return statement_Repeat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement_If_Then_Else createStatement_If_Then_Else() {
		Statement_If_Then_ElseImpl statement_If_Then_Else = new Statement_If_Then_ElseImpl();
		return statement_If_Then_Else;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement_If_Then_Else_ElseIfPart createStatement_If_Then_Else_ElseIfPart() {
		Statement_If_Then_Else_ElseIfPartImpl statement_If_Then_Else_ElseIfPart = new Statement_If_Then_Else_ElseIfPartImpl();
		return statement_If_Then_Else_ElseIfPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement_For_Numeric createStatement_For_Numeric() {
		Statement_For_NumericImpl statement_For_Numeric = new Statement_For_NumericImpl();
		return statement_For_Numeric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement_For_Generic createStatement_For_Generic() {
		Statement_For_GenericImpl statement_For_Generic = new Statement_For_GenericImpl();
		return statement_For_Generic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement_GlobalFunction_Declaration createStatement_GlobalFunction_Declaration() {
		Statement_GlobalFunction_DeclarationImpl statement_GlobalFunction_Declaration = new Statement_GlobalFunction_DeclarationImpl();
		return statement_GlobalFunction_Declaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement_LocalFunction_Declaration createStatement_LocalFunction_Declaration() {
		Statement_LocalFunction_DeclarationImpl statement_LocalFunction_Declaration = new Statement_LocalFunction_DeclarationImpl();
		return statement_LocalFunction_Declaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement_Local_Variable_Declaration createStatement_Local_Variable_Declaration() {
		Statement_Local_Variable_DeclarationImpl statement_Local_Variable_Declaration = new Statement_Local_Variable_DeclarationImpl();
		return statement_Local_Variable_Declaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement_FunctioncallOrAssignment createStatement_FunctioncallOrAssignment() {
		Statement_FunctioncallOrAssignmentImpl statement_FunctioncallOrAssignment = new Statement_FunctioncallOrAssignmentImpl();
		return statement_FunctioncallOrAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression createExpression() {
		ExpressionImpl expression = new ExpressionImpl();
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression_Nil createExpression_Nil() {
		Expression_NilImpl expression_Nil = new Expression_NilImpl();
		return expression_Nil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression_True createExpression_True() {
		Expression_TrueImpl expression_True = new Expression_TrueImpl();
		return expression_True;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression_False createExpression_False() {
		Expression_FalseImpl expression_False = new Expression_FalseImpl();
		return expression_False;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression_Number createExpression_Number() {
		Expression_NumberImpl expression_Number = new Expression_NumberImpl();
		return expression_Number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression_VarArgs createExpression_VarArgs() {
		Expression_VarArgsImpl expression_VarArgs = new Expression_VarArgsImpl();
		return expression_VarArgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression_String createExpression_String() {
		Expression_StringImpl expression_String = new Expression_StringImpl();
		return expression_String;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression_Function createExpression_Function() {
		Expression_FunctionImpl expression_Function = new Expression_FunctionImpl();
		return expression_Function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression_TableConstructor createExpression_TableConstructor() {
		Expression_TableConstructorImpl expression_TableConstructor = new Expression_TableConstructorImpl();
		return expression_TableConstructor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function createFunction() {
		FunctionImpl function = new FunctionImpl();
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Functioncall_Arguments createFunctioncall_Arguments() {
		Functioncall_ArgumentsImpl functioncall_Arguments = new Functioncall_ArgumentsImpl();
		return functioncall_Arguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field_AddEntryToTable_Brackets createField_AddEntryToTable_Brackets() {
		Field_AddEntryToTable_BracketsImpl field_AddEntryToTable_Brackets = new Field_AddEntryToTable_BracketsImpl();
		return field_AddEntryToTable_Brackets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field_AddEntryToTable createField_AddEntryToTable() {
		Field_AddEntryToTableImpl field_AddEntryToTable = new Field_AddEntryToTableImpl();
		return field_AddEntryToTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field_AppendEntryToTable createField_AppendEntryToTable() {
		Field_AppendEntryToTableImpl field_AppendEntryToTable = new Field_AppendEntryToTableImpl();
		return field_AppendEntryToTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LastStatement_ReturnWithValue createLastStatement_ReturnWithValue() {
		LastStatement_ReturnWithValueImpl lastStatement_ReturnWithValue = new LastStatement_ReturnWithValueImpl();
		return lastStatement_ReturnWithValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement_Assignment createStatement_Assignment() {
		Statement_AssignmentImpl statement_Assignment = new Statement_AssignmentImpl();
		return statement_Assignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement_CallMemberFunction createStatement_CallMemberFunction() {
		Statement_CallMemberFunctionImpl statement_CallMemberFunction = new Statement_CallMemberFunctionImpl();
		return statement_CallMemberFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement_CallFunction createStatement_CallFunction() {
		Statement_CallFunctionImpl statement_CallFunction = new Statement_CallFunctionImpl();
		return statement_CallFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression_Or createExpression_Or() {
		Expression_OrImpl expression_Or = new Expression_OrImpl();
		return expression_Or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression_And createExpression_And() {
		Expression_AndImpl expression_And = new Expression_AndImpl();
		return expression_And;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression_Larger createExpression_Larger() {
		Expression_LargerImpl expression_Larger = new Expression_LargerImpl();
		return expression_Larger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression_Larger_Equal createExpression_Larger_Equal() {
		Expression_Larger_EqualImpl expression_Larger_Equal = new Expression_Larger_EqualImpl();
		return expression_Larger_Equal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression_Smaller createExpression_Smaller() {
		Expression_SmallerImpl expression_Smaller = new Expression_SmallerImpl();
		return expression_Smaller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression_Smaller_Equal createExpression_Smaller_Equal() {
		Expression_Smaller_EqualImpl expression_Smaller_Equal = new Expression_Smaller_EqualImpl();
		return expression_Smaller_Equal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression_Equal createExpression_Equal() {
		Expression_EqualImpl expression_Equal = new Expression_EqualImpl();
		return expression_Equal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression_Not_Equal createExpression_Not_Equal() {
		Expression_Not_EqualImpl expression_Not_Equal = new Expression_Not_EqualImpl();
		return expression_Not_Equal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression_Concatenation createExpression_Concatenation() {
		Expression_ConcatenationImpl expression_Concatenation = new Expression_ConcatenationImpl();
		return expression_Concatenation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression_Plus createExpression_Plus() {
		Expression_PlusImpl expression_Plus = new Expression_PlusImpl();
		return expression_Plus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression_Minus createExpression_Minus() {
		Expression_MinusImpl expression_Minus = new Expression_MinusImpl();
		return expression_Minus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression_Multiplication createExpression_Multiplication() {
		Expression_MultiplicationImpl expression_Multiplication = new Expression_MultiplicationImpl();
		return expression_Multiplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression_Division createExpression_Division() {
		Expression_DivisionImpl expression_Division = new Expression_DivisionImpl();
		return expression_Division;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression_Modulo createExpression_Modulo() {
		Expression_ModuloImpl expression_Modulo = new Expression_ModuloImpl();
		return expression_Modulo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression_Negate createExpression_Negate() {
		Expression_NegateImpl expression_Negate = new Expression_NegateImpl();
		return expression_Negate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression_Length createExpression_Length() {
		Expression_LengthImpl expression_Length = new Expression_LengthImpl();
		return expression_Length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression_Invert createExpression_Invert() {
		Expression_InvertImpl expression_Invert = new Expression_InvertImpl();
		return expression_Invert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression_Exponentiation createExpression_Exponentiation() {
		Expression_ExponentiationImpl expression_Exponentiation = new Expression_ExponentiationImpl();
		return expression_Exponentiation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression_CallMemberFunction createExpression_CallMemberFunction() {
		Expression_CallMemberFunctionImpl expression_CallMemberFunction = new Expression_CallMemberFunctionImpl();
		return expression_CallMemberFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression_CallFunction createExpression_CallFunction() {
		Expression_CallFunctionImpl expression_CallFunction = new Expression_CallFunctionImpl();
		return expression_CallFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression_AccessArray createExpression_AccessArray() {
		Expression_AccessArrayImpl expression_AccessArray = new Expression_AccessArrayImpl();
		return expression_AccessArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression_AccessMember createExpression_AccessMember() {
		Expression_AccessMemberImpl expression_AccessMember = new Expression_AccessMemberImpl();
		return expression_AccessMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression_VariableName createExpression_VariableName() {
		Expression_VariableNameImpl expression_VariableName = new Expression_VariableNameImpl();
		return expression_VariableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode createActivityNode() {
		ActivityNodeImpl activityNode = new ActivityNodeImpl();
		return activityNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlFlow createControlFlow() {
		ControlFlowImpl controlFlow = new ControlFlowImpl();
		return controlFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpaqueAction createOpaqueAction() {
		OpaqueActionImpl opaqueAction = new OpaqueActionImpl();
		return opaqueAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialNode createInitialNode() {
		InitialNodeImpl initialNode = new InitialNodeImpl();
		return initialNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityFinalNode createActivityFinalNode() {
		ActivityFinalNodeImpl activityFinalNode = new ActivityFinalNodeImpl();
		return activityFinalNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForkNode createForkNode() {
		ForkNodeImpl forkNode = new ForkNodeImpl();
		return forkNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinNode createJoinNode() {
		JoinNodeImpl joinNode = new JoinNodeImpl();
		return joinNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MergeNode createMergeNode() {
		MergeNodeImpl mergeNode = new MergeNodeImpl();
		return mergeNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionNode createDecisionNode() {
		DecisionNodeImpl decisionNode = new DecisionNodeImpl();
		return decisionNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerVariable createIntegerVariable() {
		IntegerVariableImpl integerVariable = new IntegerVariableImpl();
		return integerVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanVariable createBooleanVariable() {
		BooleanVariableImpl booleanVariable = new BooleanVariableImpl();
		return booleanVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value createValue() {
		ValueImpl value = new ValueImpl();
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanValue createBooleanValue() {
		BooleanValueImpl booleanValue = new BooleanValueImpl();
		return booleanValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerValue createIntegerValue() {
		IntegerValueImpl integerValue = new IntegerValueImpl();
		return integerValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerCalculationExpression createIntegerCalculationExpression() {
		IntegerCalculationExpressionImpl integerCalculationExpression = new IntegerCalculationExpressionImpl();
		return integerCalculationExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerComparisonExpression createIntegerComparisonExpression() {
		IntegerComparisonExpressionImpl integerComparisonExpression = new IntegerComparisonExpressionImpl();
		return integerComparisonExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanUnaryExpression createBooleanUnaryExpression() {
		BooleanUnaryExpressionImpl booleanUnaryExpression = new BooleanUnaryExpressionImpl();
		return booleanUnaryExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanBinaryExpression createBooleanBinaryExpression() {
		BooleanBinaryExpressionImpl booleanBinaryExpression = new BooleanBinaryExpressionImpl();
		return booleanBinaryExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputValue createInputValue() {
		InputValueImpl inputValue = new InputValueImpl();
		return inputValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Input createInput() {
		InputImpl input = new InputImpl();
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Token createToken() {
		TokenImpl token = new TokenImpl();
		return token;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trace createTrace() {
		TraceImpl trace = new TraceImpl();
		return trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoardType createBoardTypeFromString(EDataType eDataType, String initialValue) {
		BoardType result = BoardType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBoardTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterMode createParameterModeFromString(EDataType eDataType, String initialValue) {
		ParameterMode result = ParameterMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParameterModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveKind createPrimitiveKindFromString(EDataType eDataType, String initialValue) {
		PrimitiveKind result = PrimitiveKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPrimitiveKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerCalculationOperator createIntegerCalculationOperatorFromString(EDataType eDataType, String initialValue) {
		IntegerCalculationOperator result = IntegerCalculationOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntegerCalculationOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerComparisonOperator createIntegerComparisonOperatorFromString(EDataType eDataType, String initialValue) {
		IntegerComparisonOperator result = IntegerComparisonOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntegerComparisonOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanUnaryOperator createBooleanUnaryOperatorFromString(EDataType eDataType, String initialValue) {
		BooleanUnaryOperator result = BooleanUnaryOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanUnaryOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanBinaryOperator createBooleanBinaryOperatorFromString(EDataType eDataType, String initialValue) {
		BooleanBinaryOperator result = BooleanBinaryOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanBinaryOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createETypeCodeFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertETypeCodeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createObjectFromString(EDataType eDataType, String initialValue) {
		return super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObjectToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stack createStackFromString(EDataType eDataType, String initialValue) {
		return (Stack)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStackToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Iot2Package getIot2Package() {
		return (Iot2Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Iot2Package getPackage() {
		return Iot2Package.eINSTANCE;
	}

} //Iot2FactoryImpl
