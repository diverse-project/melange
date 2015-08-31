/**
 */
package org.xtext.lua.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.lua.*;

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
 * @see org.xtext.lua.LuaPackage
 * @generated
 */
public class LuaSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static LuaPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LuaSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = LuaPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
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
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case LuaPackage.CHUNK:
      {
        Chunk chunk = (Chunk)theEObject;
        T result = caseChunk(chunk);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LuaPackage.BLOCK:
      {
        Block block = (Block)theEObject;
        T result = caseBlock(block);
        if (result == null) result = caseChunk(block);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LuaPackage.LAST_STATEMENT:
      {
        LastStatement lastStatement = (LastStatement)theEObject;
        T result = caseLastStatement(lastStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LuaPackage.LAST_STATEMENT_RETURN:
      {
        LastStatement_Return lastStatement_Return = (LastStatement_Return)theEObject;
        T result = caseLastStatement_Return(lastStatement_Return);
        if (result == null) result = caseLastStatement(lastStatement_Return);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LuaPackage.LAST_STATEMENT_BREAK:
      {
        LastStatement_Break lastStatement_Break = (LastStatement_Break)theEObject;
        T result = caseLastStatement_Break(lastStatement_Break);
        if (result == null) result = caseLastStatement(lastStatement_Break);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LuaPackage.STATEMENT:
      {
        Statement statement = (Statement)theEObject;
        T result = caseStatement(statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LuaPackage.STATEMENT_BLOCK:
      {
        Statement_Block statement_Block = (Statement_Block)theEObject;
        T result = caseStatement_Block(statement_Block);
        if (result == null) result = caseStatement(statement_Block);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LuaPackage.STATEMENT_WHILE:
      {
        Statement_While statement_While = (Statement_While)theEObject;
        T result = caseStatement_While(statement_While);
        if (result == null) result = caseStatement(statement_While);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LuaPackage.STATEMENT_REPEAT:
      {
        Statement_Repeat statement_Repeat = (Statement_Repeat)theEObject;
        T result = caseStatement_Repeat(statement_Repeat);
        if (result == null) result = caseStatement(statement_Repeat);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LuaPackage.STATEMENT_IF_THEN_ELSE:
      {
        Statement_If_Then_Else statement_If_Then_Else = (Statement_If_Then_Else)theEObject;
        T result = caseStatement_If_Then_Else(statement_If_Then_Else);
        if (result == null) result = caseStatement(statement_If_Then_Else);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LuaPackage.STATEMENT_IF_THEN_ELSE_ELSE_IF_PART:
      {
        Statement_If_Then_Else_ElseIfPart statement_If_Then_Else_ElseIfPart = (Statement_If_Then_Else_ElseIfPart)theEObject;
        T result = caseStatement_If_Then_Else_ElseIfPart(statement_If_Then_Else_ElseIfPart);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LuaPackage.STATEMENT_FOR_NUMERIC:
      {
        Statement_For_Numeric statement_For_Numeric = (Statement_For_Numeric)theEObject;
        T result = caseStatement_For_Numeric(statement_For_Numeric);
        if (result == null) result = caseStatement(statement_For_Numeric);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LuaPackage.STATEMENT_FOR_GENERIC:
      {
        Statement_For_Generic statement_For_Generic = (Statement_For_Generic)theEObject;
        T result = caseStatement_For_Generic(statement_For_Generic);
        if (result == null) result = caseStatement(statement_For_Generic);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LuaPackage.STATEMENT_GLOBAL_FUNCTION_DECLARATION:
      {
        Statement_GlobalFunction_Declaration statement_GlobalFunction_Declaration = (Statement_GlobalFunction_Declaration)theEObject;
        T result = caseStatement_GlobalFunction_Declaration(statement_GlobalFunction_Declaration);
        if (result == null) result = caseStatement(statement_GlobalFunction_Declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LuaPackage.STATEMENT_LOCAL_FUNCTION_DECLARATION:
      {
        Statement_LocalFunction_Declaration statement_LocalFunction_Declaration = (Statement_LocalFunction_Declaration)theEObject;
        T result = caseStatement_LocalFunction_Declaration(statement_LocalFunction_Declaration);
        if (result == null) result = caseStatement(statement_LocalFunction_Declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LuaPackage.STATEMENT_LOCAL_VARIABLE_DECLARATION:
      {
        Statement_Local_Variable_Declaration statement_Local_Variable_Declaration = (Statement_Local_Variable_Declaration)theEObject;
        T result = caseStatement_Local_Variable_Declaration(statement_Local_Variable_Declaration);
        if (result == null) result = caseStatement(statement_Local_Variable_Declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LuaPackage.STATEMENT_FUNCTIONCALL_OR_ASSIGNMENT:
      {
        Statement_FunctioncallOrAssignment statement_FunctioncallOrAssignment = (Statement_FunctioncallOrAssignment)theEObject;
        T result = caseStatement_FunctioncallOrAssignment(statement_FunctioncallOrAssignment);
        if (result == null) result = caseStatement(statement_FunctioncallOrAssignment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LuaPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = caseStatement_FunctioncallOrAssignment(expression);
        if (result == null) result = caseStatement(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LuaPackage.EXPRESSION_NIL:
      {
        Expression_Nil expression_Nil = (Expression_Nil)theEObject;
        T result = caseExpression_Nil(expression_Nil);
        if (result == null) result = caseExpression(expression_Nil);
        if (result == null) result = caseStatement_FunctioncallOrAssignment(expression_Nil);
        if (result == null) result = caseStatement(expression_Nil);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LuaPackage.EXPRESSION_TRUE:
      {
        Expression_True expression_True = (Expression_True)theEObject;
        T result = caseExpression_True(expression_True);
        if (result == null) result = caseExpression(expression_True);
        if (result == null) result = caseStatement_FunctioncallOrAssignment(expression_True);
        if (result == null) result = caseStatement(expression_True);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LuaPackage.EXPRESSION_FALSE:
      {
        Expression_False expression_False = (Expression_False)theEObject;
        T result = caseExpression_False(expression_False);
        if (result == null) result = caseExpression(expression_False);
        if (result == null) result = caseStatement_FunctioncallOrAssignment(expression_False);
        if (result == null) result = caseStatement(expression_False);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LuaPackage.EXPRESSION_NUMBER:
      {
        Expression_Number expression_Number = (Expression_Number)theEObject;
        T result = caseExpression_Number(expression_Number);
        if (result == null) result = caseExpression(expression_Number);
        if (result == null) result = caseStatement_FunctioncallOrAssignment(expression_Number);
        if (result == null) result = caseStatement(expression_Number);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LuaPackage.EXPRESSION_VAR_ARGS:
      {
        Expression_VarArgs expression_VarArgs = (Expression_VarArgs)theEObject;
        T result = caseExpression_VarArgs(expression_VarArgs);
        if (result == null) result = caseExpression(expression_VarArgs);
        if (result == null) result = caseStatement_FunctioncallOrAssignment(expression_VarArgs);
        if (result == null) result = caseStatement(expression_VarArgs);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LuaPackage.EXPRESSION_STRING:
      {
        Expression_String expression_String = (Expression_String)theEObject;
        T result = caseExpression_String(expression_String);
        if (result == null) result = caseExpression(expression_String);
        if (result == null) result = caseStatement_FunctioncallOrAssignment(expression_String);
        if (result == null) result = caseStatement(expression_String);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LuaPackage.EXPRESSION_FUNCTION:
      {
        Expression_Function expression_Function = (Expression_Function)theEObject;
        T result = caseExpression_Function(expression_Function);
        if (result == null) result = caseExpression(expression_Function);
        if (result == null) result = caseStatement_FunctioncallOrAssignment(expression_Function);
        if (result == null) result = caseStatement(expression_Function);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LuaPackage.EXPRESSION_TABLE_CONSTRUCTOR:
      {
        Expression_TableConstructor expression_TableConstructor = (Expression_TableConstructor)theEObject;
        T result = caseExpression_TableConstructor(expression_TableConstructor);
        if (result == null) result = caseExpression(expression_TableConstructor);
        if (result == null) result = caseStatement_FunctioncallOrAssignment(expression_TableConstructor);
        if (result == null) result = caseStatement(expression_TableConstructor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LuaPackage.FUNCTION:
      {
        Function function = (Function)theEObject;
        T result = caseFunction(function);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LuaPackage.FUNCTIONCALL_ARGUMENTS:
      {
        Functioncall_Arguments functioncall_Arguments = (Functioncall_Arguments)theEObject;
        T result = caseFunctioncall_Arguments(functioncall_Arguments);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LuaPackage.FIELD:
      {
        Field field = (Field)theEObject;
        T result = caseField(field);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LuaPackage.FIELD_ADD_ENTRY_TO_TABLE_BRACKETS:
      {
        Field_AddEntryToTable_Brackets field_AddEntryToTable_Brackets = (Field_AddEntryToTable_Brackets)theEObject;
        T result = caseField_AddEntryToTable_Brackets(field_AddEntryToTable_Brackets);
        if (result == null) result = caseField(field_AddEntryToTable_Brackets);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LuaPackage.FIELD_ADD_ENTRY_TO_TABLE:
      {
        Field_AddEntryToTable field_AddEntryToTable = (Field_AddEntryToTable)theEObject;
        T result = caseField_AddEntryToTable(field_AddEntryToTable);
        if (result == null) result = caseField(field_AddEntryToTable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LuaPackage.FIELD_APPEND_ENTRY_TO_TABLE:
      {
        Field_AppendEntryToTable field_AppendEntryToTable = (Field_AppendEntryToTable)theEObject;
        T result = caseField_AppendEntryToTable(field_AppendEntryToTable);
        if (result == null) result = caseField(field_AppendEntryToTable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LuaPackage.LAST_STATEMENT_RETURN_WITH_VALUE:
      {
        LastStatement_ReturnWithValue lastStatement_ReturnWithValue = (LastStatement_ReturnWithValue)theEObject;
        T result = caseLastStatement_ReturnWithValue(lastStatement_ReturnWithValue);
        if (result == null) result = caseLastStatement_Return(lastStatement_ReturnWithValue);
        if (result == null) result = caseLastStatement(lastStatement_ReturnWithValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LuaPackage.STATEMENT_ASSIGNMENT:
      {
        Statement_Assignment statement_Assignment = (Statement_Assignment)theEObject;
        T result = caseStatement_Assignment(statement_Assignment);
        if (result == null) result = caseStatement_FunctioncallOrAssignment(statement_Assignment);
        if (result == null) result = caseStatement(statement_Assignment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LuaPackage.STATEMENT_CALL_MEMBER_FUNCTION:
      {
        Statement_CallMemberFunction statement_CallMemberFunction = (Statement_CallMemberFunction)theEObject;
        T result = caseStatement_CallMemberFunction(statement_CallMemberFunction);
        if (result == null) result = caseStatement_FunctioncallOrAssignment(statement_CallMemberFunction);
        if (result == null) result = caseStatement(statement_CallMemberFunction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LuaPackage.STATEMENT_CALL_FUNCTION:
      {
        Statement_CallFunction statement_CallFunction = (Statement_CallFunction)theEObject;
        T result = caseStatement_CallFunction(statement_CallFunction);
        if (result == null) result = caseStatement_FunctioncallOrAssignment(statement_CallFunction);
        if (result == null) result = caseStatement(statement_CallFunction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LuaPackage.EXPRESSION_OR:
      {
        Expression_Or expression_Or = (Expression_Or)theEObject;
        T result = caseExpression_Or(expression_Or);
        if (result == null) result = caseExpression(expression_Or);
        if (result == null) result = caseStatement_FunctioncallOrAssignment(expression_Or);
        if (result == null) result = caseStatement(expression_Or);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LuaPackage.EXPRESSION_AND:
      {
        Expression_And expression_And = (Expression_And)theEObject;
        T result = caseExpression_And(expression_And);
        if (result == null) result = caseExpression(expression_And);
        if (result == null) result = caseStatement_FunctioncallOrAssignment(expression_And);
        if (result == null) result = caseStatement(expression_And);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LuaPackage.EXPRESSION_LARGER:
      {
        Expression_Larger expression_Larger = (Expression_Larger)theEObject;
        T result = caseExpression_Larger(expression_Larger);
        if (result == null) result = caseExpression(expression_Larger);
        if (result == null) result = caseStatement_FunctioncallOrAssignment(expression_Larger);
        if (result == null) result = caseStatement(expression_Larger);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LuaPackage.EXPRESSION_LARGER_EQUAL:
      {
        Expression_Larger_Equal expression_Larger_Equal = (Expression_Larger_Equal)theEObject;
        T result = caseExpression_Larger_Equal(expression_Larger_Equal);
        if (result == null) result = caseExpression(expression_Larger_Equal);
        if (result == null) result = caseStatement_FunctioncallOrAssignment(expression_Larger_Equal);
        if (result == null) result = caseStatement(expression_Larger_Equal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LuaPackage.EXPRESSION_SMALLER:
      {
        Expression_Smaller expression_Smaller = (Expression_Smaller)theEObject;
        T result = caseExpression_Smaller(expression_Smaller);
        if (result == null) result = caseExpression(expression_Smaller);
        if (result == null) result = caseStatement_FunctioncallOrAssignment(expression_Smaller);
        if (result == null) result = caseStatement(expression_Smaller);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LuaPackage.EXPRESSION_SMALLER_EQUAL:
      {
        Expression_Smaller_Equal expression_Smaller_Equal = (Expression_Smaller_Equal)theEObject;
        T result = caseExpression_Smaller_Equal(expression_Smaller_Equal);
        if (result == null) result = caseExpression(expression_Smaller_Equal);
        if (result == null) result = caseStatement_FunctioncallOrAssignment(expression_Smaller_Equal);
        if (result == null) result = caseStatement(expression_Smaller_Equal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LuaPackage.EXPRESSION_EQUAL:
      {
        Expression_Equal expression_Equal = (Expression_Equal)theEObject;
        T result = caseExpression_Equal(expression_Equal);
        if (result == null) result = caseExpression(expression_Equal);
        if (result == null) result = caseStatement_FunctioncallOrAssignment(expression_Equal);
        if (result == null) result = caseStatement(expression_Equal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LuaPackage.EXPRESSION_NOT_EQUAL:
      {
        Expression_Not_Equal expression_Not_Equal = (Expression_Not_Equal)theEObject;
        T result = caseExpression_Not_Equal(expression_Not_Equal);
        if (result == null) result = caseExpression(expression_Not_Equal);
        if (result == null) result = caseStatement_FunctioncallOrAssignment(expression_Not_Equal);
        if (result == null) result = caseStatement(expression_Not_Equal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LuaPackage.EXPRESSION_CONCATENATION:
      {
        Expression_Concatenation expression_Concatenation = (Expression_Concatenation)theEObject;
        T result = caseExpression_Concatenation(expression_Concatenation);
        if (result == null) result = caseExpression(expression_Concatenation);
        if (result == null) result = caseStatement_FunctioncallOrAssignment(expression_Concatenation);
        if (result == null) result = caseStatement(expression_Concatenation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LuaPackage.EXPRESSION_PLUS:
      {
        Expression_Plus expression_Plus = (Expression_Plus)theEObject;
        T result = caseExpression_Plus(expression_Plus);
        if (result == null) result = caseExpression(expression_Plus);
        if (result == null) result = caseStatement_FunctioncallOrAssignment(expression_Plus);
        if (result == null) result = caseStatement(expression_Plus);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LuaPackage.EXPRESSION_MINUS:
      {
        Expression_Minus expression_Minus = (Expression_Minus)theEObject;
        T result = caseExpression_Minus(expression_Minus);
        if (result == null) result = caseExpression(expression_Minus);
        if (result == null) result = caseStatement_FunctioncallOrAssignment(expression_Minus);
        if (result == null) result = caseStatement(expression_Minus);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LuaPackage.EXPRESSION_MULTIPLICATION:
      {
        Expression_Multiplication expression_Multiplication = (Expression_Multiplication)theEObject;
        T result = caseExpression_Multiplication(expression_Multiplication);
        if (result == null) result = caseExpression(expression_Multiplication);
        if (result == null) result = caseStatement_FunctioncallOrAssignment(expression_Multiplication);
        if (result == null) result = caseStatement(expression_Multiplication);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LuaPackage.EXPRESSION_DIVISION:
      {
        Expression_Division expression_Division = (Expression_Division)theEObject;
        T result = caseExpression_Division(expression_Division);
        if (result == null) result = caseExpression(expression_Division);
        if (result == null) result = caseStatement_FunctioncallOrAssignment(expression_Division);
        if (result == null) result = caseStatement(expression_Division);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LuaPackage.EXPRESSION_MODULO:
      {
        Expression_Modulo expression_Modulo = (Expression_Modulo)theEObject;
        T result = caseExpression_Modulo(expression_Modulo);
        if (result == null) result = caseExpression(expression_Modulo);
        if (result == null) result = caseStatement_FunctioncallOrAssignment(expression_Modulo);
        if (result == null) result = caseStatement(expression_Modulo);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LuaPackage.EXPRESSION_NEGATE:
      {
        Expression_Negate expression_Negate = (Expression_Negate)theEObject;
        T result = caseExpression_Negate(expression_Negate);
        if (result == null) result = caseExpression(expression_Negate);
        if (result == null) result = caseStatement_FunctioncallOrAssignment(expression_Negate);
        if (result == null) result = caseStatement(expression_Negate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LuaPackage.EXPRESSION_LENGTH:
      {
        Expression_Length expression_Length = (Expression_Length)theEObject;
        T result = caseExpression_Length(expression_Length);
        if (result == null) result = caseExpression(expression_Length);
        if (result == null) result = caseStatement_FunctioncallOrAssignment(expression_Length);
        if (result == null) result = caseStatement(expression_Length);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LuaPackage.EXPRESSION_INVERT:
      {
        Expression_Invert expression_Invert = (Expression_Invert)theEObject;
        T result = caseExpression_Invert(expression_Invert);
        if (result == null) result = caseExpression(expression_Invert);
        if (result == null) result = caseStatement_FunctioncallOrAssignment(expression_Invert);
        if (result == null) result = caseStatement(expression_Invert);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LuaPackage.EXPRESSION_EXPONENTIATION:
      {
        Expression_Exponentiation expression_Exponentiation = (Expression_Exponentiation)theEObject;
        T result = caseExpression_Exponentiation(expression_Exponentiation);
        if (result == null) result = caseExpression(expression_Exponentiation);
        if (result == null) result = caseStatement_FunctioncallOrAssignment(expression_Exponentiation);
        if (result == null) result = caseStatement(expression_Exponentiation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LuaPackage.EXPRESSION_CALL_MEMBER_FUNCTION:
      {
        Expression_CallMemberFunction expression_CallMemberFunction = (Expression_CallMemberFunction)theEObject;
        T result = caseExpression_CallMemberFunction(expression_CallMemberFunction);
        if (result == null) result = caseExpression(expression_CallMemberFunction);
        if (result == null) result = caseStatement_FunctioncallOrAssignment(expression_CallMemberFunction);
        if (result == null) result = caseStatement(expression_CallMemberFunction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LuaPackage.EXPRESSION_CALL_FUNCTION:
      {
        Expression_CallFunction expression_CallFunction = (Expression_CallFunction)theEObject;
        T result = caseExpression_CallFunction(expression_CallFunction);
        if (result == null) result = caseExpression(expression_CallFunction);
        if (result == null) result = caseStatement_FunctioncallOrAssignment(expression_CallFunction);
        if (result == null) result = caseStatement(expression_CallFunction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LuaPackage.EXPRESSION_ACCESS_ARRAY:
      {
        Expression_AccessArray expression_AccessArray = (Expression_AccessArray)theEObject;
        T result = caseExpression_AccessArray(expression_AccessArray);
        if (result == null) result = caseExpression(expression_AccessArray);
        if (result == null) result = caseStatement_FunctioncallOrAssignment(expression_AccessArray);
        if (result == null) result = caseStatement(expression_AccessArray);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LuaPackage.EXPRESSION_ACCESS_MEMBER:
      {
        Expression_AccessMember expression_AccessMember = (Expression_AccessMember)theEObject;
        T result = caseExpression_AccessMember(expression_AccessMember);
        if (result == null) result = caseExpression(expression_AccessMember);
        if (result == null) result = caseStatement_FunctioncallOrAssignment(expression_AccessMember);
        if (result == null) result = caseStatement(expression_AccessMember);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LuaPackage.EXPRESSION_VARIABLE_NAME:
      {
        Expression_VariableName expression_VariableName = (Expression_VariableName)theEObject;
        T result = caseExpression_VariableName(expression_VariableName);
        if (result == null) result = caseExpression(expression_VariableName);
        if (result == null) result = caseStatement_FunctioncallOrAssignment(expression_VariableName);
        if (result == null) result = caseStatement(expression_VariableName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
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
  public T caseChunk(Chunk object)
  {
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
  public T caseBlock(Block object)
  {
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
  public T caseLastStatement(LastStatement object)
  {
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
  public T caseLastStatement_Return(LastStatement_Return object)
  {
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
  public T caseLastStatement_Break(LastStatement_Break object)
  {
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
  public T caseStatement(Statement object)
  {
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
  public T caseStatement_Block(Statement_Block object)
  {
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
  public T caseStatement_While(Statement_While object)
  {
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
  public T caseStatement_Repeat(Statement_Repeat object)
  {
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
  public T caseStatement_If_Then_Else(Statement_If_Then_Else object)
  {
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
  public T caseStatement_If_Then_Else_ElseIfPart(Statement_If_Then_Else_ElseIfPart object)
  {
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
  public T caseStatement_For_Numeric(Statement_For_Numeric object)
  {
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
  public T caseStatement_For_Generic(Statement_For_Generic object)
  {
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
  public T caseStatement_GlobalFunction_Declaration(Statement_GlobalFunction_Declaration object)
  {
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
  public T caseStatement_LocalFunction_Declaration(Statement_LocalFunction_Declaration object)
  {
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
  public T caseStatement_Local_Variable_Declaration(Statement_Local_Variable_Declaration object)
  {
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
  public T caseStatement_FunctioncallOrAssignment(Statement_FunctioncallOrAssignment object)
  {
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
  public T caseExpression(Expression object)
  {
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
  public T caseExpression_Nil(Expression_Nil object)
  {
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
  public T caseExpression_True(Expression_True object)
  {
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
  public T caseExpression_False(Expression_False object)
  {
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
  public T caseExpression_Number(Expression_Number object)
  {
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
  public T caseExpression_VarArgs(Expression_VarArgs object)
  {
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
  public T caseExpression_String(Expression_String object)
  {
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
  public T caseExpression_Function(Expression_Function object)
  {
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
  public T caseExpression_TableConstructor(Expression_TableConstructor object)
  {
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
  public T caseFunction(Function object)
  {
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
  public T caseFunctioncall_Arguments(Functioncall_Arguments object)
  {
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
  public T caseField(Field object)
  {
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
  public T caseField_AddEntryToTable_Brackets(Field_AddEntryToTable_Brackets object)
  {
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
  public T caseField_AddEntryToTable(Field_AddEntryToTable object)
  {
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
  public T caseField_AppendEntryToTable(Field_AppendEntryToTable object)
  {
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
  public T caseLastStatement_ReturnWithValue(LastStatement_ReturnWithValue object)
  {
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
  public T caseStatement_Assignment(Statement_Assignment object)
  {
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
  public T caseStatement_CallMemberFunction(Statement_CallMemberFunction object)
  {
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
  public T caseStatement_CallFunction(Statement_CallFunction object)
  {
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
  public T caseExpression_Or(Expression_Or object)
  {
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
  public T caseExpression_And(Expression_And object)
  {
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
  public T caseExpression_Larger(Expression_Larger object)
  {
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
  public T caseExpression_Larger_Equal(Expression_Larger_Equal object)
  {
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
  public T caseExpression_Smaller(Expression_Smaller object)
  {
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
  public T caseExpression_Smaller_Equal(Expression_Smaller_Equal object)
  {
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
  public T caseExpression_Equal(Expression_Equal object)
  {
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
  public T caseExpression_Not_Equal(Expression_Not_Equal object)
  {
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
  public T caseExpression_Concatenation(Expression_Concatenation object)
  {
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
  public T caseExpression_Plus(Expression_Plus object)
  {
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
  public T caseExpression_Minus(Expression_Minus object)
  {
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
  public T caseExpression_Multiplication(Expression_Multiplication object)
  {
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
  public T caseExpression_Division(Expression_Division object)
  {
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
  public T caseExpression_Modulo(Expression_Modulo object)
  {
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
  public T caseExpression_Negate(Expression_Negate object)
  {
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
  public T caseExpression_Length(Expression_Length object)
  {
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
  public T caseExpression_Invert(Expression_Invert object)
  {
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
  public T caseExpression_Exponentiation(Expression_Exponentiation object)
  {
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
  public T caseExpression_CallMemberFunction(Expression_CallMemberFunction object)
  {
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
  public T caseExpression_CallFunction(Expression_CallFunction object)
  {
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
  public T caseExpression_AccessArray(Expression_AccessArray object)
  {
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
  public T caseExpression_AccessMember(Expression_AccessMember object)
  {
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
  public T caseExpression_VariableName(Expression_VariableName object)
  {
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
  public T defaultCase(EObject object)
  {
    return null;
  }

} //LuaSwitch
