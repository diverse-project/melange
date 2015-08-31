/**
 */
package org.xtext.lua.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.xtext.lua.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.lua.LuaPackage
 * @generated
 */
public class LuaAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static LuaPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LuaAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = LuaPackage.eINSTANCE;
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
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
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
  protected LuaSwitch<Adapter> modelSwitch =
    new LuaSwitch<Adapter>()
    {
      @Override
      public Adapter caseChunk(Chunk object)
      {
        return createChunkAdapter();
      }
      @Override
      public Adapter caseBlock(Block object)
      {
        return createBlockAdapter();
      }
      @Override
      public Adapter caseLastStatement(LastStatement object)
      {
        return createLastStatementAdapter();
      }
      @Override
      public Adapter caseLastStatement_Return(LastStatement_Return object)
      {
        return createLastStatement_ReturnAdapter();
      }
      @Override
      public Adapter caseLastStatement_Break(LastStatement_Break object)
      {
        return createLastStatement_BreakAdapter();
      }
      @Override
      public Adapter caseStatement(Statement object)
      {
        return createStatementAdapter();
      }
      @Override
      public Adapter caseStatement_Block(Statement_Block object)
      {
        return createStatement_BlockAdapter();
      }
      @Override
      public Adapter caseStatement_While(Statement_While object)
      {
        return createStatement_WhileAdapter();
      }
      @Override
      public Adapter caseStatement_Repeat(Statement_Repeat object)
      {
        return createStatement_RepeatAdapter();
      }
      @Override
      public Adapter caseStatement_If_Then_Else(Statement_If_Then_Else object)
      {
        return createStatement_If_Then_ElseAdapter();
      }
      @Override
      public Adapter caseStatement_If_Then_Else_ElseIfPart(Statement_If_Then_Else_ElseIfPart object)
      {
        return createStatement_If_Then_Else_ElseIfPartAdapter();
      }
      @Override
      public Adapter caseStatement_For_Numeric(Statement_For_Numeric object)
      {
        return createStatement_For_NumericAdapter();
      }
      @Override
      public Adapter caseStatement_For_Generic(Statement_For_Generic object)
      {
        return createStatement_For_GenericAdapter();
      }
      @Override
      public Adapter caseStatement_GlobalFunction_Declaration(Statement_GlobalFunction_Declaration object)
      {
        return createStatement_GlobalFunction_DeclarationAdapter();
      }
      @Override
      public Adapter caseStatement_LocalFunction_Declaration(Statement_LocalFunction_Declaration object)
      {
        return createStatement_LocalFunction_DeclarationAdapter();
      }
      @Override
      public Adapter caseStatement_Local_Variable_Declaration(Statement_Local_Variable_Declaration object)
      {
        return createStatement_Local_Variable_DeclarationAdapter();
      }
      @Override
      public Adapter caseStatement_FunctioncallOrAssignment(Statement_FunctioncallOrAssignment object)
      {
        return createStatement_FunctioncallOrAssignmentAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseExpression_Nil(Expression_Nil object)
      {
        return createExpression_NilAdapter();
      }
      @Override
      public Adapter caseExpression_True(Expression_True object)
      {
        return createExpression_TrueAdapter();
      }
      @Override
      public Adapter caseExpression_False(Expression_False object)
      {
        return createExpression_FalseAdapter();
      }
      @Override
      public Adapter caseExpression_Number(Expression_Number object)
      {
        return createExpression_NumberAdapter();
      }
      @Override
      public Adapter caseExpression_VarArgs(Expression_VarArgs object)
      {
        return createExpression_VarArgsAdapter();
      }
      @Override
      public Adapter caseExpression_String(Expression_String object)
      {
        return createExpression_StringAdapter();
      }
      @Override
      public Adapter caseExpression_Function(Expression_Function object)
      {
        return createExpression_FunctionAdapter();
      }
      @Override
      public Adapter caseExpression_TableConstructor(Expression_TableConstructor object)
      {
        return createExpression_TableConstructorAdapter();
      }
      @Override
      public Adapter caseFunction(Function object)
      {
        return createFunctionAdapter();
      }
      @Override
      public Adapter caseFunctioncall_Arguments(Functioncall_Arguments object)
      {
        return createFunctioncall_ArgumentsAdapter();
      }
      @Override
      public Adapter caseField(Field object)
      {
        return createFieldAdapter();
      }
      @Override
      public Adapter caseField_AddEntryToTable_Brackets(Field_AddEntryToTable_Brackets object)
      {
        return createField_AddEntryToTable_BracketsAdapter();
      }
      @Override
      public Adapter caseField_AddEntryToTable(Field_AddEntryToTable object)
      {
        return createField_AddEntryToTableAdapter();
      }
      @Override
      public Adapter caseField_AppendEntryToTable(Field_AppendEntryToTable object)
      {
        return createField_AppendEntryToTableAdapter();
      }
      @Override
      public Adapter caseLastStatement_ReturnWithValue(LastStatement_ReturnWithValue object)
      {
        return createLastStatement_ReturnWithValueAdapter();
      }
      @Override
      public Adapter caseStatement_Assignment(Statement_Assignment object)
      {
        return createStatement_AssignmentAdapter();
      }
      @Override
      public Adapter caseStatement_CallMemberFunction(Statement_CallMemberFunction object)
      {
        return createStatement_CallMemberFunctionAdapter();
      }
      @Override
      public Adapter caseStatement_CallFunction(Statement_CallFunction object)
      {
        return createStatement_CallFunctionAdapter();
      }
      @Override
      public Adapter caseExpression_Or(Expression_Or object)
      {
        return createExpression_OrAdapter();
      }
      @Override
      public Adapter caseExpression_And(Expression_And object)
      {
        return createExpression_AndAdapter();
      }
      @Override
      public Adapter caseExpression_Larger(Expression_Larger object)
      {
        return createExpression_LargerAdapter();
      }
      @Override
      public Adapter caseExpression_Larger_Equal(Expression_Larger_Equal object)
      {
        return createExpression_Larger_EqualAdapter();
      }
      @Override
      public Adapter caseExpression_Smaller(Expression_Smaller object)
      {
        return createExpression_SmallerAdapter();
      }
      @Override
      public Adapter caseExpression_Smaller_Equal(Expression_Smaller_Equal object)
      {
        return createExpression_Smaller_EqualAdapter();
      }
      @Override
      public Adapter caseExpression_Equal(Expression_Equal object)
      {
        return createExpression_EqualAdapter();
      }
      @Override
      public Adapter caseExpression_Not_Equal(Expression_Not_Equal object)
      {
        return createExpression_Not_EqualAdapter();
      }
      @Override
      public Adapter caseExpression_Concatenation(Expression_Concatenation object)
      {
        return createExpression_ConcatenationAdapter();
      }
      @Override
      public Adapter caseExpression_Plus(Expression_Plus object)
      {
        return createExpression_PlusAdapter();
      }
      @Override
      public Adapter caseExpression_Minus(Expression_Minus object)
      {
        return createExpression_MinusAdapter();
      }
      @Override
      public Adapter caseExpression_Multiplication(Expression_Multiplication object)
      {
        return createExpression_MultiplicationAdapter();
      }
      @Override
      public Adapter caseExpression_Division(Expression_Division object)
      {
        return createExpression_DivisionAdapter();
      }
      @Override
      public Adapter caseExpression_Modulo(Expression_Modulo object)
      {
        return createExpression_ModuloAdapter();
      }
      @Override
      public Adapter caseExpression_Negate(Expression_Negate object)
      {
        return createExpression_NegateAdapter();
      }
      @Override
      public Adapter caseExpression_Length(Expression_Length object)
      {
        return createExpression_LengthAdapter();
      }
      @Override
      public Adapter caseExpression_Invert(Expression_Invert object)
      {
        return createExpression_InvertAdapter();
      }
      @Override
      public Adapter caseExpression_Exponentiation(Expression_Exponentiation object)
      {
        return createExpression_ExponentiationAdapter();
      }
      @Override
      public Adapter caseExpression_CallMemberFunction(Expression_CallMemberFunction object)
      {
        return createExpression_CallMemberFunctionAdapter();
      }
      @Override
      public Adapter caseExpression_CallFunction(Expression_CallFunction object)
      {
        return createExpression_CallFunctionAdapter();
      }
      @Override
      public Adapter caseExpression_AccessArray(Expression_AccessArray object)
      {
        return createExpression_AccessArrayAdapter();
      }
      @Override
      public Adapter caseExpression_AccessMember(Expression_AccessMember object)
      {
        return createExpression_AccessMemberAdapter();
      }
      @Override
      public Adapter caseExpression_VariableName(Expression_VariableName object)
      {
        return createExpression_VariableNameAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
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
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.xtext.lua.Chunk <em>Chunk</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.lua.Chunk
   * @generated
   */
  public Adapter createChunkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.lua.Block <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.lua.Block
   * @generated
   */
  public Adapter createBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.lua.LastStatement <em>Last Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.lua.LastStatement
   * @generated
   */
  public Adapter createLastStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.lua.LastStatement_Return <em>Last Statement Return</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.lua.LastStatement_Return
   * @generated
   */
  public Adapter createLastStatement_ReturnAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.lua.LastStatement_Break <em>Last Statement Break</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.lua.LastStatement_Break
   * @generated
   */
  public Adapter createLastStatement_BreakAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.lua.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.lua.Statement
   * @generated
   */
  public Adapter createStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.lua.Statement_Block <em>Statement Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.lua.Statement_Block
   * @generated
   */
  public Adapter createStatement_BlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.lua.Statement_While <em>Statement While</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.lua.Statement_While
   * @generated
   */
  public Adapter createStatement_WhileAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.lua.Statement_Repeat <em>Statement Repeat</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.lua.Statement_Repeat
   * @generated
   */
  public Adapter createStatement_RepeatAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.lua.Statement_If_Then_Else <em>Statement If Then Else</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.lua.Statement_If_Then_Else
   * @generated
   */
  public Adapter createStatement_If_Then_ElseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.lua.Statement_If_Then_Else_ElseIfPart <em>Statement If Then Else Else If Part</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.lua.Statement_If_Then_Else_ElseIfPart
   * @generated
   */
  public Adapter createStatement_If_Then_Else_ElseIfPartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.lua.Statement_For_Numeric <em>Statement For Numeric</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.lua.Statement_For_Numeric
   * @generated
   */
  public Adapter createStatement_For_NumericAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.lua.Statement_For_Generic <em>Statement For Generic</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.lua.Statement_For_Generic
   * @generated
   */
  public Adapter createStatement_For_GenericAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.lua.Statement_GlobalFunction_Declaration <em>Statement Global Function Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.lua.Statement_GlobalFunction_Declaration
   * @generated
   */
  public Adapter createStatement_GlobalFunction_DeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.lua.Statement_LocalFunction_Declaration <em>Statement Local Function Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.lua.Statement_LocalFunction_Declaration
   * @generated
   */
  public Adapter createStatement_LocalFunction_DeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.lua.Statement_Local_Variable_Declaration <em>Statement Local Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.lua.Statement_Local_Variable_Declaration
   * @generated
   */
  public Adapter createStatement_Local_Variable_DeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.lua.Statement_FunctioncallOrAssignment <em>Statement Functioncall Or Assignment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.lua.Statement_FunctioncallOrAssignment
   * @generated
   */
  public Adapter createStatement_FunctioncallOrAssignmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.lua.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.lua.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.lua.Expression_Nil <em>Expression Nil</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.lua.Expression_Nil
   * @generated
   */
  public Adapter createExpression_NilAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.lua.Expression_True <em>Expression True</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.lua.Expression_True
   * @generated
   */
  public Adapter createExpression_TrueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.lua.Expression_False <em>Expression False</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.lua.Expression_False
   * @generated
   */
  public Adapter createExpression_FalseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.lua.Expression_Number <em>Expression Number</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.lua.Expression_Number
   * @generated
   */
  public Adapter createExpression_NumberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.lua.Expression_VarArgs <em>Expression Var Args</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.lua.Expression_VarArgs
   * @generated
   */
  public Adapter createExpression_VarArgsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.lua.Expression_String <em>Expression String</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.lua.Expression_String
   * @generated
   */
  public Adapter createExpression_StringAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.lua.Expression_Function <em>Expression Function</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.lua.Expression_Function
   * @generated
   */
  public Adapter createExpression_FunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.lua.Expression_TableConstructor <em>Expression Table Constructor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.lua.Expression_TableConstructor
   * @generated
   */
  public Adapter createExpression_TableConstructorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.lua.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.lua.Function
   * @generated
   */
  public Adapter createFunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.lua.Functioncall_Arguments <em>Functioncall Arguments</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.lua.Functioncall_Arguments
   * @generated
   */
  public Adapter createFunctioncall_ArgumentsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.lua.Field <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.lua.Field
   * @generated
   */
  public Adapter createFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.lua.Field_AddEntryToTable_Brackets <em>Field Add Entry To Table Brackets</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.lua.Field_AddEntryToTable_Brackets
   * @generated
   */
  public Adapter createField_AddEntryToTable_BracketsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.lua.Field_AddEntryToTable <em>Field Add Entry To Table</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.lua.Field_AddEntryToTable
   * @generated
   */
  public Adapter createField_AddEntryToTableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.lua.Field_AppendEntryToTable <em>Field Append Entry To Table</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.lua.Field_AppendEntryToTable
   * @generated
   */
  public Adapter createField_AppendEntryToTableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.lua.LastStatement_ReturnWithValue <em>Last Statement Return With Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.lua.LastStatement_ReturnWithValue
   * @generated
   */
  public Adapter createLastStatement_ReturnWithValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.lua.Statement_Assignment <em>Statement Assignment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.lua.Statement_Assignment
   * @generated
   */
  public Adapter createStatement_AssignmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.lua.Statement_CallMemberFunction <em>Statement Call Member Function</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.lua.Statement_CallMemberFunction
   * @generated
   */
  public Adapter createStatement_CallMemberFunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.lua.Statement_CallFunction <em>Statement Call Function</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.lua.Statement_CallFunction
   * @generated
   */
  public Adapter createStatement_CallFunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.lua.Expression_Or <em>Expression Or</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.lua.Expression_Or
   * @generated
   */
  public Adapter createExpression_OrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.lua.Expression_And <em>Expression And</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.lua.Expression_And
   * @generated
   */
  public Adapter createExpression_AndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.lua.Expression_Larger <em>Expression Larger</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.lua.Expression_Larger
   * @generated
   */
  public Adapter createExpression_LargerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.lua.Expression_Larger_Equal <em>Expression Larger Equal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.lua.Expression_Larger_Equal
   * @generated
   */
  public Adapter createExpression_Larger_EqualAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.lua.Expression_Smaller <em>Expression Smaller</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.lua.Expression_Smaller
   * @generated
   */
  public Adapter createExpression_SmallerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.lua.Expression_Smaller_Equal <em>Expression Smaller Equal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.lua.Expression_Smaller_Equal
   * @generated
   */
  public Adapter createExpression_Smaller_EqualAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.lua.Expression_Equal <em>Expression Equal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.lua.Expression_Equal
   * @generated
   */
  public Adapter createExpression_EqualAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.lua.Expression_Not_Equal <em>Expression Not Equal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.lua.Expression_Not_Equal
   * @generated
   */
  public Adapter createExpression_Not_EqualAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.lua.Expression_Concatenation <em>Expression Concatenation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.lua.Expression_Concatenation
   * @generated
   */
  public Adapter createExpression_ConcatenationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.lua.Expression_Plus <em>Expression Plus</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.lua.Expression_Plus
   * @generated
   */
  public Adapter createExpression_PlusAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.lua.Expression_Minus <em>Expression Minus</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.lua.Expression_Minus
   * @generated
   */
  public Adapter createExpression_MinusAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.lua.Expression_Multiplication <em>Expression Multiplication</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.lua.Expression_Multiplication
   * @generated
   */
  public Adapter createExpression_MultiplicationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.lua.Expression_Division <em>Expression Division</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.lua.Expression_Division
   * @generated
   */
  public Adapter createExpression_DivisionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.lua.Expression_Modulo <em>Expression Modulo</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.lua.Expression_Modulo
   * @generated
   */
  public Adapter createExpression_ModuloAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.lua.Expression_Negate <em>Expression Negate</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.lua.Expression_Negate
   * @generated
   */
  public Adapter createExpression_NegateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.lua.Expression_Length <em>Expression Length</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.lua.Expression_Length
   * @generated
   */
  public Adapter createExpression_LengthAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.lua.Expression_Invert <em>Expression Invert</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.lua.Expression_Invert
   * @generated
   */
  public Adapter createExpression_InvertAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.lua.Expression_Exponentiation <em>Expression Exponentiation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.lua.Expression_Exponentiation
   * @generated
   */
  public Adapter createExpression_ExponentiationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.lua.Expression_CallMemberFunction <em>Expression Call Member Function</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.lua.Expression_CallMemberFunction
   * @generated
   */
  public Adapter createExpression_CallMemberFunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.lua.Expression_CallFunction <em>Expression Call Function</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.lua.Expression_CallFunction
   * @generated
   */
  public Adapter createExpression_CallFunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.lua.Expression_AccessArray <em>Expression Access Array</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.lua.Expression_AccessArray
   * @generated
   */
  public Adapter createExpression_AccessArrayAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.lua.Expression_AccessMember <em>Expression Access Member</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.lua.Expression_AccessMember
   * @generated
   */
  public Adapter createExpression_AccessMemberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.lua.Expression_VariableName <em>Expression Variable Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.lua.Expression_VariableName
   * @generated
   */
  public Adapter createExpression_VariableNameAdapter()
  {
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
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //LuaAdapterFactory
