/**
 */
package compositestates;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link compositestates.CompositeState#getInitialState <em>Initial State</em>}</li>
 *   <li>{@link compositestates.CompositeState#getStates <em>States</em>}</li>
 * </ul>
 * </p>
 *
 * @see compositestates.CompositestatesPackage#getCompositeState()
 * @model
 * @generated
 */
public interface CompositeState extends State {
	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link compositestates.Vertex}.
	 * It is bidirectional and its opposite is '{@link compositestates.Vertex#getOwnerState <em>Owner State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see compositestates.CompositestatesPackage#getCompositeState_States()
	 * @see compositestates.Vertex#getOwnerState
	 * @model opposite="ownerState" containment="true" required="true"
	 * @generated
	 */
	EList<Vertex> getStates();

	/**
	 * Returns the value of the '<em><b>Initial State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial State</em>' reference.
	 * @see #setInitialState(Vertex)
	 * @see compositestates.CompositestatesPackage#getCompositeState_InitialState()
	 * @model required="true"
	 * @generated
	 */
	Vertex getInitialState();

	/**
	 * Sets the value of the '{@link compositestates.CompositeState#getInitialState <em>Initial State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial State</em>' reference.
	 * @see #getInitialState()
	 * @generated
	 */
	void setInitialState(Vertex value);

} // CompositeState
