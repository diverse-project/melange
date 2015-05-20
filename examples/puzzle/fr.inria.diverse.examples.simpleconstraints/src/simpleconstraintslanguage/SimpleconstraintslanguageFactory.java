/**
 */
package simpleconstraintslanguage;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see simpleconstraintslanguage.SimpleconstraintslanguagePackage
 * @generated
 */
public interface SimpleconstraintslanguageFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimpleconstraintslanguageFactory eINSTANCE = simpleconstraintslanguage.impl.SimpleconstraintslanguageFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constraint</em>'.
	 * @generated
	 */
	Constraint createConstraint();

	/**
	 * Returns a new object of class '<em>Relational Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relational Constraint</em>'.
	 * @generated
	 */
	RelationalConstraint createRelationalConstraint();

	/**
	 * Returns a new object of class '<em>CInteger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CInteger</em>'.
	 * @generated
	 */
	CInteger createCInteger();

	/**
	 * Returns a new object of class '<em>CVar Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CVar Ref</em>'.
	 * @generated
	 */
	CVarRef createCVarRef();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SimpleconstraintslanguagePackage getSimpleconstraintslanguagePackage();

} //SimpleconstraintslanguageFactory
