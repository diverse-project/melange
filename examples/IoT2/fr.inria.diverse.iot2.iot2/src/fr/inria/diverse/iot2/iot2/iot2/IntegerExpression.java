/**
 */
package fr.inria.diverse.iot2.iot2.iot2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.iot2.iot2.iot2.IntegerExpression#getOperand2 <em>Operand2</em>}</li>
 *   <li>{@link fr.inria.diverse.iot2.iot2.iot2.IntegerExpression#getOperand1 <em>Operand1</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.iot2.iot2.iot2.Iot2Package#getIntegerExpression()
 * @model abstract="true"
 * @generated
 */
public interface IntegerExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Operand2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand2</em>' reference.
	 * @see #setOperand2(IntegerVariable)
	 * @see fr.inria.diverse.iot2.iot2.iot2.Iot2Package#getIntegerExpression_Operand2()
	 * @model
	 * @generated
	 */
	IntegerVariable getOperand2();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.iot2.iot2.iot2.IntegerExpression#getOperand2 <em>Operand2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand2</em>' reference.
	 * @see #getOperand2()
	 * @generated
	 */
	void setOperand2(IntegerVariable value);

	/**
	 * Returns the value of the '<em><b>Operand1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand1</em>' reference.
	 * @see #setOperand1(IntegerVariable)
	 * @see fr.inria.diverse.iot2.iot2.iot2.Iot2Package#getIntegerExpression_Operand1()
	 * @model
	 * @generated
	 */
	IntegerVariable getOperand1();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.iot2.iot2.iot2.IntegerExpression#getOperand1 <em>Operand1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand1</em>' reference.
	 * @see #getOperand1()
	 * @generated
	 */
	void setOperand1(IntegerVariable value);

} // IntegerExpression
