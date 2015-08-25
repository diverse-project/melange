/**
 */
package fr.inria.diverse.melange.metamodel.melange.impl;

import fr.inria.diverse.melange.metamodel.melange.Inheritance;
import fr.inria.diverse.melange.metamodel.melange.Language;
import fr.inria.diverse.melange.metamodel.melange.MelangePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inheritance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.impl.InheritanceImpl#getSuperLanguage <em>Super Language</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InheritanceImpl extends OperatorImpl implements Inheritance {
	/**
	 * The cached value of the '{@link #getSuperLanguage() <em>Super Language</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperLanguage()
	 * @generated
	 * @ordered
	 */
	protected Language superLanguage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InheritanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MelangePackage.Literals.INHERITANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Language getSuperLanguage() {
		if (superLanguage != null && superLanguage.eIsProxy()) {
			InternalEObject oldSuperLanguage = (InternalEObject)superLanguage;
			superLanguage = (Language)eResolveProxy(oldSuperLanguage);
			if (superLanguage != oldSuperLanguage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MelangePackage.INHERITANCE__SUPER_LANGUAGE, oldSuperLanguage, superLanguage));
			}
		}
		return superLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Language basicGetSuperLanguage() {
		return superLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperLanguage(Language newSuperLanguage) {
		Language oldSuperLanguage = superLanguage;
		superLanguage = newSuperLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MelangePackage.INHERITANCE__SUPER_LANGUAGE, oldSuperLanguage, superLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MelangePackage.INHERITANCE__SUPER_LANGUAGE:
				if (resolve) return getSuperLanguage();
				return basicGetSuperLanguage();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MelangePackage.INHERITANCE__SUPER_LANGUAGE:
				setSuperLanguage((Language)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MelangePackage.INHERITANCE__SUPER_LANGUAGE:
				setSuperLanguage((Language)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MelangePackage.INHERITANCE__SUPER_LANGUAGE:
				return superLanguage != null;
		}
		return super.eIsSet(featureID);
	}

} //InheritanceImpl
