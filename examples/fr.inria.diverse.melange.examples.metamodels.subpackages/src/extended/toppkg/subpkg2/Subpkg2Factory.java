/**
 */
package extended.toppkg.subpkg2;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see extended.toppkg.subpkg2.Subpkg2Package
 * @generated
 */
public interface Subpkg2Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Subpkg2Factory eINSTANCE = extended.toppkg.subpkg2.impl.Subpkg2FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Class1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class1</em>'.
	 * @generated
	 */
	Subpkg2Class1 createSubpkg2Class1();

	/**
	 * Returns a new object of class '<em>Class2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class2</em>'.
	 * @generated
	 */
	Subpkg2Class2 createSubpkg2Class2();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Subpkg2Package getSubpkg2Package();

} //Subpkg2Factory
