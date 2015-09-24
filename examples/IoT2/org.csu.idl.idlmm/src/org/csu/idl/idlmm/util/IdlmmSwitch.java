/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.csu.idl.idlmm.util;

import java.util.List;

import org.csu.idl.idlmm.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

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
 * @see org.csu.idl.idlmm.IdlmmPackage
 * @generated
 */
public class IdlmmSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IdlmmPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdlmmSwitch() {
		if (modelPackage == null) {
			modelPackage = IdlmmPackage.eINSTANCE;
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
	protected boolean isSwitchFor(EPackage ePackage) {
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
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case IdlmmPackage.CONTAINER: {
				Container container = (Container)theEObject;
				T result = caseContainer(container);
				if (result == null) result = caseContained(container);
				if (result == null) result = caseNamedElement(container);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IdlmmPackage.CONTAINED: {
				Contained contained = (Contained)theEObject;
				T result = caseContained(contained);
				if (result == null) result = caseNamedElement(contained);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IdlmmPackage.INTERFACE_DEF: {
				InterfaceDef interfaceDef = (InterfaceDef)theEObject;
				T result = caseInterfaceDef(interfaceDef);
				if (result == null) result = caseContainer(interfaceDef);
				if (result == null) result = caseTypedefDef(interfaceDef);
				if (result == null) result = caseContained(interfaceDef);
				if (result == null) result = caseIDLType(interfaceDef);
				if (result == null) result = caseNamedElement(interfaceDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IdlmmPackage.MODULE_DEF: {
				ModuleDef moduleDef = (ModuleDef)theEObject;
				T result = caseModuleDef(moduleDef);
				if (result == null) result = caseContainer(moduleDef);
				if (result == null) result = caseContained(moduleDef);
				if (result == null) result = caseNamedElement(moduleDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IdlmmPackage.IDL_TYPE: {
				IDLType idlType = (IDLType)theEObject;
				T result = caseIDLType(idlType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IdlmmPackage.OPERATION_DEF: {
				OperationDef operationDef = (OperationDef)theEObject;
				T result = caseOperationDef(operationDef);
				if (result == null) result = caseContained(operationDef);
				if (result == null) result = caseTyped(operationDef);
				if (result == null) result = caseNamedElement(operationDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IdlmmPackage.ATTRIBUTE_DEF: {
				AttributeDef attributeDef = (AttributeDef)theEObject;
				T result = caseAttributeDef(attributeDef);
				if (result == null) result = caseContained(attributeDef);
				if (result == null) result = caseTyped(attributeDef);
				if (result == null) result = caseNamedElement(attributeDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IdlmmPackage.CONSTANT_DEF: {
				ConstantDef constantDef = (ConstantDef)theEObject;
				T result = caseConstantDef(constantDef);
				if (result == null) result = caseTyped(constantDef);
				if (result == null) result = caseConstant(constantDef);
				if (result == null) result = caseContained(constantDef);
				if (result == null) result = caseNamedElement(constantDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IdlmmPackage.TYPED: {
				Typed typed = (Typed)theEObject;
				T result = caseTyped(typed);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IdlmmPackage.PARAMETER_DEF: {
				ParameterDef parameterDef = (ParameterDef)theEObject;
				T result = caseParameterDef(parameterDef);
				if (result == null) result = caseTyped(parameterDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IdlmmPackage.PRIMITIVE_DEF: {
				PrimitiveDef primitiveDef = (PrimitiveDef)theEObject;
				T result = casePrimitiveDef(primitiveDef);
				if (result == null) result = caseIDLType(primitiveDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IdlmmPackage.EXCEPTION_DEF: {
				ExceptionDef exceptionDef = (ExceptionDef)theEObject;
				T result = caseExceptionDef(exceptionDef);
				if (result == null) result = caseContained(exceptionDef);
				if (result == null) result = caseNamedElement(exceptionDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IdlmmPackage.FIELD: {
				Field field = (Field)theEObject;
				T result = caseField(field);
				if (result == null) result = caseTyped(field);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IdlmmPackage.FIXED_DEF: {
				FixedDef fixedDef = (FixedDef)theEObject;
				T result = caseFixedDef(fixedDef);
				if (result == null) result = caseIDLType(fixedDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IdlmmPackage.WSTRING_DEF: {
				WstringDef wstringDef = (WstringDef)theEObject;
				T result = caseWstringDef(wstringDef);
				if (result == null) result = caseIDLType(wstringDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IdlmmPackage.STRING_DEF: {
				StringDef stringDef = (StringDef)theEObject;
				T result = caseStringDef(stringDef);
				if (result == null) result = caseIDLType(stringDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IdlmmPackage.ALIAS_DEF: {
				AliasDef aliasDef = (AliasDef)theEObject;
				T result = caseAliasDef(aliasDef);
				if (result == null) result = caseTyped(aliasDef);
				if (result == null) result = caseTypedefDef(aliasDef);
				if (result == null) result = caseIDLType(aliasDef);
				if (result == null) result = caseContained(aliasDef);
				if (result == null) result = caseNamedElement(aliasDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IdlmmPackage.ARRAY_DEF: {
				ArrayDef arrayDef = (ArrayDef)theEObject;
				T result = caseArrayDef(arrayDef);
				if (result == null) result = caseTyped(arrayDef);
				if (result == null) result = caseIDLType(arrayDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IdlmmPackage.SEQUENCE_DEF: {
				SequenceDef sequenceDef = (SequenceDef)theEObject;
				T result = caseSequenceDef(sequenceDef);
				if (result == null) result = caseTyped(sequenceDef);
				if (result == null) result = caseIDLType(sequenceDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IdlmmPackage.UNION_FIELD: {
				UnionField unionField = (UnionField)theEObject;
				T result = caseUnionField(unionField);
				if (result == null) result = caseTyped(unionField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IdlmmPackage.TYPEDEF_DEF: {
				TypedefDef typedefDef = (TypedefDef)theEObject;
				T result = caseTypedefDef(typedefDef);
				if (result == null) result = caseIDLType(typedefDef);
				if (result == null) result = caseContained(typedefDef);
				if (result == null) result = caseNamedElement(typedefDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IdlmmPackage.UNION_DEF: {
				UnionDef unionDef = (UnionDef)theEObject;
				T result = caseUnionDef(unionDef);
				if (result == null) result = caseTypedefDef(unionDef);
				if (result == null) result = caseIDLType(unionDef);
				if (result == null) result = caseContained(unionDef);
				if (result == null) result = caseNamedElement(unionDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IdlmmPackage.ENUM_DEF: {
				EnumDef enumDef = (EnumDef)theEObject;
				T result = caseEnumDef(enumDef);
				if (result == null) result = caseTypedefDef(enumDef);
				if (result == null) result = caseIDLType(enumDef);
				if (result == null) result = caseContained(enumDef);
				if (result == null) result = caseNamedElement(enumDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IdlmmPackage.STRUCT_DEF: {
				StructDef structDef = (StructDef)theEObject;
				T result = caseStructDef(structDef);
				if (result == null) result = caseTypedefDef(structDef);
				if (result == null) result = caseIDLType(structDef);
				if (result == null) result = caseContained(structDef);
				if (result == null) result = caseNamedElement(structDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IdlmmPackage.TRANSLATION_UNIT: {
				TranslationUnit translationUnit = (TranslationUnit)theEObject;
				T result = caseTranslationUnit(translationUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IdlmmPackage.INCLUDE: {
				Include include = (Include)theEObject;
				T result = caseInclude(include);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IdlmmPackage.EXPRESSION: {
				Expression expression = (Expression)theEObject;
				T result = caseExpression(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IdlmmPackage.BINARY_EXPRESSION: {
				BinaryExpression binaryExpression = (BinaryExpression)theEObject;
				T result = caseBinaryExpression(binaryExpression);
				if (result == null) result = caseExpression(binaryExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IdlmmPackage.UNARY_EXPRESSION: {
				UnaryExpression unaryExpression = (UnaryExpression)theEObject;
				T result = caseUnaryExpression(unaryExpression);
				if (result == null) result = caseExpression(unaryExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IdlmmPackage.LITERAL_EXPRESSION: {
				LiteralExpression literalExpression = (LiteralExpression)theEObject;
				T result = caseLiteralExpression(literalExpression);
				if (result == null) result = caseExpression(literalExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IdlmmPackage.CONSTANT_DEF_REF: {
				ConstantDefRef constantDefRef = (ConstantDefRef)theEObject;
				T result = caseConstantDefRef(constantDefRef);
				if (result == null) result = caseLiteralExpression(constantDefRef);
				if (result == null) result = caseExpression(constantDefRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IdlmmPackage.VALUE_EXPRESSION: {
				ValueExpression valueExpression = (ValueExpression)theEObject;
				T result = caseValueExpression(valueExpression);
				if (result == null) result = caseLiteralExpression(valueExpression);
				if (result == null) result = caseExpression(valueExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IdlmmPackage.FORWARD_DEF: {
				ForwardDef forwardDef = (ForwardDef)theEObject;
				T result = caseForwardDef(forwardDef);
				if (result == null) result = caseContained(forwardDef);
				if (result == null) result = caseNamedElement(forwardDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IdlmmPackage.ENUM_MEMBER: {
				EnumMember enumMember = (EnumMember)theEObject;
				T result = caseEnumMember(enumMember);
				if (result == null) result = caseConstant(enumMember);
				if (result == null) result = caseContained(enumMember);
				if (result == null) result = caseNamedElement(enumMember);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IdlmmPackage.CONSTANT: {
				Constant constant = (Constant)theEObject;
				T result = caseConstant(constant);
				if (result == null) result = caseContained(constant);
				if (result == null) result = caseNamedElement(constant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IdlmmPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainer(Container object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contained</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contained</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContained(Contained object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceDef(InterfaceDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleDef(ModuleDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IDL Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IDL Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIDLType(IDLType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationDef(OperationDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeDef(AttributeDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constant Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constant Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstantDef(ConstantDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTyped(Typed object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterDef(ParameterDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveDef(PrimitiveDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exception Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exception Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExceptionDef(ExceptionDef object) {
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
	public T caseField(Field object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fixed Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fixed Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFixedDef(FixedDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wstring Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wstring Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWstringDef(WstringDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringDef(StringDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alias Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alias Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAliasDef(AliasDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayDef(ArrayDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceDef(SequenceDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Union Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Union Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnionField(UnionField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typedef Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typedef Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedefDef(TypedefDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Union Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Union Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnionDef(UnionDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumDef(EnumDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Struct Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Struct Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructDef(StructDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Translation Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Translation Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTranslationUnit(TranslationUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Include</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Include</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInclude(Include object) {
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
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryExpression(BinaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryExpression(UnaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralExpression(LiteralExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constant Def Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constant Def Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstantDefRef(ConstantDefRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueExpression(ValueExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Forward Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Forward Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForwardDef(ForwardDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Member</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Member</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumMember(EnumMember object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstant(Constant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
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
	public T defaultCase(EObject object) {
		return null;
	}

} //IdlmmSwitch
