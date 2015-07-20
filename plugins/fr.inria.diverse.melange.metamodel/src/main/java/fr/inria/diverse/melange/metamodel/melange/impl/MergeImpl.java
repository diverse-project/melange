/**
 */
package fr.inria.diverse.melange.metamodel.melange.impl;

import fr.inria.diverse.melange.metamodel.melange.Language;
import fr.inria.diverse.melange.metamodel.melange.MelangePackage;
import fr.inria.diverse.melange.metamodel.melange.Merge;
import fr.inria.diverse.melange.metamodel.melange.PackageBinding;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Merge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.impl.MergeImpl#getMergedLanguage <em>Merged Language</em>}</li>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.impl.MergeImpl#getMappingRules <em>Mapping Rules</em>}</li>
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
	 * The cached value of the '{@link #getMappingRules() <em>Mapping Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappingRules()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageBinding> mappingRules;

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
	public EList<PackageBinding> getMappingRules() {
		if (mappingRules == null) {
			mappingRules = new EObjectContainmentEList<PackageBinding>(PackageBinding.class, this, MelangePackage.MERGE__MAPPING_RULES);
		}
		return mappingRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MelangePackage.MERGE__MAPPING_RULES:
				return ((InternalEList<?>)getMappingRules()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case MelangePackage.MERGE__MAPPING_RULES:
				return getMappingRules();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MelangePackage.MERGE__MERGED_LANGUAGE:
				setMergedLanguage((Language)newValue);
				return;
			case MelangePackage.MERGE__MAPPING_RULES:
				getMappingRules().clear();
				getMappingRules().addAll((Collection<? extends PackageBinding>)newValue);
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
			case MelangePackage.MERGE__MAPPING_RULES:
				getMappingRules().clear();
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
			case MelangePackage.MERGE__MAPPING_RULES:
				return mappingRules != null && !mappingRules.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MergeImpl
