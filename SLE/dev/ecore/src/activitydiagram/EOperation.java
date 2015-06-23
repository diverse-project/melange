/**
 */
package activitydiagram;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EOperation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagram.EOperation#getEContainingClass <em>EContaining Class</em>}</li>
 *   <li>{@link activitydiagram.EOperation#getETypeParameters <em>EType Parameters</em>}</li>
 *   <li>{@link activitydiagram.EOperation#getEParameters <em>EParameters</em>}</li>
 *   <li>{@link activitydiagram.EOperation#getEExceptions <em>EExceptions</em>}</li>
 *   <li>{@link activitydiagram.EOperation#getEGenericExceptions <em>EGeneric Exceptions</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagram.EcorePackage#getEOperation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueParameterNames UniqueTypeParameterNames NoRepeatingVoid'"
 * @generated
 */
public interface EOperation extends ETypedElement {
	/**
	 * Returns the value of the '<em><b>EContaining Class</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link activitydiagram.EClass#getEOperations <em>EOperations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EContaining Class</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EContaining Class</em>' container reference.
	 * @see activitydiagram.EcorePackage#getEOperation_EContainingClass()
	 * @see activitydiagram.EClass#getEOperations
	 * @model opposite="eOperations" resolveProxies="false" changeable="false"
	 * @generated
	 */
	EClass getEContainingClass();

	/**
	 * Returns the value of the '<em><b>EType Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagram.ETypeParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EType Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EType Parameters</em>' containment reference list.
	 * @see activitydiagram.EcorePackage#getEOperation_ETypeParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<ETypeParameter> getETypeParameters();

	/**
	 * Returns the value of the '<em><b>EParameters</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagram.EParameter}.
	 * It is bidirectional and its opposite is '{@link activitydiagram.EParameter#getEOperation <em>EOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EParameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EParameters</em>' containment reference list.
	 * @see activitydiagram.EcorePackage#getEOperation_EParameters()
	 * @see activitydiagram.EParameter#getEOperation
	 * @model opposite="eOperation" containment="true"
	 * @generated
	 */
	EList<EParameter> getEParameters();

	/**
	 * Returns the value of the '<em><b>EExceptions</b></em>' reference list.
	 * The list contents are of type {@link activitydiagram.EClassifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EExceptions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EExceptions</em>' reference list.
	 * @see activitydiagram.EcorePackage#getEOperation_EExceptions()
	 * @model unsettable="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	EList<EClassifier> getEExceptions();

	/**
	 * Returns the value of the '<em><b>EGeneric Exceptions</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagram.EGenericType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EGeneric Exceptions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EGeneric Exceptions</em>' containment reference list.
	 * @see activitydiagram.EcorePackage#getEOperation_EGenericExceptions()
	 * @model containment="true" unsettable="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	EList<EGenericType> getEGenericExceptions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="activitydiagram.EInt"
	 * @generated
	 */
	int getOperationID();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="activitydiagram.EBoolean"
	 * @generated
	 */
	boolean isOverrideOf(EOperation someOperation);

} // EOperation
