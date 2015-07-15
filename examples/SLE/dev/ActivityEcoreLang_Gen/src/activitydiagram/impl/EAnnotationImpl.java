/**
 */
package activitydiagram.impl;

import activitydiagram.ActivitydiagramPackage;
import activitydiagram.EAnnotation;
import activitydiagram.EModelElement;
import activitydiagram.EObject;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EAnnotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link activitydiagram.impl.EAnnotationImpl#getSource <em>Source</em>}</li>
 *   <li>{@link activitydiagram.impl.EAnnotationImpl#getDetails <em>Details</em>}</li>
 *   <li>{@link activitydiagram.impl.EAnnotationImpl#getEModelElement <em>EModel Element</em>}</li>
 *   <li>{@link activitydiagram.impl.EAnnotationImpl#getContents <em>Contents</em>}</li>
 *   <li>{@link activitydiagram.impl.EAnnotationImpl#getReferences <em>References</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EAnnotationImpl extends EModelElementImpl implements EAnnotation {
	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected String source = SOURCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDetails() <em>Details</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetails()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> details;

	/**
	 * The cached value of the '{@link #getContents() <em>Contents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContents()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> contents;

	/**
	 * The cached value of the '{@link #getReferences() <em>References</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> references;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EAnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitydiagramPackage.Literals.EANNOTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(String newSource) {
		String oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitydiagramPackage.EANNOTATION__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getDetails() {
		if (details == null) {
			details = new EcoreEMap<String,String>(ActivitydiagramPackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, ActivitydiagramPackage.EANNOTATION__DETAILS);
		}
		return details;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EModelElement getEModelElement() {
		if (eContainerFeatureID() != ActivitydiagramPackage.EANNOTATION__EMODEL_ELEMENT) return null;
		return (EModelElement)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEModelElement(EModelElement newEModelElement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEModelElement, ActivitydiagramPackage.EANNOTATION__EMODEL_ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEModelElement(EModelElement newEModelElement) {
		if (newEModelElement != eInternalContainer() || (eContainerFeatureID() != ActivitydiagramPackage.EANNOTATION__EMODEL_ELEMENT && newEModelElement != null)) {
			if (EcoreUtil.isAncestor(this, newEModelElement))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEModelElement != null)
				msgs = ((InternalEObject)newEModelElement).eInverseAdd(this, ActivitydiagramPackage.EMODEL_ELEMENT__EANNOTATIONS, EModelElement.class, msgs);
			msgs = basicSetEModelElement(newEModelElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitydiagramPackage.EANNOTATION__EMODEL_ELEMENT, newEModelElement, newEModelElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getContents() {
		if (contents == null) {
			contents = new EObjectContainmentEList<EObject>(EObject.class, this, ActivitydiagramPackage.EANNOTATION__CONTENTS);
		}
		return contents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getReferences() {
		if (references == null) {
			references = new EObjectResolvingEList<EObject>(EObject.class, this, ActivitydiagramPackage.EANNOTATION__REFERENCES);
		}
		return references;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActivitydiagramPackage.EANNOTATION__EMODEL_ELEMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEModelElement((EModelElement)otherEnd, msgs);
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
			case ActivitydiagramPackage.EANNOTATION__DETAILS:
				return ((InternalEList<?>)getDetails()).basicRemove(otherEnd, msgs);
			case ActivitydiagramPackage.EANNOTATION__EMODEL_ELEMENT:
				return basicSetEModelElement(null, msgs);
			case ActivitydiagramPackage.EANNOTATION__CONTENTS:
				return ((InternalEList<?>)getContents()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ActivitydiagramPackage.EANNOTATION__EMODEL_ELEMENT:
				return eInternalContainer().eInverseRemove(this, ActivitydiagramPackage.EMODEL_ELEMENT__EANNOTATIONS, EModelElement.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ActivitydiagramPackage.EANNOTATION__SOURCE:
				return getSource();
			case ActivitydiagramPackage.EANNOTATION__DETAILS:
				if (coreType) return getDetails();
				else return getDetails().map();
			case ActivitydiagramPackage.EANNOTATION__EMODEL_ELEMENT:
				return getEModelElement();
			case ActivitydiagramPackage.EANNOTATION__CONTENTS:
				return getContents();
			case ActivitydiagramPackage.EANNOTATION__REFERENCES:
				return getReferences();
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
			case ActivitydiagramPackage.EANNOTATION__SOURCE:
				setSource((String)newValue);
				return;
			case ActivitydiagramPackage.EANNOTATION__DETAILS:
				((EStructuralFeature.Setting)getDetails()).set(newValue);
				return;
			case ActivitydiagramPackage.EANNOTATION__EMODEL_ELEMENT:
				setEModelElement((EModelElement)newValue);
				return;
			case ActivitydiagramPackage.EANNOTATION__CONTENTS:
				getContents().clear();
				getContents().addAll((Collection<? extends EObject>)newValue);
				return;
			case ActivitydiagramPackage.EANNOTATION__REFERENCES:
				getReferences().clear();
				getReferences().addAll((Collection<? extends EObject>)newValue);
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
			case ActivitydiagramPackage.EANNOTATION__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
			case ActivitydiagramPackage.EANNOTATION__DETAILS:
				getDetails().clear();
				return;
			case ActivitydiagramPackage.EANNOTATION__EMODEL_ELEMENT:
				setEModelElement((EModelElement)null);
				return;
			case ActivitydiagramPackage.EANNOTATION__CONTENTS:
				getContents().clear();
				return;
			case ActivitydiagramPackage.EANNOTATION__REFERENCES:
				getReferences().clear();
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
			case ActivitydiagramPackage.EANNOTATION__SOURCE:
				return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
			case ActivitydiagramPackage.EANNOTATION__DETAILS:
				return details != null && !details.isEmpty();
			case ActivitydiagramPackage.EANNOTATION__EMODEL_ELEMENT:
				return getEModelElement() != null;
			case ActivitydiagramPackage.EANNOTATION__CONTENTS:
				return contents != null && !contents.isEmpty();
			case ActivitydiagramPackage.EANNOTATION__REFERENCES:
				return references != null && !references.isEmpty();
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
		result.append(" (source: ");
		result.append(source);
		result.append(')');
		return result.toString();
	}

} //EAnnotationImpl
