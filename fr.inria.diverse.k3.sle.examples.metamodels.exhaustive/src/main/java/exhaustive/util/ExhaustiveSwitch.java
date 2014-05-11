/**
 */
package exhaustive.util;

import exhaustive.*;

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
 * @see exhaustive.ExhaustivePackage
 * @generated
 */
public class ExhaustiveSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ExhaustivePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExhaustiveSwitch() {
		if (modelPackage == null) {
			modelPackage = ExhaustivePackage.eINSTANCE;
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
			case ExhaustivePackage.ABSTRACT_TEST: {
				AbstractTest abstractTest = (AbstractTest)theEObject;
				T result = caseAbstractTest(abstractTest);
				if (result == null) result = caseOperationsTest(abstractTest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExhaustivePackage.INTERFACE_TEST: {
				InterfaceTest interfaceTest = (InterfaceTest)theEObject;
				T result = caseInterfaceTest(interfaceTest);
				if (result == null) result = caseOperationsTest(interfaceTest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExhaustivePackage.MULTIPLE_SUPER_TEST: {
				MultipleSuperTest multipleSuperTest = (MultipleSuperTest)theEObject;
				T result = caseMultipleSuperTest(multipleSuperTest);
				if (result == null) result = caseAbstractTest(multipleSuperTest);
				if (result == null) result = caseInterfaceTest(multipleSuperTest);
				if (result == null) result = caseOperationsTest(multipleSuperTest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExhaustivePackage.REFERENCES_TEST: {
				ReferencesTest referencesTest = (ReferencesTest)theEObject;
				T result = caseReferencesTest(referencesTest);
				if (result == null) result = caseAbstractTest(referencesTest);
				if (result == null) result = caseOperationsTest(referencesTest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExhaustivePackage.ATTRIBUTES_TEST: {
				AttributesTest attributesTest = (AttributesTest)theEObject;
				T result = caseAttributesTest(attributesTest);
				if (result == null) result = caseMultipleSuperTest(attributesTest);
				if (result == null) result = caseAbstractTest(attributesTest);
				if (result == null) result = caseInterfaceTest(attributesTest);
				if (result == null) result = caseOperationsTest(attributesTest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExhaustivePackage.OPERATIONS_TEST: {
				OperationsTest operationsTest = (OperationsTest)theEObject;
				T result = caseOperationsTest(operationsTest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExhaustivePackage.GENERIC_TEST: {
				GenericTest<?, ?> genericTest = (GenericTest<?, ?>)theEObject;
				T result = caseGenericTest(genericTest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExhaustivePackage.GENERIC_CHILD_TEST: {
				GenericChildTest genericChildTest = (GenericChildTest)theEObject;
				T result = caseGenericChildTest(genericChildTest);
				if (result == null) result = caseGenericTest(genericChildTest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Test</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Test</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractTest(AbstractTest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Test</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Test</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceTest(InterfaceTest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiple Super Test</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiple Super Test</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultipleSuperTest(MultipleSuperTest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>References Test</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>References Test</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferencesTest(ReferencesTest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attributes Test</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attributes Test</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributesTest(AttributesTest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operations Test</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operations Test</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationsTest(OperationsTest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Test</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Test</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <A, B> T caseGenericTest(GenericTest<A, B> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Child Test</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Child Test</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericChildTest(GenericChildTest object) {
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

} //ExhaustiveSwitch
