/**
 */
package joinpseudostate;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pseudostate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link joinpseudostate.Pseudostate#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see joinpseudostate.JoinpseudostatePackage#getPseudostate()
 * @model
 * @generated
 */
public interface Pseudostate extends EObject {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link joinpseudostate.PseudostateKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see joinpseudostate.PseudostateKind
	 * @see #setKind(PseudostateKind)
	 * @see joinpseudostate.JoinpseudostatePackage#getPseudostate_Kind()
	 * @model
	 * @generated
	 */
	PseudostateKind getKind();

	/**
	 * Sets the value of the '{@link joinpseudostate.Pseudostate#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see joinpseudostate.PseudostateKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(PseudostateKind value);

} // Pseudostate
