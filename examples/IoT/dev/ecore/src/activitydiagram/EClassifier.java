/**
 */
package activitydiagram;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EClassifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagram.EClassifier#getInstanceClassName <em>Instance Class Name</em>}</li>
 *   <li>{@link activitydiagram.EClassifier#getInstanceClass <em>Instance Class</em>}</li>
 *   <li>{@link activitydiagram.EClassifier#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link activitydiagram.EClassifier#getInstanceTypeName <em>Instance Type Name</em>}</li>
 *   <li>{@link activitydiagram.EClassifier#getEPackage <em>EPackage</em>}</li>
 *   <li>{@link activitydiagram.EClassifier#getETypeParameters <em>EType Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagram.EcorePackage#getEClassifier()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='WellFormedInstanceTypeName UniqueTypeParameterNames'"
 * @generated
 */
public interface EClassifier extends ENamedElement {
	/**
	 * Returns the value of the '<em><b>Instance Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Class Name</em>' attribute.
	 * @see #setInstanceClassName(String)
	 * @see activitydiagram.EcorePackage#getEClassifier_InstanceClassName()
	 * @model unsettable="true" dataType="activitydiagram.EString" volatile="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getInstanceClassName();

	/**
	 * Sets the value of the '{@link activitydiagram.EClassifier#getInstanceClassName <em>Instance Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Class Name</em>' attribute.
	 * @see #getInstanceClassName()
	 * @generated
	 */
	void setInstanceClassName(String value);

	/**
	 * Returns the value of the '<em><b>Instance Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Class</em>' attribute.
	 * @see activitydiagram.EcorePackage#getEClassifier_InstanceClass()
	 * @model dataType="activitydiagram.EJavaClass<?>" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Class<?> getInstanceClass();

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see activitydiagram.EcorePackage#getEClassifier_DefaultValue()
	 * @model dataType="activitydiagram.EJavaObject" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Object getDefaultValue();

	/**
	 * Returns the value of the '<em><b>Instance Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Type Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Type Name</em>' attribute.
	 * @see #setInstanceTypeName(String)
	 * @see activitydiagram.EcorePackage#getEClassifier_InstanceTypeName()
	 * @model unsettable="true" dataType="activitydiagram.EString" volatile="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getInstanceTypeName();

	/**
	 * Sets the value of the '{@link activitydiagram.EClassifier#getInstanceTypeName <em>Instance Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Type Name</em>' attribute.
	 * @see #getInstanceTypeName()
	 * @generated
	 */
	void setInstanceTypeName(String value);

	/**
	 * Returns the value of the '<em><b>EPackage</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link activitydiagram.EPackage#getEClassifiers <em>EClassifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EPackage</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EPackage</em>' container reference.
	 * @see activitydiagram.EcorePackage#getEClassifier_EPackage()
	 * @see activitydiagram.EPackage#getEClassifiers
	 * @model opposite="eClassifiers" changeable="false"
	 * @generated
	 */
	EPackage getEPackage();

	/**
	 * Returns the value of the '<em><b>EType Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagram.ETypeParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EType Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EType Parameters</em>' containment reference list.
	 * @see activitydiagram.EcorePackage#getEClassifier_ETypeParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<ETypeParameter> getETypeParameters();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="activitydiagram.EBoolean" objectDataType="activitydiagram.EJavaObject"
	 * @generated
	 */
	boolean isInstance(Object object);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="activitydiagram.EInt"
	 * @generated
	 */
	int getClassifierID();

} // EClassifier
