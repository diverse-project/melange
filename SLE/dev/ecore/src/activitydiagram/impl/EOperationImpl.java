/**
 */
package activitydiagram.impl;

import activitydiagram.EClassifier;
import activitydiagram.EGenericType;
import activitydiagram.EOperation;
import activitydiagram.EParameter;
import activitydiagram.ETypeParameter;
import activitydiagram.EcorePackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EOperation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link activitydiagram.impl.EOperationImpl#getEContainingClass <em>EContaining Class</em>}</li>
 *   <li>{@link activitydiagram.impl.EOperationImpl#getETypeParameters <em>EType Parameters</em>}</li>
 *   <li>{@link activitydiagram.impl.EOperationImpl#getEParameters <em>EParameters</em>}</li>
 *   <li>{@link activitydiagram.impl.EOperationImpl#getEExceptions <em>EExceptions</em>}</li>
 *   <li>{@link activitydiagram.impl.EOperationImpl#getEGenericExceptions <em>EGeneric Exceptions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EOperationImpl extends ETypedElementImpl implements EOperation {
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
	 * The cached value of the '{@link #getEParameters() <em>EParameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<EParameter> eParameters;

	/**
	 * The cached value of the '{@link #getEExceptions() <em>EExceptions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEExceptions()
	 * @generated
	 * @ordered
	 */
	protected EList<EClassifier> eExceptions;

	/**
	 * The cached value of the '{@link #getEGenericExceptions() <em>EGeneric Exceptions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEGenericExceptions()
	 * @generated
	 * @ordered
	 */
	protected EList<EGenericType> eGenericExceptions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcorePackage.Literals.EOPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public activitydiagram.EClass getEContainingClass() {
		if (eContainerFeatureID() != EcorePackage.EOPERATION__ECONTAINING_CLASS) return null;
		return (activitydiagram.EClass)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ETypeParameter> getETypeParameters() {
		if (eTypeParameters == null) {
			eTypeParameters = new EObjectContainmentEList<ETypeParameter>(ETypeParameter.class, this, EcorePackage.EOPERATION__ETYPE_PARAMETERS);
		}
		return eTypeParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EParameter> getEParameters() {
		if (eParameters == null) {
			eParameters = new EObjectContainmentWithInverseEList<EParameter>(EParameter.class, this, EcorePackage.EOPERATION__EPARAMETERS, EcorePackage.EPARAMETER__EOPERATION);
		}
		return eParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EClassifier> getEExceptions() {
		if (eExceptions == null) {
			eExceptions = new EObjectResolvingEList.Unsettable<EClassifier>(EClassifier.class, this, EcorePackage.EOPERATION__EEXCEPTIONS);
		}
		return eExceptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEExceptions() {
		if (eExceptions != null) ((InternalEList.Unsettable<?>)eExceptions).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEExceptions() {
		return eExceptions != null && ((InternalEList.Unsettable<?>)eExceptions).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EGenericType> getEGenericExceptions() {
		if (eGenericExceptions == null) {
			eGenericExceptions = new EObjectContainmentEList.Unsettable<EGenericType>(EGenericType.class, this, EcorePackage.EOPERATION__EGENERIC_EXCEPTIONS);
		}
		return eGenericExceptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEGenericExceptions() {
		if (eGenericExceptions != null) ((InternalEList.Unsettable<?>)eGenericExceptions).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEGenericExceptions() {
		return eGenericExceptions != null && ((InternalEList.Unsettable<?>)eGenericExceptions).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOperationID() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOverrideOf(EOperation someOperation) {
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
			case EcorePackage.EOPERATION__ECONTAINING_CLASS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, EcorePackage.EOPERATION__ECONTAINING_CLASS, msgs);
			case EcorePackage.EOPERATION__EPARAMETERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEParameters()).basicAdd(otherEnd, msgs);
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
			case EcorePackage.EOPERATION__ECONTAINING_CLASS:
				return eBasicSetContainer(null, EcorePackage.EOPERATION__ECONTAINING_CLASS, msgs);
			case EcorePackage.EOPERATION__ETYPE_PARAMETERS:
				return ((InternalEList<?>)getETypeParameters()).basicRemove(otherEnd, msgs);
			case EcorePackage.EOPERATION__EPARAMETERS:
				return ((InternalEList<?>)getEParameters()).basicRemove(otherEnd, msgs);
			case EcorePackage.EOPERATION__EGENERIC_EXCEPTIONS:
				return ((InternalEList<?>)getEGenericExceptions()).basicRemove(otherEnd, msgs);
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
			case EcorePackage.EOPERATION__ECONTAINING_CLASS:
				return eInternalContainer().eInverseRemove(this, EcorePackage.ECLASS__EOPERATIONS, activitydiagram.EClass.class, msgs);
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
			case EcorePackage.EOPERATION__ECONTAINING_CLASS:
				return getEContainingClass();
			case EcorePackage.EOPERATION__ETYPE_PARAMETERS:
				return getETypeParameters();
			case EcorePackage.EOPERATION__EPARAMETERS:
				return getEParameters();
			case EcorePackage.EOPERATION__EEXCEPTIONS:
				return getEExceptions();
			case EcorePackage.EOPERATION__EGENERIC_EXCEPTIONS:
				return getEGenericExceptions();
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
			case EcorePackage.EOPERATION__ETYPE_PARAMETERS:
				getETypeParameters().clear();
				getETypeParameters().addAll((Collection<? extends ETypeParameter>)newValue);
				return;
			case EcorePackage.EOPERATION__EPARAMETERS:
				getEParameters().clear();
				getEParameters().addAll((Collection<? extends EParameter>)newValue);
				return;
			case EcorePackage.EOPERATION__EEXCEPTIONS:
				getEExceptions().clear();
				getEExceptions().addAll((Collection<? extends EClassifier>)newValue);
				return;
			case EcorePackage.EOPERATION__EGENERIC_EXCEPTIONS:
				getEGenericExceptions().clear();
				getEGenericExceptions().addAll((Collection<? extends EGenericType>)newValue);
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
			case EcorePackage.EOPERATION__ETYPE_PARAMETERS:
				getETypeParameters().clear();
				return;
			case EcorePackage.EOPERATION__EPARAMETERS:
				getEParameters().clear();
				return;
			case EcorePackage.EOPERATION__EEXCEPTIONS:
				unsetEExceptions();
				return;
			case EcorePackage.EOPERATION__EGENERIC_EXCEPTIONS:
				unsetEGenericExceptions();
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
			case EcorePackage.EOPERATION__ECONTAINING_CLASS:
				return getEContainingClass() != null;
			case EcorePackage.EOPERATION__ETYPE_PARAMETERS:
				return eTypeParameters != null && !eTypeParameters.isEmpty();
			case EcorePackage.EOPERATION__EPARAMETERS:
				return eParameters != null && !eParameters.isEmpty();
			case EcorePackage.EOPERATION__EEXCEPTIONS:
				return isSetEExceptions();
			case EcorePackage.EOPERATION__EGENERIC_EXCEPTIONS:
				return isSetEGenericExceptions();
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
			case EcorePackage.EOPERATION___GET_OPERATION_ID:
				return getOperationID();
			case EcorePackage.EOPERATION___IS_OVERRIDE_OF__EOPERATION:
				return isOverrideOf((EOperation)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //EOperationImpl
