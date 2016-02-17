/**
 */
package compositefsm.fsm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link compositefsm.fsm.CompositeState#getRegions <em>Regions</em>}</li>
 * </ul>
 *
 * @see compositefsm.fsm.FsmPackage#getCompositeState()
 * @model
 * @generated
 */
public interface CompositeState extends State {
	/**
	 * Returns the value of the '<em><b>Regions</b></em>' containment reference list.
	 * The list contents are of type {@link compositefsm.fsm.Region}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regions</em>' containment reference list.
	 * @see compositefsm.fsm.FsmPackage#getCompositeState_Regions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Region> getRegions();

} // CompositeState
