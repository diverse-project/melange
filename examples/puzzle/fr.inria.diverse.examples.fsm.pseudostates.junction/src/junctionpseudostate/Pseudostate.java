/**
 */
package junctionpseudostate;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pseudostate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link junctionpseudostate.Pseudostate#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @see junctionpseudostate.JunctionpseudostatePackage#getPseudostate()
 * @model
 * @generated
 */
public interface Pseudostate extends AbstractState {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link junctionpseudostate.PseudostateKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see junctionpseudostate.PseudostateKind
	 * @see #setKind(PseudostateKind)
	 * @see junctionpseudostate.JunctionpseudostatePackage#getPseudostate_Kind()
	 * @model
	 * @generated
	 */
	PseudostateKind getKind();

	/**
	 * Sets the value of the '{@link junctionpseudostate.Pseudostate#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see junctionpseudostate.PseudostateKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(PseudostateKind value);

} // Pseudostate
