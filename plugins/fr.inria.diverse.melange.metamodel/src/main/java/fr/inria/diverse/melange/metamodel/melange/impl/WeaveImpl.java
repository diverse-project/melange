/**
 */
package fr.inria.diverse.melange.metamodel.melange.impl;

import fr.inria.diverse.melange.metamodel.melange.MelangePackage;
import fr.inria.diverse.melange.metamodel.melange.Weave;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Weave</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.impl.WeaveImpl#getAspectTypeRef <em>Aspect Type Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WeaveImpl extends OperatorImpl implements Weave {
	/**
	 * The cached value of the '{@link #getAspectTypeRef() <em>Aspect Type Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAspectTypeRef()
	 * @generated
	 * @ordered
	 */
	protected JvmTypeReference aspectTypeRef;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WeaveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MelangePackage.Literals.WEAVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmTypeReference getAspectTypeRef() {
		return aspectTypeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAspectTypeRef(JvmTypeReference newAspectTypeRef, NotificationChain msgs) {
		JvmTypeReference oldAspectTypeRef = aspectTypeRef;
		aspectTypeRef = newAspectTypeRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MelangePackage.WEAVE__ASPECT_TYPE_REF, oldAspectTypeRef, newAspectTypeRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAspectTypeRef(JvmTypeReference newAspectTypeRef) {
		if (newAspectTypeRef != aspectTypeRef) {
			NotificationChain msgs = null;
			if (aspectTypeRef != null)
				msgs = ((InternalEObject)aspectTypeRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MelangePackage.WEAVE__ASPECT_TYPE_REF, null, msgs);
			if (newAspectTypeRef != null)
				msgs = ((InternalEObject)newAspectTypeRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MelangePackage.WEAVE__ASPECT_TYPE_REF, null, msgs);
			msgs = basicSetAspectTypeRef(newAspectTypeRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MelangePackage.WEAVE__ASPECT_TYPE_REF, newAspectTypeRef, newAspectTypeRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MelangePackage.WEAVE__ASPECT_TYPE_REF:
				return basicSetAspectTypeRef(null, msgs);
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
			case MelangePackage.WEAVE__ASPECT_TYPE_REF:
				return getAspectTypeRef();
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
			case MelangePackage.WEAVE__ASPECT_TYPE_REF:
				setAspectTypeRef((JvmTypeReference)newValue);
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
			case MelangePackage.WEAVE__ASPECT_TYPE_REF:
				setAspectTypeRef((JvmTypeReference)null);
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
			case MelangePackage.WEAVE__ASPECT_TYPE_REF:
				return aspectTypeRef != null;
		}
		return super.eIsSet(featureID);
	}

} //WeaveImpl
