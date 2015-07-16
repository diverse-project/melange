/**
 */
package fr.inria.diverse.melange.metamodel.melange.impl;

import fr.inria.diverse.melange.metamodel.melange.Language;
import fr.inria.diverse.melange.metamodel.melange.MelangePackage;
import fr.inria.diverse.melange.metamodel.melange.Merge;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Merge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.impl.MergeImpl#getMergedLanguage <em>Merged Language</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MergeImpl extends OperatorImpl implements Merge {
	/**
	 * The cached value of the '{@link #getMergedLanguage() <em>Merged Language</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMergedLanguage()
	 * @generated
	 * @ordered
	 */
	protected Language mergedLanguage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MergeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MelangePackage.Literals.MERGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Language getMergedLanguage() {
		if (mergedLanguage != null && mergedLanguage.eIsProxy()) {
			InternalEObject oldMergedLanguage = (InternalEObject)mergedLanguage;
			mergedLanguage = (Language)eResolveProxy(oldMergedLanguage);
			if (mergedLanguage != oldMergedLanguage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MelangePackage.MERGE__MERGED_LANGUAGE, oldMergedLanguage, mergedLanguage));
			}
		}
		return mergedLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Language basicGetMergedLanguage() {
		return mergedLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMergedLanguage(Language newMergedLanguage) {
		Language oldMergedLanguage = mergedLanguage;
		mergedLanguage = newMergedLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MelangePackage.MERGE__MERGED_LANGUAGE, oldMergedLanguage, mergedLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MelangePackage.MERGE__MERGED_LANGUAGE:
				if (resolve) return getMergedLanguage();
				return basicGetMergedLanguage();
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
			case MelangePackage.MERGE__MERGED_LANGUAGE:
				setMergedLanguage((Language)newValue);
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
			case MelangePackage.MERGE__MERGED_LANGUAGE:
				setMergedLanguage((Language)null);
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
			case MelangePackage.MERGE__MERGED_LANGUAGE:
				return mergedLanguage != null;
		}
		return super.eIsSet(featureID);
	}

} //MergeImpl
