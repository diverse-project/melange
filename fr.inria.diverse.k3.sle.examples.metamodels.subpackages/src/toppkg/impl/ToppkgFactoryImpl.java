/**
 */
package toppkg.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import toppkg.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ToppkgFactoryImpl extends EFactoryImpl implements ToppkgFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ToppkgFactory init() {
		try {
			ToppkgFactory theToppkgFactory = (ToppkgFactory)EPackage.Registry.INSTANCE.getEFactory(ToppkgPackage.eNS_URI);
			if (theToppkgFactory != null) {
				return theToppkgFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ToppkgFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToppkgFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ToppkgPackage.TOP_CLASS1: return createTopClass1();
			case ToppkgPackage.TOP_CLASS2: return createTopClass2();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopClass1 createTopClass1() {
		TopClass1Impl topClass1 = new TopClass1Impl();
		return topClass1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopClass2 createTopClass2() {
		TopClass2Impl topClass2 = new TopClass2Impl();
		return topClass2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToppkgPackage getToppkgPackage() {
		return (ToppkgPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ToppkgPackage getPackage() {
		return ToppkgPackage.eINSTANCE;
	}

} //ToppkgFactoryImpl
