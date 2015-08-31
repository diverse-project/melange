/**
 */
package activitydiagram.impl;

import activitydiagram.ActivitydiagramPackage;
import activitydiagram.EClassifier;
import activitydiagram.EPackage;
import activitydiagram.ETypeParameter;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EClassifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link activitydiagram.impl.EClassifierImpl#getInstanceClassName <em>Instance Class Name</em>}</li>
 *   <li>{@link activitydiagram.impl.EClassifierImpl#getInstanceClass <em>Instance Class</em>}</li>
 *   <li>{@link activitydiagram.impl.EClassifierImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link activitydiagram.impl.EClassifierImpl#getInstanceTypeName <em>Instance Type Name</em>}</li>
 *   <li>{@link activitydiagram.impl.EClassifierImpl#getEPackage <em>EPackage</em>}</li>
 *   <li>{@link activitydiagram.impl.EClassifierImpl#getETypeParameters <em>EType Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class EClassifierImpl extends ENamedElementImpl implements EClassifier {
	/**
	 * The default value of the '{@link #getInstanceClassName() <em>Instance Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTANCE_CLASS_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected static final Object DEFAULT_VALUE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getInstanceTypeName() <em>Instance Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTANCE_TYPE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getETypeParameters() <em>EType Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getETypeParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<ETypeParameter> eTypeParameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClassifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitydiagramPackage.eINSTANCE.getEClassifier();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstanceClassName() {
		// TODO: implement this method to return the 'Instance Class Name' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceClassName(String newInstanceClassName) {
		// TODO: implement this method to set the 'Instance Class Name' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInstanceClassName() {
		// TODO: implement this method to unset the 'Instance Class Name' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInstanceClassName() {
		// TODO: implement this method to return whether the 'Instance Class Name' attribute is set
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Class<?> getInstanceClass() {
		// TODO: implement this method to return the 'Instance Class' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getDefaultValue() {
		// TODO: implement this method to return the 'Default Value' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstanceTypeName() {
		// TODO: implement this method to return the 'Instance Type Name' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceTypeName(String newInstanceTypeName) {
		// TODO: implement this method to set the 'Instance Type Name' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInstanceTypeName() {
		// TODO: implement this method to unset the 'Instance Type Name' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInstanceTypeName() {
		// TODO: implement this method to return whether the 'Instance Type Name' attribute is set
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPackage getEPackage() {
		if (eContainerFeatureID() != ActivitydiagramPackage.ECLASSIFIER__EPACKAGE) return null;
		return (EPackage)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ETypeParameter> getETypeParameters() {
		if (eTypeParameters == null) {
			eTypeParameters = new EObjectContainmentEList<ETypeParameter>(ETypeParameter.class, this, ActivitydiagramPackage.ECLASSIFIER__ETYPE_PARAMETERS);
		}
		return eTypeParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInstance(Object object) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getClassifierID() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActivitydiagramPackage.ECLASSIFIER__EPACKAGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, ActivitydiagramPackage.ECLASSIFIER__EPACKAGE, msgs);
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
			case ActivitydiagramPackage.ECLASSIFIER__EPACKAGE:
				return eBasicSetContainer(null, ActivitydiagramPackage.ECLASSIFIER__EPACKAGE, msgs);
			case ActivitydiagramPackage.ECLASSIFIER__ETYPE_PARAMETERS:
				return ((InternalEList<?>)getETypeParameters()).basicRemove(otherEnd, msgs);
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
			case ActivitydiagramPackage.ECLASSIFIER__EPACKAGE:
				return eInternalContainer().eInverseRemove(this, ActivitydiagramPackage.EPACKAGE__ECLASSIFIERS, EPackage.class, msgs);
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
			case ActivitydiagramPackage.ECLASSIFIER__INSTANCE_CLASS_NAME:
				return getInstanceClassName();
			case ActivitydiagramPackage.ECLASSIFIER__INSTANCE_CLASS:
				return getInstanceClass();
			case ActivitydiagramPackage.ECLASSIFIER__DEFAULT_VALUE:
				return getDefaultValue();
			case ActivitydiagramPackage.ECLASSIFIER__INSTANCE_TYPE_NAME:
				return getInstanceTypeName();
			case ActivitydiagramPackage.ECLASSIFIER__EPACKAGE:
				return getEPackage();
			case ActivitydiagramPackage.ECLASSIFIER__ETYPE_PARAMETERS:
				return getETypeParameters();
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
			case ActivitydiagramPackage.ECLASSIFIER__INSTANCE_CLASS_NAME:
				setInstanceClassName((String)newValue);
				return;
			case ActivitydiagramPackage.ECLASSIFIER__INSTANCE_TYPE_NAME:
				setInstanceTypeName((String)newValue);
				return;
			case ActivitydiagramPackage.ECLASSIFIER__ETYPE_PARAMETERS:
				getETypeParameters().clear();
				getETypeParameters().addAll((Collection<? extends ETypeParameter>)newValue);
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
			case ActivitydiagramPackage.ECLASSIFIER__INSTANCE_CLASS_NAME:
				unsetInstanceClassName();
				return;
			case ActivitydiagramPackage.ECLASSIFIER__INSTANCE_TYPE_NAME:
				unsetInstanceTypeName();
				return;
			case ActivitydiagramPackage.ECLASSIFIER__ETYPE_PARAMETERS:
				getETypeParameters().clear();
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
			case ActivitydiagramPackage.ECLASSIFIER__INSTANCE_CLASS_NAME:
				return isSetInstanceClassName();
			case ActivitydiagramPackage.ECLASSIFIER__INSTANCE_CLASS:
				return getInstanceClass() != null;
			case ActivitydiagramPackage.ECLASSIFIER__DEFAULT_VALUE:
				return DEFAULT_VALUE_EDEFAULT == null ? getDefaultValue() != null : !DEFAULT_VALUE_EDEFAULT.equals(getDefaultValue());
			case ActivitydiagramPackage.ECLASSIFIER__INSTANCE_TYPE_NAME:
				return isSetInstanceTypeName();
			case ActivitydiagramPackage.ECLASSIFIER__EPACKAGE:
				return getEPackage() != null;
			case ActivitydiagramPackage.ECLASSIFIER__ETYPE_PARAMETERS:
				return eTypeParameters != null && !eTypeParameters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EClassifierImpl
