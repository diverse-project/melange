/**
 */
package org.xtext.lua.lua;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.lua.lua.LuaFactory
 * @model kind="package"
 * @generated
 */
public interface LuaPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "lua";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://lua/1.0";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "lua";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  LuaPackage eINSTANCE = org.xtext.lua.lua.impl.LuaPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.lua.lua.impl.ChunkImpl <em>Chunk</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.lua.lua.impl.ChunkImpl
   * @see org.xtext.lua.lua.impl.LuaPackageImpl#getChunk()
   * @generated
   */
  int CHUNK = 0;

  /**
   * The number of structural features of the '<em>Chunk</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHUNK_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.lua.lua.impl.BlockImpl <em>Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.lua.lua.impl.BlockImpl
   * @see org.xtext.lua.lua.impl.LuaPackageImpl#getBlock()
   * @generated
   */
  int BLOCK = 1;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__STATEMENTS = CHUNK_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Return Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__RETURN_VALUE = CHUNK_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_FEATURE_COUNT = CHUNK_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.lua.lua.impl.LastStatementImpl <em>Last Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.lua.lua.impl.LastStatementImpl
   * @see org.xtext.lua.lua.impl.LuaPackageImpl#getLastStatement()
   * @generated
   */
  int LAST_STATEMENT = 2;

  /**
   * The number of structural features of the '<em>Last Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAST_STATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.lua.lua.impl.LastStatement_ReturnImpl <em>Last Statement Return</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.lua.lua.impl.LastStatement_ReturnImpl
   * @see org.xtext.lua.lua.impl.LuaPackageImpl#getLastStatement_Return()
   * @generated
   */
  int LAST_STATEMENT_RETURN = 3;

  /**
   * The number of structural features of the '<em>Last Statement Return</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAST_STATEMENT_RETURN_FEATURE_COUNT = LAST_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.lua.lua.impl.LastStatement_BreakImpl <em>Last Statement Break</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.lua.lua.impl.LastStatement_BreakImpl
   * @see org.xtext.lua.lua.impl.LuaPackageImpl#getLastStatement_Break()
   * @generated
   */
  int LAST_STATEMENT_BREAK = 4;

  /**
   * The number of structural features of the '<em>Last Statement Break</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAST_STATEMENT_BREAK_FEATURE_COUNT = LAST_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.lua.lua.impl.StatementImpl <em>Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.lua.lua.impl.StatementImpl
   * @see org.xtext.lua.lua.impl.LuaPackageImpl#getStatement()
   * @generated
   */
  int STATEMENT = 5;

  /**
   * The number of structural features of the '<em>Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.lua.lua.impl.Statement_BlockImpl <em>Statement Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.lua.lua.impl.Statement_BlockImpl
   * @see org.xtext.lua.lua.impl.LuaPackageImpl#getStatement_Block()
   * @generated
   */
  int STATEMENT_BLOCK = 6;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_BLOCK__BLOCK = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Statement Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_BLOCK_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.lua.lua.impl.Statement_WhileImpl <em>Statement While</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.lua.lua.impl.Statement_WhileImpl
   * @see org.xtext.lua.lua.impl.LuaPackageImpl#getStatement_While()
   * @generated
   */
  int STATEMENT_WHILE = 7;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_WHILE__EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_WHILE__BLOCK = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Statement While</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_WHILE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.lua.lua.impl.Statement_RepeatImpl <em>Statement Repeat</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.lua.lua.impl.Statement_RepeatImpl
   * @see org.xtext.lua.lua.impl.LuaPackageImpl#getStatement_Repeat()
   * @generated
   */
  int STATEMENT_REPEAT = 8;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_REPEAT__BLOCK = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_REPEAT__EXPRESSION = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Statement Repeat</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_REPEAT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.lua.lua.impl.Statement_If_Then_ElseImpl <em>Statement If Then Else</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.lua.lua.impl.Statement_If_Then_ElseImpl
   * @see org.xtext.lua.lua.impl.LuaPackageImpl#getStatement_If_Then_Else()
   * @generated
   */
  int STATEMENT_IF_THEN_ELSE = 9;

  /**
   * The feature id for the '<em><b>If Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_IF_THEN_ELSE__IF_EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>If Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_IF_THEN_ELSE__IF_BLOCK = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Else If</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_IF_THEN_ELSE__ELSE_IF = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Else Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_IF_THEN_ELSE__ELSE_BLOCK = STATEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Statement If Then Else</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_IF_THEN_ELSE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.xtext.lua.lua.impl.Statement_If_Then_Else_ElseIfPartImpl <em>Statement If Then Else Else If Part</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.lua.lua.impl.Statement_If_Then_Else_ElseIfPartImpl
   * @see org.xtext.lua.lua.impl.LuaPackageImpl#getStatement_If_Then_Else_ElseIfPart()
   * @generated
   */
  int STATEMENT_IF_THEN_ELSE_ELSE_IF_PART = 10;

  /**
   * The feature id for the '<em><b>Elseif Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_IF_THEN_ELSE_ELSE_IF_PART__ELSEIF_EXPRESSION = 0;

  /**
   * The feature id for the '<em><b>Elseif Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_IF_THEN_ELSE_ELSE_IF_PART__ELSEIF_BLOCK = 1;

  /**
   * The number of structural features of the '<em>Statement If Then Else Else If Part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_IF_THEN_ELSE_ELSE_IF_PART_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.lua.lua.impl.Statement_For_NumericImpl <em>Statement For Numeric</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.lua.lua.impl.Statement_For_NumericImpl
   * @see org.xtext.lua.lua.impl.LuaPackageImpl#getStatement_For_Numeric()
   * @generated
   */
  int STATEMENT_FOR_NUMERIC = 11;

  /**
   * The feature id for the '<em><b>Iterator Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FOR_NUMERIC__ITERATOR_NAME = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Start Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FOR_NUMERIC__START_EXPR = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Until Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FOR_NUMERIC__UNTIL_EXPR = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Step Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FOR_NUMERIC__STEP_EXPR = STATEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FOR_NUMERIC__BLOCK = STATEMENT_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Statement For Numeric</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FOR_NUMERIC_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.xtext.lua.lua.impl.Statement_For_GenericImpl <em>Statement For Generic</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.lua.lua.impl.Statement_For_GenericImpl
   * @see org.xtext.lua.lua.impl.LuaPackageImpl#getStatement_For_Generic()
   * @generated
   */
  int STATEMENT_FOR_GENERIC = 12;

  /**
   * The feature id for the '<em><b>Names</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FOR_GENERIC__NAMES = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FOR_GENERIC__EXPRESSIONS = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FOR_GENERIC__BLOCK = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Statement For Generic</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FOR_GENERIC_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.lua.lua.impl.Statement_GlobalFunction_DeclarationImpl <em>Statement Global Function Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.lua.lua.impl.Statement_GlobalFunction_DeclarationImpl
   * @see org.xtext.lua.lua.impl.LuaPackageImpl#getStatement_GlobalFunction_Declaration()
   * @generated
   */
  int STATEMENT_GLOBAL_FUNCTION_DECLARATION = 13;

  /**
   * The feature id for the '<em><b>Prefix</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_GLOBAL_FUNCTION_DECLARATION__PREFIX = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Function Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_GLOBAL_FUNCTION_DECLARATION__FUNCTION_NAME = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Function</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_GLOBAL_FUNCTION_DECLARATION__FUNCTION = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Statement Global Function Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_GLOBAL_FUNCTION_DECLARATION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.lua.lua.impl.Statement_LocalFunction_DeclarationImpl <em>Statement Local Function Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.lua.lua.impl.Statement_LocalFunction_DeclarationImpl
   * @see org.xtext.lua.lua.impl.LuaPackageImpl#getStatement_LocalFunction_Declaration()
   * @generated
   */
  int STATEMENT_LOCAL_FUNCTION_DECLARATION = 14;

  /**
   * The feature id for the '<em><b>Function Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_LOCAL_FUNCTION_DECLARATION__FUNCTION_NAME = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Function</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_LOCAL_FUNCTION_DECLARATION__FUNCTION = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Statement Local Function Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_LOCAL_FUNCTION_DECLARATION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.lua.lua.impl.Statement_Local_Variable_DeclarationImpl <em>Statement Local Variable Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.lua.lua.impl.Statement_Local_Variable_DeclarationImpl
   * @see org.xtext.lua.lua.impl.LuaPackageImpl#getStatement_Local_Variable_Declaration()
   * @generated
   */
  int STATEMENT_LOCAL_VARIABLE_DECLARATION = 15;

  /**
   * The feature id for the '<em><b>Variable Names</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_LOCAL_VARIABLE_DECLARATION__VARIABLE_NAMES = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Initial Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_LOCAL_VARIABLE_DECLARATION__INITIAL_VALUE = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Statement Local Variable Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_LOCAL_VARIABLE_DECLARATION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.lua.lua.impl.Statement_FunctioncallOrAssignmentImpl <em>Statement Functioncall Or Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.lua.lua.impl.Statement_FunctioncallOrAssignmentImpl
   * @see org.xtext.lua.lua.impl.LuaPackageImpl#getStatement_FunctioncallOrAssignment()
   * @generated
   */
  int STATEMENT_FUNCTIONCALL_OR_ASSIGNMENT = 16;

  /**
   * The number of structural features of the '<em>Statement Functioncall Or Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FUNCTIONCALL_OR_ASSIGNMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.lua.lua.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.lua.lua.impl.ExpressionImpl
   * @see org.xtext.lua.lua.impl.LuaPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 17;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = STATEMENT_FUNCTIONCALL_OR_ASSIGNMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.lua.lua.impl.Expression_NilImpl <em>Expression Nil</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.lua.lua.impl.Expression_NilImpl
   * @see org.xtext.lua.lua.impl.LuaPackageImpl#getExpression_Nil()
   * @generated
   */
  int EXPRESSION_NIL = 18;

  /**
   * The number of structural features of the '<em>Expression Nil</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_NIL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.lua.lua.impl.Expression_TrueImpl <em>Expression True</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.lua.lua.impl.Expression_TrueImpl
   * @see org.xtext.lua.lua.impl.LuaPackageImpl#getExpression_True()
   * @generated
   */
  int EXPRESSION_TRUE = 19;

  /**
   * The number of structural features of the '<em>Expression True</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_TRUE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.lua.lua.impl.Expression_FalseImpl <em>Expression False</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.lua.lua.impl.Expression_FalseImpl
   * @see org.xtext.lua.lua.impl.LuaPackageImpl#getExpression_False()
   * @generated
   */
  int EXPRESSION_FALSE = 20;

  /**
   * The number of structural features of the '<em>Expression False</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FALSE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.lua.lua.impl.Expression_NumberImpl <em>Expression Number</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.lua.lua.impl.Expression_NumberImpl
   * @see org.xtext.lua.lua.impl.LuaPackageImpl#getExpression_Number()
   * @generated
   */
  int EXPRESSION_NUMBER = 21;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_NUMBER__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Expression Number</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_NUMBER_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.lua.lua.impl.Expression_VarArgsImpl <em>Expression Var Args</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.lua.lua.impl.Expression_VarArgsImpl
   * @see org.xtext.lua.lua.impl.LuaPackageImpl#getExpression_VarArgs()
   * @generated
   */
  int EXPRESSION_VAR_ARGS = 22;

  /**
   * The number of structural features of the '<em>Expression Var Args</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_VAR_ARGS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.lua.lua.impl.Expression_StringImpl <em>Expression String</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.lua.lua.impl.Expression_StringImpl
   * @see org.xtext.lua.lua.impl.LuaPackageImpl#getExpression_String()
   * @generated
   */
  int EXPRESSION_STRING = 23;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_STRING__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Expression String</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_STRING_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.lua.lua.impl.Expression_FunctionImpl <em>Expression Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.lua.lua.impl.Expression_FunctionImpl
   * @see org.xtext.lua.lua.impl.LuaPackageImpl#getExpression_Function()
   * @generated
   */
  int EXPRESSION_FUNCTION = 24;

  /**
   * The feature id for the '<em><b>Function</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FUNCTION__FUNCTION = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Expression Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FUNCTION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.lua.lua.impl.Expression_TableConstructorImpl <em>Expression Table Constructor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.lua.lua.impl.Expression_TableConstructorImpl
   * @see org.xtext.lua.lua.impl.LuaPackageImpl#getExpression_TableConstructor()
   * @generated
   */
  int EXPRESSION_TABLE_CONSTRUCTOR = 25;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_TABLE_CONSTRUCTOR__FIELDS = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Expression Table Constructor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_TABLE_CONSTRUCTOR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.lua.lua.impl.FunctionImpl <em>Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.lua.lua.impl.FunctionImpl
   * @see org.xtext.lua.lua.impl.LuaPackageImpl#getFunction()
   * @generated
   */
  int FUNCTION = 26;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__PARAMETERS = 0;

  /**
   * The feature id for the '<em><b>Var Args</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__VAR_ARGS = 1;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__BODY = 2;

  /**
   * The number of structural features of the '<em>Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.lua.lua.impl.Functioncall_ArgumentsImpl <em>Functioncall Arguments</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.lua.lua.impl.Functioncall_ArgumentsImpl
   * @see org.xtext.lua.lua.impl.LuaPackageImpl#getFunctioncall_Arguments()
   * @generated
   */
  int FUNCTIONCALL_ARGUMENTS = 27;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTIONCALL_ARGUMENTS__ARGUMENTS = 0;

  /**
   * The number of structural features of the '<em>Functioncall Arguments</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTIONCALL_ARGUMENTS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.lua.lua.impl.FieldImpl <em>Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.lua.lua.impl.FieldImpl
   * @see org.xtext.lua.lua.impl.LuaPackageImpl#getField()
   * @generated
   */
  int FIELD = 28;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__VALUE = 0;

  /**
   * The number of structural features of the '<em>Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.lua.lua.impl.Field_AddEntryToTable_BracketsImpl <em>Field Add Entry To Table Brackets</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.lua.lua.impl.Field_AddEntryToTable_BracketsImpl
   * @see org.xtext.lua.lua.impl.LuaPackageImpl#getField_AddEntryToTable_Brackets()
   * @generated
   */
  int FIELD_ADD_ENTRY_TO_TABLE_BRACKETS = 29;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_ADD_ENTRY_TO_TABLE_BRACKETS__VALUE = FIELD__VALUE;

  /**
   * The feature id for the '<em><b>Index Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_ADD_ENTRY_TO_TABLE_BRACKETS__INDEX_EXPRESSION = FIELD_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Field Add Entry To Table Brackets</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_ADD_ENTRY_TO_TABLE_BRACKETS_FEATURE_COUNT = FIELD_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.lua.lua.impl.Field_AddEntryToTableImpl <em>Field Add Entry To Table</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.lua.lua.impl.Field_AddEntryToTableImpl
   * @see org.xtext.lua.lua.impl.LuaPackageImpl#getField_AddEntryToTable()
   * @generated
   */
  int FIELD_ADD_ENTRY_TO_TABLE = 30;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_ADD_ENTRY_TO_TABLE__VALUE = FIELD__VALUE;

  /**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_ADD_ENTRY_TO_TABLE__KEY = FIELD_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Field Add Entry To Table</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_ADD_ENTRY_TO_TABLE_FEATURE_COUNT = FIELD_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.lua.lua.impl.Field_AppendEntryToTableImpl <em>Field Append Entry To Table</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.lua.lua.impl.Field_AppendEntryToTableImpl
   * @see org.xtext.lua.lua.impl.LuaPackageImpl#getField_AppendEntryToTable()
   * @generated
   */
  int FIELD_APPEND_ENTRY_TO_TABLE = 31;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_APPEND_ENTRY_TO_TABLE__VALUE = FIELD__VALUE;

  /**
   * The number of structural features of the '<em>Field Append Entry To Table</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_APPEND_ENTRY_TO_TABLE_FEATURE_COUNT = FIELD_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.lua.lua.impl.LastStatement_ReturnWithValueImpl <em>Last Statement Return With Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.lua.lua.impl.LastStatement_ReturnWithValueImpl
   * @see org.xtext.lua.lua.impl.LuaPackageImpl#getLastStatement_ReturnWithValue()
   * @generated
   */
  int LAST_STATEMENT_RETURN_WITH_VALUE = 32;

  /**
   * The feature id for the '<em><b>Return Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAST_STATEMENT_RETURN_WITH_VALUE__RETURN_VALUES = LAST_STATEMENT_RETURN_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Last Statement Return With Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAST_STATEMENT_RETURN_WITH_VALUE_FEATURE_COUNT = LAST_STATEMENT_RETURN_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.lua.lua.impl.Statement_AssignmentImpl <em>Statement Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.lua.lua.impl.Statement_AssignmentImpl
   * @see org.xtext.lua.lua.impl.LuaPackageImpl#getStatement_Assignment()
   * @generated
   */
  int STATEMENT_ASSIGNMENT = 33;

  /**
   * The feature id for the '<em><b>Variable</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_ASSIGNMENT__VARIABLE = STATEMENT_FUNCTIONCALL_OR_ASSIGNMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_ASSIGNMENT__VALUES = STATEMENT_FUNCTIONCALL_OR_ASSIGNMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Statement Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_ASSIGNMENT_FEATURE_COUNT = STATEMENT_FUNCTIONCALL_OR_ASSIGNMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.lua.lua.impl.Statement_CallMemberFunctionImpl <em>Statement Call Member Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.lua.lua.impl.Statement_CallMemberFunctionImpl
   * @see org.xtext.lua.lua.impl.LuaPackageImpl#getStatement_CallMemberFunction()
   * @generated
   */
  int STATEMENT_CALL_MEMBER_FUNCTION = 34;

  /**
   * The feature id for the '<em><b>Object</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_CALL_MEMBER_FUNCTION__OBJECT = STATEMENT_FUNCTIONCALL_OR_ASSIGNMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Member Function Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_CALL_MEMBER_FUNCTION__MEMBER_FUNCTION_NAME = STATEMENT_FUNCTIONCALL_OR_ASSIGNMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_CALL_MEMBER_FUNCTION__ARGUMENTS = STATEMENT_FUNCTIONCALL_OR_ASSIGNMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Statement Call Member Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_CALL_MEMBER_FUNCTION_FEATURE_COUNT = STATEMENT_FUNCTIONCALL_OR_ASSIGNMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.lua.lua.impl.Statement_CallFunctionImpl <em>Statement Call Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.lua.lua.impl.Statement_CallFunctionImpl
   * @see org.xtext.lua.lua.impl.LuaPackageImpl#getStatement_CallFunction()
   * @generated
   */
  int STATEMENT_CALL_FUNCTION = 35;

  /**
   * The feature id for the '<em><b>Object</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_CALL_FUNCTION__OBJECT = STATEMENT_FUNCTIONCALL_OR_ASSIGNMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_CALL_FUNCTION__ARGUMENTS = STATEMENT_FUNCTIONCALL_OR_ASSIGNMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Statement Call Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_CALL_FUNCTION_FEATURE_COUNT = STATEMENT_FUNCTIONCALL_OR_ASSIGNMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.lua.lua.impl.Expression_OrImpl <em>Expression Or</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.lua.lua.impl.Expression_OrImpl
   * @see org.xtext.lua.lua.impl.LuaPackageImpl#getExpression_Or()
   * @generated
   */
  int EXPRESSION_OR = 36;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_OR__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_OR__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Expression Or</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_OR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.lua.lua.impl.Expression_AndImpl <em>Expression And</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.lua.lua.impl.Expression_AndImpl
   * @see org.xtext.lua.lua.impl.LuaPackageImpl#getExpression_And()
   * @generated
   */
  int EXPRESSION_AND = 37;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_AND__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_AND__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Expression And</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_AND_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.lua.lua.impl.Expression_LargerImpl <em>Expression Larger</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.lua.lua.impl.Expression_LargerImpl
   * @see org.xtext.lua.lua.impl.LuaPackageImpl#getExpression_Larger()
   * @generated
   */
  int EXPRESSION_LARGER = 38;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_LARGER__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_LARGER__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Expression Larger</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_LARGER_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.lua.lua.impl.Expression_Larger_EqualImpl <em>Expression Larger Equal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.lua.lua.impl.Expression_Larger_EqualImpl
   * @see org.xtext.lua.lua.impl.LuaPackageImpl#getExpression_Larger_Equal()
   * @generated
   */
  int EXPRESSION_LARGER_EQUAL = 39;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_LARGER_EQUAL__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_LARGER_EQUAL__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Expression Larger Equal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_LARGER_EQUAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.lua.lua.impl.Expression_SmallerImpl <em>Expression Smaller</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.lua.lua.impl.Expression_SmallerImpl
   * @see org.xtext.lua.lua.impl.LuaPackageImpl#getExpression_Smaller()
   * @generated
   */
  int EXPRESSION_SMALLER = 40;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_SMALLER__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_SMALLER__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Expression Smaller</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_SMALLER_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.lua.lua.impl.Expression_Smaller_EqualImpl <em>Expression Smaller Equal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.lua.lua.impl.Expression_Smaller_EqualImpl
   * @see org.xtext.lua.lua.impl.LuaPackageImpl#getExpression_Smaller_Equal()
   * @generated
   */
  int EXPRESSION_SMALLER_EQUAL = 41;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_SMALLER_EQUAL__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_SMALLER_EQUAL__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Expression Smaller Equal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_SMALLER_EQUAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.lua.lua.impl.Expression_EqualImpl <em>Expression Equal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.lua.lua.impl.Expression_EqualImpl
   * @see org.xtext.lua.lua.impl.LuaPackageImpl#getExpression_Equal()
   * @generated
   */
  int EXPRESSION_EQUAL = 42;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_EQUAL__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_EQUAL__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Expression Equal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_EQUAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.lua.lua.impl.Expression_Not_EqualImpl <em>Expression Not Equal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.lua.lua.impl.Expression_Not_EqualImpl
   * @see org.xtext.lua.lua.impl.LuaPackageImpl#getExpression_Not_Equal()
   * @generated
   */
  int EXPRESSION_NOT_EQUAL = 43;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_NOT_EQUAL__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_NOT_EQUAL__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Expression Not Equal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_NOT_EQUAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.lua.lua.impl.Expression_ConcatenationImpl <em>Expression Concatenation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.lua.lua.impl.Expression_ConcatenationImpl
   * @see org.xtext.lua.lua.impl.LuaPackageImpl#getExpression_Concatenation()
   * @generated
   */
  int EXPRESSION_CONCATENATION = 44;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_CONCATENATION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_CONCATENATION__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Expression Concatenation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_CONCATENATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.lua.lua.impl.Expression_PlusImpl <em>Expression Plus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.lua.lua.impl.Expression_PlusImpl
   * @see org.xtext.lua.lua.impl.LuaPackageImpl#getExpression_Plus()
   * @generated
   */
  int EXPRESSION_PLUS = 45;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_PLUS__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_PLUS__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Expression Plus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_PLUS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.lua.lua.impl.Expression_MinusImpl <em>Expression Minus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.lua.lua.impl.Expression_MinusImpl
   * @see org.xtext.lua.lua.impl.LuaPackageImpl#getExpression_Minus()
   * @generated
   */
  int EXPRESSION_MINUS = 46;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_MINUS__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_MINUS__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Expression Minus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_MINUS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.lua.lua.impl.Expression_MultiplicationImpl <em>Expression Multiplication</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.lua.lua.impl.Expression_MultiplicationImpl
   * @see org.xtext.lua.lua.impl.LuaPackageImpl#getExpression_Multiplication()
   * @generated
   */
  int EXPRESSION_MULTIPLICATION = 47;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_MULTIPLICATION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_MULTIPLICATION__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Expression Multiplication</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_MULTIPLICATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.lua.lua.impl.Expression_DivisionImpl <em>Expression Division</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.lua.lua.impl.Expression_DivisionImpl
   * @see org.xtext.lua.lua.impl.LuaPackageImpl#getExpression_Division()
   * @generated
   */
  int EXPRESSION_DIVISION = 48;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_DIVISION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_DIVISION__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Expression Division</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_DIVISION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.lua.lua.impl.Expression_ModuloImpl <em>Expression Modulo</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.lua.lua.impl.Expression_ModuloImpl
   * @see org.xtext.lua.lua.impl.LuaPackageImpl#getExpression_Modulo()
   * @generated
   */
  int EXPRESSION_MODULO = 49;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_MODULO__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_MODULO__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Expression Modulo</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_MODULO_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.lua.lua.impl.Expression_NegateImpl <em>Expression Negate</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.lua.lua.impl.Expression_NegateImpl
   * @see org.xtext.lua.lua.impl.LuaPackageImpl#getExpression_Negate()
   * @generated
   */
  int EXPRESSION_NEGATE = 50;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_NEGATE__EXP = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Expression Negate</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_NEGATE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.lua.lua.impl.Expression_LengthImpl <em>Expression Length</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.lua.lua.impl.Expression_LengthImpl
   * @see org.xtext.lua.lua.impl.LuaPackageImpl#getExpression_Length()
   * @generated
   */
  int EXPRESSION_LENGTH = 51;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_LENGTH__EXP = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Expression Length</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_LENGTH_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.lua.lua.impl.Expression_InvertImpl <em>Expression Invert</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.lua.lua.impl.Expression_InvertImpl
   * @see org.xtext.lua.lua.impl.LuaPackageImpl#getExpression_Invert()
   * @generated
   */
  int EXPRESSION_INVERT = 52;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_INVERT__EXP = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Expression Invert</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_INVERT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.lua.lua.impl.Expression_ExponentiationImpl <em>Expression Exponentiation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.lua.lua.impl.Expression_ExponentiationImpl
   * @see org.xtext.lua.lua.impl.LuaPackageImpl#getExpression_Exponentiation()
   * @generated
   */
  int EXPRESSION_EXPONENTIATION = 53;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_EXPONENTIATION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_EXPONENTIATION__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Expression Exponentiation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_EXPONENTIATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.lua.lua.impl.Expression_CallMemberFunctionImpl <em>Expression Call Member Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.lua.lua.impl.Expression_CallMemberFunctionImpl
   * @see org.xtext.lua.lua.impl.LuaPackageImpl#getExpression_CallMemberFunction()
   * @generated
   */
  int EXPRESSION_CALL_MEMBER_FUNCTION = 54;

  /**
   * The feature id for the '<em><b>Object</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_CALL_MEMBER_FUNCTION__OBJECT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Member Function Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_CALL_MEMBER_FUNCTION__MEMBER_FUNCTION_NAME = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_CALL_MEMBER_FUNCTION__ARGUMENTS = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Expression Call Member Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_CALL_MEMBER_FUNCTION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.lua.lua.impl.Expression_CallFunctionImpl <em>Expression Call Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.lua.lua.impl.Expression_CallFunctionImpl
   * @see org.xtext.lua.lua.impl.LuaPackageImpl#getExpression_CallFunction()
   * @generated
   */
  int EXPRESSION_CALL_FUNCTION = 55;

  /**
   * The feature id for the '<em><b>Object</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_CALL_FUNCTION__OBJECT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_CALL_FUNCTION__ARGUMENTS = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Expression Call Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_CALL_FUNCTION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.lua.lua.impl.Expression_AccessArrayImpl <em>Expression Access Array</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.lua.lua.impl.Expression_AccessArrayImpl
   * @see org.xtext.lua.lua.impl.LuaPackageImpl#getExpression_AccessArray()
   * @generated
   */
  int EXPRESSION_ACCESS_ARRAY = 56;

  /**
   * The feature id for the '<em><b>Array</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_ACCESS_ARRAY__ARRAY = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_ACCESS_ARRAY__INDEX = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Expression Access Array</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_ACCESS_ARRAY_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.lua.lua.impl.Expression_AccessMemberImpl <em>Expression Access Member</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.lua.lua.impl.Expression_AccessMemberImpl
   * @see org.xtext.lua.lua.impl.LuaPackageImpl#getExpression_AccessMember()
   * @generated
   */
  int EXPRESSION_ACCESS_MEMBER = 57;

  /**
   * The feature id for the '<em><b>Object</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_ACCESS_MEMBER__OBJECT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Member Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_ACCESS_MEMBER__MEMBER_NAME = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Expression Access Member</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_ACCESS_MEMBER_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.lua.lua.impl.Expression_VariableNameImpl <em>Expression Variable Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.lua.lua.impl.Expression_VariableNameImpl
   * @see org.xtext.lua.lua.impl.LuaPackageImpl#getExpression_VariableName()
   * @generated
   */
  int EXPRESSION_VARIABLE_NAME = 58;

  /**
   * The feature id for the '<em><b>Variable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_VARIABLE_NAME__VARIABLE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Expression Variable Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_VARIABLE_NAME_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link org.xtext.lua.lua.Chunk <em>Chunk</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Chunk</em>'.
   * @see org.xtext.lua.lua.Chunk
   * @generated
   */
  EClass getChunk();

  /**
   * Returns the meta object for class '{@link org.xtext.lua.lua.Block <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Block</em>'.
   * @see org.xtext.lua.lua.Block
   * @generated
   */
  EClass getBlock();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.lua.lua.Block#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see org.xtext.lua.lua.Block#getStatements()
   * @see #getBlock()
   * @generated
   */
  EReference getBlock_Statements();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.lua.lua.Block#getReturnValue <em>Return Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Return Value</em>'.
   * @see org.xtext.lua.lua.Block#getReturnValue()
   * @see #getBlock()
   * @generated
   */
  EReference getBlock_ReturnValue();

  /**
   * Returns the meta object for class '{@link org.xtext.lua.lua.LastStatement <em>Last Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Last Statement</em>'.
   * @see org.xtext.lua.lua.LastStatement
   * @generated
   */
  EClass getLastStatement();

  /**
   * Returns the meta object for class '{@link org.xtext.lua.lua.LastStatement_Return <em>Last Statement Return</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Last Statement Return</em>'.
   * @see org.xtext.lua.lua.LastStatement_Return
   * @generated
   */
  EClass getLastStatement_Return();

  /**
   * Returns the meta object for class '{@link org.xtext.lua.lua.LastStatement_Break <em>Last Statement Break</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Last Statement Break</em>'.
   * @see org.xtext.lua.lua.LastStatement_Break
   * @generated
   */
  EClass getLastStatement_Break();

  /**
   * Returns the meta object for class '{@link org.xtext.lua.lua.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement</em>'.
   * @see org.xtext.lua.lua.Statement
   * @generated
   */
  EClass getStatement();

  /**
   * Returns the meta object for class '{@link org.xtext.lua.lua.Statement_Block <em>Statement Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement Block</em>'.
   * @see org.xtext.lua.lua.Statement_Block
   * @generated
   */
  EClass getStatement_Block();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.lua.lua.Statement_Block#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see org.xtext.lua.lua.Statement_Block#getBlock()
   * @see #getStatement_Block()
   * @generated
   */
  EReference getStatement_Block_Block();

  /**
   * Returns the meta object for class '{@link org.xtext.lua.lua.Statement_While <em>Statement While</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement While</em>'.
   * @see org.xtext.lua.lua.Statement_While
   * @generated
   */
  EClass getStatement_While();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.lua.lua.Statement_While#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.lua.lua.Statement_While#getExpression()
   * @see #getStatement_While()
   * @generated
   */
  EReference getStatement_While_Expression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.lua.lua.Statement_While#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see org.xtext.lua.lua.Statement_While#getBlock()
   * @see #getStatement_While()
   * @generated
   */
  EReference getStatement_While_Block();

  /**
   * Returns the meta object for class '{@link org.xtext.lua.lua.Statement_Repeat <em>Statement Repeat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement Repeat</em>'.
   * @see org.xtext.lua.lua.Statement_Repeat
   * @generated
   */
  EClass getStatement_Repeat();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.lua.lua.Statement_Repeat#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see org.xtext.lua.lua.Statement_Repeat#getBlock()
   * @see #getStatement_Repeat()
   * @generated
   */
  EReference getStatement_Repeat_Block();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.lua.lua.Statement_Repeat#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.lua.lua.Statement_Repeat#getExpression()
   * @see #getStatement_Repeat()
   * @generated
   */
  EReference getStatement_Repeat_Expression();

  /**
   * Returns the meta object for class '{@link org.xtext.lua.lua.Statement_If_Then_Else <em>Statement If Then Else</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement If Then Else</em>'.
   * @see org.xtext.lua.lua.Statement_If_Then_Else
   * @generated
   */
  EClass getStatement_If_Then_Else();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.lua.lua.Statement_If_Then_Else#getIfExpression <em>If Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>If Expression</em>'.
   * @see org.xtext.lua.lua.Statement_If_Then_Else#getIfExpression()
   * @see #getStatement_If_Then_Else()
   * @generated
   */
  EReference getStatement_If_Then_Else_IfExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.lua.lua.Statement_If_Then_Else#getIfBlock <em>If Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>If Block</em>'.
   * @see org.xtext.lua.lua.Statement_If_Then_Else#getIfBlock()
   * @see #getStatement_If_Then_Else()
   * @generated
   */
  EReference getStatement_If_Then_Else_IfBlock();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.lua.lua.Statement_If_Then_Else#getElseIf <em>Else If</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Else If</em>'.
   * @see org.xtext.lua.lua.Statement_If_Then_Else#getElseIf()
   * @see #getStatement_If_Then_Else()
   * @generated
   */
  EReference getStatement_If_Then_Else_ElseIf();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.lua.lua.Statement_If_Then_Else#getElseBlock <em>Else Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Else Block</em>'.
   * @see org.xtext.lua.lua.Statement_If_Then_Else#getElseBlock()
   * @see #getStatement_If_Then_Else()
   * @generated
   */
  EReference getStatement_If_Then_Else_ElseBlock();

  /**
   * Returns the meta object for class '{@link org.xtext.lua.lua.Statement_If_Then_Else_ElseIfPart <em>Statement If Then Else Else If Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement If Then Else Else If Part</em>'.
   * @see org.xtext.lua.lua.Statement_If_Then_Else_ElseIfPart
   * @generated
   */
  EClass getStatement_If_Then_Else_ElseIfPart();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.lua.lua.Statement_If_Then_Else_ElseIfPart#getElseifExpression <em>Elseif Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Elseif Expression</em>'.
   * @see org.xtext.lua.lua.Statement_If_Then_Else_ElseIfPart#getElseifExpression()
   * @see #getStatement_If_Then_Else_ElseIfPart()
   * @generated
   */
  EReference getStatement_If_Then_Else_ElseIfPart_ElseifExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.lua.lua.Statement_If_Then_Else_ElseIfPart#getElseifBlock <em>Elseif Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Elseif Block</em>'.
   * @see org.xtext.lua.lua.Statement_If_Then_Else_ElseIfPart#getElseifBlock()
   * @see #getStatement_If_Then_Else_ElseIfPart()
   * @generated
   */
  EReference getStatement_If_Then_Else_ElseIfPart_ElseifBlock();

  /**
   * Returns the meta object for class '{@link org.xtext.lua.lua.Statement_For_Numeric <em>Statement For Numeric</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement For Numeric</em>'.
   * @see org.xtext.lua.lua.Statement_For_Numeric
   * @generated
   */
  EClass getStatement_For_Numeric();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.lua.lua.Statement_For_Numeric#getIteratorName <em>Iterator Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Iterator Name</em>'.
   * @see org.xtext.lua.lua.Statement_For_Numeric#getIteratorName()
   * @see #getStatement_For_Numeric()
   * @generated
   */
  EAttribute getStatement_For_Numeric_IteratorName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.lua.lua.Statement_For_Numeric#getStartExpr <em>Start Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Start Expr</em>'.
   * @see org.xtext.lua.lua.Statement_For_Numeric#getStartExpr()
   * @see #getStatement_For_Numeric()
   * @generated
   */
  EReference getStatement_For_Numeric_StartExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.lua.lua.Statement_For_Numeric#getUntilExpr <em>Until Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Until Expr</em>'.
   * @see org.xtext.lua.lua.Statement_For_Numeric#getUntilExpr()
   * @see #getStatement_For_Numeric()
   * @generated
   */
  EReference getStatement_For_Numeric_UntilExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.lua.lua.Statement_For_Numeric#getStepExpr <em>Step Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Step Expr</em>'.
   * @see org.xtext.lua.lua.Statement_For_Numeric#getStepExpr()
   * @see #getStatement_For_Numeric()
   * @generated
   */
  EReference getStatement_For_Numeric_StepExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.lua.lua.Statement_For_Numeric#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see org.xtext.lua.lua.Statement_For_Numeric#getBlock()
   * @see #getStatement_For_Numeric()
   * @generated
   */
  EReference getStatement_For_Numeric_Block();

  /**
   * Returns the meta object for class '{@link org.xtext.lua.lua.Statement_For_Generic <em>Statement For Generic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement For Generic</em>'.
   * @see org.xtext.lua.lua.Statement_For_Generic
   * @generated
   */
  EClass getStatement_For_Generic();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.lua.lua.Statement_For_Generic#getNames <em>Names</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Names</em>'.
   * @see org.xtext.lua.lua.Statement_For_Generic#getNames()
   * @see #getStatement_For_Generic()
   * @generated
   */
  EAttribute getStatement_For_Generic_Names();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.lua.lua.Statement_For_Generic#getExpressions <em>Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expressions</em>'.
   * @see org.xtext.lua.lua.Statement_For_Generic#getExpressions()
   * @see #getStatement_For_Generic()
   * @generated
   */
  EReference getStatement_For_Generic_Expressions();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.lua.lua.Statement_For_Generic#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see org.xtext.lua.lua.Statement_For_Generic#getBlock()
   * @see #getStatement_For_Generic()
   * @generated
   */
  EReference getStatement_For_Generic_Block();

  /**
   * Returns the meta object for class '{@link org.xtext.lua.lua.Statement_GlobalFunction_Declaration <em>Statement Global Function Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement Global Function Declaration</em>'.
   * @see org.xtext.lua.lua.Statement_GlobalFunction_Declaration
   * @generated
   */
  EClass getStatement_GlobalFunction_Declaration();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.lua.lua.Statement_GlobalFunction_Declaration#getPrefix <em>Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Prefix</em>'.
   * @see org.xtext.lua.lua.Statement_GlobalFunction_Declaration#getPrefix()
   * @see #getStatement_GlobalFunction_Declaration()
   * @generated
   */
  EAttribute getStatement_GlobalFunction_Declaration_Prefix();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.lua.lua.Statement_GlobalFunction_Declaration#getFunctionName <em>Function Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Function Name</em>'.
   * @see org.xtext.lua.lua.Statement_GlobalFunction_Declaration#getFunctionName()
   * @see #getStatement_GlobalFunction_Declaration()
   * @generated
   */
  EAttribute getStatement_GlobalFunction_Declaration_FunctionName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.lua.lua.Statement_GlobalFunction_Declaration#getFunction <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Function</em>'.
   * @see org.xtext.lua.lua.Statement_GlobalFunction_Declaration#getFunction()
   * @see #getStatement_GlobalFunction_Declaration()
   * @generated
   */
  EReference getStatement_GlobalFunction_Declaration_Function();

  /**
   * Returns the meta object for class '{@link org.xtext.lua.lua.Statement_LocalFunction_Declaration <em>Statement Local Function Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement Local Function Declaration</em>'.
   * @see org.xtext.lua.lua.Statement_LocalFunction_Declaration
   * @generated
   */
  EClass getStatement_LocalFunction_Declaration();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.lua.lua.Statement_LocalFunction_Declaration#getFunctionName <em>Function Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Function Name</em>'.
   * @see org.xtext.lua.lua.Statement_LocalFunction_Declaration#getFunctionName()
   * @see #getStatement_LocalFunction_Declaration()
   * @generated
   */
  EAttribute getStatement_LocalFunction_Declaration_FunctionName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.lua.lua.Statement_LocalFunction_Declaration#getFunction <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Function</em>'.
   * @see org.xtext.lua.lua.Statement_LocalFunction_Declaration#getFunction()
   * @see #getStatement_LocalFunction_Declaration()
   * @generated
   */
  EReference getStatement_LocalFunction_Declaration_Function();

  /**
   * Returns the meta object for class '{@link org.xtext.lua.lua.Statement_Local_Variable_Declaration <em>Statement Local Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement Local Variable Declaration</em>'.
   * @see org.xtext.lua.lua.Statement_Local_Variable_Declaration
   * @generated
   */
  EClass getStatement_Local_Variable_Declaration();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.lua.lua.Statement_Local_Variable_Declaration#getVariableNames <em>Variable Names</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Variable Names</em>'.
   * @see org.xtext.lua.lua.Statement_Local_Variable_Declaration#getVariableNames()
   * @see #getStatement_Local_Variable_Declaration()
   * @generated
   */
  EAttribute getStatement_Local_Variable_Declaration_VariableNames();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.lua.lua.Statement_Local_Variable_Declaration#getInitialValue <em>Initial Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Initial Value</em>'.
   * @see org.xtext.lua.lua.Statement_Local_Variable_Declaration#getInitialValue()
   * @see #getStatement_Local_Variable_Declaration()
   * @generated
   */
  EReference getStatement_Local_Variable_Declaration_InitialValue();

  /**
   * Returns the meta object for class '{@link org.xtext.lua.lua.Statement_FunctioncallOrAssignment <em>Statement Functioncall Or Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement Functioncall Or Assignment</em>'.
   * @see org.xtext.lua.lua.Statement_FunctioncallOrAssignment
   * @generated
   */
  EClass getStatement_FunctioncallOrAssignment();

  /**
   * Returns the meta object for class '{@link org.xtext.lua.lua.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see org.xtext.lua.lua.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link org.xtext.lua.lua.Expression_Nil <em>Expression Nil</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression Nil</em>'.
   * @see org.xtext.lua.lua.Expression_Nil
   * @generated
   */
  EClass getExpression_Nil();

  /**
   * Returns the meta object for class '{@link org.xtext.lua.lua.Expression_True <em>Expression True</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression True</em>'.
   * @see org.xtext.lua.lua.Expression_True
   * @generated
   */
  EClass getExpression_True();

  /**
   * Returns the meta object for class '{@link org.xtext.lua.lua.Expression_False <em>Expression False</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression False</em>'.
   * @see org.xtext.lua.lua.Expression_False
   * @generated
   */
  EClass getExpression_False();

  /**
   * Returns the meta object for class '{@link org.xtext.lua.lua.Expression_Number <em>Expression Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression Number</em>'.
   * @see org.xtext.lua.lua.Expression_Number
   * @generated
   */
  EClass getExpression_Number();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.lua.lua.Expression_Number#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.lua.lua.Expression_Number#getValue()
   * @see #getExpression_Number()
   * @generated
   */
  EAttribute getExpression_Number_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.lua.lua.Expression_VarArgs <em>Expression Var Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression Var Args</em>'.
   * @see org.xtext.lua.lua.Expression_VarArgs
   * @generated
   */
  EClass getExpression_VarArgs();

  /**
   * Returns the meta object for class '{@link org.xtext.lua.lua.Expression_String <em>Expression String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression String</em>'.
   * @see org.xtext.lua.lua.Expression_String
   * @generated
   */
  EClass getExpression_String();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.lua.lua.Expression_String#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.lua.lua.Expression_String#getValue()
   * @see #getExpression_String()
   * @generated
   */
  EAttribute getExpression_String_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.lua.lua.Expression_Function <em>Expression Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression Function</em>'.
   * @see org.xtext.lua.lua.Expression_Function
   * @generated
   */
  EClass getExpression_Function();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.lua.lua.Expression_Function#getFunction <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Function</em>'.
   * @see org.xtext.lua.lua.Expression_Function#getFunction()
   * @see #getExpression_Function()
   * @generated
   */
  EReference getExpression_Function_Function();

  /**
   * Returns the meta object for class '{@link org.xtext.lua.lua.Expression_TableConstructor <em>Expression Table Constructor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression Table Constructor</em>'.
   * @see org.xtext.lua.lua.Expression_TableConstructor
   * @generated
   */
  EClass getExpression_TableConstructor();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.lua.lua.Expression_TableConstructor#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fields</em>'.
   * @see org.xtext.lua.lua.Expression_TableConstructor#getFields()
   * @see #getExpression_TableConstructor()
   * @generated
   */
  EReference getExpression_TableConstructor_Fields();

  /**
   * Returns the meta object for class '{@link org.xtext.lua.lua.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function</em>'.
   * @see org.xtext.lua.lua.Function
   * @generated
   */
  EClass getFunction();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.lua.lua.Function#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Parameters</em>'.
   * @see org.xtext.lua.lua.Function#getParameters()
   * @see #getFunction()
   * @generated
   */
  EAttribute getFunction_Parameters();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.lua.lua.Function#isVarArgs <em>Var Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Var Args</em>'.
   * @see org.xtext.lua.lua.Function#isVarArgs()
   * @see #getFunction()
   * @generated
   */
  EAttribute getFunction_VarArgs();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.lua.lua.Function#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see org.xtext.lua.lua.Function#getBody()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_Body();

  /**
   * Returns the meta object for class '{@link org.xtext.lua.lua.Functioncall_Arguments <em>Functioncall Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Functioncall Arguments</em>'.
   * @see org.xtext.lua.lua.Functioncall_Arguments
   * @generated
   */
  EClass getFunctioncall_Arguments();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.lua.lua.Functioncall_Arguments#getArguments <em>Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Arguments</em>'.
   * @see org.xtext.lua.lua.Functioncall_Arguments#getArguments()
   * @see #getFunctioncall_Arguments()
   * @generated
   */
  EReference getFunctioncall_Arguments_Arguments();

  /**
   * Returns the meta object for class '{@link org.xtext.lua.lua.Field <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field</em>'.
   * @see org.xtext.lua.lua.Field
   * @generated
   */
  EClass getField();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.lua.lua.Field#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.xtext.lua.lua.Field#getValue()
   * @see #getField()
   * @generated
   */
  EReference getField_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.lua.lua.Field_AddEntryToTable_Brackets <em>Field Add Entry To Table Brackets</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field Add Entry To Table Brackets</em>'.
   * @see org.xtext.lua.lua.Field_AddEntryToTable_Brackets
   * @generated
   */
  EClass getField_AddEntryToTable_Brackets();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.lua.lua.Field_AddEntryToTable_Brackets#getIndexExpression <em>Index Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Index Expression</em>'.
   * @see org.xtext.lua.lua.Field_AddEntryToTable_Brackets#getIndexExpression()
   * @see #getField_AddEntryToTable_Brackets()
   * @generated
   */
  EReference getField_AddEntryToTable_Brackets_IndexExpression();

  /**
   * Returns the meta object for class '{@link org.xtext.lua.lua.Field_AddEntryToTable <em>Field Add Entry To Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field Add Entry To Table</em>'.
   * @see org.xtext.lua.lua.Field_AddEntryToTable
   * @generated
   */
  EClass getField_AddEntryToTable();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.lua.lua.Field_AddEntryToTable#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key</em>'.
   * @see org.xtext.lua.lua.Field_AddEntryToTable#getKey()
   * @see #getField_AddEntryToTable()
   * @generated
   */
  EAttribute getField_AddEntryToTable_Key();

  /**
   * Returns the meta object for class '{@link org.xtext.lua.lua.Field_AppendEntryToTable <em>Field Append Entry To Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field Append Entry To Table</em>'.
   * @see org.xtext.lua.lua.Field_AppendEntryToTable
   * @generated
   */
  EClass getField_AppendEntryToTable();

  /**
   * Returns the meta object for class '{@link org.xtext.lua.lua.LastStatement_ReturnWithValue <em>Last Statement Return With Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Last Statement Return With Value</em>'.
   * @see org.xtext.lua.lua.LastStatement_ReturnWithValue
   * @generated
   */
  EClass getLastStatement_ReturnWithValue();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.lua.lua.LastStatement_ReturnWithValue#getReturnValues <em>Return Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Return Values</em>'.
   * @see org.xtext.lua.lua.LastStatement_ReturnWithValue#getReturnValues()
   * @see #getLastStatement_ReturnWithValue()
   * @generated
   */
  EReference getLastStatement_ReturnWithValue_ReturnValues();

  /**
   * Returns the meta object for class '{@link org.xtext.lua.lua.Statement_Assignment <em>Statement Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement Assignment</em>'.
   * @see org.xtext.lua.lua.Statement_Assignment
   * @generated
   */
  EClass getStatement_Assignment();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.lua.lua.Statement_Assignment#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variable</em>'.
   * @see org.xtext.lua.lua.Statement_Assignment#getVariable()
   * @see #getStatement_Assignment()
   * @generated
   */
  EReference getStatement_Assignment_Variable();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.lua.lua.Statement_Assignment#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see org.xtext.lua.lua.Statement_Assignment#getValues()
   * @see #getStatement_Assignment()
   * @generated
   */
  EReference getStatement_Assignment_Values();

  /**
   * Returns the meta object for class '{@link org.xtext.lua.lua.Statement_CallMemberFunction <em>Statement Call Member Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement Call Member Function</em>'.
   * @see org.xtext.lua.lua.Statement_CallMemberFunction
   * @generated
   */
  EClass getStatement_CallMemberFunction();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.lua.lua.Statement_CallMemberFunction#getObject <em>Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object</em>'.
   * @see org.xtext.lua.lua.Statement_CallMemberFunction#getObject()
   * @see #getStatement_CallMemberFunction()
   * @generated
   */
  EReference getStatement_CallMemberFunction_Object();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.lua.lua.Statement_CallMemberFunction#getMemberFunctionName <em>Member Function Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Member Function Name</em>'.
   * @see org.xtext.lua.lua.Statement_CallMemberFunction#getMemberFunctionName()
   * @see #getStatement_CallMemberFunction()
   * @generated
   */
  EAttribute getStatement_CallMemberFunction_MemberFunctionName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.lua.lua.Statement_CallMemberFunction#getArguments <em>Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Arguments</em>'.
   * @see org.xtext.lua.lua.Statement_CallMemberFunction#getArguments()
   * @see #getStatement_CallMemberFunction()
   * @generated
   */
  EReference getStatement_CallMemberFunction_Arguments();

  /**
   * Returns the meta object for class '{@link org.xtext.lua.lua.Statement_CallFunction <em>Statement Call Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement Call Function</em>'.
   * @see org.xtext.lua.lua.Statement_CallFunction
   * @generated
   */
  EClass getStatement_CallFunction();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.lua.lua.Statement_CallFunction#getObject <em>Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object</em>'.
   * @see org.xtext.lua.lua.Statement_CallFunction#getObject()
   * @see #getStatement_CallFunction()
   * @generated
   */
  EReference getStatement_CallFunction_Object();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.lua.lua.Statement_CallFunction#getArguments <em>Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Arguments</em>'.
   * @see org.xtext.lua.lua.Statement_CallFunction#getArguments()
   * @see #getStatement_CallFunction()
   * @generated
   */
  EReference getStatement_CallFunction_Arguments();

  /**
   * Returns the meta object for class '{@link org.xtext.lua.lua.Expression_Or <em>Expression Or</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression Or</em>'.
   * @see org.xtext.lua.lua.Expression_Or
   * @generated
   */
  EClass getExpression_Or();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.lua.lua.Expression_Or#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.lua.lua.Expression_Or#getLeft()
   * @see #getExpression_Or()
   * @generated
   */
  EReference getExpression_Or_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.lua.lua.Expression_Or#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.lua.lua.Expression_Or#getRight()
   * @see #getExpression_Or()
   * @generated
   */
  EReference getExpression_Or_Right();

  /**
   * Returns the meta object for class '{@link org.xtext.lua.lua.Expression_And <em>Expression And</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression And</em>'.
   * @see org.xtext.lua.lua.Expression_And
   * @generated
   */
  EClass getExpression_And();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.lua.lua.Expression_And#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.lua.lua.Expression_And#getLeft()
   * @see #getExpression_And()
   * @generated
   */
  EReference getExpression_And_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.lua.lua.Expression_And#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.lua.lua.Expression_And#getRight()
   * @see #getExpression_And()
   * @generated
   */
  EReference getExpression_And_Right();

  /**
   * Returns the meta object for class '{@link org.xtext.lua.lua.Expression_Larger <em>Expression Larger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression Larger</em>'.
   * @see org.xtext.lua.lua.Expression_Larger
   * @generated
   */
  EClass getExpression_Larger();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.lua.lua.Expression_Larger#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.lua.lua.Expression_Larger#getLeft()
   * @see #getExpression_Larger()
   * @generated
   */
  EReference getExpression_Larger_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.lua.lua.Expression_Larger#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.lua.lua.Expression_Larger#getRight()
   * @see #getExpression_Larger()
   * @generated
   */
  EReference getExpression_Larger_Right();

  /**
   * Returns the meta object for class '{@link org.xtext.lua.lua.Expression_Larger_Equal <em>Expression Larger Equal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression Larger Equal</em>'.
   * @see org.xtext.lua.lua.Expression_Larger_Equal
   * @generated
   */
  EClass getExpression_Larger_Equal();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.lua.lua.Expression_Larger_Equal#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.lua.lua.Expression_Larger_Equal#getLeft()
   * @see #getExpression_Larger_Equal()
   * @generated
   */
  EReference getExpression_Larger_Equal_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.lua.lua.Expression_Larger_Equal#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.lua.lua.Expression_Larger_Equal#getRight()
   * @see #getExpression_Larger_Equal()
   * @generated
   */
  EReference getExpression_Larger_Equal_Right();

  /**
   * Returns the meta object for class '{@link org.xtext.lua.lua.Expression_Smaller <em>Expression Smaller</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression Smaller</em>'.
   * @see org.xtext.lua.lua.Expression_Smaller
   * @generated
   */
  EClass getExpression_Smaller();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.lua.lua.Expression_Smaller#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.lua.lua.Expression_Smaller#getLeft()
   * @see #getExpression_Smaller()
   * @generated
   */
  EReference getExpression_Smaller_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.lua.lua.Expression_Smaller#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.lua.lua.Expression_Smaller#getRight()
   * @see #getExpression_Smaller()
   * @generated
   */
  EReference getExpression_Smaller_Right();

  /**
   * Returns the meta object for class '{@link org.xtext.lua.lua.Expression_Smaller_Equal <em>Expression Smaller Equal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression Smaller Equal</em>'.
   * @see org.xtext.lua.lua.Expression_Smaller_Equal
   * @generated
   */
  EClass getExpression_Smaller_Equal();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.lua.lua.Expression_Smaller_Equal#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.lua.lua.Expression_Smaller_Equal#getLeft()
   * @see #getExpression_Smaller_Equal()
   * @generated
   */
  EReference getExpression_Smaller_Equal_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.lua.lua.Expression_Smaller_Equal#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.lua.lua.Expression_Smaller_Equal#getRight()
   * @see #getExpression_Smaller_Equal()
   * @generated
   */
  EReference getExpression_Smaller_Equal_Right();

  /**
   * Returns the meta object for class '{@link org.xtext.lua.lua.Expression_Equal <em>Expression Equal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression Equal</em>'.
   * @see org.xtext.lua.lua.Expression_Equal
   * @generated
   */
  EClass getExpression_Equal();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.lua.lua.Expression_Equal#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.lua.lua.Expression_Equal#getLeft()
   * @see #getExpression_Equal()
   * @generated
   */
  EReference getExpression_Equal_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.lua.lua.Expression_Equal#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.lua.lua.Expression_Equal#getRight()
   * @see #getExpression_Equal()
   * @generated
   */
  EReference getExpression_Equal_Right();

  /**
   * Returns the meta object for class '{@link org.xtext.lua.lua.Expression_Not_Equal <em>Expression Not Equal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression Not Equal</em>'.
   * @see org.xtext.lua.lua.Expression_Not_Equal
   * @generated
   */
  EClass getExpression_Not_Equal();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.lua.lua.Expression_Not_Equal#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.lua.lua.Expression_Not_Equal#getLeft()
   * @see #getExpression_Not_Equal()
   * @generated
   */
  EReference getExpression_Not_Equal_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.lua.lua.Expression_Not_Equal#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.lua.lua.Expression_Not_Equal#getRight()
   * @see #getExpression_Not_Equal()
   * @generated
   */
  EReference getExpression_Not_Equal_Right();

  /**
   * Returns the meta object for class '{@link org.xtext.lua.lua.Expression_Concatenation <em>Expression Concatenation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression Concatenation</em>'.
   * @see org.xtext.lua.lua.Expression_Concatenation
   * @generated
   */
  EClass getExpression_Concatenation();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.lua.lua.Expression_Concatenation#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.lua.lua.Expression_Concatenation#getLeft()
   * @see #getExpression_Concatenation()
   * @generated
   */
  EReference getExpression_Concatenation_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.lua.lua.Expression_Concatenation#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.lua.lua.Expression_Concatenation#getRight()
   * @see #getExpression_Concatenation()
   * @generated
   */
  EReference getExpression_Concatenation_Right();

  /**
   * Returns the meta object for class '{@link org.xtext.lua.lua.Expression_Plus <em>Expression Plus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression Plus</em>'.
   * @see org.xtext.lua.lua.Expression_Plus
   * @generated
   */
  EClass getExpression_Plus();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.lua.lua.Expression_Plus#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.lua.lua.Expression_Plus#getLeft()
   * @see #getExpression_Plus()
   * @generated
   */
  EReference getExpression_Plus_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.lua.lua.Expression_Plus#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.lua.lua.Expression_Plus#getRight()
   * @see #getExpression_Plus()
   * @generated
   */
  EReference getExpression_Plus_Right();

  /**
   * Returns the meta object for class '{@link org.xtext.lua.lua.Expression_Minus <em>Expression Minus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression Minus</em>'.
   * @see org.xtext.lua.lua.Expression_Minus
   * @generated
   */
  EClass getExpression_Minus();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.lua.lua.Expression_Minus#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.lua.lua.Expression_Minus#getLeft()
   * @see #getExpression_Minus()
   * @generated
   */
  EReference getExpression_Minus_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.lua.lua.Expression_Minus#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.lua.lua.Expression_Minus#getRight()
   * @see #getExpression_Minus()
   * @generated
   */
  EReference getExpression_Minus_Right();

  /**
   * Returns the meta object for class '{@link org.xtext.lua.lua.Expression_Multiplication <em>Expression Multiplication</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression Multiplication</em>'.
   * @see org.xtext.lua.lua.Expression_Multiplication
   * @generated
   */
  EClass getExpression_Multiplication();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.lua.lua.Expression_Multiplication#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.lua.lua.Expression_Multiplication#getLeft()
   * @see #getExpression_Multiplication()
   * @generated
   */
  EReference getExpression_Multiplication_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.lua.lua.Expression_Multiplication#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.lua.lua.Expression_Multiplication#getRight()
   * @see #getExpression_Multiplication()
   * @generated
   */
  EReference getExpression_Multiplication_Right();

  /**
   * Returns the meta object for class '{@link org.xtext.lua.lua.Expression_Division <em>Expression Division</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression Division</em>'.
   * @see org.xtext.lua.lua.Expression_Division
   * @generated
   */
  EClass getExpression_Division();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.lua.lua.Expression_Division#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.lua.lua.Expression_Division#getLeft()
   * @see #getExpression_Division()
   * @generated
   */
  EReference getExpression_Division_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.lua.lua.Expression_Division#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.lua.lua.Expression_Division#getRight()
   * @see #getExpression_Division()
   * @generated
   */
  EReference getExpression_Division_Right();

  /**
   * Returns the meta object for class '{@link org.xtext.lua.lua.Expression_Modulo <em>Expression Modulo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression Modulo</em>'.
   * @see org.xtext.lua.lua.Expression_Modulo
   * @generated
   */
  EClass getExpression_Modulo();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.lua.lua.Expression_Modulo#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.lua.lua.Expression_Modulo#getLeft()
   * @see #getExpression_Modulo()
   * @generated
   */
  EReference getExpression_Modulo_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.lua.lua.Expression_Modulo#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.lua.lua.Expression_Modulo#getRight()
   * @see #getExpression_Modulo()
   * @generated
   */
  EReference getExpression_Modulo_Right();

  /**
   * Returns the meta object for class '{@link org.xtext.lua.lua.Expression_Negate <em>Expression Negate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression Negate</em>'.
   * @see org.xtext.lua.lua.Expression_Negate
   * @generated
   */
  EClass getExpression_Negate();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.lua.lua.Expression_Negate#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see org.xtext.lua.lua.Expression_Negate#getExp()
   * @see #getExpression_Negate()
   * @generated
   */
  EReference getExpression_Negate_Exp();

  /**
   * Returns the meta object for class '{@link org.xtext.lua.lua.Expression_Length <em>Expression Length</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression Length</em>'.
   * @see org.xtext.lua.lua.Expression_Length
   * @generated
   */
  EClass getExpression_Length();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.lua.lua.Expression_Length#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see org.xtext.lua.lua.Expression_Length#getExp()
   * @see #getExpression_Length()
   * @generated
   */
  EReference getExpression_Length_Exp();

  /**
   * Returns the meta object for class '{@link org.xtext.lua.lua.Expression_Invert <em>Expression Invert</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression Invert</em>'.
   * @see org.xtext.lua.lua.Expression_Invert
   * @generated
   */
  EClass getExpression_Invert();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.lua.lua.Expression_Invert#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see org.xtext.lua.lua.Expression_Invert#getExp()
   * @see #getExpression_Invert()
   * @generated
   */
  EReference getExpression_Invert_Exp();

  /**
   * Returns the meta object for class '{@link org.xtext.lua.lua.Expression_Exponentiation <em>Expression Exponentiation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression Exponentiation</em>'.
   * @see org.xtext.lua.lua.Expression_Exponentiation
   * @generated
   */
  EClass getExpression_Exponentiation();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.lua.lua.Expression_Exponentiation#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.lua.lua.Expression_Exponentiation#getLeft()
   * @see #getExpression_Exponentiation()
   * @generated
   */
  EReference getExpression_Exponentiation_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.lua.lua.Expression_Exponentiation#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.lua.lua.Expression_Exponentiation#getRight()
   * @see #getExpression_Exponentiation()
   * @generated
   */
  EReference getExpression_Exponentiation_Right();

  /**
   * Returns the meta object for class '{@link org.xtext.lua.lua.Expression_CallMemberFunction <em>Expression Call Member Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression Call Member Function</em>'.
   * @see org.xtext.lua.lua.Expression_CallMemberFunction
   * @generated
   */
  EClass getExpression_CallMemberFunction();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.lua.lua.Expression_CallMemberFunction#getObject <em>Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object</em>'.
   * @see org.xtext.lua.lua.Expression_CallMemberFunction#getObject()
   * @see #getExpression_CallMemberFunction()
   * @generated
   */
  EReference getExpression_CallMemberFunction_Object();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.lua.lua.Expression_CallMemberFunction#getMemberFunctionName <em>Member Function Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Member Function Name</em>'.
   * @see org.xtext.lua.lua.Expression_CallMemberFunction#getMemberFunctionName()
   * @see #getExpression_CallMemberFunction()
   * @generated
   */
  EAttribute getExpression_CallMemberFunction_MemberFunctionName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.lua.lua.Expression_CallMemberFunction#getArguments <em>Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Arguments</em>'.
   * @see org.xtext.lua.lua.Expression_CallMemberFunction#getArguments()
   * @see #getExpression_CallMemberFunction()
   * @generated
   */
  EReference getExpression_CallMemberFunction_Arguments();

  /**
   * Returns the meta object for class '{@link org.xtext.lua.lua.Expression_CallFunction <em>Expression Call Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression Call Function</em>'.
   * @see org.xtext.lua.lua.Expression_CallFunction
   * @generated
   */
  EClass getExpression_CallFunction();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.lua.lua.Expression_CallFunction#getObject <em>Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object</em>'.
   * @see org.xtext.lua.lua.Expression_CallFunction#getObject()
   * @see #getExpression_CallFunction()
   * @generated
   */
  EReference getExpression_CallFunction_Object();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.lua.lua.Expression_CallFunction#getArguments <em>Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Arguments</em>'.
   * @see org.xtext.lua.lua.Expression_CallFunction#getArguments()
   * @see #getExpression_CallFunction()
   * @generated
   */
  EReference getExpression_CallFunction_Arguments();

  /**
   * Returns the meta object for class '{@link org.xtext.lua.lua.Expression_AccessArray <em>Expression Access Array</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression Access Array</em>'.
   * @see org.xtext.lua.lua.Expression_AccessArray
   * @generated
   */
  EClass getExpression_AccessArray();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.lua.lua.Expression_AccessArray#getArray <em>Array</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Array</em>'.
   * @see org.xtext.lua.lua.Expression_AccessArray#getArray()
   * @see #getExpression_AccessArray()
   * @generated
   */
  EReference getExpression_AccessArray_Array();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.lua.lua.Expression_AccessArray#getIndex <em>Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Index</em>'.
   * @see org.xtext.lua.lua.Expression_AccessArray#getIndex()
   * @see #getExpression_AccessArray()
   * @generated
   */
  EReference getExpression_AccessArray_Index();

  /**
   * Returns the meta object for class '{@link org.xtext.lua.lua.Expression_AccessMember <em>Expression Access Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression Access Member</em>'.
   * @see org.xtext.lua.lua.Expression_AccessMember
   * @generated
   */
  EClass getExpression_AccessMember();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.lua.lua.Expression_AccessMember#getObject <em>Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object</em>'.
   * @see org.xtext.lua.lua.Expression_AccessMember#getObject()
   * @see #getExpression_AccessMember()
   * @generated
   */
  EReference getExpression_AccessMember_Object();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.lua.lua.Expression_AccessMember#getMemberName <em>Member Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Member Name</em>'.
   * @see org.xtext.lua.lua.Expression_AccessMember#getMemberName()
   * @see #getExpression_AccessMember()
   * @generated
   */
  EAttribute getExpression_AccessMember_MemberName();

  /**
   * Returns the meta object for class '{@link org.xtext.lua.lua.Expression_VariableName <em>Expression Variable Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression Variable Name</em>'.
   * @see org.xtext.lua.lua.Expression_VariableName
   * @generated
   */
  EClass getExpression_VariableName();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.lua.lua.Expression_VariableName#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Variable</em>'.
   * @see org.xtext.lua.lua.Expression_VariableName#getVariable()
   * @see #getExpression_VariableName()
   * @generated
   */
  EAttribute getExpression_VariableName_Variable();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  LuaFactory getLuaFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.lua.lua.impl.ChunkImpl <em>Chunk</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.lua.lua.impl.ChunkImpl
     * @see org.xtext.lua.lua.impl.LuaPackageImpl#getChunk()
     * @generated
     */
    EClass CHUNK = eINSTANCE.getChunk();

    /**
     * The meta object literal for the '{@link org.xtext.lua.lua.impl.BlockImpl <em>Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.lua.lua.impl.BlockImpl
     * @see org.xtext.lua.lua.impl.LuaPackageImpl#getBlock()
     * @generated
     */
    EClass BLOCK = eINSTANCE.getBlock();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BLOCK__STATEMENTS = eINSTANCE.getBlock_Statements();

    /**
     * The meta object literal for the '<em><b>Return Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BLOCK__RETURN_VALUE = eINSTANCE.getBlock_ReturnValue();

    /**
     * The meta object literal for the '{@link org.xtext.lua.lua.impl.LastStatementImpl <em>Last Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.lua.lua.impl.LastStatementImpl
     * @see org.xtext.lua.lua.impl.LuaPackageImpl#getLastStatement()
     * @generated
     */
    EClass LAST_STATEMENT = eINSTANCE.getLastStatement();

    /**
     * The meta object literal for the '{@link org.xtext.lua.lua.impl.LastStatement_ReturnImpl <em>Last Statement Return</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.lua.lua.impl.LastStatement_ReturnImpl
     * @see org.xtext.lua.lua.impl.LuaPackageImpl#getLastStatement_Return()
     * @generated
     */
    EClass LAST_STATEMENT_RETURN = eINSTANCE.getLastStatement_Return();

    /**
     * The meta object literal for the '{@link org.xtext.lua.lua.impl.LastStatement_BreakImpl <em>Last Statement Break</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.lua.lua.impl.LastStatement_BreakImpl
     * @see org.xtext.lua.lua.impl.LuaPackageImpl#getLastStatement_Break()
     * @generated
     */
    EClass LAST_STATEMENT_BREAK = eINSTANCE.getLastStatement_Break();

    /**
     * The meta object literal for the '{@link org.xtext.lua.lua.impl.StatementImpl <em>Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.lua.lua.impl.StatementImpl
     * @see org.xtext.lua.lua.impl.LuaPackageImpl#getStatement()
     * @generated
     */
    EClass STATEMENT = eINSTANCE.getStatement();

    /**
     * The meta object literal for the '{@link org.xtext.lua.lua.impl.Statement_BlockImpl <em>Statement Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.lua.lua.impl.Statement_BlockImpl
     * @see org.xtext.lua.lua.impl.LuaPackageImpl#getStatement_Block()
     * @generated
     */
    EClass STATEMENT_BLOCK = eINSTANCE.getStatement_Block();

    /**
     * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT_BLOCK__BLOCK = eINSTANCE.getStatement_Block_Block();

    /**
     * The meta object literal for the '{@link org.xtext.lua.lua.impl.Statement_WhileImpl <em>Statement While</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.lua.lua.impl.Statement_WhileImpl
     * @see org.xtext.lua.lua.impl.LuaPackageImpl#getStatement_While()
     * @generated
     */
    EClass STATEMENT_WHILE = eINSTANCE.getStatement_While();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT_WHILE__EXPRESSION = eINSTANCE.getStatement_While_Expression();

    /**
     * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT_WHILE__BLOCK = eINSTANCE.getStatement_While_Block();

    /**
     * The meta object literal for the '{@link org.xtext.lua.lua.impl.Statement_RepeatImpl <em>Statement Repeat</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.lua.lua.impl.Statement_RepeatImpl
     * @see org.xtext.lua.lua.impl.LuaPackageImpl#getStatement_Repeat()
     * @generated
     */
    EClass STATEMENT_REPEAT = eINSTANCE.getStatement_Repeat();

    /**
     * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT_REPEAT__BLOCK = eINSTANCE.getStatement_Repeat_Block();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT_REPEAT__EXPRESSION = eINSTANCE.getStatement_Repeat_Expression();

    /**
     * The meta object literal for the '{@link org.xtext.lua.lua.impl.Statement_If_Then_ElseImpl <em>Statement If Then Else</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.lua.lua.impl.Statement_If_Then_ElseImpl
     * @see org.xtext.lua.lua.impl.LuaPackageImpl#getStatement_If_Then_Else()
     * @generated
     */
    EClass STATEMENT_IF_THEN_ELSE = eINSTANCE.getStatement_If_Then_Else();

    /**
     * The meta object literal for the '<em><b>If Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT_IF_THEN_ELSE__IF_EXPRESSION = eINSTANCE.getStatement_If_Then_Else_IfExpression();

    /**
     * The meta object literal for the '<em><b>If Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT_IF_THEN_ELSE__IF_BLOCK = eINSTANCE.getStatement_If_Then_Else_IfBlock();

    /**
     * The meta object literal for the '<em><b>Else If</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT_IF_THEN_ELSE__ELSE_IF = eINSTANCE.getStatement_If_Then_Else_ElseIf();

    /**
     * The meta object literal for the '<em><b>Else Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT_IF_THEN_ELSE__ELSE_BLOCK = eINSTANCE.getStatement_If_Then_Else_ElseBlock();

    /**
     * The meta object literal for the '{@link org.xtext.lua.lua.impl.Statement_If_Then_Else_ElseIfPartImpl <em>Statement If Then Else Else If Part</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.lua.lua.impl.Statement_If_Then_Else_ElseIfPartImpl
     * @see org.xtext.lua.lua.impl.LuaPackageImpl#getStatement_If_Then_Else_ElseIfPart()
     * @generated
     */
    EClass STATEMENT_IF_THEN_ELSE_ELSE_IF_PART = eINSTANCE.getStatement_If_Then_Else_ElseIfPart();

    /**
     * The meta object literal for the '<em><b>Elseif Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT_IF_THEN_ELSE_ELSE_IF_PART__ELSEIF_EXPRESSION = eINSTANCE.getStatement_If_Then_Else_ElseIfPart_ElseifExpression();

    /**
     * The meta object literal for the '<em><b>Elseif Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT_IF_THEN_ELSE_ELSE_IF_PART__ELSEIF_BLOCK = eINSTANCE.getStatement_If_Then_Else_ElseIfPart_ElseifBlock();

    /**
     * The meta object literal for the '{@link org.xtext.lua.lua.impl.Statement_For_NumericImpl <em>Statement For Numeric</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.lua.lua.impl.Statement_For_NumericImpl
     * @see org.xtext.lua.lua.impl.LuaPackageImpl#getStatement_For_Numeric()
     * @generated
     */
    EClass STATEMENT_FOR_NUMERIC = eINSTANCE.getStatement_For_Numeric();

    /**
     * The meta object literal for the '<em><b>Iterator Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATEMENT_FOR_NUMERIC__ITERATOR_NAME = eINSTANCE.getStatement_For_Numeric_IteratorName();

    /**
     * The meta object literal for the '<em><b>Start Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT_FOR_NUMERIC__START_EXPR = eINSTANCE.getStatement_For_Numeric_StartExpr();

    /**
     * The meta object literal for the '<em><b>Until Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT_FOR_NUMERIC__UNTIL_EXPR = eINSTANCE.getStatement_For_Numeric_UntilExpr();

    /**
     * The meta object literal for the '<em><b>Step Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT_FOR_NUMERIC__STEP_EXPR = eINSTANCE.getStatement_For_Numeric_StepExpr();

    /**
     * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT_FOR_NUMERIC__BLOCK = eINSTANCE.getStatement_For_Numeric_Block();

    /**
     * The meta object literal for the '{@link org.xtext.lua.lua.impl.Statement_For_GenericImpl <em>Statement For Generic</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.lua.lua.impl.Statement_For_GenericImpl
     * @see org.xtext.lua.lua.impl.LuaPackageImpl#getStatement_For_Generic()
     * @generated
     */
    EClass STATEMENT_FOR_GENERIC = eINSTANCE.getStatement_For_Generic();

    /**
     * The meta object literal for the '<em><b>Names</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATEMENT_FOR_GENERIC__NAMES = eINSTANCE.getStatement_For_Generic_Names();

    /**
     * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT_FOR_GENERIC__EXPRESSIONS = eINSTANCE.getStatement_For_Generic_Expressions();

    /**
     * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT_FOR_GENERIC__BLOCK = eINSTANCE.getStatement_For_Generic_Block();

    /**
     * The meta object literal for the '{@link org.xtext.lua.lua.impl.Statement_GlobalFunction_DeclarationImpl <em>Statement Global Function Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.lua.lua.impl.Statement_GlobalFunction_DeclarationImpl
     * @see org.xtext.lua.lua.impl.LuaPackageImpl#getStatement_GlobalFunction_Declaration()
     * @generated
     */
    EClass STATEMENT_GLOBAL_FUNCTION_DECLARATION = eINSTANCE.getStatement_GlobalFunction_Declaration();

    /**
     * The meta object literal for the '<em><b>Prefix</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATEMENT_GLOBAL_FUNCTION_DECLARATION__PREFIX = eINSTANCE.getStatement_GlobalFunction_Declaration_Prefix();

    /**
     * The meta object literal for the '<em><b>Function Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATEMENT_GLOBAL_FUNCTION_DECLARATION__FUNCTION_NAME = eINSTANCE.getStatement_GlobalFunction_Declaration_FunctionName();

    /**
     * The meta object literal for the '<em><b>Function</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT_GLOBAL_FUNCTION_DECLARATION__FUNCTION = eINSTANCE.getStatement_GlobalFunction_Declaration_Function();

    /**
     * The meta object literal for the '{@link org.xtext.lua.lua.impl.Statement_LocalFunction_DeclarationImpl <em>Statement Local Function Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.lua.lua.impl.Statement_LocalFunction_DeclarationImpl
     * @see org.xtext.lua.lua.impl.LuaPackageImpl#getStatement_LocalFunction_Declaration()
     * @generated
     */
    EClass STATEMENT_LOCAL_FUNCTION_DECLARATION = eINSTANCE.getStatement_LocalFunction_Declaration();

    /**
     * The meta object literal for the '<em><b>Function Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATEMENT_LOCAL_FUNCTION_DECLARATION__FUNCTION_NAME = eINSTANCE.getStatement_LocalFunction_Declaration_FunctionName();

    /**
     * The meta object literal for the '<em><b>Function</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT_LOCAL_FUNCTION_DECLARATION__FUNCTION = eINSTANCE.getStatement_LocalFunction_Declaration_Function();

    /**
     * The meta object literal for the '{@link org.xtext.lua.lua.impl.Statement_Local_Variable_DeclarationImpl <em>Statement Local Variable Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.lua.lua.impl.Statement_Local_Variable_DeclarationImpl
     * @see org.xtext.lua.lua.impl.LuaPackageImpl#getStatement_Local_Variable_Declaration()
     * @generated
     */
    EClass STATEMENT_LOCAL_VARIABLE_DECLARATION = eINSTANCE.getStatement_Local_Variable_Declaration();

    /**
     * The meta object literal for the '<em><b>Variable Names</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATEMENT_LOCAL_VARIABLE_DECLARATION__VARIABLE_NAMES = eINSTANCE.getStatement_Local_Variable_Declaration_VariableNames();

    /**
     * The meta object literal for the '<em><b>Initial Value</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT_LOCAL_VARIABLE_DECLARATION__INITIAL_VALUE = eINSTANCE.getStatement_Local_Variable_Declaration_InitialValue();

    /**
     * The meta object literal for the '{@link org.xtext.lua.lua.impl.Statement_FunctioncallOrAssignmentImpl <em>Statement Functioncall Or Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.lua.lua.impl.Statement_FunctioncallOrAssignmentImpl
     * @see org.xtext.lua.lua.impl.LuaPackageImpl#getStatement_FunctioncallOrAssignment()
     * @generated
     */
    EClass STATEMENT_FUNCTIONCALL_OR_ASSIGNMENT = eINSTANCE.getStatement_FunctioncallOrAssignment();

    /**
     * The meta object literal for the '{@link org.xtext.lua.lua.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.lua.lua.impl.ExpressionImpl
     * @see org.xtext.lua.lua.impl.LuaPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link org.xtext.lua.lua.impl.Expression_NilImpl <em>Expression Nil</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.lua.lua.impl.Expression_NilImpl
     * @see org.xtext.lua.lua.impl.LuaPackageImpl#getExpression_Nil()
     * @generated
     */
    EClass EXPRESSION_NIL = eINSTANCE.getExpression_Nil();

    /**
     * The meta object literal for the '{@link org.xtext.lua.lua.impl.Expression_TrueImpl <em>Expression True</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.lua.lua.impl.Expression_TrueImpl
     * @see org.xtext.lua.lua.impl.LuaPackageImpl#getExpression_True()
     * @generated
     */
    EClass EXPRESSION_TRUE = eINSTANCE.getExpression_True();

    /**
     * The meta object literal for the '{@link org.xtext.lua.lua.impl.Expression_FalseImpl <em>Expression False</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.lua.lua.impl.Expression_FalseImpl
     * @see org.xtext.lua.lua.impl.LuaPackageImpl#getExpression_False()
     * @generated
     */
    EClass EXPRESSION_FALSE = eINSTANCE.getExpression_False();

    /**
     * The meta object literal for the '{@link org.xtext.lua.lua.impl.Expression_NumberImpl <em>Expression Number</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.lua.lua.impl.Expression_NumberImpl
     * @see org.xtext.lua.lua.impl.LuaPackageImpl#getExpression_Number()
     * @generated
     */
    EClass EXPRESSION_NUMBER = eINSTANCE.getExpression_Number();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION_NUMBER__VALUE = eINSTANCE.getExpression_Number_Value();

    /**
     * The meta object literal for the '{@link org.xtext.lua.lua.impl.Expression_VarArgsImpl <em>Expression Var Args</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.lua.lua.impl.Expression_VarArgsImpl
     * @see org.xtext.lua.lua.impl.LuaPackageImpl#getExpression_VarArgs()
     * @generated
     */
    EClass EXPRESSION_VAR_ARGS = eINSTANCE.getExpression_VarArgs();

    /**
     * The meta object literal for the '{@link org.xtext.lua.lua.impl.Expression_StringImpl <em>Expression String</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.lua.lua.impl.Expression_StringImpl
     * @see org.xtext.lua.lua.impl.LuaPackageImpl#getExpression_String()
     * @generated
     */
    EClass EXPRESSION_STRING = eINSTANCE.getExpression_String();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION_STRING__VALUE = eINSTANCE.getExpression_String_Value();

    /**
     * The meta object literal for the '{@link org.xtext.lua.lua.impl.Expression_FunctionImpl <em>Expression Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.lua.lua.impl.Expression_FunctionImpl
     * @see org.xtext.lua.lua.impl.LuaPackageImpl#getExpression_Function()
     * @generated
     */
    EClass EXPRESSION_FUNCTION = eINSTANCE.getExpression_Function();

    /**
     * The meta object literal for the '<em><b>Function</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_FUNCTION__FUNCTION = eINSTANCE.getExpression_Function_Function();

    /**
     * The meta object literal for the '{@link org.xtext.lua.lua.impl.Expression_TableConstructorImpl <em>Expression Table Constructor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.lua.lua.impl.Expression_TableConstructorImpl
     * @see org.xtext.lua.lua.impl.LuaPackageImpl#getExpression_TableConstructor()
     * @generated
     */
    EClass EXPRESSION_TABLE_CONSTRUCTOR = eINSTANCE.getExpression_TableConstructor();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_TABLE_CONSTRUCTOR__FIELDS = eINSTANCE.getExpression_TableConstructor_Fields();

    /**
     * The meta object literal for the '{@link org.xtext.lua.lua.impl.FunctionImpl <em>Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.lua.lua.impl.FunctionImpl
     * @see org.xtext.lua.lua.impl.LuaPackageImpl#getFunction()
     * @generated
     */
    EClass FUNCTION = eINSTANCE.getFunction();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION__PARAMETERS = eINSTANCE.getFunction_Parameters();

    /**
     * The meta object literal for the '<em><b>Var Args</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION__VAR_ARGS = eINSTANCE.getFunction_VarArgs();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__BODY = eINSTANCE.getFunction_Body();

    /**
     * The meta object literal for the '{@link org.xtext.lua.lua.impl.Functioncall_ArgumentsImpl <em>Functioncall Arguments</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.lua.lua.impl.Functioncall_ArgumentsImpl
     * @see org.xtext.lua.lua.impl.LuaPackageImpl#getFunctioncall_Arguments()
     * @generated
     */
    EClass FUNCTIONCALL_ARGUMENTS = eINSTANCE.getFunctioncall_Arguments();

    /**
     * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTIONCALL_ARGUMENTS__ARGUMENTS = eINSTANCE.getFunctioncall_Arguments_Arguments();

    /**
     * The meta object literal for the '{@link org.xtext.lua.lua.impl.FieldImpl <em>Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.lua.lua.impl.FieldImpl
     * @see org.xtext.lua.lua.impl.LuaPackageImpl#getField()
     * @generated
     */
    EClass FIELD = eINSTANCE.getField();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD__VALUE = eINSTANCE.getField_Value();

    /**
     * The meta object literal for the '{@link org.xtext.lua.lua.impl.Field_AddEntryToTable_BracketsImpl <em>Field Add Entry To Table Brackets</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.lua.lua.impl.Field_AddEntryToTable_BracketsImpl
     * @see org.xtext.lua.lua.impl.LuaPackageImpl#getField_AddEntryToTable_Brackets()
     * @generated
     */
    EClass FIELD_ADD_ENTRY_TO_TABLE_BRACKETS = eINSTANCE.getField_AddEntryToTable_Brackets();

    /**
     * The meta object literal for the '<em><b>Index Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD_ADD_ENTRY_TO_TABLE_BRACKETS__INDEX_EXPRESSION = eINSTANCE.getField_AddEntryToTable_Brackets_IndexExpression();

    /**
     * The meta object literal for the '{@link org.xtext.lua.lua.impl.Field_AddEntryToTableImpl <em>Field Add Entry To Table</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.lua.lua.impl.Field_AddEntryToTableImpl
     * @see org.xtext.lua.lua.impl.LuaPackageImpl#getField_AddEntryToTable()
     * @generated
     */
    EClass FIELD_ADD_ENTRY_TO_TABLE = eINSTANCE.getField_AddEntryToTable();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD_ADD_ENTRY_TO_TABLE__KEY = eINSTANCE.getField_AddEntryToTable_Key();

    /**
     * The meta object literal for the '{@link org.xtext.lua.lua.impl.Field_AppendEntryToTableImpl <em>Field Append Entry To Table</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.lua.lua.impl.Field_AppendEntryToTableImpl
     * @see org.xtext.lua.lua.impl.LuaPackageImpl#getField_AppendEntryToTable()
     * @generated
     */
    EClass FIELD_APPEND_ENTRY_TO_TABLE = eINSTANCE.getField_AppendEntryToTable();

    /**
     * The meta object literal for the '{@link org.xtext.lua.lua.impl.LastStatement_ReturnWithValueImpl <em>Last Statement Return With Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.lua.lua.impl.LastStatement_ReturnWithValueImpl
     * @see org.xtext.lua.lua.impl.LuaPackageImpl#getLastStatement_ReturnWithValue()
     * @generated
     */
    EClass LAST_STATEMENT_RETURN_WITH_VALUE = eINSTANCE.getLastStatement_ReturnWithValue();

    /**
     * The meta object literal for the '<em><b>Return Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LAST_STATEMENT_RETURN_WITH_VALUE__RETURN_VALUES = eINSTANCE.getLastStatement_ReturnWithValue_ReturnValues();

    /**
     * The meta object literal for the '{@link org.xtext.lua.lua.impl.Statement_AssignmentImpl <em>Statement Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.lua.lua.impl.Statement_AssignmentImpl
     * @see org.xtext.lua.lua.impl.LuaPackageImpl#getStatement_Assignment()
     * @generated
     */
    EClass STATEMENT_ASSIGNMENT = eINSTANCE.getStatement_Assignment();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT_ASSIGNMENT__VARIABLE = eINSTANCE.getStatement_Assignment_Variable();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT_ASSIGNMENT__VALUES = eINSTANCE.getStatement_Assignment_Values();

    /**
     * The meta object literal for the '{@link org.xtext.lua.lua.impl.Statement_CallMemberFunctionImpl <em>Statement Call Member Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.lua.lua.impl.Statement_CallMemberFunctionImpl
     * @see org.xtext.lua.lua.impl.LuaPackageImpl#getStatement_CallMemberFunction()
     * @generated
     */
    EClass STATEMENT_CALL_MEMBER_FUNCTION = eINSTANCE.getStatement_CallMemberFunction();

    /**
     * The meta object literal for the '<em><b>Object</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT_CALL_MEMBER_FUNCTION__OBJECT = eINSTANCE.getStatement_CallMemberFunction_Object();

    /**
     * The meta object literal for the '<em><b>Member Function Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATEMENT_CALL_MEMBER_FUNCTION__MEMBER_FUNCTION_NAME = eINSTANCE.getStatement_CallMemberFunction_MemberFunctionName();

    /**
     * The meta object literal for the '<em><b>Arguments</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT_CALL_MEMBER_FUNCTION__ARGUMENTS = eINSTANCE.getStatement_CallMemberFunction_Arguments();

    /**
     * The meta object literal for the '{@link org.xtext.lua.lua.impl.Statement_CallFunctionImpl <em>Statement Call Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.lua.lua.impl.Statement_CallFunctionImpl
     * @see org.xtext.lua.lua.impl.LuaPackageImpl#getStatement_CallFunction()
     * @generated
     */
    EClass STATEMENT_CALL_FUNCTION = eINSTANCE.getStatement_CallFunction();

    /**
     * The meta object literal for the '<em><b>Object</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT_CALL_FUNCTION__OBJECT = eINSTANCE.getStatement_CallFunction_Object();

    /**
     * The meta object literal for the '<em><b>Arguments</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT_CALL_FUNCTION__ARGUMENTS = eINSTANCE.getStatement_CallFunction_Arguments();

    /**
     * The meta object literal for the '{@link org.xtext.lua.lua.impl.Expression_OrImpl <em>Expression Or</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.lua.lua.impl.Expression_OrImpl
     * @see org.xtext.lua.lua.impl.LuaPackageImpl#getExpression_Or()
     * @generated
     */
    EClass EXPRESSION_OR = eINSTANCE.getExpression_Or();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_OR__LEFT = eINSTANCE.getExpression_Or_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_OR__RIGHT = eINSTANCE.getExpression_Or_Right();

    /**
     * The meta object literal for the '{@link org.xtext.lua.lua.impl.Expression_AndImpl <em>Expression And</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.lua.lua.impl.Expression_AndImpl
     * @see org.xtext.lua.lua.impl.LuaPackageImpl#getExpression_And()
     * @generated
     */
    EClass EXPRESSION_AND = eINSTANCE.getExpression_And();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_AND__LEFT = eINSTANCE.getExpression_And_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_AND__RIGHT = eINSTANCE.getExpression_And_Right();

    /**
     * The meta object literal for the '{@link org.xtext.lua.lua.impl.Expression_LargerImpl <em>Expression Larger</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.lua.lua.impl.Expression_LargerImpl
     * @see org.xtext.lua.lua.impl.LuaPackageImpl#getExpression_Larger()
     * @generated
     */
    EClass EXPRESSION_LARGER = eINSTANCE.getExpression_Larger();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_LARGER__LEFT = eINSTANCE.getExpression_Larger_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_LARGER__RIGHT = eINSTANCE.getExpression_Larger_Right();

    /**
     * The meta object literal for the '{@link org.xtext.lua.lua.impl.Expression_Larger_EqualImpl <em>Expression Larger Equal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.lua.lua.impl.Expression_Larger_EqualImpl
     * @see org.xtext.lua.lua.impl.LuaPackageImpl#getExpression_Larger_Equal()
     * @generated
     */
    EClass EXPRESSION_LARGER_EQUAL = eINSTANCE.getExpression_Larger_Equal();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_LARGER_EQUAL__LEFT = eINSTANCE.getExpression_Larger_Equal_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_LARGER_EQUAL__RIGHT = eINSTANCE.getExpression_Larger_Equal_Right();

    /**
     * The meta object literal for the '{@link org.xtext.lua.lua.impl.Expression_SmallerImpl <em>Expression Smaller</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.lua.lua.impl.Expression_SmallerImpl
     * @see org.xtext.lua.lua.impl.LuaPackageImpl#getExpression_Smaller()
     * @generated
     */
    EClass EXPRESSION_SMALLER = eINSTANCE.getExpression_Smaller();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_SMALLER__LEFT = eINSTANCE.getExpression_Smaller_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_SMALLER__RIGHT = eINSTANCE.getExpression_Smaller_Right();

    /**
     * The meta object literal for the '{@link org.xtext.lua.lua.impl.Expression_Smaller_EqualImpl <em>Expression Smaller Equal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.lua.lua.impl.Expression_Smaller_EqualImpl
     * @see org.xtext.lua.lua.impl.LuaPackageImpl#getExpression_Smaller_Equal()
     * @generated
     */
    EClass EXPRESSION_SMALLER_EQUAL = eINSTANCE.getExpression_Smaller_Equal();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_SMALLER_EQUAL__LEFT = eINSTANCE.getExpression_Smaller_Equal_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_SMALLER_EQUAL__RIGHT = eINSTANCE.getExpression_Smaller_Equal_Right();

    /**
     * The meta object literal for the '{@link org.xtext.lua.lua.impl.Expression_EqualImpl <em>Expression Equal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.lua.lua.impl.Expression_EqualImpl
     * @see org.xtext.lua.lua.impl.LuaPackageImpl#getExpression_Equal()
     * @generated
     */
    EClass EXPRESSION_EQUAL = eINSTANCE.getExpression_Equal();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_EQUAL__LEFT = eINSTANCE.getExpression_Equal_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_EQUAL__RIGHT = eINSTANCE.getExpression_Equal_Right();

    /**
     * The meta object literal for the '{@link org.xtext.lua.lua.impl.Expression_Not_EqualImpl <em>Expression Not Equal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.lua.lua.impl.Expression_Not_EqualImpl
     * @see org.xtext.lua.lua.impl.LuaPackageImpl#getExpression_Not_Equal()
     * @generated
     */
    EClass EXPRESSION_NOT_EQUAL = eINSTANCE.getExpression_Not_Equal();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_NOT_EQUAL__LEFT = eINSTANCE.getExpression_Not_Equal_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_NOT_EQUAL__RIGHT = eINSTANCE.getExpression_Not_Equal_Right();

    /**
     * The meta object literal for the '{@link org.xtext.lua.lua.impl.Expression_ConcatenationImpl <em>Expression Concatenation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.lua.lua.impl.Expression_ConcatenationImpl
     * @see org.xtext.lua.lua.impl.LuaPackageImpl#getExpression_Concatenation()
     * @generated
     */
    EClass EXPRESSION_CONCATENATION = eINSTANCE.getExpression_Concatenation();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_CONCATENATION__LEFT = eINSTANCE.getExpression_Concatenation_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_CONCATENATION__RIGHT = eINSTANCE.getExpression_Concatenation_Right();

    /**
     * The meta object literal for the '{@link org.xtext.lua.lua.impl.Expression_PlusImpl <em>Expression Plus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.lua.lua.impl.Expression_PlusImpl
     * @see org.xtext.lua.lua.impl.LuaPackageImpl#getExpression_Plus()
     * @generated
     */
    EClass EXPRESSION_PLUS = eINSTANCE.getExpression_Plus();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_PLUS__LEFT = eINSTANCE.getExpression_Plus_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_PLUS__RIGHT = eINSTANCE.getExpression_Plus_Right();

    /**
     * The meta object literal for the '{@link org.xtext.lua.lua.impl.Expression_MinusImpl <em>Expression Minus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.lua.lua.impl.Expression_MinusImpl
     * @see org.xtext.lua.lua.impl.LuaPackageImpl#getExpression_Minus()
     * @generated
     */
    EClass EXPRESSION_MINUS = eINSTANCE.getExpression_Minus();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_MINUS__LEFT = eINSTANCE.getExpression_Minus_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_MINUS__RIGHT = eINSTANCE.getExpression_Minus_Right();

    /**
     * The meta object literal for the '{@link org.xtext.lua.lua.impl.Expression_MultiplicationImpl <em>Expression Multiplication</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.lua.lua.impl.Expression_MultiplicationImpl
     * @see org.xtext.lua.lua.impl.LuaPackageImpl#getExpression_Multiplication()
     * @generated
     */
    EClass EXPRESSION_MULTIPLICATION = eINSTANCE.getExpression_Multiplication();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_MULTIPLICATION__LEFT = eINSTANCE.getExpression_Multiplication_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_MULTIPLICATION__RIGHT = eINSTANCE.getExpression_Multiplication_Right();

    /**
     * The meta object literal for the '{@link org.xtext.lua.lua.impl.Expression_DivisionImpl <em>Expression Division</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.lua.lua.impl.Expression_DivisionImpl
     * @see org.xtext.lua.lua.impl.LuaPackageImpl#getExpression_Division()
     * @generated
     */
    EClass EXPRESSION_DIVISION = eINSTANCE.getExpression_Division();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_DIVISION__LEFT = eINSTANCE.getExpression_Division_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_DIVISION__RIGHT = eINSTANCE.getExpression_Division_Right();

    /**
     * The meta object literal for the '{@link org.xtext.lua.lua.impl.Expression_ModuloImpl <em>Expression Modulo</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.lua.lua.impl.Expression_ModuloImpl
     * @see org.xtext.lua.lua.impl.LuaPackageImpl#getExpression_Modulo()
     * @generated
     */
    EClass EXPRESSION_MODULO = eINSTANCE.getExpression_Modulo();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_MODULO__LEFT = eINSTANCE.getExpression_Modulo_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_MODULO__RIGHT = eINSTANCE.getExpression_Modulo_Right();

    /**
     * The meta object literal for the '{@link org.xtext.lua.lua.impl.Expression_NegateImpl <em>Expression Negate</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.lua.lua.impl.Expression_NegateImpl
     * @see org.xtext.lua.lua.impl.LuaPackageImpl#getExpression_Negate()
     * @generated
     */
    EClass EXPRESSION_NEGATE = eINSTANCE.getExpression_Negate();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_NEGATE__EXP = eINSTANCE.getExpression_Negate_Exp();

    /**
     * The meta object literal for the '{@link org.xtext.lua.lua.impl.Expression_LengthImpl <em>Expression Length</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.lua.lua.impl.Expression_LengthImpl
     * @see org.xtext.lua.lua.impl.LuaPackageImpl#getExpression_Length()
     * @generated
     */
    EClass EXPRESSION_LENGTH = eINSTANCE.getExpression_Length();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_LENGTH__EXP = eINSTANCE.getExpression_Length_Exp();

    /**
     * The meta object literal for the '{@link org.xtext.lua.lua.impl.Expression_InvertImpl <em>Expression Invert</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.lua.lua.impl.Expression_InvertImpl
     * @see org.xtext.lua.lua.impl.LuaPackageImpl#getExpression_Invert()
     * @generated
     */
    EClass EXPRESSION_INVERT = eINSTANCE.getExpression_Invert();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_INVERT__EXP = eINSTANCE.getExpression_Invert_Exp();

    /**
     * The meta object literal for the '{@link org.xtext.lua.lua.impl.Expression_ExponentiationImpl <em>Expression Exponentiation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.lua.lua.impl.Expression_ExponentiationImpl
     * @see org.xtext.lua.lua.impl.LuaPackageImpl#getExpression_Exponentiation()
     * @generated
     */
    EClass EXPRESSION_EXPONENTIATION = eINSTANCE.getExpression_Exponentiation();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_EXPONENTIATION__LEFT = eINSTANCE.getExpression_Exponentiation_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_EXPONENTIATION__RIGHT = eINSTANCE.getExpression_Exponentiation_Right();

    /**
     * The meta object literal for the '{@link org.xtext.lua.lua.impl.Expression_CallMemberFunctionImpl <em>Expression Call Member Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.lua.lua.impl.Expression_CallMemberFunctionImpl
     * @see org.xtext.lua.lua.impl.LuaPackageImpl#getExpression_CallMemberFunction()
     * @generated
     */
    EClass EXPRESSION_CALL_MEMBER_FUNCTION = eINSTANCE.getExpression_CallMemberFunction();

    /**
     * The meta object literal for the '<em><b>Object</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_CALL_MEMBER_FUNCTION__OBJECT = eINSTANCE.getExpression_CallMemberFunction_Object();

    /**
     * The meta object literal for the '<em><b>Member Function Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION_CALL_MEMBER_FUNCTION__MEMBER_FUNCTION_NAME = eINSTANCE.getExpression_CallMemberFunction_MemberFunctionName();

    /**
     * The meta object literal for the '<em><b>Arguments</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_CALL_MEMBER_FUNCTION__ARGUMENTS = eINSTANCE.getExpression_CallMemberFunction_Arguments();

    /**
     * The meta object literal for the '{@link org.xtext.lua.lua.impl.Expression_CallFunctionImpl <em>Expression Call Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.lua.lua.impl.Expression_CallFunctionImpl
     * @see org.xtext.lua.lua.impl.LuaPackageImpl#getExpression_CallFunction()
     * @generated
     */
    EClass EXPRESSION_CALL_FUNCTION = eINSTANCE.getExpression_CallFunction();

    /**
     * The meta object literal for the '<em><b>Object</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_CALL_FUNCTION__OBJECT = eINSTANCE.getExpression_CallFunction_Object();

    /**
     * The meta object literal for the '<em><b>Arguments</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_CALL_FUNCTION__ARGUMENTS = eINSTANCE.getExpression_CallFunction_Arguments();

    /**
     * The meta object literal for the '{@link org.xtext.lua.lua.impl.Expression_AccessArrayImpl <em>Expression Access Array</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.lua.lua.impl.Expression_AccessArrayImpl
     * @see org.xtext.lua.lua.impl.LuaPackageImpl#getExpression_AccessArray()
     * @generated
     */
    EClass EXPRESSION_ACCESS_ARRAY = eINSTANCE.getExpression_AccessArray();

    /**
     * The meta object literal for the '<em><b>Array</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_ACCESS_ARRAY__ARRAY = eINSTANCE.getExpression_AccessArray_Array();

    /**
     * The meta object literal for the '<em><b>Index</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_ACCESS_ARRAY__INDEX = eINSTANCE.getExpression_AccessArray_Index();

    /**
     * The meta object literal for the '{@link org.xtext.lua.lua.impl.Expression_AccessMemberImpl <em>Expression Access Member</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.lua.lua.impl.Expression_AccessMemberImpl
     * @see org.xtext.lua.lua.impl.LuaPackageImpl#getExpression_AccessMember()
     * @generated
     */
    EClass EXPRESSION_ACCESS_MEMBER = eINSTANCE.getExpression_AccessMember();

    /**
     * The meta object literal for the '<em><b>Object</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_ACCESS_MEMBER__OBJECT = eINSTANCE.getExpression_AccessMember_Object();

    /**
     * The meta object literal for the '<em><b>Member Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION_ACCESS_MEMBER__MEMBER_NAME = eINSTANCE.getExpression_AccessMember_MemberName();

    /**
     * The meta object literal for the '{@link org.xtext.lua.lua.impl.Expression_VariableNameImpl <em>Expression Variable Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.lua.lua.impl.Expression_VariableNameImpl
     * @see org.xtext.lua.lua.impl.LuaPackageImpl#getExpression_VariableName()
     * @generated
     */
    EClass EXPRESSION_VARIABLE_NAME = eINSTANCE.getExpression_VariableName();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION_VARIABLE_NAME__VARIABLE = eINSTANCE.getExpression_VariableName_Variable();

  }

} //LuaPackage
