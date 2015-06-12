/**
 */
package activitydiagram;

import org.k3.lua.dynamic.Environment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Access Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagram.Expression_AccessMember#getObject <em>Object</em>}</li>
 *   <li>{@link activitydiagram.Expression_AccessMember#getMemberName <em>Member Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagram.ActivitydiagramPackage#getExpression_AccessMember()
 * @model
 * @generated
 */
public interface Expression_AccessMember extends Expression {
	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' containment reference.
	 * @see #setObject(Expression)
	 * @see activitydiagram.ActivitydiagramPackage#getExpression_AccessMember_Object()
	 * @model containment="true"
	 * @generated
	 */
	Expression getObject();

	/**
	 * Sets the value of the '{@link activitydiagram.Expression_AccessMember#getObject <em>Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' containment reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(Expression value);

	/**
	 * Returns the value of the '<em><b>Member Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member Name</em>' attribute.
	 * @see #setMemberName(String)
	 * @see activitydiagram.ActivitydiagramPackage#getExpression_AccessMember_MemberName()
	 * @model dataType="activitydiagram.EString"
	 * @generated
	 */
	String getMemberName();

	/**
	 * Sets the value of the '{@link activitydiagram.Expression_AccessMember#getMemberName <em>Member Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member Name</em>' attribute.
	 * @see #getMemberName()
	 * @generated
	 */
	void setMemberName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model cDataType="activitydiagram.Environment"
	 * @generated
	 */
	void execute(Environment c);

} // Expression_AccessMember
