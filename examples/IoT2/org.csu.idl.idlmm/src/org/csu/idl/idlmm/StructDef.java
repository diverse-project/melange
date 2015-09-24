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
 * A representation of the model object '<em><b>Struct Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.idl.idlmm.StructDef#getMembers <em>Members</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.idl.idlmm.IdlmmPackage#getStructDef()
 * @model
 * @generated
 */
public interface StructDef extends TypedefDef {
	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.idl.idlmm.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see org.csu.idl.idlmm.IdlmmPackage#getStructDef_Members()
	 * @model containment="true"
	 * @generated
	 */
	EList<Field> getMembers();

} // StructDef
