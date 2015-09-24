/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.csu.idl.idlmm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.idl.idlmm.EnumDef#getMembers <em>Members</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.idl.idlmm.IdlmmPackage#getEnumDef()
 * @model
 * @generated
 */
public interface EnumDef extends TypedefDef {
	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.idl.idlmm.EnumMember}.
	 * It is bidirectional and its opposite is '{@link org.csu.idl.idlmm.EnumMember#getEnum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Members</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see org.csu.idl.idlmm.IdlmmPackage#getEnumDef_Members()
	 * @see org.csu.idl.idlmm.EnumMember#getEnum
	 * @model opposite="enum" containment="true" required="true"
	 * @generated
	 */
	EList<EnumMember> getMembers();

} // EnumDef
