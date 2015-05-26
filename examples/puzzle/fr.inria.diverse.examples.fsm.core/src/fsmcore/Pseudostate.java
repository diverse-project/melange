/**
 */
package fsmcore;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pseudostate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fsmcore.Pseudostate#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @see fsmcore.FsmcorePackage#getPseudostate()
 * @model
 * @generated
 */
public interface Pseudostate extends AbstractState {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link fsmcore.PseudostateKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see fsmcore.PseudostateKind
	 * @see #setKind(PseudostateKind)
	 * @see fsmcore.FsmcorePackage#getPseudostate_Kind()
	 * @model
	 * @generated
	 */
	PseudostateKind getKind();

	/**
	 * Sets the value of the '{@link fsmcore.Pseudostate#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see fsmcore.PseudostateKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(PseudostateKind value);

} // Pseudostate
