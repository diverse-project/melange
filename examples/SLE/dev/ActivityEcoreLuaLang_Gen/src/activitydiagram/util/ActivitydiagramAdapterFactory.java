/**
 */
package activitydiagram.util;

import activitydiagram.*;

import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see activitydiagram.ActivitydiagramPackage
 * @generated
 */
public class ActivitydiagramAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ActivitydiagramPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivitydiagramAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ActivitydiagramPackage.eINSTANCE;
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
	protected ActivitydiagramSwitch<Adapter> modelSwitch =
		new ActivitydiagramSwitch<Adapter>() {
			@Override
			public Adapter caseOpaqueAction(OpaqueAction object) {
				return createOpaqueActionAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter caseExecutableNode(ExecutableNode object) {
				return createExecutableNodeAdapter();
			}
			@Override
			public Adapter caseActivityNode(ActivityNode object) {
				return createActivityNodeAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseActivityEdge(ActivityEdge object) {
				return createActivityEdgeAdapter();
			}
			@Override
			public Adapter caseActivity(Activity object) {
				return createActivityAdapter();
			}
			@Override
			public Adapter caseVariable(Variable object) {
				return createVariableAdapter();
			}
			@Override
			public Adapter caseValue(Value object) {
				return createValueAdapter();
			}
			@Override
			public Adapter caseInputValue(InputValue object) {
				return createInputValueAdapter();
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
			public Adapter caseField(Field object) {
				return createFieldAdapter();
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
			public Adapter caseEAttribute(EAttribute object) {
				return createEAttributeAdapter();
			}
			@Override
			public Adapter caseEAnnotation(EAnnotation object) {
				return createEAnnotationAdapter();
			}
			@Override
			public Adapter caseEClass(EClass object) {
				return createEClassAdapter();
			}
			@Override
			public Adapter caseEClassifier(EClassifier object) {
				return createEClassifierAdapter();
			}
			@Override
			public Adapter caseEDataType(EDataType object) {
				return createEDataTypeAdapter();
			}
			@Override
			public Adapter caseEEnum(EEnum object) {
				return createEEnumAdapter();
			}
			@Override
			public Adapter caseEEnumLiteral(EEnumLiteral object) {
				return createEEnumLiteralAdapter();
			}
			@Override
			public Adapter caseEFactory(EFactory object) {
				return createEFactoryAdapter();
			}
			@Override
			public Adapter caseEModelElement(EModelElement object) {
				return createEModelElementAdapter();
			}
			@Override
			public Adapter caseENamedElement(ENamedElement object) {
				return createENamedElementAdapter();
			}
			@Override
			public Adapter caseEObject(activitydiagram.EObject object) {
				return createEObjectAdapter();
			}
			@Override
			public Adapter caseEOperation(EOperation object) {
				return createEOperationAdapter();
			}
			@Override
			public Adapter caseEPackage(EPackage object) {
				return createEPackageAdapter();
			}
			@Override
			public Adapter caseEParameter(EParameter object) {
				return createEParameterAdapter();
			}
			@Override
			public Adapter caseEReference(EReference object) {
				return createEReferenceAdapter();
			}
			@Override
			public Adapter caseEStructuralFeature(EStructuralFeature object) {
				return createEStructuralFeatureAdapter();
			}
			@Override
			public Adapter caseETypedElement(ETypedElement object) {
				return createETypedElementAdapter();
			}
			@Override
			public Adapter caseEStringToStringMapEntry(Map.Entry<String, String> object) {
				return createEStringToStringMapEntryAdapter();
			}
			@Override
			public Adapter caseEGenericType(EGenericType object) {
				return createEGenericTypeAdapter();
			}
			@Override
			public Adapter caseETypeParameter(ETypeParameter object) {
				return createETypeParameterAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEcore_EObjectAdapter();
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
	 * Creates a new adapter for an object of class '{@link activitydiagram.OpaqueAction <em>Opaque Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.OpaqueAction
	 * @generated
	 */
	public Adapter createOpaqueActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.ExecutableNode <em>Executable Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.ExecutableNode
	 * @generated
	 */
	public Adapter createExecutableNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.ActivityNode <em>Activity Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.ActivityNode
	 * @generated
	 */
	public Adapter createActivityNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.ActivityEdge <em>Activity Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.ActivityEdge
	 * @generated
	 */
	public Adapter createActivityEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.Activity
	 * @generated
	 */
	public Adapter createActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.Value
	 * @generated
	 */
	public Adapter createValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.InputValue <em>Input Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.InputValue
	 * @generated
	 */
	public Adapter createInputValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.Chunk <em>Chunk</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.Chunk
	 * @generated
	 */
	public Adapter createChunkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.Block
	 * @generated
	 */
	public Adapter createBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.LastStatement <em>Last Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.LastStatement
	 * @generated
	 */
	public Adapter createLastStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.LastStatement_Return <em>Last Statement Return</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.LastStatement_Return
	 * @generated
	 */
	public Adapter createLastStatement_ReturnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.LastStatement_Break <em>Last Statement Break</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.LastStatement_Break
	 * @generated
	 */
	public Adapter createLastStatement_BreakAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.Statement
	 * @generated
	 */
	public Adapter createStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.Statement_Block <em>Statement Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.Statement_Block
	 * @generated
	 */
	public Adapter createStatement_BlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.Statement_While <em>Statement While</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.Statement_While
	 * @generated
	 */
	public Adapter createStatement_WhileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.Statement_Repeat <em>Statement Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.Statement_Repeat
	 * @generated
	 */
	public Adapter createStatement_RepeatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.Statement_If_Then_Else <em>Statement If Then Else</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.Statement_If_Then_Else
	 * @generated
	 */
	public Adapter createStatement_If_Then_ElseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.Statement_If_Then_Else_ElseIfPart <em>Statement If Then Else Else If Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.Statement_If_Then_Else_ElseIfPart
	 * @generated
	 */
	public Adapter createStatement_If_Then_Else_ElseIfPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.Statement_For_Numeric <em>Statement For Numeric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.Statement_For_Numeric
	 * @generated
	 */
	public Adapter createStatement_For_NumericAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.Statement_For_Generic <em>Statement For Generic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.Statement_For_Generic
	 * @generated
	 */
	public Adapter createStatement_For_GenericAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.Statement_GlobalFunction_Declaration <em>Statement Global Function Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.Statement_GlobalFunction_Declaration
	 * @generated
	 */
	public Adapter createStatement_GlobalFunction_DeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.Statement_LocalFunction_Declaration <em>Statement Local Function Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.Statement_LocalFunction_Declaration
	 * @generated
	 */
	public Adapter createStatement_LocalFunction_DeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.Statement_Local_Variable_Declaration <em>Statement Local Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.Statement_Local_Variable_Declaration
	 * @generated
	 */
	public Adapter createStatement_Local_Variable_DeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.Statement_FunctioncallOrAssignment <em>Statement Functioncall Or Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.Statement_FunctioncallOrAssignment
	 * @generated
	 */
	public Adapter createStatement_FunctioncallOrAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.Expression_Nil <em>Expression Nil</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.Expression_Nil
	 * @generated
	 */
	public Adapter createExpression_NilAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.Expression_True <em>Expression True</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.Expression_True
	 * @generated
	 */
	public Adapter createExpression_TrueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.Expression_False <em>Expression False</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.Expression_False
	 * @generated
	 */
	public Adapter createExpression_FalseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.Expression_Number <em>Expression Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.Expression_Number
	 * @generated
	 */
	public Adapter createExpression_NumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.Expression_VarArgs <em>Expression Var Args</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.Expression_VarArgs
	 * @generated
	 */
	public Adapter createExpression_VarArgsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.Expression_String <em>Expression String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.Expression_String
	 * @generated
	 */
	public Adapter createExpression_StringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.Expression_Function <em>Expression Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.Expression_Function
	 * @generated
	 */
	public Adapter createExpression_FunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.Expression_TableConstructor <em>Expression Table Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.Expression_TableConstructor
	 * @generated
	 */
	public Adapter createExpression_TableConstructorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.Function
	 * @generated
	 */
	public Adapter createFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.Functioncall_Arguments <em>Functioncall Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.Functioncall_Arguments
	 * @generated
	 */
	public Adapter createFunctioncall_ArgumentsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.Field
	 * @generated
	 */
	public Adapter createFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.Field_AddEntryToTable_Brackets <em>Field Add Entry To Table Brackets</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.Field_AddEntryToTable_Brackets
	 * @generated
	 */
	public Adapter createField_AddEntryToTable_BracketsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.Field_AddEntryToTable <em>Field Add Entry To Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.Field_AddEntryToTable
	 * @generated
	 */
	public Adapter createField_AddEntryToTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.Field_AppendEntryToTable <em>Field Append Entry To Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.Field_AppendEntryToTable
	 * @generated
	 */
	public Adapter createField_AppendEntryToTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.LastStatement_ReturnWithValue <em>Last Statement Return With Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.LastStatement_ReturnWithValue
	 * @generated
	 */
	public Adapter createLastStatement_ReturnWithValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.Statement_Assignment <em>Statement Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.Statement_Assignment
	 * @generated
	 */
	public Adapter createStatement_AssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.Statement_CallMemberFunction <em>Statement Call Member Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.Statement_CallMemberFunction
	 * @generated
	 */
	public Adapter createStatement_CallMemberFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.Statement_CallFunction <em>Statement Call Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.Statement_CallFunction
	 * @generated
	 */
	public Adapter createStatement_CallFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.Expression_Or <em>Expression Or</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.Expression_Or
	 * @generated
	 */
	public Adapter createExpression_OrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.Expression_And <em>Expression And</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.Expression_And
	 * @generated
	 */
	public Adapter createExpression_AndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.Expression_Larger <em>Expression Larger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.Expression_Larger
	 * @generated
	 */
	public Adapter createExpression_LargerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.Expression_Larger_Equal <em>Expression Larger Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.Expression_Larger_Equal
	 * @generated
	 */
	public Adapter createExpression_Larger_EqualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.Expression_Smaller <em>Expression Smaller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.Expression_Smaller
	 * @generated
	 */
	public Adapter createExpression_SmallerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.Expression_Smaller_Equal <em>Expression Smaller Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.Expression_Smaller_Equal
	 * @generated
	 */
	public Adapter createExpression_Smaller_EqualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.Expression_Equal <em>Expression Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.Expression_Equal
	 * @generated
	 */
	public Adapter createExpression_EqualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.Expression_Not_Equal <em>Expression Not Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.Expression_Not_Equal
	 * @generated
	 */
	public Adapter createExpression_Not_EqualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.Expression_Concatenation <em>Expression Concatenation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.Expression_Concatenation
	 * @generated
	 */
	public Adapter createExpression_ConcatenationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.Expression_Plus <em>Expression Plus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.Expression_Plus
	 * @generated
	 */
	public Adapter createExpression_PlusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.Expression_Minus <em>Expression Minus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.Expression_Minus
	 * @generated
	 */
	public Adapter createExpression_MinusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.Expression_Multiplication <em>Expression Multiplication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.Expression_Multiplication
	 * @generated
	 */
	public Adapter createExpression_MultiplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.Expression_Division <em>Expression Division</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.Expression_Division
	 * @generated
	 */
	public Adapter createExpression_DivisionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.Expression_Modulo <em>Expression Modulo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.Expression_Modulo
	 * @generated
	 */
	public Adapter createExpression_ModuloAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.Expression_Negate <em>Expression Negate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.Expression_Negate
	 * @generated
	 */
	public Adapter createExpression_NegateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.Expression_Length <em>Expression Length</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.Expression_Length
	 * @generated
	 */
	public Adapter createExpression_LengthAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.Expression_Invert <em>Expression Invert</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.Expression_Invert
	 * @generated
	 */
	public Adapter createExpression_InvertAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.Expression_Exponentiation <em>Expression Exponentiation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.Expression_Exponentiation
	 * @generated
	 */
	public Adapter createExpression_ExponentiationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.Expression_CallMemberFunction <em>Expression Call Member Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.Expression_CallMemberFunction
	 * @generated
	 */
	public Adapter createExpression_CallMemberFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.Expression_CallFunction <em>Expression Call Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.Expression_CallFunction
	 * @generated
	 */
	public Adapter createExpression_CallFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.Expression_AccessArray <em>Expression Access Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.Expression_AccessArray
	 * @generated
	 */
	public Adapter createExpression_AccessArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.Expression_AccessMember <em>Expression Access Member</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.Expression_AccessMember
	 * @generated
	 */
	public Adapter createExpression_AccessMemberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.Expression_VariableName <em>Expression Variable Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.Expression_VariableName
	 * @generated
	 */
	public Adapter createExpression_VariableNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.EAttribute <em>EAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.EAttribute
	 * @generated
	 */
	public Adapter createEAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.EAnnotation <em>EAnnotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.EAnnotation
	 * @generated
	 */
	public Adapter createEAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.EClass <em>EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.EClass
	 * @generated
	 */
	public Adapter createEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.EClassifier <em>EClassifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.EClassifier
	 * @generated
	 */
	public Adapter createEClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.EDataType <em>EData Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.EDataType
	 * @generated
	 */
	public Adapter createEDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.EEnum <em>EEnum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.EEnum
	 * @generated
	 */
	public Adapter createEEnumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.EEnumLiteral <em>EEnum Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.EEnumLiteral
	 * @generated
	 */
	public Adapter createEEnumLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.EFactory <em>EFactory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.EFactory
	 * @generated
	 */
	public Adapter createEFactoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.EModelElement <em>EModel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.EModelElement
	 * @generated
	 */
	public Adapter createEModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.ENamedElement <em>ENamed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.ENamedElement
	 * @generated
	 */
	public Adapter createENamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.EObject <em>EObject</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.EObject
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.EOperation <em>EOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.EOperation
	 * @generated
	 */
	public Adapter createEOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.EPackage <em>EPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.EPackage
	 * @generated
	 */
	public Adapter createEPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.EParameter <em>EParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.EParameter
	 * @generated
	 */
	public Adapter createEParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.EReference <em>EReference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.EReference
	 * @generated
	 */
	public Adapter createEReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.EStructuralFeature <em>EStructural Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.EStructuralFeature
	 * @generated
	 */
	public Adapter createEStructuralFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.ETypedElement <em>ETyped Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.ETypedElement
	 * @generated
	 */
	public Adapter createETypedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>EString To String Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createEStringToStringMapEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.EGenericType <em>EGeneric Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.EGenericType
	 * @generated
	 */
	public Adapter createEGenericTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.ETypeParameter <em>EType Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.ETypeParameter
	 * @generated
	 */
	public Adapter createETypeParameterAdapter() {
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
	public Adapter createEcore_EObjectAdapter() {
		return null;
	}

} //ActivitydiagramAdapterFactory
