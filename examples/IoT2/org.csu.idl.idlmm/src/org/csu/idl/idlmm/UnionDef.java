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
 * A representation of the model object '<em><b>Union Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.idl.idlmm.UnionDef#getUnionMembers <em>Union Members</em>}</li>
 *   <li>{@link org.csu.idl.idlmm.UnionDef#getContainedDiscrim <em>Contained Discrim</em>}</li>
 *   <li>{@link org.csu.idl.idlmm.UnionDef#getSharedDiscrim <em>Shared Discrim</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.idl.idlmm.IdlmmPackage#getUnionDef()
 * @model
 * @generated
 */
public interface UnionDef extends TypedefDef {
	/**
	 * Returns the value of the '<em><b>Union Members</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.idl.idlmm.UnionField}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Union Members</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Union Members</em>' containment reference list.
	 * @see org.csu.idl.idlmm.IdlmmPackage#getUnionDef_UnionMembers()
	 * @model containment="true"
	 * @generated
	 */
	EList<UnionField> getUnionMembers();

	/**
	 * Returns the value of the '<em><b>Contained Discrim</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Discrim</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Discrim</em>' containment reference.
	 * @see #setContainedDiscrim(IDLType)
	 * @see org.csu.idl.idlmm.IdlmmPackage#getUnionDef_ContainedDiscrim()
	 * @model containment="true"
	 * @generated
	 */
	IDLType getContainedDiscrim();

	/**
	 * Sets the value of the '{@link org.csu.idl.idlmm.UnionDef#getContainedDiscrim <em>Contained Discrim</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contained Discrim</em>' containment reference.
	 * @see #getContainedDiscrim()
	 * @generated
	 */
	void setContainedDiscrim(IDLType value);

	/**
	 * Returns the value of the '<em><b>Shared Discrim</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shared Discrim</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shared Discrim</em>' reference.
	 * @see #setSharedDiscrim(TypedefDef)
	 * @see org.csu.idl.idlmm.IdlmmPackage#getUnionDef_SharedDiscrim()
	 * @model
	 * @generated
	 */
	TypedefDef getSharedDiscrim();

	/**
	 * Sets the value of the '{@link org.csu.idl.idlmm.UnionDef#getSharedDiscrim <em>Shared Discrim</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shared Discrim</em>' reference.
	 * @see #getSharedDiscrim()
	 * @generated
	 */
	void setSharedDiscrim(TypedefDef value);

} // UnionDef
