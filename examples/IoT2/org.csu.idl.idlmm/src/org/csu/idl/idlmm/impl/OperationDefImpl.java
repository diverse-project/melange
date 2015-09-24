/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.csu.idl.idlmm.impl;

import java.util.Collection;

import org.csu.idl.idlmm.ExceptionDef;
import org.csu.idl.idlmm.IDLType;
import org.csu.idl.idlmm.IdlmmPackage;
import org.csu.idl.idlmm.OperationDef;
import org.csu.idl.idlmm.ParameterDef;
import org.csu.idl.idlmm.Typed;
import org.csu.idl.idlmm.TypedefDef;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csu.idl.idlmm.impl.OperationDefImpl#getContainedType <em>Contained Type</em>}</li>
 *   <li>{@link org.csu.idl.idlmm.impl.OperationDefImpl#getSharedType <em>Shared Type</em>}</li>
 *   <li>{@link org.csu.idl.idlmm.impl.OperationDefImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.csu.idl.idlmm.impl.OperationDefImpl#isIsOneway <em>Is Oneway</em>}</li>
 *   <li>{@link org.csu.idl.idlmm.impl.OperationDefImpl#getContexts <em>Contexts</em>}</li>
 *   <li>{@link org.csu.idl.idlmm.impl.OperationDefImpl#getCanRaise <em>Can Raise</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationDefImpl extends ContainedImpl implements OperationDef {
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
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterDef> parameters;

	/**
	 * The default value of the '{@link #isIsOneway() <em>Is Oneway</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOneway()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ONEWAY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsOneway() <em>Is Oneway</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOneway()
	 * @generated
	 * @ordered
	 */
	protected boolean isOneway = IS_ONEWAY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContexts() <em>Contexts</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<String> contexts;

	/**
	 * The cached value of the '{@link #getCanRaise() <em>Can Raise</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanRaise()
	 * @generated
	 * @ordered
	 */
	protected EList<ExceptionDef> canRaise;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IdlmmPackage.Literals.OPERATION_DEF;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IdlmmPackage.OPERATION_DEF__CONTAINED_TYPE, oldContainedType, newContainedType);
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
				msgs = ((InternalEObject)containedType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IdlmmPackage.OPERATION_DEF__CONTAINED_TYPE, null, msgs);
			if (newContainedType != null)
				msgs = ((InternalEObject)newContainedType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IdlmmPackage.OPERATION_DEF__CONTAINED_TYPE, null, msgs);
			msgs = basicSetContainedType(newContainedType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdlmmPackage.OPERATION_DEF__CONTAINED_TYPE, newContainedType, newContainedType));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IdlmmPackage.OPERATION_DEF__SHARED_TYPE, oldSharedType, sharedType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IdlmmPackage.OPERATION_DEF__SHARED_TYPE, oldSharedType, sharedType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterDef> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<ParameterDef>(ParameterDef.class, this, IdlmmPackage.OPERATION_DEF__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsOneway() {
		return isOneway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOneway(boolean newIsOneway) {
		boolean oldIsOneway = isOneway;
		isOneway = newIsOneway;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdlmmPackage.OPERATION_DEF__IS_ONEWAY, oldIsOneway, isOneway));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getContexts() {
		if (contexts == null) {
			contexts = new EDataTypeUniqueEList<String>(String.class, this, IdlmmPackage.OPERATION_DEF__CONTEXTS);
		}
		return contexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExceptionDef> getCanRaise() {
		if (canRaise == null) {
			canRaise = new EObjectResolvingEList<ExceptionDef>(ExceptionDef.class, this, IdlmmPackage.OPERATION_DEF__CAN_RAISE);
		}
		return canRaise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IdlmmPackage.OPERATION_DEF__CONTAINED_TYPE:
				return basicSetContainedType(null, msgs);
			case IdlmmPackage.OPERATION_DEF__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
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
			case IdlmmPackage.OPERATION_DEF__CONTAINED_TYPE:
				return getContainedType();
			case IdlmmPackage.OPERATION_DEF__SHARED_TYPE:
				if (resolve) return getSharedType();
				return basicGetSharedType();
			case IdlmmPackage.OPERATION_DEF__PARAMETERS:
				return getParameters();
			case IdlmmPackage.OPERATION_DEF__IS_ONEWAY:
				return isIsOneway();
			case IdlmmPackage.OPERATION_DEF__CONTEXTS:
				return getContexts();
			case IdlmmPackage.OPERATION_DEF__CAN_RAISE:
				return getCanRaise();
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
			case IdlmmPackage.OPERATION_DEF__CONTAINED_TYPE:
				setContainedType((IDLType)newValue);
				return;
			case IdlmmPackage.OPERATION_DEF__SHARED_TYPE:
				setSharedType((TypedefDef)newValue);
				return;
			case IdlmmPackage.OPERATION_DEF__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends ParameterDef>)newValue);
				return;
			case IdlmmPackage.OPERATION_DEF__IS_ONEWAY:
				setIsOneway((Boolean)newValue);
				return;
			case IdlmmPackage.OPERATION_DEF__CONTEXTS:
				getContexts().clear();
				getContexts().addAll((Collection<? extends String>)newValue);
				return;
			case IdlmmPackage.OPERATION_DEF__CAN_RAISE:
				getCanRaise().clear();
				getCanRaise().addAll((Collection<? extends ExceptionDef>)newValue);
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
			case IdlmmPackage.OPERATION_DEF__CONTAINED_TYPE:
				setContainedType((IDLType)null);
				return;
			case IdlmmPackage.OPERATION_DEF__SHARED_TYPE:
				setSharedType((TypedefDef)null);
				return;
			case IdlmmPackage.OPERATION_DEF__PARAMETERS:
				getParameters().clear();
				return;
			case IdlmmPackage.OPERATION_DEF__IS_ONEWAY:
				setIsOneway(IS_ONEWAY_EDEFAULT);
				return;
			case IdlmmPackage.OPERATION_DEF__CONTEXTS:
				getContexts().clear();
				return;
			case IdlmmPackage.OPERATION_DEF__CAN_RAISE:
				getCanRaise().clear();
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
			case IdlmmPackage.OPERATION_DEF__CONTAINED_TYPE:
				return containedType != null;
			case IdlmmPackage.OPERATION_DEF__SHARED_TYPE:
				return sharedType != null;
			case IdlmmPackage.OPERATION_DEF__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case IdlmmPackage.OPERATION_DEF__IS_ONEWAY:
				return isOneway != IS_ONEWAY_EDEFAULT;
			case IdlmmPackage.OPERATION_DEF__CONTEXTS:
				return contexts != null && !contexts.isEmpty();
			case IdlmmPackage.OPERATION_DEF__CAN_RAISE:
				return canRaise != null && !canRaise.isEmpty();
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
				case IdlmmPackage.OPERATION_DEF__CONTAINED_TYPE: return IdlmmPackage.TYPED__CONTAINED_TYPE;
				case IdlmmPackage.OPERATION_DEF__SHARED_TYPE: return IdlmmPackage.TYPED__SHARED_TYPE;
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
				case IdlmmPackage.TYPED__CONTAINED_TYPE: return IdlmmPackage.OPERATION_DEF__CONTAINED_TYPE;
				case IdlmmPackage.TYPED__SHARED_TYPE: return IdlmmPackage.OPERATION_DEF__SHARED_TYPE;
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
		result.append(" (isOneway: ");
		result.append(isOneway);
		result.append(", contexts: ");
		result.append(contexts);
		result.append(')');
		return result.toString();
	}

} //OperationDefImpl
