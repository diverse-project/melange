/**
 */
package fr.inria.diverse.iot2.iot2.iot2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.iot2.iot2.iot2.BooleanExpression#getAssignee <em>Assignee</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.iot2.iot2.iot2.Iot2Package#getBooleanExpression()
 * @model abstract="true"
 * @generated
 */
public interface BooleanExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Assignee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assignee</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignee</em>' reference.
	 * @see #setAssignee(BooleanVariable)
	 * @see fr.inria.diverse.iot2.iot2.iot2.Iot2Package#getBooleanExpression_Assignee()
	 * @model required="true"
	 * @generated
	 */
	BooleanVariable getAssignee();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.iot2.iot2.iot2.BooleanExpression#getAssignee <em>Assignee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assignee</em>' reference.
	 * @see #getAssignee()
	 * @generated
	 */
	void setAssignee(BooleanVariable value);

} // BooleanExpression
