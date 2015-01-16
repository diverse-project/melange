/**
 */
package exhaustive;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see exhaustive.ExhaustivePackage
 * @generated
 */
public interface ExhaustiveFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExhaustiveFactory eINSTANCE = exhaustive.impl.ExhaustiveFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Multiple Super Test</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multiple Super Test</em>'.
	 * @generated
	 */
	MultipleSuperTest createMultipleSuperTest();

	/**
	 * Returns a new object of class '<em>References Test</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>References Test</em>'.
	 * @generated
	 */
	ReferencesTest createReferencesTest();

	/**
	 * Returns a new object of class '<em>Attributes Test</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attributes Test</em>'.
	 * @generated
	 */
	AttributesTest createAttributesTest();

	/**
	 * Returns a new object of class '<em>Operations Test</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operations Test</em>'.
	 * @generated
	 */
	OperationsTest createOperationsTest();

	/**
	 * Returns a new object of class '<em>Generic Test</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generic Test</em>'.
	 * @generated
	 */
	<A, B> GenericTest<A, B> createGenericTest();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ExhaustivePackage getExhaustivePackage();

} //ExhaustiveFactory
