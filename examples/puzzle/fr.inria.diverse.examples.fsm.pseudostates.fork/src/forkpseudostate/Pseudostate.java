/**
 */
package forkpseudostate;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pseudostate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link forkpseudostate.Pseudostate#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @see forkpseudostate.ForkpseudostatePackage#getPseudostate()
 * @model
 * @generated
 */
public interface Pseudostate extends AbstractState {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link forkpseudostate.PseudostateKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see forkpseudostate.PseudostateKind
	 * @see #setKind(PseudostateKind)
	 * @see forkpseudostate.ForkpseudostatePackage#getPseudostate_Kind()
	 * @model
	 * @generated
	 */
	PseudostateKind getKind();

	/**
	 * Sets the value of the '{@link forkpseudostate.Pseudostate#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see forkpseudostate.PseudostateKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(PseudostateKind value);

} // Pseudostate
