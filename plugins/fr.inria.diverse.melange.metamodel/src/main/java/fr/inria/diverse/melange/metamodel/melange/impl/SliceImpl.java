/**
 */
package fr.inria.diverse.melange.metamodel.melange.impl;

import fr.inria.diverse.melange.metamodel.melange.MelangePackage;
import fr.inria.diverse.melange.metamodel.melange.PackageBinding;
import fr.inria.diverse.melange.metamodel.melange.Slice;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Slice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.impl.SliceImpl#getRoots <em>Roots</em>}</li>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.impl.SliceImpl#getMappingRules <em>Mapping Rules</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SliceImpl extends LanguageOperatorImpl implements Slice {
	/**
	 * The cached value of the '{@link #getRoots() <em>Roots</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoots()
	 * @generated
	 * @ordered
	 */
	protected EList<String> roots;

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
	public EList<String> getRoots() {
		if (roots == null) {
			roots = new EDataTypeUniqueEList<String>(String.class, this, MelangePackage.SLICE__ROOTS);
		}
		return roots;
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
			case MelangePackage.SLICE__ROOTS:
				return getRoots();
			case MelangePackage.SLICE__MAPPING_RULES:
				return getMappingRules();
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
			case MelangePackage.SLICE__ROOTS:
				getRoots().clear();
				getRoots().addAll((Collection<? extends String>)newValue);
				return;
			case MelangePackage.SLICE__MAPPING_RULES:
				getMappingRules().clear();
				getMappingRules().addAll((Collection<? extends PackageBinding>)newValue);
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
			case MelangePackage.SLICE__ROOTS:
				getRoots().clear();
				return;
			case MelangePackage.SLICE__MAPPING_RULES:
				getMappingRules().clear();
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
			case MelangePackage.SLICE__ROOTS:
				return roots != null && !roots.isEmpty();
			case MelangePackage.SLICE__MAPPING_RULES:
				return mappingRules != null && !mappingRules.isEmpty();
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
		result.append(" (roots: ");
		result.append(roots);
		result.append(')');
		return result.toString();
	}

} //SliceImpl
