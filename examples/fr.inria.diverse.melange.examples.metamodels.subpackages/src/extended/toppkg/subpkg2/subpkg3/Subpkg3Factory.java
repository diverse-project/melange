/**
 */
package extended.toppkg.subpkg2.subpkg3;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see extended.toppkg.subpkg2.subpkg3.Subpkg3Package
 * @generated
 */
public interface Subpkg3Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Subpkg3Factory eINSTANCE = extended.toppkg.subpkg2.subpkg3.impl.Subpkg3FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Class1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class1</em>'.
	 * @generated
	 */
	Subpkg3Class1 createSubpkg3Class1();

	/**
	 * Returns a new object of class '<em>Class2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class2</em>'.
	 * @generated
	 */
	Subpkg3Class2 createSubpkg3Class2();

	/**
	 * Returns a new object of class '<em>Class A</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class A</em>'.
	 * @generated
	 */
	ClassA createClassA();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Subpkg3Package getSubpkg3Package();

} //Subpkg3Factory
