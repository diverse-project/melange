/**
 */
package activitydiagram;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EPackage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagram.EPackage#getNsURI <em>Ns URI</em>}</li>
 *   <li>{@link activitydiagram.EPackage#getNsPrefix <em>Ns Prefix</em>}</li>
 *   <li>{@link activitydiagram.EPackage#getEFactoryInstance <em>EFactory Instance</em>}</li>
 *   <li>{@link activitydiagram.EPackage#getEClassifiers <em>EClassifiers</em>}</li>
 *   <li>{@link activitydiagram.EPackage#getESubpackages <em>ESubpackages</em>}</li>
 *   <li>{@link activitydiagram.EPackage#getESuperPackage <em>ESuper Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagram.ActivitydiagramPackage#getEPackage()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='WellFormedNsURI WellFormedNsPrefix UniqueSubpackageNames UniqueClassifierNames UniqueNsURIs'"
 * @generated
 */
public interface EPackage extends ENamedElement {
	/**
	 * Returns the value of the '<em><b>Ns URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ns URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ns URI</em>' attribute.
	 * @see #setNsURI(String)
	 * @see activitydiagram.ActivitydiagramPackage#getEPackage_NsURI()
	 * @model dataType="activitydiagram.EString"
	 * @generated
	 */
	String getNsURI();

	/**
	 * Sets the value of the '{@link activitydiagram.EPackage#getNsURI <em>Ns URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ns URI</em>' attribute.
	 * @see #getNsURI()
	 * @generated
	 */
	void setNsURI(String value);

	/**
	 * Returns the value of the '<em><b>Ns Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ns Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ns Prefix</em>' attribute.
	 * @see #setNsPrefix(String)
	 * @see activitydiagram.ActivitydiagramPackage#getEPackage_NsPrefix()
	 * @model dataType="activitydiagram.EString"
	 * @generated
	 */
	String getNsPrefix();

	/**
	 * Sets the value of the '{@link activitydiagram.EPackage#getNsPrefix <em>Ns Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ns Prefix</em>' attribute.
	 * @see #getNsPrefix()
	 * @generated
	 */
	void setNsPrefix(String value);

	/**
	 * Returns the value of the '<em><b>EFactory Instance</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link activitydiagram.EFactory#getEPackage <em>EPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EFactory Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EFactory Instance</em>' reference.
	 * @see #setEFactoryInstance(EFactory)
	 * @see activitydiagram.ActivitydiagramPackage#getEPackage_EFactoryInstance()
	 * @see activitydiagram.EFactory#getEPackage
	 * @model opposite="ePackage" resolveProxies="false" required="true" transient="true"
	 * @generated
	 */
	EFactory getEFactoryInstance();

	/**
	 * Sets the value of the '{@link activitydiagram.EPackage#getEFactoryInstance <em>EFactory Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EFactory Instance</em>' reference.
	 * @see #getEFactoryInstance()
	 * @generated
	 */
	void setEFactoryInstance(EFactory value);

	/**
	 * Returns the value of the '<em><b>EClassifiers</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagram.EClassifier}.
	 * It is bidirectional and its opposite is '{@link activitydiagram.EClassifier#getEPackage <em>EPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EClassifiers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EClassifiers</em>' containment reference list.
	 * @see activitydiagram.ActivitydiagramPackage#getEPackage_EClassifiers()
	 * @see activitydiagram.EClassifier#getEPackage
	 * @model opposite="ePackage" containment="true"
	 * @generated
	 */
	EList<EClassifier> getEClassifiers();

	/**
	 * Returns the value of the '<em><b>ESubpackages</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagram.EPackage}.
	 * It is bidirectional and its opposite is '{@link activitydiagram.EPackage#getESuperPackage <em>ESuper Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ESubpackages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ESubpackages</em>' containment reference list.
	 * @see activitydiagram.ActivitydiagramPackage#getEPackage_ESubpackages()
	 * @see activitydiagram.EPackage#getESuperPackage
	 * @model opposite="eSuperPackage" containment="true"
	 * @generated
	 */
	EList<EPackage> getESubpackages();

	/**
	 * Returns the value of the '<em><b>ESuper Package</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link activitydiagram.EPackage#getESubpackages <em>ESubpackages</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ESuper Package</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ESuper Package</em>' container reference.
	 * @see activitydiagram.ActivitydiagramPackage#getEPackage_ESuperPackage()
	 * @see activitydiagram.EPackage#getESubpackages
	 * @model opposite="eSubpackages" changeable="false"
	 * @generated
	 */
	EPackage getESuperPackage();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameDataType="activitydiagram.EString"
	 * @generated
	 */
	EClassifier getEClassifier(String name);

} // EPackage
