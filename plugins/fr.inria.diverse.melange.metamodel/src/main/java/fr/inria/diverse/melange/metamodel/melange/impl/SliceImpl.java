/**
 */
package fr.inria.diverse.melange.metamodel.melange.impl;

import fr.inria.diverse.melange.metamodel.melange.Language;
import fr.inria.diverse.melange.metamodel.melange.MelangePackage;
import fr.inria.diverse.melange.metamodel.melange.PackageBinding;
import fr.inria.diverse.melange.metamodel.melange.Slice;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Slice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.impl.SliceImpl#getSlicedLanguage <em>Sliced Language</em>}</li>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.impl.SliceImpl#getMappingRules <em>Mapping Rules</em>}</li>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.impl.SliceImpl#getRoots <em>Roots</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SliceImpl extends OperatorImpl implements Slice {
	/**
	 * The cached value of the '{@link #getSlicedLanguage() <em>Sliced Language</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlicedLanguage()
	 * @generated
	 * @ordered
	 */
	protected Language slicedLanguage;

	/**
	 * The cached value of the '{@link #getMappingRules() <em>Mapping Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappingRules()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageBinding> mappingRules;

	/**
	 * The cached value of the '{@link #getRoots() <em>Roots</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoots()
	 * @generated
	 * @ordered
	 */
	protected EList<EClass> roots;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SliceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MelangePackage.Literals.SLICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Language getSlicedLanguage() {
		if (slicedLanguage != null && slicedLanguage.eIsProxy()) {
			InternalEObject oldSlicedLanguage = (InternalEObject)slicedLanguage;
			slicedLanguage = (Language)eResolveProxy(oldSlicedLanguage);
			if (slicedLanguage != oldSlicedLanguage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MelangePackage.SLICE__SLICED_LANGUAGE, oldSlicedLanguage, slicedLanguage));
			}
		}
		return slicedLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Language basicGetSlicedLanguage() {
		return slicedLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlicedLanguage(Language newSlicedLanguage) {
		Language oldSlicedLanguage = slicedLanguage;
		slicedLanguage = newSlicedLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MelangePackage.SLICE__SLICED_LANGUAGE, oldSlicedLanguage, slicedLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageBinding> getMappingRules() {
		if (mappingRules == null) {
			mappingRules = new EObjectContainmentEList<PackageBinding>(PackageBinding.class, this, MelangePackage.SLICE__MAPPING_RULES);
		}
		return mappingRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EClass> getRoots() {
		if (roots == null) {
			roots = new EObjectResolvingEList<EClass>(EClass.class, this, MelangePackage.SLICE__ROOTS);
		}
		return roots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MelangePackage.SLICE__MAPPING_RULES:
				return ((InternalEList<?>)getMappingRules()).basicRemove(otherEnd, msgs);
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
			case MelangePackage.SLICE__SLICED_LANGUAGE:
				if (resolve) return getSlicedLanguage();
				return basicGetSlicedLanguage();
			case MelangePackage.SLICE__MAPPING_RULES:
				return getMappingRules();
			case MelangePackage.SLICE__ROOTS:
				return getRoots();
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
			case MelangePackage.SLICE__SLICED_LANGUAGE:
				setSlicedLanguage((Language)newValue);
				return;
			case MelangePackage.SLICE__MAPPING_RULES:
				getMappingRules().clear();
				getMappingRules().addAll((Collection<? extends PackageBinding>)newValue);
				return;
			case MelangePackage.SLICE__ROOTS:
				getRoots().clear();
				getRoots().addAll((Collection<? extends EClass>)newValue);
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
			case MelangePackage.SLICE__SLICED_LANGUAGE:
				setSlicedLanguage((Language)null);
				return;
			case MelangePackage.SLICE__MAPPING_RULES:
				getMappingRules().clear();
				return;
			case MelangePackage.SLICE__ROOTS:
				getRoots().clear();
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
			case MelangePackage.SLICE__SLICED_LANGUAGE:
				return slicedLanguage != null;
			case MelangePackage.SLICE__MAPPING_RULES:
				return mappingRules != null && !mappingRules.isEmpty();
			case MelangePackage.SLICE__ROOTS:
				return roots != null && !roots.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SliceImpl
