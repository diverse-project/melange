/**
 */
package activitydiagram.impl;

import activitydiagram.EObject;
import activitydiagram.EOperation;
import activitydiagram.EReference;
import activitydiagram.EStructuralFeature;
import activitydiagram.EcorePackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.resource.Resource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EObject</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EObjectImpl extends MinimalEObjectImpl.Container implements EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcorePackage.Literals.EOBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
//	public activitydiagram.EClass eClass() {
//		// TODO: implement this method
//		// Ensure that you remove @generated or mark it @generated NOT
//		throw new UnsupportedOperationException();
//	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsProxy() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource eResource() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject eContainer() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
//	public EStructuralFeature eContainingFeature() {
//		// TODO: implement this method
//		// Ensure that you remove @generated or mark it @generated NOT
//		throw new UnsupportedOperationException();
//	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
//	public EReference eContainmentFeature() {
//		// TODO: implement this method
//		// Ensure that you remove @generated or mark it @generated NOT
//		throw new UnsupportedOperationException();
//	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
//	public EList<EObject> eContents() {
//		// TODO: implement this method
//		// Ensure that you remove @generated or mark it @generated NOT
//		throw new UnsupportedOperationException();
//	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
//	public TreeIterator<EObject> eAllContents() {
//		// TODO: implement this method
//		// Ensure that you remove @generated or mark it @generated NOT
//		throw new UnsupportedOperationException();
//	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
//	public EList<EObject> eCrossReferences() {
//		// TODO: implement this method
//		// Ensure that you remove @generated or mark it @generated NOT
//		throw new UnsupportedOperationException();
//	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature feature) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature feature, boolean resolve) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(EStructuralFeature feature, Object newValue) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(EStructuralFeature feature) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(EStructuralFeature feature) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eInvoke(EOperation operation, EList<?> arguments) throws InvocationTargetException {
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case EcorePackage.EOBJECT___ECLASS:
				return eClass();
			case EcorePackage.EOBJECT___EIS_PROXY:
				return eIsProxy();
			case EcorePackage.EOBJECT___ERESOURCE:
				return eResource();
			case EcorePackage.EOBJECT___ECONTAINER:
				return eContainer();
			case EcorePackage.EOBJECT___ECONTAINING_FEATURE:
				return eContainingFeature();
			case EcorePackage.EOBJECT___ECONTAINMENT_FEATURE:
				return eContainmentFeature();
			case EcorePackage.EOBJECT___ECONTENTS:
				return eContents();
			case EcorePackage.EOBJECT___EALL_CONTENTS:
				return eAllContents();
			case EcorePackage.EOBJECT___ECROSS_REFERENCES:
				return eCrossReferences();
			case EcorePackage.EOBJECT___EGET__ESTRUCTURALFEATURE:
				return eGet((EStructuralFeature)arguments.get(0));
			case EcorePackage.EOBJECT___EGET__ESTRUCTURALFEATURE_BOOLEAN:
				return eGet((EStructuralFeature)arguments.get(0), (Boolean)arguments.get(1));
			case EcorePackage.EOBJECT___ESET__ESTRUCTURALFEATURE_OBJECT:
				eSet((EStructuralFeature)arguments.get(0), arguments.get(1));
				return null;
			case EcorePackage.EOBJECT___EIS_SET__ESTRUCTURALFEATURE:
				return eIsSet((EStructuralFeature)arguments.get(0));
			case EcorePackage.EOBJECT___EUNSET__ESTRUCTURALFEATURE:
				eUnset((EStructuralFeature)arguments.get(0));
				return null;
			case EcorePackage.EOBJECT___EINVOKE__EOPERATION_ELIST:
				try {
					return eInvoke((EOperation)arguments.get(0), (EList<?>)arguments.get(1));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
		}
		return super.eInvoke(operationID, arguments);
	}

} //EObjectImpl
