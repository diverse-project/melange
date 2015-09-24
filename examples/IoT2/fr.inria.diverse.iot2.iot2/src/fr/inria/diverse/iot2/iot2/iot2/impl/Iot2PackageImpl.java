/**
 */
package fr.inria.diverse.iot2.iot2.iot2.impl;

import fr.inria.diverse.iot2.iot2.iot2.Action;
import fr.inria.diverse.iot2.iot2.iot2.Activity;
import fr.inria.diverse.iot2.iot2.iot2.ActivityEdge;
import fr.inria.diverse.iot2.iot2.iot2.ActivityFinalNode;
import fr.inria.diverse.iot2.iot2.iot2.ActivityNode;
import fr.inria.diverse.iot2.iot2.iot2.Actuator;
import fr.inria.diverse.iot2.iot2.iot2.Block;
import fr.inria.diverse.iot2.iot2.iot2.Board;
import fr.inria.diverse.iot2.iot2.iot2.BoardType;
import fr.inria.diverse.iot2.iot2.iot2.BooleanBinaryExpression;
import fr.inria.diverse.iot2.iot2.iot2.BooleanBinaryOperator;
import fr.inria.diverse.iot2.iot2.iot2.BooleanExpression;
import fr.inria.diverse.iot2.iot2.iot2.BooleanUnaryExpression;
import fr.inria.diverse.iot2.iot2.iot2.BooleanUnaryOperator;
import fr.inria.diverse.iot2.iot2.iot2.BooleanValue;
import fr.inria.diverse.iot2.iot2.iot2.BooleanVariable;
import fr.inria.diverse.iot2.iot2.iot2.Chunk;
import fr.inria.diverse.iot2.iot2.iot2.Contained;
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
import fr.inria.diverse.iot2.iot2.iot2.IntegerCalculationOperator;
import fr.inria.diverse.iot2.iot2.iot2.IntegerComparisonExpression;
import fr.inria.diverse.iot2.iot2.iot2.IntegerComparisonOperator;
import fr.inria.diverse.iot2.iot2.iot2.IntegerExpression;
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
import fr.inria.diverse.iot2.iot2.iot2.NamedElement;
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
import fr.inria.diverse.iot2.iot2.iot2.Typed;
import fr.inria.diverse.iot2.iot2.iot2.TypedefDef;
import fr.inria.diverse.iot2.iot2.iot2.Value;
import fr.inria.diverse.iot2.iot2.iot2.Variable;

import java.util.Stack;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Iot2PackageImpl extends EPackageImpl implements Iot2Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sketchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hwComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actuatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass idlTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedefDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exceptionDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chunkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lastStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lastStatement_ReturnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lastStatement_BreakEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statement_BlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statement_WhileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statement_RepeatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statement_If_Then_ElseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statement_If_Then_Else_ElseIfPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statement_For_NumericEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statement_For_GenericEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statement_GlobalFunction_DeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statement_LocalFunction_DeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statement_Local_Variable_DeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statement_FunctioncallOrAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_NilEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_TrueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_FalseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_NumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_VarArgsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_StringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_FunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_TableConstructorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functioncall_ArgumentsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass field_AddEntryToTable_BracketsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass field_AddEntryToTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass field_AppendEntryToTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lastStatement_ReturnWithValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statement_AssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statement_CallMemberFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statement_CallFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_OrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_AndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_LargerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_Larger_EqualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_SmallerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_Smaller_EqualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_EqualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_Not_EqualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_ConcatenationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_PlusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_MinusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_MultiplicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_DivisionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_ModuloEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_NegateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_LengthEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_InvertEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_ExponentiationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_CallMemberFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_CallFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_AccessArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_AccessMemberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_VariableNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executableNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opaqueActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityFinalNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forkNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joinNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mergeNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decisionNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerCalculationExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerComparisonExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanUnaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanBinaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass traceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum boardTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum parameterModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum primitiveKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum integerCalculationOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum integerComparisonOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum booleanUnaryOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum booleanBinaryOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eTypeCodeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType objectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stackEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see fr.inria.diverse.iot2.iot2.iot2.Iot2Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Iot2PackageImpl() {
		super(eNS_URI, Iot2Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link Iot2Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Iot2Package init() {
		if (isInited) return (Iot2Package)EPackage.Registry.INSTANCE.getEPackage(Iot2Package.eNS_URI);

		// Obtain or create and register package
		Iot2PackageImpl theIot2Package = (Iot2PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Iot2PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Iot2PackageImpl());

		isInited = true;

		// Create package meta-data objects
		theIot2Package.createPackageContents();

		// Initialize created meta-data
		theIot2Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIot2Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Iot2Package.eNS_URI, theIot2Package);
		return theIot2Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystem() {
		return systemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystem_Name() {
		return (EAttribute)systemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Components() {
		return (EReference)systemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Boards() {
		return (EReference)systemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Sketch() {
		return (EReference)systemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoard() {
		return boardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoard_Name() {
		return (EAttribute)boardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoard_Type() {
		return (EAttribute)boardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBoard_Components() {
		return (EReference)boardEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSketch() {
		return sketchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSketch_Activity() {
		return (EReference)sketchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHWComponent() {
		return hwComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHWComponent_Name() {
		return (EAttribute)hwComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHWComponent_Services() {
		return (EReference)hwComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensor() {
		return sensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActuator() {
		return actuatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivity() {
		return activityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Nodes() {
		return (EReference)activityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Edges() {
		return (EReference)activityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Locals() {
		return (EReference)activityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Inputs() {
		return (EReference)activityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationDef() {
		return operationDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDef_Parameters() {
		return (EReference)operationDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationDef_IsOneway() {
		return (EAttribute)operationDefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationDef_Contexts() {
		return (EAttribute)operationDefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDef_CanRaise() {
		return (EReference)operationDefEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDef_Lua() {
		return (EReference)operationDefEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContained() {
		return containedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContained_RepositoryId() {
		return (EAttribute)containedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContained_Version() {
		return (EAttribute)containedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContained_AbsoluteName() {
		return (EAttribute)containedEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContained_DefinedIn() {
		return (EReference)containedEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Identifier() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainer() {
		return containerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainer_Contains() {
		return (EReference)containerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTyped() {
		return typedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTyped_ContainedType() {
		return (EReference)typedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTyped_SharedType() {
		return (EReference)typedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIDLType() {
		return idlTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIDLType_TypeCode() {
		return (EAttribute)idlTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypedefDef() {
		return typedefDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterDef() {
		return parameterDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterDef_Identifier() {
		return (EAttribute)parameterDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterDef_Direction() {
		return (EAttribute)parameterDefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExceptionDef() {
		return exceptionDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExceptionDef_TypeCode() {
		return (EAttribute)exceptionDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExceptionDef_Members() {
		return (EReference)exceptionDefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getField() {
		return fieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getField_Identifier() {
		return (EAttribute)fieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getField_Value() {
		return (EReference)fieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveDef() {
		return primitiveDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrimitiveDef_Kind() {
		return (EAttribute)primitiveDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChunk() {
		return chunkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlock() {
		return blockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlock_Statements() {
		return (EReference)blockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlock_ReturnValue() {
		return (EReference)blockEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLastStatement() {
		return lastStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLastStatement_Return() {
		return lastStatement_ReturnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLastStatement_Break() {
		return lastStatement_BreakEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement() {
		return statementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement_Block() {
		return statement_BlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_Block_Block() {
		return (EReference)statement_BlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement_While() {
		return statement_WhileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_While_Expression() {
		return (EReference)statement_WhileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_While_Block() {
		return (EReference)statement_WhileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement_Repeat() {
		return statement_RepeatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_Repeat_Block() {
		return (EReference)statement_RepeatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_Repeat_Expression() {
		return (EReference)statement_RepeatEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement_If_Then_Else() {
		return statement_If_Then_ElseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_If_Then_Else_IfExpression() {
		return (EReference)statement_If_Then_ElseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_If_Then_Else_IfBlock() {
		return (EReference)statement_If_Then_ElseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_If_Then_Else_ElseIf() {
		return (EReference)statement_If_Then_ElseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_If_Then_Else_ElseBlock() {
		return (EReference)statement_If_Then_ElseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement_If_Then_Else_ElseIfPart() {
		return statement_If_Then_Else_ElseIfPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_If_Then_Else_ElseIfPart_ElseifExpression() {
		return (EReference)statement_If_Then_Else_ElseIfPartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_If_Then_Else_ElseIfPart_ElseifBlock() {
		return (EReference)statement_If_Then_Else_ElseIfPartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement_For_Numeric() {
		return statement_For_NumericEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatement_For_Numeric_IteratorName() {
		return (EAttribute)statement_For_NumericEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_For_Numeric_StartExpr() {
		return (EReference)statement_For_NumericEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_For_Numeric_UntilExpr() {
		return (EReference)statement_For_NumericEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_For_Numeric_StepExpr() {
		return (EReference)statement_For_NumericEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_For_Numeric_Block() {
		return (EReference)statement_For_NumericEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement_For_Generic() {
		return statement_For_GenericEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatement_For_Generic_Names() {
		return (EAttribute)statement_For_GenericEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_For_Generic_Expressions() {
		return (EReference)statement_For_GenericEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_For_Generic_Block() {
		return (EReference)statement_For_GenericEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement_GlobalFunction_Declaration() {
		return statement_GlobalFunction_DeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatement_GlobalFunction_Declaration_Prefix() {
		return (EAttribute)statement_GlobalFunction_DeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatement_GlobalFunction_Declaration_FunctionName() {
		return (EAttribute)statement_GlobalFunction_DeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_GlobalFunction_Declaration_Function() {
		return (EReference)statement_GlobalFunction_DeclarationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement_LocalFunction_Declaration() {
		return statement_LocalFunction_DeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatement_LocalFunction_Declaration_FunctionName() {
		return (EAttribute)statement_LocalFunction_DeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_LocalFunction_Declaration_Function() {
		return (EReference)statement_LocalFunction_DeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement_Local_Variable_Declaration() {
		return statement_Local_Variable_DeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatement_Local_Variable_Declaration_VariableNames() {
		return (EAttribute)statement_Local_Variable_DeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_Local_Variable_Declaration_InitialValue() {
		return (EReference)statement_Local_Variable_DeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement_FunctioncallOrAssignment() {
		return statement_FunctioncallOrAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_Nil() {
		return expression_NilEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_True() {
		return expression_TrueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_False() {
		return expression_FalseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_Number() {
		return expression_NumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpression_Number_Value() {
		return (EAttribute)expression_NumberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_VarArgs() {
		return expression_VarArgsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_String() {
		return expression_StringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpression_String_Value() {
		return (EAttribute)expression_StringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_Function() {
		return expression_FunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Function_Function() {
		return (EReference)expression_FunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_TableConstructor() {
		return expression_TableConstructorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_TableConstructor_Fields() {
		return (EReference)expression_TableConstructorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunction() {
		return functionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunction_Parameters() {
		return (EAttribute)functionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunction_VarArgs() {
		return (EAttribute)functionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunction_Body() {
		return (EReference)functionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctioncall_Arguments() {
		return functioncall_ArgumentsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctioncall_Arguments_Arguments() {
		return (EReference)functioncall_ArgumentsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getField_AddEntryToTable_Brackets() {
		return field_AddEntryToTable_BracketsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getField_AddEntryToTable_Brackets_IndexExpression() {
		return (EReference)field_AddEntryToTable_BracketsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getField_AddEntryToTable() {
		return field_AddEntryToTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getField_AddEntryToTable_Key() {
		return (EAttribute)field_AddEntryToTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getField_AppendEntryToTable() {
		return field_AppendEntryToTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLastStatement_ReturnWithValue() {
		return lastStatement_ReturnWithValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLastStatement_ReturnWithValue_ReturnValues() {
		return (EReference)lastStatement_ReturnWithValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement_Assignment() {
		return statement_AssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_Assignment_Variable() {
		return (EReference)statement_AssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_Assignment_Values() {
		return (EReference)statement_AssignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement_CallMemberFunction() {
		return statement_CallMemberFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_CallMemberFunction_Object() {
		return (EReference)statement_CallMemberFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatement_CallMemberFunction_MemberFunctionName() {
		return (EAttribute)statement_CallMemberFunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_CallMemberFunction_Arguments() {
		return (EReference)statement_CallMemberFunctionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement_CallFunction() {
		return statement_CallFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_CallFunction_Object() {
		return (EReference)statement_CallFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_CallFunction_Arguments() {
		return (EReference)statement_CallFunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_Or() {
		return expression_OrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Or_Left() {
		return (EReference)expression_OrEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Or_Right() {
		return (EReference)expression_OrEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_And() {
		return expression_AndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_And_Left() {
		return (EReference)expression_AndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_And_Right() {
		return (EReference)expression_AndEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_Larger() {
		return expression_LargerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Larger_Left() {
		return (EReference)expression_LargerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Larger_Right() {
		return (EReference)expression_LargerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_Larger_Equal() {
		return expression_Larger_EqualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Larger_Equal_Left() {
		return (EReference)expression_Larger_EqualEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Larger_Equal_Right() {
		return (EReference)expression_Larger_EqualEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_Smaller() {
		return expression_SmallerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Smaller_Left() {
		return (EReference)expression_SmallerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Smaller_Right() {
		return (EReference)expression_SmallerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_Smaller_Equal() {
		return expression_Smaller_EqualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Smaller_Equal_Left() {
		return (EReference)expression_Smaller_EqualEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Smaller_Equal_Right() {
		return (EReference)expression_Smaller_EqualEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_Equal() {
		return expression_EqualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Equal_Left() {
		return (EReference)expression_EqualEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Equal_Right() {
		return (EReference)expression_EqualEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_Not_Equal() {
		return expression_Not_EqualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Not_Equal_Left() {
		return (EReference)expression_Not_EqualEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Not_Equal_Right() {
		return (EReference)expression_Not_EqualEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_Concatenation() {
		return expression_ConcatenationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Concatenation_Left() {
		return (EReference)expression_ConcatenationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Concatenation_Right() {
		return (EReference)expression_ConcatenationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_Plus() {
		return expression_PlusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Plus_Left() {
		return (EReference)expression_PlusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Plus_Right() {
		return (EReference)expression_PlusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_Minus() {
		return expression_MinusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Minus_Left() {
		return (EReference)expression_MinusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Minus_Right() {
		return (EReference)expression_MinusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_Multiplication() {
		return expression_MultiplicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Multiplication_Left() {
		return (EReference)expression_MultiplicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Multiplication_Right() {
		return (EReference)expression_MultiplicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_Division() {
		return expression_DivisionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Division_Left() {
		return (EReference)expression_DivisionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Division_Right() {
		return (EReference)expression_DivisionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_Modulo() {
		return expression_ModuloEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Modulo_Left() {
		return (EReference)expression_ModuloEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Modulo_Right() {
		return (EReference)expression_ModuloEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_Negate() {
		return expression_NegateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Negate_Exp() {
		return (EReference)expression_NegateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_Length() {
		return expression_LengthEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Length_Exp() {
		return (EReference)expression_LengthEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_Invert() {
		return expression_InvertEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Invert_Exp() {
		return (EReference)expression_InvertEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_Exponentiation() {
		return expression_ExponentiationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Exponentiation_Left() {
		return (EReference)expression_ExponentiationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Exponentiation_Right() {
		return (EReference)expression_ExponentiationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_CallMemberFunction() {
		return expression_CallMemberFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_CallMemberFunction_Object() {
		return (EReference)expression_CallMemberFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpression_CallMemberFunction_MemberFunctionName() {
		return (EAttribute)expression_CallMemberFunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_CallMemberFunction_Arguments() {
		return (EReference)expression_CallMemberFunctionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_CallFunction() {
		return expression_CallFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_CallFunction_Object() {
		return (EReference)expression_CallFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_CallFunction_Arguments() {
		return (EReference)expression_CallFunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_AccessArray() {
		return expression_AccessArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_AccessArray_Array() {
		return (EReference)expression_AccessArrayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_AccessArray_Index() {
		return (EReference)expression_AccessArrayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_AccessMember() {
		return expression_AccessMemberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_AccessMember_Object() {
		return (EReference)expression_AccessMemberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpression_AccessMember_MemberName() {
		return (EAttribute)expression_AccessMemberEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_VariableName() {
		return expression_VariableNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpression_VariableName_Variable() {
		return (EAttribute)expression_VariableNameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityNode() {
		return activityNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNode_Outgoing() {
		return (EReference)activityNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNode_Incoming() {
		return (EReference)activityNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNode_Activity() {
		return (EReference)activityNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityNode_Running() {
		return (EAttribute)activityNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityEdge() {
		return activityEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdge_Source() {
		return (EReference)activityEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdge_Target() {
		return (EReference)activityEdgeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlFlow() {
		return controlFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlFlow_Guard() {
		return (EReference)controlFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlNode() {
		return controlNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutableNode() {
		return executableNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpaqueAction() {
		return opaqueActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpaqueAction_Expressions() {
		return (EReference)opaqueActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpaqueAction_Service() {
		return (EReference)opaqueActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitialNode() {
		return initialNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFinalNode() {
		return finalNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityFinalNode() {
		return activityFinalNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForkNode() {
		return forkNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJoinNode() {
		return joinNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMergeNode() {
		return mergeNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecisionNode() {
		return decisionNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_InitialValue() {
		return (EReference)variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Name() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_CurrentValue() {
		return (EReference)variableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerVariable() {
		return integerVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanVariable() {
		return booleanVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValue() {
		return valueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanValue() {
		return booleanValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanValue_Value() {
		return (EAttribute)booleanValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerValue() {
		return integerValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerValue_Value() {
		return (EAttribute)integerValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerExpression() {
		return integerExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegerExpression_Operand2() {
		return (EReference)integerExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegerExpression_Operand1() {
		return (EReference)integerExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanExpression() {
		return booleanExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanExpression_Assignee() {
		return (EReference)booleanExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerCalculationExpression() {
		return integerCalculationExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegerCalculationExpression_Assignee() {
		return (EReference)integerCalculationExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerCalculationExpression_Operator() {
		return (EAttribute)integerCalculationExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerComparisonExpression() {
		return integerComparisonExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegerComparisonExpression_Assignee() {
		return (EReference)integerComparisonExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerComparisonExpression_Operator() {
		return (EAttribute)integerComparisonExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanUnaryExpression() {
		return booleanUnaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanUnaryExpression_Operand() {
		return (EReference)booleanUnaryExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanUnaryExpression_Operator() {
		return (EAttribute)booleanUnaryExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanBinaryExpression() {
		return booleanBinaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanBinaryExpression_Operand1() {
		return (EReference)booleanBinaryExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanBinaryExpression_Operand2() {
		return (EReference)booleanBinaryExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanBinaryExpression_Operator() {
		return (EAttribute)booleanBinaryExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputValue() {
		return inputValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputValue_Value() {
		return (EReference)inputValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputValue_Variable() {
		return (EReference)inputValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInput() {
		return inputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInput_InputValues() {
		return (EReference)inputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToken() {
		return tokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToken_Holder() {
		return (EReference)tokenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrace() {
		return traceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_ExecutedNodes() {
		return (EReference)traceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBoardType() {
		return boardTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getParameterMode() {
		return parameterModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPrimitiveKind() {
		return primitiveKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIntegerCalculationOperator() {
		return integerCalculationOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIntegerComparisonOperator() {
		return integerComparisonOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBooleanUnaryOperator() {
		return booleanUnaryOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBooleanBinaryOperator() {
		return booleanBinaryOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getETypeCode() {
		return eTypeCodeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getObject() {
		return objectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStack() {
		return stackEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Iot2Factory getIot2Factory() {
		return (Iot2Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		systemEClass = createEClass(SYSTEM);
		createEAttribute(systemEClass, SYSTEM__NAME);
		createEReference(systemEClass, SYSTEM__COMPONENTS);
		createEReference(systemEClass, SYSTEM__BOARDS);
		createEReference(systemEClass, SYSTEM__SKETCH);

		boardEClass = createEClass(BOARD);
		createEAttribute(boardEClass, BOARD__NAME);
		createEAttribute(boardEClass, BOARD__TYPE);
		createEReference(boardEClass, BOARD__COMPONENTS);

		sketchEClass = createEClass(SKETCH);
		createEReference(sketchEClass, SKETCH__ACTIVITY);

		hwComponentEClass = createEClass(HW_COMPONENT);
		createEAttribute(hwComponentEClass, HW_COMPONENT__NAME);
		createEReference(hwComponentEClass, HW_COMPONENT__SERVICES);

		sensorEClass = createEClass(SENSOR);

		actuatorEClass = createEClass(ACTUATOR);

		activityEClass = createEClass(ACTIVITY);
		createEReference(activityEClass, ACTIVITY__NODES);
		createEReference(activityEClass, ACTIVITY__EDGES);
		createEReference(activityEClass, ACTIVITY__LOCALS);
		createEReference(activityEClass, ACTIVITY__INPUTS);

		operationDefEClass = createEClass(OPERATION_DEF);
		createEReference(operationDefEClass, OPERATION_DEF__PARAMETERS);
		createEAttribute(operationDefEClass, OPERATION_DEF__IS_ONEWAY);
		createEAttribute(operationDefEClass, OPERATION_DEF__CONTEXTS);
		createEReference(operationDefEClass, OPERATION_DEF__CAN_RAISE);
		createEReference(operationDefEClass, OPERATION_DEF__LUA);

		containedEClass = createEClass(CONTAINED);
		createEAttribute(containedEClass, CONTAINED__REPOSITORY_ID);
		createEAttribute(containedEClass, CONTAINED__VERSION);
		createEAttribute(containedEClass, CONTAINED__ABSOLUTE_NAME);
		createEReference(containedEClass, CONTAINED__DEFINED_IN);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__IDENTIFIER);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		containerEClass = createEClass(CONTAINER);
		createEReference(containerEClass, CONTAINER__CONTAINS);

		typedEClass = createEClass(TYPED);
		createEReference(typedEClass, TYPED__CONTAINED_TYPE);
		createEReference(typedEClass, TYPED__SHARED_TYPE);

		idlTypeEClass = createEClass(IDL_TYPE);
		createEAttribute(idlTypeEClass, IDL_TYPE__TYPE_CODE);

		typedefDefEClass = createEClass(TYPEDEF_DEF);

		parameterDefEClass = createEClass(PARAMETER_DEF);
		createEAttribute(parameterDefEClass, PARAMETER_DEF__IDENTIFIER);
		createEAttribute(parameterDefEClass, PARAMETER_DEF__DIRECTION);

		exceptionDefEClass = createEClass(EXCEPTION_DEF);
		createEAttribute(exceptionDefEClass, EXCEPTION_DEF__TYPE_CODE);
		createEReference(exceptionDefEClass, EXCEPTION_DEF__MEMBERS);

		fieldEClass = createEClass(FIELD);
		createEAttribute(fieldEClass, FIELD__IDENTIFIER);
		createEReference(fieldEClass, FIELD__VALUE);

		primitiveDefEClass = createEClass(PRIMITIVE_DEF);
		createEAttribute(primitiveDefEClass, PRIMITIVE_DEF__KIND);

		chunkEClass = createEClass(CHUNK);

		blockEClass = createEClass(BLOCK);
		createEReference(blockEClass, BLOCK__STATEMENTS);
		createEReference(blockEClass, BLOCK__RETURN_VALUE);

		lastStatementEClass = createEClass(LAST_STATEMENT);

		lastStatement_ReturnEClass = createEClass(LAST_STATEMENT_RETURN);

		lastStatement_BreakEClass = createEClass(LAST_STATEMENT_BREAK);

		statementEClass = createEClass(STATEMENT);

		statement_BlockEClass = createEClass(STATEMENT_BLOCK);
		createEReference(statement_BlockEClass, STATEMENT_BLOCK__BLOCK);

		statement_WhileEClass = createEClass(STATEMENT_WHILE);
		createEReference(statement_WhileEClass, STATEMENT_WHILE__EXPRESSION);
		createEReference(statement_WhileEClass, STATEMENT_WHILE__BLOCK);

		statement_RepeatEClass = createEClass(STATEMENT_REPEAT);
		createEReference(statement_RepeatEClass, STATEMENT_REPEAT__BLOCK);
		createEReference(statement_RepeatEClass, STATEMENT_REPEAT__EXPRESSION);

		statement_If_Then_ElseEClass = createEClass(STATEMENT_IF_THEN_ELSE);
		createEReference(statement_If_Then_ElseEClass, STATEMENT_IF_THEN_ELSE__IF_EXPRESSION);
		createEReference(statement_If_Then_ElseEClass, STATEMENT_IF_THEN_ELSE__IF_BLOCK);
		createEReference(statement_If_Then_ElseEClass, STATEMENT_IF_THEN_ELSE__ELSE_IF);
		createEReference(statement_If_Then_ElseEClass, STATEMENT_IF_THEN_ELSE__ELSE_BLOCK);

		statement_If_Then_Else_ElseIfPartEClass = createEClass(STATEMENT_IF_THEN_ELSE_ELSE_IF_PART);
		createEReference(statement_If_Then_Else_ElseIfPartEClass, STATEMENT_IF_THEN_ELSE_ELSE_IF_PART__ELSEIF_EXPRESSION);
		createEReference(statement_If_Then_Else_ElseIfPartEClass, STATEMENT_IF_THEN_ELSE_ELSE_IF_PART__ELSEIF_BLOCK);

		statement_For_NumericEClass = createEClass(STATEMENT_FOR_NUMERIC);
		createEAttribute(statement_For_NumericEClass, STATEMENT_FOR_NUMERIC__ITERATOR_NAME);
		createEReference(statement_For_NumericEClass, STATEMENT_FOR_NUMERIC__START_EXPR);
		createEReference(statement_For_NumericEClass, STATEMENT_FOR_NUMERIC__UNTIL_EXPR);
		createEReference(statement_For_NumericEClass, STATEMENT_FOR_NUMERIC__STEP_EXPR);
		createEReference(statement_For_NumericEClass, STATEMENT_FOR_NUMERIC__BLOCK);

		statement_For_GenericEClass = createEClass(STATEMENT_FOR_GENERIC);
		createEAttribute(statement_For_GenericEClass, STATEMENT_FOR_GENERIC__NAMES);
		createEReference(statement_For_GenericEClass, STATEMENT_FOR_GENERIC__EXPRESSIONS);
		createEReference(statement_For_GenericEClass, STATEMENT_FOR_GENERIC__BLOCK);

		statement_GlobalFunction_DeclarationEClass = createEClass(STATEMENT_GLOBAL_FUNCTION_DECLARATION);
		createEAttribute(statement_GlobalFunction_DeclarationEClass, STATEMENT_GLOBAL_FUNCTION_DECLARATION__PREFIX);
		createEAttribute(statement_GlobalFunction_DeclarationEClass, STATEMENT_GLOBAL_FUNCTION_DECLARATION__FUNCTION_NAME);
		createEReference(statement_GlobalFunction_DeclarationEClass, STATEMENT_GLOBAL_FUNCTION_DECLARATION__FUNCTION);

		statement_LocalFunction_DeclarationEClass = createEClass(STATEMENT_LOCAL_FUNCTION_DECLARATION);
		createEAttribute(statement_LocalFunction_DeclarationEClass, STATEMENT_LOCAL_FUNCTION_DECLARATION__FUNCTION_NAME);
		createEReference(statement_LocalFunction_DeclarationEClass, STATEMENT_LOCAL_FUNCTION_DECLARATION__FUNCTION);

		statement_Local_Variable_DeclarationEClass = createEClass(STATEMENT_LOCAL_VARIABLE_DECLARATION);
		createEAttribute(statement_Local_Variable_DeclarationEClass, STATEMENT_LOCAL_VARIABLE_DECLARATION__VARIABLE_NAMES);
		createEReference(statement_Local_Variable_DeclarationEClass, STATEMENT_LOCAL_VARIABLE_DECLARATION__INITIAL_VALUE);

		statement_FunctioncallOrAssignmentEClass = createEClass(STATEMENT_FUNCTIONCALL_OR_ASSIGNMENT);

		expressionEClass = createEClass(EXPRESSION);

		expression_NilEClass = createEClass(EXPRESSION_NIL);

		expression_TrueEClass = createEClass(EXPRESSION_TRUE);

		expression_FalseEClass = createEClass(EXPRESSION_FALSE);

		expression_NumberEClass = createEClass(EXPRESSION_NUMBER);
		createEAttribute(expression_NumberEClass, EXPRESSION_NUMBER__VALUE);

		expression_VarArgsEClass = createEClass(EXPRESSION_VAR_ARGS);

		expression_StringEClass = createEClass(EXPRESSION_STRING);
		createEAttribute(expression_StringEClass, EXPRESSION_STRING__VALUE);

		expression_FunctionEClass = createEClass(EXPRESSION_FUNCTION);
		createEReference(expression_FunctionEClass, EXPRESSION_FUNCTION__FUNCTION);

		expression_TableConstructorEClass = createEClass(EXPRESSION_TABLE_CONSTRUCTOR);
		createEReference(expression_TableConstructorEClass, EXPRESSION_TABLE_CONSTRUCTOR__FIELDS);

		functionEClass = createEClass(FUNCTION);
		createEAttribute(functionEClass, FUNCTION__PARAMETERS);
		createEAttribute(functionEClass, FUNCTION__VAR_ARGS);
		createEReference(functionEClass, FUNCTION__BODY);

		functioncall_ArgumentsEClass = createEClass(FUNCTIONCALL_ARGUMENTS);
		createEReference(functioncall_ArgumentsEClass, FUNCTIONCALL_ARGUMENTS__ARGUMENTS);

		field_AddEntryToTable_BracketsEClass = createEClass(FIELD_ADD_ENTRY_TO_TABLE_BRACKETS);
		createEReference(field_AddEntryToTable_BracketsEClass, FIELD_ADD_ENTRY_TO_TABLE_BRACKETS__INDEX_EXPRESSION);

		field_AddEntryToTableEClass = createEClass(FIELD_ADD_ENTRY_TO_TABLE);
		createEAttribute(field_AddEntryToTableEClass, FIELD_ADD_ENTRY_TO_TABLE__KEY);

		field_AppendEntryToTableEClass = createEClass(FIELD_APPEND_ENTRY_TO_TABLE);

		lastStatement_ReturnWithValueEClass = createEClass(LAST_STATEMENT_RETURN_WITH_VALUE);
		createEReference(lastStatement_ReturnWithValueEClass, LAST_STATEMENT_RETURN_WITH_VALUE__RETURN_VALUES);

		statement_AssignmentEClass = createEClass(STATEMENT_ASSIGNMENT);
		createEReference(statement_AssignmentEClass, STATEMENT_ASSIGNMENT__VARIABLE);
		createEReference(statement_AssignmentEClass, STATEMENT_ASSIGNMENT__VALUES);

		statement_CallMemberFunctionEClass = createEClass(STATEMENT_CALL_MEMBER_FUNCTION);
		createEReference(statement_CallMemberFunctionEClass, STATEMENT_CALL_MEMBER_FUNCTION__OBJECT);
		createEAttribute(statement_CallMemberFunctionEClass, STATEMENT_CALL_MEMBER_FUNCTION__MEMBER_FUNCTION_NAME);
		createEReference(statement_CallMemberFunctionEClass, STATEMENT_CALL_MEMBER_FUNCTION__ARGUMENTS);

		statement_CallFunctionEClass = createEClass(STATEMENT_CALL_FUNCTION);
		createEReference(statement_CallFunctionEClass, STATEMENT_CALL_FUNCTION__OBJECT);
		createEReference(statement_CallFunctionEClass, STATEMENT_CALL_FUNCTION__ARGUMENTS);

		expression_OrEClass = createEClass(EXPRESSION_OR);
		createEReference(expression_OrEClass, EXPRESSION_OR__LEFT);
		createEReference(expression_OrEClass, EXPRESSION_OR__RIGHT);

		expression_AndEClass = createEClass(EXPRESSION_AND);
		createEReference(expression_AndEClass, EXPRESSION_AND__LEFT);
		createEReference(expression_AndEClass, EXPRESSION_AND__RIGHT);

		expression_LargerEClass = createEClass(EXPRESSION_LARGER);
		createEReference(expression_LargerEClass, EXPRESSION_LARGER__LEFT);
		createEReference(expression_LargerEClass, EXPRESSION_LARGER__RIGHT);

		expression_Larger_EqualEClass = createEClass(EXPRESSION_LARGER_EQUAL);
		createEReference(expression_Larger_EqualEClass, EXPRESSION_LARGER_EQUAL__LEFT);
		createEReference(expression_Larger_EqualEClass, EXPRESSION_LARGER_EQUAL__RIGHT);

		expression_SmallerEClass = createEClass(EXPRESSION_SMALLER);
		createEReference(expression_SmallerEClass, EXPRESSION_SMALLER__LEFT);
		createEReference(expression_SmallerEClass, EXPRESSION_SMALLER__RIGHT);

		expression_Smaller_EqualEClass = createEClass(EXPRESSION_SMALLER_EQUAL);
		createEReference(expression_Smaller_EqualEClass, EXPRESSION_SMALLER_EQUAL__LEFT);
		createEReference(expression_Smaller_EqualEClass, EXPRESSION_SMALLER_EQUAL__RIGHT);

		expression_EqualEClass = createEClass(EXPRESSION_EQUAL);
		createEReference(expression_EqualEClass, EXPRESSION_EQUAL__LEFT);
		createEReference(expression_EqualEClass, EXPRESSION_EQUAL__RIGHT);

		expression_Not_EqualEClass = createEClass(EXPRESSION_NOT_EQUAL);
		createEReference(expression_Not_EqualEClass, EXPRESSION_NOT_EQUAL__LEFT);
		createEReference(expression_Not_EqualEClass, EXPRESSION_NOT_EQUAL__RIGHT);

		expression_ConcatenationEClass = createEClass(EXPRESSION_CONCATENATION);
		createEReference(expression_ConcatenationEClass, EXPRESSION_CONCATENATION__LEFT);
		createEReference(expression_ConcatenationEClass, EXPRESSION_CONCATENATION__RIGHT);

		expression_PlusEClass = createEClass(EXPRESSION_PLUS);
		createEReference(expression_PlusEClass, EXPRESSION_PLUS__LEFT);
		createEReference(expression_PlusEClass, EXPRESSION_PLUS__RIGHT);

		expression_MinusEClass = createEClass(EXPRESSION_MINUS);
		createEReference(expression_MinusEClass, EXPRESSION_MINUS__LEFT);
		createEReference(expression_MinusEClass, EXPRESSION_MINUS__RIGHT);

		expression_MultiplicationEClass = createEClass(EXPRESSION_MULTIPLICATION);
		createEReference(expression_MultiplicationEClass, EXPRESSION_MULTIPLICATION__LEFT);
		createEReference(expression_MultiplicationEClass, EXPRESSION_MULTIPLICATION__RIGHT);

		expression_DivisionEClass = createEClass(EXPRESSION_DIVISION);
		createEReference(expression_DivisionEClass, EXPRESSION_DIVISION__LEFT);
		createEReference(expression_DivisionEClass, EXPRESSION_DIVISION__RIGHT);

		expression_ModuloEClass = createEClass(EXPRESSION_MODULO);
		createEReference(expression_ModuloEClass, EXPRESSION_MODULO__LEFT);
		createEReference(expression_ModuloEClass, EXPRESSION_MODULO__RIGHT);

		expression_NegateEClass = createEClass(EXPRESSION_NEGATE);
		createEReference(expression_NegateEClass, EXPRESSION_NEGATE__EXP);

		expression_LengthEClass = createEClass(EXPRESSION_LENGTH);
		createEReference(expression_LengthEClass, EXPRESSION_LENGTH__EXP);

		expression_InvertEClass = createEClass(EXPRESSION_INVERT);
		createEReference(expression_InvertEClass, EXPRESSION_INVERT__EXP);

		expression_ExponentiationEClass = createEClass(EXPRESSION_EXPONENTIATION);
		createEReference(expression_ExponentiationEClass, EXPRESSION_EXPONENTIATION__LEFT);
		createEReference(expression_ExponentiationEClass, EXPRESSION_EXPONENTIATION__RIGHT);

		expression_CallMemberFunctionEClass = createEClass(EXPRESSION_CALL_MEMBER_FUNCTION);
		createEReference(expression_CallMemberFunctionEClass, EXPRESSION_CALL_MEMBER_FUNCTION__OBJECT);
		createEAttribute(expression_CallMemberFunctionEClass, EXPRESSION_CALL_MEMBER_FUNCTION__MEMBER_FUNCTION_NAME);
		createEReference(expression_CallMemberFunctionEClass, EXPRESSION_CALL_MEMBER_FUNCTION__ARGUMENTS);

		expression_CallFunctionEClass = createEClass(EXPRESSION_CALL_FUNCTION);
		createEReference(expression_CallFunctionEClass, EXPRESSION_CALL_FUNCTION__OBJECT);
		createEReference(expression_CallFunctionEClass, EXPRESSION_CALL_FUNCTION__ARGUMENTS);

		expression_AccessArrayEClass = createEClass(EXPRESSION_ACCESS_ARRAY);
		createEReference(expression_AccessArrayEClass, EXPRESSION_ACCESS_ARRAY__ARRAY);
		createEReference(expression_AccessArrayEClass, EXPRESSION_ACCESS_ARRAY__INDEX);

		expression_AccessMemberEClass = createEClass(EXPRESSION_ACCESS_MEMBER);
		createEReference(expression_AccessMemberEClass, EXPRESSION_ACCESS_MEMBER__OBJECT);
		createEAttribute(expression_AccessMemberEClass, EXPRESSION_ACCESS_MEMBER__MEMBER_NAME);

		expression_VariableNameEClass = createEClass(EXPRESSION_VARIABLE_NAME);
		createEAttribute(expression_VariableNameEClass, EXPRESSION_VARIABLE_NAME__VARIABLE);

		activityNodeEClass = createEClass(ACTIVITY_NODE);
		createEReference(activityNodeEClass, ACTIVITY_NODE__OUTGOING);
		createEReference(activityNodeEClass, ACTIVITY_NODE__INCOMING);
		createEReference(activityNodeEClass, ACTIVITY_NODE__ACTIVITY);
		createEAttribute(activityNodeEClass, ACTIVITY_NODE__RUNNING);

		activityEdgeEClass = createEClass(ACTIVITY_EDGE);
		createEReference(activityEdgeEClass, ACTIVITY_EDGE__SOURCE);
		createEReference(activityEdgeEClass, ACTIVITY_EDGE__TARGET);

		controlFlowEClass = createEClass(CONTROL_FLOW);
		createEReference(controlFlowEClass, CONTROL_FLOW__GUARD);

		controlNodeEClass = createEClass(CONTROL_NODE);

		executableNodeEClass = createEClass(EXECUTABLE_NODE);

		actionEClass = createEClass(ACTION);

		opaqueActionEClass = createEClass(OPAQUE_ACTION);
		createEReference(opaqueActionEClass, OPAQUE_ACTION__EXPRESSIONS);
		createEReference(opaqueActionEClass, OPAQUE_ACTION__SERVICE);

		initialNodeEClass = createEClass(INITIAL_NODE);

		finalNodeEClass = createEClass(FINAL_NODE);

		activityFinalNodeEClass = createEClass(ACTIVITY_FINAL_NODE);

		forkNodeEClass = createEClass(FORK_NODE);

		joinNodeEClass = createEClass(JOIN_NODE);

		mergeNodeEClass = createEClass(MERGE_NODE);

		decisionNodeEClass = createEClass(DECISION_NODE);

		variableEClass = createEClass(VARIABLE);
		createEReference(variableEClass, VARIABLE__INITIAL_VALUE);
		createEAttribute(variableEClass, VARIABLE__NAME);
		createEReference(variableEClass, VARIABLE__CURRENT_VALUE);

		integerVariableEClass = createEClass(INTEGER_VARIABLE);

		booleanVariableEClass = createEClass(BOOLEAN_VARIABLE);

		valueEClass = createEClass(VALUE);

		booleanValueEClass = createEClass(BOOLEAN_VALUE);
		createEAttribute(booleanValueEClass, BOOLEAN_VALUE__VALUE);

		integerValueEClass = createEClass(INTEGER_VALUE);
		createEAttribute(integerValueEClass, INTEGER_VALUE__VALUE);

		integerExpressionEClass = createEClass(INTEGER_EXPRESSION);
		createEReference(integerExpressionEClass, INTEGER_EXPRESSION__OPERAND2);
		createEReference(integerExpressionEClass, INTEGER_EXPRESSION__OPERAND1);

		booleanExpressionEClass = createEClass(BOOLEAN_EXPRESSION);
		createEReference(booleanExpressionEClass, BOOLEAN_EXPRESSION__ASSIGNEE);

		integerCalculationExpressionEClass = createEClass(INTEGER_CALCULATION_EXPRESSION);
		createEReference(integerCalculationExpressionEClass, INTEGER_CALCULATION_EXPRESSION__ASSIGNEE);
		createEAttribute(integerCalculationExpressionEClass, INTEGER_CALCULATION_EXPRESSION__OPERATOR);

		integerComparisonExpressionEClass = createEClass(INTEGER_COMPARISON_EXPRESSION);
		createEReference(integerComparisonExpressionEClass, INTEGER_COMPARISON_EXPRESSION__ASSIGNEE);
		createEAttribute(integerComparisonExpressionEClass, INTEGER_COMPARISON_EXPRESSION__OPERATOR);

		booleanUnaryExpressionEClass = createEClass(BOOLEAN_UNARY_EXPRESSION);
		createEReference(booleanUnaryExpressionEClass, BOOLEAN_UNARY_EXPRESSION__OPERAND);
		createEAttribute(booleanUnaryExpressionEClass, BOOLEAN_UNARY_EXPRESSION__OPERATOR);

		booleanBinaryExpressionEClass = createEClass(BOOLEAN_BINARY_EXPRESSION);
		createEReference(booleanBinaryExpressionEClass, BOOLEAN_BINARY_EXPRESSION__OPERAND1);
		createEReference(booleanBinaryExpressionEClass, BOOLEAN_BINARY_EXPRESSION__OPERAND2);
		createEAttribute(booleanBinaryExpressionEClass, BOOLEAN_BINARY_EXPRESSION__OPERATOR);

		inputValueEClass = createEClass(INPUT_VALUE);
		createEReference(inputValueEClass, INPUT_VALUE__VALUE);
		createEReference(inputValueEClass, INPUT_VALUE__VARIABLE);

		inputEClass = createEClass(INPUT);
		createEReference(inputEClass, INPUT__INPUT_VALUES);

		tokenEClass = createEClass(TOKEN);
		createEReference(tokenEClass, TOKEN__HOLDER);

		traceEClass = createEClass(TRACE);
		createEReference(traceEClass, TRACE__EXECUTED_NODES);

		// Create enums
		boardTypeEEnum = createEEnum(BOARD_TYPE);
		parameterModeEEnum = createEEnum(PARAMETER_MODE);
		primitiveKindEEnum = createEEnum(PRIMITIVE_KIND);
		integerCalculationOperatorEEnum = createEEnum(INTEGER_CALCULATION_OPERATOR);
		integerComparisonOperatorEEnum = createEEnum(INTEGER_COMPARISON_OPERATOR);
		booleanUnaryOperatorEEnum = createEEnum(BOOLEAN_UNARY_OPERATOR);
		booleanBinaryOperatorEEnum = createEEnum(BOOLEAN_BINARY_OPERATOR);

		// Create data types
		eTypeCodeEDataType = createEDataType(ETYPE_CODE);
		objectEDataType = createEDataType(OBJECT);
		stackEDataType = createEDataType(STACK);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		sensorEClass.getESuperTypes().add(this.getHWComponent());
		actuatorEClass.getESuperTypes().add(this.getHWComponent());
		activityEClass.getESuperTypes().add(this.getNamedElement());
		operationDefEClass.getESuperTypes().add(this.getContained());
		operationDefEClass.getESuperTypes().add(this.getTyped());
		containedEClass.getESuperTypes().add(this.getNamedElement());
		containerEClass.getESuperTypes().add(this.getContained());
		typedefDefEClass.getESuperTypes().add(this.getIDLType());
		typedefDefEClass.getESuperTypes().add(this.getContained());
		parameterDefEClass.getESuperTypes().add(this.getTyped());
		exceptionDefEClass.getESuperTypes().add(this.getContained());
		fieldEClass.getESuperTypes().add(this.getTyped());
		primitiveDefEClass.getESuperTypes().add(this.getIDLType());
		blockEClass.getESuperTypes().add(this.getChunk());
		lastStatement_ReturnEClass.getESuperTypes().add(this.getLastStatement());
		lastStatement_BreakEClass.getESuperTypes().add(this.getLastStatement());
		statement_BlockEClass.getESuperTypes().add(this.getStatement());
		statement_WhileEClass.getESuperTypes().add(this.getStatement());
		statement_RepeatEClass.getESuperTypes().add(this.getStatement());
		statement_If_Then_ElseEClass.getESuperTypes().add(this.getStatement());
		statement_For_NumericEClass.getESuperTypes().add(this.getStatement());
		statement_For_GenericEClass.getESuperTypes().add(this.getStatement());
		statement_GlobalFunction_DeclarationEClass.getESuperTypes().add(this.getStatement());
		statement_LocalFunction_DeclarationEClass.getESuperTypes().add(this.getStatement());
		statement_Local_Variable_DeclarationEClass.getESuperTypes().add(this.getStatement());
		statement_FunctioncallOrAssignmentEClass.getESuperTypes().add(this.getStatement());
		expressionEClass.getESuperTypes().add(this.getStatement_FunctioncallOrAssignment());
		expression_NilEClass.getESuperTypes().add(this.getExpression());
		expression_TrueEClass.getESuperTypes().add(this.getExpression());
		expression_FalseEClass.getESuperTypes().add(this.getExpression());
		expression_NumberEClass.getESuperTypes().add(this.getExpression());
		expression_VarArgsEClass.getESuperTypes().add(this.getExpression());
		expression_StringEClass.getESuperTypes().add(this.getExpression());
		expression_FunctionEClass.getESuperTypes().add(this.getExpression());
		expression_TableConstructorEClass.getESuperTypes().add(this.getExpression());
		field_AddEntryToTable_BracketsEClass.getESuperTypes().add(this.getField());
		field_AddEntryToTableEClass.getESuperTypes().add(this.getField());
		field_AppendEntryToTableEClass.getESuperTypes().add(this.getField());
		lastStatement_ReturnWithValueEClass.getESuperTypes().add(this.getLastStatement_Return());
		statement_AssignmentEClass.getESuperTypes().add(this.getStatement_FunctioncallOrAssignment());
		statement_CallMemberFunctionEClass.getESuperTypes().add(this.getStatement_FunctioncallOrAssignment());
		statement_CallFunctionEClass.getESuperTypes().add(this.getStatement_FunctioncallOrAssignment());
		expression_OrEClass.getESuperTypes().add(this.getExpression());
		expression_AndEClass.getESuperTypes().add(this.getExpression());
		expression_LargerEClass.getESuperTypes().add(this.getExpression());
		expression_Larger_EqualEClass.getESuperTypes().add(this.getExpression());
		expression_SmallerEClass.getESuperTypes().add(this.getExpression());
		expression_Smaller_EqualEClass.getESuperTypes().add(this.getExpression());
		expression_EqualEClass.getESuperTypes().add(this.getExpression());
		expression_Not_EqualEClass.getESuperTypes().add(this.getExpression());
		expression_ConcatenationEClass.getESuperTypes().add(this.getExpression());
		expression_PlusEClass.getESuperTypes().add(this.getExpression());
		expression_MinusEClass.getESuperTypes().add(this.getExpression());
		expression_MultiplicationEClass.getESuperTypes().add(this.getExpression());
		expression_DivisionEClass.getESuperTypes().add(this.getExpression());
		expression_ModuloEClass.getESuperTypes().add(this.getExpression());
		expression_NegateEClass.getESuperTypes().add(this.getExpression());
		expression_LengthEClass.getESuperTypes().add(this.getExpression());
		expression_InvertEClass.getESuperTypes().add(this.getExpression());
		expression_ExponentiationEClass.getESuperTypes().add(this.getExpression());
		expression_CallMemberFunctionEClass.getESuperTypes().add(this.getExpression());
		expression_CallFunctionEClass.getESuperTypes().add(this.getExpression());
		expression_AccessArrayEClass.getESuperTypes().add(this.getExpression());
		expression_AccessMemberEClass.getESuperTypes().add(this.getExpression());
		expression_VariableNameEClass.getESuperTypes().add(this.getExpression());
		activityNodeEClass.getESuperTypes().add(this.getNamedElement());
		activityEdgeEClass.getESuperTypes().add(this.getNamedElement());
		controlFlowEClass.getESuperTypes().add(this.getActivityEdge());
		controlNodeEClass.getESuperTypes().add(this.getActivityNode());
		executableNodeEClass.getESuperTypes().add(this.getActivityNode());
		actionEClass.getESuperTypes().add(this.getExecutableNode());
		opaqueActionEClass.getESuperTypes().add(this.getAction());
		initialNodeEClass.getESuperTypes().add(this.getControlNode());
		finalNodeEClass.getESuperTypes().add(this.getControlNode());
		activityFinalNodeEClass.getESuperTypes().add(this.getFinalNode());
		forkNodeEClass.getESuperTypes().add(this.getControlNode());
		joinNodeEClass.getESuperTypes().add(this.getControlNode());
		mergeNodeEClass.getESuperTypes().add(this.getControlNode());
		decisionNodeEClass.getESuperTypes().add(this.getControlNode());
		integerVariableEClass.getESuperTypes().add(this.getVariable());
		booleanVariableEClass.getESuperTypes().add(this.getVariable());
		booleanValueEClass.getESuperTypes().add(this.getValue());
		integerValueEClass.getESuperTypes().add(this.getValue());
		integerExpressionEClass.getESuperTypes().add(this.getExpression());
		booleanExpressionEClass.getESuperTypes().add(this.getExpression());
		integerCalculationExpressionEClass.getESuperTypes().add(this.getIntegerExpression());
		integerComparisonExpressionEClass.getESuperTypes().add(this.getIntegerExpression());
		booleanUnaryExpressionEClass.getESuperTypes().add(this.getBooleanExpression());
		booleanBinaryExpressionEClass.getESuperTypes().add(this.getBooleanExpression());

		// Initialize classes and features; add operations and parameters
		initEClass(systemEClass, fr.inria.diverse.iot2.iot2.iot2.System.class, "System", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSystem_Name(), ecorePackage.getEString(), "name", null, 0, 1, fr.inria.diverse.iot2.iot2.iot2.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_Components(), this.getHWComponent(), null, "components", null, 0, -1, fr.inria.diverse.iot2.iot2.iot2.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_Boards(), this.getBoard(), null, "boards", null, 0, -1, fr.inria.diverse.iot2.iot2.iot2.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_Sketch(), this.getSketch(), null, "sketch", null, 0, 1, fr.inria.diverse.iot2.iot2.iot2.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boardEClass, Board.class, "Board", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBoard_Name(), ecorePackage.getEString(), "name", null, 0, 1, Board.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoard_Type(), this.getBoardType(), "type", null, 0, 1, Board.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBoard_Components(), this.getHWComponent(), null, "components", null, 0, -1, Board.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sketchEClass, Sketch.class, "Sketch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSketch_Activity(), this.getActivity(), null, "activity", null, 0, 1, Sketch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hwComponentEClass, HWComponent.class, "HWComponent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHWComponent_Name(), ecorePackage.getEString(), "name", null, 0, 1, HWComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHWComponent_Services(), this.getOperationDef(), null, "services", null, 0, -1, HWComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sensorEClass, Sensor.class, "Sensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actuatorEClass, Actuator.class, "Actuator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activityEClass, Activity.class, "Activity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivity_Nodes(), this.getActivityNode(), this.getActivityNode_Activity(), "nodes", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_Edges(), this.getActivityEdge(), null, "edges", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_Locals(), this.getVariable(), null, "locals", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_Inputs(), this.getVariable(), null, "inputs", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationDefEClass, OperationDef.class, "OperationDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationDef_Parameters(), this.getParameterDef(), null, "parameters", null, 0, -1, OperationDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperationDef_IsOneway(), ecorePackage.getEBoolean(), "isOneway", null, 0, 1, OperationDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperationDef_Contexts(), ecorePackage.getEString(), "contexts", null, 0, -1, OperationDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationDef_CanRaise(), this.getExceptionDef(), null, "canRaise", null, 0, -1, OperationDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationDef_Lua(), this.getBlock(), null, "lua", null, 0, 1, OperationDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containedEClass, Contained.class, "Contained", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContained_RepositoryId(), ecorePackage.getEString(), "repositoryId", null, 0, 1, Contained.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContained_Version(), ecorePackage.getEString(), "version", null, 0, 1, Contained.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContained_AbsoluteName(), ecorePackage.getEString(), "absoluteName", null, 0, 1, Contained.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContained_DefinedIn(), this.getContainer(), this.getContainer_Contains(), "definedIn", null, 0, 1, Contained.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containerEClass, fr.inria.diverse.iot2.iot2.iot2.Container.class, "Container", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainer_Contains(), this.getContained(), this.getContained_DefinedIn(), "contains", null, 0, -1, fr.inria.diverse.iot2.iot2.iot2.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typedEClass, Typed.class, "Typed", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTyped_ContainedType(), this.getIDLType(), null, "containedType", null, 0, 1, Typed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTyped_SharedType(), this.getTypedefDef(), null, "sharedType", null, 0, 1, Typed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(idlTypeEClass, IDLType.class, "IDLType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIDLType_TypeCode(), this.getETypeCode(), "typeCode", null, 0, 1, IDLType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typedefDefEClass, TypedefDef.class, "TypedefDef", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(parameterDefEClass, ParameterDef.class, "ParameterDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameterDef_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1, ParameterDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterDef_Direction(), this.getParameterMode(), "direction", null, 0, 1, ParameterDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exceptionDefEClass, ExceptionDef.class, "ExceptionDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExceptionDef_TypeCode(), this.getETypeCode(), "typeCode", null, 0, 1, ExceptionDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExceptionDef_Members(), this.getField(), null, "members", null, 0, -1, ExceptionDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fieldEClass, Field.class, "Field", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getField_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getField_Value(), this.getExpression(), null, "value", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(primitiveDefEClass, PrimitiveDef.class, "PrimitiveDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrimitiveDef_Kind(), this.getPrimitiveKind(), "kind", null, 0, 1, PrimitiveDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(chunkEClass, Chunk.class, "Chunk", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(blockEClass, Block.class, "Block", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBlock_Statements(), this.getStatement(), null, "statements", null, 0, -1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_ReturnValue(), this.getLastStatement(), null, "returnValue", null, 0, 1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lastStatementEClass, LastStatement.class, "LastStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lastStatement_ReturnEClass, LastStatement_Return.class, "LastStatement_Return", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lastStatement_BreakEClass, LastStatement_Break.class, "LastStatement_Break", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(statementEClass, Statement.class, "Statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(statement_BlockEClass, Statement_Block.class, "Statement_Block", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStatement_Block_Block(), this.getBlock(), null, "block", null, 0, 1, Statement_Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statement_WhileEClass, Statement_While.class, "Statement_While", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStatement_While_Expression(), this.getExpression(), null, "expression", null, 0, 1, Statement_While.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStatement_While_Block(), this.getBlock(), null, "block", null, 0, 1, Statement_While.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statement_RepeatEClass, Statement_Repeat.class, "Statement_Repeat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStatement_Repeat_Block(), this.getBlock(), null, "block", null, 0, 1, Statement_Repeat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStatement_Repeat_Expression(), this.getExpression(), null, "expression", null, 0, 1, Statement_Repeat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statement_If_Then_ElseEClass, Statement_If_Then_Else.class, "Statement_If_Then_Else", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStatement_If_Then_Else_IfExpression(), this.getExpression(), null, "ifExpression", null, 0, 1, Statement_If_Then_Else.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStatement_If_Then_Else_IfBlock(), this.getBlock(), null, "ifBlock", null, 0, 1, Statement_If_Then_Else.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStatement_If_Then_Else_ElseIf(), this.getStatement_If_Then_Else_ElseIfPart(), null, "elseIf", null, 0, -1, Statement_If_Then_Else.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStatement_If_Then_Else_ElseBlock(), this.getBlock(), null, "elseBlock", null, 0, 1, Statement_If_Then_Else.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statement_If_Then_Else_ElseIfPartEClass, Statement_If_Then_Else_ElseIfPart.class, "Statement_If_Then_Else_ElseIfPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStatement_If_Then_Else_ElseIfPart_ElseifExpression(), this.getExpression(), null, "elseifExpression", null, 0, 1, Statement_If_Then_Else_ElseIfPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStatement_If_Then_Else_ElseIfPart_ElseifBlock(), this.getBlock(), null, "elseifBlock", null, 0, 1, Statement_If_Then_Else_ElseIfPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statement_For_NumericEClass, Statement_For_Numeric.class, "Statement_For_Numeric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStatement_For_Numeric_IteratorName(), ecorePackage.getEString(), "iteratorName", null, 0, 1, Statement_For_Numeric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStatement_For_Numeric_StartExpr(), this.getExpression(), null, "startExpr", null, 0, 1, Statement_For_Numeric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStatement_For_Numeric_UntilExpr(), this.getExpression(), null, "untilExpr", null, 0, 1, Statement_For_Numeric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStatement_For_Numeric_StepExpr(), this.getExpression(), null, "stepExpr", null, 0, 1, Statement_For_Numeric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStatement_For_Numeric_Block(), this.getBlock(), null, "block", null, 0, 1, Statement_For_Numeric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statement_For_GenericEClass, Statement_For_Generic.class, "Statement_For_Generic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStatement_For_Generic_Names(), ecorePackage.getEString(), "names", null, 0, -1, Statement_For_Generic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStatement_For_Generic_Expressions(), this.getExpression(), null, "expressions", null, 0, -1, Statement_For_Generic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStatement_For_Generic_Block(), this.getBlock(), null, "block", null, 0, 1, Statement_For_Generic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statement_GlobalFunction_DeclarationEClass, Statement_GlobalFunction_Declaration.class, "Statement_GlobalFunction_Declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStatement_GlobalFunction_Declaration_Prefix(), ecorePackage.getEString(), "prefix", null, 0, -1, Statement_GlobalFunction_Declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatement_GlobalFunction_Declaration_FunctionName(), ecorePackage.getEString(), "functionName", null, 0, 1, Statement_GlobalFunction_Declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStatement_GlobalFunction_Declaration_Function(), this.getFunction(), null, "function", null, 0, 1, Statement_GlobalFunction_Declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statement_LocalFunction_DeclarationEClass, Statement_LocalFunction_Declaration.class, "Statement_LocalFunction_Declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStatement_LocalFunction_Declaration_FunctionName(), ecorePackage.getEString(), "functionName", null, 0, 1, Statement_LocalFunction_Declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStatement_LocalFunction_Declaration_Function(), this.getFunction(), null, "function", null, 0, 1, Statement_LocalFunction_Declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statement_Local_Variable_DeclarationEClass, Statement_Local_Variable_Declaration.class, "Statement_Local_Variable_Declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStatement_Local_Variable_Declaration_VariableNames(), ecorePackage.getEString(), "variableNames", null, 0, -1, Statement_Local_Variable_Declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStatement_Local_Variable_Declaration_InitialValue(), this.getExpression(), null, "initialValue", null, 0, -1, Statement_Local_Variable_Declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statement_FunctioncallOrAssignmentEClass, Statement_FunctioncallOrAssignment.class, "Statement_FunctioncallOrAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(expression_NilEClass, Expression_Nil.class, "Expression_Nil", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(expression_TrueEClass, Expression_True.class, "Expression_True", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(expression_FalseEClass, Expression_False.class, "Expression_False", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(expression_NumberEClass, Expression_Number.class, "Expression_Number", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExpression_Number_Value(), ecorePackage.getEDouble(), "value", null, 0, 1, Expression_Number.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expression_VarArgsEClass, Expression_VarArgs.class, "Expression_VarArgs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(expression_StringEClass, Expression_String.class, "Expression_String", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExpression_String_Value(), ecorePackage.getEString(), "value", null, 0, 1, Expression_String.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expression_FunctionEClass, Expression_Function.class, "Expression_Function", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpression_Function_Function(), this.getFunction(), null, "function", null, 0, 1, Expression_Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expression_TableConstructorEClass, Expression_TableConstructor.class, "Expression_TableConstructor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpression_TableConstructor_Fields(), this.getField(), null, "fields", null, 0, -1, Expression_TableConstructor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionEClass, Function.class, "Function", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunction_Parameters(), ecorePackage.getEString(), "parameters", null, 0, -1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunction_VarArgs(), ecorePackage.getEBoolean(), "varArgs", null, 0, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunction_Body(), this.getBlock(), null, "body", null, 0, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functioncall_ArgumentsEClass, Functioncall_Arguments.class, "Functioncall_Arguments", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctioncall_Arguments_Arguments(), this.getExpression(), null, "arguments", null, 0, -1, Functioncall_Arguments.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(field_AddEntryToTable_BracketsEClass, Field_AddEntryToTable_Brackets.class, "Field_AddEntryToTable_Brackets", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getField_AddEntryToTable_Brackets_IndexExpression(), this.getExpression(), null, "indexExpression", null, 0, 1, Field_AddEntryToTable_Brackets.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(field_AddEntryToTableEClass, Field_AddEntryToTable.class, "Field_AddEntryToTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getField_AddEntryToTable_Key(), ecorePackage.getEString(), "key", null, 0, 1, Field_AddEntryToTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(field_AppendEntryToTableEClass, Field_AppendEntryToTable.class, "Field_AppendEntryToTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lastStatement_ReturnWithValueEClass, LastStatement_ReturnWithValue.class, "LastStatement_ReturnWithValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLastStatement_ReturnWithValue_ReturnValues(), this.getExpression(), null, "returnValues", null, 0, -1, LastStatement_ReturnWithValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statement_AssignmentEClass, Statement_Assignment.class, "Statement_Assignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStatement_Assignment_Variable(), this.getExpression(), null, "variable", null, 0, -1, Statement_Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStatement_Assignment_Values(), this.getExpression(), null, "values", null, 0, -1, Statement_Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statement_CallMemberFunctionEClass, Statement_CallMemberFunction.class, "Statement_CallMemberFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStatement_CallMemberFunction_Object(), this.getExpression(), null, "object", null, 0, 1, Statement_CallMemberFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatement_CallMemberFunction_MemberFunctionName(), ecorePackage.getEString(), "memberFunctionName", null, 0, 1, Statement_CallMemberFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStatement_CallMemberFunction_Arguments(), this.getFunctioncall_Arguments(), null, "arguments", null, 0, 1, Statement_CallMemberFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statement_CallFunctionEClass, Statement_CallFunction.class, "Statement_CallFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStatement_CallFunction_Object(), this.getExpression(), null, "object", null, 0, 1, Statement_CallFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStatement_CallFunction_Arguments(), this.getFunctioncall_Arguments(), null, "arguments", null, 0, 1, Statement_CallFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expression_OrEClass, Expression_Or.class, "Expression_Or", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpression_Or_Left(), this.getExpression(), null, "left", null, 0, 1, Expression_Or.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpression_Or_Right(), this.getExpression(), null, "right", null, 0, 1, Expression_Or.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expression_AndEClass, Expression_And.class, "Expression_And", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpression_And_Left(), this.getExpression(), null, "left", null, 0, 1, Expression_And.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpression_And_Right(), this.getExpression(), null, "right", null, 0, 1, Expression_And.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expression_LargerEClass, Expression_Larger.class, "Expression_Larger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpression_Larger_Left(), this.getExpression(), null, "left", null, 0, 1, Expression_Larger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpression_Larger_Right(), this.getExpression(), null, "right", null, 0, 1, Expression_Larger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expression_Larger_EqualEClass, Expression_Larger_Equal.class, "Expression_Larger_Equal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpression_Larger_Equal_Left(), this.getExpression(), null, "left", null, 0, 1, Expression_Larger_Equal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpression_Larger_Equal_Right(), this.getExpression(), null, "right", null, 0, 1, Expression_Larger_Equal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expression_SmallerEClass, Expression_Smaller.class, "Expression_Smaller", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpression_Smaller_Left(), this.getExpression(), null, "left", null, 0, 1, Expression_Smaller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpression_Smaller_Right(), this.getExpression(), null, "right", null, 0, 1, Expression_Smaller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expression_Smaller_EqualEClass, Expression_Smaller_Equal.class, "Expression_Smaller_Equal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpression_Smaller_Equal_Left(), this.getExpression(), null, "left", null, 0, 1, Expression_Smaller_Equal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpression_Smaller_Equal_Right(), this.getExpression(), null, "right", null, 0, 1, Expression_Smaller_Equal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expression_EqualEClass, Expression_Equal.class, "Expression_Equal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpression_Equal_Left(), this.getExpression(), null, "left", null, 0, 1, Expression_Equal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpression_Equal_Right(), this.getExpression(), null, "right", null, 0, 1, Expression_Equal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expression_Not_EqualEClass, Expression_Not_Equal.class, "Expression_Not_Equal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpression_Not_Equal_Left(), this.getExpression(), null, "left", null, 0, 1, Expression_Not_Equal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpression_Not_Equal_Right(), this.getExpression(), null, "right", null, 0, 1, Expression_Not_Equal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expression_ConcatenationEClass, Expression_Concatenation.class, "Expression_Concatenation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpression_Concatenation_Left(), this.getExpression(), null, "left", null, 0, 1, Expression_Concatenation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpression_Concatenation_Right(), this.getExpression(), null, "right", null, 0, 1, Expression_Concatenation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expression_PlusEClass, Expression_Plus.class, "Expression_Plus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpression_Plus_Left(), this.getExpression(), null, "left", null, 0, 1, Expression_Plus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpression_Plus_Right(), this.getExpression(), null, "right", null, 0, 1, Expression_Plus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expression_MinusEClass, Expression_Minus.class, "Expression_Minus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpression_Minus_Left(), this.getExpression(), null, "left", null, 0, 1, Expression_Minus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpression_Minus_Right(), this.getExpression(), null, "right", null, 0, 1, Expression_Minus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expression_MultiplicationEClass, Expression_Multiplication.class, "Expression_Multiplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpression_Multiplication_Left(), this.getExpression(), null, "left", null, 0, 1, Expression_Multiplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpression_Multiplication_Right(), this.getExpression(), null, "right", null, 0, 1, Expression_Multiplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expression_DivisionEClass, Expression_Division.class, "Expression_Division", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpression_Division_Left(), this.getExpression(), null, "left", null, 0, 1, Expression_Division.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpression_Division_Right(), this.getExpression(), null, "right", null, 0, 1, Expression_Division.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expression_ModuloEClass, Expression_Modulo.class, "Expression_Modulo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpression_Modulo_Left(), this.getExpression(), null, "left", null, 0, 1, Expression_Modulo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpression_Modulo_Right(), this.getExpression(), null, "right", null, 0, 1, Expression_Modulo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expression_NegateEClass, Expression_Negate.class, "Expression_Negate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpression_Negate_Exp(), this.getExpression(), null, "exp", null, 0, 1, Expression_Negate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expression_LengthEClass, Expression_Length.class, "Expression_Length", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpression_Length_Exp(), this.getExpression(), null, "exp", null, 0, 1, Expression_Length.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expression_InvertEClass, Expression_Invert.class, "Expression_Invert", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpression_Invert_Exp(), this.getExpression(), null, "exp", null, 0, 1, Expression_Invert.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expression_ExponentiationEClass, Expression_Exponentiation.class, "Expression_Exponentiation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpression_Exponentiation_Left(), this.getExpression(), null, "left", null, 0, 1, Expression_Exponentiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpression_Exponentiation_Right(), this.getExpression(), null, "right", null, 0, 1, Expression_Exponentiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expression_CallMemberFunctionEClass, Expression_CallMemberFunction.class, "Expression_CallMemberFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpression_CallMemberFunction_Object(), this.getExpression(), null, "object", null, 0, 1, Expression_CallMemberFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExpression_CallMemberFunction_MemberFunctionName(), ecorePackage.getEString(), "memberFunctionName", null, 0, 1, Expression_CallMemberFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpression_CallMemberFunction_Arguments(), this.getFunctioncall_Arguments(), null, "arguments", null, 0, 1, Expression_CallMemberFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expression_CallFunctionEClass, Expression_CallFunction.class, "Expression_CallFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpression_CallFunction_Object(), this.getExpression(), null, "object", null, 0, 1, Expression_CallFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpression_CallFunction_Arguments(), this.getFunctioncall_Arguments(), null, "arguments", null, 0, 1, Expression_CallFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expression_AccessArrayEClass, Expression_AccessArray.class, "Expression_AccessArray", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpression_AccessArray_Array(), this.getExpression(), null, "array", null, 0, 1, Expression_AccessArray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpression_AccessArray_Index(), this.getExpression(), null, "index", null, 0, 1, Expression_AccessArray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expression_AccessMemberEClass, Expression_AccessMember.class, "Expression_AccessMember", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpression_AccessMember_Object(), this.getExpression(), null, "object", null, 0, 1, Expression_AccessMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExpression_AccessMember_MemberName(), ecorePackage.getEString(), "memberName", null, 0, 1, Expression_AccessMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expression_VariableNameEClass, Expression_VariableName.class, "Expression_VariableName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExpression_VariableName_Variable(), ecorePackage.getEString(), "variable", null, 0, 1, Expression_VariableName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityNodeEClass, ActivityNode.class, "ActivityNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityNode_Outgoing(), this.getActivityEdge(), this.getActivityEdge_Source(), "outgoing", null, 0, -1, ActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityNode_Incoming(), this.getActivityEdge(), this.getActivityEdge_Target(), "incoming", null, 0, -1, ActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityNode_Activity(), this.getActivity(), this.getActivity_Nodes(), "activity", null, 1, 1, ActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivityNode_Running(), ecorePackage.getEBoolean(), "running", null, 1, 1, ActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityEdgeEClass, ActivityEdge.class, "ActivityEdge", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityEdge_Source(), this.getActivityNode(), this.getActivityNode_Outgoing(), "source", null, 1, 1, ActivityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityEdge_Target(), this.getActivityNode(), this.getActivityNode_Incoming(), "target", null, 1, 1, ActivityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlFlowEClass, ControlFlow.class, "ControlFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControlFlow_Guard(), this.getBooleanVariable(), null, "guard", null, 0, 1, ControlFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlNodeEClass, ControlNode.class, "ControlNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(executableNodeEClass, ExecutableNode.class, "ExecutableNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actionEClass, Action.class, "Action", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(opaqueActionEClass, OpaqueAction.class, "OpaqueAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOpaqueAction_Expressions(), this.getExpression(), null, "expressions", null, 0, -1, OpaqueAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOpaqueAction_Service(), this.getOperationDef(), null, "service", null, 0, 1, OpaqueAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(initialNodeEClass, InitialNode.class, "InitialNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(finalNodeEClass, FinalNode.class, "FinalNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activityFinalNodeEClass, ActivityFinalNode.class, "ActivityFinalNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(forkNodeEClass, ForkNode.class, "ForkNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(joinNodeEClass, JoinNode.class, "JoinNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mergeNodeEClass, MergeNode.class, "MergeNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(decisionNodeEClass, DecisionNode.class, "DecisionNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariable_InitialValue(), this.getValue(), null, "initialValue", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Name(), ecorePackage.getEString(), "name", null, 1, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariable_CurrentValue(), this.getValue(), null, "currentValue", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerVariableEClass, IntegerVariable.class, "IntegerVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(booleanVariableEClass, BooleanVariable.class, "BooleanVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(valueEClass, Value.class, "Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(booleanValueEClass, BooleanValue.class, "BooleanValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanValue_Value(), ecorePackage.getEBoolean(), "value", null, 1, 1, BooleanValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerValueEClass, IntegerValue.class, "IntegerValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerValue_Value(), ecorePackage.getEInt(), "value", null, 1, 1, IntegerValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerExpressionEClass, IntegerExpression.class, "IntegerExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntegerExpression_Operand2(), this.getIntegerVariable(), null, "operand2", null, 0, 1, IntegerExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntegerExpression_Operand1(), this.getIntegerVariable(), null, "operand1", null, 0, 1, IntegerExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanExpressionEClass, BooleanExpression.class, "BooleanExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBooleanExpression_Assignee(), this.getBooleanVariable(), null, "assignee", null, 1, 1, BooleanExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerCalculationExpressionEClass, IntegerCalculationExpression.class, "IntegerCalculationExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntegerCalculationExpression_Assignee(), this.getIntegerVariable(), null, "assignee", null, 1, 1, IntegerCalculationExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegerCalculationExpression_Operator(), this.getIntegerCalculationOperator(), "operator", null, 1, 1, IntegerCalculationExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerComparisonExpressionEClass, IntegerComparisonExpression.class, "IntegerComparisonExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntegerComparisonExpression_Assignee(), this.getBooleanVariable(), null, "assignee", null, 1, 1, IntegerComparisonExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegerComparisonExpression_Operator(), this.getIntegerComparisonOperator(), "operator", null, 1, 1, IntegerComparisonExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanUnaryExpressionEClass, BooleanUnaryExpression.class, "BooleanUnaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBooleanUnaryExpression_Operand(), this.getBooleanVariable(), null, "operand", null, 1, 1, BooleanUnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBooleanUnaryExpression_Operator(), this.getBooleanUnaryOperator(), "operator", null, 1, 1, BooleanUnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanBinaryExpressionEClass, BooleanBinaryExpression.class, "BooleanBinaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBooleanBinaryExpression_Operand1(), this.getBooleanVariable(), null, "operand1", null, 1, 1, BooleanBinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBooleanBinaryExpression_Operand2(), this.getBooleanVariable(), null, "operand2", null, 1, 1, BooleanBinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBooleanBinaryExpression_Operator(), this.getBooleanBinaryOperator(), "operator", null, 1, 1, BooleanBinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputValueEClass, InputValue.class, "InputValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInputValue_Value(), this.getValue(), null, "value", null, 1, 1, InputValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInputValue_Variable(), this.getVariable(), null, "variable", null, 1, 1, InputValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputEClass, Input.class, "Input", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInput_InputValues(), this.getInputValue(), null, "inputValues", null, 0, -1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tokenEClass, Token.class, "Token", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getToken_Holder(), this.getActivityNode(), null, "holder", null, 0, 1, Token.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(traceEClass, Trace.class, "Trace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrace_ExecutedNodes(), this.getActivityNode(), null, "executedNodes", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(boardTypeEEnum, BoardType.class, "BoardType");
		addEEnumLiteral(boardTypeEEnum, BoardType.RASPBERRY_PI);
		addEEnumLiteral(boardTypeEEnum, BoardType.ARDUINO);
		addEEnumLiteral(boardTypeEEnum, BoardType.BEAGLE_BOARD);

		initEEnum(parameterModeEEnum, ParameterMode.class, "ParameterMode");
		addEEnumLiteral(parameterModeEEnum, ParameterMode.PARAM_IN);
		addEEnumLiteral(parameterModeEEnum, ParameterMode.PARAM_OUT);
		addEEnumLiteral(parameterModeEEnum, ParameterMode.PARAM_INOUT);

		initEEnum(primitiveKindEEnum, PrimitiveKind.class, "PrimitiveKind");
		addEEnumLiteral(primitiveKindEEnum, PrimitiveKind.PK_NULL);
		addEEnumLiteral(primitiveKindEEnum, PrimitiveKind.PK_VOID);
		addEEnumLiteral(primitiveKindEEnum, PrimitiveKind.PK_SHORT);
		addEEnumLiteral(primitiveKindEEnum, PrimitiveKind.PK_LONG);
		addEEnumLiteral(primitiveKindEEnum, PrimitiveKind.PK_USHORT);
		addEEnumLiteral(primitiveKindEEnum, PrimitiveKind.PK_ULONG);
		addEEnumLiteral(primitiveKindEEnum, PrimitiveKind.PK_FLOAT);
		addEEnumLiteral(primitiveKindEEnum, PrimitiveKind.PK_DOUBLE);
		addEEnumLiteral(primitiveKindEEnum, PrimitiveKind.PK_BOOLEAN);
		addEEnumLiteral(primitiveKindEEnum, PrimitiveKind.PK_CHAR);
		addEEnumLiteral(primitiveKindEEnum, PrimitiveKind.PK_OCTET);
		addEEnumLiteral(primitiveKindEEnum, PrimitiveKind.PK_ANY);
		addEEnumLiteral(primitiveKindEEnum, PrimitiveKind.PK_LONGDOUBLE);
		addEEnumLiteral(primitiveKindEEnum, PrimitiveKind.PK_WSTRING);
		addEEnumLiteral(primitiveKindEEnum, PrimitiveKind.PK_TYPECODE);
		addEEnumLiteral(primitiveKindEEnum, PrimitiveKind.PK_WCHAR);
		addEEnumLiteral(primitiveKindEEnum, PrimitiveKind.PK_PRINCIPAL);
		addEEnumLiteral(primitiveKindEEnum, PrimitiveKind.PK_STRING);
		addEEnumLiteral(primitiveKindEEnum, PrimitiveKind.PK_ULONGLONG);
		addEEnumLiteral(primitiveKindEEnum, PrimitiveKind.PK_OBJREF);
		addEEnumLiteral(primitiveKindEEnum, PrimitiveKind.PK_LONGLONG);

		initEEnum(integerCalculationOperatorEEnum, IntegerCalculationOperator.class, "IntegerCalculationOperator");
		addEEnumLiteral(integerCalculationOperatorEEnum, IntegerCalculationOperator.ADD);
		addEEnumLiteral(integerCalculationOperatorEEnum, IntegerCalculationOperator.SUBRACT);

		initEEnum(integerComparisonOperatorEEnum, IntegerComparisonOperator.class, "IntegerComparisonOperator");
		addEEnumLiteral(integerComparisonOperatorEEnum, IntegerComparisonOperator.SMALLER);
		addEEnumLiteral(integerComparisonOperatorEEnum, IntegerComparisonOperator.SMALLER_EQUALS);
		addEEnumLiteral(integerComparisonOperatorEEnum, IntegerComparisonOperator.EQUALS);
		addEEnumLiteral(integerComparisonOperatorEEnum, IntegerComparisonOperator.GREATER_EQUALS);
		addEEnumLiteral(integerComparisonOperatorEEnum, IntegerComparisonOperator.GREATER);

		initEEnum(booleanUnaryOperatorEEnum, BooleanUnaryOperator.class, "BooleanUnaryOperator");
		addEEnumLiteral(booleanUnaryOperatorEEnum, BooleanUnaryOperator.NOT);

		initEEnum(booleanBinaryOperatorEEnum, BooleanBinaryOperator.class, "BooleanBinaryOperator");
		addEEnumLiteral(booleanBinaryOperatorEEnum, BooleanBinaryOperator.AND);
		addEEnumLiteral(booleanBinaryOperatorEEnum, BooleanBinaryOperator.OR);

		// Initialize data types
		initEDataType(eTypeCodeEDataType, String.class, "ETypeCode", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(objectEDataType, Object.class, "Object", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(stackEDataType, Stack.class, "Stack", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// aspect
		createAspectAnnotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>aspect</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createAspectAnnotations() {
		String source = "aspect";	
		addAnnotation
		  (getOperationDef_Lua(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getOpaqueAction_Service(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getToken_Holder(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getTrace_ExecutedNodes(), 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
		addAnnotation
		  (getNamedElement_Identifier(), 
		   source, 
		   new String[] {
		   });
	}

} //Iot2PackageImpl
