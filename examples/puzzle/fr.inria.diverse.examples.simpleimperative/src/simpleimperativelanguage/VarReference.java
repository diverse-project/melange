/**
 */
package simpleimperativelanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Var Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link simpleimperativelanguage.VarReference#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see simpleimperativelanguage.SimpleimperativelanguagePackage#getVarReference()
 * @model
 * @generated
 */
public interface VarReference extends Expression {
	/**
	 * Returns the value of the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' reference.
	 * @see #setRef(VarDecl)
	 * @see simpleimperativelanguage.SimpleimperativelanguagePackage#getVarReference_Ref()
	 * @model required="true"
	 * @generated
	 */
	VarDecl getRef();

	/**
	 * Sets the value of the '{@link simpleimperativelanguage.VarReference#getRef <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' reference.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(VarDecl value);

} // VarReference
