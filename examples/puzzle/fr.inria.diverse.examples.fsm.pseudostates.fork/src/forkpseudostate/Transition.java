/**
 */
package forkpseudostate;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link forkpseudostate.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link forkpseudostate.Transition#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see forkpseudostate.ForkpseudostatePackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link forkpseudostate.AbstractState#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(AbstractState)
	 * @see forkpseudostate.ForkpseudostatePackage#getTransition_Source()
	 * @see forkpseudostate.AbstractState#getOutgoing
	 * @model opposite="outgoing" required="true"
	 * @generated
	 */
	AbstractState getSource();

	/**
	 * Sets the value of the '{@link forkpseudostate.Transition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(AbstractState value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link forkpseudostate.AbstractState#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(AbstractState)
	 * @see forkpseudostate.ForkpseudostatePackage#getTransition_Target()
	 * @see forkpseudostate.AbstractState#getIncoming
	 * @model opposite="incoming" required="true"
	 * @generated
	 */
	AbstractState getTarget();

	/**
	 * Sets the value of the '{@link forkpseudostate.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(AbstractState value);

} // Transition
