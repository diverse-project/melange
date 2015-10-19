/**
 */
package root;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>A</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link root.A#getToB <em>To B</em>}</li>
 * </ul>
 *
 * @see root.RootPackage#getA()
 * @model
 * @generated
 */
public interface A extends SuperA {
	/**
	 * Returns the value of the '<em><b>To B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To B</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To B</em>' reference.
	 * @see #setToB(B)
	 * @see root.RootPackage#getA_ToB()
	 * @model
	 * @generated
	 */
	B getToB();

	/**
	 * Sets the value of the '{@link root.A#getToB <em>To B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To B</em>' reference.
	 * @see #getToB()
	 * @generated
	 */
	void setToB(B value);

} // A
