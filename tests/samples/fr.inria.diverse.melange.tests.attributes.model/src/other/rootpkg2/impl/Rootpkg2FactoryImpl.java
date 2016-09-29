/**
 */
package other.rootpkg2.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import other.rootpkg2.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Rootpkg2FactoryImpl extends EFactoryImpl implements Rootpkg2Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Rootpkg2Factory init() {
		try {
			Rootpkg2Factory theRootpkg2Factory = (Rootpkg2Factory)EPackage.Registry.INSTANCE.getEFactory(Rootpkg2Package.eNS_URI);
			if (theRootpkg2Factory != null) {
				return theRootpkg2Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Rootpkg2FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rootpkg2FactoryImpl() {
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
			case Rootpkg2Package.TOKEN: return createToken();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Token createToken() {
		TokenImpl token = new TokenImpl();
		return token;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rootpkg2Package getRootpkg2Package() {
		return (Rootpkg2Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Rootpkg2Package getPackage() {
		return Rootpkg2Package.eINSTANCE;
	}

} //Rootpkg2FactoryImpl
