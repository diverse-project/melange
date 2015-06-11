/**
 */
package activitydiagram.impl;

import activitydiagram.*;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.util.Date;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.k3.lua.dynamic.environment;

import org.modelexecution.operationalsemantics.gemoc.sequential.dynamic.Context;
import org.modelexecution.operationalsemantics.gemoc.sequential.dynamic.Offer;
import org.modelexecution.operationalsemantics.gemoc.sequential.dynamic.Token;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ActivitydiagramFactoryImpl extends EFactoryImpl implements ActivitydiagramFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ActivitydiagramFactory init() {
		try {
			ActivitydiagramFactory theActivitydiagramFactory = (ActivitydiagramFactory)EPackage.Registry.INSTANCE.getEFactory(ActivitydiagramPackage.eNS_URI);
			if (theActivitydiagramFactory != null) {
				return theActivitydiagramFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ActivitydiagramFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivitydiagramFactoryImpl() {
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
			case ActivitydiagramPackage.OPAQUE_ACTION: return createOpaqueAction();
			case ActivitydiagramPackage.ACTIVITY: return createActivity();
			case ActivitydiagramPackage.INPUT_VALUE: return createInputValue();
			case ActivitydiagramPackage.CHUNK: return createChunk();
			case ActivitydiagramPackage.BLOCK: return createBlock();
			case ActivitydiagramPackage.LAST_STATEMENT: return createLastStatement();
			case ActivitydiagramPackage.LAST_STATEMENT_RETURN: return createLastStatement_Return();
			case ActivitydiagramPackage.LAST_STATEMENT_BREAK: return createLastStatement_Break();
			case ActivitydiagramPackage.STATEMENT: return createStatement();
			case ActivitydiagramPackage.STATEMENT_BLOCK: return createStatement_Block();
			case ActivitydiagramPackage.STATEMENT_WHILE: return createStatement_While();
			case ActivitydiagramPackage.STATEMENT_REPEAT: return createStatement_Repeat();
			case ActivitydiagramPackage.STATEMENT_IF_THEN_ELSE: return createStatement_If_Then_Else();
			case ActivitydiagramPackage.STATEMENT_IF_THEN_ELSE_ELSE_IF_PART: return createStatement_If_Then_Else_ElseIfPart();
			case ActivitydiagramPackage.STATEMENT_FOR_NUMERIC: return createStatement_For_Numeric();
			case ActivitydiagramPackage.STATEMENT_FOR_GENERIC: return createStatement_For_Generic();
			case ActivitydiagramPackage.STATEMENT_GLOBAL_FUNCTION_DECLARATION: return createStatement_GlobalFunction_Declaration();
			case ActivitydiagramPackage.STATEMENT_LOCAL_FUNCTION_DECLARATION: return createStatement_LocalFunction_Declaration();
			case ActivitydiagramPackage.STATEMENT_LOCAL_VARIABLE_DECLARATION: return createStatement_Local_Variable_Declaration();
			case ActivitydiagramPackage.STATEMENT_FUNCTIONCALL_OR_ASSIGNMENT: return createStatement_FunctioncallOrAssignment();
			case ActivitydiagramPackage.EXPRESSION_NIL: return createExpression_Nil();
			case ActivitydiagramPackage.EXPRESSION_TRUE: return createExpression_True();
			case ActivitydiagramPackage.EXPRESSION_FALSE: return createExpression_False();
			case ActivitydiagramPackage.EXPRESSION_NUMBER: return createExpression_Number();
			case ActivitydiagramPackage.EXPRESSION_VAR_ARGS: return createExpression_VarArgs();
			case ActivitydiagramPackage.EXPRESSION_STRING: return createExpression_String();
			case ActivitydiagramPackage.EXPRESSION_FUNCTION: return createExpression_Function();
			case ActivitydiagramPackage.EXPRESSION_TABLE_CONSTRUCTOR: return createExpression_TableConstructor();
			case ActivitydiagramPackage.FUNCTION: return createFunction();
			case ActivitydiagramPackage.FUNCTIONCALL_ARGUMENTS: return createFunctioncall_Arguments();
			case ActivitydiagramPackage.FIELD: return createField();
			case ActivitydiagramPackage.FIELD_ADD_ENTRY_TO_TABLE_BRACKETS: return createField_AddEntryToTable_Brackets();
			case ActivitydiagramPackage.FIELD_ADD_ENTRY_TO_TABLE: return createField_AddEntryToTable();
			case ActivitydiagramPackage.FIELD_APPEND_ENTRY_TO_TABLE: return createField_AppendEntryToTable();
			case ActivitydiagramPackage.LAST_STATEMENT_RETURN_WITH_VALUE: return createLastStatement_ReturnWithValue();
			case ActivitydiagramPackage.STATEMENT_ASSIGNMENT: return createStatement_Assignment();
			case ActivitydiagramPackage.STATEMENT_CALL_MEMBER_FUNCTION: return createStatement_CallMemberFunction();
			case ActivitydiagramPackage.STATEMENT_CALL_FUNCTION: return createStatement_CallFunction();
			case ActivitydiagramPackage.EXPRESSION_OR: return createExpression_Or();
			case ActivitydiagramPackage.EXPRESSION_AND: return createExpression_And();
			case ActivitydiagramPackage.EXPRESSION_LARGER: return createExpression_Larger();
			case ActivitydiagramPackage.EXPRESSION_LARGER_EQUAL: return createExpression_Larger_Equal();
			case ActivitydiagramPackage.EXPRESSION_SMALLER: return createExpression_Smaller();
			case ActivitydiagramPackage.EXPRESSION_SMALLER_EQUAL: return createExpression_Smaller_Equal();
			case ActivitydiagramPackage.EXPRESSION_EQUAL: return createExpression_Equal();
			case ActivitydiagramPackage.EXPRESSION_NOT_EQUAL: return createExpression_Not_Equal();
			case ActivitydiagramPackage.EXPRESSION_CONCATENATION: return createExpression_Concatenation();
			case ActivitydiagramPackage.EXPRESSION_PLUS: return createExpression_Plus();
			case ActivitydiagramPackage.EXPRESSION_MINUS: return createExpression_Minus();
			case ActivitydiagramPackage.EXPRESSION_MULTIPLICATION: return createExpression_Multiplication();
			case ActivitydiagramPackage.EXPRESSION_DIVISION: return createExpression_Division();
			case ActivitydiagramPackage.EXPRESSION_MODULO: return createExpression_Modulo();
			case ActivitydiagramPackage.EXPRESSION_NEGATE: return createExpression_Negate();
			case ActivitydiagramPackage.EXPRESSION_LENGTH: return createExpression_Length();
			case ActivitydiagramPackage.EXPRESSION_INVERT: return createExpression_Invert();
			case ActivitydiagramPackage.EXPRESSION_EXPONENTIATION: return createExpression_Exponentiation();
			case ActivitydiagramPackage.EXPRESSION_CALL_MEMBER_FUNCTION: return createExpression_CallMemberFunction();
			case ActivitydiagramPackage.EXPRESSION_CALL_FUNCTION: return createExpression_CallFunction();
			case ActivitydiagramPackage.EXPRESSION_ACCESS_ARRAY: return createExpression_AccessArray();
			case ActivitydiagramPackage.EXPRESSION_ACCESS_MEMBER: return createExpression_AccessMember();
			case ActivitydiagramPackage.EXPRESSION_VARIABLE_NAME: return createExpression_VariableName();
			case ActivitydiagramPackage.EATTRIBUTE: return createEAttribute();
			case ActivitydiagramPackage.EANNOTATION: return createEAnnotation();
			case ActivitydiagramPackage.ECLASS: return createEClass();
			case ActivitydiagramPackage.EDATA_TYPE: return createEDataType();
			case ActivitydiagramPackage.EENUM: return createEEnum();
			case ActivitydiagramPackage.EENUM_LITERAL: return createEEnumLiteral();
			case ActivitydiagramPackage.EFACTORY: return createEFactory();
			case ActivitydiagramPackage.EOBJECT: return createEObject();
			case ActivitydiagramPackage.EOPERATION: return createEOperation();
			case ActivitydiagramPackage.EPACKAGE: return createEPackage();
			case ActivitydiagramPackage.EPARAMETER: return createEParameter();
			case ActivitydiagramPackage.EREFERENCE: return createEReference();
			case ActivitydiagramPackage.ESTRING_TO_STRING_MAP_ENTRY: return (EObject)createEStringToStringMapEntry();
			case ActivitydiagramPackage.EGENERIC_TYPE: return createEGenericType();
			case ActivitydiagramPackage.ETYPE_PARAMETER: return createETypeParameter();
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
			case ActivitydiagramPackage.CONTEXT:
				return createContextFromString(eDataType, initialValue);
			case ActivitydiagramPackage.OFFER:
				return createOfferFromString(eDataType, initialValue);
			case ActivitydiagramPackage.TOKEN:
				return createTokenFromString(eDataType, initialValue);
			case ActivitydiagramPackage.ENVIRONMENT:
				return createenvironmentFromString(eDataType, initialValue);
			case ActivitydiagramPackage.EBIG_DECIMAL:
				return createEBigDecimalFromString(eDataType, initialValue);
			case ActivitydiagramPackage.EBIG_INTEGER:
				return createEBigIntegerFromString(eDataType, initialValue);
			case ActivitydiagramPackage.EBOOLEAN:
				return createEBooleanFromString(eDataType, initialValue);
			case ActivitydiagramPackage.EBOOLEAN_OBJECT:
				return createEBooleanObjectFromString(eDataType, initialValue);
			case ActivitydiagramPackage.EBYTE:
				return createEByteFromString(eDataType, initialValue);
			case ActivitydiagramPackage.EBYTE_ARRAY:
				return createEByteArrayFromString(eDataType, initialValue);
			case ActivitydiagramPackage.EBYTE_OBJECT:
				return createEByteObjectFromString(eDataType, initialValue);
			case ActivitydiagramPackage.ECHAR:
				return createECharFromString(eDataType, initialValue);
			case ActivitydiagramPackage.ECHARACTER_OBJECT:
				return createECharacterObjectFromString(eDataType, initialValue);
			case ActivitydiagramPackage.EDATE:
				return createEDateFromString(eDataType, initialValue);
			case ActivitydiagramPackage.EDOUBLE:
				return createEDoubleFromString(eDataType, initialValue);
			case ActivitydiagramPackage.EDOUBLE_OBJECT:
				return createEDoubleObjectFromString(eDataType, initialValue);
			case ActivitydiagramPackage.EFLOAT:
				return createEFloatFromString(eDataType, initialValue);
			case ActivitydiagramPackage.EFLOAT_OBJECT:
				return createEFloatObjectFromString(eDataType, initialValue);
			case ActivitydiagramPackage.EINT:
				return createEIntFromString(eDataType, initialValue);
			case ActivitydiagramPackage.EINTEGER_OBJECT:
				return createEIntegerObjectFromString(eDataType, initialValue);
			case ActivitydiagramPackage.EJAVA_CLASS:
				return createEJavaClassFromString(eDataType, initialValue);
			case ActivitydiagramPackage.EJAVA_OBJECT:
				return createEJavaObjectFromString(eDataType, initialValue);
			case ActivitydiagramPackage.ELONG:
				return createELongFromString(eDataType, initialValue);
			case ActivitydiagramPackage.ELONG_OBJECT:
				return createELongObjectFromString(eDataType, initialValue);
			case ActivitydiagramPackage.ESHORT:
				return createEShortFromString(eDataType, initialValue);
			case ActivitydiagramPackage.ESHORT_OBJECT:
				return createEShortObjectFromString(eDataType, initialValue);
			case ActivitydiagramPackage.ESTRING:
				return createEStringFromString(eDataType, initialValue);
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
			case ActivitydiagramPackage.CONTEXT:
				return convertContextToString(eDataType, instanceValue);
			case ActivitydiagramPackage.OFFER:
				return convertOfferToString(eDataType, instanceValue);
			case ActivitydiagramPackage.TOKEN:
				return convertTokenToString(eDataType, instanceValue);
			case ActivitydiagramPackage.ENVIRONMENT:
				return convertenvironmentToString(eDataType, instanceValue);
			case ActivitydiagramPackage.EBIG_DECIMAL:
				return convertEBigDecimalToString(eDataType, instanceValue);
			case ActivitydiagramPackage.EBIG_INTEGER:
				return convertEBigIntegerToString(eDataType, instanceValue);
			case ActivitydiagramPackage.EBOOLEAN:
				return convertEBooleanToString(eDataType, instanceValue);
			case ActivitydiagramPackage.EBOOLEAN_OBJECT:
				return convertEBooleanObjectToString(eDataType, instanceValue);
			case ActivitydiagramPackage.EBYTE:
				return convertEByteToString(eDataType, instanceValue);
			case ActivitydiagramPackage.EBYTE_ARRAY:
				return convertEByteArrayToString(eDataType, instanceValue);
			case ActivitydiagramPackage.EBYTE_OBJECT:
				return convertEByteObjectToString(eDataType, instanceValue);
			case ActivitydiagramPackage.ECHAR:
				return convertECharToString(eDataType, instanceValue);
			case ActivitydiagramPackage.ECHARACTER_OBJECT:
				return convertECharacterObjectToString(eDataType, instanceValue);
			case ActivitydiagramPackage.EDATE:
				return convertEDateToString(eDataType, instanceValue);
			case ActivitydiagramPackage.EDOUBLE:
				return convertEDoubleToString(eDataType, instanceValue);
			case ActivitydiagramPackage.EDOUBLE_OBJECT:
				return convertEDoubleObjectToString(eDataType, instanceValue);
			case ActivitydiagramPackage.EFLOAT:
				return convertEFloatToString(eDataType, instanceValue);
			case ActivitydiagramPackage.EFLOAT_OBJECT:
				return convertEFloatObjectToString(eDataType, instanceValue);
			case ActivitydiagramPackage.EINT:
				return convertEIntToString(eDataType, instanceValue);
			case ActivitydiagramPackage.EINTEGER_OBJECT:
				return convertEIntegerObjectToString(eDataType, instanceValue);
			case ActivitydiagramPackage.EJAVA_CLASS:
				return convertEJavaClassToString(eDataType, instanceValue);
			case ActivitydiagramPackage.EJAVA_OBJECT:
				return convertEJavaObjectToString(eDataType, instanceValue);
			case ActivitydiagramPackage.ELONG:
				return convertELongToString(eDataType, instanceValue);
			case ActivitydiagramPackage.ELONG_OBJECT:
				return convertELongObjectToString(eDataType, instanceValue);
			case ActivitydiagramPackage.ESHORT:
				return convertEShortToString(eDataType, instanceValue);
			case ActivitydiagramPackage.ESHORT_OBJECT:
				return convertEShortObjectToString(eDataType, instanceValue);
			case ActivitydiagramPackage.ESTRING:
				return convertEStringToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
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
	public Activity createActivity() {
		ActivityImpl activity = new ActivityImpl();
		return activity;
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
	public Field createField() {
		FieldImpl field = new FieldImpl();
		return field;
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
	public EAttribute createEAttribute() {
		EAttributeImpl eAttribute = new EAttributeImpl();
		return eAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAnnotation createEAnnotation() {
		EAnnotationImpl eAnnotation = new EAnnotationImpl();
		return eAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public activitydiagram.EClass createEClass() {
		EClassImpl eClass = new EClassImpl();
		return eClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public activitydiagram.EDataType createEDataType() {
		EDataTypeImpl eDataType = new EDataTypeImpl();
		return eDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum createEEnum() {
		EEnumImpl eEnum = new EEnumImpl();
		return eEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnumLiteral createEEnumLiteral() {
		EEnumLiteralImpl eEnumLiteral = new EEnumLiteralImpl();
		return eEnumLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EFactory createEFactory() {
		activitydiagram.impl.EFactoryImpl eFactory = new activitydiagram.impl.EFactoryImpl();
		return eFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public activitydiagram.EObject createEObject() {
		EObjectImpl eObject = new EObjectImpl();
		return eObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation createEOperation() {
		EOperationImpl eOperation = new EOperationImpl();
		return eOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public activitydiagram.EPackage createEPackage() {
		EPackageImpl ePackage = new EPackageImpl();
		return ePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EParameter createEParameter() {
		EParameterImpl eParameter = new EParameterImpl();
		return eParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference createEReference() {
		EReferenceImpl eReference = new EReferenceImpl();
		return eReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, String> createEStringToStringMapEntry() {
		EStringToStringMapEntryImpl eStringToStringMapEntry = new EStringToStringMapEntryImpl();
		return eStringToStringMapEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EGenericType createEGenericType() {
		EGenericTypeImpl eGenericType = new EGenericTypeImpl();
		return eGenericType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ETypeParameter createETypeParameter() {
		ETypeParameterImpl eTypeParameter = new ETypeParameterImpl();
		return eTypeParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Context createContextFromString(EDataType eDataType, String initialValue) {
		return (Context)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContextToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Offer createOfferFromString(EDataType eDataType, String initialValue) {
		return (Offer)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOfferToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Token createTokenFromString(EDataType eDataType, String initialValue) {
		return (Token)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTokenToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public environment createenvironmentFromString(EDataType eDataType, String initialValue) {
		return (environment)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertenvironmentToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createEBigDecimalFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEBigDecimalToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createEBigIntegerFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEBigIntegerToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createEBooleanFromString(EDataType eDataType, String initialValue) {
		return (Boolean)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEBooleanToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createEBooleanObjectFromString(EDataType eDataType, String initialValue) {
		return createEBooleanFromString(ActivitydiagramPackage.eINSTANCE.getEBoolean(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEBooleanObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEBooleanToString(ActivitydiagramPackage.eINSTANCE.getEBoolean(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Byte createEByteFromString(EDataType eDataType, String initialValue) {
		return (Byte)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.BYTE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEByteToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.BYTE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] createEByteArrayFromString(EDataType eDataType, String initialValue) {
		return (byte[])XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.HEX_BINARY, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEByteArrayToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.HEX_BINARY, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Byte createEByteObjectFromString(EDataType eDataType, String initialValue) {
		return createEByteFromString(ActivitydiagramPackage.eINSTANCE.getEByte(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEByteObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEByteToString(ActivitydiagramPackage.eINSTANCE.getEByte(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Character createECharFromString(EDataType eDataType, String initialValue) {
		return (Character)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertECharToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Character createECharacterObjectFromString(EDataType eDataType, String initialValue) {
		return createECharFromString(ActivitydiagramPackage.eINSTANCE.getEChar(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertECharacterObjectToString(EDataType eDataType, Object instanceValue) {
		return convertECharToString(ActivitydiagramPackage.eINSTANCE.getEChar(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date createEDateFromString(EDataType eDataType, String initialValue) {
		return (Date)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEDateToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createEDoubleFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEDoubleToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createEDoubleObjectFromString(EDataType eDataType, String initialValue) {
		return createEDoubleFromString(ActivitydiagramPackage.eINSTANCE.getEDouble(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEDoubleObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEDoubleToString(ActivitydiagramPackage.eINSTANCE.getEDouble(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createEFloatFromString(EDataType eDataType, String initialValue) {
		return (Float)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.FLOAT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEFloatToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.FLOAT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createEFloatObjectFromString(EDataType eDataType, String initialValue) {
		return createEFloatFromString(ActivitydiagramPackage.eINSTANCE.getEFloat(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEFloatObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEFloatToString(ActivitydiagramPackage.eINSTANCE.getEFloat(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createEIntFromString(EDataType eDataType, String initialValue) {
		return (Integer)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEIntToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createEIntegerObjectFromString(EDataType eDataType, String initialValue) {
		return createEIntFromString(ActivitydiagramPackage.eINSTANCE.getEInt(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEIntegerObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEIntToString(ActivitydiagramPackage.eINSTANCE.getEInt(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Class<?> createEJavaClassFromString(EDataType eDataType, String initialValue) {
		return (Class<?>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEJavaClassToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createEJavaObjectFromString(EDataType eDataType, String initialValue) {
		return super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEJavaObjectToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long createELongFromString(EDataType eDataType, String initialValue) {
		return (Long)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.LONG, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertELongToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.LONG, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long createELongObjectFromString(EDataType eDataType, String initialValue) {
		return createELongFromString(ActivitydiagramPackage.eINSTANCE.getELong(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertELongObjectToString(EDataType eDataType, Object instanceValue) {
		return convertELongToString(ActivitydiagramPackage.eINSTANCE.getELong(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Short createEShortFromString(EDataType eDataType, String initialValue) {
		return (Short)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.SHORT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEShortToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.SHORT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Short createEShortObjectFromString(EDataType eDataType, String initialValue) {
		return createEShortFromString(ActivitydiagramPackage.eINSTANCE.getEShort(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEShortObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEShortToString(ActivitydiagramPackage.eINSTANCE.getEShort(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createEStringFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEStringToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivitydiagramPackage getActivitydiagramPackage() {
		return (ActivitydiagramPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ActivitydiagramPackage getPackage() {
		return ActivitydiagramPackage.eINSTANCE;
	}

} //ActivitydiagramFactoryImpl
