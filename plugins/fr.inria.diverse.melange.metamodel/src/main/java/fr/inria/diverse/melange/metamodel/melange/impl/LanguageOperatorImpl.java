/**
 */
package fr.inria.diverse.melange.metamodel.melange.impl;

import fr.inria.diverse.melange.metamodel.melange.Language;
import fr.inria.diverse.melange.metamodel.melange.LanguageOperator;
import fr.inria.diverse.melange.metamodel.melange.MelangePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Language Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.impl.LanguageOperatorImpl#getTargetLanguage <em>Target Language</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LanguageOperatorImpl extends OperatorImpl implements LanguageOperator {
	/**
	 * The cached value of the '{@link #getTargetLanguage() <em>Target Language</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetLanguage()
	 * @generated
	 * @ordered
	 */
	protected Language targetLanguage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LanguageOperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MelangePackage.Literals.LANGUAGE_OPERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Language getTargetLanguage() {
		if (targetLanguage != null && targetLanguage.eIsProxy()) {
			InternalEObject oldTargetLanguage = (InternalEObject)targetLanguage;
			targetLanguage = (Language)eResolveProxy(oldTargetLanguage);
			if (targetLanguage != oldTargetLanguage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MelangePackage.LANGUAGE_OPERATOR__TARGET_LANGUAGE, oldTargetLanguage, targetLanguage));
			}
		}
		return targetLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Language basicGetTargetLanguage() {
		return targetLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetLanguage(Language newTargetLanguage) {
		Language oldTargetLanguage = targetLanguage;
		targetLanguage = newTargetLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MelangePackage.LANGUAGE_OPERATOR__TARGET_LANGUAGE, oldTargetLanguage, targetLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MelangePackage.LANGUAGE_OPERATOR__TARGET_LANGUAGE:
				if (resolve) return getTargetLanguage();
				return basicGetTargetLanguage();
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
			case MelangePackage.LANGUAGE_OPERATOR__TARGET_LANGUAGE:
				setTargetLanguage((Language)newValue);
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
			case MelangePackage.LANGUAGE_OPERATOR__TARGET_LANGUAGE:
				setTargetLanguage((Language)null);
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
			case MelangePackage.LANGUAGE_OPERATOR__TARGET_LANGUAGE:
				return targetLanguage != null;
		}
		return super.eIsSet(featureID);
	}

} //LanguageOperatorImpl
