/**
 */
package fr.inria.diverse.melange.metamodel.melange.impl;

import fr.inria.diverse.melange.metamodel.melange.Mapping;
import fr.inria.diverse.melange.metamodel.melange.MelangePackage;
import fr.inria.diverse.melange.metamodel.melange.Metamodel;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Metamodel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.impl.MetamodelImpl#getXtextSetupRef <em>Xtext Setup Ref</em>}</li>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.impl.MetamodelImpl#getMappings <em>Mappings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MetamodelImpl extends MinimalEObjectImpl.Container implements Metamodel {
	/**
	 * The cached value of the '{@link #getXtextSetupRef() <em>Xtext Setup Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXtextSetupRef()
	 * @generated
	 * @ordered
	 */
	protected JvmTypeReference xtextSetupRef;

	/**
	 * The cached value of the '{@link #getMappings() <em>Mappings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<Mapping> mappings;

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
	public JvmTypeReference getXtextSetupRef() {
		return xtextSetupRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXtextSetupRef(JvmTypeReference newXtextSetupRef, NotificationChain msgs) {
		JvmTypeReference oldXtextSetupRef = xtextSetupRef;
		xtextSetupRef = newXtextSetupRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MelangePackage.METAMODEL__XTEXT_SETUP_REF, oldXtextSetupRef, newXtextSetupRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXtextSetupRef(JvmTypeReference newXtextSetupRef) {
		if (newXtextSetupRef != xtextSetupRef) {
			NotificationChain msgs = null;
			if (xtextSetupRef != null)
				msgs = ((InternalEObject)xtextSetupRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MelangePackage.METAMODEL__XTEXT_SETUP_REF, null, msgs);
			if (newXtextSetupRef != null)
				msgs = ((InternalEObject)newXtextSetupRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MelangePackage.METAMODEL__XTEXT_SETUP_REF, null, msgs);
			msgs = basicSetXtextSetupRef(newXtextSetupRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MelangePackage.METAMODEL__XTEXT_SETUP_REF, newXtextSetupRef, newXtextSetupRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Mapping> getMappings() {
		if (mappings == null) {
			mappings = new EObjectWithInverseEList<Mapping>(Mapping.class, this, MelangePackage.METAMODEL__MAPPINGS, MelangePackage.MAPPING__FROM);
		}
		return mappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MelangePackage.METAMODEL__MAPPINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMappings()).basicAdd(otherEnd, msgs);
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
			case MelangePackage.METAMODEL__XTEXT_SETUP_REF:
				return basicSetXtextSetupRef(null, msgs);
			case MelangePackage.METAMODEL__MAPPINGS:
				return ((InternalEList<?>)getMappings()).basicRemove(otherEnd, msgs);
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
			case MelangePackage.METAMODEL__XTEXT_SETUP_REF:
				return getXtextSetupRef();
			case MelangePackage.METAMODEL__MAPPINGS:
				return getMappings();
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
			case MelangePackage.METAMODEL__XTEXT_SETUP_REF:
				setXtextSetupRef((JvmTypeReference)newValue);
				return;
			case MelangePackage.METAMODEL__MAPPINGS:
				getMappings().clear();
				getMappings().addAll((Collection<? extends Mapping>)newValue);
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
			case MelangePackage.METAMODEL__XTEXT_SETUP_REF:
				setXtextSetupRef((JvmTypeReference)null);
				return;
			case MelangePackage.METAMODEL__MAPPINGS:
				getMappings().clear();
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
			case MelangePackage.METAMODEL__XTEXT_SETUP_REF:
				return xtextSetupRef != null;
			case MelangePackage.METAMODEL__MAPPINGS:
				return mappings != null && !mappings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MetamodelImpl
