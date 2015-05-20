/**
 */
package puzzle.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import puzzle.Aggregation;
import puzzle.Expression;
import puzzle.PuzzlePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aggregation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link puzzle.impl.AggregationImpl#getRequiring <em>Requiring</em>}</li>
 *   <li>{@link puzzle.impl.AggregationImpl#getProviding <em>Providing</em>}</li>
 *   <li>{@link puzzle.impl.AggregationImpl#getBinding <em>Binding</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AggregationImpl extends StatementImpl implements Aggregation {
	/**
	 * The cached value of the '{@link #getRequiring() <em>Requiring</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiring()
	 * @generated
	 * @ordered
	 */
	protected Expression requiring;

	/**
	 * The cached value of the '{@link #getProviding() <em>Providing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviding()
	 * @generated
	 * @ordered
	 */
	protected Expression providing;

	/**
	 * The default value of the '{@link #getBinding() <em>Binding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinding()
	 * @generated
	 * @ordered
	 */
	protected static final String BINDING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBinding() <em>Binding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinding()
	 * @generated
	 * @ordered
	 */
	protected String binding = BINDING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AggregationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PuzzlePackage.Literals.AGGREGATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getRequiring() {
		return requiring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequiring(Expression newRequiring, NotificationChain msgs) {
		Expression oldRequiring = requiring;
		requiring = newRequiring;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PuzzlePackage.AGGREGATION__REQUIRING, oldRequiring, newRequiring);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiring(Expression newRequiring) {
		if (newRequiring != requiring) {
			NotificationChain msgs = null;
			if (requiring != null)
				msgs = ((InternalEObject)requiring).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PuzzlePackage.AGGREGATION__REQUIRING, null, msgs);
			if (newRequiring != null)
				msgs = ((InternalEObject)newRequiring).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PuzzlePackage.AGGREGATION__REQUIRING, null, msgs);
			msgs = basicSetRequiring(newRequiring, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PuzzlePackage.AGGREGATION__REQUIRING, newRequiring, newRequiring));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getProviding() {
		return providing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProviding(Expression newProviding, NotificationChain msgs) {
		Expression oldProviding = providing;
		providing = newProviding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PuzzlePackage.AGGREGATION__PROVIDING, oldProviding, newProviding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProviding(Expression newProviding) {
		if (newProviding != providing) {
			NotificationChain msgs = null;
			if (providing != null)
				msgs = ((InternalEObject)providing).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PuzzlePackage.AGGREGATION__PROVIDING, null, msgs);
			if (newProviding != null)
				msgs = ((InternalEObject)newProviding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PuzzlePackage.AGGREGATION__PROVIDING, null, msgs);
			msgs = basicSetProviding(newProviding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PuzzlePackage.AGGREGATION__PROVIDING, newProviding, newProviding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBinding() {
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBinding(String newBinding) {
		String oldBinding = binding;
		binding = newBinding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PuzzlePackage.AGGREGATION__BINDING, oldBinding, binding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PuzzlePackage.AGGREGATION__REQUIRING:
				return basicSetRequiring(null, msgs);
			case PuzzlePackage.AGGREGATION__PROVIDING:
				return basicSetProviding(null, msgs);
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
			case PuzzlePackage.AGGREGATION__REQUIRING:
				return getRequiring();
			case PuzzlePackage.AGGREGATION__PROVIDING:
				return getProviding();
			case PuzzlePackage.AGGREGATION__BINDING:
				return getBinding();
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
			case PuzzlePackage.AGGREGATION__REQUIRING:
				setRequiring((Expression)newValue);
				return;
			case PuzzlePackage.AGGREGATION__PROVIDING:
				setProviding((Expression)newValue);
				return;
			case PuzzlePackage.AGGREGATION__BINDING:
				setBinding((String)newValue);
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
			case PuzzlePackage.AGGREGATION__REQUIRING:
				setRequiring((Expression)null);
				return;
			case PuzzlePackage.AGGREGATION__PROVIDING:
				setProviding((Expression)null);
				return;
			case PuzzlePackage.AGGREGATION__BINDING:
				setBinding(BINDING_EDEFAULT);
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
			case PuzzlePackage.AGGREGATION__REQUIRING:
				return requiring != null;
			case PuzzlePackage.AGGREGATION__PROVIDING:
				return providing != null;
			case PuzzlePackage.AGGREGATION__BINDING:
				return BINDING_EDEFAULT == null ? binding != null : !BINDING_EDEFAULT.equals(binding);
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
		result.append(" (binding: ");
		result.append(binding);
		result.append(')');
		return result.toString();
	}

} //AggregationImpl
