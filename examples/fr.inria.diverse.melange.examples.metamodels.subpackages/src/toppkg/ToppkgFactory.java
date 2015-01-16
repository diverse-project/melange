/**
 */
package toppkg;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see toppkg.ToppkgPackage
 * @generated
 */
public interface ToppkgFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ToppkgFactory eINSTANCE = toppkg.impl.ToppkgFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Top Class1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Top Class1</em>'.
	 * @generated
	 */
	TopClass1 createTopClass1();

	/**
	 * Returns a new object of class '<em>Top Class2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Top Class2</em>'.
	 * @generated
	 */
	TopClass2 createTopClass2();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ToppkgPackage getToppkgPackage();

} //ToppkgFactory
