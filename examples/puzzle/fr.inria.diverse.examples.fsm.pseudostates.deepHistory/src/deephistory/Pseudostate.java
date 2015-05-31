/**
 */
package deephistory;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pseudostate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link deephistory.Pseudostate#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @see deephistory.DeephistoryPackage#getPseudostate()
 * @model
 * @generated
 */
public interface Pseudostate extends AbstractState {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link deephistory.PseudostateKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see deephistory.PseudostateKind
	 * @see #setKind(PseudostateKind)
	 * @see deephistory.DeephistoryPackage#getPseudostate_Kind()
	 * @model
	 * @generated
	 */
	PseudostateKind getKind();

	/**
	 * Sets the value of the '{@link deephistory.Pseudostate#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see deephistory.PseudostateKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(PseudostateKind value);

} // Pseudostate
