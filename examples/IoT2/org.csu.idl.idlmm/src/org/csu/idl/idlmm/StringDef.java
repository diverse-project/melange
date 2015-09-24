/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.csu.idl.idlmm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.idl.idlmm.StringDef#getBound <em>Bound</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.idl.idlmm.IdlmmPackage#getStringDef()
 * @model
 * @generated
 */
public interface StringDef extends IDLType {
	/**
	 * Returns the value of the '<em><b>Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bound</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bound</em>' containment reference.
	 * @see #setBound(Expression)
	 * @see org.csu.idl.idlmm.IdlmmPackage#getStringDef_Bound()
	 * @model containment="true"
	 * @generated
	 */
	Expression getBound();

	/**
	 * Sets the value of the '{@link org.csu.idl.idlmm.StringDef#getBound <em>Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bound</em>' containment reference.
	 * @see #getBound()
	 * @generated
	 */
	void setBound(Expression value);

} // StringDef
