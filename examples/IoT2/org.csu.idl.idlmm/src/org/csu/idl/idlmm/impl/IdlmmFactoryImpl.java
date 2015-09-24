/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.csu.idl.idlmm.impl;

import org.csu.idl.idlmm.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IdlmmFactoryImpl extends EFactoryImpl implements IdlmmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IdlmmFactory init() {
		try {
			IdlmmFactory theIdlmmFactory = (IdlmmFactory)EPackage.Registry.INSTANCE.getEFactory(IdlmmPackage.eNS_URI);
			if (theIdlmmFactory != null) {
				return theIdlmmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IdlmmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdlmmFactoryImpl() {
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
			case IdlmmPackage.INTERFACE_DEF: return createInterfaceDef();
			case IdlmmPackage.MODULE_DEF: return createModuleDef();
			case IdlmmPackage.OPERATION_DEF: return createOperationDef();
			case IdlmmPackage.ATTRIBUTE_DEF: return createAttributeDef();
			case IdlmmPackage.CONSTANT_DEF: return createConstantDef();
			case IdlmmPackage.PARAMETER_DEF: return createParameterDef();
			case IdlmmPackage.PRIMITIVE_DEF: return createPrimitiveDef();
			case IdlmmPackage.EXCEPTION_DEF: return createExceptionDef();
			case IdlmmPackage.FIELD: return createField();
			case IdlmmPackage.FIXED_DEF: return createFixedDef();
			case IdlmmPackage.WSTRING_DEF: return createWstringDef();
			case IdlmmPackage.STRING_DEF: return createStringDef();
			case IdlmmPackage.ALIAS_DEF: return createAliasDef();
			case IdlmmPackage.ARRAY_DEF: return createArrayDef();
			case IdlmmPackage.SEQUENCE_DEF: return createSequenceDef();
			case IdlmmPackage.UNION_FIELD: return createUnionField();
			case IdlmmPackage.UNION_DEF: return createUnionDef();
			case IdlmmPackage.ENUM_DEF: return createEnumDef();
			case IdlmmPackage.STRUCT_DEF: return createStructDef();
			case IdlmmPackage.TRANSLATION_UNIT: return createTranslationUnit();
			case IdlmmPackage.INCLUDE: return createInclude();
			case IdlmmPackage.BINARY_EXPRESSION: return createBinaryExpression();
			case IdlmmPackage.UNARY_EXPRESSION: return createUnaryExpression();
			case IdlmmPackage.CONSTANT_DEF_REF: return createConstantDefRef();
			case IdlmmPackage.VALUE_EXPRESSION: return createValueExpression();
			case IdlmmPackage.FORWARD_DEF: return createForwardDef();
			case IdlmmPackage.ENUM_MEMBER: return createEnumMember();
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
			case IdlmmPackage.PARAMETER_MODE:
				return createParameterModeFromString(eDataType, initialValue);
			case IdlmmPackage.PRIMITIVE_KIND:
				return createPrimitiveKindFromString(eDataType, initialValue);
			case IdlmmPackage.EANY:
				return createEAnyFromString(eDataType, initialValue);
			case IdlmmPackage.ETYPE_CODE:
				return createETypeCodeFromString(eDataType, initialValue);
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
			case IdlmmPackage.PARAMETER_MODE:
				return convertParameterModeToString(eDataType, instanceValue);
			case IdlmmPackage.PRIMITIVE_KIND:
				return convertPrimitiveKindToString(eDataType, instanceValue);
			case IdlmmPackage.EANY:
				return convertEAnyToString(eDataType, instanceValue);
			case IdlmmPackage.ETYPE_CODE:
				return convertETypeCodeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceDef createInterfaceDef() {
		InterfaceDefImpl interfaceDef = new InterfaceDefImpl();
		return interfaceDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleDef createModuleDef() {
		ModuleDefImpl moduleDef = new ModuleDefImpl();
		return moduleDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationDef createOperationDef() {
		OperationDefImpl operationDef = new OperationDefImpl();
		return operationDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeDef createAttributeDef() {
		AttributeDefImpl attributeDef = new AttributeDefImpl();
		return attributeDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstantDef createConstantDef() {
		ConstantDefImpl constantDef = new ConstantDefImpl();
		return constantDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterDef createParameterDef() {
		ParameterDefImpl parameterDef = new ParameterDefImpl();
		return parameterDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveDef createPrimitiveDef() {
		PrimitiveDefImpl primitiveDef = new PrimitiveDefImpl();
		return primitiveDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExceptionDef createExceptionDef() {
		ExceptionDefImpl exceptionDef = new ExceptionDefImpl();
		return exceptionDef;
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
	public FixedDef createFixedDef() {
		FixedDefImpl fixedDef = new FixedDefImpl();
		return fixedDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WstringDef createWstringDef() {
		WstringDefImpl wstringDef = new WstringDefImpl();
		return wstringDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringDef createStringDef() {
		StringDefImpl stringDef = new StringDefImpl();
		return stringDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AliasDef createAliasDef() {
		AliasDefImpl aliasDef = new AliasDefImpl();
		return aliasDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayDef createArrayDef() {
		ArrayDefImpl arrayDef = new ArrayDefImpl();
		return arrayDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceDef createSequenceDef() {
		SequenceDefImpl sequenceDef = new SequenceDefImpl();
		return sequenceDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnionField createUnionField() {
		UnionFieldImpl unionField = new UnionFieldImpl();
		return unionField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnionDef createUnionDef() {
		UnionDefImpl unionDef = new UnionDefImpl();
		return unionDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumDef createEnumDef() {
		EnumDefImpl enumDef = new EnumDefImpl();
		return enumDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructDef createStructDef() {
		StructDefImpl structDef = new StructDefImpl();
		return structDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TranslationUnit createTranslationUnit() {
		TranslationUnitImpl translationUnit = new TranslationUnitImpl();
		return translationUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Include createInclude() {
		IncludeImpl include = new IncludeImpl();
		return include;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryExpression createBinaryExpression() {
		BinaryExpressionImpl binaryExpression = new BinaryExpressionImpl();
		return binaryExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryExpression createUnaryExpression() {
		UnaryExpressionImpl unaryExpression = new UnaryExpressionImpl();
		return unaryExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstantDefRef createConstantDefRef() {
		ConstantDefRefImpl constantDefRef = new ConstantDefRefImpl();
		return constantDefRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueExpression createValueExpression() {
		ValueExpressionImpl valueExpression = new ValueExpressionImpl();
		return valueExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForwardDef createForwardDef() {
		ForwardDefImpl forwardDef = new ForwardDefImpl();
		return forwardDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumMember createEnumMember() {
		EnumMemberImpl enumMember = new EnumMemberImpl();
		return enumMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterMode createParameterModeFromString(EDataType eDataType, String initialValue) {
		ParameterMode result = ParameterMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParameterModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveKind createPrimitiveKindFromString(EDataType eDataType, String initialValue) {
		PrimitiveKind result = PrimitiveKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPrimitiveKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createEAnyFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEAnyToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createETypeCodeFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertETypeCodeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdlmmPackage getIdlmmPackage() {
		return (IdlmmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IdlmmPackage getPackage() {
		return IdlmmPackage.eINSTANCE;
	}

} //IdlmmFactoryImpl
