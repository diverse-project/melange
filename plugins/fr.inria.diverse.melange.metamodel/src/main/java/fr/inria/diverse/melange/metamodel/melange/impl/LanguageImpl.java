/**
 */
package fr.inria.diverse.melange.metamodel.melange.impl;

import fr.inria.diverse.melange.metamodel.melange.Annotation;
import fr.inria.diverse.melange.metamodel.melange.Aspect;
import fr.inria.diverse.melange.metamodel.melange.Language;
import fr.inria.diverse.melange.metamodel.melange.Mapping;
import fr.inria.diverse.melange.metamodel.melange.MelangePackage;
import fr.inria.diverse.melange.metamodel.melange.Metamodel;
import fr.inria.diverse.melange.metamodel.melange.ModelType;
import fr.inria.diverse.melange.metamodel.melange.Operator;
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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Language</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.impl.LanguageImpl#getOperators <em>Operators</em>}</li>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.impl.LanguageImpl#getExactType <em>Exact Type</em>}</li>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.impl.LanguageImpl#getImplements <em>Implements</em>}</li>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.impl.LanguageImpl#getRequires <em>Requires</em>}</li>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.impl.LanguageImpl#getSyntax <em>Syntax</em>}</li>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.impl.LanguageImpl#getExactTypeName <em>Exact Type Name</em>}</li>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.impl.LanguageImpl#getExactTypeUri <em>Exact Type Uri</em>}</li>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.impl.LanguageImpl#getResourceType <em>Resource Type</em>}</li>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.impl.LanguageImpl#getResourceUri <em>Resource Uri</em>}</li>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.impl.LanguageImpl#getXtextSetupRef <em>Xtext Setup Ref</em>}</li>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.impl.LanguageImpl#getMappings <em>Mappings</em>}</li>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.impl.LanguageImpl#getSemantics <em>Semantics</em>}</li>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.impl.LanguageImpl#getXtext <em>Xtext</em>}</li>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.impl.LanguageImpl#getSirius <em>Sirius</em>}</li>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.impl.LanguageImpl#getEcl <em>Ecl</em>}</li>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.impl.LanguageImpl#getXmof <em>Xmof</em>}</li>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.impl.LanguageImpl#getFileExtension <em>File Extension</em>}</li>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.impl.LanguageImpl#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LanguageImpl extends NamedElementImpl implements Language {
	/**
	 * The cached value of the '{@link #getOperators() <em>Operators</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperators()
	 * @generated
	 * @ordered
	 */
	protected EList<Operator> operators;

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
	 * The cached value of the '{@link #getSyntax() <em>Syntax</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSyntax()
	 * @generated
	 * @ordered
	 */
	protected Metamodel syntax;

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
	 * The cached value of the '{@link #getMappings() <em>Mappings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<Mapping> mappings;

	/**
	 * The cached value of the '{@link #getSemantics() <em>Semantics</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemantics()
	 * @generated
	 * @ordered
	 */
	protected EList<Aspect> semantics;

	/**
	 * The cached value of the '{@link #getXtext() <em>Xtext</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXtext()
	 * @generated
	 * @ordered
	 */
	protected EList<String> xtext;

	/**
	 * The cached value of the '{@link #getSirius() <em>Sirius</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSirius()
	 * @generated
	 * @ordered
	 */
	protected EList<String> sirius;

	/**
	 * The cached value of the '{@link #getEcl() <em>Ecl</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcl()
	 * @generated
	 * @ordered
	 */
	protected EList<String> ecl;

	/**
	 * The default value of the '{@link #getXmof() <em>Xmof</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmof()
	 * @generated
	 * @ordered
	 */
	protected static final String XMOF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXmof() <em>Xmof</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmof()
	 * @generated
	 * @ordered
	 */
	protected String xmof = XMOF_EDEFAULT;

	/**
	 * The default value of the '{@link #getFileExtension() <em>File Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileExtension()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_EXTENSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFileExtension() <em>File Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileExtension()
	 * @generated
	 * @ordered
	 */
	protected String fileExtension = FILE_EXTENSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> annotations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LanguageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MelangePackage.Literals.LANGUAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operator> getOperators() {
		if (operators == null) {
			operators = new EObjectContainmentWithInverseEList<Operator>(Operator.class, this, MelangePackage.LANGUAGE__OPERATORS, MelangePackage.OPERATOR__OWNING_LANGUAGE);
		}
		return operators;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MelangePackage.LANGUAGE__EXACT_TYPE, oldExactType, exactType));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MelangePackage.LANGUAGE__EXACT_TYPE, oldExactType, newExactType);
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
			eNotify(new ENotificationImpl(this, Notification.SET, MelangePackage.LANGUAGE__EXACT_TYPE, newExactType, newExactType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelType> getImplements() {
		if (implements_ == null) {
			implements_ = new EObjectResolvingEList<ModelType>(ModelType.class, this, MelangePackage.LANGUAGE__IMPLEMENTS);
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
			requires = new EObjectResolvingEList<ModelType>(ModelType.class, this, MelangePackage.LANGUAGE__REQUIRES);
		}
		return requires;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metamodel getSyntax() {
		return syntax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSyntax(Metamodel newSyntax, NotificationChain msgs) {
		Metamodel oldSyntax = syntax;
		syntax = newSyntax;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MelangePackage.LANGUAGE__SYNTAX, oldSyntax, newSyntax);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSyntax(Metamodel newSyntax) {
		if (newSyntax != syntax) {
			NotificationChain msgs = null;
			if (syntax != null)
				msgs = ((InternalEObject)syntax).eInverseRemove(this, MelangePackage.METAMODEL__OWNING_LANGUAGE, Metamodel.class, msgs);
			if (newSyntax != null)
				msgs = ((InternalEObject)newSyntax).eInverseAdd(this, MelangePackage.METAMODEL__OWNING_LANGUAGE, Metamodel.class, msgs);
			msgs = basicSetSyntax(newSyntax, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MelangePackage.LANGUAGE__SYNTAX, newSyntax, newSyntax));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MelangePackage.LANGUAGE__EXACT_TYPE_NAME, oldExactTypeName, exactTypeName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MelangePackage.LANGUAGE__EXACT_TYPE_URI, oldExactTypeUri, exactTypeUri));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MelangePackage.LANGUAGE__RESOURCE_TYPE, oldResourceType, resourceType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MelangePackage.LANGUAGE__RESOURCE_URI, oldResourceUri, resourceUri));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MelangePackage.LANGUAGE__XTEXT_SETUP_REF, oldXtextSetupRef, newXtextSetupRef);
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
				msgs = ((InternalEObject)xtextSetupRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MelangePackage.LANGUAGE__XTEXT_SETUP_REF, null, msgs);
			if (newXtextSetupRef != null)
				msgs = ((InternalEObject)newXtextSetupRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MelangePackage.LANGUAGE__XTEXT_SETUP_REF, null, msgs);
			msgs = basicSetXtextSetupRef(newXtextSetupRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MelangePackage.LANGUAGE__XTEXT_SETUP_REF, newXtextSetupRef, newXtextSetupRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Mapping> getMappings() {
		if (mappings == null) {
			mappings = new EObjectWithInverseEList<Mapping>(Mapping.class, this, MelangePackage.LANGUAGE__MAPPINGS, MelangePackage.MAPPING__FROM);
		}
		return mappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Aspect> getSemantics() {
		if (semantics == null) {
			semantics = new EObjectContainmentWithInverseEList<Aspect>(Aspect.class, this, MelangePackage.LANGUAGE__SEMANTICS, MelangePackage.ASPECT__OWNING_LANGUAGE);
		}
		return semantics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getXtext() {
		if (xtext == null) {
			xtext = new EDataTypeUniqueEList<String>(String.class, this, MelangePackage.LANGUAGE__XTEXT);
		}
		return xtext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSirius() {
		if (sirius == null) {
			sirius = new EDataTypeUniqueEList<String>(String.class, this, MelangePackage.LANGUAGE__SIRIUS);
		}
		return sirius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getEcl() {
		if (ecl == null) {
			ecl = new EDataTypeUniqueEList<String>(String.class, this, MelangePackage.LANGUAGE__ECL);
		}
		return ecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXmof() {
		return xmof;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXmof(String newXmof) {
		String oldXmof = xmof;
		xmof = newXmof;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MelangePackage.LANGUAGE__XMOF, oldXmof, xmof));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFileExtension() {
		return fileExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileExtension(String newFileExtension) {
		String oldFileExtension = fileExtension;
		fileExtension = newFileExtension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MelangePackage.LANGUAGE__FILE_EXTENSION, oldFileExtension, fileExtension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getAnnotations() {
		if (annotations == null) {
			annotations = new EObjectContainmentEList<Annotation>(Annotation.class, this, MelangePackage.LANGUAGE__ANNOTATIONS);
		}
		return annotations;
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
			case MelangePackage.LANGUAGE__OPERATORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOperators()).basicAdd(otherEnd, msgs);
			case MelangePackage.LANGUAGE__EXACT_TYPE:
				if (exactType != null)
					msgs = ((InternalEObject)exactType).eInverseRemove(this, MelangePackage.MODEL_TYPE__EXTRACTED, ModelType.class, msgs);
				return basicSetExactType((ModelType)otherEnd, msgs);
			case MelangePackage.LANGUAGE__SYNTAX:
				if (syntax != null)
					msgs = ((InternalEObject)syntax).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MelangePackage.LANGUAGE__SYNTAX, null, msgs);
				return basicSetSyntax((Metamodel)otherEnd, msgs);
			case MelangePackage.LANGUAGE__MAPPINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMappings()).basicAdd(otherEnd, msgs);
			case MelangePackage.LANGUAGE__SEMANTICS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSemantics()).basicAdd(otherEnd, msgs);
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
			case MelangePackage.LANGUAGE__OPERATORS:
				return ((InternalEList<?>)getOperators()).basicRemove(otherEnd, msgs);
			case MelangePackage.LANGUAGE__EXACT_TYPE:
				return basicSetExactType(null, msgs);
			case MelangePackage.LANGUAGE__SYNTAX:
				return basicSetSyntax(null, msgs);
			case MelangePackage.LANGUAGE__XTEXT_SETUP_REF:
				return basicSetXtextSetupRef(null, msgs);
			case MelangePackage.LANGUAGE__MAPPINGS:
				return ((InternalEList<?>)getMappings()).basicRemove(otherEnd, msgs);
			case MelangePackage.LANGUAGE__SEMANTICS:
				return ((InternalEList<?>)getSemantics()).basicRemove(otherEnd, msgs);
			case MelangePackage.LANGUAGE__ANNOTATIONS:
				return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
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
			case MelangePackage.LANGUAGE__OPERATORS:
				return getOperators();
			case MelangePackage.LANGUAGE__EXACT_TYPE:
				if (resolve) return getExactType();
				return basicGetExactType();
			case MelangePackage.LANGUAGE__IMPLEMENTS:
				return getImplements();
			case MelangePackage.LANGUAGE__REQUIRES:
				return getRequires();
			case MelangePackage.LANGUAGE__SYNTAX:
				return getSyntax();
			case MelangePackage.LANGUAGE__EXACT_TYPE_NAME:
				return getExactTypeName();
			case MelangePackage.LANGUAGE__EXACT_TYPE_URI:
				return getExactTypeUri();
			case MelangePackage.LANGUAGE__RESOURCE_TYPE:
				return getResourceType();
			case MelangePackage.LANGUAGE__RESOURCE_URI:
				return getResourceUri();
			case MelangePackage.LANGUAGE__XTEXT_SETUP_REF:
				return getXtextSetupRef();
			case MelangePackage.LANGUAGE__MAPPINGS:
				return getMappings();
			case MelangePackage.LANGUAGE__SEMANTICS:
				return getSemantics();
			case MelangePackage.LANGUAGE__XTEXT:
				return getXtext();
			case MelangePackage.LANGUAGE__SIRIUS:
				return getSirius();
			case MelangePackage.LANGUAGE__ECL:
				return getEcl();
			case MelangePackage.LANGUAGE__XMOF:
				return getXmof();
			case MelangePackage.LANGUAGE__FILE_EXTENSION:
				return getFileExtension();
			case MelangePackage.LANGUAGE__ANNOTATIONS:
				return getAnnotations();
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
			case MelangePackage.LANGUAGE__OPERATORS:
				getOperators().clear();
				getOperators().addAll((Collection<? extends Operator>)newValue);
				return;
			case MelangePackage.LANGUAGE__EXACT_TYPE:
				setExactType((ModelType)newValue);
				return;
			case MelangePackage.LANGUAGE__IMPLEMENTS:
				getImplements().clear();
				getImplements().addAll((Collection<? extends ModelType>)newValue);
				return;
			case MelangePackage.LANGUAGE__REQUIRES:
				getRequires().clear();
				getRequires().addAll((Collection<? extends ModelType>)newValue);
				return;
			case MelangePackage.LANGUAGE__SYNTAX:
				setSyntax((Metamodel)newValue);
				return;
			case MelangePackage.LANGUAGE__EXACT_TYPE_NAME:
				setExactTypeName((String)newValue);
				return;
			case MelangePackage.LANGUAGE__EXACT_TYPE_URI:
				setExactTypeUri((String)newValue);
				return;
			case MelangePackage.LANGUAGE__RESOURCE_TYPE:
				setResourceType((ResourceType)newValue);
				return;
			case MelangePackage.LANGUAGE__RESOURCE_URI:
				setResourceUri((String)newValue);
				return;
			case MelangePackage.LANGUAGE__XTEXT_SETUP_REF:
				setXtextSetupRef((JvmTypeReference)newValue);
				return;
			case MelangePackage.LANGUAGE__MAPPINGS:
				getMappings().clear();
				getMappings().addAll((Collection<? extends Mapping>)newValue);
				return;
			case MelangePackage.LANGUAGE__SEMANTICS:
				getSemantics().clear();
				getSemantics().addAll((Collection<? extends Aspect>)newValue);
				return;
			case MelangePackage.LANGUAGE__XTEXT:
				getXtext().clear();
				getXtext().addAll((Collection<? extends String>)newValue);
				return;
			case MelangePackage.LANGUAGE__SIRIUS:
				getSirius().clear();
				getSirius().addAll((Collection<? extends String>)newValue);
				return;
			case MelangePackage.LANGUAGE__ECL:
				getEcl().clear();
				getEcl().addAll((Collection<? extends String>)newValue);
				return;
			case MelangePackage.LANGUAGE__XMOF:
				setXmof((String)newValue);
				return;
			case MelangePackage.LANGUAGE__FILE_EXTENSION:
				setFileExtension((String)newValue);
				return;
			case MelangePackage.LANGUAGE__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends Annotation>)newValue);
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
			case MelangePackage.LANGUAGE__OPERATORS:
				getOperators().clear();
				return;
			case MelangePackage.LANGUAGE__EXACT_TYPE:
				setExactType((ModelType)null);
				return;
			case MelangePackage.LANGUAGE__IMPLEMENTS:
				getImplements().clear();
				return;
			case MelangePackage.LANGUAGE__REQUIRES:
				getRequires().clear();
				return;
			case MelangePackage.LANGUAGE__SYNTAX:
				setSyntax((Metamodel)null);
				return;
			case MelangePackage.LANGUAGE__EXACT_TYPE_NAME:
				setExactTypeName(EXACT_TYPE_NAME_EDEFAULT);
				return;
			case MelangePackage.LANGUAGE__EXACT_TYPE_URI:
				setExactTypeUri(EXACT_TYPE_URI_EDEFAULT);
				return;
			case MelangePackage.LANGUAGE__RESOURCE_TYPE:
				setResourceType(RESOURCE_TYPE_EDEFAULT);
				return;
			case MelangePackage.LANGUAGE__RESOURCE_URI:
				setResourceUri(RESOURCE_URI_EDEFAULT);
				return;
			case MelangePackage.LANGUAGE__XTEXT_SETUP_REF:
				setXtextSetupRef((JvmTypeReference)null);
				return;
			case MelangePackage.LANGUAGE__MAPPINGS:
				getMappings().clear();
				return;
			case MelangePackage.LANGUAGE__SEMANTICS:
				getSemantics().clear();
				return;
			case MelangePackage.LANGUAGE__XTEXT:
				getXtext().clear();
				return;
			case MelangePackage.LANGUAGE__SIRIUS:
				getSirius().clear();
				return;
			case MelangePackage.LANGUAGE__ECL:
				getEcl().clear();
				return;
			case MelangePackage.LANGUAGE__XMOF:
				setXmof(XMOF_EDEFAULT);
				return;
			case MelangePackage.LANGUAGE__FILE_EXTENSION:
				setFileExtension(FILE_EXTENSION_EDEFAULT);
				return;
			case MelangePackage.LANGUAGE__ANNOTATIONS:
				getAnnotations().clear();
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
			case MelangePackage.LANGUAGE__OPERATORS:
				return operators != null && !operators.isEmpty();
			case MelangePackage.LANGUAGE__EXACT_TYPE:
				return exactType != null;
			case MelangePackage.LANGUAGE__IMPLEMENTS:
				return implements_ != null && !implements_.isEmpty();
			case MelangePackage.LANGUAGE__REQUIRES:
				return requires != null && !requires.isEmpty();
			case MelangePackage.LANGUAGE__SYNTAX:
				return syntax != null;
			case MelangePackage.LANGUAGE__EXACT_TYPE_NAME:
				return EXACT_TYPE_NAME_EDEFAULT == null ? exactTypeName != null : !EXACT_TYPE_NAME_EDEFAULT.equals(exactTypeName);
			case MelangePackage.LANGUAGE__EXACT_TYPE_URI:
				return EXACT_TYPE_URI_EDEFAULT == null ? exactTypeUri != null : !EXACT_TYPE_URI_EDEFAULT.equals(exactTypeUri);
			case MelangePackage.LANGUAGE__RESOURCE_TYPE:
				return resourceType != RESOURCE_TYPE_EDEFAULT;
			case MelangePackage.LANGUAGE__RESOURCE_URI:
				return RESOURCE_URI_EDEFAULT == null ? resourceUri != null : !RESOURCE_URI_EDEFAULT.equals(resourceUri);
			case MelangePackage.LANGUAGE__XTEXT_SETUP_REF:
				return xtextSetupRef != null;
			case MelangePackage.LANGUAGE__MAPPINGS:
				return mappings != null && !mappings.isEmpty();
			case MelangePackage.LANGUAGE__SEMANTICS:
				return semantics != null && !semantics.isEmpty();
			case MelangePackage.LANGUAGE__XTEXT:
				return xtext != null && !xtext.isEmpty();
			case MelangePackage.LANGUAGE__SIRIUS:
				return sirius != null && !sirius.isEmpty();
			case MelangePackage.LANGUAGE__ECL:
				return ecl != null && !ecl.isEmpty();
			case MelangePackage.LANGUAGE__XMOF:
				return XMOF_EDEFAULT == null ? xmof != null : !XMOF_EDEFAULT.equals(xmof);
			case MelangePackage.LANGUAGE__FILE_EXTENSION:
				return FILE_EXTENSION_EDEFAULT == null ? fileExtension != null : !FILE_EXTENSION_EDEFAULT.equals(fileExtension);
			case MelangePackage.LANGUAGE__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
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
		result.append(", xtext: ");
		result.append(xtext);
		result.append(", sirius: ");
		result.append(sirius);
		result.append(", ecl: ");
		result.append(ecl);
		result.append(", xmof: ");
		result.append(xmof);
		result.append(", fileExtension: ");
		result.append(fileExtension);
		result.append(')');
		return result.toString();
	}

} //LanguageImpl
