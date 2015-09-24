/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.csu.idl.idlmm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.idl.idlmm.EnumMember#getEnum <em>Enum</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.idl.idlmm.IdlmmPackage#getEnumMember()
 * @model
 * @generated
 */
public interface EnumMember extends Constant {
	/**
	 * Returns the value of the '<em><b>Enum</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.csu.idl.idlmm.EnumDef#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enum</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum</em>' container reference.
	 * @see #setEnum(EnumDef)
	 * @see org.csu.idl.idlmm.IdlmmPackage#getEnumMember_Enum()
	 * @see org.csu.idl.idlmm.EnumDef#getMembers
	 * @model opposite="members" required="true" transient="false"
	 * @generated
	 */
	EnumDef getEnum();

	/**
	 * Sets the value of the '{@link org.csu.idl.idlmm.EnumMember#getEnum <em>Enum</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enum</em>' container reference.
	 * @see #getEnum()
	 * @generated
	 */
	void setEnum(EnumDef value);

} // EnumMember
