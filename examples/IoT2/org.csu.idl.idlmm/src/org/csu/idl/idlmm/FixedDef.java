/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.csu.idl.idlmm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fixed Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.idl.idlmm.FixedDef#getDigits <em>Digits</em>}</li>
 *   <li>{@link org.csu.idl.idlmm.FixedDef#getScale <em>Scale</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.idl.idlmm.IdlmmPackage#getFixedDef()
 * @model
 * @generated
 */
public interface FixedDef extends IDLType {
	/**
	 * Returns the value of the '<em><b>Digits</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Digits</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Digits</em>' containment reference.
	 * @see #setDigits(Expression)
	 * @see org.csu.idl.idlmm.IdlmmPackage#getFixedDef_Digits()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getDigits();

	/**
	 * Sets the value of the '{@link org.csu.idl.idlmm.FixedDef#getDigits <em>Digits</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Digits</em>' containment reference.
	 * @see #getDigits()
	 * @generated
	 */
	void setDigits(Expression value);

	/**
	 * Returns the value of the '<em><b>Scale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scale</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale</em>' containment reference.
	 * @see #setScale(Expression)
	 * @see org.csu.idl.idlmm.IdlmmPackage#getFixedDef_Scale()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getScale();

	/**
	 * Sets the value of the '{@link org.csu.idl.idlmm.FixedDef#getScale <em>Scale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale</em>' containment reference.
	 * @see #getScale()
	 * @generated
	 */
	void setScale(Expression value);

} // FixedDef
