/**
 */
package fr.inria.diverse.melange.metamodel.melange;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.inria.diverse.melange.metamodel.melange.MelangePackage
 * @generated
 */
public interface MelangeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MelangeFactory eINSTANCE = fr.inria.diverse.melange.metamodel.melange.impl.MelangeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model Typing Space</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Typing Space</em>'.
	 * @generated
	 */
	ModelTypingSpace createModelTypingSpace();

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
	 * Returns a new object of class '<em>Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aspect</em>'.
	 * @generated
	 */
	Aspect createAspect();

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
	 * Returns a new object of class '<em>Xbase Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Xbase Transformation</em>'.
	 * @generated
	 */
	XbaseTransformation createXbaseTransformation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MelangePackage getMelangePackage();

} //MelangeFactory
