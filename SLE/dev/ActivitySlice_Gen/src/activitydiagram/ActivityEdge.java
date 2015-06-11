/**
 */
package activitydiagram;

import org.eclipse.emf.common.util.EList;

import org.modelexecution.operationalsemantics.gemoc.sequential.dynamic.Offer;
import org.modelexecution.operationalsemantics.gemoc.sequential.dynamic.Token;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagram.ActivityEdge#getSource <em>Source</em>}</li>
 *   <li>{@link activitydiagram.ActivityEdge#getTarget <em>Target</em>}</li>
 *   <li>{@link activitydiagram.ActivityEdge#getOffers <em>Offers</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagram.ActivitydiagramPackage#getActivityEdge()
 * @model abstract="true"
 * @generated
 */
public interface ActivityEdge extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link activitydiagram.ActivityNode#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ActivityNode)
	 * @see activitydiagram.ActivitydiagramPackage#getActivityEdge_Source()
	 * @see activitydiagram.ActivityNode#getOutgoing
	 * @model opposite="outgoing" required="true"
	 * @generated
	 */
	ActivityNode getSource();

	/**
	 * Sets the value of the '{@link activitydiagram.ActivityEdge#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ActivityNode value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link activitydiagram.ActivityNode#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ActivityNode)
	 * @see activitydiagram.ActivitydiagramPackage#getActivityEdge_Target()
	 * @see activitydiagram.ActivityNode#getIncoming
	 * @model opposite="incoming" required="true"
	 * @generated
	 */
	ActivityNode getTarget();

	/**
	 * Sets the value of the '{@link activitydiagram.ActivityEdge#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ActivityNode value);

	/**
	 * Returns the value of the '<em><b>Offers</b></em>' attribute list.
	 * The list contents are of type {@link org.modelexecution.operationalsemantics.gemoc.sequential.dynamic.Offer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offers</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offers</em>' attribute list.
	 * @see activitydiagram.ActivitydiagramPackage#getActivityEdge_Offers()
	 * @model dataType="activitydiagram.Offer"
	 * @generated
	 */
	EList<Offer> getOffers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model tokensDataType="activitydiagram.Token" tokensMany="true"
	 * @generated
	 */
	void sendOffer(EList<Token> tokens);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="activitydiagram.Token"
	 * @generated
	 */
	EList<Token> takeOfferedTokens();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean hasOffer();

} // ActivityEdge
