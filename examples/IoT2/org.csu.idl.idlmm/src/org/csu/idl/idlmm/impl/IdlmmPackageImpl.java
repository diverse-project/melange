/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.csu.idl.idlmm.impl;

import org.csu.idl.idlmm.AliasDef;
import org.csu.idl.idlmm.ArrayDef;
import org.csu.idl.idlmm.AttributeDef;
import org.csu.idl.idlmm.BinaryExpression;
import org.csu.idl.idlmm.Constant;
import org.csu.idl.idlmm.ConstantDef;
import org.csu.idl.idlmm.ConstantDefRef;
import org.csu.idl.idlmm.Contained;
import org.csu.idl.idlmm.EnumDef;
import org.csu.idl.idlmm.EnumMember;
import org.csu.idl.idlmm.ExceptionDef;
import org.csu.idl.idlmm.Expression;
import org.csu.idl.idlmm.Field;
import org.csu.idl.idlmm.FixedDef;
import org.csu.idl.idlmm.ForwardDef;
import org.csu.idl.idlmm.IDLType;
import org.csu.idl.idlmm.IdlmmFactory;
import org.csu.idl.idlmm.IdlmmPackage;
import org.csu.idl.idlmm.Include;
import org.csu.idl.idlmm.InterfaceDef;
import org.csu.idl.idlmm.LiteralExpression;
import org.csu.idl.idlmm.ModuleDef;
import org.csu.idl.idlmm.NamedElement;
import org.csu.idl.idlmm.OperationDef;
import org.csu.idl.idlmm.ParameterDef;
import org.csu.idl.idlmm.ParameterMode;
import org.csu.idl.idlmm.PrimitiveDef;
import org.csu.idl.idlmm.PrimitiveKind;
import org.csu.idl.idlmm.SequenceDef;
import org.csu.idl.idlmm.StringDef;
import org.csu.idl.idlmm.StructDef;
import org.csu.idl.idlmm.TranslationUnit;
import org.csu.idl.idlmm.Typed;
import org.csu.idl.idlmm.TypedefDef;
import org.csu.idl.idlmm.UnaryExpression;
import org.csu.idl.idlmm.UnionDef;
import org.csu.idl.idlmm.UnionField;
import org.csu.idl.idlmm.ValueExpression;
import org.csu.idl.idlmm.WstringDef;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IdlmmPackageImpl extends EPackageImpl implements IdlmmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass idlTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constantDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exceptionDefEClass = null;

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
	private EClass fixedDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wstringDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aliasDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unionFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedefDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unionDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass translationUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass includeEClass = null;

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
	private EClass binaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constantDefRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forwardDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumMemberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum parameterModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum primitiveKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eAnyEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eTypeCodeEDataType = null;

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
	 * @see org.csu.idl.idlmm.IdlmmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IdlmmPackageImpl() {
		super(eNS_URI, IdlmmFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link IdlmmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static IdlmmPackage init() {
		if (isInited) return (IdlmmPackage)EPackage.Registry.INSTANCE.getEPackage(IdlmmPackage.eNS_URI);

		// Obtain or create and register package
		IdlmmPackageImpl theIdlmmPackage = (IdlmmPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof IdlmmPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new IdlmmPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theIdlmmPackage.createPackageContents();

		// Initialize created meta-data
		theIdlmmPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIdlmmPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IdlmmPackage.eNS_URI, theIdlmmPackage);
		return theIdlmmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainer() {
		return containerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainer_Contains() {
		return (EReference)containerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContained() {
		return containedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContained_RepositoryId() {
		return (EAttribute)containedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContained_Version() {
		return (EAttribute)containedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContained_AbsoluteName() {
		return (EAttribute)containedEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContained_DefinedIn() {
		return (EReference)containedEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceDef() {
		return interfaceDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterfaceDef_IsAbstract() {
		return (EAttribute)interfaceDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterfaceDef_IsCustom() {
		return (EAttribute)interfaceDefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterfaceDef_IsTruncatable() {
		return (EAttribute)interfaceDefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceDef_DerivesFrom() {
		return (EReference)interfaceDefEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceDef_Forward() {
		return (EReference)interfaceDefEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModuleDef() {
		return moduleDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModuleDef_Prefix() {
		return (EAttribute)moduleDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIDLType() {
		return idlTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIDLType_TypeCode() {
		return (EAttribute)idlTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationDef() {
		return operationDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDef_Parameters() {
		return (EReference)operationDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationDef_IsOneway() {
		return (EAttribute)operationDefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationDef_Contexts() {
		return (EAttribute)operationDefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDef_CanRaise() {
		return (EReference)operationDefEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeDef() {
		return attributeDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeDef_GetRaises() {
		return (EReference)attributeDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeDef_SetRaises() {
		return (EReference)attributeDefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeDef_IsReadonly() {
		return (EAttribute)attributeDefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstantDef() {
		return constantDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstantDef_ConstValue() {
		return (EReference)constantDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTyped() {
		return typedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTyped_ContainedType() {
		return (EReference)typedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTyped_SharedType() {
		return (EReference)typedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterDef() {
		return parameterDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterDef_Identifier() {
		return (EAttribute)parameterDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterDef_Direction() {
		return (EAttribute)parameterDefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveDef() {
		return primitiveDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrimitiveDef_Kind() {
		return (EAttribute)primitiveDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExceptionDef() {
		return exceptionDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExceptionDef_TypeCode() {
		return (EAttribute)exceptionDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExceptionDef_Members() {
		return (EReference)exceptionDefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getField() {
		return fieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getField_Identifier() {
		return (EAttribute)fieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFixedDef() {
		return fixedDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFixedDef_Digits() {
		return (EReference)fixedDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFixedDef_Scale() {
		return (EReference)fixedDefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWstringDef() {
		return wstringDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWstringDef_Bound() {
		return (EReference)wstringDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringDef() {
		return stringDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStringDef_Bound() {
		return (EReference)stringDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAliasDef() {
		return aliasDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayDef() {
		return arrayDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArrayDef_Name() {
		return (EAttribute)arrayDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayDef_Bounds() {
		return (EReference)arrayDefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequenceDef() {
		return sequenceDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceDef_Bound() {
		return (EReference)sequenceDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnionField() {
		return unionFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnionField_Identifier() {
		return (EAttribute)unionFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnionField_Label() {
		return (EReference)unionFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnionField_IsDefault() {
		return (EAttribute)unionFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypedefDef() {
		return typedefDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnionDef() {
		return unionDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnionDef_UnionMembers() {
		return (EReference)unionDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnionDef_ContainedDiscrim() {
		return (EReference)unionDefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnionDef_SharedDiscrim() {
		return (EReference)unionDefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumDef() {
		return enumDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumDef_Members() {
		return (EReference)enumDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructDef() {
		return structDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructDef_Members() {
		return (EReference)structDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTranslationUnit() {
		return translationUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTranslationUnit_Contains() {
		return (EReference)translationUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTranslationUnit_Identifier() {
		return (EAttribute)translationUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTranslationUnit_Includes() {
		return (EReference)translationUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInclude() {
		return includeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInclude_ImportURI() {
		return (EAttribute)includeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInclude_TranslationUnit() {
		return (EReference)includeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryExpression() {
		return binaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryExpression_Left() {
		return (EReference)binaryExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryExpression_Right() {
		return (EReference)binaryExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinaryExpression_Operator() {
		return (EAttribute)binaryExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryExpression() {
		return unaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnaryExpression_Expression() {
		return (EReference)unaryExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnaryExpression_Operator() {
		return (EAttribute)unaryExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralExpression() {
		return literalExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstantDefRef() {
		return constantDefRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstantDefRef_Constant() {
		return (EReference)constantDefRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueExpression() {
		return valueExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueExpression_Value() {
		return (EAttribute)valueExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForwardDef() {
		return forwardDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForwardDef_Definition() {
		return (EReference)forwardDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumMember() {
		return enumMemberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumMember_Enum() {
		return (EReference)enumMemberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstant() {
		return constantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Identifier() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getParameterMode() {
		return parameterModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPrimitiveKind() {
		return primitiveKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEAny() {
		return eAnyEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getETypeCode() {
		return eTypeCodeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdlmmFactory getIdlmmFactory() {
		return (IdlmmFactory)getEFactoryInstance();
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
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		containerEClass = createEClass(CONTAINER);
		createEReference(containerEClass, CONTAINER__CONTAINS);

		containedEClass = createEClass(CONTAINED);
		createEAttribute(containedEClass, CONTAINED__REPOSITORY_ID);
		createEAttribute(containedEClass, CONTAINED__VERSION);
		createEAttribute(containedEClass, CONTAINED__ABSOLUTE_NAME);
		createEReference(containedEClass, CONTAINED__DEFINED_IN);

		interfaceDefEClass = createEClass(INTERFACE_DEF);
		createEAttribute(interfaceDefEClass, INTERFACE_DEF__IS_ABSTRACT);
		createEAttribute(interfaceDefEClass, INTERFACE_DEF__IS_CUSTOM);
		createEAttribute(interfaceDefEClass, INTERFACE_DEF__IS_TRUNCATABLE);
		createEReference(interfaceDefEClass, INTERFACE_DEF__DERIVES_FROM);
		createEReference(interfaceDefEClass, INTERFACE_DEF__FORWARD);

		moduleDefEClass = createEClass(MODULE_DEF);
		createEAttribute(moduleDefEClass, MODULE_DEF__PREFIX);

		idlTypeEClass = createEClass(IDL_TYPE);
		createEAttribute(idlTypeEClass, IDL_TYPE__TYPE_CODE);

		operationDefEClass = createEClass(OPERATION_DEF);
		createEReference(operationDefEClass, OPERATION_DEF__PARAMETERS);
		createEAttribute(operationDefEClass, OPERATION_DEF__IS_ONEWAY);
		createEAttribute(operationDefEClass, OPERATION_DEF__CONTEXTS);
		createEReference(operationDefEClass, OPERATION_DEF__CAN_RAISE);

		attributeDefEClass = createEClass(ATTRIBUTE_DEF);
		createEReference(attributeDefEClass, ATTRIBUTE_DEF__GET_RAISES);
		createEReference(attributeDefEClass, ATTRIBUTE_DEF__SET_RAISES);
		createEAttribute(attributeDefEClass, ATTRIBUTE_DEF__IS_READONLY);

		constantDefEClass = createEClass(CONSTANT_DEF);
		createEReference(constantDefEClass, CONSTANT_DEF__CONST_VALUE);

		typedEClass = createEClass(TYPED);
		createEReference(typedEClass, TYPED__CONTAINED_TYPE);
		createEReference(typedEClass, TYPED__SHARED_TYPE);

		parameterDefEClass = createEClass(PARAMETER_DEF);
		createEAttribute(parameterDefEClass, PARAMETER_DEF__IDENTIFIER);
		createEAttribute(parameterDefEClass, PARAMETER_DEF__DIRECTION);

		primitiveDefEClass = createEClass(PRIMITIVE_DEF);
		createEAttribute(primitiveDefEClass, PRIMITIVE_DEF__KIND);

		exceptionDefEClass = createEClass(EXCEPTION_DEF);
		createEAttribute(exceptionDefEClass, EXCEPTION_DEF__TYPE_CODE);
		createEReference(exceptionDefEClass, EXCEPTION_DEF__MEMBERS);

		fieldEClass = createEClass(FIELD);
		createEAttribute(fieldEClass, FIELD__IDENTIFIER);

		fixedDefEClass = createEClass(FIXED_DEF);
		createEReference(fixedDefEClass, FIXED_DEF__DIGITS);
		createEReference(fixedDefEClass, FIXED_DEF__SCALE);

		wstringDefEClass = createEClass(WSTRING_DEF);
		createEReference(wstringDefEClass, WSTRING_DEF__BOUND);

		stringDefEClass = createEClass(STRING_DEF);
		createEReference(stringDefEClass, STRING_DEF__BOUND);

		aliasDefEClass = createEClass(ALIAS_DEF);

		arrayDefEClass = createEClass(ARRAY_DEF);
		createEAttribute(arrayDefEClass, ARRAY_DEF__NAME);
		createEReference(arrayDefEClass, ARRAY_DEF__BOUNDS);

		sequenceDefEClass = createEClass(SEQUENCE_DEF);
		createEReference(sequenceDefEClass, SEQUENCE_DEF__BOUND);

		unionFieldEClass = createEClass(UNION_FIELD);
		createEAttribute(unionFieldEClass, UNION_FIELD__IDENTIFIER);
		createEReference(unionFieldEClass, UNION_FIELD__LABEL);
		createEAttribute(unionFieldEClass, UNION_FIELD__IS_DEFAULT);

		typedefDefEClass = createEClass(TYPEDEF_DEF);

		unionDefEClass = createEClass(UNION_DEF);
		createEReference(unionDefEClass, UNION_DEF__UNION_MEMBERS);
		createEReference(unionDefEClass, UNION_DEF__CONTAINED_DISCRIM);
		createEReference(unionDefEClass, UNION_DEF__SHARED_DISCRIM);

		enumDefEClass = createEClass(ENUM_DEF);
		createEReference(enumDefEClass, ENUM_DEF__MEMBERS);

		structDefEClass = createEClass(STRUCT_DEF);
		createEReference(structDefEClass, STRUCT_DEF__MEMBERS);

		translationUnitEClass = createEClass(TRANSLATION_UNIT);
		createEReference(translationUnitEClass, TRANSLATION_UNIT__CONTAINS);
		createEAttribute(translationUnitEClass, TRANSLATION_UNIT__IDENTIFIER);
		createEReference(translationUnitEClass, TRANSLATION_UNIT__INCLUDES);

		includeEClass = createEClass(INCLUDE);
		createEAttribute(includeEClass, INCLUDE__IMPORT_URI);
		createEReference(includeEClass, INCLUDE__TRANSLATION_UNIT);

		expressionEClass = createEClass(EXPRESSION);

		binaryExpressionEClass = createEClass(BINARY_EXPRESSION);
		createEReference(binaryExpressionEClass, BINARY_EXPRESSION__LEFT);
		createEReference(binaryExpressionEClass, BINARY_EXPRESSION__RIGHT);
		createEAttribute(binaryExpressionEClass, BINARY_EXPRESSION__OPERATOR);

		unaryExpressionEClass = createEClass(UNARY_EXPRESSION);
		createEReference(unaryExpressionEClass, UNARY_EXPRESSION__EXPRESSION);
		createEAttribute(unaryExpressionEClass, UNARY_EXPRESSION__OPERATOR);

		literalExpressionEClass = createEClass(LITERAL_EXPRESSION);

		constantDefRefEClass = createEClass(CONSTANT_DEF_REF);
		createEReference(constantDefRefEClass, CONSTANT_DEF_REF__CONSTANT);

		valueExpressionEClass = createEClass(VALUE_EXPRESSION);
		createEAttribute(valueExpressionEClass, VALUE_EXPRESSION__VALUE);

		forwardDefEClass = createEClass(FORWARD_DEF);
		createEReference(forwardDefEClass, FORWARD_DEF__DEFINITION);

		enumMemberEClass = createEClass(ENUM_MEMBER);
		createEReference(enumMemberEClass, ENUM_MEMBER__ENUM);

		constantEClass = createEClass(CONSTANT);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__IDENTIFIER);

		// Create enums
		parameterModeEEnum = createEEnum(PARAMETER_MODE);
		primitiveKindEEnum = createEEnum(PRIMITIVE_KIND);

		// Create data types
		eAnyEDataType = createEDataType(EANY);
		eTypeCodeEDataType = createEDataType(ETYPE_CODE);
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
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		containerEClass.getESuperTypes().add(this.getContained());
		containedEClass.getESuperTypes().add(this.getNamedElement());
		interfaceDefEClass.getESuperTypes().add(this.getContainer());
		interfaceDefEClass.getESuperTypes().add(this.getTypedefDef());
		moduleDefEClass.getESuperTypes().add(this.getContainer());
		operationDefEClass.getESuperTypes().add(this.getContained());
		operationDefEClass.getESuperTypes().add(this.getTyped());
		attributeDefEClass.getESuperTypes().add(this.getContained());
		attributeDefEClass.getESuperTypes().add(this.getTyped());
		constantDefEClass.getESuperTypes().add(this.getContained());
		constantDefEClass.getESuperTypes().add(this.getTyped());
		constantDefEClass.getESuperTypes().add(this.getConstant());
		parameterDefEClass.getESuperTypes().add(this.getTyped());
		primitiveDefEClass.getESuperTypes().add(this.getIDLType());
		exceptionDefEClass.getESuperTypes().add(this.getContained());
		fieldEClass.getESuperTypes().add(this.getTyped());
		fixedDefEClass.getESuperTypes().add(this.getIDLType());
		wstringDefEClass.getESuperTypes().add(this.getIDLType());
		stringDefEClass.getESuperTypes().add(this.getIDLType());
		aliasDefEClass.getESuperTypes().add(this.getTyped());
		aliasDefEClass.getESuperTypes().add(this.getTypedefDef());
		arrayDefEClass.getESuperTypes().add(this.getTyped());
		arrayDefEClass.getESuperTypes().add(this.getIDLType());
		sequenceDefEClass.getESuperTypes().add(this.getTyped());
		sequenceDefEClass.getESuperTypes().add(this.getIDLType());
		unionFieldEClass.getESuperTypes().add(this.getTyped());
		typedefDefEClass.getESuperTypes().add(this.getIDLType());
		typedefDefEClass.getESuperTypes().add(this.getContained());
		unionDefEClass.getESuperTypes().add(this.getTypedefDef());
		enumDefEClass.getESuperTypes().add(this.getTypedefDef());
		structDefEClass.getESuperTypes().add(this.getTypedefDef());
		binaryExpressionEClass.getESuperTypes().add(this.getExpression());
		unaryExpressionEClass.getESuperTypes().add(this.getExpression());
		literalExpressionEClass.getESuperTypes().add(this.getExpression());
		constantDefRefEClass.getESuperTypes().add(this.getLiteralExpression());
		valueExpressionEClass.getESuperTypes().add(this.getLiteralExpression());
		forwardDefEClass.getESuperTypes().add(this.getContained());
		enumMemberEClass.getESuperTypes().add(this.getConstant());
		constantEClass.getESuperTypes().add(this.getContained());

		// Initialize classes and features; add operations and parameters
		initEClass(containerEClass, org.csu.idl.idlmm.Container.class, "Container", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainer_Contains(), this.getContained(), this.getContained_DefinedIn(), "contains", null, 0, -1, org.csu.idl.idlmm.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containedEClass, Contained.class, "Contained", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContained_RepositoryId(), ecorePackage.getEString(), "repositoryId", null, 0, 1, Contained.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContained_Version(), ecorePackage.getEString(), "version", null, 0, 1, Contained.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContained_AbsoluteName(), ecorePackage.getEString(), "absoluteName", null, 0, 1, Contained.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContained_DefinedIn(), this.getContainer(), this.getContainer_Contains(), "definedIn", null, 0, 1, Contained.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceDefEClass, InterfaceDef.class, "InterfaceDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInterfaceDef_IsAbstract(), ecorePackage.getEBoolean(), "isAbstract", null, 0, 1, InterfaceDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterfaceDef_IsCustom(), ecorePackage.getEBoolean(), "isCustom", null, 0, 1, InterfaceDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterfaceDef_IsTruncatable(), ecorePackage.getEBoolean(), "isTruncatable", null, 0, 1, InterfaceDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterfaceDef_DerivesFrom(), this.getInterfaceDef(), null, "derivesFrom", null, 0, -1, InterfaceDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterfaceDef_Forward(), this.getForwardDef(), null, "forward", null, 0, 1, InterfaceDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moduleDefEClass, ModuleDef.class, "ModuleDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModuleDef_Prefix(), ecorePackage.getEString(), "prefix", null, 0, 1, ModuleDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(idlTypeEClass, IDLType.class, "IDLType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIDLType_TypeCode(), this.getETypeCode(), "typeCode", null, 0, 1, IDLType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationDefEClass, OperationDef.class, "OperationDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationDef_Parameters(), this.getParameterDef(), null, "parameters", null, 0, -1, OperationDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperationDef_IsOneway(), ecorePackage.getEBoolean(), "isOneway", null, 0, 1, OperationDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperationDef_Contexts(), ecorePackage.getEString(), "contexts", null, 0, -1, OperationDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationDef_CanRaise(), this.getExceptionDef(), null, "canRaise", null, 0, -1, OperationDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeDefEClass, AttributeDef.class, "AttributeDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeDef_GetRaises(), this.getExceptionDef(), null, "getRaises", null, 0, -1, AttributeDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeDef_SetRaises(), this.getExceptionDef(), null, "setRaises", null, 0, -1, AttributeDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeDef_IsReadonly(), ecorePackage.getEBoolean(), "isReadonly", null, 0, 1, AttributeDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constantDefEClass, ConstantDef.class, "ConstantDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstantDef_ConstValue(), this.getExpression(), null, "constValue", null, 1, 1, ConstantDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typedEClass, Typed.class, "Typed", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTyped_ContainedType(), this.getIDLType(), null, "containedType", null, 0, 1, Typed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTyped_SharedType(), this.getTypedefDef(), null, "sharedType", null, 0, 1, Typed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterDefEClass, ParameterDef.class, "ParameterDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameterDef_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1, ParameterDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterDef_Direction(), this.getParameterMode(), "direction", null, 0, 1, ParameterDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(primitiveDefEClass, PrimitiveDef.class, "PrimitiveDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrimitiveDef_Kind(), this.getPrimitiveKind(), "kind", null, 0, 1, PrimitiveDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exceptionDefEClass, ExceptionDef.class, "ExceptionDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExceptionDef_TypeCode(), this.getETypeCode(), "typeCode", null, 0, 1, ExceptionDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExceptionDef_Members(), this.getField(), null, "members", null, 0, -1, ExceptionDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fieldEClass, Field.class, "Field", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getField_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fixedDefEClass, FixedDef.class, "FixedDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFixedDef_Digits(), this.getExpression(), null, "digits", null, 1, 1, FixedDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFixedDef_Scale(), this.getExpression(), null, "scale", null, 1, 1, FixedDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wstringDefEClass, WstringDef.class, "WstringDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWstringDef_Bound(), this.getExpression(), null, "bound", null, 0, 1, WstringDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringDefEClass, StringDef.class, "StringDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStringDef_Bound(), this.getExpression(), null, "bound", null, 0, 1, StringDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aliasDefEClass, AliasDef.class, "AliasDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arrayDefEClass, ArrayDef.class, "ArrayDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArrayDef_Name(), ecorePackage.getEString(), "name", null, 0, 1, ArrayDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArrayDef_Bounds(), this.getExpression(), null, "bounds", null, 1, -1, ArrayDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sequenceDefEClass, SequenceDef.class, "SequenceDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSequenceDef_Bound(), this.getExpression(), null, "bound", null, 0, 1, SequenceDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unionFieldEClass, UnionField.class, "UnionField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnionField_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1, UnionField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnionField_Label(), this.getExpression(), null, "label", null, 0, -1, UnionField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnionField_IsDefault(), ecorePackage.getEBoolean(), "isDefault", "false", 0, 1, UnionField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typedefDefEClass, TypedefDef.class, "TypedefDef", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unionDefEClass, UnionDef.class, "UnionDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnionDef_UnionMembers(), this.getUnionField(), null, "unionMembers", null, 0, -1, UnionDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnionDef_ContainedDiscrim(), this.getIDLType(), null, "containedDiscrim", null, 0, 1, UnionDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnionDef_SharedDiscrim(), this.getTypedefDef(), null, "sharedDiscrim", null, 0, 1, UnionDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumDefEClass, EnumDef.class, "EnumDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumDef_Members(), this.getEnumMember(), this.getEnumMember_Enum(), "members", null, 1, -1, EnumDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structDefEClass, StructDef.class, "StructDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructDef_Members(), this.getField(), null, "members", null, 0, -1, StructDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(translationUnitEClass, TranslationUnit.class, "TranslationUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTranslationUnit_Contains(), this.getContained(), null, "contains", null, 0, -1, TranslationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTranslationUnit_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1, TranslationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTranslationUnit_Includes(), this.getInclude(), null, "includes", null, 0, -1, TranslationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(includeEClass, Include.class, "Include", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInclude_ImportURI(), ecorePackage.getEString(), "importURI", null, 0, 1, Include.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInclude_TranslationUnit(), this.getTranslationUnit(), null, "translationUnit", null, 0, 1, Include.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionEClass, Expression.class, "Expression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(binaryExpressionEClass, BinaryExpression.class, "BinaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinaryExpression_Left(), this.getExpression(), null, "left", null, 1, 1, BinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryExpression_Right(), this.getExpression(), null, "right", null, 1, 1, BinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBinaryExpression_Operator(), ecorePackage.getEString(), "operator", null, 1, 1, BinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unaryExpressionEClass, UnaryExpression.class, "UnaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnaryExpression_Expression(), this.getExpression(), null, "expression", null, 1, 1, UnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnaryExpression_Operator(), ecorePackage.getEString(), "operator", null, 1, 1, UnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(literalExpressionEClass, LiteralExpression.class, "LiteralExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(constantDefRefEClass, ConstantDefRef.class, "ConstantDefRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstantDefRef_Constant(), this.getConstant(), null, "constant", null, 1, 1, ConstantDefRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueExpressionEClass, ValueExpression.class, "ValueExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValueExpression_Value(), ecorePackage.getEString(), "value", null, 1, 1, ValueExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(forwardDefEClass, ForwardDef.class, "ForwardDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getForwardDef_Definition(), this.getInterfaceDef(), null, "definition", null, 0, 1, ForwardDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumMemberEClass, EnumMember.class, "EnumMember", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumMember_Enum(), this.getEnumDef(), this.getEnumDef_Members(), "enum", null, 1, 1, EnumMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constantEClass, Constant.class, "Constant", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(parameterModeEEnum, ParameterMode.class, "ParameterMode");
		addEEnumLiteral(parameterModeEEnum, ParameterMode.PARAM_IN);
		addEEnumLiteral(parameterModeEEnum, ParameterMode.PARAM_OUT);
		addEEnumLiteral(parameterModeEEnum, ParameterMode.PARAM_INOUT);

		initEEnum(primitiveKindEEnum, PrimitiveKind.class, "PrimitiveKind");
		addEEnumLiteral(primitiveKindEEnum, PrimitiveKind.PK_NULL);
		addEEnumLiteral(primitiveKindEEnum, PrimitiveKind.PK_VOID);
		addEEnumLiteral(primitiveKindEEnum, PrimitiveKind.PK_SHORT);
		addEEnumLiteral(primitiveKindEEnum, PrimitiveKind.PK_LONG);
		addEEnumLiteral(primitiveKindEEnum, PrimitiveKind.PK_USHORT);
		addEEnumLiteral(primitiveKindEEnum, PrimitiveKind.PK_ULONG);
		addEEnumLiteral(primitiveKindEEnum, PrimitiveKind.PK_FLOAT);
		addEEnumLiteral(primitiveKindEEnum, PrimitiveKind.PK_DOUBLE);
		addEEnumLiteral(primitiveKindEEnum, PrimitiveKind.PK_BOOLEAN);
		addEEnumLiteral(primitiveKindEEnum, PrimitiveKind.PK_CHAR);
		addEEnumLiteral(primitiveKindEEnum, PrimitiveKind.PK_OCTET);
		addEEnumLiteral(primitiveKindEEnum, PrimitiveKind.PK_ANY);
		addEEnumLiteral(primitiveKindEEnum, PrimitiveKind.PK_LONGDOUBLE);
		addEEnumLiteral(primitiveKindEEnum, PrimitiveKind.PK_WSTRING);
		addEEnumLiteral(primitiveKindEEnum, PrimitiveKind.PK_TYPECODE);
		addEEnumLiteral(primitiveKindEEnum, PrimitiveKind.PK_WCHAR);
		addEEnumLiteral(primitiveKindEEnum, PrimitiveKind.PK_PRINCIPAL);
		addEEnumLiteral(primitiveKindEEnum, PrimitiveKind.PK_STRING);
		addEEnumLiteral(primitiveKindEEnum, PrimitiveKind.PK_ULONGLONG);
		addEEnumLiteral(primitiveKindEEnum, PrimitiveKind.PK_OBJREF);
		addEEnumLiteral(primitiveKindEEnum, PrimitiveKind.PK_LONGLONG);

		// Initialize data types
		initEDataType(eAnyEDataType, String.class, "EAny", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eTypeCodeEDataType, String.class, "ETypeCode", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
		addAnnotation
		  (getNamedElement_Identifier(), 
		   source, 
		   new String[] {
			 "namespace", ""
		   });
	}

} //IdlmmPackageImpl
