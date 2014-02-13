/**
 */
package fr.inria.diverse.k3.sle.metamodel.k3sle.impl;

import fr.inria.diverse.k3.sle.metamodel.k3sle.EcoreImport;
import fr.inria.diverse.k3.sle.metamodel.k3sle.K3slePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ecore Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.diverse.k3.sle.metamodel.k3sle.impl.EcoreImportImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link fr.inria.diverse.k3.sle.metamodel.k3sle.impl.EcoreImportImpl#getGenmodelUri <em>Genmodel Uri</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EcoreImportImpl extends MinimalEObjectImpl.Container implements EcoreImport {
	/**
	 * The default value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected String uri = URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getGenmodelUri() <em>Genmodel Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenmodelUri()
	 * @generated
	 * @ordered
	 */
	protected static final String GENMODEL_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGenmodelUri() <em>Genmodel Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenmodelUri()
	 * @generated
	 * @ordered
	 */
	protected String genmodelUri = GENMODEL_URI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EcoreImportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return K3slePackage.Literals.ECORE_IMPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUri() {
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUri(String newUri) {
		String oldUri = uri;
		uri = newUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K3slePackage.ECORE_IMPORT__URI, oldUri, uri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGenmodelUri() {
		return genmodelUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenmodelUri(String newGenmodelUri) {
		String oldGenmodelUri = genmodelUri;
		genmodelUri = newGenmodelUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K3slePackage.ECORE_IMPORT__GENMODEL_URI, oldGenmodelUri, genmodelUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case K3slePackage.ECORE_IMPORT__URI:
				return getUri();
			case K3slePackage.ECORE_IMPORT__GENMODEL_URI:
				return getGenmodelUri();
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
			case K3slePackage.ECORE_IMPORT__URI:
				setUri((String)newValue);
				return;
			case K3slePackage.ECORE_IMPORT__GENMODEL_URI:
				setGenmodelUri((String)newValue);
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
			case K3slePackage.ECORE_IMPORT__URI:
				setUri(URI_EDEFAULT);
				return;
			case K3slePackage.ECORE_IMPORT__GENMODEL_URI:
				setGenmodelUri(GENMODEL_URI_EDEFAULT);
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
			case K3slePackage.ECORE_IMPORT__URI:
				return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
			case K3slePackage.ECORE_IMPORT__GENMODEL_URI:
				return GENMODEL_URI_EDEFAULT == null ? genmodelUri != null : !GENMODEL_URI_EDEFAULT.equals(genmodelUri);
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
		result.append(" (uri: ");
		result.append(uri);
		result.append(", genmodelUri: ");
		result.append(genmodelUri);
		result.append(')');
		return result.toString();
	}

} //EcoreImportImpl
