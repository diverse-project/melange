/**
 */
package puzzle;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aggregation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link puzzle.Aggregation#getRequiring <em>Requiring</em>}</li>
 *   <li>{@link puzzle.Aggregation#getProviding <em>Providing</em>}</li>
 *   <li>{@link puzzle.Aggregation#getBinding <em>Binding</em>}</li>
 * </ul>
 *
 * @see puzzle.PuzzlePackage#getAggregation()
 * @model
 * @generated
 */
public interface Aggregation extends Statement {
	/**
	 * Returns the value of the '<em><b>Requiring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requiring</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requiring</em>' containment reference.
	 * @see #setRequiring(Expression)
	 * @see puzzle.PuzzlePackage#getAggregation_Requiring()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getRequiring();

	/**
	 * Sets the value of the '{@link puzzle.Aggregation#getRequiring <em>Requiring</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requiring</em>' containment reference.
	 * @see #getRequiring()
	 * @generated
	 */
	void setRequiring(Expression value);

	/**
	 * Returns the value of the '<em><b>Providing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Providing</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Providing</em>' containment reference.
	 * @see #setProviding(Expression)
	 * @see puzzle.PuzzlePackage#getAggregation_Providing()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getProviding();

	/**
	 * Sets the value of the '{@link puzzle.Aggregation#getProviding <em>Providing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Providing</em>' containment reference.
	 * @see #getProviding()
	 * @generated
	 */
	void setProviding(Expression value);

	/**
	 * Returns the value of the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding</em>' attribute.
	 * @see #setBinding(String)
	 * @see puzzle.PuzzlePackage#getAggregation_Binding()
	 * @model
	 * @generated
	 */
	String getBinding();

	/**
	 * Sets the value of the '{@link puzzle.Aggregation#getBinding <em>Binding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding</em>' attribute.
	 * @see #getBinding()
	 * @generated
	 */
	void setBinding(String value);

} // Aggregation
