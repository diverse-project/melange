/**
 */
package compositestates.impl;

import compositestates.CompositestatesPackage;
import compositestates.Region;
import compositestates.State;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link compositestates.impl.StateImpl#getOwnedRegions <em>Owned Regions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateImpl extends AbstractStateImpl implements State {
	/**
	 * The cached value of the '{@link #getOwnedRegions() <em>Owned Regions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedRegions()
	 * @generated
	 * @ordered
	 */
	protected EList<Region> ownedRegions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CompositestatesPackage.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Region> getOwnedRegions() {
		if (ownedRegions == null) {
			ownedRegions = new EObjectContainmentWithInverseEList<Region>(Region.class, this, CompositestatesPackage.STATE__OWNED_REGIONS, CompositestatesPackage.REGION__OWNER_STATE);
		}
		return ownedRegions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void evalState(Map<?, ?> context) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case CompositestatesPackage.STATE__OWNED_REGIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedRegions()).basicAdd(otherEnd, msgs);
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
			case CompositestatesPackage.STATE__OWNED_REGIONS:
				return ((InternalEList<?>)getOwnedRegions()).basicRemove(otherEnd, msgs);
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
			case CompositestatesPackage.STATE__OWNED_REGIONS:
				return getOwnedRegions();
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
			case CompositestatesPackage.STATE__OWNED_REGIONS:
				getOwnedRegions().clear();
				getOwnedRegions().addAll((Collection<? extends Region>)newValue);
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
			case CompositestatesPackage.STATE__OWNED_REGIONS:
				getOwnedRegions().clear();
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
			case CompositestatesPackage.STATE__OWNED_REGIONS:
				return ownedRegions != null && !ownedRegions.isEmpty();
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
			case CompositestatesPackage.STATE___EVAL_STATE__MAP:
				evalState((Map<?, ?>)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //StateImpl
