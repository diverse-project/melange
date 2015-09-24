/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.csu.idl.idlmm.impl;

import org.csu.idl.idlmm.IDLType;
import org.csu.idl.idlmm.IdlmmPackage;
import org.csu.idl.idlmm.Typed;
import org.csu.idl.idlmm.TypedefDef;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Typed</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csu.idl.idlmm.impl.TypedImpl#getContainedType <em>Contained Type</em>}</li>
 *   <li>{@link org.csu.idl.idlmm.impl.TypedImpl#getSharedType <em>Shared Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TypedImpl extends EObjectImpl implements Typed {
	/**
	 * The cached value of the '{@link #getContainedType() <em>Contained Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedType()
	 * @generated
	 * @ordered
	 */
	protected IDLType containedType;

	/**
	 * The cached value of the '{@link #getSharedType() <em>Shared Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSharedType()
	 * @generated
	 * @ordered
	 */
	protected TypedefDef sharedType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IdlmmPackage.Literals.TYPED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDLType getContainedType() {
		return containedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainedType(IDLType newContainedType, NotificationChain msgs) {
		IDLType oldContainedType = containedType;
		containedType = newContainedType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IdlmmPackage.TYPED__CONTAINED_TYPE, oldContainedType, newContainedType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainedType(IDLType newContainedType) {
		if (newContainedType != containedType) {
			NotificationChain msgs = null;
			if (containedType != null)
				msgs = ((InternalEObject)containedType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IdlmmPackage.TYPED__CONTAINED_TYPE, null, msgs);
			if (newContainedType != null)
				msgs = ((InternalEObject)newContainedType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IdlmmPackage.TYPED__CONTAINED_TYPE, null, msgs);
			msgs = basicSetContainedType(newContainedType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdlmmPackage.TYPED__CONTAINED_TYPE, newContainedType, newContainedType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedefDef getSharedType() {
		if (sharedType != null && sharedType.eIsProxy()) {
			InternalEObject oldSharedType = (InternalEObject)sharedType;
			sharedType = (TypedefDef)eResolveProxy(oldSharedType);
			if (sharedType != oldSharedType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IdlmmPackage.TYPED__SHARED_TYPE, oldSharedType, sharedType));
			}
		}
		return sharedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedefDef basicGetSharedType() {
		return sharedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSharedType(TypedefDef newSharedType) {
		TypedefDef oldSharedType = sharedType;
		sharedType = newSharedType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdlmmPackage.TYPED__SHARED_TYPE, oldSharedType, sharedType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IdlmmPackage.TYPED__CONTAINED_TYPE:
				return basicSetContainedType(null, msgs);
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
			case IdlmmPackage.TYPED__CONTAINED_TYPE:
				return getContainedType();
			case IdlmmPackage.TYPED__SHARED_TYPE:
				if (resolve) return getSharedType();
				return basicGetSharedType();
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
			case IdlmmPackage.TYPED__CONTAINED_TYPE:
				setContainedType((IDLType)newValue);
				return;
			case IdlmmPackage.TYPED__SHARED_TYPE:
				setSharedType((TypedefDef)newValue);
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
			case IdlmmPackage.TYPED__CONTAINED_TYPE:
				setContainedType((IDLType)null);
				return;
			case IdlmmPackage.TYPED__SHARED_TYPE:
				setSharedType((TypedefDef)null);
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
			case IdlmmPackage.TYPED__CONTAINED_TYPE:
				return containedType != null;
			case IdlmmPackage.TYPED__SHARED_TYPE:
				return sharedType != null;
		}
		return super.eIsSet(featureID);
	}

} //TypedImpl
