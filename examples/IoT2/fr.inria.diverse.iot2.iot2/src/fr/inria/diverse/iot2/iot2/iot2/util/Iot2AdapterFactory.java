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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.inria.diverse.iot2.iot2.iot2.Iot2Package
 * @generated
 */
public class Iot2AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Iot2Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Iot2AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Iot2Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Iot2Switch<Adapter> modelSwitch =
		new Iot2Switch<Adapter>() {
			@Override
			public Adapter caseSystem(fr.inria.diverse.iot2.iot2.iot2.System object) {
				return createSystemAdapter();
			}
			@Override
			public Adapter caseBoard(Board object) {
				return createBoardAdapter();
			}
			@Override
			public Adapter caseSketch(Sketch object) {
				return createSketchAdapter();
			}
			@Override
			public Adapter caseHWComponent(HWComponent object) {
				return createHWComponentAdapter();
			}
			@Override
			public Adapter caseSensor(Sensor object) {
				return createSensorAdapter();
			}
			@Override
			public Adapter caseActuator(Actuator object) {
				return createActuatorAdapter();
			}
			@Override
			public Adapter caseActivity(Activity object) {
				return createActivityAdapter();
			}
			@Override
			public Adapter caseOperationDef(OperationDef object) {
				return createOperationDefAdapter();
			}
			@Override
			public Adapter caseContained(Contained object) {
				return createContainedAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseContainer(Container object) {
				return createContainerAdapter();
			}
			@Override
			public Adapter caseTyped(Typed object) {
				return createTypedAdapter();
			}
			@Override
			public Adapter caseIDLType(IDLType object) {
				return createIDLTypeAdapter();
			}
			@Override
			public Adapter caseTypedefDef(TypedefDef object) {
				return createTypedefDefAdapter();
			}
			@Override
			public Adapter caseParameterDef(ParameterDef object) {
				return createParameterDefAdapter();
			}
			@Override
			public Adapter caseExceptionDef(ExceptionDef object) {
				return createExceptionDefAdapter();
			}
			@Override
			public Adapter caseField(Field object) {
				return createFieldAdapter();
			}
			@Override
			public Adapter casePrimitiveDef(PrimitiveDef object) {
				return createPrimitiveDefAdapter();
			}
			@Override
			public Adapter caseChunk(Chunk object) {
				return createChunkAdapter();
			}
			@Override
			public Adapter caseBlock(Block object) {
				return createBlockAdapter();
			}
			@Override
			public Adapter caseLastStatement(LastStatement object) {
				return createLastStatementAdapter();
			}
			@Override
			public Adapter caseLastStatement_Return(LastStatement_Return object) {
				return createLastStatement_ReturnAdapter();
			}
			@Override
			public Adapter caseLastStatement_Break(LastStatement_Break object) {
				return createLastStatement_BreakAdapter();
			}
			@Override
			public Adapter caseStatement(Statement object) {
				return createStatementAdapter();
			}
			@Override
			public Adapter caseStatement_Block(Statement_Block object) {
				return createStatement_BlockAdapter();
			}
			@Override
			public Adapter caseStatement_While(Statement_While object) {
				return createStatement_WhileAdapter();
			}
			@Override
			public Adapter caseStatement_Repeat(Statement_Repeat object) {
				return createStatement_RepeatAdapter();
			}
			@Override
			public Adapter caseStatement_If_Then_Else(Statement_If_Then_Else object) {
				return createStatement_If_Then_ElseAdapter();
			}
			@Override
			public Adapter caseStatement_If_Then_Else_ElseIfPart(Statement_If_Then_Else_ElseIfPart object) {
				return createStatement_If_Then_Else_ElseIfPartAdapter();
			}
			@Override
			public Adapter caseStatement_For_Numeric(Statement_For_Numeric object) {
				return createStatement_For_NumericAdapter();
			}
			@Override
			public Adapter caseStatement_For_Generic(Statement_For_Generic object) {
				return createStatement_For_GenericAdapter();
			}
			@Override
			public Adapter caseStatement_GlobalFunction_Declaration(Statement_GlobalFunction_Declaration object) {
				return createStatement_GlobalFunction_DeclarationAdapter();
			}
			@Override
			public Adapter caseStatement_LocalFunction_Declaration(Statement_LocalFunction_Declaration object) {
				return createStatement_LocalFunction_DeclarationAdapter();
			}
			@Override
			public Adapter caseStatement_Local_Variable_Declaration(Statement_Local_Variable_Declaration object) {
				return createStatement_Local_Variable_DeclarationAdapter();
			}
			@Override
			public Adapter caseStatement_FunctioncallOrAssignment(Statement_FunctioncallOrAssignment object) {
				return createStatement_FunctioncallOrAssignmentAdapter();
			}
			@Override
			public Adapter caseExpression(Expression object) {
				return createExpressionAdapter();
			}
			@Override
			public Adapter caseExpression_Nil(Expression_Nil object) {
				return createExpression_NilAdapter();
			}
			@Override
			public Adapter caseExpression_True(Expression_True object) {
				return createExpression_TrueAdapter();
			}
			@Override
			public Adapter caseExpression_False(Expression_False object) {
				return createExpression_FalseAdapter();
			}
			@Override
			public Adapter caseExpression_Number(Expression_Number object) {
				return createExpression_NumberAdapter();
			}
			@Override
			public Adapter caseExpression_VarArgs(Expression_VarArgs object) {
				return createExpression_VarArgsAdapter();
			}
			@Override
			public Adapter caseExpression_String(Expression_String object) {
				return createExpression_StringAdapter();
			}
			@Override
			public Adapter caseExpression_Function(Expression_Function object) {
				return createExpression_FunctionAdapter();
			}
			@Override
			public Adapter caseExpression_TableConstructor(Expression_TableConstructor object) {
				return createExpression_TableConstructorAdapter();
			}
			@Override
			public Adapter caseFunction(Function object) {
				return createFunctionAdapter();
			}
			@Override
			public Adapter caseFunctioncall_Arguments(Functioncall_Arguments object) {
				return createFunctioncall_ArgumentsAdapter();
			}
			@Override
			public Adapter caseField_AddEntryToTable_Brackets(Field_AddEntryToTable_Brackets object) {
				return createField_AddEntryToTable_BracketsAdapter();
			}
			@Override
			public Adapter caseField_AddEntryToTable(Field_AddEntryToTable object) {
				return createField_AddEntryToTableAdapter();
			}
			@Override
			public Adapter caseField_AppendEntryToTable(Field_AppendEntryToTable object) {
				return createField_AppendEntryToTableAdapter();
			}
			@Override
			public Adapter caseLastStatement_ReturnWithValue(LastStatement_ReturnWithValue object) {
				return createLastStatement_ReturnWithValueAdapter();
			}
			@Override
			public Adapter caseStatement_Assignment(Statement_Assignment object) {
				return createStatement_AssignmentAdapter();
			}
			@Override
			public Adapter caseStatement_CallMemberFunction(Statement_CallMemberFunction object) {
				return createStatement_CallMemberFunctionAdapter();
			}
			@Override
			public Adapter caseStatement_CallFunction(Statement_CallFunction object) {
				return createStatement_CallFunctionAdapter();
			}
			@Override
			public Adapter caseExpression_Or(Expression_Or object) {
				return createExpression_OrAdapter();
			}
			@Override
			public Adapter caseExpression_And(Expression_And object) {
				return createExpression_AndAdapter();
			}
			@Override
			public Adapter caseExpression_Larger(Expression_Larger object) {
				return createExpression_LargerAdapter();
			}
			@Override
			public Adapter caseExpression_Larger_Equal(Expression_Larger_Equal object) {
				return createExpression_Larger_EqualAdapter();
			}
			@Override
			public Adapter caseExpression_Smaller(Expression_Smaller object) {
				return createExpression_SmallerAdapter();
			}
			@Override
			public Adapter caseExpression_Smaller_Equal(Expression_Smaller_Equal object) {
				return createExpression_Smaller_EqualAdapter();
			}
			@Override
			public Adapter caseExpression_Equal(Expression_Equal object) {
				return createExpression_EqualAdapter();
			}
			@Override
			public Adapter caseExpression_Not_Equal(Expression_Not_Equal object) {
				return createExpression_Not_EqualAdapter();
			}
			@Override
			public Adapter caseExpression_Concatenation(Expression_Concatenation object) {
				return createExpression_ConcatenationAdapter();
			}
			@Override
			public Adapter caseExpression_Plus(Expression_Plus object) {
				return createExpression_PlusAdapter();
			}
			@Override
			public Adapter caseExpression_Minus(Expression_Minus object) {
				return createExpression_MinusAdapter();
			}
			@Override
			public Adapter caseExpression_Multiplication(Expression_Multiplication object) {
				return createExpression_MultiplicationAdapter();
			}
			@Override
			public Adapter caseExpression_Division(Expression_Division object) {
				return createExpression_DivisionAdapter();
			}
			@Override
			public Adapter caseExpression_Modulo(Expression_Modulo object) {
				return createExpression_ModuloAdapter();
			}
			@Override
			public Adapter caseExpression_Negate(Expression_Negate object) {
				return createExpression_NegateAdapter();
			}
			@Override
			public Adapter caseExpression_Length(Expression_Length object) {
				return createExpression_LengthAdapter();
			}
			@Override
			public Adapter caseExpression_Invert(Expression_Invert object) {
				return createExpression_InvertAdapter();
			}
			@Override
			public Adapter caseExpression_Exponentiation(Expression_Exponentiation object) {
				return createExpression_ExponentiationAdapter();
			}
			@Override
			public Adapter caseExpression_CallMemberFunction(Expression_CallMemberFunction object) {
				return createExpression_CallMemberFunctionAdapter();
			}
			@Override
			public Adapter caseExpression_CallFunction(Expression_CallFunction object) {
				return createExpression_CallFunctionAdapter();
			}
			@Override
			public Adapter caseExpression_AccessArray(Expression_AccessArray object) {
				return createExpression_AccessArrayAdapter();
			}
			@Override
			public Adapter caseExpression_AccessMember(Expression_AccessMember object) {
				return createExpression_AccessMemberAdapter();
			}
			@Override
			public Adapter caseExpression_VariableName(Expression_VariableName object) {
				return createExpression_VariableNameAdapter();
			}
			@Override
			public Adapter caseActivityNode(ActivityNode object) {
				return createActivityNodeAdapter();
			}
			@Override
			public Adapter caseActivityEdge(ActivityEdge object) {
				return createActivityEdgeAdapter();
			}
			@Override
			public Adapter caseControlFlow(ControlFlow object) {
				return createControlFlowAdapter();
			}
			@Override
			public Adapter caseControlNode(ControlNode object) {
				return createControlNodeAdapter();
			}
			@Override
			public Adapter caseExecutableNode(ExecutableNode object) {
				return createExecutableNodeAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter caseOpaqueAction(OpaqueAction object) {
				return createOpaqueActionAdapter();
			}
			@Override
			public Adapter caseInitialNode(InitialNode object) {
				return createInitialNodeAdapter();
			}
			@Override
			public Adapter caseFinalNode(FinalNode object) {
				return createFinalNodeAdapter();
			}
			@Override
			public Adapter caseActivityFinalNode(ActivityFinalNode object) {
				return createActivityFinalNodeAdapter();
			}
			@Override
			public Adapter caseForkNode(ForkNode object) {
				return createForkNodeAdapter();
			}
			@Override
			public Adapter caseJoinNode(JoinNode object) {
				return createJoinNodeAdapter();
			}
			@Override
			public Adapter caseMergeNode(MergeNode object) {
				return createMergeNodeAdapter();
			}
			@Override
			public Adapter caseDecisionNode(DecisionNode object) {
				return createDecisionNodeAdapter();
			}
			@Override
			public Adapter caseVariable(Variable object) {
				return createVariableAdapter();
			}
			@Override
			public Adapter caseIntegerVariable(IntegerVariable object) {
				return createIntegerVariableAdapter();
			}
			@Override
			public Adapter caseBooleanVariable(BooleanVariable object) {
				return createBooleanVariableAdapter();
			}
			@Override
			public Adapter caseValue(Value object) {
				return createValueAdapter();
			}
			@Override
			public Adapter caseBooleanValue(BooleanValue object) {
				return createBooleanValueAdapter();
			}
			@Override
			public Adapter caseIntegerValue(IntegerValue object) {
				return createIntegerValueAdapter();
			}
			@Override
			public Adapter caseIntegerExpression(IntegerExpression object) {
				return createIntegerExpressionAdapter();
			}
			@Override
			public Adapter caseBooleanExpression(BooleanExpression object) {
				return createBooleanExpressionAdapter();
			}
			@Override
			public Adapter caseIntegerCalculationExpression(IntegerCalculationExpression object) {
				return createIntegerCalculationExpressionAdapter();
			}
			@Override
			public Adapter caseIntegerComparisonExpression(IntegerComparisonExpression object) {
				return createIntegerComparisonExpressionAdapter();
			}
			@Override
			public Adapter caseBooleanUnaryExpression(BooleanUnaryExpression object) {
				return createBooleanUnaryExpressionAdapter();
			}
			@Override
			public Adapter caseBooleanBinaryExpression(BooleanBinaryExpression object) {
				return createBooleanBinaryExpressionAdapter();
			}
			@Override
			public Adapter caseInputValue(InputValue object) {
				return createInputValueAdapter();
			}
			@Override
			public Adapter caseInput(Input object) {
				return createInputAdapter();
			}
			@Override
			public Adapter caseToken(Token object) {
				return createTokenAdapter();
			}
			@Override
			public Adapter caseTrace(Trace object) {
				return createTraceAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.System
	 * @generated
	 */
	public Adapter createSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.Board <em>Board</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Board
	 * @generated
	 */
	public Adapter createBoardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.Sketch <em>Sketch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Sketch
	 * @generated
	 */
	public Adapter createSketchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.HWComponent <em>HW Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.HWComponent
	 * @generated
	 */
	public Adapter createHWComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Sensor
	 * @generated
	 */
	public Adapter createSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.Actuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Actuator
	 * @generated
	 */
	public Adapter createActuatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Activity
	 * @generated
	 */
	public Adapter createActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.OperationDef <em>Operation Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.OperationDef
	 * @generated
	 */
	public Adapter createOperationDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.Contained <em>Contained</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Contained
	 * @generated
	 */
	public Adapter createContainedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Container
	 * @generated
	 */
	public Adapter createContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.Typed <em>Typed</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Typed
	 * @generated
	 */
	public Adapter createTypedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.IDLType <em>IDL Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.IDLType
	 * @generated
	 */
	public Adapter createIDLTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.TypedefDef <em>Typedef Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.TypedefDef
	 * @generated
	 */
	public Adapter createTypedefDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.ParameterDef <em>Parameter Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.ParameterDef
	 * @generated
	 */
	public Adapter createParameterDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.ExceptionDef <em>Exception Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.ExceptionDef
	 * @generated
	 */
	public Adapter createExceptionDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Field
	 * @generated
	 */
	public Adapter createFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.PrimitiveDef <em>Primitive Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.PrimitiveDef
	 * @generated
	 */
	public Adapter createPrimitiveDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.Chunk <em>Chunk</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Chunk
	 * @generated
	 */
	public Adapter createChunkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Block
	 * @generated
	 */
	public Adapter createBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.LastStatement <em>Last Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.LastStatement
	 * @generated
	 */
	public Adapter createLastStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.LastStatement_Return <em>Last Statement Return</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.LastStatement_Return
	 * @generated
	 */
	public Adapter createLastStatement_ReturnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.LastStatement_Break <em>Last Statement Break</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.LastStatement_Break
	 * @generated
	 */
	public Adapter createLastStatement_BreakAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Statement
	 * @generated
	 */
	public Adapter createStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.Statement_Block <em>Statement Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Statement_Block
	 * @generated
	 */
	public Adapter createStatement_BlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.Statement_While <em>Statement While</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Statement_While
	 * @generated
	 */
	public Adapter createStatement_WhileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.Statement_Repeat <em>Statement Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Statement_Repeat
	 * @generated
	 */
	public Adapter createStatement_RepeatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.Statement_If_Then_Else <em>Statement If Then Else</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Statement_If_Then_Else
	 * @generated
	 */
	public Adapter createStatement_If_Then_ElseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.Statement_If_Then_Else_ElseIfPart <em>Statement If Then Else Else If Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Statement_If_Then_Else_ElseIfPart
	 * @generated
	 */
	public Adapter createStatement_If_Then_Else_ElseIfPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.Statement_For_Numeric <em>Statement For Numeric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Statement_For_Numeric
	 * @generated
	 */
	public Adapter createStatement_For_NumericAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.Statement_For_Generic <em>Statement For Generic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Statement_For_Generic
	 * @generated
	 */
	public Adapter createStatement_For_GenericAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.Statement_GlobalFunction_Declaration <em>Statement Global Function Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Statement_GlobalFunction_Declaration
	 * @generated
	 */
	public Adapter createStatement_GlobalFunction_DeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.Statement_LocalFunction_Declaration <em>Statement Local Function Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Statement_LocalFunction_Declaration
	 * @generated
	 */
	public Adapter createStatement_LocalFunction_DeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.Statement_Local_Variable_Declaration <em>Statement Local Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Statement_Local_Variable_Declaration
	 * @generated
	 */
	public Adapter createStatement_Local_Variable_DeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.Statement_FunctioncallOrAssignment <em>Statement Functioncall Or Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Statement_FunctioncallOrAssignment
	 * @generated
	 */
	public Adapter createStatement_FunctioncallOrAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_Nil <em>Expression Nil</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_Nil
	 * @generated
	 */
	public Adapter createExpression_NilAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_True <em>Expression True</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_True
	 * @generated
	 */
	public Adapter createExpression_TrueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_False <em>Expression False</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_False
	 * @generated
	 */
	public Adapter createExpression_FalseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_Number <em>Expression Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_Number
	 * @generated
	 */
	public Adapter createExpression_NumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_VarArgs <em>Expression Var Args</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_VarArgs
	 * @generated
	 */
	public Adapter createExpression_VarArgsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_String <em>Expression String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_String
	 * @generated
	 */
	public Adapter createExpression_StringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_Function <em>Expression Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_Function
	 * @generated
	 */
	public Adapter createExpression_FunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_TableConstructor <em>Expression Table Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_TableConstructor
	 * @generated
	 */
	public Adapter createExpression_TableConstructorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Function
	 * @generated
	 */
	public Adapter createFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.Functioncall_Arguments <em>Functioncall Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Functioncall_Arguments
	 * @generated
	 */
	public Adapter createFunctioncall_ArgumentsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.Field_AddEntryToTable_Brackets <em>Field Add Entry To Table Brackets</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Field_AddEntryToTable_Brackets
	 * @generated
	 */
	public Adapter createField_AddEntryToTable_BracketsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.Field_AddEntryToTable <em>Field Add Entry To Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Field_AddEntryToTable
	 * @generated
	 */
	public Adapter createField_AddEntryToTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.Field_AppendEntryToTable <em>Field Append Entry To Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Field_AppendEntryToTable
	 * @generated
	 */
	public Adapter createField_AppendEntryToTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.LastStatement_ReturnWithValue <em>Last Statement Return With Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.LastStatement_ReturnWithValue
	 * @generated
	 */
	public Adapter createLastStatement_ReturnWithValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.Statement_Assignment <em>Statement Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Statement_Assignment
	 * @generated
	 */
	public Adapter createStatement_AssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.Statement_CallMemberFunction <em>Statement Call Member Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Statement_CallMemberFunction
	 * @generated
	 */
	public Adapter createStatement_CallMemberFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.Statement_CallFunction <em>Statement Call Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Statement_CallFunction
	 * @generated
	 */
	public Adapter createStatement_CallFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_Or <em>Expression Or</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_Or
	 * @generated
	 */
	public Adapter createExpression_OrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_And <em>Expression And</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_And
	 * @generated
	 */
	public Adapter createExpression_AndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_Larger <em>Expression Larger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_Larger
	 * @generated
	 */
	public Adapter createExpression_LargerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_Larger_Equal <em>Expression Larger Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_Larger_Equal
	 * @generated
	 */
	public Adapter createExpression_Larger_EqualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_Smaller <em>Expression Smaller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_Smaller
	 * @generated
	 */
	public Adapter createExpression_SmallerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_Smaller_Equal <em>Expression Smaller Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_Smaller_Equal
	 * @generated
	 */
	public Adapter createExpression_Smaller_EqualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_Equal <em>Expression Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_Equal
	 * @generated
	 */
	public Adapter createExpression_EqualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_Not_Equal <em>Expression Not Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_Not_Equal
	 * @generated
	 */
	public Adapter createExpression_Not_EqualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_Concatenation <em>Expression Concatenation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_Concatenation
	 * @generated
	 */
	public Adapter createExpression_ConcatenationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_Plus <em>Expression Plus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_Plus
	 * @generated
	 */
	public Adapter createExpression_PlusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_Minus <em>Expression Minus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_Minus
	 * @generated
	 */
	public Adapter createExpression_MinusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_Multiplication <em>Expression Multiplication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_Multiplication
	 * @generated
	 */
	public Adapter createExpression_MultiplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_Division <em>Expression Division</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_Division
	 * @generated
	 */
	public Adapter createExpression_DivisionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_Modulo <em>Expression Modulo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_Modulo
	 * @generated
	 */
	public Adapter createExpression_ModuloAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_Negate <em>Expression Negate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_Negate
	 * @generated
	 */
	public Adapter createExpression_NegateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_Length <em>Expression Length</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_Length
	 * @generated
	 */
	public Adapter createExpression_LengthAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_Invert <em>Expression Invert</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_Invert
	 * @generated
	 */
	public Adapter createExpression_InvertAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_Exponentiation <em>Expression Exponentiation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_Exponentiation
	 * @generated
	 */
	public Adapter createExpression_ExponentiationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_CallMemberFunction <em>Expression Call Member Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_CallMemberFunction
	 * @generated
	 */
	public Adapter createExpression_CallMemberFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_CallFunction <em>Expression Call Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_CallFunction
	 * @generated
	 */
	public Adapter createExpression_CallFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_AccessArray <em>Expression Access Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_AccessArray
	 * @generated
	 */
	public Adapter createExpression_AccessArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_AccessMember <em>Expression Access Member</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_AccessMember
	 * @generated
	 */
	public Adapter createExpression_AccessMemberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.Expression_VariableName <em>Expression Variable Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Expression_VariableName
	 * @generated
	 */
	public Adapter createExpression_VariableNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.ActivityNode <em>Activity Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.ActivityNode
	 * @generated
	 */
	public Adapter createActivityNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.ActivityEdge <em>Activity Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.ActivityEdge
	 * @generated
	 */
	public Adapter createActivityEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.ControlFlow <em>Control Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.ControlFlow
	 * @generated
	 */
	public Adapter createControlFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.ControlNode <em>Control Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.ControlNode
	 * @generated
	 */
	public Adapter createControlNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.ExecutableNode <em>Executable Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.ExecutableNode
	 * @generated
	 */
	public Adapter createExecutableNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.OpaqueAction <em>Opaque Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.OpaqueAction
	 * @generated
	 */
	public Adapter createOpaqueActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.InitialNode <em>Initial Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.InitialNode
	 * @generated
	 */
	public Adapter createInitialNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.FinalNode <em>Final Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.FinalNode
	 * @generated
	 */
	public Adapter createFinalNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.ActivityFinalNode <em>Activity Final Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.ActivityFinalNode
	 * @generated
	 */
	public Adapter createActivityFinalNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.ForkNode <em>Fork Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.ForkNode
	 * @generated
	 */
	public Adapter createForkNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.JoinNode <em>Join Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.JoinNode
	 * @generated
	 */
	public Adapter createJoinNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.MergeNode <em>Merge Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.MergeNode
	 * @generated
	 */
	public Adapter createMergeNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.DecisionNode <em>Decision Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.DecisionNode
	 * @generated
	 */
	public Adapter createDecisionNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.IntegerVariable <em>Integer Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.IntegerVariable
	 * @generated
	 */
	public Adapter createIntegerVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.BooleanVariable <em>Boolean Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.BooleanVariable
	 * @generated
	 */
	public Adapter createBooleanVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Value
	 * @generated
	 */
	public Adapter createValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.BooleanValue <em>Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.BooleanValue
	 * @generated
	 */
	public Adapter createBooleanValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.IntegerValue <em>Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.IntegerValue
	 * @generated
	 */
	public Adapter createIntegerValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.IntegerExpression <em>Integer Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.IntegerExpression
	 * @generated
	 */
	public Adapter createIntegerExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.BooleanExpression <em>Boolean Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.BooleanExpression
	 * @generated
	 */
	public Adapter createBooleanExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.IntegerCalculationExpression <em>Integer Calculation Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.IntegerCalculationExpression
	 * @generated
	 */
	public Adapter createIntegerCalculationExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.IntegerComparisonExpression <em>Integer Comparison Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.IntegerComparisonExpression
	 * @generated
	 */
	public Adapter createIntegerComparisonExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.BooleanUnaryExpression <em>Boolean Unary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.BooleanUnaryExpression
	 * @generated
	 */
	public Adapter createBooleanUnaryExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.BooleanBinaryExpression <em>Boolean Binary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.BooleanBinaryExpression
	 * @generated
	 */
	public Adapter createBooleanBinaryExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.InputValue <em>Input Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.InputValue
	 * @generated
	 */
	public Adapter createInputValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Input
	 * @generated
	 */
	public Adapter createInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.Token <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Token
	 * @generated
	 */
	public Adapter createTokenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.iot2.iot2.iot2.Trace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Trace
	 * @generated
	 */
	public Adapter createTraceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Iot2AdapterFactory
