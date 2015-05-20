/**
 */
package simpleimperativelanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bool Lit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link simpleimperativelanguage.BoolLit#isValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see simpleimperativelanguage.SimpleimperativelanguagePackage#getBoolLit()
 * @model
 * @generated
 */
public interface BoolLit extends Literal {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(boolean)
	 * @see simpleimperativelanguage.SimpleimperativelanguagePackage#getBoolLit_Value()
	 * @model
	 * @generated
	 */
	boolean isValue();

	/**
	 * Sets the value of the '{@link simpleimperativelanguage.BoolLit#isValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #isValue()
	 * @generated
	 */
	void setValue(boolean value);

} // BoolLit
