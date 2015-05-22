/**
 */
package compositestates;

import java.util.Map;

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
 *   <li>{@link compositestates.Region#getSubvertex <em>Subvertex</em>}</li>
 *   <li>{@link compositestates.Region#getOwnerState <em>Owner State</em>}</li>
 * </ul>
 *
 * @see compositestates.CompositestatesPackage#getRegion()
 * @model
 * @generated
 */
public interface Region extends EObject {
	/**
	 * Returns the value of the '<em><b>Subvertex</b></em>' containment reference list.
	 * The list contents are of type {@link compositestates.Vertex}.
	 * It is bidirectional and its opposite is '{@link compositestates.Vertex#getOwnerRegion <em>Owner Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subvertex</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subvertex</em>' containment reference list.
	 * @see compositestates.CompositestatesPackage#getRegion_Subvertex()
	 * @see compositestates.Vertex#getOwnerRegion
	 * @model opposite="ownerRegion" containment="true"
	 * @generated
	 */
	EList<Vertex> getSubvertex();

	/**
	 * Returns the value of the '<em><b>Owner State</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link compositestates.State#getOwnedRegions <em>Owned Regions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner State</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner State</em>' container reference.
	 * @see #setOwnerState(State)
	 * @see compositestates.CompositestatesPackage#getRegion_OwnerState()
	 * @see compositestates.State#getOwnedRegions
	 * @model opposite="ownedRegions" transient="false"
	 * @generated
	 */
	State getOwnerState();

	/**
	 * Sets the value of the '{@link compositestates.Region#getOwnerState <em>Owner State</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner State</em>' container reference.
	 * @see #getOwnerState()
	 * @generated
	 */
	void setOwnerState(State value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void initRegion(Map<?, ?> context);

} // Region
