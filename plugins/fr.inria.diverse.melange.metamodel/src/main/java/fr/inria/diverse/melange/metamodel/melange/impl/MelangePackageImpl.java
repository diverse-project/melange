/**
 */
package fr.inria.diverse.melange.metamodel.melange.impl;

import fr.inria.diverse.melange.metamodel.melange.Aspect;
import fr.inria.diverse.melange.metamodel.melange.ClassBinding;
import fr.inria.diverse.melange.metamodel.melange.Element;
import fr.inria.diverse.melange.metamodel.melange.Import;
import fr.inria.diverse.melange.metamodel.melange.Inheritance;
import fr.inria.diverse.melange.metamodel.melange.Language;
import fr.inria.diverse.melange.metamodel.melange.LanguageOperator;
import fr.inria.diverse.melange.metamodel.melange.Mapping;
import fr.inria.diverse.melange.metamodel.melange.MelangeFactory;
import fr.inria.diverse.melange.metamodel.melange.MelangePackage;
import fr.inria.diverse.melange.metamodel.melange.Merge;
import fr.inria.diverse.melange.metamodel.melange.Metamodel;
import fr.inria.diverse.melange.metamodel.melange.ModelType;
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace;
import fr.inria.diverse.melange.metamodel.melange.ModelingElement;
import fr.inria.diverse.melange.metamodel.melange.NamedElement;
import fr.inria.diverse.melange.metamodel.melange.Operator;
import fr.inria.diverse.melange.metamodel.melange.PackageBinding;
import fr.inria.diverse.melange.metamodel.melange.PropertyBinding;
import fr.inria.diverse.melange.metamodel.melange.ResourceType;
import fr.inria.diverse.melange.metamodel.melange.Slice;
import fr.inria.diverse.melange.metamodel.melange.Subtyping;
import fr.inria.diverse.melange.metamodel.melange.Transformation;
import fr.inria.diverse.melange.metamodel.melange.Weave;
import fr.inria.diverse.melange.metamodel.melange.XbaseTransformation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.xtext.common.types.TypesPackage;

import org.eclipse.xtext.xbase.XbasePackage;

import org.eclipse.xtext.xtype.XtypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MelangePackageImpl extends EPackageImpl implements MelangePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelTypingSpaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metamodelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aspectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inheritanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subtypingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xbaseTransformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelingElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass languageOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mergeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sliceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass languageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass weaveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum resourceTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see fr.inria.diverse.melange.metamodel.melange.MelangePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MelangePackageImpl() {
		super(eNS_URI, MelangeFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link MelangePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MelangePackage init() {
		if (isInited) return (MelangePackage)EPackage.Registry.INSTANCE.getEPackage(MelangePackage.eNS_URI);

		// Obtain or create and register package
		MelangePackageImpl theMelangePackage = (MelangePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MelangePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MelangePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		XtypePackage.eINSTANCE.eClass();
		XbasePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theMelangePackage.createPackageContents();

		// Initialize created meta-data
		theMelangePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMelangePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MelangePackage.eNS_URI, theMelangePackage);
		return theMelangePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelTypingSpace() {
		return modelTypingSpaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelTypingSpace_Elements() {
		return (EReference)modelTypingSpaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelTypingSpace_Imports() {
		return (EReference)modelTypingSpaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelTypingSpace_Name() {
		return (EAttribute)modelTypingSpaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetamodel() {
		return metamodelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetamodel_OwningLanguage() {
		return (EReference)metamodelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetamodel_GenmodelUris() {
		return (EAttribute)metamodelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelType() {
		return modelTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelType_SubtypingRelations() {
		return (EReference)modelTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelType_Extracted() {
		return (EReference)modelTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelType_MtUri() {
		return (EAttribute)modelTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransformation() {
		return transformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAspect() {
		return aspectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAspect_AspectTypeRef() {
		return (EReference)aspectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAspect_AspectedClass() {
		return (EReference)aspectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAspect_EcoreFragment() {
		return (EReference)aspectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAspect_OwningLanguage() {
		return (EReference)aspectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInheritance() {
		return inheritanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubtyping() {
		return subtypingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubtyping_SubType() {
		return (EReference)subtypingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubtyping_SuperType() {
		return (EReference)subtypingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXbaseTransformation() {
		return xbaseTransformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXbaseTransformation_Body() {
		return (EReference)xbaseTransformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXbaseTransformation_Main() {
		return (EAttribute)xbaseTransformationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXbaseTransformation_Parameters() {
		return (EReference)xbaseTransformationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXbaseTransformation_ReturnTypeRef() {
		return (EReference)xbaseTransformationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelingElement() {
		return modelingElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelingElement_EcoreUri() {
		return (EAttribute)modelingElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMapping() {
		return mappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapping_Rules() {
		return (EReference)mappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapping_From() {
		return (EReference)mappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapping_To() {
		return (EReference)mappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassBinding() {
		return classBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassBinding_From() {
		return (EAttribute)classBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassBinding_To() {
		return (EAttribute)classBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassBinding_Properties() {
		return (EReference)classBindingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyBinding() {
		return propertyBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyBinding_From() {
		return (EAttribute)propertyBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyBinding_To() {
		return (EAttribute)propertyBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperator() {
		return operatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperator_OwningLanguage() {
		return (EReference)operatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLanguageOperator() {
		return languageOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLanguageOperator_TargetLanguage() {
		return (EReference)languageOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImport() {
		return importEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImport_EcoreUri() {
		return (EAttribute)importEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImport_GenmodelUris() {
		return (EAttribute)importEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImport_MappingRules() {
		return (EReference)importEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMerge() {
		return mergeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMerge_MappingRules() {
		return (EReference)mergeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSlice() {
		return sliceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSlice_Roots() {
		return (EAttribute)sliceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSlice_MappingRules() {
		return (EReference)sliceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackageBinding() {
		return packageBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageBinding_From() {
		return (EAttribute)packageBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageBinding_To() {
		return (EAttribute)packageBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageBinding_Classes() {
		return (EReference)packageBindingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLanguage() {
		return languageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLanguage_Operators() {
		return (EReference)languageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLanguage_ExactType() {
		return (EReference)languageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLanguage_Implements() {
		return (EReference)languageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLanguage_Requires() {
		return (EReference)languageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLanguage_Syntax() {
		return (EReference)languageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLanguage_ExactTypeName() {
		return (EAttribute)languageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLanguage_ExactTypeUri() {
		return (EAttribute)languageEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLanguage_ResourceType() {
		return (EAttribute)languageEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLanguage_ResourceUri() {
		return (EAttribute)languageEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLanguage_XtextSetupRef() {
		return (EReference)languageEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLanguage_Mappings() {
		return (EReference)languageEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLanguage_Semantics() {
		return (EReference)languageEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLanguage_Xtext() {
		return (EAttribute)languageEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLanguage_Sirius() {
		return (EAttribute)languageEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLanguage_Ecl() {
		return (EAttribute)languageEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWeave() {
		return weaveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWeave_AspectTypeRef() {
		return (EReference)weaveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWeave_AspectWildcardImport() {
		return (EAttribute)weaveEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getResourceType() {
		return resourceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MelangeFactory getMelangeFactory() {
		return (MelangeFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		modelTypingSpaceEClass = createEClass(MODEL_TYPING_SPACE);
		createEReference(modelTypingSpaceEClass, MODEL_TYPING_SPACE__ELEMENTS);
		createEReference(modelTypingSpaceEClass, MODEL_TYPING_SPACE__IMPORTS);
		createEAttribute(modelTypingSpaceEClass, MODEL_TYPING_SPACE__NAME);

		elementEClass = createEClass(ELEMENT);

		metamodelEClass = createEClass(METAMODEL);
		createEReference(metamodelEClass, METAMODEL__OWNING_LANGUAGE);
		createEAttribute(metamodelEClass, METAMODEL__GENMODEL_URIS);

		modelTypeEClass = createEClass(MODEL_TYPE);
		createEReference(modelTypeEClass, MODEL_TYPE__SUBTYPING_RELATIONS);
		createEReference(modelTypeEClass, MODEL_TYPE__EXTRACTED);
		createEAttribute(modelTypeEClass, MODEL_TYPE__MT_URI);

		transformationEClass = createEClass(TRANSFORMATION);

		aspectEClass = createEClass(ASPECT);
		createEReference(aspectEClass, ASPECT__ASPECT_TYPE_REF);
		createEReference(aspectEClass, ASPECT__ASPECTED_CLASS);
		createEReference(aspectEClass, ASPECT__ECORE_FRAGMENT);
		createEReference(aspectEClass, ASPECT__OWNING_LANGUAGE);

		inheritanceEClass = createEClass(INHERITANCE);

		subtypingEClass = createEClass(SUBTYPING);
		createEReference(subtypingEClass, SUBTYPING__SUB_TYPE);
		createEReference(subtypingEClass, SUBTYPING__SUPER_TYPE);

		xbaseTransformationEClass = createEClass(XBASE_TRANSFORMATION);
		createEReference(xbaseTransformationEClass, XBASE_TRANSFORMATION__BODY);
		createEAttribute(xbaseTransformationEClass, XBASE_TRANSFORMATION__MAIN);
		createEReference(xbaseTransformationEClass, XBASE_TRANSFORMATION__PARAMETERS);
		createEReference(xbaseTransformationEClass, XBASE_TRANSFORMATION__RETURN_TYPE_REF);

		modelingElementEClass = createEClass(MODELING_ELEMENT);
		createEAttribute(modelingElementEClass, MODELING_ELEMENT__ECORE_URI);

		mappingEClass = createEClass(MAPPING);
		createEReference(mappingEClass, MAPPING__RULES);
		createEReference(mappingEClass, MAPPING__FROM);
		createEReference(mappingEClass, MAPPING__TO);

		classBindingEClass = createEClass(CLASS_BINDING);
		createEAttribute(classBindingEClass, CLASS_BINDING__FROM);
		createEAttribute(classBindingEClass, CLASS_BINDING__TO);
		createEReference(classBindingEClass, CLASS_BINDING__PROPERTIES);

		propertyBindingEClass = createEClass(PROPERTY_BINDING);
		createEAttribute(propertyBindingEClass, PROPERTY_BINDING__FROM);
		createEAttribute(propertyBindingEClass, PROPERTY_BINDING__TO);

		operatorEClass = createEClass(OPERATOR);
		createEReference(operatorEClass, OPERATOR__OWNING_LANGUAGE);

		languageOperatorEClass = createEClass(LANGUAGE_OPERATOR);
		createEReference(languageOperatorEClass, LANGUAGE_OPERATOR__TARGET_LANGUAGE);

		importEClass = createEClass(IMPORT);
		createEAttribute(importEClass, IMPORT__ECORE_URI);
		createEAttribute(importEClass, IMPORT__GENMODEL_URIS);
		createEReference(importEClass, IMPORT__MAPPING_RULES);

		mergeEClass = createEClass(MERGE);
		createEReference(mergeEClass, MERGE__MAPPING_RULES);

		sliceEClass = createEClass(SLICE);
		createEAttribute(sliceEClass, SLICE__ROOTS);
		createEReference(sliceEClass, SLICE__MAPPING_RULES);

		packageBindingEClass = createEClass(PACKAGE_BINDING);
		createEAttribute(packageBindingEClass, PACKAGE_BINDING__FROM);
		createEAttribute(packageBindingEClass, PACKAGE_BINDING__TO);
		createEReference(packageBindingEClass, PACKAGE_BINDING__CLASSES);

		languageEClass = createEClass(LANGUAGE);
		createEReference(languageEClass, LANGUAGE__OPERATORS);
		createEReference(languageEClass, LANGUAGE__EXACT_TYPE);
		createEReference(languageEClass, LANGUAGE__IMPLEMENTS);
		createEReference(languageEClass, LANGUAGE__REQUIRES);
		createEReference(languageEClass, LANGUAGE__SYNTAX);
		createEAttribute(languageEClass, LANGUAGE__EXACT_TYPE_NAME);
		createEAttribute(languageEClass, LANGUAGE__EXACT_TYPE_URI);
		createEAttribute(languageEClass, LANGUAGE__RESOURCE_TYPE);
		createEAttribute(languageEClass, LANGUAGE__RESOURCE_URI);
		createEReference(languageEClass, LANGUAGE__XTEXT_SETUP_REF);
		createEReference(languageEClass, LANGUAGE__MAPPINGS);
		createEReference(languageEClass, LANGUAGE__SEMANTICS);
		createEAttribute(languageEClass, LANGUAGE__XTEXT);
		createEAttribute(languageEClass, LANGUAGE__SIRIUS);
		createEAttribute(languageEClass, LANGUAGE__ECL);

		weaveEClass = createEClass(WEAVE);
		createEReference(weaveEClass, WEAVE__ASPECT_TYPE_REF);
		createEAttribute(weaveEClass, WEAVE__ASPECT_WILDCARD_IMPORT);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		// Create enums
		resourceTypeEEnum = createEEnum(RESOURCE_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XtypePackage theXtypePackage = (XtypePackage)EPackage.Registry.INSTANCE.getEPackage(XtypePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		XbasePackage theXbasePackage = (XbasePackage)EPackage.Registry.INSTANCE.getEPackage(XbasePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		metamodelEClass.getESuperTypes().add(this.getModelingElement());
		modelTypeEClass.getESuperTypes().add(this.getModelingElement());
		modelTypeEClass.getESuperTypes().add(this.getNamedElement());
		transformationEClass.getESuperTypes().add(this.getNamedElement());
		inheritanceEClass.getESuperTypes().add(this.getLanguageOperator());
		xbaseTransformationEClass.getESuperTypes().add(this.getTransformation());
		modelingElementEClass.getESuperTypes().add(this.getElement());
		mappingEClass.getESuperTypes().add(this.getElement());
		languageOperatorEClass.getESuperTypes().add(this.getOperator());
		importEClass.getESuperTypes().add(this.getOperator());
		mergeEClass.getESuperTypes().add(this.getLanguageOperator());
		sliceEClass.getESuperTypes().add(this.getLanguageOperator());
		languageEClass.getESuperTypes().add(this.getNamedElement());
		weaveEClass.getESuperTypes().add(this.getOperator());
		namedElementEClass.getESuperTypes().add(this.getElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(modelTypingSpaceEClass, ModelTypingSpace.class, "ModelTypingSpace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelTypingSpace_Elements(), this.getElement(), null, "elements", null, 0, -1, ModelTypingSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelTypingSpace_Imports(), theXtypePackage.getXImportSection(), null, "imports", null, 0, 1, ModelTypingSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelTypingSpace_Name(), theEcorePackage.getEString(), "name", null, 1, 1, ModelTypingSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementEClass, Element.class, "Element", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(metamodelEClass, Metamodel.class, "Metamodel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMetamodel_OwningLanguage(), this.getLanguage(), this.getLanguage_Syntax(), "owningLanguage", null, 1, 1, Metamodel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetamodel_GenmodelUris(), theEcorePackage.getEString(), "genmodelUris", null, 0, -1, Metamodel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelTypeEClass, ModelType.class, "ModelType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelType_SubtypingRelations(), this.getSubtyping(), this.getSubtyping_SubType(), "subtypingRelations", null, 0, -1, ModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelType_Extracted(), this.getLanguage(), this.getLanguage_ExactType(), "extracted", null, 0, 1, ModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelType_MtUri(), theEcorePackage.getEString(), "mtUri", null, 0, 1, ModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transformationEClass, Transformation.class, "Transformation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(aspectEClass, Aspect.class, "Aspect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAspect_AspectTypeRef(), theTypesPackage.getJvmTypeReference(), null, "aspectTypeRef", null, 1, 1, Aspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAspect_AspectedClass(), theEcorePackage.getEClass(), null, "aspectedClass", null, 0, 1, Aspect.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAspect_EcoreFragment(), theEcorePackage.getEPackage(), null, "ecoreFragment", null, 0, 1, Aspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAspect_OwningLanguage(), this.getLanguage(), this.getLanguage_Semantics(), "owningLanguage", null, 1, 1, Aspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inheritanceEClass, Inheritance.class, "Inheritance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(subtypingEClass, Subtyping.class, "Subtyping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubtyping_SubType(), this.getModelType(), this.getModelType_SubtypingRelations(), "subType", null, 1, 1, Subtyping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubtyping_SuperType(), this.getModelType(), null, "superType", null, 1, 1, Subtyping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(xbaseTransformationEClass, XbaseTransformation.class, "XbaseTransformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXbaseTransformation_Body(), theXbasePackage.getXExpression(), null, "body", null, 1, 1, XbaseTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXbaseTransformation_Main(), ecorePackage.getEBoolean(), "main", null, 0, 1, XbaseTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXbaseTransformation_Parameters(), theTypesPackage.getJvmFormalParameter(), null, "parameters", null, 0, -1, XbaseTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXbaseTransformation_ReturnTypeRef(), theTypesPackage.getJvmTypeReference(), null, "returnTypeRef", null, 0, 1, XbaseTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelingElementEClass, ModelingElement.class, "ModelingElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelingElement_EcoreUri(), ecorePackage.getEString(), "ecoreUri", null, 0, 1, ModelingElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mappingEClass, Mapping.class, "Mapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMapping_Rules(), this.getClassBinding(), null, "rules", null, 0, -1, Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMapping_From(), this.getLanguage(), this.getLanguage_Mappings(), "from", null, 0, 1, Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMapping_To(), this.getModelType(), null, "to", null, 0, 1, Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classBindingEClass, ClassBinding.class, "ClassBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClassBinding_From(), ecorePackage.getEString(), "from", null, 0, 1, ClassBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassBinding_To(), ecorePackage.getEString(), "to", null, 0, 1, ClassBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassBinding_Properties(), this.getPropertyBinding(), null, "properties", null, 0, -1, ClassBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyBindingEClass, PropertyBinding.class, "PropertyBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPropertyBinding_From(), ecorePackage.getEString(), "from", null, 0, 1, PropertyBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyBinding_To(), ecorePackage.getEString(), "to", null, 0, 1, PropertyBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operatorEClass, Operator.class, "Operator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperator_OwningLanguage(), this.getLanguage(), this.getLanguage_Operators(), "owningLanguage", null, 0, 1, Operator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(languageOperatorEClass, LanguageOperator.class, "LanguageOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLanguageOperator_TargetLanguage(), this.getLanguage(), null, "targetLanguage", null, 1, 1, LanguageOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImport_EcoreUri(), ecorePackage.getEString(), "ecoreUri", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImport_GenmodelUris(), ecorePackage.getEString(), "genmodelUris", null, 0, -1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImport_MappingRules(), this.getPackageBinding(), null, "mappingRules", null, 0, -1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mergeEClass, Merge.class, "Merge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMerge_MappingRules(), this.getPackageBinding(), null, "mappingRules", null, 0, -1, Merge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sliceEClass, Slice.class, "Slice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSlice_Roots(), ecorePackage.getEString(), "roots", null, 0, -1, Slice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSlice_MappingRules(), this.getPackageBinding(), null, "mappingRules", null, 0, -1, Slice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packageBindingEClass, PackageBinding.class, "PackageBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPackageBinding_From(), ecorePackage.getEString(), "from", null, 0, 1, PackageBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackageBinding_To(), ecorePackage.getEString(), "to", null, 0, 1, PackageBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackageBinding_Classes(), this.getClassBinding(), null, "classes", null, 0, -1, PackageBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(languageEClass, Language.class, "Language", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLanguage_Operators(), this.getOperator(), this.getOperator_OwningLanguage(), "operators", null, 0, -1, Language.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLanguage_ExactType(), this.getModelType(), this.getModelType_Extracted(), "exactType", null, 0, 1, Language.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLanguage_Implements(), this.getModelType(), null, "implements", null, 0, -1, Language.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLanguage_Requires(), this.getModelType(), null, "requires", null, 0, -1, Language.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLanguage_Syntax(), this.getMetamodel(), this.getMetamodel_OwningLanguage(), "syntax", null, 1, 1, Language.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLanguage_ExactTypeName(), theEcorePackage.getEString(), "exactTypeName", null, 0, 1, Language.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLanguage_ExactTypeUri(), theEcorePackage.getEString(), "exactTypeUri", null, 0, 1, Language.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLanguage_ResourceType(), this.getResourceType(), "resourceType", "MELANGE", 0, 1, Language.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLanguage_ResourceUri(), theEcorePackage.getEString(), "resourceUri", null, 0, 1, Language.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLanguage_XtextSetupRef(), theTypesPackage.getJvmTypeReference(), null, "xtextSetupRef", null, 0, 1, Language.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLanguage_Mappings(), this.getMapping(), this.getMapping_From(), "mappings", null, 0, -1, Language.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLanguage_Semantics(), this.getAspect(), this.getAspect_OwningLanguage(), "semantics", null, 0, -1, Language.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLanguage_Xtext(), ecorePackage.getEString(), "xtext", null, 0, -1, Language.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLanguage_Sirius(), ecorePackage.getEString(), "sirius", null, 0, -1, Language.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLanguage_Ecl(), ecorePackage.getEString(), "ecl", null, 0, -1, Language.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(weaveEClass, Weave.class, "Weave", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWeave_AspectTypeRef(), theTypesPackage.getJvmTypeReference(), null, "aspectTypeRef", null, 0, 1, Weave.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWeave_AspectWildcardImport(), theEcorePackage.getEString(), "aspectWildcardImport", null, 0, 1, Weave.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(resourceTypeEEnum, ResourceType.class, "ResourceType");
		addEEnumLiteral(resourceTypeEEnum, ResourceType.MELANGE);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.EMF);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.XTEXT);

		// Create resource
		createResource(eNS_URI);
	}

} //MelangePackageImpl
