/**
 */
package nottrigger.impl;

import nottrigger.NotTrigger;
import nottrigger.NottriggerPackage;

import nottrigger.Trigger;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Not Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nottrigger.impl.NotTriggerImpl#getNegated <em>Negated</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NotTriggerImpl extends TriggerImpl implements NotTrigger {
	/**
	 * The cached value of the '{@link #getNegated() <em>Negated</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNegated()
	 * @generated
	 * @ordered
	 */
	protected Trigger negated;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotTriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NottriggerPackage.Literals.NOT_TRIGGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trigger getNegated() {
		return negated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNegated(Trigger newNegated, NotificationChain msgs) {
		Trigger oldNegated = negated;
		negated = newNegated;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NottriggerPackage.NOT_TRIGGER__NEGATED, oldNegated, newNegated);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNegated(Trigger newNegated) {
		if (newNegated != negated) {
			NotificationChain msgs = null;
			if (negated != null)
				msgs = ((InternalEObject)negated).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NottriggerPackage.NOT_TRIGGER__NEGATED, null, msgs);
			if (newNegated != null)
				msgs = ((InternalEObject)newNegated).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NottriggerPackage.NOT_TRIGGER__NEGATED, null, msgs);
			msgs = basicSetNegated(newNegated, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NottriggerPackage.NOT_TRIGGER__NEGATED, newNegated, newNegated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NottriggerPackage.NOT_TRIGGER__NEGATED:
				return basicSetNegated(null, msgs);
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
			case NottriggerPackage.NOT_TRIGGER__NEGATED:
				return getNegated();
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
			case NottriggerPackage.NOT_TRIGGER__NEGATED:
				setNegated((Trigger)newValue);
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
			case NottriggerPackage.NOT_TRIGGER__NEGATED:
				setNegated((Trigger)null);
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
			case NottriggerPackage.NOT_TRIGGER__NEGATED:
				return negated != null;
		}
		return super.eIsSet(featureID);
	}

} //NotTriggerImpl
