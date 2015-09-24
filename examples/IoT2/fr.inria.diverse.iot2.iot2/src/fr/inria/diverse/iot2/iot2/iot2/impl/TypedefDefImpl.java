/**
 */
package fr.inria.diverse.iot2.iot2.iot2.impl;

import fr.inria.diverse.iot2.iot2.iot2.Contained;
import fr.inria.diverse.iot2.iot2.iot2.Container;
import fr.inria.diverse.iot2.iot2.iot2.Iot2Package;
import fr.inria.diverse.iot2.iot2.iot2.NamedElement;
import fr.inria.diverse.iot2.iot2.iot2.TypedefDef;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Typedef Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.iot2.iot2.iot2.impl.TypedefDefImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link fr.inria.diverse.iot2.iot2.iot2.impl.TypedefDefImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.inria.diverse.iot2.iot2.iot2.impl.TypedefDefImpl#getRepositoryId <em>Repository Id</em>}</li>
 *   <li>{@link fr.inria.diverse.iot2.iot2.iot2.impl.TypedefDefImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link fr.inria.diverse.iot2.iot2.iot2.impl.TypedefDefImpl#getAbsoluteName <em>Absolute Name</em>}</li>
 *   <li>{@link fr.inria.diverse.iot2.iot2.iot2.impl.TypedefDefImpl#getDefinedIn <em>Defined In</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TypedefDefImpl extends IDLTypeImpl implements TypedefDef {
	/**
	 * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String identifier = IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	protected TypedefDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Iot2Package.Literals.TYPEDEF_DEF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(String newIdentifier) {
		String oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iot2Package.TYPEDEF_DEF__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iot2Package.TYPEDEF_DEF__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Iot2Package.TYPEDEF_DEF__REPOSITORY_ID, oldRepositoryId, repositoryId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Iot2Package.TYPEDEF_DEF__VERSION, oldVersion, version));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Iot2Package.TYPEDEF_DEF__ABSOLUTE_NAME, oldAbsoluteName, absoluteName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Container getDefinedIn() {
		if (eContainerFeatureID() != Iot2Package.TYPEDEF_DEF__DEFINED_IN) return null;
		return (Container)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinedIn(Container newDefinedIn, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDefinedIn, Iot2Package.TYPEDEF_DEF__DEFINED_IN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinedIn(Container newDefinedIn) {
		if (newDefinedIn != eInternalContainer() || (eContainerFeatureID() != Iot2Package.TYPEDEF_DEF__DEFINED_IN && newDefinedIn != null)) {
			if (EcoreUtil.isAncestor(this, newDefinedIn))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDefinedIn != null)
				msgs = ((InternalEObject)newDefinedIn).eInverseAdd(this, Iot2Package.CONTAINER__CONTAINS, Container.class, msgs);
			msgs = basicSetDefinedIn(newDefinedIn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iot2Package.TYPEDEF_DEF__DEFINED_IN, newDefinedIn, newDefinedIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Iot2Package.TYPEDEF_DEF__DEFINED_IN:
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
			case Iot2Package.TYPEDEF_DEF__DEFINED_IN:
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
			case Iot2Package.TYPEDEF_DEF__DEFINED_IN:
				return eInternalContainer().eInverseRemove(this, Iot2Package.CONTAINER__CONTAINS, Container.class, msgs);
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
			case Iot2Package.TYPEDEF_DEF__IDENTIFIER:
				return getIdentifier();
			case Iot2Package.TYPEDEF_DEF__NAME:
				return getName();
			case Iot2Package.TYPEDEF_DEF__REPOSITORY_ID:
				return getRepositoryId();
			case Iot2Package.TYPEDEF_DEF__VERSION:
				return getVersion();
			case Iot2Package.TYPEDEF_DEF__ABSOLUTE_NAME:
				return getAbsoluteName();
			case Iot2Package.TYPEDEF_DEF__DEFINED_IN:
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
			case Iot2Package.TYPEDEF_DEF__IDENTIFIER:
				setIdentifier((String)newValue);
				return;
			case Iot2Package.TYPEDEF_DEF__NAME:
				setName((String)newValue);
				return;
			case Iot2Package.TYPEDEF_DEF__REPOSITORY_ID:
				setRepositoryId((String)newValue);
				return;
			case Iot2Package.TYPEDEF_DEF__VERSION:
				setVersion((String)newValue);
				return;
			case Iot2Package.TYPEDEF_DEF__ABSOLUTE_NAME:
				setAbsoluteName((String)newValue);
				return;
			case Iot2Package.TYPEDEF_DEF__DEFINED_IN:
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
			case Iot2Package.TYPEDEF_DEF__IDENTIFIER:
				setIdentifier(IDENTIFIER_EDEFAULT);
				return;
			case Iot2Package.TYPEDEF_DEF__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Iot2Package.TYPEDEF_DEF__REPOSITORY_ID:
				setRepositoryId(REPOSITORY_ID_EDEFAULT);
				return;
			case Iot2Package.TYPEDEF_DEF__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case Iot2Package.TYPEDEF_DEF__ABSOLUTE_NAME:
				setAbsoluteName(ABSOLUTE_NAME_EDEFAULT);
				return;
			case Iot2Package.TYPEDEF_DEF__DEFINED_IN:
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
			case Iot2Package.TYPEDEF_DEF__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
			case Iot2Package.TYPEDEF_DEF__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Iot2Package.TYPEDEF_DEF__REPOSITORY_ID:
				return REPOSITORY_ID_EDEFAULT == null ? repositoryId != null : !REPOSITORY_ID_EDEFAULT.equals(repositoryId);
			case Iot2Package.TYPEDEF_DEF__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case Iot2Package.TYPEDEF_DEF__ABSOLUTE_NAME:
				return ABSOLUTE_NAME_EDEFAULT == null ? absoluteName != null : !ABSOLUTE_NAME_EDEFAULT.equals(absoluteName);
			case Iot2Package.TYPEDEF_DEF__DEFINED_IN:
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
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case Iot2Package.TYPEDEF_DEF__IDENTIFIER: return Iot2Package.NAMED_ELEMENT__IDENTIFIER;
				case Iot2Package.TYPEDEF_DEF__NAME: return Iot2Package.NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == Contained.class) {
			switch (derivedFeatureID) {
				case Iot2Package.TYPEDEF_DEF__REPOSITORY_ID: return Iot2Package.CONTAINED__REPOSITORY_ID;
				case Iot2Package.TYPEDEF_DEF__VERSION: return Iot2Package.CONTAINED__VERSION;
				case Iot2Package.TYPEDEF_DEF__ABSOLUTE_NAME: return Iot2Package.CONTAINED__ABSOLUTE_NAME;
				case Iot2Package.TYPEDEF_DEF__DEFINED_IN: return Iot2Package.CONTAINED__DEFINED_IN;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case Iot2Package.NAMED_ELEMENT__IDENTIFIER: return Iot2Package.TYPEDEF_DEF__IDENTIFIER;
				case Iot2Package.NAMED_ELEMENT__NAME: return Iot2Package.TYPEDEF_DEF__NAME;
				default: return -1;
			}
		}
		if (baseClass == Contained.class) {
			switch (baseFeatureID) {
				case Iot2Package.CONTAINED__REPOSITORY_ID: return Iot2Package.TYPEDEF_DEF__REPOSITORY_ID;
				case Iot2Package.CONTAINED__VERSION: return Iot2Package.TYPEDEF_DEF__VERSION;
				case Iot2Package.CONTAINED__ABSOLUTE_NAME: return Iot2Package.TYPEDEF_DEF__ABSOLUTE_NAME;
				case Iot2Package.CONTAINED__DEFINED_IN: return Iot2Package.TYPEDEF_DEF__DEFINED_IN;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (identifier: ");
		result.append(identifier);
		result.append(", name: ");
		result.append(name);
		result.append(", repositoryId: ");
		result.append(repositoryId);
		result.append(", version: ");
		result.append(version);
		result.append(", absoluteName: ");
		result.append(absoluteName);
		result.append(')');
		return result.toString();
	}

} //TypedefDefImpl
