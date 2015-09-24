package fr.inria.diverse.iot2.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import fr.inria.diverse.iot2.iot2.iot2.Activity;
import fr.inria.diverse.iot2.iot2.iot2.ActivityFinalNode;
import fr.inria.diverse.iot2.iot2.iot2.Actuator;
import fr.inria.diverse.iot2.iot2.iot2.Block;
import fr.inria.diverse.iot2.iot2.iot2.Board;
import fr.inria.diverse.iot2.iot2.iot2.BooleanValue;
import fr.inria.diverse.iot2.iot2.iot2.BooleanVariable;
import fr.inria.diverse.iot2.iot2.iot2.ControlFlow;
import fr.inria.diverse.iot2.iot2.iot2.DecisionNode;
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
import fr.inria.diverse.iot2.iot2.iot2.Field_AddEntryToTable;
import fr.inria.diverse.iot2.iot2.iot2.Field_AddEntryToTable_Brackets;
import fr.inria.diverse.iot2.iot2.iot2.Field_AppendEntryToTable;
import fr.inria.diverse.iot2.iot2.iot2.ForkNode;
import fr.inria.diverse.iot2.iot2.iot2.Function;
import fr.inria.diverse.iot2.iot2.iot2.Functioncall_Arguments;
import fr.inria.diverse.iot2.iot2.iot2.InitialNode;
import fr.inria.diverse.iot2.iot2.iot2.IntegerValue;
import fr.inria.diverse.iot2.iot2.iot2.IntegerVariable;
import fr.inria.diverse.iot2.iot2.iot2.Iot2Package;
import fr.inria.diverse.iot2.iot2.iot2.JoinNode;
import fr.inria.diverse.iot2.iot2.iot2.LastStatement_Break;
import fr.inria.diverse.iot2.iot2.iot2.LastStatement_ReturnWithValue;
import fr.inria.diverse.iot2.iot2.iot2.MergeNode;
import fr.inria.diverse.iot2.iot2.iot2.OpaqueAction;
import fr.inria.diverse.iot2.iot2.iot2.OperationDef;
import fr.inria.diverse.iot2.iot2.iot2.ParameterDef;
import fr.inria.diverse.iot2.iot2.iot2.PrimitiveDef;
import fr.inria.diverse.iot2.iot2.iot2.Sensor;
import fr.inria.diverse.iot2.iot2.iot2.Sketch;
import fr.inria.diverse.iot2.iot2.iot2.Statement_Assignment;
import fr.inria.diverse.iot2.iot2.iot2.Statement_Block;
import fr.inria.diverse.iot2.iot2.iot2.Statement_CallFunction;
import fr.inria.diverse.iot2.iot2.iot2.Statement_CallMemberFunction;
import fr.inria.diverse.iot2.iot2.iot2.Statement_For_Generic;
import fr.inria.diverse.iot2.iot2.iot2.Statement_For_Numeric;
import fr.inria.diverse.iot2.iot2.iot2.Statement_GlobalFunction_Declaration;
import fr.inria.diverse.iot2.iot2.iot2.Statement_If_Then_Else;
import fr.inria.diverse.iot2.iot2.iot2.Statement_If_Then_Else_ElseIfPart;
import fr.inria.diverse.iot2.iot2.iot2.Statement_LocalFunction_Declaration;
import fr.inria.diverse.iot2.iot2.iot2.Statement_Local_Variable_Declaration;
import fr.inria.diverse.iot2.iot2.iot2.Statement_Repeat;
import fr.inria.diverse.iot2.iot2.iot2.Statement_While;
import fr.inria.diverse.iot2.services.IoT2GrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericArrayTypeReference;
import org.eclipse.xtext.common.types.JvmInnerTypeReference;
import org.eclipse.xtext.common.types.JvmLowerBound;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmTypeParameter;
import org.eclipse.xtext.common.types.JvmUpperBound;
import org.eclipse.xtext.common.types.JvmWildcardTypeReference;
import org.eclipse.xtext.common.types.TypesPackage;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.eclipse.xtext.xbase.XAssignment;
import org.eclipse.xtext.xbase.XBasicForLoopExpression;
import org.eclipse.xtext.xbase.XBinaryOperation;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XBooleanLiteral;
import org.eclipse.xtext.xbase.XCasePart;
import org.eclipse.xtext.xbase.XCastedExpression;
import org.eclipse.xtext.xbase.XCatchClause;
import org.eclipse.xtext.xbase.XClosure;
import org.eclipse.xtext.xbase.XConstructorCall;
import org.eclipse.xtext.xbase.XDoWhileExpression;
import org.eclipse.xtext.xbase.XFeatureCall;
import org.eclipse.xtext.xbase.XForLoopExpression;
import org.eclipse.xtext.xbase.XIfExpression;
import org.eclipse.xtext.xbase.XInstanceOfExpression;
import org.eclipse.xtext.xbase.XListLiteral;
import org.eclipse.xtext.xbase.XMemberFeatureCall;
import org.eclipse.xtext.xbase.XNullLiteral;
import org.eclipse.xtext.xbase.XNumberLiteral;
import org.eclipse.xtext.xbase.XPostfixOperation;
import org.eclipse.xtext.xbase.XReturnExpression;
import org.eclipse.xtext.xbase.XSetLiteral;
import org.eclipse.xtext.xbase.XStringLiteral;
import org.eclipse.xtext.xbase.XSwitchExpression;
import org.eclipse.xtext.xbase.XSynchronizedExpression;
import org.eclipse.xtext.xbase.XThrowExpression;
import org.eclipse.xtext.xbase.XTryCatchFinallyExpression;
import org.eclipse.xtext.xbase.XTypeLiteral;
import org.eclipse.xtext.xbase.XUnaryOperation;
import org.eclipse.xtext.xbase.XVariableDeclaration;
import org.eclipse.xtext.xbase.XWhileExpression;
import org.eclipse.xtext.xbase.XbasePackage;
import org.eclipse.xtext.xbase.serializer.XbaseSemanticSequencer;
import org.eclipse.xtext.xtype.XFunctionTypeRef;
import org.eclipse.xtext.xtype.XImportDeclaration;
import org.eclipse.xtext.xtype.XImportSection;
import org.eclipse.xtext.xtype.XtypePackage;

@SuppressWarnings("all")
public abstract class AbstractIoT2SemanticSequencer extends XbaseSemanticSequencer {

	@Inject
	private IoT2GrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == Iot2Package.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case Iot2Package.ACTIVITY:
				if(context == grammarAccess.getActivityRule()) {
					sequence_Activity(context, (Activity) semanticObject); 
					return; 
				}
				else break;
			case Iot2Package.ACTIVITY_FINAL_NODE:
				if(context == grammarAccess.getActivityFinalNodeRule() ||
				   context == grammarAccess.getActivityNodeRule()) {
					sequence_ActivityFinalNode(context, (ActivityFinalNode) semanticObject); 
					return; 
				}
				else break;
			case Iot2Package.ACTUATOR:
				if(context == grammarAccess.getActuatorRule() ||
				   context == grammarAccess.getHWComponentRule()) {
					sequence_Actuator(context, (Actuator) semanticObject); 
					return; 
				}
				else break;
			case Iot2Package.BLOCK:
				if(context == grammarAccess.getBlockRule() ||
				   context == grammarAccess.getChunkRule()) {
					sequence_Block(context, (Block) semanticObject); 
					return; 
				}
				else break;
			case Iot2Package.BOARD:
				if(context == grammarAccess.getBoardRule()) {
					sequence_Board(context, (Board) semanticObject); 
					return; 
				}
				else break;
			case Iot2Package.BOOLEAN_VALUE:
				if(context == grammarAccess.getBooleanValueRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_BooleanValue(context, (BooleanValue) semanticObject); 
					return; 
				}
				else break;
			case Iot2Package.BOOLEAN_VARIABLE:
				if(context == grammarAccess.getBooleanVariableRule() ||
				   context == grammarAccess.getVariableRule()) {
					sequence_BooleanVariable(context, (BooleanVariable) semanticObject); 
					return; 
				}
				else break;
			case Iot2Package.CONTROL_FLOW:
				if(context == grammarAccess.getActivityEdgeRule() ||
				   context == grammarAccess.getControlFlowRule()) {
					sequence_ControlFlow(context, (ControlFlow) semanticObject); 
					return; 
				}
				else break;
			case Iot2Package.DECISION_NODE:
				if(context == grammarAccess.getActivityNodeRule() ||
				   context == grammarAccess.getDecisionNodeRule()) {
					sequence_DecisionNode(context, (DecisionNode) semanticObject); 
					return; 
				}
				else break;
			case Iot2Package.EXPRESSION_ACCESS_ARRAY:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessArrayArrayAction_1_0_1() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessMemberObjectAction_1_1_1() ||
				   context == grammarAccess.getExpression_AndRule() ||
				   context == grammarAccess.getExpression_AndAccess().getExpression_AndLeftAction_1_1() ||
				   context == grammarAccess.getExpression_CompareRule() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_EqualLeftAction_1_4_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_LargerLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Larger_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Not_EqualLeftAction_1_5_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_SmallerLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Smaller_EqualLeftAction_1_3_1() ||
				   context == grammarAccess.getExpression_ConcatenationRule() ||
				   context == grammarAccess.getExpression_ConcatenationAccess().getExpression_ConcatenationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_ExponentiationRule() ||
				   context == grammarAccess.getExpression_ExponentiationAccess().getExpression_ExponentiationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_FunctioncallRule() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallFunctionObjectAction_1_1_0() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallMemberFunctionObjectAction_1_0_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloRule() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_DivisionLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_ModuloLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_MultiplicationLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_OrRule() ||
				   context == grammarAccess.getExpression_OrAccess().getExpression_OrLeftAction_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusRule() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_MinusLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_PlusLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_TerminalRule() ||
				   context == grammarAccess.getExpression_UnaryRule() ||
				   context == grammarAccess.getExpression_VariableNameRule() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_AssignmentVariableAction_1_0_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallFunctionObjectAction_1_2_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallMemberFunctionObjectAction_1_1_1()) {
					sequence_Expression_AccessMemberOrArrayElement(context, (Expression_AccessArray) semanticObject); 
					return; 
				}
				else break;
			case Iot2Package.EXPRESSION_ACCESS_MEMBER:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessArrayArrayAction_1_0_1() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessMemberObjectAction_1_1_1() ||
				   context == grammarAccess.getExpression_AndRule() ||
				   context == grammarAccess.getExpression_AndAccess().getExpression_AndLeftAction_1_1() ||
				   context == grammarAccess.getExpression_CompareRule() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_EqualLeftAction_1_4_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_LargerLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Larger_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Not_EqualLeftAction_1_5_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_SmallerLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Smaller_EqualLeftAction_1_3_1() ||
				   context == grammarAccess.getExpression_ConcatenationRule() ||
				   context == grammarAccess.getExpression_ConcatenationAccess().getExpression_ConcatenationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_ExponentiationRule() ||
				   context == grammarAccess.getExpression_ExponentiationAccess().getExpression_ExponentiationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_FunctioncallRule() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallFunctionObjectAction_1_1_0() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallMemberFunctionObjectAction_1_0_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloRule() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_DivisionLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_ModuloLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_MultiplicationLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_OrRule() ||
				   context == grammarAccess.getExpression_OrAccess().getExpression_OrLeftAction_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusRule() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_MinusLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_PlusLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_TerminalRule() ||
				   context == grammarAccess.getExpression_UnaryRule() ||
				   context == grammarAccess.getExpression_VariableNameRule() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_AssignmentVariableAction_1_0_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallFunctionObjectAction_1_2_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallMemberFunctionObjectAction_1_1_1()) {
					sequence_Expression_AccessMemberOrArrayElement(context, (Expression_AccessMember) semanticObject); 
					return; 
				}
				else break;
			case Iot2Package.EXPRESSION_AND:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessArrayArrayAction_1_0_1() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessMemberObjectAction_1_1_1() ||
				   context == grammarAccess.getExpression_AndRule() ||
				   context == grammarAccess.getExpression_AndAccess().getExpression_AndLeftAction_1_1() ||
				   context == grammarAccess.getExpression_CompareRule() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_EqualLeftAction_1_4_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_LargerLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Larger_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Not_EqualLeftAction_1_5_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_SmallerLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Smaller_EqualLeftAction_1_3_1() ||
				   context == grammarAccess.getExpression_ConcatenationRule() ||
				   context == grammarAccess.getExpression_ConcatenationAccess().getExpression_ConcatenationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_ExponentiationRule() ||
				   context == grammarAccess.getExpression_ExponentiationAccess().getExpression_ExponentiationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_FunctioncallRule() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallFunctionObjectAction_1_1_0() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallMemberFunctionObjectAction_1_0_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloRule() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_DivisionLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_ModuloLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_MultiplicationLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_OrRule() ||
				   context == grammarAccess.getExpression_OrAccess().getExpression_OrLeftAction_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusRule() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_MinusLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_PlusLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_TerminalRule() ||
				   context == grammarAccess.getExpression_UnaryRule() ||
				   context == grammarAccess.getExpression_VariableNameRule() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_AssignmentVariableAction_1_0_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallFunctionObjectAction_1_2_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallMemberFunctionObjectAction_1_1_1()) {
					sequence_Expression_And(context, (Expression_And) semanticObject); 
					return; 
				}
				else break;
			case Iot2Package.EXPRESSION_CALL_FUNCTION:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessArrayArrayAction_1_0_1() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessMemberObjectAction_1_1_1() ||
				   context == grammarAccess.getExpression_AndRule() ||
				   context == grammarAccess.getExpression_AndAccess().getExpression_AndLeftAction_1_1() ||
				   context == grammarAccess.getExpression_CompareRule() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_EqualLeftAction_1_4_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_LargerLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Larger_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Not_EqualLeftAction_1_5_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_SmallerLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Smaller_EqualLeftAction_1_3_1() ||
				   context == grammarAccess.getExpression_ConcatenationRule() ||
				   context == grammarAccess.getExpression_ConcatenationAccess().getExpression_ConcatenationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_ExponentiationRule() ||
				   context == grammarAccess.getExpression_ExponentiationAccess().getExpression_ExponentiationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_FunctioncallRule() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallFunctionObjectAction_1_1_0() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallMemberFunctionObjectAction_1_0_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloRule() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_DivisionLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_ModuloLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_MultiplicationLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_OrRule() ||
				   context == grammarAccess.getExpression_OrAccess().getExpression_OrLeftAction_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusRule() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_MinusLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_PlusLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_TerminalRule() ||
				   context == grammarAccess.getExpression_UnaryRule() ||
				   context == grammarAccess.getExpression_VariableNameRule() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_AssignmentVariableAction_1_0_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallFunctionObjectAction_1_2_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallMemberFunctionObjectAction_1_1_1()) {
					sequence_Expression_Functioncall(context, (Expression_CallFunction) semanticObject); 
					return; 
				}
				else break;
			case Iot2Package.EXPRESSION_CALL_MEMBER_FUNCTION:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessArrayArrayAction_1_0_1() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessMemberObjectAction_1_1_1() ||
				   context == grammarAccess.getExpression_AndRule() ||
				   context == grammarAccess.getExpression_AndAccess().getExpression_AndLeftAction_1_1() ||
				   context == grammarAccess.getExpression_CompareRule() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_EqualLeftAction_1_4_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_LargerLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Larger_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Not_EqualLeftAction_1_5_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_SmallerLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Smaller_EqualLeftAction_1_3_1() ||
				   context == grammarAccess.getExpression_ConcatenationRule() ||
				   context == grammarAccess.getExpression_ConcatenationAccess().getExpression_ConcatenationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_ExponentiationRule() ||
				   context == grammarAccess.getExpression_ExponentiationAccess().getExpression_ExponentiationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_FunctioncallRule() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallFunctionObjectAction_1_1_0() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallMemberFunctionObjectAction_1_0_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloRule() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_DivisionLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_ModuloLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_MultiplicationLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_OrRule() ||
				   context == grammarAccess.getExpression_OrAccess().getExpression_OrLeftAction_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusRule() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_MinusLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_PlusLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_TerminalRule() ||
				   context == grammarAccess.getExpression_UnaryRule() ||
				   context == grammarAccess.getExpression_VariableNameRule() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_AssignmentVariableAction_1_0_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallFunctionObjectAction_1_2_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallMemberFunctionObjectAction_1_1_1()) {
					sequence_Expression_Functioncall(context, (Expression_CallMemberFunction) semanticObject); 
					return; 
				}
				else break;
			case Iot2Package.EXPRESSION_CONCATENATION:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessArrayArrayAction_1_0_1() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessMemberObjectAction_1_1_1() ||
				   context == grammarAccess.getExpression_AndRule() ||
				   context == grammarAccess.getExpression_AndAccess().getExpression_AndLeftAction_1_1() ||
				   context == grammarAccess.getExpression_CompareRule() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_EqualLeftAction_1_4_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_LargerLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Larger_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Not_EqualLeftAction_1_5_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_SmallerLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Smaller_EqualLeftAction_1_3_1() ||
				   context == grammarAccess.getExpression_ConcatenationRule() ||
				   context == grammarAccess.getExpression_ConcatenationAccess().getExpression_ConcatenationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_ExponentiationRule() ||
				   context == grammarAccess.getExpression_ExponentiationAccess().getExpression_ExponentiationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_FunctioncallRule() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallFunctionObjectAction_1_1_0() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallMemberFunctionObjectAction_1_0_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloRule() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_DivisionLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_ModuloLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_MultiplicationLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_OrRule() ||
				   context == grammarAccess.getExpression_OrAccess().getExpression_OrLeftAction_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusRule() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_MinusLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_PlusLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_TerminalRule() ||
				   context == grammarAccess.getExpression_UnaryRule() ||
				   context == grammarAccess.getExpression_VariableNameRule() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_AssignmentVariableAction_1_0_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallFunctionObjectAction_1_2_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallMemberFunctionObjectAction_1_1_1()) {
					sequence_Expression_Concatenation(context, (Expression_Concatenation) semanticObject); 
					return; 
				}
				else break;
			case Iot2Package.EXPRESSION_DIVISION:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessArrayArrayAction_1_0_1() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessMemberObjectAction_1_1_1() ||
				   context == grammarAccess.getExpression_AndRule() ||
				   context == grammarAccess.getExpression_AndAccess().getExpression_AndLeftAction_1_1() ||
				   context == grammarAccess.getExpression_CompareRule() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_EqualLeftAction_1_4_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_LargerLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Larger_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Not_EqualLeftAction_1_5_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_SmallerLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Smaller_EqualLeftAction_1_3_1() ||
				   context == grammarAccess.getExpression_ConcatenationRule() ||
				   context == grammarAccess.getExpression_ConcatenationAccess().getExpression_ConcatenationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_ExponentiationRule() ||
				   context == grammarAccess.getExpression_ExponentiationAccess().getExpression_ExponentiationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_FunctioncallRule() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallFunctionObjectAction_1_1_0() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallMemberFunctionObjectAction_1_0_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloRule() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_DivisionLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_ModuloLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_MultiplicationLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_OrRule() ||
				   context == grammarAccess.getExpression_OrAccess().getExpression_OrLeftAction_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusRule() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_MinusLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_PlusLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_TerminalRule() ||
				   context == grammarAccess.getExpression_UnaryRule() ||
				   context == grammarAccess.getExpression_VariableNameRule() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_AssignmentVariableAction_1_0_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallFunctionObjectAction_1_2_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallMemberFunctionObjectAction_1_1_1()) {
					sequence_Expression_MultiplicationDivisionModulo(context, (Expression_Division) semanticObject); 
					return; 
				}
				else break;
			case Iot2Package.EXPRESSION_EQUAL:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessArrayArrayAction_1_0_1() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessMemberObjectAction_1_1_1() ||
				   context == grammarAccess.getExpression_AndRule() ||
				   context == grammarAccess.getExpression_AndAccess().getExpression_AndLeftAction_1_1() ||
				   context == grammarAccess.getExpression_CompareRule() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_EqualLeftAction_1_4_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_LargerLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Larger_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Not_EqualLeftAction_1_5_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_SmallerLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Smaller_EqualLeftAction_1_3_1() ||
				   context == grammarAccess.getExpression_ConcatenationRule() ||
				   context == grammarAccess.getExpression_ConcatenationAccess().getExpression_ConcatenationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_ExponentiationRule() ||
				   context == grammarAccess.getExpression_ExponentiationAccess().getExpression_ExponentiationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_FunctioncallRule() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallFunctionObjectAction_1_1_0() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallMemberFunctionObjectAction_1_0_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloRule() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_DivisionLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_ModuloLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_MultiplicationLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_OrRule() ||
				   context == grammarAccess.getExpression_OrAccess().getExpression_OrLeftAction_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusRule() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_MinusLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_PlusLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_TerminalRule() ||
				   context == grammarAccess.getExpression_UnaryRule() ||
				   context == grammarAccess.getExpression_VariableNameRule() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_AssignmentVariableAction_1_0_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallFunctionObjectAction_1_2_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallMemberFunctionObjectAction_1_1_1()) {
					sequence_Expression_Compare(context, (Expression_Equal) semanticObject); 
					return; 
				}
				else break;
			case Iot2Package.EXPRESSION_EXPONENTIATION:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessArrayArrayAction_1_0_1() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessMemberObjectAction_1_1_1() ||
				   context == grammarAccess.getExpression_AndRule() ||
				   context == grammarAccess.getExpression_AndAccess().getExpression_AndLeftAction_1_1() ||
				   context == grammarAccess.getExpression_CompareRule() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_EqualLeftAction_1_4_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_LargerLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Larger_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Not_EqualLeftAction_1_5_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_SmallerLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Smaller_EqualLeftAction_1_3_1() ||
				   context == grammarAccess.getExpression_ConcatenationRule() ||
				   context == grammarAccess.getExpression_ConcatenationAccess().getExpression_ConcatenationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_ExponentiationRule() ||
				   context == grammarAccess.getExpression_ExponentiationAccess().getExpression_ExponentiationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_FunctioncallRule() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallFunctionObjectAction_1_1_0() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallMemberFunctionObjectAction_1_0_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloRule() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_DivisionLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_ModuloLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_MultiplicationLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_OrRule() ||
				   context == grammarAccess.getExpression_OrAccess().getExpression_OrLeftAction_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusRule() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_MinusLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_PlusLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_TerminalRule() ||
				   context == grammarAccess.getExpression_UnaryRule() ||
				   context == grammarAccess.getExpression_VariableNameRule() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_AssignmentVariableAction_1_0_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallFunctionObjectAction_1_2_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallMemberFunctionObjectAction_1_1_1()) {
					sequence_Expression_Exponentiation(context, (Expression_Exponentiation) semanticObject); 
					return; 
				}
				else break;
			case Iot2Package.EXPRESSION_FALSE:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessArrayArrayAction_1_0_1() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessMemberObjectAction_1_1_1() ||
				   context == grammarAccess.getExpression_AndRule() ||
				   context == grammarAccess.getExpression_AndAccess().getExpression_AndLeftAction_1_1() ||
				   context == grammarAccess.getExpression_CompareRule() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_EqualLeftAction_1_4_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_LargerLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Larger_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Not_EqualLeftAction_1_5_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_SmallerLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Smaller_EqualLeftAction_1_3_1() ||
				   context == grammarAccess.getExpression_ConcatenationRule() ||
				   context == grammarAccess.getExpression_ConcatenationAccess().getExpression_ConcatenationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_ExponentiationRule() ||
				   context == grammarAccess.getExpression_ExponentiationAccess().getExpression_ExponentiationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_FalseRule() ||
				   context == grammarAccess.getExpression_FunctioncallRule() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallFunctionObjectAction_1_1_0() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallMemberFunctionObjectAction_1_0_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloRule() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_DivisionLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_ModuloLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_MultiplicationLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_OrRule() ||
				   context == grammarAccess.getExpression_OrAccess().getExpression_OrLeftAction_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusRule() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_MinusLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_PlusLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_TerminalRule() ||
				   context == grammarAccess.getExpression_UnaryRule() ||
				   context == grammarAccess.getExpression_VariableNameRule() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_AssignmentVariableAction_1_0_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallFunctionObjectAction_1_2_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallMemberFunctionObjectAction_1_1_1()) {
					sequence_Statement_FunctioncallOrAssignment_Statement_Assignment_1_0_0_Statement_CallFunction_1_2_0_Statement_CallMemberFunction_1_1_1(context, (Expression_False) semanticObject); 
					return; 
				}
				else break;
			case Iot2Package.EXPRESSION_FUNCTION:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessArrayArrayAction_1_0_1() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessMemberObjectAction_1_1_1() ||
				   context == grammarAccess.getExpression_AndRule() ||
				   context == grammarAccess.getExpression_AndAccess().getExpression_AndLeftAction_1_1() ||
				   context == grammarAccess.getExpression_CompareRule() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_EqualLeftAction_1_4_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_LargerLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Larger_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Not_EqualLeftAction_1_5_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_SmallerLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Smaller_EqualLeftAction_1_3_1() ||
				   context == grammarAccess.getExpression_ConcatenationRule() ||
				   context == grammarAccess.getExpression_ConcatenationAccess().getExpression_ConcatenationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_ExponentiationRule() ||
				   context == grammarAccess.getExpression_ExponentiationAccess().getExpression_ExponentiationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_FunctionRule() ||
				   context == grammarAccess.getExpression_FunctioncallRule() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallFunctionObjectAction_1_1_0() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallMemberFunctionObjectAction_1_0_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloRule() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_DivisionLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_ModuloLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_MultiplicationLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_OrRule() ||
				   context == grammarAccess.getExpression_OrAccess().getExpression_OrLeftAction_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusRule() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_MinusLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_PlusLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_TerminalRule() ||
				   context == grammarAccess.getExpression_UnaryRule() ||
				   context == grammarAccess.getExpression_VariableNameRule() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_AssignmentVariableAction_1_0_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallFunctionObjectAction_1_2_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallMemberFunctionObjectAction_1_1_1()) {
					sequence_Expression_Function(context, (Expression_Function) semanticObject); 
					return; 
				}
				else break;
			case Iot2Package.EXPRESSION_INVERT:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessArrayArrayAction_1_0_1() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessMemberObjectAction_1_1_1() ||
				   context == grammarAccess.getExpression_AndRule() ||
				   context == grammarAccess.getExpression_AndAccess().getExpression_AndLeftAction_1_1() ||
				   context == grammarAccess.getExpression_CompareRule() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_EqualLeftAction_1_4_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_LargerLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Larger_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Not_EqualLeftAction_1_5_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_SmallerLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Smaller_EqualLeftAction_1_3_1() ||
				   context == grammarAccess.getExpression_ConcatenationRule() ||
				   context == grammarAccess.getExpression_ConcatenationAccess().getExpression_ConcatenationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_ExponentiationRule() ||
				   context == grammarAccess.getExpression_ExponentiationAccess().getExpression_ExponentiationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_FunctioncallRule() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallFunctionObjectAction_1_1_0() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallMemberFunctionObjectAction_1_0_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloRule() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_DivisionLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_ModuloLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_MultiplicationLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_OrRule() ||
				   context == grammarAccess.getExpression_OrAccess().getExpression_OrLeftAction_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusRule() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_MinusLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_PlusLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_TerminalRule() ||
				   context == grammarAccess.getExpression_UnaryRule() ||
				   context == grammarAccess.getExpression_VariableNameRule() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_AssignmentVariableAction_1_0_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallFunctionObjectAction_1_2_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallMemberFunctionObjectAction_1_1_1()) {
					sequence_Expression_Unary(context, (Expression_Invert) semanticObject); 
					return; 
				}
				else break;
			case Iot2Package.EXPRESSION_LARGER:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessArrayArrayAction_1_0_1() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessMemberObjectAction_1_1_1() ||
				   context == grammarAccess.getExpression_AndRule() ||
				   context == grammarAccess.getExpression_AndAccess().getExpression_AndLeftAction_1_1() ||
				   context == grammarAccess.getExpression_CompareRule() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_EqualLeftAction_1_4_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_LargerLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Larger_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Not_EqualLeftAction_1_5_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_SmallerLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Smaller_EqualLeftAction_1_3_1() ||
				   context == grammarAccess.getExpression_ConcatenationRule() ||
				   context == grammarAccess.getExpression_ConcatenationAccess().getExpression_ConcatenationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_ExponentiationRule() ||
				   context == grammarAccess.getExpression_ExponentiationAccess().getExpression_ExponentiationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_FunctioncallRule() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallFunctionObjectAction_1_1_0() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallMemberFunctionObjectAction_1_0_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloRule() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_DivisionLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_ModuloLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_MultiplicationLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_OrRule() ||
				   context == grammarAccess.getExpression_OrAccess().getExpression_OrLeftAction_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusRule() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_MinusLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_PlusLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_TerminalRule() ||
				   context == grammarAccess.getExpression_UnaryRule() ||
				   context == grammarAccess.getExpression_VariableNameRule() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_AssignmentVariableAction_1_0_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallFunctionObjectAction_1_2_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallMemberFunctionObjectAction_1_1_1()) {
					sequence_Expression_Compare(context, (Expression_Larger) semanticObject); 
					return; 
				}
				else break;
			case Iot2Package.EXPRESSION_LARGER_EQUAL:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessArrayArrayAction_1_0_1() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessMemberObjectAction_1_1_1() ||
				   context == grammarAccess.getExpression_AndRule() ||
				   context == grammarAccess.getExpression_AndAccess().getExpression_AndLeftAction_1_1() ||
				   context == grammarAccess.getExpression_CompareRule() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_EqualLeftAction_1_4_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_LargerLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Larger_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Not_EqualLeftAction_1_5_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_SmallerLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Smaller_EqualLeftAction_1_3_1() ||
				   context == grammarAccess.getExpression_ConcatenationRule() ||
				   context == grammarAccess.getExpression_ConcatenationAccess().getExpression_ConcatenationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_ExponentiationRule() ||
				   context == grammarAccess.getExpression_ExponentiationAccess().getExpression_ExponentiationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_FunctioncallRule() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallFunctionObjectAction_1_1_0() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallMemberFunctionObjectAction_1_0_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloRule() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_DivisionLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_ModuloLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_MultiplicationLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_OrRule() ||
				   context == grammarAccess.getExpression_OrAccess().getExpression_OrLeftAction_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusRule() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_MinusLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_PlusLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_TerminalRule() ||
				   context == grammarAccess.getExpression_UnaryRule() ||
				   context == grammarAccess.getExpression_VariableNameRule() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_AssignmentVariableAction_1_0_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallFunctionObjectAction_1_2_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallMemberFunctionObjectAction_1_1_1()) {
					sequence_Expression_Compare(context, (Expression_Larger_Equal) semanticObject); 
					return; 
				}
				else break;
			case Iot2Package.EXPRESSION_LENGTH:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessArrayArrayAction_1_0_1() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessMemberObjectAction_1_1_1() ||
				   context == grammarAccess.getExpression_AndRule() ||
				   context == grammarAccess.getExpression_AndAccess().getExpression_AndLeftAction_1_1() ||
				   context == grammarAccess.getExpression_CompareRule() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_EqualLeftAction_1_4_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_LargerLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Larger_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Not_EqualLeftAction_1_5_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_SmallerLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Smaller_EqualLeftAction_1_3_1() ||
				   context == grammarAccess.getExpression_ConcatenationRule() ||
				   context == grammarAccess.getExpression_ConcatenationAccess().getExpression_ConcatenationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_ExponentiationRule() ||
				   context == grammarAccess.getExpression_ExponentiationAccess().getExpression_ExponentiationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_FunctioncallRule() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallFunctionObjectAction_1_1_0() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallMemberFunctionObjectAction_1_0_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloRule() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_DivisionLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_ModuloLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_MultiplicationLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_OrRule() ||
				   context == grammarAccess.getExpression_OrAccess().getExpression_OrLeftAction_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusRule() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_MinusLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_PlusLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_TerminalRule() ||
				   context == grammarAccess.getExpression_UnaryRule() ||
				   context == grammarAccess.getExpression_VariableNameRule() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_AssignmentVariableAction_1_0_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallFunctionObjectAction_1_2_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallMemberFunctionObjectAction_1_1_1()) {
					sequence_Expression_Unary(context, (Expression_Length) semanticObject); 
					return; 
				}
				else break;
			case Iot2Package.EXPRESSION_MINUS:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessArrayArrayAction_1_0_1() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessMemberObjectAction_1_1_1() ||
				   context == grammarAccess.getExpression_AndRule() ||
				   context == grammarAccess.getExpression_AndAccess().getExpression_AndLeftAction_1_1() ||
				   context == grammarAccess.getExpression_CompareRule() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_EqualLeftAction_1_4_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_LargerLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Larger_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Not_EqualLeftAction_1_5_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_SmallerLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Smaller_EqualLeftAction_1_3_1() ||
				   context == grammarAccess.getExpression_ConcatenationRule() ||
				   context == grammarAccess.getExpression_ConcatenationAccess().getExpression_ConcatenationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_ExponentiationRule() ||
				   context == grammarAccess.getExpression_ExponentiationAccess().getExpression_ExponentiationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_FunctioncallRule() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallFunctionObjectAction_1_1_0() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallMemberFunctionObjectAction_1_0_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloRule() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_DivisionLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_ModuloLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_MultiplicationLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_OrRule() ||
				   context == grammarAccess.getExpression_OrAccess().getExpression_OrLeftAction_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusRule() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_MinusLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_PlusLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_TerminalRule() ||
				   context == grammarAccess.getExpression_UnaryRule() ||
				   context == grammarAccess.getExpression_VariableNameRule() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_AssignmentVariableAction_1_0_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallFunctionObjectAction_1_2_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallMemberFunctionObjectAction_1_1_1()) {
					sequence_Expression_PlusMinus(context, (Expression_Minus) semanticObject); 
					return; 
				}
				else break;
			case Iot2Package.EXPRESSION_MODULO:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessArrayArrayAction_1_0_1() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessMemberObjectAction_1_1_1() ||
				   context == grammarAccess.getExpression_AndRule() ||
				   context == grammarAccess.getExpression_AndAccess().getExpression_AndLeftAction_1_1() ||
				   context == grammarAccess.getExpression_CompareRule() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_EqualLeftAction_1_4_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_LargerLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Larger_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Not_EqualLeftAction_1_5_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_SmallerLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Smaller_EqualLeftAction_1_3_1() ||
				   context == grammarAccess.getExpression_ConcatenationRule() ||
				   context == grammarAccess.getExpression_ConcatenationAccess().getExpression_ConcatenationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_ExponentiationRule() ||
				   context == grammarAccess.getExpression_ExponentiationAccess().getExpression_ExponentiationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_FunctioncallRule() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallFunctionObjectAction_1_1_0() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallMemberFunctionObjectAction_1_0_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloRule() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_DivisionLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_ModuloLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_MultiplicationLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_OrRule() ||
				   context == grammarAccess.getExpression_OrAccess().getExpression_OrLeftAction_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusRule() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_MinusLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_PlusLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_TerminalRule() ||
				   context == grammarAccess.getExpression_UnaryRule() ||
				   context == grammarAccess.getExpression_VariableNameRule() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_AssignmentVariableAction_1_0_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallFunctionObjectAction_1_2_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallMemberFunctionObjectAction_1_1_1()) {
					sequence_Expression_MultiplicationDivisionModulo(context, (Expression_Modulo) semanticObject); 
					return; 
				}
				else break;
			case Iot2Package.EXPRESSION_MULTIPLICATION:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessArrayArrayAction_1_0_1() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessMemberObjectAction_1_1_1() ||
				   context == grammarAccess.getExpression_AndRule() ||
				   context == grammarAccess.getExpression_AndAccess().getExpression_AndLeftAction_1_1() ||
				   context == grammarAccess.getExpression_CompareRule() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_EqualLeftAction_1_4_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_LargerLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Larger_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Not_EqualLeftAction_1_5_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_SmallerLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Smaller_EqualLeftAction_1_3_1() ||
				   context == grammarAccess.getExpression_ConcatenationRule() ||
				   context == grammarAccess.getExpression_ConcatenationAccess().getExpression_ConcatenationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_ExponentiationRule() ||
				   context == grammarAccess.getExpression_ExponentiationAccess().getExpression_ExponentiationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_FunctioncallRule() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallFunctionObjectAction_1_1_0() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallMemberFunctionObjectAction_1_0_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloRule() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_DivisionLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_ModuloLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_MultiplicationLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_OrRule() ||
				   context == grammarAccess.getExpression_OrAccess().getExpression_OrLeftAction_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusRule() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_MinusLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_PlusLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_TerminalRule() ||
				   context == grammarAccess.getExpression_UnaryRule() ||
				   context == grammarAccess.getExpression_VariableNameRule() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_AssignmentVariableAction_1_0_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallFunctionObjectAction_1_2_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallMemberFunctionObjectAction_1_1_1()) {
					sequence_Expression_MultiplicationDivisionModulo(context, (Expression_Multiplication) semanticObject); 
					return; 
				}
				else break;
			case Iot2Package.EXPRESSION_NEGATE:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessArrayArrayAction_1_0_1() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessMemberObjectAction_1_1_1() ||
				   context == grammarAccess.getExpression_AndRule() ||
				   context == grammarAccess.getExpression_AndAccess().getExpression_AndLeftAction_1_1() ||
				   context == grammarAccess.getExpression_CompareRule() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_EqualLeftAction_1_4_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_LargerLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Larger_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Not_EqualLeftAction_1_5_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_SmallerLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Smaller_EqualLeftAction_1_3_1() ||
				   context == grammarAccess.getExpression_ConcatenationRule() ||
				   context == grammarAccess.getExpression_ConcatenationAccess().getExpression_ConcatenationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_ExponentiationRule() ||
				   context == grammarAccess.getExpression_ExponentiationAccess().getExpression_ExponentiationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_FunctioncallRule() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallFunctionObjectAction_1_1_0() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallMemberFunctionObjectAction_1_0_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloRule() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_DivisionLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_ModuloLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_MultiplicationLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_OrRule() ||
				   context == grammarAccess.getExpression_OrAccess().getExpression_OrLeftAction_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusRule() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_MinusLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_PlusLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_TerminalRule() ||
				   context == grammarAccess.getExpression_UnaryRule() ||
				   context == grammarAccess.getExpression_VariableNameRule() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_AssignmentVariableAction_1_0_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallFunctionObjectAction_1_2_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallMemberFunctionObjectAction_1_1_1()) {
					sequence_Expression_Unary(context, (Expression_Negate) semanticObject); 
					return; 
				}
				else break;
			case Iot2Package.EXPRESSION_NIL:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessArrayArrayAction_1_0_1() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessMemberObjectAction_1_1_1() ||
				   context == grammarAccess.getExpression_AndRule() ||
				   context == grammarAccess.getExpression_AndAccess().getExpression_AndLeftAction_1_1() ||
				   context == grammarAccess.getExpression_CompareRule() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_EqualLeftAction_1_4_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_LargerLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Larger_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Not_EqualLeftAction_1_5_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_SmallerLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Smaller_EqualLeftAction_1_3_1() ||
				   context == grammarAccess.getExpression_ConcatenationRule() ||
				   context == grammarAccess.getExpression_ConcatenationAccess().getExpression_ConcatenationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_ExponentiationRule() ||
				   context == grammarAccess.getExpression_ExponentiationAccess().getExpression_ExponentiationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_FunctioncallRule() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallFunctionObjectAction_1_1_0() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallMemberFunctionObjectAction_1_0_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloRule() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_DivisionLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_ModuloLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_MultiplicationLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_NilRule() ||
				   context == grammarAccess.getExpression_OrRule() ||
				   context == grammarAccess.getExpression_OrAccess().getExpression_OrLeftAction_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusRule() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_MinusLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_PlusLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_TerminalRule() ||
				   context == grammarAccess.getExpression_UnaryRule() ||
				   context == grammarAccess.getExpression_VariableNameRule() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_AssignmentVariableAction_1_0_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallFunctionObjectAction_1_2_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallMemberFunctionObjectAction_1_1_1()) {
					sequence_Statement_FunctioncallOrAssignment_Statement_Assignment_1_0_0_Statement_CallFunction_1_2_0_Statement_CallMemberFunction_1_1_1(context, (Expression_Nil) semanticObject); 
					return; 
				}
				else break;
			case Iot2Package.EXPRESSION_NOT_EQUAL:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessArrayArrayAction_1_0_1() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessMemberObjectAction_1_1_1() ||
				   context == grammarAccess.getExpression_AndRule() ||
				   context == grammarAccess.getExpression_AndAccess().getExpression_AndLeftAction_1_1() ||
				   context == grammarAccess.getExpression_CompareRule() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_EqualLeftAction_1_4_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_LargerLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Larger_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Not_EqualLeftAction_1_5_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_SmallerLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Smaller_EqualLeftAction_1_3_1() ||
				   context == grammarAccess.getExpression_ConcatenationRule() ||
				   context == grammarAccess.getExpression_ConcatenationAccess().getExpression_ConcatenationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_ExponentiationRule() ||
				   context == grammarAccess.getExpression_ExponentiationAccess().getExpression_ExponentiationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_FunctioncallRule() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallFunctionObjectAction_1_1_0() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallMemberFunctionObjectAction_1_0_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloRule() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_DivisionLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_ModuloLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_MultiplicationLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_OrRule() ||
				   context == grammarAccess.getExpression_OrAccess().getExpression_OrLeftAction_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusRule() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_MinusLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_PlusLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_TerminalRule() ||
				   context == grammarAccess.getExpression_UnaryRule() ||
				   context == grammarAccess.getExpression_VariableNameRule() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_AssignmentVariableAction_1_0_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallFunctionObjectAction_1_2_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallMemberFunctionObjectAction_1_1_1()) {
					sequence_Expression_Compare(context, (Expression_Not_Equal) semanticObject); 
					return; 
				}
				else break;
			case Iot2Package.EXPRESSION_NUMBER:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessArrayArrayAction_1_0_1() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessMemberObjectAction_1_1_1() ||
				   context == grammarAccess.getExpression_AndRule() ||
				   context == grammarAccess.getExpression_AndAccess().getExpression_AndLeftAction_1_1() ||
				   context == grammarAccess.getExpression_CompareRule() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_EqualLeftAction_1_4_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_LargerLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Larger_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Not_EqualLeftAction_1_5_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_SmallerLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Smaller_EqualLeftAction_1_3_1() ||
				   context == grammarAccess.getExpression_ConcatenationRule() ||
				   context == grammarAccess.getExpression_ConcatenationAccess().getExpression_ConcatenationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_ExponentiationRule() ||
				   context == grammarAccess.getExpression_ExponentiationAccess().getExpression_ExponentiationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_FunctioncallRule() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallFunctionObjectAction_1_1_0() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallMemberFunctionObjectAction_1_0_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloRule() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_DivisionLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_ModuloLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_MultiplicationLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_NumberRule() ||
				   context == grammarAccess.getExpression_OrRule() ||
				   context == grammarAccess.getExpression_OrAccess().getExpression_OrLeftAction_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusRule() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_MinusLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_PlusLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_TerminalRule() ||
				   context == grammarAccess.getExpression_UnaryRule() ||
				   context == grammarAccess.getExpression_VariableNameRule() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_AssignmentVariableAction_1_0_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallFunctionObjectAction_1_2_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallMemberFunctionObjectAction_1_1_1()) {
					sequence_Expression_Number(context, (Expression_Number) semanticObject); 
					return; 
				}
				else break;
			case Iot2Package.EXPRESSION_OR:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessArrayArrayAction_1_0_1() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessMemberObjectAction_1_1_1() ||
				   context == grammarAccess.getExpression_AndRule() ||
				   context == grammarAccess.getExpression_AndAccess().getExpression_AndLeftAction_1_1() ||
				   context == grammarAccess.getExpression_CompareRule() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_EqualLeftAction_1_4_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_LargerLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Larger_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Not_EqualLeftAction_1_5_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_SmallerLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Smaller_EqualLeftAction_1_3_1() ||
				   context == grammarAccess.getExpression_ConcatenationRule() ||
				   context == grammarAccess.getExpression_ConcatenationAccess().getExpression_ConcatenationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_ExponentiationRule() ||
				   context == grammarAccess.getExpression_ExponentiationAccess().getExpression_ExponentiationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_FunctioncallRule() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallFunctionObjectAction_1_1_0() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallMemberFunctionObjectAction_1_0_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloRule() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_DivisionLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_ModuloLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_MultiplicationLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_OrRule() ||
				   context == grammarAccess.getExpression_OrAccess().getExpression_OrLeftAction_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusRule() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_MinusLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_PlusLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_TerminalRule() ||
				   context == grammarAccess.getExpression_UnaryRule() ||
				   context == grammarAccess.getExpression_VariableNameRule() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_AssignmentVariableAction_1_0_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallFunctionObjectAction_1_2_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallMemberFunctionObjectAction_1_1_1()) {
					sequence_Expression_Or(context, (Expression_Or) semanticObject); 
					return; 
				}
				else break;
			case Iot2Package.EXPRESSION_PLUS:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessArrayArrayAction_1_0_1() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessMemberObjectAction_1_1_1() ||
				   context == grammarAccess.getExpression_AndRule() ||
				   context == grammarAccess.getExpression_AndAccess().getExpression_AndLeftAction_1_1() ||
				   context == grammarAccess.getExpression_CompareRule() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_EqualLeftAction_1_4_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_LargerLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Larger_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Not_EqualLeftAction_1_5_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_SmallerLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Smaller_EqualLeftAction_1_3_1() ||
				   context == grammarAccess.getExpression_ConcatenationRule() ||
				   context == grammarAccess.getExpression_ConcatenationAccess().getExpression_ConcatenationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_ExponentiationRule() ||
				   context == grammarAccess.getExpression_ExponentiationAccess().getExpression_ExponentiationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_FunctioncallRule() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallFunctionObjectAction_1_1_0() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallMemberFunctionObjectAction_1_0_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloRule() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_DivisionLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_ModuloLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_MultiplicationLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_OrRule() ||
				   context == grammarAccess.getExpression_OrAccess().getExpression_OrLeftAction_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusRule() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_MinusLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_PlusLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_TerminalRule() ||
				   context == grammarAccess.getExpression_UnaryRule() ||
				   context == grammarAccess.getExpression_VariableNameRule() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_AssignmentVariableAction_1_0_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallFunctionObjectAction_1_2_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallMemberFunctionObjectAction_1_1_1()) {
					sequence_Expression_PlusMinus(context, (Expression_Plus) semanticObject); 
					return; 
				}
				else break;
			case Iot2Package.EXPRESSION_SMALLER:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessArrayArrayAction_1_0_1() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessMemberObjectAction_1_1_1() ||
				   context == grammarAccess.getExpression_AndRule() ||
				   context == grammarAccess.getExpression_AndAccess().getExpression_AndLeftAction_1_1() ||
				   context == grammarAccess.getExpression_CompareRule() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_EqualLeftAction_1_4_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_LargerLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Larger_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Not_EqualLeftAction_1_5_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_SmallerLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Smaller_EqualLeftAction_1_3_1() ||
				   context == grammarAccess.getExpression_ConcatenationRule() ||
				   context == grammarAccess.getExpression_ConcatenationAccess().getExpression_ConcatenationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_ExponentiationRule() ||
				   context == grammarAccess.getExpression_ExponentiationAccess().getExpression_ExponentiationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_FunctioncallRule() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallFunctionObjectAction_1_1_0() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallMemberFunctionObjectAction_1_0_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloRule() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_DivisionLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_ModuloLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_MultiplicationLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_OrRule() ||
				   context == grammarAccess.getExpression_OrAccess().getExpression_OrLeftAction_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusRule() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_MinusLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_PlusLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_TerminalRule() ||
				   context == grammarAccess.getExpression_UnaryRule() ||
				   context == grammarAccess.getExpression_VariableNameRule() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_AssignmentVariableAction_1_0_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallFunctionObjectAction_1_2_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallMemberFunctionObjectAction_1_1_1()) {
					sequence_Expression_Compare(context, (Expression_Smaller) semanticObject); 
					return; 
				}
				else break;
			case Iot2Package.EXPRESSION_SMALLER_EQUAL:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessArrayArrayAction_1_0_1() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessMemberObjectAction_1_1_1() ||
				   context == grammarAccess.getExpression_AndRule() ||
				   context == grammarAccess.getExpression_AndAccess().getExpression_AndLeftAction_1_1() ||
				   context == grammarAccess.getExpression_CompareRule() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_EqualLeftAction_1_4_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_LargerLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Larger_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Not_EqualLeftAction_1_5_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_SmallerLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Smaller_EqualLeftAction_1_3_1() ||
				   context == grammarAccess.getExpression_ConcatenationRule() ||
				   context == grammarAccess.getExpression_ConcatenationAccess().getExpression_ConcatenationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_ExponentiationRule() ||
				   context == grammarAccess.getExpression_ExponentiationAccess().getExpression_ExponentiationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_FunctioncallRule() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallFunctionObjectAction_1_1_0() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallMemberFunctionObjectAction_1_0_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloRule() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_DivisionLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_ModuloLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_MultiplicationLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_OrRule() ||
				   context == grammarAccess.getExpression_OrAccess().getExpression_OrLeftAction_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusRule() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_MinusLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_PlusLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_TerminalRule() ||
				   context == grammarAccess.getExpression_UnaryRule() ||
				   context == grammarAccess.getExpression_VariableNameRule() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_AssignmentVariableAction_1_0_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallFunctionObjectAction_1_2_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallMemberFunctionObjectAction_1_1_1()) {
					sequence_Expression_Compare(context, (Expression_Smaller_Equal) semanticObject); 
					return; 
				}
				else break;
			case Iot2Package.EXPRESSION_STRING:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessArrayArrayAction_1_0_1() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessMemberObjectAction_1_1_1() ||
				   context == grammarAccess.getExpression_AndRule() ||
				   context == grammarAccess.getExpression_AndAccess().getExpression_AndLeftAction_1_1() ||
				   context == grammarAccess.getExpression_CompareRule() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_EqualLeftAction_1_4_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_LargerLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Larger_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Not_EqualLeftAction_1_5_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_SmallerLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Smaller_EqualLeftAction_1_3_1() ||
				   context == grammarAccess.getExpression_ConcatenationRule() ||
				   context == grammarAccess.getExpression_ConcatenationAccess().getExpression_ConcatenationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_ExponentiationRule() ||
				   context == grammarAccess.getExpression_ExponentiationAccess().getExpression_ExponentiationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_FunctioncallRule() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallFunctionObjectAction_1_1_0() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallMemberFunctionObjectAction_1_0_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloRule() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_DivisionLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_ModuloLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_MultiplicationLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_OrRule() ||
				   context == grammarAccess.getExpression_OrAccess().getExpression_OrLeftAction_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusRule() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_MinusLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_PlusLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_StringRule() ||
				   context == grammarAccess.getExpression_TerminalRule() ||
				   context == grammarAccess.getExpression_UnaryRule() ||
				   context == grammarAccess.getExpression_VariableNameRule() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_AssignmentVariableAction_1_0_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallFunctionObjectAction_1_2_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallMemberFunctionObjectAction_1_1_1()) {
					sequence_Expression_String(context, (Expression_String) semanticObject); 
					return; 
				}
				else break;
			case Iot2Package.EXPRESSION_TABLE_CONSTRUCTOR:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessArrayArrayAction_1_0_1() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessMemberObjectAction_1_1_1() ||
				   context == grammarAccess.getExpression_AndRule() ||
				   context == grammarAccess.getExpression_AndAccess().getExpression_AndLeftAction_1_1() ||
				   context == grammarAccess.getExpression_CompareRule() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_EqualLeftAction_1_4_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_LargerLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Larger_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Not_EqualLeftAction_1_5_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_SmallerLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Smaller_EqualLeftAction_1_3_1() ||
				   context == grammarAccess.getExpression_ConcatenationRule() ||
				   context == grammarAccess.getExpression_ConcatenationAccess().getExpression_ConcatenationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_ExponentiationRule() ||
				   context == grammarAccess.getExpression_ExponentiationAccess().getExpression_ExponentiationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_FunctioncallRule() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallFunctionObjectAction_1_1_0() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallMemberFunctionObjectAction_1_0_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloRule() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_DivisionLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_ModuloLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_MultiplicationLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_OrRule() ||
				   context == grammarAccess.getExpression_OrAccess().getExpression_OrLeftAction_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusRule() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_MinusLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_PlusLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_TableConstructorRule() ||
				   context == grammarAccess.getExpression_TerminalRule() ||
				   context == grammarAccess.getExpression_UnaryRule() ||
				   context == grammarAccess.getExpression_VariableNameRule() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_AssignmentVariableAction_1_0_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallFunctionObjectAction_1_2_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallMemberFunctionObjectAction_1_1_1()) {
					sequence_Expression_TableConstructor(context, (Expression_TableConstructor) semanticObject); 
					return; 
				}
				else break;
			case Iot2Package.EXPRESSION_TRUE:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessArrayArrayAction_1_0_1() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessMemberObjectAction_1_1_1() ||
				   context == grammarAccess.getExpression_AndRule() ||
				   context == grammarAccess.getExpression_AndAccess().getExpression_AndLeftAction_1_1() ||
				   context == grammarAccess.getExpression_CompareRule() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_EqualLeftAction_1_4_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_LargerLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Larger_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Not_EqualLeftAction_1_5_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_SmallerLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Smaller_EqualLeftAction_1_3_1() ||
				   context == grammarAccess.getExpression_ConcatenationRule() ||
				   context == grammarAccess.getExpression_ConcatenationAccess().getExpression_ConcatenationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_ExponentiationRule() ||
				   context == grammarAccess.getExpression_ExponentiationAccess().getExpression_ExponentiationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_FunctioncallRule() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallFunctionObjectAction_1_1_0() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallMemberFunctionObjectAction_1_0_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloRule() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_DivisionLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_ModuloLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_MultiplicationLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_OrRule() ||
				   context == grammarAccess.getExpression_OrAccess().getExpression_OrLeftAction_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusRule() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_MinusLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_PlusLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_TerminalRule() ||
				   context == grammarAccess.getExpression_TrueRule() ||
				   context == grammarAccess.getExpression_UnaryRule() ||
				   context == grammarAccess.getExpression_VariableNameRule() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_AssignmentVariableAction_1_0_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallFunctionObjectAction_1_2_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallMemberFunctionObjectAction_1_1_1()) {
					sequence_Statement_FunctioncallOrAssignment_Statement_Assignment_1_0_0_Statement_CallFunction_1_2_0_Statement_CallMemberFunction_1_1_1(context, (Expression_True) semanticObject); 
					return; 
				}
				else break;
			case Iot2Package.EXPRESSION_VAR_ARGS:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessArrayArrayAction_1_0_1() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessMemberObjectAction_1_1_1() ||
				   context == grammarAccess.getExpression_AndRule() ||
				   context == grammarAccess.getExpression_AndAccess().getExpression_AndLeftAction_1_1() ||
				   context == grammarAccess.getExpression_CompareRule() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_EqualLeftAction_1_4_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_LargerLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Larger_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Not_EqualLeftAction_1_5_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_SmallerLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Smaller_EqualLeftAction_1_3_1() ||
				   context == grammarAccess.getExpression_ConcatenationRule() ||
				   context == grammarAccess.getExpression_ConcatenationAccess().getExpression_ConcatenationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_ExponentiationRule() ||
				   context == grammarAccess.getExpression_ExponentiationAccess().getExpression_ExponentiationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_FunctioncallRule() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallFunctionObjectAction_1_1_0() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallMemberFunctionObjectAction_1_0_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloRule() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_DivisionLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_ModuloLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_MultiplicationLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_OrRule() ||
				   context == grammarAccess.getExpression_OrAccess().getExpression_OrLeftAction_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusRule() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_MinusLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_PlusLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_TerminalRule() ||
				   context == grammarAccess.getExpression_UnaryRule() ||
				   context == grammarAccess.getExpression_VarArgsRule() ||
				   context == grammarAccess.getExpression_VariableNameRule() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_AssignmentVariableAction_1_0_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallFunctionObjectAction_1_2_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallMemberFunctionObjectAction_1_1_1()) {
					sequence_Statement_FunctioncallOrAssignment_Statement_Assignment_1_0_0_Statement_CallFunction_1_2_0_Statement_CallMemberFunction_1_1_1(context, (Expression_VarArgs) semanticObject); 
					return; 
				}
				else break;
			case Iot2Package.EXPRESSION_VARIABLE_NAME:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessArrayArrayAction_1_0_1() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessMemberObjectAction_1_1_1() ||
				   context == grammarAccess.getExpression_AndRule() ||
				   context == grammarAccess.getExpression_AndAccess().getExpression_AndLeftAction_1_1() ||
				   context == grammarAccess.getExpression_CompareRule() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_EqualLeftAction_1_4_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_LargerLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Larger_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Not_EqualLeftAction_1_5_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_SmallerLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Smaller_EqualLeftAction_1_3_1() ||
				   context == grammarAccess.getExpression_ConcatenationRule() ||
				   context == grammarAccess.getExpression_ConcatenationAccess().getExpression_ConcatenationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_ExponentiationRule() ||
				   context == grammarAccess.getExpression_ExponentiationAccess().getExpression_ExponentiationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_FunctioncallRule() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallFunctionObjectAction_1_1_0() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallMemberFunctionObjectAction_1_0_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloRule() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_DivisionLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_ModuloLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_MultiplicationLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_OrRule() ||
				   context == grammarAccess.getExpression_OrAccess().getExpression_OrLeftAction_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusRule() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_MinusLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_PlusLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_TerminalRule() ||
				   context == grammarAccess.getExpression_UnaryRule() ||
				   context == grammarAccess.getExpression_VariableNameRule() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_AssignmentVariableAction_1_0_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallFunctionObjectAction_1_2_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallMemberFunctionObjectAction_1_1_1()) {
					sequence_Expression_VariableName(context, (Expression_VariableName) semanticObject); 
					return; 
				}
				else break;
			case Iot2Package.FIELD_ADD_ENTRY_TO_TABLE:
				if(context == grammarAccess.getFieldRule() ||
				   context == grammarAccess.getField_AddEntryToTableRule()) {
					sequence_Field_AddEntryToTable(context, (Field_AddEntryToTable) semanticObject); 
					return; 
				}
				else break;
			case Iot2Package.FIELD_ADD_ENTRY_TO_TABLE_BRACKETS:
				if(context == grammarAccess.getFieldRule() ||
				   context == grammarAccess.getField_AddEntryToTable_BracketsRule()) {
					sequence_Field_AddEntryToTable_Brackets(context, (Field_AddEntryToTable_Brackets) semanticObject); 
					return; 
				}
				else break;
			case Iot2Package.FIELD_APPEND_ENTRY_TO_TABLE:
				if(context == grammarAccess.getFieldRule() ||
				   context == grammarAccess.getField_AppendEntryToTableRule()) {
					sequence_Field_AppendEntryToTable(context, (Field_AppendEntryToTable) semanticObject); 
					return; 
				}
				else break;
			case Iot2Package.FORK_NODE:
				if(context == grammarAccess.getActivityNodeRule() ||
				   context == grammarAccess.getForkNodeRule()) {
					sequence_ForkNode(context, (ForkNode) semanticObject); 
					return; 
				}
				else break;
			case Iot2Package.FUNCTION:
				if(context == grammarAccess.getFunctionRule()) {
					sequence_Function(context, (Function) semanticObject); 
					return; 
				}
				else break;
			case Iot2Package.FUNCTIONCALL_ARGUMENTS:
				if(context == grammarAccess.getFunctioncall_ArgumentsRule()) {
					sequence_Functioncall_Arguments(context, (Functioncall_Arguments) semanticObject); 
					return; 
				}
				else break;
			case Iot2Package.INITIAL_NODE:
				if(context == grammarAccess.getActivityNodeRule() ||
				   context == grammarAccess.getInitialNodeRule()) {
					sequence_InitialNode(context, (InitialNode) semanticObject); 
					return; 
				}
				else break;
			case Iot2Package.INTEGER_VALUE:
				if(context == grammarAccess.getIntegerValueRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_IntegerValue(context, (IntegerValue) semanticObject); 
					return; 
				}
				else break;
			case Iot2Package.INTEGER_VARIABLE:
				if(context == grammarAccess.getIntegerVariableRule() ||
				   context == grammarAccess.getVariableRule()) {
					sequence_IntegerVariable(context, (IntegerVariable) semanticObject); 
					return; 
				}
				else break;
			case Iot2Package.JOIN_NODE:
				if(context == grammarAccess.getActivityNodeRule() ||
				   context == grammarAccess.getJoinNodeRule()) {
					sequence_JoinNode(context, (JoinNode) semanticObject); 
					return; 
				}
				else break;
			case Iot2Package.LAST_STATEMENT_BREAK:
				if(context == grammarAccess.getLastStatementRule() ||
				   context == grammarAccess.getLastStatement_BreakRule()) {
					sequence_LastStatement_Break(context, (LastStatement_Break) semanticObject); 
					return; 
				}
				else break;
			case Iot2Package.LAST_STATEMENT_RETURN_WITH_VALUE:
				if(context == grammarAccess.getLastStatementRule() ||
				   context == grammarAccess.getLastStatement_ReturnRule()) {
					sequence_LastStatement_Return(context, (LastStatement_ReturnWithValue) semanticObject); 
					return; 
				}
				else break;
			case Iot2Package.MERGE_NODE:
				if(context == grammarAccess.getActivityNodeRule() ||
				   context == grammarAccess.getMergeNodeRule()) {
					sequence_MergeNode(context, (MergeNode) semanticObject); 
					return; 
				}
				else break;
			case Iot2Package.OPAQUE_ACTION:
				if(context == grammarAccess.getActivityNodeRule() ||
				   context == grammarAccess.getOpaqueActionRule()) {
					sequence_OpaqueAction(context, (OpaqueAction) semanticObject); 
					return; 
				}
				else break;
			case Iot2Package.OPERATION_DEF:
				if(context == grammarAccess.getContainedRule() ||
				   context == grammarAccess.getOperationDefRule()) {
					sequence_OperationDef(context, (OperationDef) semanticObject); 
					return; 
				}
				else break;
			case Iot2Package.PARAMETER_DEF:
				if(context == grammarAccess.getParameterDefRule()) {
					sequence_ParameterDef(context, (ParameterDef) semanticObject); 
					return; 
				}
				else break;
			case Iot2Package.PRIMITIVE_DEF:
				if(context == grammarAccess.getPrimitiveDefRule()) {
					sequence_PrimitiveDef_charstr_type_floating_pt_type_integer_type_other_type(context, (PrimitiveDef) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getCharstr_typeRule()) {
					sequence_charstr_type(context, (PrimitiveDef) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getFloating_pt_typeRule()) {
					sequence_floating_pt_type(context, (PrimitiveDef) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getInteger_typeRule()) {
					sequence_integer_type(context, (PrimitiveDef) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getOther_typeRule()) {
					sequence_other_type(context, (PrimitiveDef) semanticObject); 
					return; 
				}
				else break;
			case Iot2Package.SENSOR:
				if(context == grammarAccess.getHWComponentRule() ||
				   context == grammarAccess.getSensorRule()) {
					sequence_Sensor(context, (Sensor) semanticObject); 
					return; 
				}
				else break;
			case Iot2Package.SKETCH:
				if(context == grammarAccess.getSketchRule()) {
					sequence_Sketch(context, (Sketch) semanticObject); 
					return; 
				}
				else break;
			case Iot2Package.STATEMENT_ASSIGNMENT:
				if(context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentRule()) {
					sequence_Statement_FunctioncallOrAssignment(context, (Statement_Assignment) semanticObject); 
					return; 
				}
				else break;
			case Iot2Package.STATEMENT_BLOCK:
				if(context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getStatement_BlockRule()) {
					sequence_Statement_Block(context, (Statement_Block) semanticObject); 
					return; 
				}
				else break;
			case Iot2Package.STATEMENT_CALL_FUNCTION:
				if(context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentRule()) {
					sequence_Statement_FunctioncallOrAssignment(context, (Statement_CallFunction) semanticObject); 
					return; 
				}
				else break;
			case Iot2Package.STATEMENT_CALL_MEMBER_FUNCTION:
				if(context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentRule()) {
					sequence_Statement_FunctioncallOrAssignment(context, (Statement_CallMemberFunction) semanticObject); 
					return; 
				}
				else break;
			case Iot2Package.STATEMENT_FOR_GENERIC:
				if(context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getStatement_For_GenericRule()) {
					sequence_Statement_For_Generic(context, (Statement_For_Generic) semanticObject); 
					return; 
				}
				else break;
			case Iot2Package.STATEMENT_FOR_NUMERIC:
				if(context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getStatement_For_NumericRule()) {
					sequence_Statement_For_Numeric(context, (Statement_For_Numeric) semanticObject); 
					return; 
				}
				else break;
			case Iot2Package.STATEMENT_GLOBAL_FUNCTION_DECLARATION:
				if(context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getStatement_GlobalFunction_DeclarationRule()) {
					sequence_Statement_GlobalFunction_Declaration(context, (Statement_GlobalFunction_Declaration) semanticObject); 
					return; 
				}
				else break;
			case Iot2Package.STATEMENT_IF_THEN_ELSE:
				if(context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getStatement_If_Then_ElseRule()) {
					sequence_Statement_If_Then_Else(context, (Statement_If_Then_Else) semanticObject); 
					return; 
				}
				else break;
			case Iot2Package.STATEMENT_IF_THEN_ELSE_ELSE_IF_PART:
				if(context == grammarAccess.getStatement_If_Then_Else_ElseIfPartRule()) {
					sequence_Statement_If_Then_Else_ElseIfPart(context, (Statement_If_Then_Else_ElseIfPart) semanticObject); 
					return; 
				}
				else break;
			case Iot2Package.STATEMENT_LOCAL_FUNCTION_DECLARATION:
				if(context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getStatement_LocalFunction_DeclarationRule()) {
					sequence_Statement_LocalFunction_Declaration(context, (Statement_LocalFunction_Declaration) semanticObject); 
					return; 
				}
				else break;
			case Iot2Package.STATEMENT_LOCAL_VARIABLE_DECLARATION:
				if(context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getStatement_Local_Variable_DeclarationRule()) {
					sequence_Statement_Local_Variable_Declaration(context, (Statement_Local_Variable_Declaration) semanticObject); 
					return; 
				}
				else break;
			case Iot2Package.STATEMENT_REPEAT:
				if(context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getStatement_RepeatRule()) {
					sequence_Statement_Repeat(context, (Statement_Repeat) semanticObject); 
					return; 
				}
				else break;
			case Iot2Package.STATEMENT_WHILE:
				if(context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getStatement_WhileRule()) {
					sequence_Statement_While(context, (Statement_While) semanticObject); 
					return; 
				}
				else break;
			case Iot2Package.SYSTEM:
				if(context == grammarAccess.getSystemRule()) {
					sequence_System(context, (fr.inria.diverse.iot2.iot2.iot2.System) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == TypesPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case TypesPackage.JVM_FORMAL_PARAMETER:
				if(context == grammarAccess.getFullJvmFormalParameterRule()) {
					sequence_FullJvmFormalParameter(context, (JvmFormalParameter) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getJvmFormalParameterRule()) {
					sequence_JvmFormalParameter(context, (JvmFormalParameter) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.JVM_GENERIC_ARRAY_TYPE_REFERENCE:
				if(context == grammarAccess.getJvmArgumentTypeReferenceRule() ||
				   context == grammarAccess.getJvmTypeReferenceRule() ||
				   context == grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0()) {
					sequence_JvmTypeReference(context, (JvmGenericArrayTypeReference) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.JVM_INNER_TYPE_REFERENCE:
				if(context == grammarAccess.getJvmArgumentTypeReferenceRule() ||
				   context == grammarAccess.getJvmParameterizedTypeReferenceRule() ||
				   context == grammarAccess.getJvmParameterizedTypeReferenceAccess().getJvmInnerTypeReferenceOuterAction_1_4_0_0_0() ||
				   context == grammarAccess.getJvmTypeReferenceRule() ||
				   context == grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0()) {
					sequence_JvmParameterizedTypeReference(context, (JvmInnerTypeReference) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.JVM_LOWER_BOUND:
				if(context == grammarAccess.getJvmLowerBoundAndedRule()) {
					sequence_JvmLowerBoundAnded(context, (JvmLowerBound) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getJvmLowerBoundRule()) {
					sequence_JvmLowerBound(context, (JvmLowerBound) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.JVM_PARAMETERIZED_TYPE_REFERENCE:
				if(context == grammarAccess.getJvmArgumentTypeReferenceRule() ||
				   context == grammarAccess.getJvmParameterizedTypeReferenceRule() ||
				   context == grammarAccess.getJvmParameterizedTypeReferenceAccess().getJvmInnerTypeReferenceOuterAction_1_4_0_0_0() ||
				   context == grammarAccess.getJvmTypeReferenceRule() ||
				   context == grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0()) {
					sequence_JvmParameterizedTypeReference(context, (JvmParameterizedTypeReference) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.JVM_TYPE_PARAMETER:
				if(context == grammarAccess.getJvmTypeParameterRule()) {
					sequence_JvmTypeParameter(context, (JvmTypeParameter) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.JVM_UPPER_BOUND:
				if(context == grammarAccess.getJvmUpperBoundAndedRule()) {
					sequence_JvmUpperBoundAnded(context, (JvmUpperBound) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getJvmUpperBoundRule()) {
					sequence_JvmUpperBound(context, (JvmUpperBound) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.JVM_WILDCARD_TYPE_REFERENCE:
				if(context == grammarAccess.getJvmArgumentTypeReferenceRule() ||
				   context == grammarAccess.getJvmWildcardTypeReferenceRule()) {
					sequence_JvmWildcardTypeReference(context, (JvmWildcardTypeReference) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == XbasePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case XbasePackage.XASSIGNMENT:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPostfixOperationRule() ||
				   context == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XAssignment_XMemberFeatureCall(context, (XAssignment) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XBASIC_FOR_LOOP_EXPRESSION:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXBasicForLoopExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPostfixOperationRule() ||
				   context == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XBasicForLoopExpression(context, (XBasicForLoopExpression) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XBINARY_OPERATION:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPostfixOperationRule() ||
				   context == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XAdditiveExpression_XAndExpression_XAssignment_XEqualityExpression_XMultiplicativeExpression_XOrExpression_XOtherOperatorExpression_XRelationalExpression(context, (XBinaryOperation) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XBLOCK_EXPRESSION:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXBlockExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPostfixOperationRule() ||
				   context == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XBlockExpression(context, (XBlockExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getXExpressionInClosureRule()) {
					sequence_XExpressionInClosure(context, (XBlockExpression) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XBOOLEAN_LITERAL:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXBooleanLiteralRule() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXLiteralRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPostfixOperationRule() ||
				   context == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XBooleanLiteral(context, (XBooleanLiteral) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XCASE_PART:
				if(context == grammarAccess.getXCasePartRule()) {
					sequence_XCasePart(context, (XCasePart) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XCASTED_EXPRESSION:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPostfixOperationRule() ||
				   context == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XCastedExpression(context, (XCastedExpression) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XCATCH_CLAUSE:
				if(context == grammarAccess.getXCatchClauseRule()) {
					sequence_XCatchClause(context, (XCatchClause) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XCLOSURE:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXClosureRule() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXLiteralRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPostfixOperationRule() ||
				   context == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XClosure(context, (XClosure) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getXShortClosureRule()) {
					sequence_XShortClosure(context, (XClosure) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XCONSTRUCTOR_CALL:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXConstructorCallRule() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPostfixOperationRule() ||
				   context == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XConstructorCall(context, (XConstructorCall) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XDO_WHILE_EXPRESSION:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXDoWhileExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPostfixOperationRule() ||
				   context == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XDoWhileExpression(context, (XDoWhileExpression) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XFEATURE_CALL:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPostfixOperationRule() ||
				   context == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XFeatureCall(context, (XFeatureCall) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XFOR_LOOP_EXPRESSION:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXForLoopExpressionRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPostfixOperationRule() ||
				   context == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XForLoopExpression(context, (XForLoopExpression) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XIF_EXPRESSION:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXIfExpressionRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPostfixOperationRule() ||
				   context == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XIfExpression(context, (XIfExpression) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XINSTANCE_OF_EXPRESSION:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPostfixOperationRule() ||
				   context == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XRelationalExpression(context, (XInstanceOfExpression) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XLIST_LITERAL:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXCollectionLiteralRule() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXListLiteralRule() ||
				   context == grammarAccess.getXLiteralRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPostfixOperationRule() ||
				   context == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XListLiteral(context, (XListLiteral) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XMEMBER_FEATURE_CALL:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPostfixOperationRule() ||
				   context == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XMemberFeatureCall(context, (XMemberFeatureCall) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XNULL_LITERAL:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXLiteralRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXNullLiteralRule() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPostfixOperationRule() ||
				   context == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XNullLiteral(context, (XNullLiteral) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XNUMBER_LITERAL:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXLiteralRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXNumberLiteralRule() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPostfixOperationRule() ||
				   context == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XNumberLiteral(context, (XNumberLiteral) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XPOSTFIX_OPERATION:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPostfixOperationRule() ||
				   context == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XPostfixOperation(context, (XPostfixOperation) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XRETURN_EXPRESSION:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPostfixOperationRule() ||
				   context == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXReturnExpressionRule() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XReturnExpression(context, (XReturnExpression) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XSET_LITERAL:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXCollectionLiteralRule() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXLiteralRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPostfixOperationRule() ||
				   context == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXSetLiteralRule() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XSetLiteral(context, (XSetLiteral) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XSTRING_LITERAL:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXLiteralRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPostfixOperationRule() ||
				   context == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXStringLiteralRule() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XStringLiteral(context, (XStringLiteral) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XSWITCH_EXPRESSION:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPostfixOperationRule() ||
				   context == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXSwitchExpressionRule() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XSwitchExpression(context, (XSwitchExpression) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XSYNCHRONIZED_EXPRESSION:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPostfixOperationRule() ||
				   context == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXSynchronizedExpressionRule() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XSynchronizedExpression(context, (XSynchronizedExpression) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XTHROW_EXPRESSION:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPostfixOperationRule() ||
				   context == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXThrowExpressionRule() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XThrowExpression(context, (XThrowExpression) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XTRY_CATCH_FINALLY_EXPRESSION:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPostfixOperationRule() ||
				   context == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXTryCatchFinallyExpressionRule() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XTryCatchFinallyExpression(context, (XTryCatchFinallyExpression) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XTYPE_LITERAL:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXLiteralRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPostfixOperationRule() ||
				   context == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXTypeLiteralRule() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XTypeLiteral(context, (XTypeLiteral) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XUNARY_OPERATION:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPostfixOperationRule() ||
				   context == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XUnaryOperation(context, (XUnaryOperation) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XVARIABLE_DECLARATION:
				if(context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXVariableDeclarationRule()) {
					sequence_XVariableDeclaration(context, (XVariableDeclaration) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XWHILE_EXPRESSION:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPostfixOperationRule() ||
				   context == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule() ||
				   context == grammarAccess.getXWhileExpressionRule()) {
					sequence_XWhileExpression(context, (XWhileExpression) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == XtypePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case XtypePackage.XFUNCTION_TYPE_REF:
				if(context == grammarAccess.getJvmArgumentTypeReferenceRule() ||
				   context == grammarAccess.getJvmTypeReferenceRule() ||
				   context == grammarAccess.getXFunctionTypeRefRule()) {
					sequence_XFunctionTypeRef(context, (XFunctionTypeRef) semanticObject); 
					return; 
				}
				else break;
			case XtypePackage.XIMPORT_DECLARATION:
				if(context == grammarAccess.getXImportDeclarationRule()) {
					sequence_XImportDeclaration(context, (XImportDeclaration) semanticObject); 
					return; 
				}
				else break;
			case XtypePackage.XIMPORT_SECTION:
				if(context == grammarAccess.getXImportSectionRule()) {
					sequence_XImportSection(context, (XImportSection) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=ValidID incoming+=[ActivityEdge|ID] incoming+=[ActivityEdge|ID]*)
	 */
	protected void sequence_ActivityFinalNode(EObject context, ActivityFinalNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ValidID 
	 *         (inputs+=Variable inputs+=Variable*)? 
	 *         (locals+=Variable locals+=Variable*)? 
	 *         (nodes+=ActivityNode nodes+=ActivityNode*)? 
	 *         (edges+=ActivityEdge edges+=ActivityEdge*)?
	 *     )
	 */
	protected void sequence_Activity(EObject context, Activity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ValidID services+=OperationDef*)
	 */
	protected void sequence_Actuator(EObject context, Actuator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (statements+=Statement* returnValue=LastStatement?)
	 */
	protected void sequence_Block(EObject context, Block semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ValidID type=BoardType components+=[HWComponent|ValidID]*)
	 */
	protected void sequence_Board(EObject context, Board semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=EBoolean
	 */
	protected void sequence_BooleanValue(EObject context, BooleanValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Iot2Package.Literals.BOOLEAN_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Iot2Package.Literals.BOOLEAN_VALUE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBooleanValueAccess().getValueEBooleanParserRuleCall_0(), semanticObject.isValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ValidID initialValue=Value?)
	 */
	protected void sequence_BooleanVariable(EObject context, BooleanVariable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ValidID source=[ActivityNode|ID] target=[ActivityNode|ID] guard=[BooleanVariable|ID]?)
	 */
	protected void sequence_ControlFlow(EObject context, ControlFlow semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ValidID incoming+=[ActivityEdge|ID] (outgoing+=[ActivityEdge|ID] outgoing+=[ActivityEdge|ID]*)?)
	 */
	protected void sequence_DecisionNode(EObject context, DecisionNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (array=Expression_AccessMemberOrArrayElement_Expression_AccessArray_1_0_1 index=Expression)
	 */
	protected void sequence_Expression_AccessMemberOrArrayElement(EObject context, Expression_AccessArray semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Iot2Package.Literals.EXPRESSION_ACCESS_ARRAY__ARRAY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Iot2Package.Literals.EXPRESSION_ACCESS_ARRAY__ARRAY));
			if(transientValues.isValueTransient(semanticObject, Iot2Package.Literals.EXPRESSION_ACCESS_ARRAY__INDEX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Iot2Package.Literals.EXPRESSION_ACCESS_ARRAY__INDEX));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessArrayArrayAction_1_0_1(), semanticObject.getArray());
		feeder.accept(grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getIndexExpressionParserRuleCall_1_0_2_0(), semanticObject.getIndex());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (object=Expression_AccessMemberOrArrayElement_Expression_AccessMember_1_1_1 memberName=ValidID)
	 */
	protected void sequence_Expression_AccessMemberOrArrayElement(EObject context, Expression_AccessMember semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Iot2Package.Literals.EXPRESSION_ACCESS_MEMBER__OBJECT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Iot2Package.Literals.EXPRESSION_ACCESS_MEMBER__OBJECT));
			if(transientValues.isValueTransient(semanticObject, Iot2Package.Literals.EXPRESSION_ACCESS_MEMBER__MEMBER_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Iot2Package.Literals.EXPRESSION_ACCESS_MEMBER__MEMBER_NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessMemberObjectAction_1_1_1(), semanticObject.getObject());
		feeder.accept(grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getMemberNameValidIDParserRuleCall_1_1_2_0(), semanticObject.getMemberName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Expression_And_Expression_And_1_1 right=Expression_Compare)
	 */
	protected void sequence_Expression_And(EObject context, Expression_And semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Iot2Package.Literals.EXPRESSION_AND__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Iot2Package.Literals.EXPRESSION_AND__LEFT));
			if(transientValues.isValueTransient(semanticObject, Iot2Package.Literals.EXPRESSION_AND__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Iot2Package.Literals.EXPRESSION_AND__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpression_AndAccess().getExpression_AndLeftAction_1_1(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getExpression_AndAccess().getRightExpression_CompareParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Expression_Compare_Expression_Equal_1_4_1 right=Expression_Concatenation)
	 */
	protected void sequence_Expression_Compare(EObject context, Expression_Equal semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Iot2Package.Literals.EXPRESSION_EQUAL__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Iot2Package.Literals.EXPRESSION_EQUAL__LEFT));
			if(transientValues.isValueTransient(semanticObject, Iot2Package.Literals.EXPRESSION_EQUAL__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Iot2Package.Literals.EXPRESSION_EQUAL__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpression_CompareAccess().getExpression_EqualLeftAction_1_4_1(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getExpression_CompareAccess().getRightExpression_ConcatenationParserRuleCall_1_4_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Expression_Compare_Expression_Larger_1_0_1 right=Expression_Concatenation)
	 */
	protected void sequence_Expression_Compare(EObject context, Expression_Larger semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Iot2Package.Literals.EXPRESSION_LARGER__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Iot2Package.Literals.EXPRESSION_LARGER__LEFT));
			if(transientValues.isValueTransient(semanticObject, Iot2Package.Literals.EXPRESSION_LARGER__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Iot2Package.Literals.EXPRESSION_LARGER__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpression_CompareAccess().getExpression_LargerLeftAction_1_0_1(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getExpression_CompareAccess().getRightExpression_ConcatenationParserRuleCall_1_0_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Expression_Compare_Expression_Larger_Equal_1_1_1 right=Expression_Concatenation)
	 */
	protected void sequence_Expression_Compare(EObject context, Expression_Larger_Equal semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Iot2Package.Literals.EXPRESSION_LARGER_EQUAL__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Iot2Package.Literals.EXPRESSION_LARGER_EQUAL__LEFT));
			if(transientValues.isValueTransient(semanticObject, Iot2Package.Literals.EXPRESSION_LARGER_EQUAL__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Iot2Package.Literals.EXPRESSION_LARGER_EQUAL__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpression_CompareAccess().getExpression_Larger_EqualLeftAction_1_1_1(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getExpression_CompareAccess().getRightExpression_ConcatenationParserRuleCall_1_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Expression_Compare_Expression_Not_Equal_1_5_1 right=Expression_Concatenation)
	 */
	protected void sequence_Expression_Compare(EObject context, Expression_Not_Equal semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Iot2Package.Literals.EXPRESSION_NOT_EQUAL__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Iot2Package.Literals.EXPRESSION_NOT_EQUAL__LEFT));
			if(transientValues.isValueTransient(semanticObject, Iot2Package.Literals.EXPRESSION_NOT_EQUAL__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Iot2Package.Literals.EXPRESSION_NOT_EQUAL__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpression_CompareAccess().getExpression_Not_EqualLeftAction_1_5_1(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getExpression_CompareAccess().getRightExpression_ConcatenationParserRuleCall_1_5_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Expression_Compare_Expression_Smaller_1_2_1 right=Expression_Concatenation)
	 */
	protected void sequence_Expression_Compare(EObject context, Expression_Smaller semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Iot2Package.Literals.EXPRESSION_SMALLER__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Iot2Package.Literals.EXPRESSION_SMALLER__LEFT));
			if(transientValues.isValueTransient(semanticObject, Iot2Package.Literals.EXPRESSION_SMALLER__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Iot2Package.Literals.EXPRESSION_SMALLER__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpression_CompareAccess().getExpression_SmallerLeftAction_1_2_1(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getExpression_CompareAccess().getRightExpression_ConcatenationParserRuleCall_1_2_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Expression_Compare_Expression_Smaller_Equal_1_3_1 right=Expression_Concatenation)
	 */
	protected void sequence_Expression_Compare(EObject context, Expression_Smaller_Equal semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Iot2Package.Literals.EXPRESSION_SMALLER_EQUAL__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Iot2Package.Literals.EXPRESSION_SMALLER_EQUAL__LEFT));
			if(transientValues.isValueTransient(semanticObject, Iot2Package.Literals.EXPRESSION_SMALLER_EQUAL__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Iot2Package.Literals.EXPRESSION_SMALLER_EQUAL__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpression_CompareAccess().getExpression_Smaller_EqualLeftAction_1_3_1(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getExpression_CompareAccess().getRightExpression_ConcatenationParserRuleCall_1_3_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Expression_Concatenation_Expression_Concatenation_1_1 right=Expression_Concatenation)
	 */
	protected void sequence_Expression_Concatenation(EObject context, Expression_Concatenation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Iot2Package.Literals.EXPRESSION_CONCATENATION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Iot2Package.Literals.EXPRESSION_CONCATENATION__LEFT));
			if(transientValues.isValueTransient(semanticObject, Iot2Package.Literals.EXPRESSION_CONCATENATION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Iot2Package.Literals.EXPRESSION_CONCATENATION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpression_ConcatenationAccess().getExpression_ConcatenationLeftAction_1_1(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getExpression_ConcatenationAccess().getRightExpression_ConcatenationParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Expression_Exponentiation_Expression_Exponentiation_1_1 right=Expression_Exponentiation)
	 */
	protected void sequence_Expression_Exponentiation(EObject context, Expression_Exponentiation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Iot2Package.Literals.EXPRESSION_EXPONENTIATION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Iot2Package.Literals.EXPRESSION_EXPONENTIATION__LEFT));
			if(transientValues.isValueTransient(semanticObject, Iot2Package.Literals.EXPRESSION_EXPONENTIATION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Iot2Package.Literals.EXPRESSION_EXPONENTIATION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpression_ExponentiationAccess().getExpression_ExponentiationLeftAction_1_1(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getExpression_ExponentiationAccess().getRightExpression_ExponentiationParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     function=Function
	 */
	protected void sequence_Expression_Function(EObject context, Expression_Function semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Iot2Package.Literals.EXPRESSION_FUNCTION__FUNCTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Iot2Package.Literals.EXPRESSION_FUNCTION__FUNCTION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpression_FunctionAccess().getFunctionFunctionParserRuleCall_1_0(), semanticObject.getFunction());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (object=Expression_Functioncall_Expression_CallFunction_1_1_0 arguments=Functioncall_Arguments)
	 */
	protected void sequence_Expression_Functioncall(EObject context, Expression_CallFunction semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Iot2Package.Literals.EXPRESSION_CALL_FUNCTION__OBJECT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Iot2Package.Literals.EXPRESSION_CALL_FUNCTION__OBJECT));
			if(transientValues.isValueTransient(semanticObject, Iot2Package.Literals.EXPRESSION_CALL_FUNCTION__ARGUMENTS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Iot2Package.Literals.EXPRESSION_CALL_FUNCTION__ARGUMENTS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpression_FunctioncallAccess().getExpression_CallFunctionObjectAction_1_1_0(), semanticObject.getObject());
		feeder.accept(grammarAccess.getExpression_FunctioncallAccess().getArgumentsFunctioncall_ArgumentsParserRuleCall_1_1_1_0(), semanticObject.getArguments());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (object=Expression_Functioncall_Expression_CallMemberFunction_1_0_1 memberFunctionName=ValidID arguments=Functioncall_Arguments)
	 */
	protected void sequence_Expression_Functioncall(EObject context, Expression_CallMemberFunction semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Iot2Package.Literals.EXPRESSION_CALL_MEMBER_FUNCTION__OBJECT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Iot2Package.Literals.EXPRESSION_CALL_MEMBER_FUNCTION__OBJECT));
			if(transientValues.isValueTransient(semanticObject, Iot2Package.Literals.EXPRESSION_CALL_MEMBER_FUNCTION__MEMBER_FUNCTION_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Iot2Package.Literals.EXPRESSION_CALL_MEMBER_FUNCTION__MEMBER_FUNCTION_NAME));
			if(transientValues.isValueTransient(semanticObject, Iot2Package.Literals.EXPRESSION_CALL_MEMBER_FUNCTION__ARGUMENTS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Iot2Package.Literals.EXPRESSION_CALL_MEMBER_FUNCTION__ARGUMENTS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpression_FunctioncallAccess().getExpression_CallMemberFunctionObjectAction_1_0_1(), semanticObject.getObject());
		feeder.accept(grammarAccess.getExpression_FunctioncallAccess().getMemberFunctionNameValidIDParserRuleCall_1_0_2_0(), semanticObject.getMemberFunctionName());
		feeder.accept(grammarAccess.getExpression_FunctioncallAccess().getArgumentsFunctioncall_ArgumentsParserRuleCall_1_0_3_0(), semanticObject.getArguments());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Expression_MultiplicationDivisionModulo_Expression_Division_1_1_1 right=Expression_Unary)
	 */
	protected void sequence_Expression_MultiplicationDivisionModulo(EObject context, Expression_Division semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Iot2Package.Literals.EXPRESSION_DIVISION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Iot2Package.Literals.EXPRESSION_DIVISION__LEFT));
			if(transientValues.isValueTransient(semanticObject, Iot2Package.Literals.EXPRESSION_DIVISION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Iot2Package.Literals.EXPRESSION_DIVISION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_DivisionLeftAction_1_1_1(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getRightExpression_UnaryParserRuleCall_1_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Expression_MultiplicationDivisionModulo_Expression_Modulo_1_2_1 right=Expression_Unary)
	 */
	protected void sequence_Expression_MultiplicationDivisionModulo(EObject context, Expression_Modulo semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Iot2Package.Literals.EXPRESSION_MODULO__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Iot2Package.Literals.EXPRESSION_MODULO__LEFT));
			if(transientValues.isValueTransient(semanticObject, Iot2Package.Literals.EXPRESSION_MODULO__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Iot2Package.Literals.EXPRESSION_MODULO__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_ModuloLeftAction_1_2_1(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getRightExpression_UnaryParserRuleCall_1_2_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Expression_MultiplicationDivisionModulo_Expression_Multiplication_1_0_1 right=Expression_Unary)
	 */
	protected void sequence_Expression_MultiplicationDivisionModulo(EObject context, Expression_Multiplication semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Iot2Package.Literals.EXPRESSION_MULTIPLICATION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Iot2Package.Literals.EXPRESSION_MULTIPLICATION__LEFT));
			if(transientValues.isValueTransient(semanticObject, Iot2Package.Literals.EXPRESSION_MULTIPLICATION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Iot2Package.Literals.EXPRESSION_MULTIPLICATION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_MultiplicationLeftAction_1_0_1(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getRightExpression_UnaryParserRuleCall_1_0_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=LUA_NUMBER
	 */
	protected void sequence_Expression_Number(EObject context, Expression_Number semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Iot2Package.Literals.EXPRESSION_NUMBER__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Iot2Package.Literals.EXPRESSION_NUMBER__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpression_NumberAccess().getValueLUA_NUMBERTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Expression_Or_Expression_Or_1_1 right=Expression_And)
	 */
	protected void sequence_Expression_Or(EObject context, Expression_Or semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Iot2Package.Literals.EXPRESSION_OR__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Iot2Package.Literals.EXPRESSION_OR__LEFT));
			if(transientValues.isValueTransient(semanticObject, Iot2Package.Literals.EXPRESSION_OR__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Iot2Package.Literals.EXPRESSION_OR__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpression_OrAccess().getExpression_OrLeftAction_1_1(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getExpression_OrAccess().getRightExpression_AndParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Expression_PlusMinus_Expression_Minus_1_1_1 right=Expression_MultiplicationDivisionModulo)
	 */
	protected void sequence_Expression_PlusMinus(EObject context, Expression_Minus semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Iot2Package.Literals.EXPRESSION_MINUS__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Iot2Package.Literals.EXPRESSION_MINUS__LEFT));
			if(transientValues.isValueTransient(semanticObject, Iot2Package.Literals.EXPRESSION_MINUS__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Iot2Package.Literals.EXPRESSION_MINUS__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpression_PlusMinusAccess().getExpression_MinusLeftAction_1_1_1(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getExpression_PlusMinusAccess().getRightExpression_MultiplicationDivisionModuloParserRuleCall_1_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Expression_PlusMinus_Expression_Plus_1_0_1 right=Expression_MultiplicationDivisionModulo)
	 */
	protected void sequence_Expression_PlusMinus(EObject context, Expression_Plus semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Iot2Package.Literals.EXPRESSION_PLUS__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Iot2Package.Literals.EXPRESSION_PLUS__LEFT));
			if(transientValues.isValueTransient(semanticObject, Iot2Package.Literals.EXPRESSION_PLUS__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Iot2Package.Literals.EXPRESSION_PLUS__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpression_PlusMinusAccess().getExpression_PlusLeftAction_1_0_1(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getExpression_PlusMinusAccess().getRightExpression_MultiplicationDivisionModuloParserRuleCall_1_0_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_Expression_String(EObject context, Expression_String semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Iot2Package.Literals.EXPRESSION_STRING__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Iot2Package.Literals.EXPRESSION_STRING__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpression_StringAccess().getValueSTRINGTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((fields+=Field fields+=Field*)?)
	 */
	protected void sequence_Expression_TableConstructor(EObject context, Expression_TableConstructor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     exp=Expression_Unary
	 */
	protected void sequence_Expression_Unary(EObject context, Expression_Invert semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Iot2Package.Literals.EXPRESSION_INVERT__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Iot2Package.Literals.EXPRESSION_INVERT__EXP));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpression_UnaryAccess().getExpExpression_UnaryParserRuleCall_3_2_0(), semanticObject.getExp());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     exp=Expression_Unary
	 */
	protected void sequence_Expression_Unary(EObject context, Expression_Length semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Iot2Package.Literals.EXPRESSION_LENGTH__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Iot2Package.Literals.EXPRESSION_LENGTH__EXP));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpression_UnaryAccess().getExpExpression_UnaryParserRuleCall_2_2_0(), semanticObject.getExp());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     exp=Expression_Unary
	 */
	protected void sequence_Expression_Unary(EObject context, Expression_Negate semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Iot2Package.Literals.EXPRESSION_NEGATE__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Iot2Package.Literals.EXPRESSION_NEGATE__EXP));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpression_UnaryAccess().getExpExpression_UnaryParserRuleCall_1_2_0(), semanticObject.getExp());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     variable=ValidID
	 */
	protected void sequence_Expression_VariableName(EObject context, Expression_VariableName semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Iot2Package.Literals.EXPRESSION_VARIABLE_NAME__VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Iot2Package.Literals.EXPRESSION_VARIABLE_NAME__VARIABLE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpression_VariableNameAccess().getVariableValidIDParserRuleCall_1_1_0(), semanticObject.getVariable());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (indexExpression=Expression value=Expression)
	 */
	protected void sequence_Field_AddEntryToTable_Brackets(EObject context, Field_AddEntryToTable_Brackets semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (key=ValidID value=Expression)
	 */
	protected void sequence_Field_AddEntryToTable(EObject context, Field_AddEntryToTable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=Expression
	 */
	protected void sequence_Field_AppendEntryToTable(EObject context, Field_AppendEntryToTable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ValidID incoming+=[ActivityEdge|ID] (outgoing+=[ActivityEdge|ID] outgoing+=[ActivityEdge|ID]*)?)
	 */
	protected void sequence_ForkNode(EObject context, ForkNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((parameters+=ValidID parameters+=ValidID*)? varArgs?='...'? body=Block)
	 */
	protected void sequence_Function(EObject context, Function semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((arguments+=Expression arguments+=Expression*)? | arguments+=Expression_TableConstructor | arguments+=Expression_String)
	 */
	protected void sequence_Functioncall_Arguments(EObject context, Functioncall_Arguments semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ValidID outgoing+=[ActivityEdge|ID] outgoing+=[ActivityEdge|ID]*)
	 */
	protected void sequence_InitialNode(EObject context, InitialNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_IntegerValue(EObject context, IntegerValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Iot2Package.Literals.INTEGER_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Iot2Package.Literals.INTEGER_VALUE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIntegerValueAccess().getValueINTTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ValidID initialValue=Value?)
	 */
	protected void sequence_IntegerVariable(EObject context, IntegerVariable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ValidID (incoming+=[ActivityEdge|ID] incoming+=[ActivityEdge|ID]*)? outgoing+=[ActivityEdge|ID])
	 */
	protected void sequence_JoinNode(EObject context, JoinNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {LastStatement_Break}
	 */
	protected void sequence_LastStatement_Break(EObject context, LastStatement_Break semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((returnValues+=Expression returnValues+=Expression*)?)
	 */
	protected void sequence_LastStatement_Return(EObject context, LastStatement_ReturnWithValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ValidID (incoming+=[ActivityEdge|ID] incoming+=[ActivityEdge|ID]*)? outgoing+=[ActivityEdge|ID])
	 */
	protected void sequence_MergeNode(EObject context, MergeNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ValidID 
	 *         (incoming+=[ActivityEdge|ID] incoming+=[ActivityEdge|ID]*)? 
	 *         (outgoing+=[ActivityEdge|ID] outgoing+=[ActivityEdge|ID]*)? 
	 *         service=[OperationDef|ID]?
	 *     )
	 */
	protected void sequence_OpaqueAction(EObject context, OpaqueAction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ValidID (parameters+=ParameterDef parameters+=ParameterDef*)? lua=Block)
	 */
	protected void sequence_OperationDef(EObject context, OperationDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (direction=param_attribute containedType=PrimitiveDef identifier=ValidID)
	 */
	protected void sequence_ParameterDef(EObject context, ParameterDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         kind=short_type | 
	 *         kind=long_type | 
	 *         kind=longlong_type | 
	 *         kind=ushort_type | 
	 *         kind=ulong_type | 
	 *         kind=ulonglong_type | 
	 *         kind=float_type | 
	 *         kind=double_type | 
	 *         kind=longdouble_type | 
	 *         kind=char_type | 
	 *         kind=wide_char_type | 
	 *         kind=string_type | 
	 *         kind=wide_string_type | 
	 *         kind=boolean_type | 
	 *         kind=octet_type | 
	 *         kind=any_type
	 *     )
	 */
	protected void sequence_PrimitiveDef_charstr_type_floating_pt_type_integer_type_other_type(EObject context, PrimitiveDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ValidID services+=OperationDef*)
	 */
	protected void sequence_Sensor(EObject context, Sensor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     activity=Activity
	 */
	protected void sequence_Sketch(EObject context, Sketch semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Iot2Package.Literals.SKETCH__ACTIVITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Iot2Package.Literals.SKETCH__ACTIVITY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSketchAccess().getActivityActivityParserRuleCall_3_0(), semanticObject.getActivity());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     block=Block
	 */
	protected void sequence_Statement_Block(EObject context, Statement_Block semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Iot2Package.Literals.STATEMENT_BLOCK__BLOCK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Iot2Package.Literals.STATEMENT_BLOCK__BLOCK));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStatement_BlockAccess().getBlockBlockParserRuleCall_1_0(), semanticObject.getBlock());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (names+=ValidID names+=ValidID* expressions+=Expression expressions+=Expression* block=Block)
	 */
	protected void sequence_Statement_For_Generic(EObject context, Statement_For_Generic semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (iteratorName=ValidID startExpr=Expression untilExpr=Expression stepExpr=Expression? block=Block)
	 */
	protected void sequence_Statement_For_Numeric(EObject context, Statement_For_Numeric semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             (variable+=Statement_FunctioncallOrAssignment_Statement_Assignment_1_0_0 variable+=Expression_AccessMemberOrArrayElement* values+=Expression) | 
	 *             (variable+=Statement_FunctioncallOrAssignment_Statement_Assignment_1_0_0 values+=Expression)
	 *         ) 
	 *         values+=Expression*
	 *     )
	 */
	protected void sequence_Statement_FunctioncallOrAssignment(EObject context, Statement_Assignment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {Expression_False}
	 */
	protected void sequence_Statement_FunctioncallOrAssignment_Statement_Assignment_1_0_0_Statement_CallFunction_1_2_0_Statement_CallMemberFunction_1_1_1(EObject context, Expression_False semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {Expression_Nil}
	 */
	protected void sequence_Statement_FunctioncallOrAssignment_Statement_Assignment_1_0_0_Statement_CallFunction_1_2_0_Statement_CallMemberFunction_1_1_1(EObject context, Expression_Nil semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {Expression_True}
	 */
	protected void sequence_Statement_FunctioncallOrAssignment_Statement_Assignment_1_0_0_Statement_CallFunction_1_2_0_Statement_CallMemberFunction_1_1_1(EObject context, Expression_True semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {Expression_VarArgs}
	 */
	protected void sequence_Statement_FunctioncallOrAssignment_Statement_Assignment_1_0_0_Statement_CallFunction_1_2_0_Statement_CallMemberFunction_1_1_1(EObject context, Expression_VarArgs semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (object=Statement_FunctioncallOrAssignment_Statement_CallFunction_1_2_0 arguments=Functioncall_Arguments)
	 */
	protected void sequence_Statement_FunctioncallOrAssignment(EObject context, Statement_CallFunction semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Iot2Package.Literals.STATEMENT_CALL_FUNCTION__OBJECT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Iot2Package.Literals.STATEMENT_CALL_FUNCTION__OBJECT));
			if(transientValues.isValueTransient(semanticObject, Iot2Package.Literals.STATEMENT_CALL_FUNCTION__ARGUMENTS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Iot2Package.Literals.STATEMENT_CALL_FUNCTION__ARGUMENTS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallFunctionObjectAction_1_2_0(), semanticObject.getObject());
		feeder.accept(grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getArgumentsFunctioncall_ArgumentsParserRuleCall_1_2_1_0(), semanticObject.getArguments());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (object=Statement_FunctioncallOrAssignment_Statement_CallMemberFunction_1_1_1 memberFunctionName=ValidID arguments=Functioncall_Arguments)
	 */
	protected void sequence_Statement_FunctioncallOrAssignment(EObject context, Statement_CallMemberFunction semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Iot2Package.Literals.STATEMENT_CALL_MEMBER_FUNCTION__OBJECT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Iot2Package.Literals.STATEMENT_CALL_MEMBER_FUNCTION__OBJECT));
			if(transientValues.isValueTransient(semanticObject, Iot2Package.Literals.STATEMENT_CALL_MEMBER_FUNCTION__MEMBER_FUNCTION_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Iot2Package.Literals.STATEMENT_CALL_MEMBER_FUNCTION__MEMBER_FUNCTION_NAME));
			if(transientValues.isValueTransient(semanticObject, Iot2Package.Literals.STATEMENT_CALL_MEMBER_FUNCTION__ARGUMENTS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Iot2Package.Literals.STATEMENT_CALL_MEMBER_FUNCTION__ARGUMENTS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallMemberFunctionObjectAction_1_1_1(), semanticObject.getObject());
		feeder.accept(grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getMemberFunctionNameValidIDParserRuleCall_1_1_2_0(), semanticObject.getMemberFunctionName());
		feeder.accept(grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getArgumentsFunctioncall_ArgumentsParserRuleCall_1_1_3_0(), semanticObject.getArguments());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (prefix+=ValidID prefix+=ValidID* functionName=ValidID? function=Function)
	 */
	protected void sequence_Statement_GlobalFunction_Declaration(EObject context, Statement_GlobalFunction_Declaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (elseifExpression=Expression elseifBlock=Block)
	 */
	protected void sequence_Statement_If_Then_Else_ElseIfPart(EObject context, Statement_If_Then_Else_ElseIfPart semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Iot2Package.Literals.STATEMENT_IF_THEN_ELSE_ELSE_IF_PART__ELSEIF_EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Iot2Package.Literals.STATEMENT_IF_THEN_ELSE_ELSE_IF_PART__ELSEIF_EXPRESSION));
			if(transientValues.isValueTransient(semanticObject, Iot2Package.Literals.STATEMENT_IF_THEN_ELSE_ELSE_IF_PART__ELSEIF_BLOCK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Iot2Package.Literals.STATEMENT_IF_THEN_ELSE_ELSE_IF_PART__ELSEIF_BLOCK));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStatement_If_Then_Else_ElseIfPartAccess().getElseifExpressionExpressionParserRuleCall_1_0(), semanticObject.getElseifExpression());
		feeder.accept(grammarAccess.getStatement_If_Then_Else_ElseIfPartAccess().getElseifBlockBlockParserRuleCall_3_0(), semanticObject.getElseifBlock());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (ifExpression=Expression ifBlock=Block elseIf+=Statement_If_Then_Else_ElseIfPart* elseBlock=Block?)
	 */
	protected void sequence_Statement_If_Then_Else(EObject context, Statement_If_Then_Else semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (functionName=ValidID function=Function)
	 */
	protected void sequence_Statement_LocalFunction_Declaration(EObject context, Statement_LocalFunction_Declaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Iot2Package.Literals.STATEMENT_LOCAL_FUNCTION_DECLARATION__FUNCTION_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Iot2Package.Literals.STATEMENT_LOCAL_FUNCTION_DECLARATION__FUNCTION_NAME));
			if(transientValues.isValueTransient(semanticObject, Iot2Package.Literals.STATEMENT_LOCAL_FUNCTION_DECLARATION__FUNCTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Iot2Package.Literals.STATEMENT_LOCAL_FUNCTION_DECLARATION__FUNCTION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStatement_LocalFunction_DeclarationAccess().getFunctionNameValidIDParserRuleCall_2_0(), semanticObject.getFunctionName());
		feeder.accept(grammarAccess.getStatement_LocalFunction_DeclarationAccess().getFunctionFunctionParserRuleCall_3_0(), semanticObject.getFunction());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (variableNames+=ValidID variableNames+=ValidID* (initialValue+=Expression initialValue+=Expression*)?)
	 */
	protected void sequence_Statement_Local_Variable_Declaration(EObject context, Statement_Local_Variable_Declaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (block=Block expression=Expression)
	 */
	protected void sequence_Statement_Repeat(EObject context, Statement_Repeat semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Iot2Package.Literals.STATEMENT_REPEAT__BLOCK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Iot2Package.Literals.STATEMENT_REPEAT__BLOCK));
			if(transientValues.isValueTransient(semanticObject, Iot2Package.Literals.STATEMENT_REPEAT__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Iot2Package.Literals.STATEMENT_REPEAT__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStatement_RepeatAccess().getBlockBlockParserRuleCall_1_0(), semanticObject.getBlock());
		feeder.accept(grammarAccess.getStatement_RepeatAccess().getExpressionExpressionParserRuleCall_3_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (expression=Expression block=Block)
	 */
	protected void sequence_Statement_While(EObject context, Statement_While semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Iot2Package.Literals.STATEMENT_WHILE__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Iot2Package.Literals.STATEMENT_WHILE__EXPRESSION));
			if(transientValues.isValueTransient(semanticObject, Iot2Package.Literals.STATEMENT_WHILE__BLOCK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Iot2Package.Literals.STATEMENT_WHILE__BLOCK));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStatement_WhileAccess().getExpressionExpressionParserRuleCall_1_0(), semanticObject.getExpression());
		feeder.accept(grammarAccess.getStatement_WhileAccess().getBlockBlockParserRuleCall_3_0(), semanticObject.getBlock());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ValidID (components+=HWComponent components+=HWComponent*)? (boards+=Board boards+=Board*)? sketch=Sketch?)
	 */
	protected void sequence_System(EObject context, fr.inria.diverse.iot2.iot2.iot2.System semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (kind=char_type | kind=wide_char_type | kind=string_type | kind=wide_string_type)
	 */
	protected void sequence_charstr_type(EObject context, PrimitiveDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (kind=float_type | kind=double_type | kind=longdouble_type)
	 */
	protected void sequence_floating_pt_type(EObject context, PrimitiveDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         kind=short_type | 
	 *         kind=long_type | 
	 *         kind=longlong_type | 
	 *         kind=ushort_type | 
	 *         kind=ulong_type | 
	 *         kind=ulonglong_type
	 *     )
	 */
	protected void sequence_integer_type(EObject context, PrimitiveDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (kind=boolean_type | kind=octet_type | kind=any_type)
	 */
	protected void sequence_other_type(EObject context, PrimitiveDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
