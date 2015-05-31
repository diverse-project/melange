/**
 */
package deephistory;

import java.util.Map;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link deephistory.State#getOwnedRegions <em>Owned Regions</em>}</li>
 * </ul>
 *
 * @see deephistory.DeephistoryPackage#getState()
 * @model
 * @generated
 */
public interface State extends AbstractState {
	/**
	 * Returns the value of the '<em><b>Owned Regions</b></em>' containment reference list.
	 * The list contents are of type {@link deephistory.Region}.
	 * It is bidirectional and its opposite is '{@link deephistory.Region#getOwnerState <em>Owner State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Regions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Regions</em>' containment reference list.
	 * @see deephistory.DeephistoryPackage#getState_OwnedRegions()
	 * @see deephistory.Region#getOwnerState
	 * @model opposite="ownerState" containment="true"
	 * @generated
	 */
	EList<Region> getOwnedRegions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void entryState(Map<?, ?> context);

} // State
