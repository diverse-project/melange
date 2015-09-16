/**
 */
package some.basepackage.root.subpackage;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see some.basepackage.root.subpackage.SubpackagePackage
 * @generated
 */
public interface SubpackageFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SubpackageFactory eINSTANCE = some.basepackage.root.subpackage.impl.SubpackageFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Class B</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class B</em>'.
	 * @generated
	 */
	ClassB createClassB();

	/**
	 * Returns a new object of class '<em>Super B</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Super B</em>'.
	 * @generated
	 */
	SuperB createSuperB();

	/**
	 * Returns a new object of class '<em>Sub A</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sub A</em>'.
	 * @generated
	 */
	SubA createSubA();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SubpackagePackage getSubpackagePackage();

} //SubpackageFactory
