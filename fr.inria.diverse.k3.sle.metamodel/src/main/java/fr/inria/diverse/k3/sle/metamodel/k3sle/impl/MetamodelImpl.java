/**
 */
package fr.inria.diverse.k3.sle.metamodel.k3sle.impl;

import fr.inria.diverse.k3.sle.metamodel.k3sle.AspectImport;
import fr.inria.diverse.k3.sle.metamodel.k3sle.EcoreImport;
import fr.inria.diverse.k3.sle.metamodel.k3sle.Inheritance;
import fr.inria.diverse.k3.sle.metamodel.k3sle.K3slePackage;
import fr.inria.diverse.k3.sle.metamodel.k3sle.Metamodel;
import fr.inria.diverse.k3.sle.metamodel.k3sle.ModelType;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Metamodel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.diverse.k3.sle.metamodel.k3sle.impl.MetamodelImpl#getEcore <em>Ecore</em>}</li>
 *   <li>{@link fr.inria.diverse.k3.sle.metamodel.k3sle.impl.MetamodelImpl#getAspects <em>Aspects</em>}</li>
 *   <li>{@link fr.inria.diverse.k3.sle.metamodel.k3sle.impl.MetamodelImpl#getExactType <em>Exact Type</em>}</li>
 *   <li>{@link fr.inria.diverse.k3.sle.metamodel.k3sle.impl.MetamodelImpl#getImplements <em>Implements</em>}</li>
 *   <li>{@link fr.inria.diverse.k3.sle.metamodel.k3sle.impl.MetamodelImpl#getInheritanceRelation <em>Inheritance Relation</em>}</li>
 *   <li>{@link fr.inria.diverse.k3.sle.metamodel.k3sle.impl.MetamodelImpl#getPkg <em>Pkg</em>}</li>
 *   <li>{@link fr.inria.diverse.k3.sle.metamodel.k3sle.impl.MetamodelImpl#getGenmodel <em>Genmodel</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MetamodelImpl extends ElementImpl implements Metamodel {
	/**
	 * The cached value of the '{@link #getEcore() <em>Ecore</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcore()
	 * @generated
	 * @ordered
	 */
	protected EcoreImport ecore;

	/**
	 * The cached value of the '{@link #getAspects() <em>Aspects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAspects()
	 * @generated
	 * @ordered
	 */
	protected EList<AspectImport> aspects;

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
	 * The cached value of the '{@link #getInheritanceRelation() <em>Inheritance Relation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInheritanceRelation()
	 * @generated
	 * @ordered
	 */
	protected Inheritance inheritanceRelation;

	/**
	 * The cached value of the '{@link #getPkg() <em>Pkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPkg()
	 * @generated
	 * @ordered
	 */
	protected EPackage pkg;

	/**
	 * The cached value of the '{@link #getGenmodel() <em>Genmodel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenmodel()
	 * @generated
	 * @ordered
	 */
	protected GenModel genmodel;

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
		return K3slePackage.Literals.METAMODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcoreImport getEcore() {
		return ecore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEcore(EcoreImport newEcore, NotificationChain msgs) {
		EcoreImport oldEcore = ecore;
		ecore = newEcore;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, K3slePackage.METAMODEL__ECORE, oldEcore, newEcore);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEcore(EcoreImport newEcore) {
		if (newEcore != ecore) {
			NotificationChain msgs = null;
			if (ecore != null)
				msgs = ((InternalEObject)ecore).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - K3slePackage.METAMODEL__ECORE, null, msgs);
			if (newEcore != null)
				msgs = ((InternalEObject)newEcore).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - K3slePackage.METAMODEL__ECORE, null, msgs);
			msgs = basicSetEcore(newEcore, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K3slePackage.METAMODEL__ECORE, newEcore, newEcore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AspectImport> getAspects() {
		if (aspects == null) {
			aspects = new EObjectContainmentEList<AspectImport>(AspectImport.class, this, K3slePackage.METAMODEL__ASPECTS);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, K3slePackage.METAMODEL__EXACT_TYPE, oldExactType, exactType));
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
	public void setExactType(ModelType newExactType) {
		ModelType oldExactType = exactType;
		exactType = newExactType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K3slePackage.METAMODEL__EXACT_TYPE, oldExactType, exactType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelType> getImplements() {
		if (implements_ == null) {
			implements_ = new EObjectResolvingEList<ModelType>(ModelType.class, this, K3slePackage.METAMODEL__IMPLEMENTS);
		}
		return implements_;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, K3slePackage.METAMODEL__INHERITANCE_RELATION, oldInheritanceRelation, newInheritanceRelation);
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
				msgs = ((InternalEObject)inheritanceRelation).eInverseRemove(this, K3slePackage.INHERITANCE__SUB_METAMODEL, Inheritance.class, msgs);
			if (newInheritanceRelation != null)
				msgs = ((InternalEObject)newInheritanceRelation).eInverseAdd(this, K3slePackage.INHERITANCE__SUB_METAMODEL, Inheritance.class, msgs);
			msgs = basicSetInheritanceRelation(newInheritanceRelation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K3slePackage.METAMODEL__INHERITANCE_RELATION, newInheritanceRelation, newInheritanceRelation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPackage getPkg() {
		return pkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPkg(EPackage newPkg, NotificationChain msgs) {
		EPackage oldPkg = pkg;
		pkg = newPkg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, K3slePackage.METAMODEL__PKG, oldPkg, newPkg);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPkg(EPackage newPkg) {
		if (newPkg != pkg) {
			NotificationChain msgs = null;
			if (pkg != null)
				msgs = ((InternalEObject)pkg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - K3slePackage.METAMODEL__PKG, null, msgs);
			if (newPkg != null)
				msgs = ((InternalEObject)newPkg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - K3slePackage.METAMODEL__PKG, null, msgs);
			msgs = basicSetPkg(newPkg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K3slePackage.METAMODEL__PKG, newPkg, newPkg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenModel getGenmodel() {
		return genmodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenmodel(GenModel newGenmodel, NotificationChain msgs) {
		GenModel oldGenmodel = genmodel;
		genmodel = newGenmodel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, K3slePackage.METAMODEL__GENMODEL, oldGenmodel, newGenmodel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenmodel(GenModel newGenmodel) {
		if (newGenmodel != genmodel) {
			NotificationChain msgs = null;
			if (genmodel != null)
				msgs = ((InternalEObject)genmodel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - K3slePackage.METAMODEL__GENMODEL, null, msgs);
			if (newGenmodel != null)
				msgs = ((InternalEObject)newGenmodel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - K3slePackage.METAMODEL__GENMODEL, null, msgs);
			msgs = basicSetGenmodel(newGenmodel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K3slePackage.METAMODEL__GENMODEL, newGenmodel, newGenmodel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void footprint() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void merge() {
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
			case K3slePackage.METAMODEL__INHERITANCE_RELATION:
				if (inheritanceRelation != null)
					msgs = ((InternalEObject)inheritanceRelation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - K3slePackage.METAMODEL__INHERITANCE_RELATION, null, msgs);
				return basicSetInheritanceRelation((Inheritance)otherEnd, msgs);
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
			case K3slePackage.METAMODEL__ECORE:
				return basicSetEcore(null, msgs);
			case K3slePackage.METAMODEL__ASPECTS:
				return ((InternalEList<?>)getAspects()).basicRemove(otherEnd, msgs);
			case K3slePackage.METAMODEL__INHERITANCE_RELATION:
				return basicSetInheritanceRelation(null, msgs);
			case K3slePackage.METAMODEL__PKG:
				return basicSetPkg(null, msgs);
			case K3slePackage.METAMODEL__GENMODEL:
				return basicSetGenmodel(null, msgs);
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
			case K3slePackage.METAMODEL__ECORE:
				return getEcore();
			case K3slePackage.METAMODEL__ASPECTS:
				return getAspects();
			case K3slePackage.METAMODEL__EXACT_TYPE:
				if (resolve) return getExactType();
				return basicGetExactType();
			case K3slePackage.METAMODEL__IMPLEMENTS:
				return getImplements();
			case K3slePackage.METAMODEL__INHERITANCE_RELATION:
				return getInheritanceRelation();
			case K3slePackage.METAMODEL__PKG:
				return getPkg();
			case K3slePackage.METAMODEL__GENMODEL:
				return getGenmodel();
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
			case K3slePackage.METAMODEL__ECORE:
				setEcore((EcoreImport)newValue);
				return;
			case K3slePackage.METAMODEL__ASPECTS:
				getAspects().clear();
				getAspects().addAll((Collection<? extends AspectImport>)newValue);
				return;
			case K3slePackage.METAMODEL__EXACT_TYPE:
				setExactType((ModelType)newValue);
				return;
			case K3slePackage.METAMODEL__IMPLEMENTS:
				getImplements().clear();
				getImplements().addAll((Collection<? extends ModelType>)newValue);
				return;
			case K3slePackage.METAMODEL__INHERITANCE_RELATION:
				setInheritanceRelation((Inheritance)newValue);
				return;
			case K3slePackage.METAMODEL__PKG:
				setPkg((EPackage)newValue);
				return;
			case K3slePackage.METAMODEL__GENMODEL:
				setGenmodel((GenModel)newValue);
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
			case K3slePackage.METAMODEL__ECORE:
				setEcore((EcoreImport)null);
				return;
			case K3slePackage.METAMODEL__ASPECTS:
				getAspects().clear();
				return;
			case K3slePackage.METAMODEL__EXACT_TYPE:
				setExactType((ModelType)null);
				return;
			case K3slePackage.METAMODEL__IMPLEMENTS:
				getImplements().clear();
				return;
			case K3slePackage.METAMODEL__INHERITANCE_RELATION:
				setInheritanceRelation((Inheritance)null);
				return;
			case K3slePackage.METAMODEL__PKG:
				setPkg((EPackage)null);
				return;
			case K3slePackage.METAMODEL__GENMODEL:
				setGenmodel((GenModel)null);
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
			case K3slePackage.METAMODEL__ECORE:
				return ecore != null;
			case K3slePackage.METAMODEL__ASPECTS:
				return aspects != null && !aspects.isEmpty();
			case K3slePackage.METAMODEL__EXACT_TYPE:
				return exactType != null;
			case K3slePackage.METAMODEL__IMPLEMENTS:
				return implements_ != null && !implements_.isEmpty();
			case K3slePackage.METAMODEL__INHERITANCE_RELATION:
				return inheritanceRelation != null;
			case K3slePackage.METAMODEL__PKG:
				return pkg != null;
			case K3slePackage.METAMODEL__GENMODEL:
				return genmodel != null;
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
			case K3slePackage.METAMODEL___FOOTPRINT:
				footprint();
				return null;
			case K3slePackage.METAMODEL___MERGE:
				merge();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //MetamodelImpl
