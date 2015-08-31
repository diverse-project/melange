/**
 */
package org.xtext.lua.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.lua.Block;
import org.xtext.lua.Chunk;
import org.xtext.lua.Expression;
import org.xtext.lua.Expression_AccessArray;
import org.xtext.lua.Expression_AccessMember;
import org.xtext.lua.Expression_And;
import org.xtext.lua.Expression_CallFunction;
import org.xtext.lua.Expression_CallMemberFunction;
import org.xtext.lua.Expression_Concatenation;
import org.xtext.lua.Expression_Division;
import org.xtext.lua.Expression_Equal;
import org.xtext.lua.Expression_Exponentiation;
import org.xtext.lua.Expression_False;
import org.xtext.lua.Expression_Function;
import org.xtext.lua.Expression_Invert;
import org.xtext.lua.Expression_Larger;
import org.xtext.lua.Expression_Larger_Equal;
import org.xtext.lua.Expression_Length;
import org.xtext.lua.Expression_Minus;
import org.xtext.lua.Expression_Modulo;
import org.xtext.lua.Expression_Multiplication;
import org.xtext.lua.Expression_Negate;
import org.xtext.lua.Expression_Nil;
import org.xtext.lua.Expression_Not_Equal;
import org.xtext.lua.Expression_Number;
import org.xtext.lua.Expression_Or;
import org.xtext.lua.Expression_Plus;
import org.xtext.lua.Expression_Smaller;
import org.xtext.lua.Expression_Smaller_Equal;
import org.xtext.lua.Expression_String;
import org.xtext.lua.Expression_TableConstructor;
import org.xtext.lua.Expression_True;
import org.xtext.lua.Expression_VarArgs;
import org.xtext.lua.Expression_VariableName;
import org.xtext.lua.Field;
import org.xtext.lua.Field_AddEntryToTable;
import org.xtext.lua.Field_AddEntryToTable_Brackets;
import org.xtext.lua.Field_AppendEntryToTable;
import org.xtext.lua.Function;
import org.xtext.lua.Functioncall_Arguments;
import org.xtext.lua.LastStatement;
import org.xtext.lua.LastStatement_Break;
import org.xtext.lua.LastStatement_Return;
import org.xtext.lua.LastStatement_ReturnWithValue;
import org.xtext.lua.LuaFactory;
import org.xtext.lua.LuaPackage;
import org.xtext.lua.Statement;
import org.xtext.lua.Statement_Assignment;
import org.xtext.lua.Statement_Block;
import org.xtext.lua.Statement_CallFunction;
import org.xtext.lua.Statement_CallMemberFunction;
import org.xtext.lua.Statement_For_Generic;
import org.xtext.lua.Statement_For_Numeric;
import org.xtext.lua.Statement_FunctioncallOrAssignment;
import org.xtext.lua.Statement_GlobalFunction_Declaration;
import org.xtext.lua.Statement_If_Then_Else;
import org.xtext.lua.Statement_If_Then_Else_ElseIfPart;
import org.xtext.lua.Statement_LocalFunction_Declaration;
import org.xtext.lua.Statement_Local_Variable_Declaration;
import org.xtext.lua.Statement_Repeat;
import org.xtext.lua.Statement_While;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LuaPackageImpl extends EPackageImpl implements LuaPackage
{
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
  private EClass fieldEClass = null;

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
   * @see org.xtext.lua.LuaPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private LuaPackageImpl()
  {
    super(eNS_URI, LuaFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link LuaPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static LuaPackage init()
  {
    if (isInited) return (LuaPackage)EPackage.Registry.INSTANCE.getEPackage(LuaPackage.eNS_URI);

    // Obtain or create and register package
    LuaPackageImpl theLuaPackage = (LuaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LuaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LuaPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theLuaPackage.createPackageContents();

    // Initialize created meta-data
    theLuaPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theLuaPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(LuaPackage.eNS_URI, theLuaPackage);
    return theLuaPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getChunk()
  {
    return chunkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBlock()
  {
    return blockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBlock_Statements()
  {
    return (EReference)blockEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBlock_ReturnValue()
  {
    return (EReference)blockEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLastStatement()
  {
    return lastStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLastStatement_Return()
  {
    return lastStatement_ReturnEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLastStatement_Break()
  {
    return lastStatement_BreakEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStatement()
  {
    return statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStatement_Block()
  {
    return statement_BlockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_Block_Block()
  {
    return (EReference)statement_BlockEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStatement_While()
  {
    return statement_WhileEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_While_Expression()
  {
    return (EReference)statement_WhileEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_While_Block()
  {
    return (EReference)statement_WhileEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStatement_Repeat()
  {
    return statement_RepeatEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_Repeat_Block()
  {
    return (EReference)statement_RepeatEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_Repeat_Expression()
  {
    return (EReference)statement_RepeatEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStatement_If_Then_Else()
  {
    return statement_If_Then_ElseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_If_Then_Else_IfExpression()
  {
    return (EReference)statement_If_Then_ElseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_If_Then_Else_IfBlock()
  {
    return (EReference)statement_If_Then_ElseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_If_Then_Else_ElseIf()
  {
    return (EReference)statement_If_Then_ElseEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_If_Then_Else_ElseBlock()
  {
    return (EReference)statement_If_Then_ElseEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStatement_If_Then_Else_ElseIfPart()
  {
    return statement_If_Then_Else_ElseIfPartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_If_Then_Else_ElseIfPart_ElseifExpression()
  {
    return (EReference)statement_If_Then_Else_ElseIfPartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_If_Then_Else_ElseIfPart_ElseifBlock()
  {
    return (EReference)statement_If_Then_Else_ElseIfPartEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStatement_For_Numeric()
  {
    return statement_For_NumericEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStatement_For_Numeric_IteratorName()
  {
    return (EAttribute)statement_For_NumericEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_For_Numeric_StartExpr()
  {
    return (EReference)statement_For_NumericEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_For_Numeric_UntilExpr()
  {
    return (EReference)statement_For_NumericEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_For_Numeric_StepExpr()
  {
    return (EReference)statement_For_NumericEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_For_Numeric_Block()
  {
    return (EReference)statement_For_NumericEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStatement_For_Generic()
  {
    return statement_For_GenericEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStatement_For_Generic_Names()
  {
    return (EAttribute)statement_For_GenericEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_For_Generic_Expressions()
  {
    return (EReference)statement_For_GenericEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_For_Generic_Block()
  {
    return (EReference)statement_For_GenericEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStatement_GlobalFunction_Declaration()
  {
    return statement_GlobalFunction_DeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStatement_GlobalFunction_Declaration_Prefix()
  {
    return (EAttribute)statement_GlobalFunction_DeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStatement_GlobalFunction_Declaration_FunctionName()
  {
    return (EAttribute)statement_GlobalFunction_DeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_GlobalFunction_Declaration_Function()
  {
    return (EReference)statement_GlobalFunction_DeclarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStatement_LocalFunction_Declaration()
  {
    return statement_LocalFunction_DeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStatement_LocalFunction_Declaration_FunctionName()
  {
    return (EAttribute)statement_LocalFunction_DeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_LocalFunction_Declaration_Function()
  {
    return (EReference)statement_LocalFunction_DeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStatement_Local_Variable_Declaration()
  {
    return statement_Local_Variable_DeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStatement_Local_Variable_Declaration_VariableNames()
  {
    return (EAttribute)statement_Local_Variable_DeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_Local_Variable_Declaration_InitialValue()
  {
    return (EReference)statement_Local_Variable_DeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStatement_FunctioncallOrAssignment()
  {
    return statement_FunctioncallOrAssignmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression()
  {
    return expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression_Nil()
  {
    return expression_NilEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression_True()
  {
    return expression_TrueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression_False()
  {
    return expression_FalseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression_Number()
  {
    return expression_NumberEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExpression_Number_Value()
  {
    return (EAttribute)expression_NumberEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression_VarArgs()
  {
    return expression_VarArgsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression_String()
  {
    return expression_StringEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExpression_String_Value()
  {
    return (EAttribute)expression_StringEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression_Function()
  {
    return expression_FunctionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_Function_Function()
  {
    return (EReference)expression_FunctionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression_TableConstructor()
  {
    return expression_TableConstructorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_TableConstructor_Fields()
  {
    return (EReference)expression_TableConstructorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunction()
  {
    return functionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunction_Parameters()
  {
    return (EAttribute)functionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunction_VarArgs()
  {
    return (EAttribute)functionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunction_Body()
  {
    return (EReference)functionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunctioncall_Arguments()
  {
    return functioncall_ArgumentsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctioncall_Arguments_Arguments()
  {
    return (EReference)functioncall_ArgumentsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getField()
  {
    return fieldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getField_Value()
  {
    return (EReference)fieldEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getField_AddEntryToTable_Brackets()
  {
    return field_AddEntryToTable_BracketsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getField_AddEntryToTable_Brackets_IndexExpression()
  {
    return (EReference)field_AddEntryToTable_BracketsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getField_AddEntryToTable()
  {
    return field_AddEntryToTableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getField_AddEntryToTable_Key()
  {
    return (EAttribute)field_AddEntryToTableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getField_AppendEntryToTable()
  {
    return field_AppendEntryToTableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLastStatement_ReturnWithValue()
  {
    return lastStatement_ReturnWithValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLastStatement_ReturnWithValue_ReturnValues()
  {
    return (EReference)lastStatement_ReturnWithValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStatement_Assignment()
  {
    return statement_AssignmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_Assignment_Variable()
  {
    return (EReference)statement_AssignmentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_Assignment_Values()
  {
    return (EReference)statement_AssignmentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStatement_CallMemberFunction()
  {
    return statement_CallMemberFunctionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_CallMemberFunction_Object()
  {
    return (EReference)statement_CallMemberFunctionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStatement_CallMemberFunction_MemberFunctionName()
  {
    return (EAttribute)statement_CallMemberFunctionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_CallMemberFunction_Arguments()
  {
    return (EReference)statement_CallMemberFunctionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStatement_CallFunction()
  {
    return statement_CallFunctionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_CallFunction_Object()
  {
    return (EReference)statement_CallFunctionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_CallFunction_Arguments()
  {
    return (EReference)statement_CallFunctionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression_Or()
  {
    return expression_OrEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_Or_Left()
  {
    return (EReference)expression_OrEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_Or_Right()
  {
    return (EReference)expression_OrEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression_And()
  {
    return expression_AndEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_And_Left()
  {
    return (EReference)expression_AndEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_And_Right()
  {
    return (EReference)expression_AndEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression_Larger()
  {
    return expression_LargerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_Larger_Left()
  {
    return (EReference)expression_LargerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_Larger_Right()
  {
    return (EReference)expression_LargerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression_Larger_Equal()
  {
    return expression_Larger_EqualEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_Larger_Equal_Left()
  {
    return (EReference)expression_Larger_EqualEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_Larger_Equal_Right()
  {
    return (EReference)expression_Larger_EqualEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression_Smaller()
  {
    return expression_SmallerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_Smaller_Left()
  {
    return (EReference)expression_SmallerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_Smaller_Right()
  {
    return (EReference)expression_SmallerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression_Smaller_Equal()
  {
    return expression_Smaller_EqualEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_Smaller_Equal_Left()
  {
    return (EReference)expression_Smaller_EqualEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_Smaller_Equal_Right()
  {
    return (EReference)expression_Smaller_EqualEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression_Equal()
  {
    return expression_EqualEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_Equal_Left()
  {
    return (EReference)expression_EqualEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_Equal_Right()
  {
    return (EReference)expression_EqualEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression_Not_Equal()
  {
    return expression_Not_EqualEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_Not_Equal_Left()
  {
    return (EReference)expression_Not_EqualEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_Not_Equal_Right()
  {
    return (EReference)expression_Not_EqualEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression_Concatenation()
  {
    return expression_ConcatenationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_Concatenation_Left()
  {
    return (EReference)expression_ConcatenationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_Concatenation_Right()
  {
    return (EReference)expression_ConcatenationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression_Plus()
  {
    return expression_PlusEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_Plus_Left()
  {
    return (EReference)expression_PlusEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_Plus_Right()
  {
    return (EReference)expression_PlusEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression_Minus()
  {
    return expression_MinusEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_Minus_Left()
  {
    return (EReference)expression_MinusEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_Minus_Right()
  {
    return (EReference)expression_MinusEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression_Multiplication()
  {
    return expression_MultiplicationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_Multiplication_Left()
  {
    return (EReference)expression_MultiplicationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_Multiplication_Right()
  {
    return (EReference)expression_MultiplicationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression_Division()
  {
    return expression_DivisionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_Division_Left()
  {
    return (EReference)expression_DivisionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_Division_Right()
  {
    return (EReference)expression_DivisionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression_Modulo()
  {
    return expression_ModuloEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_Modulo_Left()
  {
    return (EReference)expression_ModuloEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_Modulo_Right()
  {
    return (EReference)expression_ModuloEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression_Negate()
  {
    return expression_NegateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_Negate_Exp()
  {
    return (EReference)expression_NegateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression_Length()
  {
    return expression_LengthEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_Length_Exp()
  {
    return (EReference)expression_LengthEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression_Invert()
  {
    return expression_InvertEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_Invert_Exp()
  {
    return (EReference)expression_InvertEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression_Exponentiation()
  {
    return expression_ExponentiationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_Exponentiation_Left()
  {
    return (EReference)expression_ExponentiationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_Exponentiation_Right()
  {
    return (EReference)expression_ExponentiationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression_CallMemberFunction()
  {
    return expression_CallMemberFunctionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_CallMemberFunction_Object()
  {
    return (EReference)expression_CallMemberFunctionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExpression_CallMemberFunction_MemberFunctionName()
  {
    return (EAttribute)expression_CallMemberFunctionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_CallMemberFunction_Arguments()
  {
    return (EReference)expression_CallMemberFunctionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression_CallFunction()
  {
    return expression_CallFunctionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_CallFunction_Object()
  {
    return (EReference)expression_CallFunctionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_CallFunction_Arguments()
  {
    return (EReference)expression_CallFunctionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression_AccessArray()
  {
    return expression_AccessArrayEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_AccessArray_Array()
  {
    return (EReference)expression_AccessArrayEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_AccessArray_Index()
  {
    return (EReference)expression_AccessArrayEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression_AccessMember()
  {
    return expression_AccessMemberEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_AccessMember_Object()
  {
    return (EReference)expression_AccessMemberEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExpression_AccessMember_MemberName()
  {
    return (EAttribute)expression_AccessMemberEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression_VariableName()
  {
    return expression_VariableNameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExpression_VariableName_Variable()
  {
    return (EAttribute)expression_VariableNameEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LuaFactory getLuaFactory()
  {
    return (LuaFactory)getEFactoryInstance();
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
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
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

    fieldEClass = createEClass(FIELD);
    createEReference(fieldEClass, FIELD__VALUE);

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
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
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

    // Initialize classes and features; add operations and parameters
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

    initEClass(fieldEClass, Field.class, "Field", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getField_Value(), this.getExpression(), null, "value", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

    // Create resource
    createResource(eNS_URI);
  }

} //LuaPackageImpl
