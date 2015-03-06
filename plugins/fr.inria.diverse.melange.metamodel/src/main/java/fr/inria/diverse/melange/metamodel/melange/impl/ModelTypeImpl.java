/**
 */
package fr.inria.diverse.melange.metamodel.melange.impl;

import fr.inria.diverse.melange.metamodel.melange.MelangePackage;
import fr.inria.diverse.melange.metamodel.melange.Metamodel;
import fr.inria.diverse.melange.metamodel.melange.ModelType;
import fr.inria.diverse.melange.metamodel.melange.Subtyping;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.impl.ModelTypeImpl#getSubtypingRelations <em>Subtyping Relations</em>}</li>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.impl.ModelTypeImpl#getExtracted <em>Extracted</em>}</li>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.impl.ModelTypeImpl#getMtUri <em>Mt Uri</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelTypeImpl extends ModelingElementImpl implements ModelType {
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
	 * The cached value of the '{@link #getExtracted() <em>Extracted</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtracted()
	 * @generated
	 * @ordered
	 */
	protected Metamodel extracted;

	/**
	 * The default value of the '{@link #getMtUri() <em>Mt Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMtUri()
	 * @generated
	 * @ordered
	 */
	protected static final String MT_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMtUri() <em>Mt Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMtUri()
	 * @generated
	 * @ordered
	 */
	protected String mtUri = MT_URI_EDEFAULT;

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
		return MelangePackage.Literals.MODEL_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Subtyping> getSubtypingRelations() {
		if (subtypingRelations == null) {
			subtypingRelations = new EObjectContainmentWithInverseEList<Subtyping>(Subtyping.class, this, MelangePackage.MODEL_TYPE__SUBTYPING_RELATIONS, MelangePackage.SUBTYPING__SUB_TYPE);
		}
		return subtypingRelations;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MelangePackage.MODEL_TYPE__EXTRACTED, oldExtracted, extracted));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MelangePackage.MODEL_TYPE__EXTRACTED, oldExtracted, newExtracted);
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
				msgs = ((InternalEObject)extracted).eInverseRemove(this, MelangePackage.METAMODEL__EXACT_TYPE, Metamodel.class, msgs);
			if (newExtracted != null)
				msgs = ((InternalEObject)newExtracted).eInverseAdd(this, MelangePackage.METAMODEL__EXACT_TYPE, Metamodel.class, msgs);
			msgs = basicSetExtracted(newExtracted, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MelangePackage.MODEL_TYPE__EXTRACTED, newExtracted, newExtracted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMtUri() {
		return mtUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMtUri(String newMtUri) {
		String oldMtUri = mtUri;
		mtUri = newMtUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MelangePackage.MODEL_TYPE__MT_URI, oldMtUri, mtUri));
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
			case MelangePackage.MODEL_TYPE__SUBTYPING_RELATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubtypingRelations()).basicAdd(otherEnd, msgs);
			case MelangePackage.MODEL_TYPE__EXTRACTED:
				if (extracted != null)
					msgs = ((InternalEObject)extracted).eInverseRemove(this, MelangePackage.METAMODEL__EXACT_TYPE, Metamodel.class, msgs);
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
			case MelangePackage.MODEL_TYPE__SUBTYPING_RELATIONS:
				return ((InternalEList<?>)getSubtypingRelations()).basicRemove(otherEnd, msgs);
			case MelangePackage.MODEL_TYPE__EXTRACTED:
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
			case MelangePackage.MODEL_TYPE__SUBTYPING_RELATIONS:
				return getSubtypingRelations();
			case MelangePackage.MODEL_TYPE__EXTRACTED:
				if (resolve) return getExtracted();
				return basicGetExtracted();
			case MelangePackage.MODEL_TYPE__MT_URI:
				return getMtUri();
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
			case MelangePackage.MODEL_TYPE__SUBTYPING_RELATIONS:
				getSubtypingRelations().clear();
				getSubtypingRelations().addAll((Collection<? extends Subtyping>)newValue);
				return;
			case MelangePackage.MODEL_TYPE__EXTRACTED:
				setExtracted((Metamodel)newValue);
				return;
			case MelangePackage.MODEL_TYPE__MT_URI:
				setMtUri((String)newValue);
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
			case MelangePackage.MODEL_TYPE__SUBTYPING_RELATIONS:
				getSubtypingRelations().clear();
				return;
			case MelangePackage.MODEL_TYPE__EXTRACTED:
				setExtracted((Metamodel)null);
				return;
			case MelangePackage.MODEL_TYPE__MT_URI:
				setMtUri(MT_URI_EDEFAULT);
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
			case MelangePackage.MODEL_TYPE__SUBTYPING_RELATIONS:
				return subtypingRelations != null && !subtypingRelations.isEmpty();
			case MelangePackage.MODEL_TYPE__EXTRACTED:
				return extracted != null;
			case MelangePackage.MODEL_TYPE__MT_URI:
				return MT_URI_EDEFAULT == null ? mtUri != null : !MT_URI_EDEFAULT.equals(mtUri);
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
		result.append(" (mtUri: ");
		result.append(mtUri);
		result.append(')');
		return result.toString();
	}

} //ModelTypeImpl
