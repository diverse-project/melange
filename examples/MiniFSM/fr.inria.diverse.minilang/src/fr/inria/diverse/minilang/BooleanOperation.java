/**
 */
package fr.inria.diverse.minilang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.minilang.BooleanOperation#getLeft <em>Left</em>}</li>
 *   <li>{@link fr.inria.diverse.minilang.BooleanOperation#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.minilang.MinilangPackage#getBooleanOperation()
 * @model
 * @generated
 */
public interface BooleanOperation extends BooleanExpression {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(BooleanExpression)
	 * @see fr.inria.diverse.minilang.MinilangPackage#getBooleanOperation_Left()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BooleanExpression getLeft();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.minilang.BooleanOperation#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(BooleanExpression value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' reference.
	 * @see #setRight(BooleanExpression)
	 * @see fr.inria.diverse.minilang.MinilangPackage#getBooleanOperation_Right()
	 * @model required="true"
	 * @generated
	 */
	BooleanExpression getRight();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.minilang.BooleanOperation#getRight <em>Right</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(BooleanExpression value);

} // BooleanOperation
