/**
 */
package extended.toppkg.subpkg1;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see extended.toppkg.subpkg1.Subpkg1Package
 * @generated
 */
public interface Subpkg1Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Subpkg1Factory eINSTANCE = extended.toppkg.subpkg1.impl.Subpkg1FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Class1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class1</em>'.
	 * @generated
	 */
	Subpkg1Class1 createSubpkg1Class1();

	/**
	 * Returns a new object of class '<em>Class2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class2</em>'.
	 * @generated
	 */
	Subpkg1Class2 createSubpkg1Class2();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Subpkg1Package getSubpkg1Package();

} //Subpkg1Factory
