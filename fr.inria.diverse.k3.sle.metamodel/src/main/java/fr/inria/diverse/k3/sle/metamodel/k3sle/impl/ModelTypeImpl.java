/**
 */
package fr.inria.diverse.k3.sle.metamodel.k3sle.impl;

import fr.inria.diverse.k3.sle.metamodel.k3sle.K3slePackage;
import fr.inria.diverse.k3.sle.metamodel.k3sle.Metamodel;
import fr.inria.diverse.k3.sle.metamodel.k3sle.ModelType;
import fr.inria.diverse.k3.sle.metamodel.k3sle.Subtyping;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.diverse.k3.sle.metamodel.k3sle.impl.ModelTypeImpl#getSubtypingRelations <em>Subtyping Relations</em>}</li>
 *   <li>{@link fr.inria.diverse.k3.sle.metamodel.k3sle.impl.ModelTypeImpl#getPkgs <em>Pkgs</em>}</li>
 *   <li>{@link fr.inria.diverse.k3.sle.metamodel.k3sle.impl.ModelTypeImpl#getExtracted <em>Extracted</em>}</li>
 *   <li>{@link fr.inria.diverse.k3.sle.metamodel.k3sle.impl.ModelTypeImpl#getEcoreUri <em>Ecore Uri</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelTypeImpl extends ElementImpl implements ModelType {
	/**
	 * The cached value of the '{@link #getSubtypingRelations() <em>Subtyping Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtypingRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<Subtyping> subtypingRelations;

	/**
	 * The cached value of the '{@link #getPkgs() <em>Pkgs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPkgs()
	 * @generated
	 * @ordered
	 */
	protected EList<EPackage> pkgs;

	/**
	 * The cached value of the '{@link #getExtracted() <em>Extracted</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtracted()
	 * @generated
	 * @ordered
	 */
	protected Metamodel extracted;

	/**
	 * The default value of the '{@link #getEcoreUri() <em>Ecore Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcoreUri()
	 * @generated
	 * @ordered
	 */
	protected static final String ECORE_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEcoreUri() <em>Ecore Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcoreUri()
	 * @generated
	 * @ordered
	 */
	protected String ecoreUri = ECORE_URI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return K3slePackage.Literals.MODEL_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Subtyping> getSubtypingRelations() {
		if (subtypingRelations == null) {
			subtypingRelations = new EObjectContainmentWithInverseEList<Subtyping>(Subtyping.class, this, K3slePackage.MODEL_TYPE__SUBTYPING_RELATIONS, K3slePackage.SUBTYPING__SUB_TYPE);
		}
		return subtypingRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EPackage> getPkgs() {
		if (pkgs == null) {
			pkgs = new EObjectContainmentEList<EPackage>(EPackage.class, this, K3slePackage.MODEL_TYPE__PKGS);
		}
		return pkgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metamodel getExtracted() {
		if (extracted != null && extracted.eIsProxy()) {
			InternalEObject oldExtracted = (InternalEObject)extracted;
			extracted = (Metamodel)eResolveProxy(oldExtracted);
			if (extracted != oldExtracted) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, K3slePackage.MODEL_TYPE__EXTRACTED, oldExtracted, extracted));
			}
		}
		return extracted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metamodel basicGetExtracted() {
		return extracted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtracted(Metamodel newExtracted, NotificationChain msgs) {
		Metamodel oldExtracted = extracted;
		extracted = newExtracted;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, K3slePackage.MODEL_TYPE__EXTRACTED, oldExtracted, newExtracted);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtracted(Metamodel newExtracted) {
		if (newExtracted != extracted) {
			NotificationChain msgs = null;
			if (extracted != null)
				msgs = ((InternalEObject)extracted).eInverseRemove(this, K3slePackage.METAMODEL__EXACT_TYPE, Metamodel.class, msgs);
			if (newExtracted != null)
				msgs = ((InternalEObject)newExtracted).eInverseAdd(this, K3slePackage.METAMODEL__EXACT_TYPE, Metamodel.class, msgs);
			msgs = basicSetExtracted(newExtracted, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K3slePackage.MODEL_TYPE__EXTRACTED, newExtracted, newExtracted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEcoreUri() {
		return ecoreUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEcoreUri(String newEcoreUri) {
		String oldEcoreUri = ecoreUri;
		ecoreUri = newEcoreUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K3slePackage.MODEL_TYPE__ECORE_URI, oldEcoreUri, ecoreUri));
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
			case K3slePackage.MODEL_TYPE__SUBTYPING_RELATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubtypingRelations()).basicAdd(otherEnd, msgs);
			case K3slePackage.MODEL_TYPE__EXTRACTED:
				if (extracted != null)
					msgs = ((InternalEObject)extracted).eInverseRemove(this, K3slePackage.METAMODEL__EXACT_TYPE, Metamodel.class, msgs);
				return basicSetExtracted((Metamodel)otherEnd, msgs);
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
			case K3slePackage.MODEL_TYPE__SUBTYPING_RELATIONS:
				return ((InternalEList<?>)getSubtypingRelations()).basicRemove(otherEnd, msgs);
			case K3slePackage.MODEL_TYPE__PKGS:
				return ((InternalEList<?>)getPkgs()).basicRemove(otherEnd, msgs);
			case K3slePackage.MODEL_TYPE__EXTRACTED:
				return basicSetExtracted(null, msgs);
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
			case K3slePackage.MODEL_TYPE__SUBTYPING_RELATIONS:
				return getSubtypingRelations();
			case K3slePackage.MODEL_TYPE__PKGS:
				return getPkgs();
			case K3slePackage.MODEL_TYPE__EXTRACTED:
				if (resolve) return getExtracted();
				return basicGetExtracted();
			case K3slePackage.MODEL_TYPE__ECORE_URI:
				return getEcoreUri();
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
			case K3slePackage.MODEL_TYPE__SUBTYPING_RELATIONS:
				getSubtypingRelations().clear();
				getSubtypingRelations().addAll((Collection<? extends Subtyping>)newValue);
				return;
			case K3slePackage.MODEL_TYPE__PKGS:
				getPkgs().clear();
				getPkgs().addAll((Collection<? extends EPackage>)newValue);
				return;
			case K3slePackage.MODEL_TYPE__EXTRACTED:
				setExtracted((Metamodel)newValue);
				return;
			case K3slePackage.MODEL_TYPE__ECORE_URI:
				setEcoreUri((String)newValue);
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
			case K3slePackage.MODEL_TYPE__SUBTYPING_RELATIONS:
				getSubtypingRelations().clear();
				return;
			case K3slePackage.MODEL_TYPE__PKGS:
				getPkgs().clear();
				return;
			case K3slePackage.MODEL_TYPE__EXTRACTED:
				setExtracted((Metamodel)null);
				return;
			case K3slePackage.MODEL_TYPE__ECORE_URI:
				setEcoreUri(ECORE_URI_EDEFAULT);
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
			case K3slePackage.MODEL_TYPE__SUBTYPING_RELATIONS:
				return subtypingRelations != null && !subtypingRelations.isEmpty();
			case K3slePackage.MODEL_TYPE__PKGS:
				return pkgs != null && !pkgs.isEmpty();
			case K3slePackage.MODEL_TYPE__EXTRACTED:
				return extracted != null;
			case K3slePackage.MODEL_TYPE__ECORE_URI:
				return ECORE_URI_EDEFAULT == null ? ecoreUri != null : !ECORE_URI_EDEFAULT.equals(ecoreUri);
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
		result.append(" (ecoreUri: ");
		result.append(ecoreUri);
		result.append(')');
		return result.toString();
	}

} //ModelTypeImpl
