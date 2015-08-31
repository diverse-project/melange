/**
 */
package org.xtext.lua.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.lua.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LuaFactoryImpl extends EFactoryImpl implements LuaFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LuaFactory init()
  {
    try
    {
      LuaFactory theLuaFactory = (LuaFactory)EPackage.Registry.INSTANCE.getEFactory(LuaPackage.eNS_URI);
      if (theLuaFactory != null)
      {
        return theLuaFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new LuaFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LuaFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case LuaPackage.CHUNK: return createChunk();
      case LuaPackage.BLOCK: return createBlock();
      case LuaPackage.LAST_STATEMENT: return createLastStatement();
      case LuaPackage.LAST_STATEMENT_RETURN: return createLastStatement_Return();
      case LuaPackage.LAST_STATEMENT_BREAK: return createLastStatement_Break();
      case LuaPackage.STATEMENT: return createStatement();
      case LuaPackage.STATEMENT_BLOCK: return createStatement_Block();
      case LuaPackage.STATEMENT_WHILE: return createStatement_While();
      case LuaPackage.STATEMENT_REPEAT: return createStatement_Repeat();
      case LuaPackage.STATEMENT_IF_THEN_ELSE: return createStatement_If_Then_Else();
      case LuaPackage.STATEMENT_IF_THEN_ELSE_ELSE_IF_PART: return createStatement_If_Then_Else_ElseIfPart();
      case LuaPackage.STATEMENT_FOR_NUMERIC: return createStatement_For_Numeric();
      case LuaPackage.STATEMENT_FOR_GENERIC: return createStatement_For_Generic();
      case LuaPackage.STATEMENT_GLOBAL_FUNCTION_DECLARATION: return createStatement_GlobalFunction_Declaration();
      case LuaPackage.STATEMENT_LOCAL_FUNCTION_DECLARATION: return createStatement_LocalFunction_Declaration();
      case LuaPackage.STATEMENT_LOCAL_VARIABLE_DECLARATION: return createStatement_Local_Variable_Declaration();
      case LuaPackage.STATEMENT_FUNCTIONCALL_OR_ASSIGNMENT: return createStatement_FunctioncallOrAssignment();
      case LuaPackage.EXPRESSION: return createExpression();
      case LuaPackage.EXPRESSION_NIL: return createExpression_Nil();
      case LuaPackage.EXPRESSION_TRUE: return createExpression_True();
      case LuaPackage.EXPRESSION_FALSE: return createExpression_False();
      case LuaPackage.EXPRESSION_NUMBER: return createExpression_Number();
      case LuaPackage.EXPRESSION_VAR_ARGS: return createExpression_VarArgs();
      case LuaPackage.EXPRESSION_STRING: return createExpression_String();
      case LuaPackage.EXPRESSION_FUNCTION: return createExpression_Function();
      case LuaPackage.EXPRESSION_TABLE_CONSTRUCTOR: return createExpression_TableConstructor();
      case LuaPackage.FUNCTION: return createFunction();
      case LuaPackage.FUNCTIONCALL_ARGUMENTS: return createFunctioncall_Arguments();
      case LuaPackage.FIELD: return createField();
      case LuaPackage.FIELD_ADD_ENTRY_TO_TABLE_BRACKETS: return createField_AddEntryToTable_Brackets();
      case LuaPackage.FIELD_ADD_ENTRY_TO_TABLE: return createField_AddEntryToTable();
      case LuaPackage.FIELD_APPEND_ENTRY_TO_TABLE: return createField_AppendEntryToTable();
      case LuaPackage.LAST_STATEMENT_RETURN_WITH_VALUE: return createLastStatement_ReturnWithValue();
      case LuaPackage.STATEMENT_ASSIGNMENT: return createStatement_Assignment();
      case LuaPackage.STATEMENT_CALL_MEMBER_FUNCTION: return createStatement_CallMemberFunction();
      case LuaPackage.STATEMENT_CALL_FUNCTION: return createStatement_CallFunction();
      case LuaPackage.EXPRESSION_OR: return createExpression_Or();
      case LuaPackage.EXPRESSION_AND: return createExpression_And();
      case LuaPackage.EXPRESSION_LARGER: return createExpression_Larger();
      case LuaPackage.EXPRESSION_LARGER_EQUAL: return createExpression_Larger_Equal();
      case LuaPackage.EXPRESSION_SMALLER: return createExpression_Smaller();
      case LuaPackage.EXPRESSION_SMALLER_EQUAL: return createExpression_Smaller_Equal();
      case LuaPackage.EXPRESSION_EQUAL: return createExpression_Equal();
      case LuaPackage.EXPRESSION_NOT_EQUAL: return createExpression_Not_Equal();
      case LuaPackage.EXPRESSION_CONCATENATION: return createExpression_Concatenation();
      case LuaPackage.EXPRESSION_PLUS: return createExpression_Plus();
      case LuaPackage.EXPRESSION_MINUS: return createExpression_Minus();
      case LuaPackage.EXPRESSION_MULTIPLICATION: return createExpression_Multiplication();
      case LuaPackage.EXPRESSION_DIVISION: return createExpression_Division();
      case LuaPackage.EXPRESSION_MODULO: return createExpression_Modulo();
      case LuaPackage.EXPRESSION_NEGATE: return createExpression_Negate();
      case LuaPackage.EXPRESSION_LENGTH: return createExpression_Length();
      case LuaPackage.EXPRESSION_INVERT: return createExpression_Invert();
      case LuaPackage.EXPRESSION_EXPONENTIATION: return createExpression_Exponentiation();
      case LuaPackage.EXPRESSION_CALL_MEMBER_FUNCTION: return createExpression_CallMemberFunction();
      case LuaPackage.EXPRESSION_CALL_FUNCTION: return createExpression_CallFunction();
      case LuaPackage.EXPRESSION_ACCESS_ARRAY: return createExpression_AccessArray();
      case LuaPackage.EXPRESSION_ACCESS_MEMBER: return createExpression_AccessMember();
      case LuaPackage.EXPRESSION_VARIABLE_NAME: return createExpression_VariableName();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Chunk createChunk()
  {
    ChunkImpl chunk = new ChunkImpl();
    return chunk;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Block createBlock()
  {
    BlockImpl block = new BlockImpl();
    return block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LastStatement createLastStatement()
  {
    LastStatementImpl lastStatement = new LastStatementImpl();
    return lastStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LastStatement_Return createLastStatement_Return()
  {
    LastStatement_ReturnImpl lastStatement_Return = new LastStatement_ReturnImpl();
    return lastStatement_Return;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LastStatement_Break createLastStatement_Break()
  {
    LastStatement_BreakImpl lastStatement_Break = new LastStatement_BreakImpl();
    return lastStatement_Break;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement createStatement()
  {
    StatementImpl statement = new StatementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement_Block createStatement_Block()
  {
    Statement_BlockImpl statement_Block = new Statement_BlockImpl();
    return statement_Block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement_While createStatement_While()
  {
    Statement_WhileImpl statement_While = new Statement_WhileImpl();
    return statement_While;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement_Repeat createStatement_Repeat()
  {
    Statement_RepeatImpl statement_Repeat = new Statement_RepeatImpl();
    return statement_Repeat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement_If_Then_Else createStatement_If_Then_Else()
  {
    Statement_If_Then_ElseImpl statement_If_Then_Else = new Statement_If_Then_ElseImpl();
    return statement_If_Then_Else;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement_If_Then_Else_ElseIfPart createStatement_If_Then_Else_ElseIfPart()
  {
    Statement_If_Then_Else_ElseIfPartImpl statement_If_Then_Else_ElseIfPart = new Statement_If_Then_Else_ElseIfPartImpl();
    return statement_If_Then_Else_ElseIfPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement_For_Numeric createStatement_For_Numeric()
  {
    Statement_For_NumericImpl statement_For_Numeric = new Statement_For_NumericImpl();
    return statement_For_Numeric;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement_For_Generic createStatement_For_Generic()
  {
    Statement_For_GenericImpl statement_For_Generic = new Statement_For_GenericImpl();
    return statement_For_Generic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement_GlobalFunction_Declaration createStatement_GlobalFunction_Declaration()
  {
    Statement_GlobalFunction_DeclarationImpl statement_GlobalFunction_Declaration = new Statement_GlobalFunction_DeclarationImpl();
    return statement_GlobalFunction_Declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement_LocalFunction_Declaration createStatement_LocalFunction_Declaration()
  {
    Statement_LocalFunction_DeclarationImpl statement_LocalFunction_Declaration = new Statement_LocalFunction_DeclarationImpl();
    return statement_LocalFunction_Declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement_Local_Variable_Declaration createStatement_Local_Variable_Declaration()
  {
    Statement_Local_Variable_DeclarationImpl statement_Local_Variable_Declaration = new Statement_Local_Variable_DeclarationImpl();
    return statement_Local_Variable_Declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement_FunctioncallOrAssignment createStatement_FunctioncallOrAssignment()
  {
    Statement_FunctioncallOrAssignmentImpl statement_FunctioncallOrAssignment = new Statement_FunctioncallOrAssignmentImpl();
    return statement_FunctioncallOrAssignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression_Nil createExpression_Nil()
  {
    Expression_NilImpl expression_Nil = new Expression_NilImpl();
    return expression_Nil;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression_True createExpression_True()
  {
    Expression_TrueImpl expression_True = new Expression_TrueImpl();
    return expression_True;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression_False createExpression_False()
  {
    Expression_FalseImpl expression_False = new Expression_FalseImpl();
    return expression_False;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression_Number createExpression_Number()
  {
    Expression_NumberImpl expression_Number = new Expression_NumberImpl();
    return expression_Number;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression_VarArgs createExpression_VarArgs()
  {
    Expression_VarArgsImpl expression_VarArgs = new Expression_VarArgsImpl();
    return expression_VarArgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression_String createExpression_String()
  {
    Expression_StringImpl expression_String = new Expression_StringImpl();
    return expression_String;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression_Function createExpression_Function()
  {
    Expression_FunctionImpl expression_Function = new Expression_FunctionImpl();
    return expression_Function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression_TableConstructor createExpression_TableConstructor()
  {
    Expression_TableConstructorImpl expression_TableConstructor = new Expression_TableConstructorImpl();
    return expression_TableConstructor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Function createFunction()
  {
    FunctionImpl function = new FunctionImpl();
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Functioncall_Arguments createFunctioncall_Arguments()
  {
    Functioncall_ArgumentsImpl functioncall_Arguments = new Functioncall_ArgumentsImpl();
    return functioncall_Arguments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Field createField()
  {
    FieldImpl field = new FieldImpl();
    return field;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Field_AddEntryToTable_Brackets createField_AddEntryToTable_Brackets()
  {
    Field_AddEntryToTable_BracketsImpl field_AddEntryToTable_Brackets = new Field_AddEntryToTable_BracketsImpl();
    return field_AddEntryToTable_Brackets;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Field_AddEntryToTable createField_AddEntryToTable()
  {
    Field_AddEntryToTableImpl field_AddEntryToTable = new Field_AddEntryToTableImpl();
    return field_AddEntryToTable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Field_AppendEntryToTable createField_AppendEntryToTable()
  {
    Field_AppendEntryToTableImpl field_AppendEntryToTable = new Field_AppendEntryToTableImpl();
    return field_AppendEntryToTable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LastStatement_ReturnWithValue createLastStatement_ReturnWithValue()
  {
    LastStatement_ReturnWithValueImpl lastStatement_ReturnWithValue = new LastStatement_ReturnWithValueImpl();
    return lastStatement_ReturnWithValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement_Assignment createStatement_Assignment()
  {
    Statement_AssignmentImpl statement_Assignment = new Statement_AssignmentImpl();
    return statement_Assignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement_CallMemberFunction createStatement_CallMemberFunction()
  {
    Statement_CallMemberFunctionImpl statement_CallMemberFunction = new Statement_CallMemberFunctionImpl();
    return statement_CallMemberFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement_CallFunction createStatement_CallFunction()
  {
    Statement_CallFunctionImpl statement_CallFunction = new Statement_CallFunctionImpl();
    return statement_CallFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression_Or createExpression_Or()
  {
    Expression_OrImpl expression_Or = new Expression_OrImpl();
    return expression_Or;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression_And createExpression_And()
  {
    Expression_AndImpl expression_And = new Expression_AndImpl();
    return expression_And;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression_Larger createExpression_Larger()
  {
    Expression_LargerImpl expression_Larger = new Expression_LargerImpl();
    return expression_Larger;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression_Larger_Equal createExpression_Larger_Equal()
  {
    Expression_Larger_EqualImpl expression_Larger_Equal = new Expression_Larger_EqualImpl();
    return expression_Larger_Equal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression_Smaller createExpression_Smaller()
  {
    Expression_SmallerImpl expression_Smaller = new Expression_SmallerImpl();
    return expression_Smaller;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression_Smaller_Equal createExpression_Smaller_Equal()
  {
    Expression_Smaller_EqualImpl expression_Smaller_Equal = new Expression_Smaller_EqualImpl();
    return expression_Smaller_Equal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression_Equal createExpression_Equal()
  {
    Expression_EqualImpl expression_Equal = new Expression_EqualImpl();
    return expression_Equal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression_Not_Equal createExpression_Not_Equal()
  {
    Expression_Not_EqualImpl expression_Not_Equal = new Expression_Not_EqualImpl();
    return expression_Not_Equal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression_Concatenation createExpression_Concatenation()
  {
    Expression_ConcatenationImpl expression_Concatenation = new Expression_ConcatenationImpl();
    return expression_Concatenation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression_Plus createExpression_Plus()
  {
    Expression_PlusImpl expression_Plus = new Expression_PlusImpl();
    return expression_Plus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression_Minus createExpression_Minus()
  {
    Expression_MinusImpl expression_Minus = new Expression_MinusImpl();
    return expression_Minus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression_Multiplication createExpression_Multiplication()
  {
    Expression_MultiplicationImpl expression_Multiplication = new Expression_MultiplicationImpl();
    return expression_Multiplication;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression_Division createExpression_Division()
  {
    Expression_DivisionImpl expression_Division = new Expression_DivisionImpl();
    return expression_Division;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression_Modulo createExpression_Modulo()
  {
    Expression_ModuloImpl expression_Modulo = new Expression_ModuloImpl();
    return expression_Modulo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression_Negate createExpression_Negate()
  {
    Expression_NegateImpl expression_Negate = new Expression_NegateImpl();
    return expression_Negate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression_Length createExpression_Length()
  {
    Expression_LengthImpl expression_Length = new Expression_LengthImpl();
    return expression_Length;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression_Invert createExpression_Invert()
  {
    Expression_InvertImpl expression_Invert = new Expression_InvertImpl();
    return expression_Invert;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression_Exponentiation createExpression_Exponentiation()
  {
    Expression_ExponentiationImpl expression_Exponentiation = new Expression_ExponentiationImpl();
    return expression_Exponentiation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression_CallMemberFunction createExpression_CallMemberFunction()
  {
    Expression_CallMemberFunctionImpl expression_CallMemberFunction = new Expression_CallMemberFunctionImpl();
    return expression_CallMemberFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression_CallFunction createExpression_CallFunction()
  {
    Expression_CallFunctionImpl expression_CallFunction = new Expression_CallFunctionImpl();
    return expression_CallFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression_AccessArray createExpression_AccessArray()
  {
    Expression_AccessArrayImpl expression_AccessArray = new Expression_AccessArrayImpl();
    return expression_AccessArray;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression_AccessMember createExpression_AccessMember()
  {
    Expression_AccessMemberImpl expression_AccessMember = new Expression_AccessMemberImpl();
    return expression_AccessMember;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression_VariableName createExpression_VariableName()
  {
    Expression_VariableNameImpl expression_VariableName = new Expression_VariableNameImpl();
    return expression_VariableName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LuaPackage getLuaPackage()
  {
    return (LuaPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static LuaPackage getPackage()
  {
    return LuaPackage.eINSTANCE;
  }

} //LuaFactoryImpl
