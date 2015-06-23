/**
 */
package activitydiagram.impl;

import activitydiagram.EClassifier;
import activitydiagram.EGenericType;
import activitydiagram.ETypeParameter;
import activitydiagram.EcorePackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EGeneric Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link activitydiagram.impl.EGenericTypeImpl#getEUpperBound <em>EUpper Bound</em>}</li>
 *   <li>{@link activitydiagram.impl.EGenericTypeImpl#getETypeArguments <em>EType Arguments</em>}</li>
 *   <li>{@link activitydiagram.impl.EGenericTypeImpl#getERawType <em>ERaw Type</em>}</li>
 *   <li>{@link activitydiagram.impl.EGenericTypeImpl#getELowerBound <em>ELower Bound</em>}</li>
 *   <li>{@link activitydiagram.impl.EGenericTypeImpl#getETypeParameter <em>EType Parameter</em>}</li>
 *   <li>{@link activitydiagram.impl.EGenericTypeImpl#getEClassifier <em>EClassifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EGenericTypeImpl extends MinimalEObjectImpl.Container implements EGenericType {
	/**
	 * The cached value of the '{@link #getEUpperBound() <em>EUpper Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEUpperBound()
	 * @generated
	 * @ordered
	 */
	protected EGenericType eUpperBound;

	/**
	 * The cached value of the '{@link #getETypeArguments() <em>EType Arguments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getETypeArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<EGenericType> eTypeArguments;

	/**
	 * The cached value of the '{@link #getERawType() <em>ERaw Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getERawType()
	 * @generated
	 * @ordered
	 */
	protected EClassifier eRawType;

	/**
	 * The cached value of the '{@link #getELowerBound() <em>ELower Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getELowerBound()
	 * @generated
	 * @ordered
	 */
	protected EGenericType eLowerBound;

	/**
	 * The cached value of the '{@link #getETypeParameter() <em>EType Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getETypeParameter()
	 * @generated
	 * @ordered
	 */
	protected ETypeParameter eTypeParameter;

	/**
	 * The cached value of the '{@link #getEClassifier() <em>EClassifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEClassifier()
	 * @generated
	 * @ordered
	 */
	protected EClassifier eClassifier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EGenericTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcorePackage.Literals.EGENERIC_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EGenericType getEUpperBound() {
		return eUpperBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEUpperBound(EGenericType newEUpperBound, NotificationChain msgs) {
		EGenericType oldEUpperBound = eUpperBound;
		eUpperBound = newEUpperBound;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcorePackage.EGENERIC_TYPE__EUPPER_BOUND, oldEUpperBound, newEUpperBound);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEUpperBound(EGenericType newEUpperBound) {
		if (newEUpperBound != eUpperBound) {
			NotificationChain msgs = null;
			if (eUpperBound != null)
				msgs = ((InternalEObject)eUpperBound).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcorePackage.EGENERIC_TYPE__EUPPER_BOUND, null, msgs);
			if (newEUpperBound != null)
				msgs = ((InternalEObject)newEUpperBound).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EcorePackage.EGENERIC_TYPE__EUPPER_BOUND, null, msgs);
			msgs = basicSetEUpperBound(newEUpperBound, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcorePackage.EGENERIC_TYPE__EUPPER_BOUND, newEUpperBound, newEUpperBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EGenericType> getETypeArguments() {
		if (eTypeArguments == null) {
			eTypeArguments = new EObjectContainmentEList<EGenericType>(EGenericType.class, this, EcorePackage.EGENERIC_TYPE__ETYPE_ARGUMENTS);
		}
		return eTypeArguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClassifier getERawType() {
		if (eRawType != null && eRawType.eIsProxy()) {
			InternalEObject oldERawType = (InternalEObject)eRawType;
			eRawType = (EClassifier)eResolveProxy(oldERawType);
			if (eRawType != oldERawType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcorePackage.EGENERIC_TYPE__ERAW_TYPE, oldERawType, eRawType));
			}
		}
		return eRawType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClassifier basicGetERawType() {
		return eRawType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EGenericType getELowerBound() {
		return eLowerBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetELowerBound(EGenericType newELowerBound, NotificationChain msgs) {
		EGenericType oldELowerBound = eLowerBound;
		eLowerBound = newELowerBound;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcorePackage.EGENERIC_TYPE__ELOWER_BOUND, oldELowerBound, newELowerBound);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setELowerBound(EGenericType newELowerBound) {
		if (newELowerBound != eLowerBound) {
			NotificationChain msgs = null;
			if (eLowerBound != null)
				msgs = ((InternalEObject)eLowerBound).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcorePackage.EGENERIC_TYPE__ELOWER_BOUND, null, msgs);
			if (newELowerBound != null)
				msgs = ((InternalEObject)newELowerBound).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EcorePackage.EGENERIC_TYPE__ELOWER_BOUND, null, msgs);
			msgs = basicSetELowerBound(newELowerBound, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcorePackage.EGENERIC_TYPE__ELOWER_BOUND, newELowerBound, newELowerBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ETypeParameter getETypeParameter() {
		return eTypeParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setETypeParameter(ETypeParameter newETypeParameter) {
		ETypeParameter oldETypeParameter = eTypeParameter;
		eTypeParameter = newETypeParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcorePackage.EGENERIC_TYPE__ETYPE_PARAMETER, oldETypeParameter, eTypeParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClassifier getEClassifier() {
		if (eClassifier != null && eClassifier.eIsProxy()) {
			InternalEObject oldEClassifier = (InternalEObject)eClassifier;
			eClassifier = (EClassifier)eResolveProxy(oldEClassifier);
			if (eClassifier != oldEClassifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcorePackage.EGENERIC_TYPE__ECLASSIFIER, oldEClassifier, eClassifier));
			}
		}
		return eClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClassifier basicGetEClassifier() {
		return eClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEClassifier(EClassifier newEClassifier) {
		EClassifier oldEClassifier = eClassifier;
		eClassifier = newEClassifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcorePackage.EGENERIC_TYPE__ECLASSIFIER, oldEClassifier, eClassifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInstance(Object object) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcorePackage.EGENERIC_TYPE__EUPPER_BOUND:
				return basicSetEUpperBound(null, msgs);
			case EcorePackage.EGENERIC_TYPE__ETYPE_ARGUMENTS:
				return ((InternalEList<?>)getETypeArguments()).basicRemove(otherEnd, msgs);
			case EcorePackage.EGENERIC_TYPE__ELOWER_BOUND:
				return basicSetELowerBound(null, msgs);
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
			case EcorePackage.EGENERIC_TYPE__EUPPER_BOUND:
				return getEUpperBound();
			case EcorePackage.EGENERIC_TYPE__ETYPE_ARGUMENTS:
				return getETypeArguments();
			case EcorePackage.EGENERIC_TYPE__ERAW_TYPE:
				if (resolve) return getERawType();
				return basicGetERawType();
			case EcorePackage.EGENERIC_TYPE__ELOWER_BOUND:
				return getELowerBound();
			case EcorePackage.EGENERIC_TYPE__ETYPE_PARAMETER:
				return getETypeParameter();
			case EcorePackage.EGENERIC_TYPE__ECLASSIFIER:
				if (resolve) return getEClassifier();
				return basicGetEClassifier();
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
			case EcorePackage.EGENERIC_TYPE__EUPPER_BOUND:
				setEUpperBound((EGenericType)newValue);
				return;
			case EcorePackage.EGENERIC_TYPE__ETYPE_ARGUMENTS:
				getETypeArguments().clear();
				getETypeArguments().addAll((Collection<? extends EGenericType>)newValue);
				return;
			case EcorePackage.EGENERIC_TYPE__ELOWER_BOUND:
				setELowerBound((EGenericType)newValue);
				return;
			case EcorePackage.EGENERIC_TYPE__ETYPE_PARAMETER:
				setETypeParameter((ETypeParameter)newValue);
				return;
			case EcorePackage.EGENERIC_TYPE__ECLASSIFIER:
				setEClassifier((EClassifier)newValue);
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
			case EcorePackage.EGENERIC_TYPE__EUPPER_BOUND:
				setEUpperBound((EGenericType)null);
				return;
			case EcorePackage.EGENERIC_TYPE__ETYPE_ARGUMENTS:
				getETypeArguments().clear();
				return;
			case EcorePackage.EGENERIC_TYPE__ELOWER_BOUND:
				setELowerBound((EGenericType)null);
				return;
			case EcorePackage.EGENERIC_TYPE__ETYPE_PARAMETER:
				setETypeParameter((ETypeParameter)null);
				return;
			case EcorePackage.EGENERIC_TYPE__ECLASSIFIER:
				setEClassifier((EClassifier)null);
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
			case EcorePackage.EGENERIC_TYPE__EUPPER_BOUND:
				return eUpperBound != null;
			case EcorePackage.EGENERIC_TYPE__ETYPE_ARGUMENTS:
				return eTypeArguments != null && !eTypeArguments.isEmpty();
			case EcorePackage.EGENERIC_TYPE__ERAW_TYPE:
				return eRawType != null;
			case EcorePackage.EGENERIC_TYPE__ELOWER_BOUND:
				return eLowerBound != null;
			case EcorePackage.EGENERIC_TYPE__ETYPE_PARAMETER:
				return eTypeParameter != null;
			case EcorePackage.EGENERIC_TYPE__ECLASSIFIER:
				return eClassifier != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case EcorePackage.EGENERIC_TYPE___IS_INSTANCE__OBJECT:
				return isInstance(arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //EGenericTypeImpl
