/**
 */
package fr.inria.diverse.k3.sle.metamodel.k3sle.impl;

import fr.inria.diverse.k3.sle.metamodel.k3sle.Inheritance;
import fr.inria.diverse.k3.sle.metamodel.k3sle.K3slePackage;
import fr.inria.diverse.k3.sle.metamodel.k3sle.Metamodel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inheritance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.diverse.k3.sle.metamodel.k3sle.impl.InheritanceImpl#getSubMetamodel <em>Sub Metamodel</em>}</li>
 *   <li>{@link fr.inria.diverse.k3.sle.metamodel.k3sle.impl.InheritanceImpl#getSuperMetamodel <em>Super Metamodel</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InheritanceImpl extends MinimalEObjectImpl.Container implements Inheritance {
	/**
	 * The cached value of the '{@link #getSuperMetamodel() <em>Super Metamodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperMetamodel()
	 * @generated
	 * @ordered
	 */
	protected Metamodel superMetamodel;

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
		return K3slePackage.Literals.INHERITANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metamodel getSubMetamodel() {
		if (eContainerFeatureID() != K3slePackage.INHERITANCE__SUB_METAMODEL) return null;
		return (Metamodel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubMetamodel(Metamodel newSubMetamodel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSubMetamodel, K3slePackage.INHERITANCE__SUB_METAMODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubMetamodel(Metamodel newSubMetamodel) {
		if (newSubMetamodel != eInternalContainer() || (eContainerFeatureID() != K3slePackage.INHERITANCE__SUB_METAMODEL && newSubMetamodel != null)) {
			if (EcoreUtil.isAncestor(this, newSubMetamodel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSubMetamodel != null)
				msgs = ((InternalEObject)newSubMetamodel).eInverseAdd(this, K3slePackage.METAMODEL__INHERITANCE_RELATION, Metamodel.class, msgs);
			msgs = basicSetSubMetamodel(newSubMetamodel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K3slePackage.INHERITANCE__SUB_METAMODEL, newSubMetamodel, newSubMetamodel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metamodel getSuperMetamodel() {
		if (superMetamodel != null && superMetamodel.eIsProxy()) {
			InternalEObject oldSuperMetamodel = (InternalEObject)superMetamodel;
			superMetamodel = (Metamodel)eResolveProxy(oldSuperMetamodel);
			if (superMetamodel != oldSuperMetamodel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, K3slePackage.INHERITANCE__SUPER_METAMODEL, oldSuperMetamodel, superMetamodel));
			}
		}
		return superMetamodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metamodel basicGetSuperMetamodel() {
		return superMetamodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperMetamodel(Metamodel newSuperMetamodel) {
		Metamodel oldSuperMetamodel = superMetamodel;
		superMetamodel = newSuperMetamodel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K3slePackage.INHERITANCE__SUPER_METAMODEL, oldSuperMetamodel, superMetamodel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case K3slePackage.INHERITANCE__SUB_METAMODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSubMetamodel((Metamodel)otherEnd, msgs);
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
			case K3slePackage.INHERITANCE__SUB_METAMODEL:
				return basicSetSubMetamodel(null, msgs);
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
			case K3slePackage.INHERITANCE__SUB_METAMODEL:
				return eInternalContainer().eInverseRemove(this, K3slePackage.METAMODEL__INHERITANCE_RELATION, Metamodel.class, msgs);
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
			case K3slePackage.INHERITANCE__SUB_METAMODEL:
				return getSubMetamodel();
			case K3slePackage.INHERITANCE__SUPER_METAMODEL:
				if (resolve) return getSuperMetamodel();
				return basicGetSuperMetamodel();
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
			case K3slePackage.INHERITANCE__SUB_METAMODEL:
				setSubMetamodel((Metamodel)newValue);
				return;
			case K3slePackage.INHERITANCE__SUPER_METAMODEL:
				setSuperMetamodel((Metamodel)newValue);
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
			case K3slePackage.INHERITANCE__SUB_METAMODEL:
				setSubMetamodel((Metamodel)null);
				return;
			case K3slePackage.INHERITANCE__SUPER_METAMODEL:
				setSuperMetamodel((Metamodel)null);
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
			case K3slePackage.INHERITANCE__SUB_METAMODEL:
				return getSubMetamodel() != null;
			case K3slePackage.INHERITANCE__SUPER_METAMODEL:
				return superMetamodel != null;
		}
		return super.eIsSet(featureID);
	}

} //InheritanceImpl
