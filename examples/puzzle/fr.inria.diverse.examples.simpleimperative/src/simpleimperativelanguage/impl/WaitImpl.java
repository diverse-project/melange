/**
 */
package simpleimperativelanguage.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import simpleimperativelanguage.SimpleimperativelanguagePackage;
import simpleimperativelanguage.Wait;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wait</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link simpleimperativelanguage.impl.WaitImpl#getMiliseconds <em>Miliseconds</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WaitImpl extends StatementImpl implements Wait {
	/**
	 * The default value of the '{@link #getMiliseconds() <em>Miliseconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiliseconds()
	 * @generated
	 * @ordered
	 */
	protected static final long MILISECONDS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMiliseconds() <em>Miliseconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiliseconds()
	 * @generated
	 * @ordered
	 */
	protected long miliseconds = MILISECONDS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WaitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimpleimperativelanguagePackage.Literals.WAIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getMiliseconds() {
		return miliseconds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMiliseconds(long newMiliseconds) {
		long oldMiliseconds = miliseconds;
		miliseconds = newMiliseconds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleimperativelanguagePackage.WAIT__MILISECONDS, oldMiliseconds, miliseconds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimpleimperativelanguagePackage.WAIT__MILISECONDS:
				return getMiliseconds();
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
			case SimpleimperativelanguagePackage.WAIT__MILISECONDS:
				setMiliseconds((Long)newValue);
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
			case SimpleimperativelanguagePackage.WAIT__MILISECONDS:
				setMiliseconds(MILISECONDS_EDEFAULT);
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
			case SimpleimperativelanguagePackage.WAIT__MILISECONDS:
				return miliseconds != MILISECONDS_EDEFAULT;
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
		result.append(" (miliseconds: ");
		result.append(miliseconds);
		result.append(')');
		return result.toString();
	}

} //WaitImpl
