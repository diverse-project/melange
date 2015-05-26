/**
 */
package fsmcore.impl;

import fsmcore.AbstractState;
import fsmcore.FsmcorePackage;
import fsmcore.Region;
import fsmcore.Transition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
 *   <li>{@link fsmcore.impl.AbstractStateImpl#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link fsmcore.impl.AbstractStateImpl#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link fsmcore.impl.AbstractStateImpl#getOwnerRegion <em>Owner Region</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractStateImpl extends NamedElementImpl implements AbstractState {
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
	 * The cached value of the '{@link #getOutgoing() <em>Outgoing</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoing()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> outgoing;

	/**
	 * The cached value of the '{@link #getOwnerRegion() <em>Owner Region</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnerRegion()
	 * @generated
	 * @ordered
	 */
	protected Region ownerRegion;

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
		return FsmcorePackage.Literals.ABSTRACT_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getIncoming() {
		if (incoming == null) {
			incoming = new EObjectWithInverseResolvingEList<Transition>(Transition.class, this, FsmcorePackage.ABSTRACT_STATE__INCOMING, FsmcorePackage.TRANSITION__TARGET);
		}
		return incoming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getOutgoing() {
		if (outgoing == null) {
			outgoing = new EObjectWithInverseResolvingEList<Transition>(Transition.class, this, FsmcorePackage.ABSTRACT_STATE__OUTGOING, FsmcorePackage.TRANSITION__SOURCE);
		}
		return outgoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region getOwnerRegion() {
		if (ownerRegion != null && ownerRegion.eIsProxy()) {
			InternalEObject oldOwnerRegion = (InternalEObject)ownerRegion;
			ownerRegion = (Region)eResolveProxy(oldOwnerRegion);
			if (ownerRegion != oldOwnerRegion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FsmcorePackage.ABSTRACT_STATE__OWNER_REGION, oldOwnerRegion, ownerRegion));
			}
		}
		return ownerRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region basicGetOwnerRegion() {
		return ownerRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnerRegion(Region newOwnerRegion) {
		Region oldOwnerRegion = ownerRegion;
		ownerRegion = newOwnerRegion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FsmcorePackage.ABSTRACT_STATE__OWNER_REGION, oldOwnerRegion, ownerRegion));
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
			case FsmcorePackage.ABSTRACT_STATE__INCOMING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncoming()).basicAdd(otherEnd, msgs);
			case FsmcorePackage.ABSTRACT_STATE__OUTGOING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoing()).basicAdd(otherEnd, msgs);
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
			case FsmcorePackage.ABSTRACT_STATE__INCOMING:
				return ((InternalEList<?>)getIncoming()).basicRemove(otherEnd, msgs);
			case FsmcorePackage.ABSTRACT_STATE__OUTGOING:
				return ((InternalEList<?>)getOutgoing()).basicRemove(otherEnd, msgs);
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
			case FsmcorePackage.ABSTRACT_STATE__INCOMING:
				return getIncoming();
			case FsmcorePackage.ABSTRACT_STATE__OUTGOING:
				return getOutgoing();
			case FsmcorePackage.ABSTRACT_STATE__OWNER_REGION:
				if (resolve) return getOwnerRegion();
				return basicGetOwnerRegion();
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
			case FsmcorePackage.ABSTRACT_STATE__INCOMING:
				getIncoming().clear();
				getIncoming().addAll((Collection<? extends Transition>)newValue);
				return;
			case FsmcorePackage.ABSTRACT_STATE__OUTGOING:
				getOutgoing().clear();
				getOutgoing().addAll((Collection<? extends Transition>)newValue);
				return;
			case FsmcorePackage.ABSTRACT_STATE__OWNER_REGION:
				setOwnerRegion((Region)newValue);
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
			case FsmcorePackage.ABSTRACT_STATE__INCOMING:
				getIncoming().clear();
				return;
			case FsmcorePackage.ABSTRACT_STATE__OUTGOING:
				getOutgoing().clear();
				return;
			case FsmcorePackage.ABSTRACT_STATE__OWNER_REGION:
				setOwnerRegion((Region)null);
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
			case FsmcorePackage.ABSTRACT_STATE__INCOMING:
				return incoming != null && !incoming.isEmpty();
			case FsmcorePackage.ABSTRACT_STATE__OUTGOING:
				return outgoing != null && !outgoing.isEmpty();
			case FsmcorePackage.ABSTRACT_STATE__OWNER_REGION:
				return ownerRegion != null;
		}
		return super.eIsSet(featureID);
	}

} //AbstractStateImpl
