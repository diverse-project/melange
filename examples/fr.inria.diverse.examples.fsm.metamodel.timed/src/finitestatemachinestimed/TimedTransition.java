/**
 */
package finitestatemachinestimed;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timed Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link finitestatemachinestimed.TimedTransition#getDuration <em>Duration</em>}</li>
 * </ul>
 * </p>
 *
 * @see finitestatemachinestimed.FinitestatemachinestimedPackage#getTimedTransition()
 * @model
 * @generated
 */
public interface TimedTransition extends Transition {
	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(int)
	 * @see finitestatemachinestimed.FinitestatemachinestimedPackage#getTimedTransition_Duration()
	 * @model
	 * @generated
	 */
	int getDuration();

	/**
	 * Sets the value of the '{@link finitestatemachinestimed.TimedTransition#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(int value);

} // TimedTransition
