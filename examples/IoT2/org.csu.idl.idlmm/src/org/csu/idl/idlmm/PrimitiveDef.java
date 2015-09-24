/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.csu.idl.idlmm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.idl.idlmm.PrimitiveDef#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.idl.idlmm.IdlmmPackage#getPrimitiveDef()
 * @model
 * @generated
 */
public interface PrimitiveDef extends IDLType {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.csu.idl.idlmm.PrimitiveKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.csu.idl.idlmm.PrimitiveKind
	 * @see #setKind(PrimitiveKind)
	 * @see org.csu.idl.idlmm.IdlmmPackage#getPrimitiveDef_Kind()
	 * @model
	 * @generated
	 */
	PrimitiveKind getKind();

	/**
	 * Sets the value of the '{@link org.csu.idl.idlmm.PrimitiveDef#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.csu.idl.idlmm.PrimitiveKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(PrimitiveKind value);

} // PrimitiveDef
