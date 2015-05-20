/**
 */
package simpleconstraintslanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link simpleconstraintslanguage.RelationalConstraint#getLeft <em>Left</em>}</li>
 *   <li>{@link simpleconstraintslanguage.RelationalConstraint#getRight <em>Right</em>}</li>
 *   <li>{@link simpleconstraintslanguage.RelationalConstraint#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see simpleconstraintslanguage.SimpleconstraintslanguagePackage#getRelationalConstraint()
 * @model
 * @generated
 */
public interface RelationalConstraint extends Constraint {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(CExpression)
	 * @see simpleconstraintslanguage.SimpleconstraintslanguagePackage#getRelationalConstraint_Left()
	 * @model containment="true" required="true" derived="true"
	 * @generated
	 */
	CExpression getLeft();

	/**
	 * Sets the value of the '{@link simpleconstraintslanguage.RelationalConstraint#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(CExpression value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(CExpression)
	 * @see simpleconstraintslanguage.SimpleconstraintslanguagePackage#getRelationalConstraint_Right()
	 * @model containment="true" required="true" derived="true"
	 * @generated
	 */
	CExpression getRight();

	/**
	 * Sets the value of the '{@link simpleconstraintslanguage.RelationalConstraint#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(CExpression value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link simpleconstraintslanguage.CRelationalOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see simpleconstraintslanguage.CRelationalOperator
	 * @see #setOperator(CRelationalOperator)
	 * @see simpleconstraintslanguage.SimpleconstraintslanguagePackage#getRelationalConstraint_Operator()
	 * @model
	 * @generated
	 */
	CRelationalOperator getOperator();

	/**
	 * Sets the value of the '{@link simpleconstraintslanguage.RelationalConstraint#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see simpleconstraintslanguage.CRelationalOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(CRelationalOperator value);

} // RelationalConstraint
