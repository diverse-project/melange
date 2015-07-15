/**
 */
package activitydiagram.impl;

import activitydiagram.ActivitydiagramPackage;
import activitydiagram.EAttribute;
import activitydiagram.EClass;
import activitydiagram.EGenericType;
import activitydiagram.EOperation;
import activitydiagram.EReference;
import activitydiagram.EStructuralFeature;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EClass</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link activitydiagram.impl.EClassImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link activitydiagram.impl.EClassImpl#isInterface <em>Interface</em>}</li>
 *   <li>{@link activitydiagram.impl.EClassImpl#getESuperTypes <em>ESuper Types</em>}</li>
 *   <li>{@link activitydiagram.impl.EClassImpl#getEOperations <em>EOperations</em>}</li>
 *   <li>{@link activitydiagram.impl.EClassImpl#getEAllAttributes <em>EAll Attributes</em>}</li>
 *   <li>{@link activitydiagram.impl.EClassImpl#getEAllReferences <em>EAll References</em>}</li>
 *   <li>{@link activitydiagram.impl.EClassImpl#getEReferences <em>EReferences</em>}</li>
 *   <li>{@link activitydiagram.impl.EClassImpl#getEAttributes <em>EAttributes</em>}</li>
 *   <li>{@link activitydiagram.impl.EClassImpl#getEAllContainments <em>EAll Containments</em>}</li>
 *   <li>{@link activitydiagram.impl.EClassImpl#getEAllOperations <em>EAll Operations</em>}</li>
 *   <li>{@link activitydiagram.impl.EClassImpl#getEAllStructuralFeatures <em>EAll Structural Features</em>}</li>
 *   <li>{@link activitydiagram.impl.EClassImpl#getEAllSuperTypes <em>EAll Super Types</em>}</li>
 *   <li>{@link activitydiagram.impl.EClassImpl#getEIDAttribute <em>EID Attribute</em>}</li>
 *   <li>{@link activitydiagram.impl.EClassImpl#getEStructuralFeatures <em>EStructural Features</em>}</li>
 *   <li>{@link activitydiagram.impl.EClassImpl#getEGenericSuperTypes <em>EGeneric Super Types</em>}</li>
 *   <li>{@link activitydiagram.impl.EClassImpl#getEAllGenericSuperTypes <em>EAll Generic Super Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EClassImpl extends EClassifierImpl implements EClass {
	/**
	 * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean abstract_ = ABSTRACT_EDEFAULT;

	/**
	 * The default value of the '{@link #isInterface() <em>Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInterface()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INTERFACE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInterface() <em>Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInterface()
	 * @generated
	 * @ordered
	 */
	protected boolean interface_ = INTERFACE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getESuperTypes() <em>ESuper Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getESuperTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<EClass> eSuperTypes;

	/**
	 * The cached value of the '{@link #getEOperations() <em>EOperations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<EOperation> eOperations;

	/**
	 * The cached value of the '{@link #getEStructuralFeatures() <em>EStructural Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEStructuralFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<EStructuralFeature> eStructuralFeatures;

	/**
	 * The cached value of the '{@link #getEGenericSuperTypes() <em>EGeneric Super Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEGenericSuperTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<EGenericType> eGenericSuperTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected org.eclipse.emf.ecore.EClass eStaticClass() {
		return ActivitydiagramPackage.Literals.ECLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAbstract() {
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstract(boolean newAbstract) {
		boolean oldAbstract = abstract_;
		abstract_ = newAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitydiagramPackage.ECLASS__ABSTRACT, oldAbstract, abstract_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInterface() {
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterface(boolean newInterface) {
		boolean oldInterface = interface_;
		interface_ = newInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitydiagramPackage.ECLASS__INTERFACE, oldInterface, interface_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EClass> getESuperTypes() {
		if (eSuperTypes == null) {
			eSuperTypes = new EObjectResolvingEList.Unsettable<EClass>(EClass.class, this, ActivitydiagramPackage.ECLASS__ESUPER_TYPES);
		}
		return eSuperTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetESuperTypes() {
		if (eSuperTypes != null) ((InternalEList.Unsettable<?>)eSuperTypes).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetESuperTypes() {
		return eSuperTypes != null && ((InternalEList.Unsettable<?>)eSuperTypes).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EOperation> getEOperations() {
		if (eOperations == null) {
			eOperations = new EObjectContainmentWithInverseEList<EOperation>(EOperation.class, this, ActivitydiagramPackage.ECLASS__EOPERATIONS, ActivitydiagramPackage.EOPERATION__ECONTAINING_CLASS);
		}
		return eOperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EAttribute> getEAllAttributes() {
		// TODO: implement this method to return the 'EAll Attributes' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EReference> getEAllReferences() {
		// TODO: implement this method to return the 'EAll References' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EReference> getEReferences() {
		// TODO: implement this method to return the 'EReferences' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EAttribute> getEAttributes() {
		// TODO: implement this method to return the 'EAttributes' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EReference> getEAllContainments() {
		// TODO: implement this method to return the 'EAll Containments' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EOperation> getEAllOperations() {
		// TODO: implement this method to return the 'EAll Operations' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EStructuralFeature> getEAllStructuralFeatures() {
		// TODO: implement this method to return the 'EAll Structural Features' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EClass> getEAllSuperTypes() {
		// TODO: implement this method to return the 'EAll Super Types' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEIDAttribute() {
		// TODO: implement this method to return the 'EID Attribute' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EStructuralFeature> getEStructuralFeatures() {
		if (eStructuralFeatures == null) {
			eStructuralFeatures = new EObjectContainmentWithInverseEList<EStructuralFeature>(EStructuralFeature.class, this, ActivitydiagramPackage.ECLASS__ESTRUCTURAL_FEATURES, ActivitydiagramPackage.ESTRUCTURAL_FEATURE__ECONTAINING_CLASS);
		}
		return eStructuralFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EGenericType> getEGenericSuperTypes() {
		if (eGenericSuperTypes == null) {
			eGenericSuperTypes = new EObjectContainmentEList.Unsettable<EGenericType>(EGenericType.class, this, ActivitydiagramPackage.ECLASS__EGENERIC_SUPER_TYPES);
		}
		return eGenericSuperTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEGenericSuperTypes() {
		if (eGenericSuperTypes != null) ((InternalEList.Unsettable<?>)eGenericSuperTypes).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEGenericSuperTypes() {
		return eGenericSuperTypes != null && ((InternalEList.Unsettable<?>)eGenericSuperTypes).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EGenericType> getEAllGenericSuperTypes() {
		// TODO: implement this method to return the 'EAll Generic Super Types' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSuperTypeOf(EClass someClass) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFeatureCount() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature getEStructuralFeature(int featureID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFeatureID(EStructuralFeature feature) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature getEStructuralFeature(String featureName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOperationCount() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEOperation(int operationID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOperationID(EOperation operation) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOverride(EOperation operation) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EGenericType getFeatureType(EStructuralFeature feature) {
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
			case ActivitydiagramPackage.ECLASS__EOPERATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEOperations()).basicAdd(otherEnd, msgs);
			case ActivitydiagramPackage.ECLASS__ESTRUCTURAL_FEATURES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEStructuralFeatures()).basicAdd(otherEnd, msgs);
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
			case ActivitydiagramPackage.ECLASS__EOPERATIONS:
				return ((InternalEList<?>)getEOperations()).basicRemove(otherEnd, msgs);
			case ActivitydiagramPackage.ECLASS__ESTRUCTURAL_FEATURES:
				return ((InternalEList<?>)getEStructuralFeatures()).basicRemove(otherEnd, msgs);
			case ActivitydiagramPackage.ECLASS__EGENERIC_SUPER_TYPES:
				return ((InternalEList<?>)getEGenericSuperTypes()).basicRemove(otherEnd, msgs);
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
			case ActivitydiagramPackage.ECLASS__ABSTRACT:
				return isAbstract();
			case ActivitydiagramPackage.ECLASS__INTERFACE:
				return isInterface();
			case ActivitydiagramPackage.ECLASS__ESUPER_TYPES:
				return getESuperTypes();
			case ActivitydiagramPackage.ECLASS__EOPERATIONS:
				return getEOperations();
			case ActivitydiagramPackage.ECLASS__EALL_ATTRIBUTES:
				return getEAllAttributes();
			case ActivitydiagramPackage.ECLASS__EALL_REFERENCES:
				return getEAllReferences();
			case ActivitydiagramPackage.ECLASS__EREFERENCES:
				return getEReferences();
			case ActivitydiagramPackage.ECLASS__EATTRIBUTES:
				return getEAttributes();
			case ActivitydiagramPackage.ECLASS__EALL_CONTAINMENTS:
				return getEAllContainments();
			case ActivitydiagramPackage.ECLASS__EALL_OPERATIONS:
				return getEAllOperations();
			case ActivitydiagramPackage.ECLASS__EALL_STRUCTURAL_FEATURES:
				return getEAllStructuralFeatures();
			case ActivitydiagramPackage.ECLASS__EALL_SUPER_TYPES:
				return getEAllSuperTypes();
			case ActivitydiagramPackage.ECLASS__EID_ATTRIBUTE:
				return getEIDAttribute();
			case ActivitydiagramPackage.ECLASS__ESTRUCTURAL_FEATURES:
				return getEStructuralFeatures();
			case ActivitydiagramPackage.ECLASS__EGENERIC_SUPER_TYPES:
				return getEGenericSuperTypes();
			case ActivitydiagramPackage.ECLASS__EALL_GENERIC_SUPER_TYPES:
				return getEAllGenericSuperTypes();
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
			case ActivitydiagramPackage.ECLASS__ABSTRACT:
				setAbstract((Boolean)newValue);
				return;
			case ActivitydiagramPackage.ECLASS__INTERFACE:
				setInterface((Boolean)newValue);
				return;
			case ActivitydiagramPackage.ECLASS__ESUPER_TYPES:
				getESuperTypes().clear();
				getESuperTypes().addAll((Collection<? extends EClass>)newValue);
				return;
			case ActivitydiagramPackage.ECLASS__EOPERATIONS:
				getEOperations().clear();
				getEOperations().addAll((Collection<? extends EOperation>)newValue);
				return;
			case ActivitydiagramPackage.ECLASS__ESTRUCTURAL_FEATURES:
				getEStructuralFeatures().clear();
				getEStructuralFeatures().addAll((Collection<? extends EStructuralFeature>)newValue);
				return;
			case ActivitydiagramPackage.ECLASS__EGENERIC_SUPER_TYPES:
				getEGenericSuperTypes().clear();
				getEGenericSuperTypes().addAll((Collection<? extends EGenericType>)newValue);
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
			case ActivitydiagramPackage.ECLASS__ABSTRACT:
				setAbstract(ABSTRACT_EDEFAULT);
				return;
			case ActivitydiagramPackage.ECLASS__INTERFACE:
				setInterface(INTERFACE_EDEFAULT);
				return;
			case ActivitydiagramPackage.ECLASS__ESUPER_TYPES:
				unsetESuperTypes();
				return;
			case ActivitydiagramPackage.ECLASS__EOPERATIONS:
				getEOperations().clear();
				return;
			case ActivitydiagramPackage.ECLASS__ESTRUCTURAL_FEATURES:
				getEStructuralFeatures().clear();
				return;
			case ActivitydiagramPackage.ECLASS__EGENERIC_SUPER_TYPES:
				unsetEGenericSuperTypes();
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
			case ActivitydiagramPackage.ECLASS__ABSTRACT:
				return abstract_ != ABSTRACT_EDEFAULT;
			case ActivitydiagramPackage.ECLASS__INTERFACE:
				return interface_ != INTERFACE_EDEFAULT;
			case ActivitydiagramPackage.ECLASS__ESUPER_TYPES:
				return isSetESuperTypes();
			case ActivitydiagramPackage.ECLASS__EOPERATIONS:
				return eOperations != null && !eOperations.isEmpty();
			case ActivitydiagramPackage.ECLASS__EALL_ATTRIBUTES:
				return !getEAllAttributes().isEmpty();
			case ActivitydiagramPackage.ECLASS__EALL_REFERENCES:
				return !getEAllReferences().isEmpty();
			case ActivitydiagramPackage.ECLASS__EREFERENCES:
				return !getEReferences().isEmpty();
			case ActivitydiagramPackage.ECLASS__EATTRIBUTES:
				return !getEAttributes().isEmpty();
			case ActivitydiagramPackage.ECLASS__EALL_CONTAINMENTS:
				return !getEAllContainments().isEmpty();
			case ActivitydiagramPackage.ECLASS__EALL_OPERATIONS:
				return !getEAllOperations().isEmpty();
			case ActivitydiagramPackage.ECLASS__EALL_STRUCTURAL_FEATURES:
				return !getEAllStructuralFeatures().isEmpty();
			case ActivitydiagramPackage.ECLASS__EALL_SUPER_TYPES:
				return !getEAllSuperTypes().isEmpty();
			case ActivitydiagramPackage.ECLASS__EID_ATTRIBUTE:
				return getEIDAttribute() != null;
			case ActivitydiagramPackage.ECLASS__ESTRUCTURAL_FEATURES:
				return eStructuralFeatures != null && !eStructuralFeatures.isEmpty();
			case ActivitydiagramPackage.ECLASS__EGENERIC_SUPER_TYPES:
				return isSetEGenericSuperTypes();
			case ActivitydiagramPackage.ECLASS__EALL_GENERIC_SUPER_TYPES:
				return !getEAllGenericSuperTypes().isEmpty();
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
		result.append(" (abstract: ");
		result.append(abstract_);
		result.append(", interface: ");
		result.append(interface_);
		result.append(')');
		return result.toString();
	}

} //EClassImpl
