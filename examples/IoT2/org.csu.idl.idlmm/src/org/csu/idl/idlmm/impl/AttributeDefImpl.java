/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.csu.idl.idlmm.impl;

import java.util.Collection;

import org.csu.idl.idlmm.AttributeDef;
import org.csu.idl.idlmm.ExceptionDef;
import org.csu.idl.idlmm.IDLType;
import org.csu.idl.idlmm.IdlmmPackage;
import org.csu.idl.idlmm.Typed;
import org.csu.idl.idlmm.TypedefDef;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csu.idl.idlmm.impl.AttributeDefImpl#getContainedType <em>Contained Type</em>}</li>
 *   <li>{@link org.csu.idl.idlmm.impl.AttributeDefImpl#getSharedType <em>Shared Type</em>}</li>
 *   <li>{@link org.csu.idl.idlmm.impl.AttributeDefImpl#getGetRaises <em>Get Raises</em>}</li>
 *   <li>{@link org.csu.idl.idlmm.impl.AttributeDefImpl#getSetRaises <em>Set Raises</em>}</li>
 *   <li>{@link org.csu.idl.idlmm.impl.AttributeDefImpl#isIsReadonly <em>Is Readonly</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeDefImpl extends ContainedImpl implements AttributeDef {
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
	 * The cached value of the '{@link #getGetRaises() <em>Get Raises</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetRaises()
	 * @generated
	 * @ordered
	 */
	protected EList<ExceptionDef> getRaises;

	/**
	 * The cached value of the '{@link #getSetRaises() <em>Set Raises</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetRaises()
	 * @generated
	 * @ordered
	 */
	protected EList<ExceptionDef> setRaises;

	/**
	 * The default value of the '{@link #isIsReadonly() <em>Is Readonly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsReadonly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_READONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsReadonly() <em>Is Readonly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsReadonly()
	 * @generated
	 * @ordered
	 */
	protected boolean isReadonly = IS_READONLY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IdlmmPackage.Literals.ATTRIBUTE_DEF;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IdlmmPackage.ATTRIBUTE_DEF__CONTAINED_TYPE, oldContainedType, newContainedType);
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
				msgs = ((InternalEObject)containedType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IdlmmPackage.ATTRIBUTE_DEF__CONTAINED_TYPE, null, msgs);
			if (newContainedType != null)
				msgs = ((InternalEObject)newContainedType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IdlmmPackage.ATTRIBUTE_DEF__CONTAINED_TYPE, null, msgs);
			msgs = basicSetContainedType(newContainedType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdlmmPackage.ATTRIBUTE_DEF__CONTAINED_TYPE, newContainedType, newContainedType));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IdlmmPackage.ATTRIBUTE_DEF__SHARED_TYPE, oldSharedType, sharedType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IdlmmPackage.ATTRIBUTE_DEF__SHARED_TYPE, oldSharedType, sharedType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExceptionDef> getGetRaises() {
		if (getRaises == null) {
			getRaises = new EObjectResolvingEList<ExceptionDef>(ExceptionDef.class, this, IdlmmPackage.ATTRIBUTE_DEF__GET_RAISES);
		}
		return getRaises;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExceptionDef> getSetRaises() {
		if (setRaises == null) {
			setRaises = new EObjectResolvingEList<ExceptionDef>(ExceptionDef.class, this, IdlmmPackage.ATTRIBUTE_DEF__SET_RAISES);
		}
		return setRaises;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsReadonly() {
		return isReadonly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsReadonly(boolean newIsReadonly) {
		boolean oldIsReadonly = isReadonly;
		isReadonly = newIsReadonly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdlmmPackage.ATTRIBUTE_DEF__IS_READONLY, oldIsReadonly, isReadonly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IdlmmPackage.ATTRIBUTE_DEF__CONTAINED_TYPE:
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
			case IdlmmPackage.ATTRIBUTE_DEF__CONTAINED_TYPE:
				return getContainedType();
			case IdlmmPackage.ATTRIBUTE_DEF__SHARED_TYPE:
				if (resolve) return getSharedType();
				return basicGetSharedType();
			case IdlmmPackage.ATTRIBUTE_DEF__GET_RAISES:
				return getGetRaises();
			case IdlmmPackage.ATTRIBUTE_DEF__SET_RAISES:
				return getSetRaises();
			case IdlmmPackage.ATTRIBUTE_DEF__IS_READONLY:
				return isIsReadonly();
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
			case IdlmmPackage.ATTRIBUTE_DEF__CONTAINED_TYPE:
				setContainedType((IDLType)newValue);
				return;
			case IdlmmPackage.ATTRIBUTE_DEF__SHARED_TYPE:
				setSharedType((TypedefDef)newValue);
				return;
			case IdlmmPackage.ATTRIBUTE_DEF__GET_RAISES:
				getGetRaises().clear();
				getGetRaises().addAll((Collection<? extends ExceptionDef>)newValue);
				return;
			case IdlmmPackage.ATTRIBUTE_DEF__SET_RAISES:
				getSetRaises().clear();
				getSetRaises().addAll((Collection<? extends ExceptionDef>)newValue);
				return;
			case IdlmmPackage.ATTRIBUTE_DEF__IS_READONLY:
				setIsReadonly((Boolean)newValue);
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
			case IdlmmPackage.ATTRIBUTE_DEF__CONTAINED_TYPE:
				setContainedType((IDLType)null);
				return;
			case IdlmmPackage.ATTRIBUTE_DEF__SHARED_TYPE:
				setSharedType((TypedefDef)null);
				return;
			case IdlmmPackage.ATTRIBUTE_DEF__GET_RAISES:
				getGetRaises().clear();
				return;
			case IdlmmPackage.ATTRIBUTE_DEF__SET_RAISES:
				getSetRaises().clear();
				return;
			case IdlmmPackage.ATTRIBUTE_DEF__IS_READONLY:
				setIsReadonly(IS_READONLY_EDEFAULT);
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
			case IdlmmPackage.ATTRIBUTE_DEF__CONTAINED_TYPE:
				return containedType != null;
			case IdlmmPackage.ATTRIBUTE_DEF__SHARED_TYPE:
				return sharedType != null;
			case IdlmmPackage.ATTRIBUTE_DEF__GET_RAISES:
				return getRaises != null && !getRaises.isEmpty();
			case IdlmmPackage.ATTRIBUTE_DEF__SET_RAISES:
				return setRaises != null && !setRaises.isEmpty();
			case IdlmmPackage.ATTRIBUTE_DEF__IS_READONLY:
				return isReadonly != IS_READONLY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Typed.class) {
			switch (derivedFeatureID) {
				case IdlmmPackage.ATTRIBUTE_DEF__CONTAINED_TYPE: return IdlmmPackage.TYPED__CONTAINED_TYPE;
				case IdlmmPackage.ATTRIBUTE_DEF__SHARED_TYPE: return IdlmmPackage.TYPED__SHARED_TYPE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Typed.class) {
			switch (baseFeatureID) {
				case IdlmmPackage.TYPED__CONTAINED_TYPE: return IdlmmPackage.ATTRIBUTE_DEF__CONTAINED_TYPE;
				case IdlmmPackage.TYPED__SHARED_TYPE: return IdlmmPackage.ATTRIBUTE_DEF__SHARED_TYPE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (isReadonly: ");
		result.append(isReadonly);
		result.append(')');
		return result.toString();
	}

} //AttributeDefImpl
