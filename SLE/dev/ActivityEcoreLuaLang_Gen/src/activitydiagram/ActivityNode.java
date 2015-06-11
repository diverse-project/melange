/**
 */
package activitydiagram;

import org.eclipse.emf.common.util.EList;

import org.modelexecution.operationalsemantics.gemoc.sequential.dynamic.Context;
import org.modelexecution.operationalsemantics.gemoc.sequential.dynamic.Token;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagram.ActivityNode#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link activitydiagram.ActivityNode#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link activitydiagram.ActivityNode#getActivity <em>Activity</em>}</li>
 *   <li>{@link activitydiagram.ActivityNode#isRunning <em>Running</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagram.ActivitydiagramPackage#getActivityNode()
 * @model abstract="true"
 * @generated
 */
public interface ActivityNode extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link activitydiagram.ActivityEdge}.
	 * It is bidirectional and its opposite is '{@link activitydiagram.ActivityEdge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see activitydiagram.ActivitydiagramPackage#getActivityNode_Outgoing()
	 * @see activitydiagram.ActivityEdge#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<ActivityEdge> getOutgoing();

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link activitydiagram.ActivityEdge}.
	 * It is bidirectional and its opposite is '{@link activitydiagram.ActivityEdge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see activitydiagram.ActivitydiagramPackage#getActivityNode_Incoming()
	 * @see activitydiagram.ActivityEdge#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<ActivityEdge> getIncoming();

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link activitydiagram.Activity#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' container reference.
	 * @see #setActivity(Activity)
	 * @see activitydiagram.ActivitydiagramPackage#getActivityNode_Activity()
	 * @see activitydiagram.Activity#getNodes
	 * @model opposite="nodes" required="true" transient="false"
	 * @generated
	 */
	Activity getActivity();

	/**
	 * Sets the value of the '{@link activitydiagram.ActivityNode#getActivity <em>Activity</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity</em>' container reference.
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(Activity value);

	/**
	 * Returns the value of the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Running</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Running</em>' attribute.
	 * @see #setRunning(boolean)
	 * @see activitydiagram.ActivitydiagramPackage#getActivityNode_Running()
	 * @model dataType="activitydiagram.EBoolean" required="true"
	 * @generated
	 */
	boolean isRunning();

	/**
	 * Sets the value of the '{@link activitydiagram.ActivityNode#isRunning <em>Running</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Running</em>' attribute.
	 * @see #isRunning()
	 * @generated
	 */
	void setRunning(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model cDataType="activitydiagram.Context"
	 * @generated
	 */
	void execute(Context c);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void terminate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="activitydiagram.EBoolean"
	 * @generated
	 */
	boolean isReady();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model tokensDataType="activitydiagram.Token" tokensMany="true"
	 * @generated
	 */
	void sendOffers(EList<Token> tokens);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="activitydiagram.Token"
	 * @generated
	 */
	EList<Token> takeOfferdTokens();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model tokensDataType="activitydiagram.Token" tokensMany="true"
	 * @generated
	 */
	void addTokens(EList<Token> tokens);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="activitydiagram.EBoolean"
	 * @generated
	 */
	boolean hasOffers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model tokenDataType="activitydiagram.Token"
	 * @generated
	 */
	void removeToken(Token token);

} // ActivityNode
