/**
 */
package exhaustive.impl;

import exhaustive.AbstractTest;
import exhaustive.ExhaustivePackage;
import exhaustive.GenericChildTest;
import exhaustive.MultipleSuperTest;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generic Child Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class GenericChildTestImpl extends GenericTestImpl<AbstractTest, MultipleSuperTest> implements GenericChildTest {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenericChildTestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExhaustivePackage.Literals.GENERIC_CHILD_TEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setGenericAttr(AbstractTest newGenericAttr) {
		super.setGenericAttr(newGenericAttr);
	}

} //GenericChildTestImpl
