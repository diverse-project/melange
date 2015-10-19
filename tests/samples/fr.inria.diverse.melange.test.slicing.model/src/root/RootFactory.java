/**
 */
package root;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see root.RootPackage
 * @generated
 */
public interface RootFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RootFactory eINSTANCE = root.impl.RootFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Super A</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Super A</em>'.
	 * @generated
	 */
	SuperA createSuperA();

	/**
	 * Returns a new object of class '<em>A</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>A</em>'.
	 * @generated
	 */
	A createA();

	/**
	 * Returns a new object of class '<em>Sub A</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sub A</em>'.
	 * @generated
	 */
	SubA createSubA();

	/**
	 * Returns a new object of class '<em>B</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>B</em>'.
	 * @generated
	 */
	B createB();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RootPackage getRootPackage();

} //RootFactory
