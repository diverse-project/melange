/**
 */
package fr.inria.diverse.iot2.iot2.iot2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IDL Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.iot2.iot2.iot2.IDLType#getTypeCode <em>Type Code</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.iot2.iot2.iot2.Iot2Package#getIDLType()
 * @model abstract="true"
 * @generated
 */
public interface IDLType extends EObject {
	/**
	 * Returns the value of the '<em><b>Type Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Code</em>' attribute.
	 * @see #setTypeCode(String)
	 * @see fr.inria.diverse.iot2.iot2.iot2.Iot2Package#getIDLType_TypeCode()
	 * @model dataType="fr.inria.diverse.iot2.iot2.iot2.ETypeCode"
	 * @generated
	 */
	String getTypeCode();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.iot2.iot2.iot2.IDLType#getTypeCode <em>Type Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Code</em>' attribute.
	 * @see #getTypeCode()
	 * @generated
	 */
	void setTypeCode(String value);

} // IDLType
