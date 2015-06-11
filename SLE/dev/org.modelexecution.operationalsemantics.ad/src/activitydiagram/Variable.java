/**
 */
package activitydiagram;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link activitydiagram.Variable#getInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link activitydiagram.Variable#getName <em>Name</em>}</li>
 *   <li>{@link activitydiagram.Variable#getCurrentValue <em>Current Value</em>}</li>
 * </ul>
 *
 * @see activitydiagram.ActivitydiagramPackage#getVariable()
 * @model abstract="true"
 * @generated
 */
public interface Variable extends EObject {
	/**
	 * Returns the value of the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Value</em>' containment reference.
	 * @see #setInitialValue(Value)
	 * @see activitydiagram.ActivitydiagramPackage#getVariable_InitialValue()
	 * @model containment="true"
	 * @generated
	 */
	Value getInitialValue();

	/**
	 * Sets the value of the '{@link activitydiagram.Variable#getInitialValue <em>Initial Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Value</em>' containment reference.
	 * @see #getInitialValue()
	 * @generated
	 */
	void setInitialValue(Value value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see activitydiagram.ActivitydiagramPackage#getVariable_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link activitydiagram.Variable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Current Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Value</em>' containment reference.
	 * @see #setCurrentValue(Value)
	 * @see activitydiagram.ActivitydiagramPackage#getVariable_CurrentValue()
	 * @model containment="true"
	 * @generated
	 */
	Value getCurrentValue();

	/**
	 * Sets the value of the '{@link activitydiagram.Variable#getCurrentValue <em>Current Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Value</em>' containment reference.
	 * @see #getCurrentValue()
	 * @generated
	 */
	void setCurrentValue(Value value);

} // Variable
