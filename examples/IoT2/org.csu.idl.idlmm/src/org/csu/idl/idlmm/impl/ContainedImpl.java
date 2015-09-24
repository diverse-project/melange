/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.csu.idl.idlmm.impl;

import org.csu.idl.idlmm.Contained;
import org.csu.idl.idlmm.Container;
import org.csu.idl.idlmm.IdlmmPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contained</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csu.idl.idlmm.impl.ContainedImpl#getRepositoryId <em>Repository Id</em>}</li>
 *   <li>{@link org.csu.idl.idlmm.impl.ContainedImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.csu.idl.idlmm.impl.ContainedImpl#getAbsoluteName <em>Absolute Name</em>}</li>
 *   <li>{@link org.csu.idl.idlmm.impl.ContainedImpl#getDefinedIn <em>Defined In</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ContainedImpl extends NamedElementImpl implements Contained {
	/**
	 * The default value of the '{@link #getRepositoryId() <em>Repository Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepositoryId()
	 * @generated
	 * @ordered
	 */
	protected static final String REPOSITORY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRepositoryId() <em>Repository Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepositoryId()
	 * @generated
	 * @ordered
	 */
	protected String repositoryId = REPOSITORY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getAbsoluteName() <em>Absolute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbsoluteName()
	 * @generated
	 * @ordered
	 */
	protected static final String ABSOLUTE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAbsoluteName() <em>Absolute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbsoluteName()
	 * @generated
	 * @ordered
	 */
	protected String absoluteName = ABSOLUTE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IdlmmPackage.Literals.CONTAINED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRepositoryId() {
		return repositoryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepositoryId(String newRepositoryId) {
		String oldRepositoryId = repositoryId;
		repositoryId = newRepositoryId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdlmmPackage.CONTAINED__REPOSITORY_ID, oldRepositoryId, repositoryId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdlmmPackage.CONTAINED__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAbsoluteName() {
		return absoluteName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbsoluteName(String newAbsoluteName) {
		String oldAbsoluteName = absoluteName;
		absoluteName = newAbsoluteName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdlmmPackage.CONTAINED__ABSOLUTE_NAME, oldAbsoluteName, absoluteName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Container getDefinedIn() {
		if (eContainerFeatureID() != IdlmmPackage.CONTAINED__DEFINED_IN) return null;
		return (Container)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinedIn(Container newDefinedIn, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDefinedIn, IdlmmPackage.CONTAINED__DEFINED_IN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinedIn(Container newDefinedIn) {
		if (newDefinedIn != eInternalContainer() || (eContainerFeatureID() != IdlmmPackage.CONTAINED__DEFINED_IN && newDefinedIn != null)) {
			if (EcoreUtil.isAncestor(this, newDefinedIn))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDefinedIn != null)
				msgs = ((InternalEObject)newDefinedIn).eInverseAdd(this, IdlmmPackage.CONTAINER__CONTAINS, Container.class, msgs);
			msgs = basicSetDefinedIn(newDefinedIn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdlmmPackage.CONTAINED__DEFINED_IN, newDefinedIn, newDefinedIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IdlmmPackage.CONTAINED__DEFINED_IN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDefinedIn((Container)otherEnd, msgs);
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
			case IdlmmPackage.CONTAINED__DEFINED_IN:
				return basicSetDefinedIn(null, msgs);
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
			case IdlmmPackage.CONTAINED__DEFINED_IN:
				return eInternalContainer().eInverseRemove(this, IdlmmPackage.CONTAINER__CONTAINS, Container.class, msgs);
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
			case IdlmmPackage.CONTAINED__REPOSITORY_ID:
				return getRepositoryId();
			case IdlmmPackage.CONTAINED__VERSION:
				return getVersion();
			case IdlmmPackage.CONTAINED__ABSOLUTE_NAME:
				return getAbsoluteName();
			case IdlmmPackage.CONTAINED__DEFINED_IN:
				return getDefinedIn();
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
			case IdlmmPackage.CONTAINED__REPOSITORY_ID:
				setRepositoryId((String)newValue);
				return;
			case IdlmmPackage.CONTAINED__VERSION:
				setVersion((String)newValue);
				return;
			case IdlmmPackage.CONTAINED__ABSOLUTE_NAME:
				setAbsoluteName((String)newValue);
				return;
			case IdlmmPackage.CONTAINED__DEFINED_IN:
				setDefinedIn((Container)newValue);
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
			case IdlmmPackage.CONTAINED__REPOSITORY_ID:
				setRepositoryId(REPOSITORY_ID_EDEFAULT);
				return;
			case IdlmmPackage.CONTAINED__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case IdlmmPackage.CONTAINED__ABSOLUTE_NAME:
				setAbsoluteName(ABSOLUTE_NAME_EDEFAULT);
				return;
			case IdlmmPackage.CONTAINED__DEFINED_IN:
				setDefinedIn((Container)null);
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
			case IdlmmPackage.CONTAINED__REPOSITORY_ID:
				return REPOSITORY_ID_EDEFAULT == null ? repositoryId != null : !REPOSITORY_ID_EDEFAULT.equals(repositoryId);
			case IdlmmPackage.CONTAINED__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case IdlmmPackage.CONTAINED__ABSOLUTE_NAME:
				return ABSOLUTE_NAME_EDEFAULT == null ? absoluteName != null : !ABSOLUTE_NAME_EDEFAULT.equals(absoluteName);
			case IdlmmPackage.CONTAINED__DEFINED_IN:
				return getDefinedIn() != null;
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
		result.append(" (repositoryId: ");
		result.append(repositoryId);
		result.append(", version: ");
		result.append(version);
		result.append(", absoluteName: ");
		result.append(absoluteName);
		result.append(')');
		return result.toString();
	}

} //ContainedImpl
