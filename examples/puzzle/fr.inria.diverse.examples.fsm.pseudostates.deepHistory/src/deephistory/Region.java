/**
 */
package deephistory;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link deephistory.Region#getSubvertex <em>Subvertex</em>}</li>
 *   <li>{@link deephistory.Region#getOwnerState <em>Owner State</em>}</li>
 * </ul>
 *
 * @see deephistory.DeephistoryPackage#getRegion()
 * @model
 * @generated
 */
public interface Region extends EObject {
	/**
	 * Returns the value of the '<em><b>Subvertex</b></em>' containment reference list.
	 * The list contents are of type {@link deephistory.AbstractState}.
	 * It is bidirectional and its opposite is '{@link deephistory.AbstractState#getOwnerRegion <em>Owner Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subvertex</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subvertex</em>' containment reference list.
	 * @see deephistory.DeephistoryPackage#getRegion_Subvertex()
	 * @see deephistory.AbstractState#getOwnerRegion
	 * @model opposite="ownerRegion" containment="true"
	 * @generated
	 */
	EList<AbstractState> getSubvertex();

	/**
	 * Returns the value of the '<em><b>Owner State</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link deephistory.State#getOwnedRegions <em>Owned Regions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner State</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner State</em>' container reference.
	 * @see #setOwnerState(State)
	 * @see deephistory.DeephistoryPackage#getRegion_OwnerState()
	 * @see deephistory.State#getOwnedRegions
	 * @model opposite="ownedRegions" required="true" transient="false"
	 * @generated
	 */
	State getOwnerState();

	/**
	 * Sets the value of the '{@link deephistory.Region#getOwnerState <em>Owner State</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner State</em>' container reference.
	 * @see #getOwnerState()
	 * @generated
	 */
	void setOwnerState(State value);

} // Region
