/**
 */
package simpleconstraintslanguage.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import simpleconstraintslanguage.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see simpleconstraintslanguage.SimpleconstraintslanguagePackage
 * @generated
 */
public class SimpleconstraintslanguageAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SimpleconstraintslanguagePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleconstraintslanguageAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SimpleconstraintslanguagePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleconstraintslanguageSwitch<Adapter> modelSwitch =
		new SimpleconstraintslanguageSwitch<Adapter>() {
			@Override
			public Adapter caseConstraint(Constraint object) {
				return createConstraintAdapter();
			}
			@Override
			public Adapter caseRelationalConstraint(RelationalConstraint object) {
				return createRelationalConstraintAdapter();
			}
			@Override
			public Adapter caseCExpression(CExpression object) {
				return createCExpressionAdapter();
			}
			@Override
			public Adapter caseCLiteral(CLiteral object) {
				return createCLiteralAdapter();
			}
			@Override
			public Adapter caseCInteger(CInteger object) {
				return createCIntegerAdapter();
			}
			@Override
			public Adapter caseCVarRef(CVarRef object) {
				return createCVarRefAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link simpleconstraintslanguage.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simpleconstraintslanguage.Constraint
	 * @generated
	 */
	public Adapter createConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simpleconstraintslanguage.RelationalConstraint <em>Relational Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simpleconstraintslanguage.RelationalConstraint
	 * @generated
	 */
	public Adapter createRelationalConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simpleconstraintslanguage.CExpression <em>CExpression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simpleconstraintslanguage.CExpression
	 * @generated
	 */
	public Adapter createCExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simpleconstraintslanguage.CLiteral <em>CLiteral</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simpleconstraintslanguage.CLiteral
	 * @generated
	 */
	public Adapter createCLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simpleconstraintslanguage.CInteger <em>CInteger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simpleconstraintslanguage.CInteger
	 * @generated
	 */
	public Adapter createCIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simpleconstraintslanguage.CVarRef <em>CVar Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simpleconstraintslanguage.CVarRef
	 * @generated
	 */
	public Adapter createCVarRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SimpleconstraintslanguageAdapterFactory
