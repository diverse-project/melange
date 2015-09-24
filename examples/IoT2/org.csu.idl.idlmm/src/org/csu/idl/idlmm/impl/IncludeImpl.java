/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.csu.idl.idlmm.impl;

import org.csu.idl.idlmm.IdlmmPackage;
import org.csu.idl.idlmm.Include;

import org.csu.idl.idlmm.TranslationUnit;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Include</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csu.idl.idlmm.impl.IncludeImpl#getImportURI <em>Import URI</em>}</li>
 *   <li>{@link org.csu.idl.idlmm.impl.IncludeImpl#getTranslationUnit <em>Translation Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IncludeImpl extends EObjectImpl implements Include {
	/**
	 * The default value of the '{@link #getImportURI() <em>Import URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportURI()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPORT_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImportURI() <em>Import URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportURI()
	 * @generated
	 * @ordered
	 */
	protected String importURI = IMPORT_URI_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTranslationUnit() <em>Translation Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranslationUnit()
	 * @generated
	 * @ordered
	 */
	protected TranslationUnit translationUnit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IncludeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IdlmmPackage.Literals.INCLUDE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImportURI() {
		return importURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportURI(String newImportURI) {
		String oldImportURI = importURI;
		importURI = newImportURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdlmmPackage.INCLUDE__IMPORT_URI, oldImportURI, importURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TranslationUnit getTranslationUnit() {
		if (translationUnit != null && translationUnit.eIsProxy()) {
			InternalEObject oldTranslationUnit = (InternalEObject)translationUnit;
			translationUnit = (TranslationUnit)eResolveProxy(oldTranslationUnit);
			if (translationUnit != oldTranslationUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IdlmmPackage.INCLUDE__TRANSLATION_UNIT, oldTranslationUnit, translationUnit));
			}
		}
		return translationUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TranslationUnit basicGetTranslationUnit() {
		return translationUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTranslationUnit(TranslationUnit newTranslationUnit) {
		TranslationUnit oldTranslationUnit = translationUnit;
		translationUnit = newTranslationUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdlmmPackage.INCLUDE__TRANSLATION_UNIT, oldTranslationUnit, translationUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IdlmmPackage.INCLUDE__IMPORT_URI:
				return getImportURI();
			case IdlmmPackage.INCLUDE__TRANSLATION_UNIT:
				if (resolve) return getTranslationUnit();
				return basicGetTranslationUnit();
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
			case IdlmmPackage.INCLUDE__IMPORT_URI:
				setImportURI((String)newValue);
				return;
			case IdlmmPackage.INCLUDE__TRANSLATION_UNIT:
				setTranslationUnit((TranslationUnit)newValue);
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
			case IdlmmPackage.INCLUDE__IMPORT_URI:
				setImportURI(IMPORT_URI_EDEFAULT);
				return;
			case IdlmmPackage.INCLUDE__TRANSLATION_UNIT:
				setTranslationUnit((TranslationUnit)null);
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
			case IdlmmPackage.INCLUDE__IMPORT_URI:
				return IMPORT_URI_EDEFAULT == null ? importURI != null : !IMPORT_URI_EDEFAULT.equals(importURI);
			case IdlmmPackage.INCLUDE__TRANSLATION_UNIT:
				return translationUnit != null;
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
		result.append(" (importURI: ");
		result.append(importURI);
		result.append(')');
		return result.toString();
	}

} //IncludeImpl
