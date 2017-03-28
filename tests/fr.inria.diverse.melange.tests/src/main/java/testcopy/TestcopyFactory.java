/**
 */
package testcopy;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see testcopy.TestcopyPackage
 * @generated
 */
public interface TestcopyFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TestcopyFactory eINSTANCE = testcopy.impl.TestcopyFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attributes</em>'.
	 * @generated
	 */
	Attributes createAttributes();

	/**
	 * Returns a new object of class '<em>Simple References</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple References</em>'.
	 * @generated
	 */
	SimpleReferences createSimpleReferences();

	/**
	 * Returns a new object of class '<em>Opposites A</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Opposites A</em>'.
	 * @generated
	 */
	OppositesA createOppositesA();

	/**
	 * Returns a new object of class '<em>Opposites B</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Opposites B</em>'.
	 * @generated
	 */
	OppositesB createOppositesB();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TestcopyPackage getTestcopyPackage();

} //TestcopyFactory
