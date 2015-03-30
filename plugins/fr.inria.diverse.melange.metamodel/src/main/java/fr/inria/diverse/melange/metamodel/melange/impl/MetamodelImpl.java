/**
 */
package fr.inria.diverse.melange.metamodel.melange.impl;

import fr.inria.diverse.melange.metamodel.melange.Aspect;
import fr.inria.diverse.melange.metamodel.melange.Inheritance;
import fr.inria.diverse.melange.metamodel.melange.Mapping;
import fr.inria.diverse.melange.metamodel.melange.MelangePackage;
import fr.inria.diverse.melange.metamodel.melange.Metamodel;
import fr.inria.diverse.melange.metamodel.melange.ModelType;
import fr.inria.diverse.melange.metamodel.melange.ResourceType;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Metamodel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.impl.MetamodelImpl#getAspects <em>Aspects</em>}</li>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.impl.MetamodelImpl#getExactType <em>Exact Type</em>}</li>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.impl.MetamodelImpl#getImplements <em>Implements</em>}</li>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.impl.MetamodelImpl#getRequires <em>Requires</em>}</li>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.impl.MetamodelImpl#getInheritanceRelation <em>Inheritance Relation</em>}</li>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.impl.MetamodelImpl#getExactTypeName <em>Exact Type Name</em>}</li>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.impl.MetamodelImpl#getExactTypeUri <em>Exact Type Uri</em>}</li>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.impl.MetamodelImpl#getResourceType <em>Resource Type</em>}</li>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.impl.MetamodelImpl#getResourceUri <em>Resource Uri</em>}</li>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.impl.MetamodelImpl#getXtextSetupRef <em>Xtext Setup Ref</em>}</li>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.impl.MetamodelImpl#getGenmodelUris <em>Genmodel Uris</em>}</li>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.impl.MetamodelImpl#getMappings <em>Mappings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MetamodelImpl extends ModelingElementImpl implements Metamodel {
	/**
	 * The cached value of the '{@link #getAspects() <em>Aspects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAspects()
	 * @generated
	 * @ordered
	 */
	protected EList<Aspect> aspects;

	/**
	 * The cached value of the '{@link #getExactType() <em>Exact Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExactType()
	 * @generated
	 * @ordered
	 */
	protected ModelType exactType;

	/**
	 * The cached value of the '{@link #getImplements() <em>Implements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplements()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelType> implements_;

	/**
	 * The cached value of the '{@link #getRequires() <em>Requires</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequires()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelType> requires;

	/**
	 * The cached value of the '{@link #getInheritanceRelation() <em>Inheritance Relation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInheritanceRelation()
	 * @generated
	 * @ordered
	 */
	protected Inheritance inheritanceRelation;

	/**
	 * The default value of the '{@link #getExactTypeName() <em>Exact Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExactTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final String EXACT_TYPE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExactTypeName() <em>Exact Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExactTypeName()
	 * @generated
	 * @ordered
	 */
	protected String exactTypeName = EXACT_TYPE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getExactTypeUri() <em>Exact Type Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExactTypeUri()
	 * @generated
	 * @ordered
	 */
	protected static final String EXACT_TYPE_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExactTypeUri() <em>Exact Type Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExactTypeUri()
	 * @generated
	 * @ordered
	 */
	protected String exactTypeUri = EXACT_TYPE_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getResourceType() <em>Resource Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceType()
	 * @generated
	 * @ordered
	 */
	protected static final ResourceType RESOURCE_TYPE_EDEFAULT = ResourceType.MELANGE;

	/**
	 * The cached value of the '{@link #getResourceType() <em>Resource Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceType()
	 * @generated
	 * @ordered
	 */
	protected ResourceType resourceType = RESOURCE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getResourceUri() <em>Resource Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceUri()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOURCE_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResourceUri() <em>Resource Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceUri()
	 * @generated
	 * @ordered
	 */
	protected String resourceUri = RESOURCE_URI_EDEFAULT;

	/**
	 * The cached value of the '{@link #getXtextSetupRef() <em>Xtext Setup Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXtextSetupRef()
	 * @generated
	 * @ordered
	 */
	protected JvmTypeReference xtextSetupRef;

	/**
	 * The cached value of the '{@link #getGenmodelUris() <em>Genmodel Uris</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenmodelUris()
	 * @generated
	 * @ordered
	 */
	protected EList<String> genmodelUris;

	/**
	 * The cached value of the '{@link #getMappings() <em>Mappings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<Mapping> mappings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetamodelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MelangePackage.Literals.METAMODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Aspect> getAspects() {
		if (aspects == null) {
			aspects = new EObjectContainmentEList<Aspect>(Aspect.class, this, MelangePackage.METAMODEL__ASPECTS);
		}
		return aspects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelType getExactType() {
		if (exactType != null && exactType.eIsProxy()) {
			InternalEObject oldExactType = (InternalEObject)exactType;
			exactType = (ModelType)eResolveProxy(oldExactType);
			if (exactType != oldExactType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MelangePackage.METAMODEL__EXACT_TYPE, oldExactType, exactType));
			}
		}
		return exactType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelType basicGetExactType() {
		return exactType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExactType(ModelType newExactType, NotificationChain msgs) {
		ModelType oldExactType = exactType;
		exactType = newExactType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MelangePackage.METAMODEL__EXACT_TYPE, oldExactType, newExactType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExactType(ModelType newExactType) {
		if (newExactType != exactType) {
			NotificationChain msgs = null;
			if (exactType != null)
				msgs = ((InternalEObject)exactType).eInverseRemove(this, MelangePackage.MODEL_TYPE__EXTRACTED, ModelType.class, msgs);
			if (newExactType != null)
				msgs = ((InternalEObject)newExactType).eInverseAdd(this, MelangePackage.MODEL_TYPE__EXTRACTED, ModelType.class, msgs);
			msgs = basicSetExactType(newExactType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MelangePackage.METAMODEL__EXACT_TYPE, newExactType, newExactType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelType> getImplements() {
		if (implements_ == null) {
			implements_ = new EObjectResolvingEList<ModelType>(ModelType.class, this, MelangePackage.METAMODEL__IMPLEMENTS);
		}
		return implements_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelType> getRequires() {
		if (requires == null) {
			requires = new EObjectResolvingEList<ModelType>(ModelType.class, this, MelangePackage.METAMODEL__REQUIRES);
		}
		return requires;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inheritance getInheritanceRelation() {
		return inheritanceRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInheritanceRelation(Inheritance newInheritanceRelation, NotificationChain msgs) {
		Inheritance oldInheritanceRelation = inheritanceRelation;
		inheritanceRelation = newInheritanceRelation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MelangePackage.METAMODEL__INHERITANCE_RELATION, oldInheritanceRelation, newInheritanceRelation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInheritanceRelation(Inheritance newInheritanceRelation) {
		if (newInheritanceRelation != inheritanceRelation) {
			NotificationChain msgs = null;
			if (inheritanceRelation != null)
				msgs = ((InternalEObject)inheritanceRelation).eInverseRemove(this, MelangePackage.INHERITANCE__SUB_METAMODEL, Inheritance.class, msgs);
			if (newInheritanceRelation != null)
				msgs = ((InternalEObject)newInheritanceRelation).eInverseAdd(this, MelangePackage.INHERITANCE__SUB_METAMODEL, Inheritance.class, msgs);
			msgs = basicSetInheritanceRelation(newInheritanceRelation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MelangePackage.METAMODEL__INHERITANCE_RELATION, newInheritanceRelation, newInheritanceRelation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExactTypeName() {
		return exactTypeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExactTypeName(String newExactTypeName) {
		String oldExactTypeName = exactTypeName;
		exactTypeName = newExactTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MelangePackage.METAMODEL__EXACT_TYPE_NAME, oldExactTypeName, exactTypeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExactTypeUri() {
		return exactTypeUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExactTypeUri(String newExactTypeUri) {
		String oldExactTypeUri = exactTypeUri;
		exactTypeUri = newExactTypeUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MelangePackage.METAMODEL__EXACT_TYPE_URI, oldExactTypeUri, exactTypeUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceType getResourceType() {
		return resourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceType(ResourceType newResourceType) {
		ResourceType oldResourceType = resourceType;
		resourceType = newResourceType == null ? RESOURCE_TYPE_EDEFAULT : newResourceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MelangePackage.METAMODEL__RESOURCE_TYPE, oldResourceType, resourceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResourceUri() {
		return resourceUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceUri(String newResourceUri) {
		String oldResourceUri = resourceUri;
		resourceUri = newResourceUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MelangePackage.METAMODEL__RESOURCE_URI, oldResourceUri, resourceUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmTypeReference getXtextSetupRef() {
		return xtextSetupRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXtextSetupRef(JvmTypeReference newXtextSetupRef, NotificationChain msgs) {
		JvmTypeReference oldXtextSetupRef = xtextSetupRef;
		xtextSetupRef = newXtextSetupRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MelangePackage.METAMODEL__XTEXT_SETUP_REF, oldXtextSetupRef, newXtextSetupRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXtextSetupRef(JvmTypeReference newXtextSetupRef) {
		if (newXtextSetupRef != xtextSetupRef) {
			NotificationChain msgs = null;
			if (xtextSetupRef != null)
				msgs = ((InternalEObject)xtextSetupRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MelangePackage.METAMODEL__XTEXT_SETUP_REF, null, msgs);
			if (newXtextSetupRef != null)
				msgs = ((InternalEObject)newXtextSetupRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MelangePackage.METAMODEL__XTEXT_SETUP_REF, null, msgs);
			msgs = basicSetXtextSetupRef(newXtextSetupRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MelangePackage.METAMODEL__XTEXT_SETUP_REF, newXtextSetupRef, newXtextSetupRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getGenmodelUris() {
		if (genmodelUris == null) {
			genmodelUris = new EDataTypeUniqueEList<String>(String.class, this, MelangePackage.METAMODEL__GENMODEL_URIS);
		}
		return genmodelUris;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Mapping> getMappings() {
		if (mappings == null) {
			mappings = new EObjectWithInverseEList<Mapping>(Mapping.class, this, MelangePackage.METAMODEL__MAPPINGS, MelangePackage.MAPPING__FROM);
		}
		return mappings;
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
			case MelangePackage.METAMODEL__EXACT_TYPE:
				if (exactType != null)
					msgs = ((InternalEObject)exactType).eInverseRemove(this, MelangePackage.MODEL_TYPE__EXTRACTED, ModelType.class, msgs);
				return basicSetExactType((ModelType)otherEnd, msgs);
			case MelangePackage.METAMODEL__INHERITANCE_RELATION:
				if (inheritanceRelation != null)
					msgs = ((InternalEObject)inheritanceRelation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MelangePackage.METAMODEL__INHERITANCE_RELATION, null, msgs);
				return basicSetInheritanceRelation((Inheritance)otherEnd, msgs);
			case MelangePackage.METAMODEL__MAPPINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMappings()).basicAdd(otherEnd, msgs);
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
			case MelangePackage.METAMODEL__ASPECTS:
				return ((InternalEList<?>)getAspects()).basicRemove(otherEnd, msgs);
			case MelangePackage.METAMODEL__EXACT_TYPE:
				return basicSetExactType(null, msgs);
			case MelangePackage.METAMODEL__INHERITANCE_RELATION:
				return basicSetInheritanceRelation(null, msgs);
			case MelangePackage.METAMODEL__XTEXT_SETUP_REF:
				return basicSetXtextSetupRef(null, msgs);
			case MelangePackage.METAMODEL__MAPPINGS:
				return ((InternalEList<?>)getMappings()).basicRemove(otherEnd, msgs);
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
			case MelangePackage.METAMODEL__ASPECTS:
				return getAspects();
			case MelangePackage.METAMODEL__EXACT_TYPE:
				if (resolve) return getExactType();
				return basicGetExactType();
			case MelangePackage.METAMODEL__IMPLEMENTS:
				return getImplements();
			case MelangePackage.METAMODEL__REQUIRES:
				return getRequires();
			case MelangePackage.METAMODEL__INHERITANCE_RELATION:
				return getInheritanceRelation();
			case MelangePackage.METAMODEL__EXACT_TYPE_NAME:
				return getExactTypeName();
			case MelangePackage.METAMODEL__EXACT_TYPE_URI:
				return getExactTypeUri();
			case MelangePackage.METAMODEL__RESOURCE_TYPE:
				return getResourceType();
			case MelangePackage.METAMODEL__RESOURCE_URI:
				return getResourceUri();
			case MelangePackage.METAMODEL__XTEXT_SETUP_REF:
				return getXtextSetupRef();
			case MelangePackage.METAMODEL__GENMODEL_URIS:
				return getGenmodelUris();
			case MelangePackage.METAMODEL__MAPPINGS:
				return getMappings();
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
			case MelangePackage.METAMODEL__ASPECTS:
				getAspects().clear();
				getAspects().addAll((Collection<? extends Aspect>)newValue);
				return;
			case MelangePackage.METAMODEL__EXACT_TYPE:
				setExactType((ModelType)newValue);
				return;
			case MelangePackage.METAMODEL__IMPLEMENTS:
				getImplements().clear();
				getImplements().addAll((Collection<? extends ModelType>)newValue);
				return;
			case MelangePackage.METAMODEL__REQUIRES:
				getRequires().clear();
				getRequires().addAll((Collection<? extends ModelType>)newValue);
				return;
			case MelangePackage.METAMODEL__INHERITANCE_RELATION:
				setInheritanceRelation((Inheritance)newValue);
				return;
			case MelangePackage.METAMODEL__EXACT_TYPE_NAME:
				setExactTypeName((String)newValue);
				return;
			case MelangePackage.METAMODEL__EXACT_TYPE_URI:
				setExactTypeUri((String)newValue);
				return;
			case MelangePackage.METAMODEL__RESOURCE_TYPE:
				setResourceType((ResourceType)newValue);
				return;
			case MelangePackage.METAMODEL__RESOURCE_URI:
				setResourceUri((String)newValue);
				return;
			case MelangePackage.METAMODEL__XTEXT_SETUP_REF:
				setXtextSetupRef((JvmTypeReference)newValue);
				return;
			case MelangePackage.METAMODEL__GENMODEL_URIS:
				getGenmodelUris().clear();
				getGenmodelUris().addAll((Collection<? extends String>)newValue);
				return;
			case MelangePackage.METAMODEL__MAPPINGS:
				getMappings().clear();
				getMappings().addAll((Collection<? extends Mapping>)newValue);
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
			case MelangePackage.METAMODEL__ASPECTS:
				getAspects().clear();
				return;
			case MelangePackage.METAMODEL__EXACT_TYPE:
				setExactType((ModelType)null);
				return;
			case MelangePackage.METAMODEL__IMPLEMENTS:
				getImplements().clear();
				return;
			case MelangePackage.METAMODEL__REQUIRES:
				getRequires().clear();
				return;
			case MelangePackage.METAMODEL__INHERITANCE_RELATION:
				setInheritanceRelation((Inheritance)null);
				return;
			case MelangePackage.METAMODEL__EXACT_TYPE_NAME:
				setExactTypeName(EXACT_TYPE_NAME_EDEFAULT);
				return;
			case MelangePackage.METAMODEL__EXACT_TYPE_URI:
				setExactTypeUri(EXACT_TYPE_URI_EDEFAULT);
				return;
			case MelangePackage.METAMODEL__RESOURCE_TYPE:
				setResourceType(RESOURCE_TYPE_EDEFAULT);
				return;
			case MelangePackage.METAMODEL__RESOURCE_URI:
				setResourceUri(RESOURCE_URI_EDEFAULT);
				return;
			case MelangePackage.METAMODEL__XTEXT_SETUP_REF:
				setXtextSetupRef((JvmTypeReference)null);
				return;
			case MelangePackage.METAMODEL__GENMODEL_URIS:
				getGenmodelUris().clear();
				return;
			case MelangePackage.METAMODEL__MAPPINGS:
				getMappings().clear();
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
			case MelangePackage.METAMODEL__ASPECTS:
				return aspects != null && !aspects.isEmpty();
			case MelangePackage.METAMODEL__EXACT_TYPE:
				return exactType != null;
			case MelangePackage.METAMODEL__IMPLEMENTS:
				return implements_ != null && !implements_.isEmpty();
			case MelangePackage.METAMODEL__REQUIRES:
				return requires != null && !requires.isEmpty();
			case MelangePackage.METAMODEL__INHERITANCE_RELATION:
				return inheritanceRelation != null;
			case MelangePackage.METAMODEL__EXACT_TYPE_NAME:
				return EXACT_TYPE_NAME_EDEFAULT == null ? exactTypeName != null : !EXACT_TYPE_NAME_EDEFAULT.equals(exactTypeName);
			case MelangePackage.METAMODEL__EXACT_TYPE_URI:
				return EXACT_TYPE_URI_EDEFAULT == null ? exactTypeUri != null : !EXACT_TYPE_URI_EDEFAULT.equals(exactTypeUri);
			case MelangePackage.METAMODEL__RESOURCE_TYPE:
				return resourceType != RESOURCE_TYPE_EDEFAULT;
			case MelangePackage.METAMODEL__RESOURCE_URI:
				return RESOURCE_URI_EDEFAULT == null ? resourceUri != null : !RESOURCE_URI_EDEFAULT.equals(resourceUri);
			case MelangePackage.METAMODEL__XTEXT_SETUP_REF:
				return xtextSetupRef != null;
			case MelangePackage.METAMODEL__GENMODEL_URIS:
				return genmodelUris != null && !genmodelUris.isEmpty();
			case MelangePackage.METAMODEL__MAPPINGS:
				return mappings != null && !mappings.isEmpty();
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
		result.append(" (exactTypeName: ");
		result.append(exactTypeName);
		result.append(", exactTypeUri: ");
		result.append(exactTypeUri);
		result.append(", resourceType: ");
		result.append(resourceType);
		result.append(", resourceUri: ");
		result.append(resourceUri);
		result.append(", genmodelUris: ");
		result.append(genmodelUris);
		result.append(')');
		return result.toString();
	}

} //MetamodelImpl
