/**
 */
package toppkg.subpkg2.subpkg3.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import toppkg.subpkg2.subpkg3.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see toppkg.subpkg2.subpkg3.Subpkg3Package
 * @generated
 */
public class Subpkg3AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Subpkg3Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subpkg3AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Subpkg3Package.eINSTANCE;
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
	protected Subpkg3Switch<Adapter> modelSwitch =
		new Subpkg3Switch<Adapter>() {
			@Override
			public Adapter caseSubpkg3Class1(Subpkg3Class1 object) {
				return createSubpkg3Class1Adapter();
			}
			@Override
			public Adapter caseSubpkg3Class2(Subpkg3Class2 object) {
				return createSubpkg3Class2Adapter();
			}
			@Override
			public Adapter caseClassA(ClassA object) {
				return createClassAAdapter();
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
	 * Creates a new adapter for an object of class '{@link toppkg.subpkg2.subpkg3.Subpkg3Class1 <em>Class1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see toppkg.subpkg2.subpkg3.Subpkg3Class1
	 * @generated
	 */
	public Adapter createSubpkg3Class1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link toppkg.subpkg2.subpkg3.Subpkg3Class2 <em>Class2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see toppkg.subpkg2.subpkg3.Subpkg3Class2
	 * @generated
	 */
	public Adapter createSubpkg3Class2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link toppkg.subpkg2.subpkg3.ClassA <em>Class A</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see toppkg.subpkg2.subpkg3.ClassA
	 * @generated
	 */
	public Adapter createClassAAdapter() {
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

} //Subpkg3AdapterFactory
