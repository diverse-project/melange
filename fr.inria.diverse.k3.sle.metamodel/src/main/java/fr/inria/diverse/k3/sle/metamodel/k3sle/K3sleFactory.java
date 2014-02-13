/**
 */
package fr.inria.diverse.k3.sle.metamodel.k3sle;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.K3slePackage
 * @generated
 */
public interface K3sleFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	K3sleFactory eINSTANCE = fr.inria.diverse.k3.sle.metamodel.k3sle.impl.K3sleFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Megamodel Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Megamodel Root</em>'.
	 * @generated
	 */
	MegamodelRoot createMegamodelRoot();

	/**
	 * Returns a new object of class '<em>Metamodel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Metamodel</em>'.
	 * @generated
	 */
	Metamodel createMetamodel();

	/**
	 * Returns a new object of class '<em>Model Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Type</em>'.
	 * @generated
	 */
	ModelType createModelType();

	/**
	 * Returns a new object of class '<em>Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transformation</em>'.
	 * @generated
	 */
	Transformation createTransformation();

	/**
	 * Returns a new object of class '<em>Ecore Import</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ecore Import</em>'.
	 * @generated
	 */
	EcoreImport createEcoreImport();

	/**
	 * Returns a new object of class '<em>Aspect Import</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aspect Import</em>'.
	 * @generated
	 */
	AspectImport createAspectImport();

	/**
	 * Returns a new object of class '<em>Inheritance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inheritance</em>'.
	 * @generated
	 */
	Inheritance createInheritance();

	/**
	 * Returns a new object of class '<em>Subtyping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subtyping</em>'.
	 * @generated
	 */
	Subtyping createSubtyping();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	K3slePackage getK3slePackage();

} //K3sleFactory
