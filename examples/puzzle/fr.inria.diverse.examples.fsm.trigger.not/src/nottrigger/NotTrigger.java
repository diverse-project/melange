/**
 */
package nottrigger;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Not Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nottrigger.NotTrigger#getNegated <em>Negated</em>}</li>
 * </ul>
 * </p>
 *
 * @see nottrigger.NottriggerPackage#getNotTrigger()
 * @model
 * @generated
 */
public interface NotTrigger extends Trigger {

	/**
	 * Returns the value of the '<em><b>Negated</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Negated</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Negated</em>' containment reference.
	 * @see #setNegated(Trigger)
	 * @see nottrigger.NottriggerPackage#getNotTrigger_Negated()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Trigger getNegated();

	/**
	 * Sets the value of the '{@link nottrigger.NotTrigger#getNegated <em>Negated</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Negated</em>' containment reference.
	 * @see #getNegated()
	 * @generated
	 */
	void setNegated(Trigger value);
} // NotTrigger
