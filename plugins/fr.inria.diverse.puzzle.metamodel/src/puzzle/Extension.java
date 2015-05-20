/**
 */
package puzzle;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link puzzle.Extension#getBase <em>Base</em>}</li>
 *   <li>{@link puzzle.Extension#getExtension <em>Extension</em>}</li>
 * </ul>
 *
 * @see puzzle.PuzzlePackage#getExtension()
 * @model
 * @generated
 */
public interface Extension extends Statement {
	/**
	 * Returns the value of the '<em><b>Base</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base</em>' containment reference.
	 * @see #setBase(Expression)
	 * @see puzzle.PuzzlePackage#getExtension_Base()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getBase();

	/**
	 * Sets the value of the '{@link puzzle.Extension#getBase <em>Base</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base</em>' containment reference.
	 * @see #getBase()
	 * @generated
	 */
	void setBase(Expression value);

	/**
	 * Returns the value of the '<em><b>Extension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension</em>' containment reference.
	 * @see #setExtension(Expression)
	 * @see puzzle.PuzzlePackage#getExtension_Extension()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getExtension();

	/**
	 * Sets the value of the '{@link puzzle.Extension#getExtension <em>Extension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension</em>' containment reference.
	 * @see #getExtension()
	 * @generated
	 */
	void setExtension(Expression value);

} // Extension
