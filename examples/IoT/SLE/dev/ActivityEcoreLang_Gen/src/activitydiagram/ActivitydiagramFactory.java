/**
 */
package activitydiagram;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see activitydiagram.ActivitydiagramPackage
 * @generated
 */
public interface ActivitydiagramFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ActivitydiagramFactory eINSTANCE = activitydiagram.impl.ActivitydiagramFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Opaque Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Opaque Action</em>'.
	 * @generated
	 */
	OpaqueAction createOpaqueAction();

	/**
	 * Returns a new object of class '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity</em>'.
	 * @generated
	 */
	Activity createActivity();

	/**
	 * Returns a new object of class '<em>Input Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Value</em>'.
	 * @generated
	 */
	InputValue createInputValue();

	/**
	 * Returns a new object of class '<em>EAttribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EAttribute</em>'.
	 * @generated
	 */
	EAttribute createEAttribute();

	/**
	 * Returns a new object of class '<em>EAnnotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EAnnotation</em>'.
	 * @generated
	 */
	EAnnotation createEAnnotation();

	/**
	 * Returns a new object of class '<em>EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EClass</em>'.
	 * @generated
	 */
	EClass createEClass();

	/**
	 * Returns a new object of class '<em>EData Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EData Type</em>'.
	 * @generated
	 */
	EDataType createEDataType();

	/**
	 * Returns a new object of class '<em>EEnum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEnum</em>'.
	 * @generated
	 */
	EEnum createEEnum();

	/**
	 * Returns a new object of class '<em>EEnum Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEnum Literal</em>'.
	 * @generated
	 */
	EEnumLiteral createEEnumLiteral();

	/**
	 * Returns a new object of class '<em>EFactory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EFactory</em>'.
	 * @generated
	 */
	activitydiagram.EFactory createEFactory();

	/**
	 * Returns a new object of class '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EObject</em>'.
	 * @generated
	 */
	EObject createEObject();

	/**
	 * Returns a new object of class '<em>EOperation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EOperation</em>'.
	 * @generated
	 */
	EOperation createEOperation();

	/**
	 * Returns a new object of class '<em>EPackage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EPackage</em>'.
	 * @generated
	 */
	EPackage createEPackage();

	/**
	 * Returns a new object of class '<em>EParameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EParameter</em>'.
	 * @generated
	 */
	EParameter createEParameter();

	/**
	 * Returns a new object of class '<em>EReference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EReference</em>'.
	 * @generated
	 */
	EReference createEReference();

	/**
	 * Returns a new object of class '<em>EGeneric Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EGeneric Type</em>'.
	 * @generated
	 */
	EGenericType createEGenericType();

	/**
	 * Returns a new object of class '<em>EType Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EType Parameter</em>'.
	 * @generated
	 */
	ETypeParameter createETypeParameter();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ActivitydiagramPackage getActivitydiagramPackage();

} //ActivitydiagramFactory
