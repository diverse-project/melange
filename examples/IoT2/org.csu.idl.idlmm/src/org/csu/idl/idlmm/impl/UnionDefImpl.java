/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.csu.idl.idlmm.impl;

import java.util.Collection;

import org.csu.idl.idlmm.IDLType;
import org.csu.idl.idlmm.IdlmmPackage;
import org.csu.idl.idlmm.TypedefDef;
import org.csu.idl.idlmm.UnionDef;
import org.csu.idl.idlmm.UnionField;

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
 * An implementation of the model object '<em><b>Union Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csu.idl.idlmm.impl.UnionDefImpl#getUnionMembers <em>Union Members</em>}</li>
 *   <li>{@link org.csu.idl.idlmm.impl.UnionDefImpl#getContainedDiscrim <em>Contained Discrim</em>}</li>
 *   <li>{@link org.csu.idl.idlmm.impl.UnionDefImpl#getSharedDiscrim <em>Shared Discrim</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnionDefImpl extends TypedefDefImpl implements UnionDef {
	/**
	 * The cached value of the '{@link #getUnionMembers() <em>Union Members</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnionMembers()
	 * @generated
	 * @ordered
	 */
	protected EList<UnionField> unionMembers;

	/**
	 * The cached value of the '{@link #getContainedDiscrim() <em>Contained Discrim</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedDiscrim()
	 * @generated
	 * @ordered
	 */
	protected IDLType containedDiscrim;

	/**
	 * The cached value of the '{@link #getSharedDiscrim() <em>Shared Discrim</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSharedDiscrim()
	 * @generated
	 * @ordered
	 */
	protected TypedefDef sharedDiscrim;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnionDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IdlmmPackage.Literals.UNION_DEF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UnionField> getUnionMembers() {
		if (unionMembers == null) {
			unionMembers = new EObjectContainmentEList<UnionField>(UnionField.class, this, IdlmmPackage.UNION_DEF__UNION_MEMBERS);
		}
		return unionMembers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDLType getContainedDiscrim() {
		return containedDiscrim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainedDiscrim(IDLType newContainedDiscrim, NotificationChain msgs) {
		IDLType oldContainedDiscrim = containedDiscrim;
		containedDiscrim = newContainedDiscrim;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IdlmmPackage.UNION_DEF__CONTAINED_DISCRIM, oldContainedDiscrim, newContainedDiscrim);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainedDiscrim(IDLType newContainedDiscrim) {
		if (newContainedDiscrim != containedDiscrim) {
			NotificationChain msgs = null;
			if (containedDiscrim != null)
				msgs = ((InternalEObject)containedDiscrim).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IdlmmPackage.UNION_DEF__CONTAINED_DISCRIM, null, msgs);
			if (newContainedDiscrim != null)
				msgs = ((InternalEObject)newContainedDiscrim).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IdlmmPackage.UNION_DEF__CONTAINED_DISCRIM, null, msgs);
			msgs = basicSetContainedDiscrim(newContainedDiscrim, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdlmmPackage.UNION_DEF__CONTAINED_DISCRIM, newContainedDiscrim, newContainedDiscrim));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedefDef getSharedDiscrim() {
		if (sharedDiscrim != null && sharedDiscrim.eIsProxy()) {
			InternalEObject oldSharedDiscrim = (InternalEObject)sharedDiscrim;
			sharedDiscrim = (TypedefDef)eResolveProxy(oldSharedDiscrim);
			if (sharedDiscrim != oldSharedDiscrim) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IdlmmPackage.UNION_DEF__SHARED_DISCRIM, oldSharedDiscrim, sharedDiscrim));
			}
		}
		return sharedDiscrim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedefDef basicGetSharedDiscrim() {
		return sharedDiscrim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSharedDiscrim(TypedefDef newSharedDiscrim) {
		TypedefDef oldSharedDiscrim = sharedDiscrim;
		sharedDiscrim = newSharedDiscrim;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdlmmPackage.UNION_DEF__SHARED_DISCRIM, oldSharedDiscrim, sharedDiscrim));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IdlmmPackage.UNION_DEF__UNION_MEMBERS:
				return ((InternalEList<?>)getUnionMembers()).basicRemove(otherEnd, msgs);
			case IdlmmPackage.UNION_DEF__CONTAINED_DISCRIM:
				return basicSetContainedDiscrim(null, msgs);
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
			case IdlmmPackage.UNION_DEF__UNION_MEMBERS:
				return getUnionMembers();
			case IdlmmPackage.UNION_DEF__CONTAINED_DISCRIM:
				return getContainedDiscrim();
			case IdlmmPackage.UNION_DEF__SHARED_DISCRIM:
				if (resolve) return getSharedDiscrim();
				return basicGetSharedDiscrim();
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
			case IdlmmPackage.UNION_DEF__UNION_MEMBERS:
				getUnionMembers().clear();
				getUnionMembers().addAll((Collection<? extends UnionField>)newValue);
				return;
			case IdlmmPackage.UNION_DEF__CONTAINED_DISCRIM:
				setContainedDiscrim((IDLType)newValue);
				return;
			case IdlmmPackage.UNION_DEF__SHARED_DISCRIM:
				setSharedDiscrim((TypedefDef)newValue);
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
			case IdlmmPackage.UNION_DEF__UNION_MEMBERS:
				getUnionMembers().clear();
				return;
			case IdlmmPackage.UNION_DEF__CONTAINED_DISCRIM:
				setContainedDiscrim((IDLType)null);
				return;
			case IdlmmPackage.UNION_DEF__SHARED_DISCRIM:
				setSharedDiscrim((TypedefDef)null);
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
			case IdlmmPackage.UNION_DEF__UNION_MEMBERS:
				return unionMembers != null && !unionMembers.isEmpty();
			case IdlmmPackage.UNION_DEF__CONTAINED_DISCRIM:
				return containedDiscrim != null;
			case IdlmmPackage.UNION_DEF__SHARED_DISCRIM:
				return sharedDiscrim != null;
		}
		return super.eIsSet(featureID);
	}

} //UnionDefImpl
