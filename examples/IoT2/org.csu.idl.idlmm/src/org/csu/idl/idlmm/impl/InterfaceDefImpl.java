/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.csu.idl.idlmm.impl;

import java.util.Collection;

import org.csu.idl.idlmm.ForwardDef;
import org.csu.idl.idlmm.IDLType;
import org.csu.idl.idlmm.IdlmmPackage;
import org.csu.idl.idlmm.InterfaceDef;
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
 * An implementation of the model object '<em><b>Interface Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csu.idl.idlmm.impl.InterfaceDefImpl#getTypeCode <em>Type Code</em>}</li>
 *   <li>{@link org.csu.idl.idlmm.impl.InterfaceDefImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link org.csu.idl.idlmm.impl.InterfaceDefImpl#isIsCustom <em>Is Custom</em>}</li>
 *   <li>{@link org.csu.idl.idlmm.impl.InterfaceDefImpl#isIsTruncatable <em>Is Truncatable</em>}</li>
 *   <li>{@link org.csu.idl.idlmm.impl.InterfaceDefImpl#getDerivesFrom <em>Derives From</em>}</li>
 *   <li>{@link org.csu.idl.idlmm.impl.InterfaceDefImpl#getForward <em>Forward</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterfaceDefImpl extends ContainerImpl implements InterfaceDef {
	/**
	 * The default value of the '{@link #getTypeCode() <em>Type Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeCode()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeCode() <em>Type Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeCode()
	 * @generated
	 * @ordered
	 */
	protected String typeCode = TYPE_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean isAbstract = IS_ABSTRACT_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsCustom() <em>Is Custom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCustom()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CUSTOM_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsCustom() <em>Is Custom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCustom()
	 * @generated
	 * @ordered
	 */
	protected boolean isCustom = IS_CUSTOM_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsTruncatable() <em>Is Truncatable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTruncatable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_TRUNCATABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsTruncatable() <em>Is Truncatable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTruncatable()
	 * @generated
	 * @ordered
	 */
	protected boolean isTruncatable = IS_TRUNCATABLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDerivesFrom() <em>Derives From</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivesFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceDef> derivesFrom;

	/**
	 * The cached value of the '{@link #getForward() <em>Forward</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForward()
	 * @generated
	 * @ordered
	 */
	protected ForwardDef forward;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IdlmmPackage.Literals.INTERFACE_DEF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeCode() {
		return typeCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeCode(String newTypeCode) {
		String oldTypeCode = typeCode;
		typeCode = newTypeCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdlmmPackage.INTERFACE_DEF__TYPE_CODE, oldTypeCode, typeCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAbstract() {
		return isAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAbstract(boolean newIsAbstract) {
		boolean oldIsAbstract = isAbstract;
		isAbstract = newIsAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdlmmPackage.INTERFACE_DEF__IS_ABSTRACT, oldIsAbstract, isAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsCustom() {
		return isCustom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsCustom(boolean newIsCustom) {
		boolean oldIsCustom = isCustom;
		isCustom = newIsCustom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdlmmPackage.INTERFACE_DEF__IS_CUSTOM, oldIsCustom, isCustom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsTruncatable() {
		return isTruncatable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsTruncatable(boolean newIsTruncatable) {
		boolean oldIsTruncatable = isTruncatable;
		isTruncatable = newIsTruncatable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdlmmPackage.INTERFACE_DEF__IS_TRUNCATABLE, oldIsTruncatable, isTruncatable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceDef> getDerivesFrom() {
		if (derivesFrom == null) {
			derivesFrom = new EObjectResolvingEList<InterfaceDef>(InterfaceDef.class, this, IdlmmPackage.INTERFACE_DEF__DERIVES_FROM);
		}
		return derivesFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForwardDef getForward() {
		if (forward != null && forward.eIsProxy()) {
			InternalEObject oldForward = (InternalEObject)forward;
			forward = (ForwardDef)eResolveProxy(oldForward);
			if (forward != oldForward) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IdlmmPackage.INTERFACE_DEF__FORWARD, oldForward, forward));
			}
		}
		return forward;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForwardDef basicGetForward() {
		return forward;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForward(ForwardDef newForward) {
		ForwardDef oldForward = forward;
		forward = newForward;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdlmmPackage.INTERFACE_DEF__FORWARD, oldForward, forward));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IdlmmPackage.INTERFACE_DEF__TYPE_CODE:
				return getTypeCode();
			case IdlmmPackage.INTERFACE_DEF__IS_ABSTRACT:
				return isIsAbstract();
			case IdlmmPackage.INTERFACE_DEF__IS_CUSTOM:
				return isIsCustom();
			case IdlmmPackage.INTERFACE_DEF__IS_TRUNCATABLE:
				return isIsTruncatable();
			case IdlmmPackage.INTERFACE_DEF__DERIVES_FROM:
				return getDerivesFrom();
			case IdlmmPackage.INTERFACE_DEF__FORWARD:
				if (resolve) return getForward();
				return basicGetForward();
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
			case IdlmmPackage.INTERFACE_DEF__TYPE_CODE:
				setTypeCode((String)newValue);
				return;
			case IdlmmPackage.INTERFACE_DEF__IS_ABSTRACT:
				setIsAbstract((Boolean)newValue);
				return;
			case IdlmmPackage.INTERFACE_DEF__IS_CUSTOM:
				setIsCustom((Boolean)newValue);
				return;
			case IdlmmPackage.INTERFACE_DEF__IS_TRUNCATABLE:
				setIsTruncatable((Boolean)newValue);
				return;
			case IdlmmPackage.INTERFACE_DEF__DERIVES_FROM:
				getDerivesFrom().clear();
				getDerivesFrom().addAll((Collection<? extends InterfaceDef>)newValue);
				return;
			case IdlmmPackage.INTERFACE_DEF__FORWARD:
				setForward((ForwardDef)newValue);
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
			case IdlmmPackage.INTERFACE_DEF__TYPE_CODE:
				setTypeCode(TYPE_CODE_EDEFAULT);
				return;
			case IdlmmPackage.INTERFACE_DEF__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case IdlmmPackage.INTERFACE_DEF__IS_CUSTOM:
				setIsCustom(IS_CUSTOM_EDEFAULT);
				return;
			case IdlmmPackage.INTERFACE_DEF__IS_TRUNCATABLE:
				setIsTruncatable(IS_TRUNCATABLE_EDEFAULT);
				return;
			case IdlmmPackage.INTERFACE_DEF__DERIVES_FROM:
				getDerivesFrom().clear();
				return;
			case IdlmmPackage.INTERFACE_DEF__FORWARD:
				setForward((ForwardDef)null);
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
			case IdlmmPackage.INTERFACE_DEF__TYPE_CODE:
				return TYPE_CODE_EDEFAULT == null ? typeCode != null : !TYPE_CODE_EDEFAULT.equals(typeCode);
			case IdlmmPackage.INTERFACE_DEF__IS_ABSTRACT:
				return isAbstract != IS_ABSTRACT_EDEFAULT;
			case IdlmmPackage.INTERFACE_DEF__IS_CUSTOM:
				return isCustom != IS_CUSTOM_EDEFAULT;
			case IdlmmPackage.INTERFACE_DEF__IS_TRUNCATABLE:
				return isTruncatable != IS_TRUNCATABLE_EDEFAULT;
			case IdlmmPackage.INTERFACE_DEF__DERIVES_FROM:
				return derivesFrom != null && !derivesFrom.isEmpty();
			case IdlmmPackage.INTERFACE_DEF__FORWARD:
				return forward != null;
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
		if (baseClass == IDLType.class) {
			switch (derivedFeatureID) {
				case IdlmmPackage.INTERFACE_DEF__TYPE_CODE: return IdlmmPackage.IDL_TYPE__TYPE_CODE;
				default: return -1;
			}
		}
		if (baseClass == TypedefDef.class) {
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
		if (baseClass == IDLType.class) {
			switch (baseFeatureID) {
				case IdlmmPackage.IDL_TYPE__TYPE_CODE: return IdlmmPackage.INTERFACE_DEF__TYPE_CODE;
				default: return -1;
			}
		}
		if (baseClass == TypedefDef.class) {
			switch (baseFeatureID) {
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
		result.append(" (typeCode: ");
		result.append(typeCode);
		result.append(", isAbstract: ");
		result.append(isAbstract);
		result.append(", isCustom: ");
		result.append(isCustom);
		result.append(", isTruncatable: ");
		result.append(isTruncatable);
		result.append(')');
		return result.toString();
	}

} //InterfaceDefImpl
