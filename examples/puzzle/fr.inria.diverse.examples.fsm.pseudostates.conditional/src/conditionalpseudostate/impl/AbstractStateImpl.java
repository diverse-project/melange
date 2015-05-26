/**
 */
package conditionalpseudostate.impl;

import conditionalpseudostate.AbstractState;
import conditionalpseudostate.ConditionalpseudostatePackage;
import conditionalpseudostate.Transition;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link conditionalpseudostate.impl.AbstractStateImpl#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link conditionalpseudostate.impl.AbstractStateImpl#getIncoming <em>Incoming</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractStateImpl extends MinimalEObjectImpl.Container implements AbstractState {
	/**
	 * The cached value of the '{@link #getOutgoing() <em>Outgoing</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoing()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> outgoing;

	/**
	 * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncoming()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> incoming;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConditionalpseudostatePackage.Literals.ABSTRACT_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getOutgoing() {
		if (outgoing == null) {
			outgoing = new EObjectWithInverseResolvingEList<Transition>(Transition.class, this, ConditionalpseudostatePackage.ABSTRACT_STATE__OUTGOING, ConditionalpseudostatePackage.TRANSITION__SOURCE);
		}
		return outgoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getIncoming() {
		if (incoming == null) {
			incoming = new EObjectWithInverseResolvingEList<Transition>(Transition.class, this, ConditionalpseudostatePackage.ABSTRACT_STATE__INCOMING, ConditionalpseudostatePackage.TRANSITION__TARGET);
		}
		return incoming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConditionalpseudostatePackage.ABSTRACT_STATE__OUTGOING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoing()).basicAdd(otherEnd, msgs);
			case ConditionalpseudostatePackage.ABSTRACT_STATE__INCOMING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncoming()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConditionalpseudostatePackage.ABSTRACT_STATE__OUTGOING:
				return ((InternalEList<?>)getOutgoing()).basicRemove(otherEnd, msgs);
			case ConditionalpseudostatePackage.ABSTRACT_STATE__INCOMING:
				return ((InternalEList<?>)getIncoming()).basicRemove(otherEnd, msgs);
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
			case ConditionalpseudostatePackage.ABSTRACT_STATE__OUTGOING:
				return getOutgoing();
			case ConditionalpseudostatePackage.ABSTRACT_STATE__INCOMING:
				return getIncoming();
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
			case ConditionalpseudostatePackage.ABSTRACT_STATE__OUTGOING:
				getOutgoing().clear();
				getOutgoing().addAll((Collection<? extends Transition>)newValue);
				return;
			case ConditionalpseudostatePackage.ABSTRACT_STATE__INCOMING:
				getIncoming().clear();
				getIncoming().addAll((Collection<? extends Transition>)newValue);
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
			case ConditionalpseudostatePackage.ABSTRACT_STATE__OUTGOING:
				getOutgoing().clear();
				return;
			case ConditionalpseudostatePackage.ABSTRACT_STATE__INCOMING:
				getIncoming().clear();
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
			case ConditionalpseudostatePackage.ABSTRACT_STATE__OUTGOING:
				return outgoing != null && !outgoing.isEmpty();
			case ConditionalpseudostatePackage.ABSTRACT_STATE__INCOMING:
				return incoming != null && !incoming.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AbstractStateImpl
