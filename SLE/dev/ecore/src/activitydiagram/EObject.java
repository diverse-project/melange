/**
 */
package activitydiagram;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;

import org.eclipse.emf.ecore.resource.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EObject</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see activitydiagram.EcorePackage#getEObject()
 * @model
 * @generated
 */
public interface EObject extends org.eclipse.emf.ecore.EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
//	EClass eClass();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="activitydiagram.EBoolean"
	 * @generated
	 */
	boolean eIsProxy();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="activitydiagram.EResource"
	 * @generated
	 */
	Resource eResource();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObject eContainer();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
//	EStructuralFeature eContainingFeature();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
//	EReference eContainmentFeature();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="activitydiagram.EEList<activitydiagram.EObject>" many="false"
	 * @generated
	 */
//	EList<EObject> eContents();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="activitydiagram.ETreeIterator<activitydiagram.EObject>"
	 * @generated
	 */
//	TreeIterator<EObject> eAllContents();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="activitydiagram.EEList<activitydiagram.EObject>" many="false"
	 * @generated
	 */
//	EList<EObject> eCrossReferences();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="activitydiagram.EJavaObject"
	 * @generated
	 */
	Object eGet(EStructuralFeature feature);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="activitydiagram.EJavaObject" resolveDataType="activitydiagram.EBoolean"
	 * @generated
	 */
	Object eGet(EStructuralFeature feature, boolean resolve);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model newValueDataType="activitydiagram.EJavaObject"
	 * @generated
	 */
	void eSet(EStructuralFeature feature, Object newValue);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="activitydiagram.EBoolean"
	 * @generated
	 */
	boolean eIsSet(EStructuralFeature feature);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void eUnset(EStructuralFeature feature);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="activitydiagram.EJavaObject" exceptions="activitydiagram.EInvocationTargetException" argumentsDataType="activitydiagram.EEList<?>" argumentsMany="false"
	 * @generated
	 */
	Object eInvoke(EOperation operation, EList<?> arguments) throws InvocationTargetException;

} // EObject
