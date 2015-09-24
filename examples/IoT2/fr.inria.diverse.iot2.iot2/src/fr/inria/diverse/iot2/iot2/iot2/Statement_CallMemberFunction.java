/**
 */
package fr.inria.diverse.iot2.iot2.iot2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement Call Member Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.iot2.iot2.iot2.Statement_CallMemberFunction#getObject <em>Object</em>}</li>
 *   <li>{@link fr.inria.diverse.iot2.iot2.iot2.Statement_CallMemberFunction#getMemberFunctionName <em>Member Function Name</em>}</li>
 *   <li>{@link fr.inria.diverse.iot2.iot2.iot2.Statement_CallMemberFunction#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.iot2.iot2.iot2.Iot2Package#getStatement_CallMemberFunction()
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
	 * @see fr.inria.diverse.iot2.iot2.iot2.Iot2Package#getStatement_CallMemberFunction_Object()
	 * @model containment="true"
	 * @generated
	 */
	Expression getObject();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.iot2.iot2.iot2.Statement_CallMemberFunction#getObject <em>Object</em>}' containment reference.
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
	 * @see fr.inria.diverse.iot2.iot2.iot2.Iot2Package#getStatement_CallMemberFunction_MemberFunctionName()
	 * @model
	 * @generated
	 */
	String getMemberFunctionName();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.iot2.iot2.iot2.Statement_CallMemberFunction#getMemberFunctionName <em>Member Function Name</em>}' attribute.
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
	 * @see fr.inria.diverse.iot2.iot2.iot2.Iot2Package#getStatement_CallMemberFunction_Arguments()
	 * @model containment="true"
	 * @generated
	 */
	Functioncall_Arguments getArguments();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.iot2.iot2.iot2.Statement_CallMemberFunction#getArguments <em>Arguments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arguments</em>' containment reference.
	 * @see #getArguments()
	 * @generated
	 */
	void setArguments(Functioncall_Arguments value);

} // Statement_CallMemberFunction
