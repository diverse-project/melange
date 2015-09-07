/**
 */
package fr.inria.diverse.melange.metamodel.melange.impl;

import fr.inria.diverse.melange.metamodel.melange.Language;
import fr.inria.diverse.melange.metamodel.melange.MelangePackage;
import fr.inria.diverse.melange.metamodel.melange.Metamodel;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Metamodel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.impl.MetamodelImpl#getOwningLanguage <em>Owning Language</em>}</li>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.impl.MetamodelImpl#getGenmodelUris <em>Genmodel Uris</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MetamodelImpl extends ModelingElementImpl implements Metamodel {
	/**
	 * The cached value of the '{@link #getGenmodelUris() <em>Genmodel Uris</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenmodelUris()
	 * @generated
	 * @ordered
	 */
	protected EList<String> genmodelUris;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetamodelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MelangePackage.Literals.METAMODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Language getOwningLanguage() {
		if (eContainerFeatureID() != MelangePackage.METAMODEL__OWNING_LANGUAGE) return null;
		return (Language)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningLanguage(Language newOwningLanguage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningLanguage, MelangePackage.METAMODEL__OWNING_LANGUAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningLanguage(Language newOwningLanguage) {
		if (newOwningLanguage != eInternalContainer() || (eContainerFeatureID() != MelangePackage.METAMODEL__OWNING_LANGUAGE && newOwningLanguage != null)) {
			if (EcoreUtil.isAncestor(this, newOwningLanguage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningLanguage != null)
				msgs = ((InternalEObject)newOwningLanguage).eInverseAdd(this, MelangePackage.LANGUAGE__SYNTAX, Language.class, msgs);
			msgs = basicSetOwningLanguage(newOwningLanguage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MelangePackage.METAMODEL__OWNING_LANGUAGE, newOwningLanguage, newOwningLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getGenmodelUris() {
		if (genmodelUris == null) {
			genmodelUris = new EDataTypeUniqueEList<String>(String.class, this, MelangePackage.METAMODEL__GENMODEL_URIS);
		}
		return genmodelUris;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MelangePackage.METAMODEL__OWNING_LANGUAGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningLanguage((Language)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MelangePackage.METAMODEL__OWNING_LANGUAGE:
				return basicSetOwningLanguage(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case MelangePackage.METAMODEL__OWNING_LANGUAGE:
				return eInternalContainer().eInverseRemove(this, MelangePackage.LANGUAGE__SYNTAX, Language.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MelangePackage.METAMODEL__OWNING_LANGUAGE:
				return getOwningLanguage();
			case MelangePackage.METAMODEL__GENMODEL_URIS:
				return getGenmodelUris();
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
			case MelangePackage.METAMODEL__OWNING_LANGUAGE:
				setOwningLanguage((Language)newValue);
				return;
			case MelangePackage.METAMODEL__GENMODEL_URIS:
				getGenmodelUris().clear();
				getGenmodelUris().addAll((Collection<? extends String>)newValue);
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
			case MelangePackage.METAMODEL__OWNING_LANGUAGE:
				setOwningLanguage((Language)null);
				return;
			case MelangePackage.METAMODEL__GENMODEL_URIS:
				getGenmodelUris().clear();
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
			case MelangePackage.METAMODEL__OWNING_LANGUAGE:
				return getOwningLanguage() != null;
			case MelangePackage.METAMODEL__GENMODEL_URIS:
				return genmodelUris != null && !genmodelUris.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (genmodelUris: ");
		result.append(genmodelUris);
		result.append(')');
		return result.toString();
	}

} //MetamodelImpl
