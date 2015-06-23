/**
 */
package activitydiagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EGeneric Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagram.EGenericType#getEUpperBound <em>EUpper Bound</em>}</li>
 *   <li>{@link activitydiagram.EGenericType#getETypeArguments <em>EType Arguments</em>}</li>
 *   <li>{@link activitydiagram.EGenericType#getERawType <em>ERaw Type</em>}</li>
 *   <li>{@link activitydiagram.EGenericType#getELowerBound <em>ELower Bound</em>}</li>
 *   <li>{@link activitydiagram.EGenericType#getETypeParameter <em>EType Parameter</em>}</li>
 *   <li>{@link activitydiagram.EGenericType#getEClassifier <em>EClassifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagram.ActivitydiagramPackage#getEGenericType()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ConsistentType ConsistentBounds ConsistentArguments'"
 * @generated
 */
public interface EGenericType extends EObject {
	/**
	 * Returns the value of the '<em><b>EUpper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EUpper Bound</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EUpper Bound</em>' containment reference.
	 * @see #setEUpperBound(EGenericType)
	 * @see activitydiagram.ActivitydiagramPackage#getEGenericType_EUpperBound()
	 * @model containment="true"
	 * @generated
	 */
	EGenericType getEUpperBound();

	/**
	 * Sets the value of the '{@link activitydiagram.EGenericType#getEUpperBound <em>EUpper Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EUpper Bound</em>' containment reference.
	 * @see #getEUpperBound()
	 * @generated
	 */
	void setEUpperBound(EGenericType value);

	/**
	 * Returns the value of the '<em><b>EType Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagram.EGenericType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EType Arguments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EType Arguments</em>' containment reference list.
	 * @see activitydiagram.ActivitydiagramPackage#getEGenericType_ETypeArguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<EGenericType> getETypeArguments();

	/**
	 * Returns the value of the '<em><b>ERaw Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ERaw Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ERaw Type</em>' reference.
	 * @see activitydiagram.ActivitydiagramPackage#getEGenericType_ERawType()
	 * @model required="true" transient="true" changeable="false" derived="true"
	 * @generated
	 */
	EClassifier getERawType();

	/**
	 * Returns the value of the '<em><b>ELower Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ELower Bound</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ELower Bound</em>' containment reference.
	 * @see #setELowerBound(EGenericType)
	 * @see activitydiagram.ActivitydiagramPackage#getEGenericType_ELowerBound()
	 * @model containment="true"
	 * @generated
	 */
	EGenericType getELowerBound();

	/**
	 * Sets the value of the '{@link activitydiagram.EGenericType#getELowerBound <em>ELower Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ELower Bound</em>' containment reference.
	 * @see #getELowerBound()
	 * @generated
	 */
	void setELowerBound(EGenericType value);

	/**
	 * Returns the value of the '<em><b>EType Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EType Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EType Parameter</em>' reference.
	 * @see #setETypeParameter(ETypeParameter)
	 * @see activitydiagram.ActivitydiagramPackage#getEGenericType_ETypeParameter()
	 * @model resolveProxies="false"
	 * @generated
	 */
	ETypeParameter getETypeParameter();

	/**
	 * Sets the value of the '{@link activitydiagram.EGenericType#getETypeParameter <em>EType Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EType Parameter</em>' reference.
	 * @see #getETypeParameter()
	 * @generated
	 */
	void setETypeParameter(ETypeParameter value);

	/**
	 * Returns the value of the '<em><b>EClassifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EClassifier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EClassifier</em>' reference.
	 * @see #setEClassifier(EClassifier)
	 * @see activitydiagram.ActivitydiagramPackage#getEGenericType_EClassifier()
	 * @model
	 * @generated
	 */
	EClassifier getEClassifier();

	/**
	 * Sets the value of the '{@link activitydiagram.EGenericType#getEClassifier <em>EClassifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EClassifier</em>' reference.
	 * @see #getEClassifier()
	 * @generated
	 */
	void setEClassifier(EClassifier value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="activitydiagram.EBoolean" objectDataType="activitydiagram.EJavaObject"
	 * @generated
	 */
	boolean isInstance(Object object);

} // EGenericType
