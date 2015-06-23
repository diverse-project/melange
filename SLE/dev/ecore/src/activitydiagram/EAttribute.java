/**
 */
package activitydiagram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EAttribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagram.EAttribute#isID <em>ID</em>}</li>
 *   <li>{@link activitydiagram.EAttribute#getEAttributeType <em>EAttribute Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagram.EcorePackage#getEAttribute()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ConsistentTransient'"
 * @generated
 */
public interface EAttribute extends EStructuralFeature {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(boolean)
	 * @see activitydiagram.EcorePackage#getEAttribute_ID()
	 * @model dataType="activitydiagram.EBoolean"
	 * @generated
	 */
	boolean isID();

	/**
	 * Sets the value of the '{@link activitydiagram.EAttribute#isID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #isID()
	 * @generated
	 */
	void setID(boolean value);

	/**
	 * Returns the value of the '<em><b>EAttribute Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EAttribute Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EAttribute Type</em>' reference.
	 * @see activitydiagram.EcorePackage#getEAttribute_EAttributeType()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EDataType getEAttributeType();

} // EAttribute
