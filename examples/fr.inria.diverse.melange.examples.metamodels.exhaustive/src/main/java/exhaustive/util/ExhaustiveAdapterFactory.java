/**
 */
package exhaustive.util;

import exhaustive.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see exhaustive.ExhaustivePackage
 * @generated
 */
public class ExhaustiveAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ExhaustivePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExhaustiveAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ExhaustivePackage.eINSTANCE;
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
	protected ExhaustiveSwitch<Adapter> modelSwitch =
		new ExhaustiveSwitch<Adapter>() {
			@Override
			public Adapter caseAbstractTest(AbstractTest object) {
				return createAbstractTestAdapter();
			}
			@Override
			public Adapter caseInterfaceTest(InterfaceTest object) {
				return createInterfaceTestAdapter();
			}
			@Override
			public Adapter caseMultipleSuperTest(MultipleSuperTest object) {
				return createMultipleSuperTestAdapter();
			}
			@Override
			public Adapter caseReferencesTest(ReferencesTest object) {
				return createReferencesTestAdapter();
			}
			@Override
			public Adapter caseAttributesTest(AttributesTest object) {
				return createAttributesTestAdapter();
			}
			@Override
			public Adapter caseOperationsTest(OperationsTest object) {
				return createOperationsTestAdapter();
			}
			@Override
			public <A, B> Adapter caseGenericTest(GenericTest<A, B> object) {
				return createGenericTestAdapter();
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
	 * Creates a new adapter for an object of class '{@link exhaustive.AbstractTest <em>Abstract Test</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see exhaustive.AbstractTest
	 * @generated
	 */
	public Adapter createAbstractTestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link exhaustive.InterfaceTest <em>Interface Test</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see exhaustive.InterfaceTest
	 * @generated
	 */
	public Adapter createInterfaceTestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link exhaustive.MultipleSuperTest <em>Multiple Super Test</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see exhaustive.MultipleSuperTest
	 * @generated
	 */
	public Adapter createMultipleSuperTestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link exhaustive.ReferencesTest <em>References Test</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see exhaustive.ReferencesTest
	 * @generated
	 */
	public Adapter createReferencesTestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link exhaustive.AttributesTest <em>Attributes Test</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see exhaustive.AttributesTest
	 * @generated
	 */
	public Adapter createAttributesTestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link exhaustive.OperationsTest <em>Operations Test</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see exhaustive.OperationsTest
	 * @generated
	 */
	public Adapter createOperationsTestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link exhaustive.GenericTest <em>Generic Test</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see exhaustive.GenericTest
	 * @generated
	 */
	public Adapter createGenericTestAdapter() {
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

} //ExhaustiveAdapterFactory
