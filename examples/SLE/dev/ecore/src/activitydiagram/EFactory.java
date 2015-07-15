/**
 */
package activitydiagram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EFactory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagram.EFactory#getEPackage <em>EPackage</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagram.EcorePackage#getEFactory()
 * @model
 * @generated
 */
public interface EFactory extends EModelElement {
	/**
	 * Returns the value of the '<em><b>EPackage</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link activitydiagram.EPackage#getEFactoryInstance <em>EFactory Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EPackage</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EPackage</em>' reference.
	 * @see #setEPackage(EPackage)
	 * @see activitydiagram.EcorePackage#getEFactory_EPackage()
	 * @see activitydiagram.EPackage#getEFactoryInstance
	 * @model opposite="eFactoryInstance" resolveProxies="false" required="true" transient="true"
	 * @generated
	 */
	EPackage getEPackage();

	/**
	 * Sets the value of the '{@link activitydiagram.EFactory#getEPackage <em>EPackage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EPackage</em>' reference.
	 * @see #getEPackage()
	 * @generated
	 */
	void setEPackage(EPackage value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObject create(EClass eClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="activitydiagram.EJavaObject" literalValueDataType="activitydiagram.EString"
	 * @generated
	 */
	Object createFromString(EDataType eDataType, String literalValue);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="activitydiagram.EString" instanceValueDataType="activitydiagram.EJavaObject"
	 * @generated
	 */
	String convertToString(EDataType eDataType, Object instanceValue);

} // EFactory
