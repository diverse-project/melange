/**
 */
package simpleimperativelanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Lit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link simpleimperativelanguage.StringLit#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see simpleimperativelanguage.SimpleimperativelanguagePackage#getStringLit()
 * @model
 * @generated
 */
public interface StringLit extends Literal {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see simpleimperativelanguage.SimpleimperativelanguagePackage#getStringLit_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link simpleimperativelanguage.StringLit#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // StringLit
