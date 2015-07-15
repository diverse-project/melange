/**
 */
package activitydiagram.util;

import activitydiagram.*;

import java.util.Map;

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
 * @see activitydiagram.ActivitydiagramPackage
 * @generated
 */
public class ActivitydiagramSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ActivitydiagramPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivitydiagramSwitch() {
		if (modelPackage == null) {
			modelPackage = ActivitydiagramPackage.eINSTANCE;
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
			case ActivitydiagramPackage.OPAQUE_ACTION: {
				OpaqueAction opaqueAction = (OpaqueAction)theEObject;
				T result = caseOpaqueAction(opaqueAction);
				if (result == null) result = caseAction(opaqueAction);
				if (result == null) result = caseExecutableNode(opaqueAction);
				if (result == null) result = caseActivityNode(opaqueAction);
				if (result == null) result = caseNamedElement(opaqueAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitydiagramPackage.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = caseExecutableNode(action);
				if (result == null) result = caseActivityNode(action);
				if (result == null) result = caseNamedElement(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitydiagramPackage.EXECUTABLE_NODE: {
				ExecutableNode executableNode = (ExecutableNode)theEObject;
				T result = caseExecutableNode(executableNode);
				if (result == null) result = caseActivityNode(executableNode);
				if (result == null) result = caseNamedElement(executableNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitydiagramPackage.ACTIVITY_NODE: {
				ActivityNode activityNode = (ActivityNode)theEObject;
				T result = caseActivityNode(activityNode);
				if (result == null) result = caseNamedElement(activityNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitydiagramPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitydiagramPackage.ACTIVITY_EDGE: {
				ActivityEdge activityEdge = (ActivityEdge)theEObject;
				T result = caseActivityEdge(activityEdge);
				if (result == null) result = caseNamedElement(activityEdge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitydiagramPackage.ACTIVITY: {
				Activity activity = (Activity)theEObject;
				T result = caseActivity(activity);
				if (result == null) result = caseNamedElement(activity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitydiagramPackage.VARIABLE: {
				Variable variable = (Variable)theEObject;
				T result = caseVariable(variable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitydiagramPackage.VALUE: {
				Value value = (Value)theEObject;
				T result = caseValue(value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitydiagramPackage.INPUT_VALUE: {
				InputValue inputValue = (InputValue)theEObject;
				T result = caseInputValue(inputValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitydiagramPackage.EXPRESSION: {
				Expression expression = (Expression)theEObject;
				T result = caseExpression(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitydiagramPackage.EATTRIBUTE: {
				EAttribute eAttribute = (EAttribute)theEObject;
				T result = caseEAttribute(eAttribute);
				if (result == null) result = caseEStructuralFeature(eAttribute);
				if (result == null) result = caseETypedElement(eAttribute);
				if (result == null) result = caseENamedElement(eAttribute);
				if (result == null) result = caseEModelElement(eAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitydiagramPackage.EANNOTATION: {
				EAnnotation eAnnotation = (EAnnotation)theEObject;
				T result = caseEAnnotation(eAnnotation);
				if (result == null) result = caseEModelElement(eAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitydiagramPackage.ECLASS: {
				EClass eClass = (EClass)theEObject;
				T result = caseEClass(eClass);
				if (result == null) result = caseEClassifier(eClass);
				if (result == null) result = caseENamedElement(eClass);
				if (result == null) result = caseEModelElement(eClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitydiagramPackage.ECLASSIFIER: {
				EClassifier eClassifier = (EClassifier)theEObject;
				T result = caseEClassifier(eClassifier);
				if (result == null) result = caseENamedElement(eClassifier);
				if (result == null) result = caseEModelElement(eClassifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitydiagramPackage.EDATA_TYPE: {
				EDataType eDataType = (EDataType)theEObject;
				T result = caseEDataType(eDataType);
				if (result == null) result = caseEClassifier(eDataType);
				if (result == null) result = caseENamedElement(eDataType);
				if (result == null) result = caseEModelElement(eDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitydiagramPackage.EENUM: {
				EEnum eEnum = (EEnum)theEObject;
				T result = caseEEnum(eEnum);
				if (result == null) result = caseEDataType(eEnum);
				if (result == null) result = caseEClassifier(eEnum);
				if (result == null) result = caseENamedElement(eEnum);
				if (result == null) result = caseEModelElement(eEnum);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitydiagramPackage.EENUM_LITERAL: {
				EEnumLiteral eEnumLiteral = (EEnumLiteral)theEObject;
				T result = caseEEnumLiteral(eEnumLiteral);
				if (result == null) result = caseENamedElement(eEnumLiteral);
				if (result == null) result = caseEModelElement(eEnumLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitydiagramPackage.EFACTORY: {
				EFactory eFactory = (EFactory)theEObject;
				T result = caseEFactory(eFactory);
				if (result == null) result = caseEModelElement(eFactory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitydiagramPackage.EMODEL_ELEMENT: {
				EModelElement eModelElement = (EModelElement)theEObject;
				T result = caseEModelElement(eModelElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitydiagramPackage.ENAMED_ELEMENT: {
				ENamedElement eNamedElement = (ENamedElement)theEObject;
				T result = caseENamedElement(eNamedElement);
				if (result == null) result = caseEModelElement(eNamedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitydiagramPackage.EOBJECT: {
				activitydiagram.EObject eObject = (activitydiagram.EObject)theEObject;
				T result = caseEObject(eObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitydiagramPackage.EOPERATION: {
				EOperation eOperation = (EOperation)theEObject;
				T result = caseEOperation(eOperation);
				if (result == null) result = caseETypedElement(eOperation);
				if (result == null) result = caseENamedElement(eOperation);
				if (result == null) result = caseEModelElement(eOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitydiagramPackage.EPACKAGE: {
				activitydiagram.EPackage ePackage = (activitydiagram.EPackage)theEObject;
				T result = caseEPackage(ePackage);
				if (result == null) result = caseENamedElement(ePackage);
				if (result == null) result = caseEModelElement(ePackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitydiagramPackage.EPARAMETER: {
				EParameter eParameter = (EParameter)theEObject;
				T result = caseEParameter(eParameter);
				if (result == null) result = caseETypedElement(eParameter);
				if (result == null) result = caseENamedElement(eParameter);
				if (result == null) result = caseEModelElement(eParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitydiagramPackage.EREFERENCE: {
				EReference eReference = (EReference)theEObject;
				T result = caseEReference(eReference);
				if (result == null) result = caseEStructuralFeature(eReference);
				if (result == null) result = caseETypedElement(eReference);
				if (result == null) result = caseENamedElement(eReference);
				if (result == null) result = caseEModelElement(eReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitydiagramPackage.ESTRUCTURAL_FEATURE: {
				EStructuralFeature eStructuralFeature = (EStructuralFeature)theEObject;
				T result = caseEStructuralFeature(eStructuralFeature);
				if (result == null) result = caseETypedElement(eStructuralFeature);
				if (result == null) result = caseENamedElement(eStructuralFeature);
				if (result == null) result = caseEModelElement(eStructuralFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitydiagramPackage.ETYPED_ELEMENT: {
				ETypedElement eTypedElement = (ETypedElement)theEObject;
				T result = caseETypedElement(eTypedElement);
				if (result == null) result = caseENamedElement(eTypedElement);
				if (result == null) result = caseEModelElement(eTypedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitydiagramPackage.ESTRING_TO_STRING_MAP_ENTRY: {
				@SuppressWarnings("unchecked") Map.Entry<String, String> eStringToStringMapEntry = (Map.Entry<String, String>)theEObject;
				T result = caseEStringToStringMapEntry(eStringToStringMapEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitydiagramPackage.EGENERIC_TYPE: {
				EGenericType eGenericType = (EGenericType)theEObject;
				T result = caseEGenericType(eGenericType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitydiagramPackage.ETYPE_PARAMETER: {
				ETypeParameter eTypeParameter = (ETypeParameter)theEObject;
				T result = caseETypeParameter(eTypeParameter);
				if (result == null) result = caseENamedElement(eTypeParameter);
				if (result == null) result = caseEModelElement(eTypeParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Opaque Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Opaque Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpaqueAction(OpaqueAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Executable Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Executable Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutableNode(ExecutableNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityNode(ActivityNode object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Activity Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityEdge(ActivityEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivity(Activity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValue(Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputValue(InputValue object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>EAttribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EAttribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAttribute(EAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EAnnotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EAnnotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAnnotation(EAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEClass(EClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EClassifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EClassifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEClassifier(EClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EData Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EData Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDataType(EDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEnum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEnum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEnum(EEnum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEnum Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEnum Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEnumLiteral(EEnumLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EFactory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EFactory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEFactory(EFactory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EModel Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EModel Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEModelElement(EModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ENamed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ENamed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseENamedElement(ENamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEObject(activitydiagram.EObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EOperation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EOperation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEOperation(EOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EPackage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EPackage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEPackage(activitydiagram.EPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EParameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EParameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEParameter(EParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EReference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EReference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEReference(EReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EStructural Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EStructural Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEStructuralFeature(EStructuralFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ETyped Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ETyped Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseETypedElement(ETypedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EString To String Map Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EString To String Map Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEStringToStringMapEntry(Map.Entry<String, String> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EGeneric Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EGeneric Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEGenericType(EGenericType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EType Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EType Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseETypeParameter(ETypeParameter object) {
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

} //ActivitydiagramSwitch
