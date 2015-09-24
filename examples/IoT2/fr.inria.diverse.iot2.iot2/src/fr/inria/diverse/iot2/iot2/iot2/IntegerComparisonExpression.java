/**
 */
package fr.inria.diverse.iot2.iot2.iot2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Comparison Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.iot2.iot2.iot2.IntegerComparisonExpression#getAssignee <em>Assignee</em>}</li>
 *   <li>{@link fr.inria.diverse.iot2.iot2.iot2.IntegerComparisonExpression#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.iot2.iot2.iot2.Iot2Package#getIntegerComparisonExpression()
 * @model
 * @generated
 */
public interface IntegerComparisonExpression extends IntegerExpression {
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
	 * @see fr.inria.diverse.iot2.iot2.iot2.Iot2Package#getIntegerComparisonExpression_Assignee()
	 * @model required="true"
	 * @generated
	 */
	BooleanVariable getAssignee();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.iot2.iot2.iot2.IntegerComparisonExpression#getAssignee <em>Assignee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assignee</em>' reference.
	 * @see #getAssignee()
	 * @generated
	 */
	void setAssignee(BooleanVariable value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.inria.diverse.iot2.iot2.iot2.IntegerComparisonOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see fr.inria.diverse.iot2.iot2.iot2.IntegerComparisonOperator
	 * @see #setOperator(IntegerComparisonOperator)
	 * @see fr.inria.diverse.iot2.iot2.iot2.Iot2Package#getIntegerComparisonExpression_Operator()
	 * @model required="true"
	 * @generated
	 */
	IntegerComparisonOperator getOperator();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.iot2.iot2.iot2.IntegerComparisonExpression#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see fr.inria.diverse.iot2.iot2.iot2.IntegerComparisonOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(IntegerComparisonOperator value);

} // IntegerComparisonExpression
