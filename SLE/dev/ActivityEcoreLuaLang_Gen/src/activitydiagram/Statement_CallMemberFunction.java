/**
 */
package activitydiagram;

import org.k3.lua.dynamic.environment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement Call Member Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagram.Statement_CallMemberFunction#getObject <em>Object</em>}</li>
 *   <li>{@link activitydiagram.Statement_CallMemberFunction#getMemberFunctionName <em>Member Function Name</em>}</li>
 *   <li>{@link activitydiagram.Statement_CallMemberFunction#getArguments <em>Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagram.ActivitydiagramPackage#getStatement_CallMemberFunction()
 * @model
 * @generated
 */
public interface Statement_CallMemberFunction extends Statement_FunctioncallOrAssignment {
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
	 * @see activitydiagram.ActivitydiagramPackage#getStatement_CallMemberFunction_Object()
	 * @model containment="true"
	 * @generated
	 */
	Expression getObject();

	/**
	 * Sets the value of the '{@link activitydiagram.Statement_CallMemberFunction#getObject <em>Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' containment reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(Expression value);

	/**
	 * Returns the value of the '<em><b>Member Function Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member Function Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member Function Name</em>' attribute.
	 * @see #setMemberFunctionName(String)
	 * @see activitydiagram.ActivitydiagramPackage#getStatement_CallMemberFunction_MemberFunctionName()
	 * @model dataType="activitydiagram.EString"
	 * @generated
	 */
	String getMemberFunctionName();

	/**
	 * Sets the value of the '{@link activitydiagram.Statement_CallMemberFunction#getMemberFunctionName <em>Member Function Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member Function Name</em>' attribute.
	 * @see #getMemberFunctionName()
	 * @generated
	 */
	void setMemberFunctionName(String value);

	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arguments</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference.
	 * @see #setArguments(Functioncall_Arguments)
	 * @see activitydiagram.ActivitydiagramPackage#getStatement_CallMemberFunction_Arguments()
	 * @model containment="true"
	 * @generated
	 */
	Functioncall_Arguments getArguments();

	/**
	 * Sets the value of the '{@link activitydiagram.Statement_CallMemberFunction#getArguments <em>Arguments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arguments</em>' containment reference.
	 * @see #getArguments()
	 * @generated
	 */
	void setArguments(Functioncall_Arguments value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model cDataType="activitydiagram.environment"
	 * @generated
	 */
	void execute(environment c);

} // Statement_CallMemberFunction
