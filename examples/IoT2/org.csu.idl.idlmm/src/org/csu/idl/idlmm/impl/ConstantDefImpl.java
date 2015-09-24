/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.csu.idl.idlmm.impl;

import org.csu.idl.idlmm.Constant;
import org.csu.idl.idlmm.ConstantDef;
import org.csu.idl.idlmm.Expression;
import org.csu.idl.idlmm.IDLType;
import org.csu.idl.idlmm.IdlmmPackage;
import org.csu.idl.idlmm.Typed;
import org.csu.idl.idlmm.TypedefDef;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constant Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csu.idl.idlmm.impl.ConstantDefImpl#getContainedType <em>Contained Type</em>}</li>
 *   <li>{@link org.csu.idl.idlmm.impl.ConstantDefImpl#getSharedType <em>Shared Type</em>}</li>
 *   <li>{@link org.csu.idl.idlmm.impl.ConstantDefImpl#getConstValue <em>Const Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstantDefImpl extends ContainedImpl implements ConstantDef {
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
	 * The cached value of the '{@link #getConstValue() <em>Const Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstValue()
	 * @generated
	 * @ordered
	 */
	protected Expression constValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstantDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IdlmmPackage.Literals.CONSTANT_DEF;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IdlmmPackage.CONSTANT_DEF__CONTAINED_TYPE, oldContainedType, newContainedType);
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
				msgs = ((InternalEObject)containedType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IdlmmPackage.CONSTANT_DEF__CONTAINED_TYPE, null, msgs);
			if (newContainedType != null)
				msgs = ((InternalEObject)newContainedType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IdlmmPackage.CONSTANT_DEF__CONTAINED_TYPE, null, msgs);
			msgs = basicSetContainedType(newContainedType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdlmmPackage.CONSTANT_DEF__CONTAINED_TYPE, newContainedType, newContainedType));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IdlmmPackage.CONSTANT_DEF__SHARED_TYPE, oldSharedType, sharedType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IdlmmPackage.CONSTANT_DEF__SHARED_TYPE, oldSharedType, sharedType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getConstValue() {
		return constValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstValue(Expression newConstValue, NotificationChain msgs) {
		Expression oldConstValue = constValue;
		constValue = newConstValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IdlmmPackage.CONSTANT_DEF__CONST_VALUE, oldConstValue, newConstValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstValue(Expression newConstValue) {
		if (newConstValue != constValue) {
			NotificationChain msgs = null;
			if (constValue != null)
				msgs = ((InternalEObject)constValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IdlmmPackage.CONSTANT_DEF__CONST_VALUE, null, msgs);
			if (newConstValue != null)
				msgs = ((InternalEObject)newConstValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IdlmmPackage.CONSTANT_DEF__CONST_VALUE, null, msgs);
			msgs = basicSetConstValue(newConstValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdlmmPackage.CONSTANT_DEF__CONST_VALUE, newConstValue, newConstValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IdlmmPackage.CONSTANT_DEF__CONTAINED_TYPE:
				return basicSetContainedType(null, msgs);
			case IdlmmPackage.CONSTANT_DEF__CONST_VALUE:
				return basicSetConstValue(null, msgs);
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
			case IdlmmPackage.CONSTANT_DEF__CONTAINED_TYPE:
				return getContainedType();
			case IdlmmPackage.CONSTANT_DEF__SHARED_TYPE:
				if (resolve) return getSharedType();
				return basicGetSharedType();
			case IdlmmPackage.CONSTANT_DEF__CONST_VALUE:
				return getConstValue();
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
			case IdlmmPackage.CONSTANT_DEF__CONTAINED_TYPE:
				setContainedType((IDLType)newValue);
				return;
			case IdlmmPackage.CONSTANT_DEF__SHARED_TYPE:
				setSharedType((TypedefDef)newValue);
				return;
			case IdlmmPackage.CONSTANT_DEF__CONST_VALUE:
				setConstValue((Expression)newValue);
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
			case IdlmmPackage.CONSTANT_DEF__CONTAINED_TYPE:
				setContainedType((IDLType)null);
				return;
			case IdlmmPackage.CONSTANT_DEF__SHARED_TYPE:
				setSharedType((TypedefDef)null);
				return;
			case IdlmmPackage.CONSTANT_DEF__CONST_VALUE:
				setConstValue((Expression)null);
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
			case IdlmmPackage.CONSTANT_DEF__CONTAINED_TYPE:
				return containedType != null;
			case IdlmmPackage.CONSTANT_DEF__SHARED_TYPE:
				return sharedType != null;
			case IdlmmPackage.CONSTANT_DEF__CONST_VALUE:
				return constValue != null;
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
				case IdlmmPackage.CONSTANT_DEF__CONTAINED_TYPE: return IdlmmPackage.TYPED__CONTAINED_TYPE;
				case IdlmmPackage.CONSTANT_DEF__SHARED_TYPE: return IdlmmPackage.TYPED__SHARED_TYPE;
				default: return -1;
			}
		}
		if (baseClass == Constant.class) {
			switch (derivedFeatureID) {
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
				case IdlmmPackage.TYPED__CONTAINED_TYPE: return IdlmmPackage.CONSTANT_DEF__CONTAINED_TYPE;
				case IdlmmPackage.TYPED__SHARED_TYPE: return IdlmmPackage.CONSTANT_DEF__SHARED_TYPE;
				default: return -1;
			}
		}
		if (baseClass == Constant.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ConstantDefImpl
