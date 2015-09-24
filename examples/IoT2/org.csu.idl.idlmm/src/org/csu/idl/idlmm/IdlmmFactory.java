/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.csu.idl.idlmm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.csu.idl.idlmm.IdlmmPackage
 * @generated
 */
public interface IdlmmFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IdlmmFactory eINSTANCE = org.csu.idl.idlmm.impl.IdlmmFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Interface Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface Def</em>'.
	 * @generated
	 */
	InterfaceDef createInterfaceDef();

	/**
	 * Returns a new object of class '<em>Module Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module Def</em>'.
	 * @generated
	 */
	ModuleDef createModuleDef();

	/**
	 * Returns a new object of class '<em>Operation Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation Def</em>'.
	 * @generated
	 */
	OperationDef createOperationDef();

	/**
	 * Returns a new object of class '<em>Attribute Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Def</em>'.
	 * @generated
	 */
	AttributeDef createAttributeDef();

	/**
	 * Returns a new object of class '<em>Constant Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constant Def</em>'.
	 * @generated
	 */
	ConstantDef createConstantDef();

	/**
	 * Returns a new object of class '<em>Parameter Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Def</em>'.
	 * @generated
	 */
	ParameterDef createParameterDef();

	/**
	 * Returns a new object of class '<em>Primitive Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Def</em>'.
	 * @generated
	 */
	PrimitiveDef createPrimitiveDef();

	/**
	 * Returns a new object of class '<em>Exception Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exception Def</em>'.
	 * @generated
	 */
	ExceptionDef createExceptionDef();

	/**
	 * Returns a new object of class '<em>Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field</em>'.
	 * @generated
	 */
	Field createField();

	/**
	 * Returns a new object of class '<em>Fixed Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fixed Def</em>'.
	 * @generated
	 */
	FixedDef createFixedDef();

	/**
	 * Returns a new object of class '<em>Wstring Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wstring Def</em>'.
	 * @generated
	 */
	WstringDef createWstringDef();

	/**
	 * Returns a new object of class '<em>String Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Def</em>'.
	 * @generated
	 */
	StringDef createStringDef();

	/**
	 * Returns a new object of class '<em>Alias Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alias Def</em>'.
	 * @generated
	 */
	AliasDef createAliasDef();

	/**
	 * Returns a new object of class '<em>Array Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array Def</em>'.
	 * @generated
	 */
	ArrayDef createArrayDef();

	/**
	 * Returns a new object of class '<em>Sequence Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequence Def</em>'.
	 * @generated
	 */
	SequenceDef createSequenceDef();

	/**
	 * Returns a new object of class '<em>Union Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Union Field</em>'.
	 * @generated
	 */
	UnionField createUnionField();

	/**
	 * Returns a new object of class '<em>Union Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Union Def</em>'.
	 * @generated
	 */
	UnionDef createUnionDef();

	/**
	 * Returns a new object of class '<em>Enum Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enum Def</em>'.
	 * @generated
	 */
	EnumDef createEnumDef();

	/**
	 * Returns a new object of class '<em>Struct Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Struct Def</em>'.
	 * @generated
	 */
	StructDef createStructDef();

	/**
	 * Returns a new object of class '<em>Translation Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Translation Unit</em>'.
	 * @generated
	 */
	TranslationUnit createTranslationUnit();

	/**
	 * Returns a new object of class '<em>Include</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Include</em>'.
	 * @generated
	 */
	Include createInclude();

	/**
	 * Returns a new object of class '<em>Binary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binary Expression</em>'.
	 * @generated
	 */
	BinaryExpression createBinaryExpression();

	/**
	 * Returns a new object of class '<em>Unary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unary Expression</em>'.
	 * @generated
	 */
	UnaryExpression createUnaryExpression();

	/**
	 * Returns a new object of class '<em>Constant Def Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constant Def Ref</em>'.
	 * @generated
	 */
	ConstantDefRef createConstantDefRef();

	/**
	 * Returns a new object of class '<em>Value Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Expression</em>'.
	 * @generated
	 */
	ValueExpression createValueExpression();

	/**
	 * Returns a new object of class '<em>Forward Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Forward Def</em>'.
	 * @generated
	 */
	ForwardDef createForwardDef();

	/**
	 * Returns a new object of class '<em>Enum Member</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enum Member</em>'.
	 * @generated
	 */
	EnumMember createEnumMember();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	IdlmmPackage getIdlmmPackage();

} //IdlmmFactory
