/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.csu.idl.idlmm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constant Def Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.idl.idlmm.ConstantDefRef#getConstant <em>Constant</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.idl.idlmm.IdlmmPackage#getConstantDefRef()
 * @model
 * @generated
 */
public interface ConstantDefRef extends LiteralExpression {
	/**
	 * Returns the value of the '<em><b>Constant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant</em>' reference.
	 * @see #setConstant(Constant)
	 * @see org.csu.idl.idlmm.IdlmmPackage#getConstantDefRef_Constant()
	 * @model required="true"
	 * @generated
	 */
	Constant getConstant();

	/**
	 * Sets the value of the '{@link org.csu.idl.idlmm.ConstantDefRef#getConstant <em>Constant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant</em>' reference.
	 * @see #getConstant()
	 * @generated
	 */
	void setConstant(Constant value);

} // ConstantDefRef
