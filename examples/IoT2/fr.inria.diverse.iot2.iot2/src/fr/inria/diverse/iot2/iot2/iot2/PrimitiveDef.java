/**
 */
package fr.inria.diverse.iot2.iot2.iot2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.iot2.iot2.iot2.PrimitiveDef#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.iot2.iot2.iot2.Iot2Package#getPrimitiveDef()
 * @model
 * @generated
 */
public interface PrimitiveDef extends IDLType {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.inria.diverse.iot2.iot2.iot2.PrimitiveKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see fr.inria.diverse.iot2.iot2.iot2.PrimitiveKind
	 * @see #setKind(PrimitiveKind)
	 * @see fr.inria.diverse.iot2.iot2.iot2.Iot2Package#getPrimitiveDef_Kind()
	 * @model
	 * @generated
	 */
	PrimitiveKind getKind();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.iot2.iot2.iot2.PrimitiveDef#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see fr.inria.diverse.iot2.iot2.iot2.PrimitiveKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(PrimitiveKind value);

} // PrimitiveDef
