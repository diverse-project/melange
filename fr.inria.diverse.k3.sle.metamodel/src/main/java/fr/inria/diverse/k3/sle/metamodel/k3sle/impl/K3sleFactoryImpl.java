/**
 */
package fr.inria.diverse.k3.sle.metamodel.k3sle.impl;

import fr.inria.diverse.k3.sle.metamodel.k3sle.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class K3sleFactoryImpl extends EFactoryImpl implements K3sleFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static K3sleFactory init() {
		try {
			K3sleFactory theK3sleFactory = (K3sleFactory)EPackage.Registry.INSTANCE.getEFactory(K3slePackage.eNS_URI);
			if (theK3sleFactory != null) {
				return theK3sleFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new K3sleFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public K3sleFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case K3slePackage.MEGAMODEL_ROOT: return createMegamodelRoot();
			case K3slePackage.METAMODEL: return createMetamodel();
			case K3slePackage.MODEL_TYPE: return createModelType();
			case K3slePackage.TRANSFORMATION: return createTransformation();
			case K3slePackage.ECORE_IMPORT: return createEcoreImport();
			case K3slePackage.ASPECT_IMPORT: return createAspectImport();
			case K3slePackage.INHERITANCE: return createInheritance();
			case K3slePackage.SUBTYPING: return createSubtyping();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MegamodelRoot createMegamodelRoot() {
		MegamodelRootImpl megamodelRoot = new MegamodelRootImpl();
		return megamodelRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metamodel createMetamodel() {
		MetamodelImpl metamodel = new MetamodelImpl();
		return metamodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelType createModelType() {
		ModelTypeImpl modelType = new ModelTypeImpl();
		return modelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transformation createTransformation() {
		TransformationImpl transformation = new TransformationImpl();
		return transformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcoreImport createEcoreImport() {
		EcoreImportImpl ecoreImport = new EcoreImportImpl();
		return ecoreImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AspectImport createAspectImport() {
		AspectImportImpl aspectImport = new AspectImportImpl();
		return aspectImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inheritance createInheritance() {
		InheritanceImpl inheritance = new InheritanceImpl();
		return inheritance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subtyping createSubtyping() {
		SubtypingImpl subtyping = new SubtypingImpl();
		return subtyping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public K3slePackage getK3slePackage() {
		return (K3slePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static K3slePackage getPackage() {
		return K3slePackage.eINSTANCE;
	}

} //K3sleFactoryImpl
