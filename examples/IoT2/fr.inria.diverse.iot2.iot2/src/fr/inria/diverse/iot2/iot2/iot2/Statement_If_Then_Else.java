/**
 */
package fr.inria.diverse.iot2.iot2.iot2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement If Then Else</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.iot2.iot2.iot2.Statement_If_Then_Else#getIfExpression <em>If Expression</em>}</li>
 *   <li>{@link fr.inria.diverse.iot2.iot2.iot2.Statement_If_Then_Else#getIfBlock <em>If Block</em>}</li>
 *   <li>{@link fr.inria.diverse.iot2.iot2.iot2.Statement_If_Then_Else#getElseIf <em>Else If</em>}</li>
 *   <li>{@link fr.inria.diverse.iot2.iot2.iot2.Statement_If_Then_Else#getElseBlock <em>Else Block</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.iot2.iot2.iot2.Iot2Package#getStatement_If_Then_Else()
 * @model
 * @generated
 */
public interface Statement_If_Then_Else extends Statement {
	/**
	 * Returns the value of the '<em><b>If Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>If Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If Expression</em>' containment reference.
	 * @see #setIfExpression(Expression)
	 * @see fr.inria.diverse.iot2.iot2.iot2.Iot2Package#getStatement_If_Then_Else_IfExpression()
	 * @model containment="true"
	 * @generated
	 */
	Expression getIfExpression();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.iot2.iot2.iot2.Statement_If_Then_Else#getIfExpression <em>If Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If Expression</em>' containment reference.
	 * @see #getIfExpression()
	 * @generated
	 */
	void setIfExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>If Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>If Block</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If Block</em>' containment reference.
	 * @see #setIfBlock(Block)
	 * @see fr.inria.diverse.iot2.iot2.iot2.Iot2Package#getStatement_If_Then_Else_IfBlock()
	 * @model containment="true"
	 * @generated
	 */
	Block getIfBlock();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.iot2.iot2.iot2.Statement_If_Then_Else#getIfBlock <em>If Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If Block</em>' containment reference.
	 * @see #getIfBlock()
	 * @generated
	 */
	void setIfBlock(Block value);

	/**
	 * Returns the value of the '<em><b>Else If</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.diverse.iot2.iot2.iot2.Statement_If_Then_Else_ElseIfPart}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else If</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else If</em>' containment reference list.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Iot2Package#getStatement_If_Then_Else_ElseIf()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement_If_Then_Else_ElseIfPart> getElseIf();

	/**
	 * Returns the value of the '<em><b>Else Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else Block</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Block</em>' containment reference.
	 * @see #setElseBlock(Block)
	 * @see fr.inria.diverse.iot2.iot2.iot2.Iot2Package#getStatement_If_Then_Else_ElseBlock()
	 * @model containment="true"
	 * @generated
	 */
	Block getElseBlock();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.iot2.iot2.iot2.Statement_If_Then_Else#getElseBlock <em>Else Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else Block</em>' containment reference.
	 * @see #getElseBlock()
	 * @generated
	 */
	void setElseBlock(Block value);

} // Statement_If_Then_Else
