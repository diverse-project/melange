/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.csu.idl.idlmm.util;

import org.csu.idl.idlmm.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.csu.idl.idlmm.IdlmmPackage
 * @generated
 */
public class IdlmmAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IdlmmPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdlmmAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = IdlmmPackage.eINSTANCE;
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
	protected IdlmmSwitch<Adapter> modelSwitch =
		new IdlmmSwitch<Adapter>() {
			@Override
			public Adapter caseContainer(Container object) {
				return createContainerAdapter();
			}
			@Override
			public Adapter caseContained(Contained object) {
				return createContainedAdapter();
			}
			@Override
			public Adapter caseInterfaceDef(InterfaceDef object) {
				return createInterfaceDefAdapter();
			}
			@Override
			public Adapter caseModuleDef(ModuleDef object) {
				return createModuleDefAdapter();
			}
			@Override
			public Adapter caseIDLType(IDLType object) {
				return createIDLTypeAdapter();
			}
			@Override
			public Adapter caseOperationDef(OperationDef object) {
				return createOperationDefAdapter();
			}
			@Override
			public Adapter caseAttributeDef(AttributeDef object) {
				return createAttributeDefAdapter();
			}
			@Override
			public Adapter caseConstantDef(ConstantDef object) {
				return createConstantDefAdapter();
			}
			@Override
			public Adapter caseTyped(Typed object) {
				return createTypedAdapter();
			}
			@Override
			public Adapter caseParameterDef(ParameterDef object) {
				return createParameterDefAdapter();
			}
			@Override
			public Adapter casePrimitiveDef(PrimitiveDef object) {
				return createPrimitiveDefAdapter();
			}
			@Override
			public Adapter caseExceptionDef(ExceptionDef object) {
				return createExceptionDefAdapter();
			}
			@Override
			public Adapter caseField(Field object) {
				return createFieldAdapter();
			}
			@Override
			public Adapter caseFixedDef(FixedDef object) {
				return createFixedDefAdapter();
			}
			@Override
			public Adapter caseWstringDef(WstringDef object) {
				return createWstringDefAdapter();
			}
			@Override
			public Adapter caseStringDef(StringDef object) {
				return createStringDefAdapter();
			}
			@Override
			public Adapter caseAliasDef(AliasDef object) {
				return createAliasDefAdapter();
			}
			@Override
			public Adapter caseArrayDef(ArrayDef object) {
				return createArrayDefAdapter();
			}
			@Override
			public Adapter caseSequenceDef(SequenceDef object) {
				return createSequenceDefAdapter();
			}
			@Override
			public Adapter caseUnionField(UnionField object) {
				return createUnionFieldAdapter();
			}
			@Override
			public Adapter caseTypedefDef(TypedefDef object) {
				return createTypedefDefAdapter();
			}
			@Override
			public Adapter caseUnionDef(UnionDef object) {
				return createUnionDefAdapter();
			}
			@Override
			public Adapter caseEnumDef(EnumDef object) {
				return createEnumDefAdapter();
			}
			@Override
			public Adapter caseStructDef(StructDef object) {
				return createStructDefAdapter();
			}
			@Override
			public Adapter caseTranslationUnit(TranslationUnit object) {
				return createTranslationUnitAdapter();
			}
			@Override
			public Adapter caseInclude(Include object) {
				return createIncludeAdapter();
			}
			@Override
			public Adapter caseExpression(Expression object) {
				return createExpressionAdapter();
			}
			@Override
			public Adapter caseBinaryExpression(BinaryExpression object) {
				return createBinaryExpressionAdapter();
			}
			@Override
			public Adapter caseUnaryExpression(UnaryExpression object) {
				return createUnaryExpressionAdapter();
			}
			@Override
			public Adapter caseLiteralExpression(LiteralExpression object) {
				return createLiteralExpressionAdapter();
			}
			@Override
			public Adapter caseConstantDefRef(ConstantDefRef object) {
				return createConstantDefRefAdapter();
			}
			@Override
			public Adapter caseValueExpression(ValueExpression object) {
				return createValueExpressionAdapter();
			}
			@Override
			public Adapter caseForwardDef(ForwardDef object) {
				return createForwardDefAdapter();
			}
			@Override
			public Adapter caseEnumMember(EnumMember object) {
				return createEnumMemberAdapter();
			}
			@Override
			public Adapter caseConstant(Constant object) {
				return createConstantAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
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
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.csu.idl.idlmm.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.idl.idlmm.Container
	 * @generated
	 */
	public Adapter createContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.idl.idlmm.Contained <em>Contained</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.idl.idlmm.Contained
	 * @generated
	 */
	public Adapter createContainedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.idl.idlmm.InterfaceDef <em>Interface Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.idl.idlmm.InterfaceDef
	 * @generated
	 */
	public Adapter createInterfaceDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.idl.idlmm.ModuleDef <em>Module Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.idl.idlmm.ModuleDef
	 * @generated
	 */
	public Adapter createModuleDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.idl.idlmm.IDLType <em>IDL Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.idl.idlmm.IDLType
	 * @generated
	 */
	public Adapter createIDLTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.idl.idlmm.OperationDef <em>Operation Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.idl.idlmm.OperationDef
	 * @generated
	 */
	public Adapter createOperationDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.idl.idlmm.AttributeDef <em>Attribute Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.idl.idlmm.AttributeDef
	 * @generated
	 */
	public Adapter createAttributeDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.idl.idlmm.ConstantDef <em>Constant Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.idl.idlmm.ConstantDef
	 * @generated
	 */
	public Adapter createConstantDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.idl.idlmm.Typed <em>Typed</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.idl.idlmm.Typed
	 * @generated
	 */
	public Adapter createTypedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.idl.idlmm.ParameterDef <em>Parameter Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.idl.idlmm.ParameterDef
	 * @generated
	 */
	public Adapter createParameterDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.idl.idlmm.PrimitiveDef <em>Primitive Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.idl.idlmm.PrimitiveDef
	 * @generated
	 */
	public Adapter createPrimitiveDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.idl.idlmm.ExceptionDef <em>Exception Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.idl.idlmm.ExceptionDef
	 * @generated
	 */
	public Adapter createExceptionDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.idl.idlmm.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.idl.idlmm.Field
	 * @generated
	 */
	public Adapter createFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.idl.idlmm.FixedDef <em>Fixed Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.idl.idlmm.FixedDef
	 * @generated
	 */
	public Adapter createFixedDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.idl.idlmm.WstringDef <em>Wstring Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.idl.idlmm.WstringDef
	 * @generated
	 */
	public Adapter createWstringDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.idl.idlmm.StringDef <em>String Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.idl.idlmm.StringDef
	 * @generated
	 */
	public Adapter createStringDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.idl.idlmm.AliasDef <em>Alias Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.idl.idlmm.AliasDef
	 * @generated
	 */
	public Adapter createAliasDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.idl.idlmm.ArrayDef <em>Array Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.idl.idlmm.ArrayDef
	 * @generated
	 */
	public Adapter createArrayDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.idl.idlmm.SequenceDef <em>Sequence Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.idl.idlmm.SequenceDef
	 * @generated
	 */
	public Adapter createSequenceDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.idl.idlmm.UnionField <em>Union Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.idl.idlmm.UnionField
	 * @generated
	 */
	public Adapter createUnionFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.idl.idlmm.TypedefDef <em>Typedef Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.idl.idlmm.TypedefDef
	 * @generated
	 */
	public Adapter createTypedefDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.idl.idlmm.UnionDef <em>Union Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.idl.idlmm.UnionDef
	 * @generated
	 */
	public Adapter createUnionDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.idl.idlmm.EnumDef <em>Enum Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.idl.idlmm.EnumDef
	 * @generated
	 */
	public Adapter createEnumDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.idl.idlmm.StructDef <em>Struct Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.idl.idlmm.StructDef
	 * @generated
	 */
	public Adapter createStructDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.idl.idlmm.TranslationUnit <em>Translation Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.idl.idlmm.TranslationUnit
	 * @generated
	 */
	public Adapter createTranslationUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.idl.idlmm.Include <em>Include</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.idl.idlmm.Include
	 * @generated
	 */
	public Adapter createIncludeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.idl.idlmm.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.idl.idlmm.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.idl.idlmm.BinaryExpression <em>Binary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.idl.idlmm.BinaryExpression
	 * @generated
	 */
	public Adapter createBinaryExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.idl.idlmm.UnaryExpression <em>Unary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.idl.idlmm.UnaryExpression
	 * @generated
	 */
	public Adapter createUnaryExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.idl.idlmm.LiteralExpression <em>Literal Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.idl.idlmm.LiteralExpression
	 * @generated
	 */
	public Adapter createLiteralExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.idl.idlmm.ConstantDefRef <em>Constant Def Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.idl.idlmm.ConstantDefRef
	 * @generated
	 */
	public Adapter createConstantDefRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.idl.idlmm.ValueExpression <em>Value Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.idl.idlmm.ValueExpression
	 * @generated
	 */
	public Adapter createValueExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.idl.idlmm.ForwardDef <em>Forward Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.idl.idlmm.ForwardDef
	 * @generated
	 */
	public Adapter createForwardDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.idl.idlmm.EnumMember <em>Enum Member</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.idl.idlmm.EnumMember
	 * @generated
	 */
	public Adapter createEnumMemberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.idl.idlmm.Constant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.idl.idlmm.Constant
	 * @generated
	 */
	public Adapter createConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.idl.idlmm.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.idl.idlmm.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
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
	public Adapter createEObjectAdapter() {
		return null;
	}

} //IdlmmAdapterFactory
