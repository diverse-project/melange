package fr.inria.diverse.melange.processors

import com.google.common.collect.HashBasedTable
import com.google.inject.Inject
import fr.inria.diverse.melange.algebra.EmfCompareAlgebra
import fr.inria.diverse.melange.ast.ASTHelper
import fr.inria.diverse.melange.ast.AspectExtensions
import fr.inria.diverse.melange.ast.LanguageExtensions
import fr.inria.diverse.melange.ast.MetamodelExtensions
import fr.inria.diverse.melange.lib.EcoreExtensions
import fr.inria.diverse.melange.lib.ModelUtils
import fr.inria.diverse.melange.lib.slicing.ecore.StrictEcore
import fr.inria.diverse.melange.metamodel.melange.Import
import fr.inria.diverse.melange.metamodel.melange.Inheritance
import fr.inria.diverse.melange.metamodel.melange.Language
import fr.inria.diverse.melange.metamodel.melange.MelangeFactory
import fr.inria.diverse.melange.metamodel.melange.Merge
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace
import fr.inria.diverse.melange.metamodel.melange.PackageBinding
import fr.inria.diverse.melange.metamodel.melange.Slice
import fr.inria.diverse.melange.metamodel.melange.Weave
import fr.inria.diverse.melange.utils.EPackageProvider
import java.io.IOException
import java.util.ArrayList
import java.util.HashSet
import java.util.List
import java.util.Map
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.emf.ecore.EModelElement
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.EcoreFactory
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.xbase.jvmmodel.JvmTypeReferenceBuilder
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import fr.inria.diverse.melange.builder.ModelTypingSpaceBuilder
import fr.inria.diverse.melange.builder.LanguageBuilder

/**
 * This class build languages by merging differents parts declared in each language definitions
 * and generates new ecore & genmodel if needed
 */
class LanguageProcessor extends DispatchMelangeProcessor{
	
	@Inject extension ASTHelper
	@Inject extension EcoreExtensions
	@Inject ModelUtils modelUtils
	@Inject EmfCompareAlgebra algebra
	@Inject AspectsWeaver aspectWeaver
	@Inject EPackageProvider packageProvider
	@Inject extension AspectExtensions
	@Inject extension LanguageExtensions
	@Inject extension MetamodelExtensions
	@Inject JvmTypesBuilder typesBuilder
	@Inject JvmTypeReferenceBuilder.Factory typeRefBuilderFactory
	JvmTypeReferenceBuilder typeRefBuilder
	
	ModelTypingSpaceBuilder builder
	
	def dispatch void preProcess(ModelTypingSpace root, boolean isPreLinkingPhase) {
		typeRefBuilder = typeRefBuilderFactory.create(root.eResource.resourceSet)
		
		builder = new ModelTypingSpaceBuilder(root)
		
		root.languages.forEach[language |
			language.initialize
		]
		root.languages.forEach[language |
			val langBuilder = builder.getBuilder(language)
			build(langBuilder)
		]
	}
	
	/**
	 * Build {@link language} and register the root EPackage.
	 * {@link history} store languages waiting for this build.
	 */
	private def build(LanguageBuilder langBuilder){
		
		val language = langBuilder.source
		var syntax = langBuilder.model

		var List errors = new ArrayList //TODO: init with build errors if yet built
		if(syntax == null){
			errors = langBuilder.build() //TODO: manage errors & model not built
		}
		
		if(errors.isEmpty){
			packageProvider.registerPackages(language.syntax, syntax)
		}
	} 
	
	/**
 	 * Copy/Past from ModelingElementExtension
 	 */
	static def EPackage createEcore(List<EPackage> pkgs, String uri, String pkgUri) {
		val resSet = new ResourceSetImpl
		val res = resSet.createResource(URI::createURI(uri))
		val rootPkg = pkgs.head

		if (pkgUri !== null)
			rootPkg.nsURI = pkgUri

		val copy = EcoreUtil::copyAll(pkgs)

		// FIXME:
		copy.forEach[pkg |
			EcoreUtil.ExternalCrossReferencer.find(pkg).forEach[o, s |
				s.forEach[ss |
					if (ss.EStructuralFeature !== null && !ss.EStructuralFeature.derived && !ss.EStructuralFeature.many) {
						if (o instanceof EClassifier) {
							val corresponding = copy.map[EClassifiers].flatten.findFirst[name == o.name]
							if (corresponding !== null)
								ss.EObject.eSet(ss.EStructuralFeature, corresponding)
						} else if (o instanceof EReference) {
							if (o.EOpposite !== null) {
								val correspondingCls = copy.map[EClassifiers].flatten.findFirst[name == o.EContainingClass.name] as EClass
								val correspondingRef = correspondingCls.EReferences.findFirst[name == o.name]

								if (correspondingRef !== null)
									ss.EObject.eSet(ss.EStructuralFeature, correspondingRef)
							}
						}
					}
				]
			]
		]

		res.contents += copy

//		new Job("Serializing Ecore") {
//			override run(IProgressMonitor monitor) {
				try {
					res.save(null)
				} catch (IOException e) {
					e.printStackTrace
				}

//				return Status.OK_STATUS
//			}
//		}.schedule

		return rootPkg
	}
	
	/**
	 * Search in {@link rootPackage} for EClass named as in {@link classes}
	 */
	private def List<EModelElement> getClasses(EPackage rootPackage, List<String> classes){
		//TODO: manage sub packages
		val res = new ArrayList<EModelElement>()
		
		rootPackage.EClassifiers.filter(EClass).forEach[cl|
			if(classes.contains(cl.name)) res.add(cl)
		]
		
		return res
	}
	
	/**
	 * Return a copy of the part of language defined in {@link slice}
	 */
	private def EPackage applySlice(Slice slice){
		val sliceBase = EcoreUtil::copy(getRootPackage(slice.targetLanguage))
		
		val roots = getClasses(sliceBase, slice.roots)
		val slicer = new StrictEcore(roots,sliceBase,false,"ecore",false)
		slicer.slice
		
		val res = slicer.getclonedElts.filter(EPackage).filter[eContainer===null].head
		
		return res
	}
	
	/**
	 * Renames packages, classes & features from {@link model} according to the rules from {@link mappingRules}
	 */
	private def void applyRenaming(EPackage modelRoot, List<PackageBinding> mappingRules){
		if (mappingRules.empty)
			return;

		mappingRules.forEach[ packageRule |
			val sourcePack = if(modelRoot.name == packageRule.from) modelRoot else modelRoot.findSubPackage(packageRule.from.substring(packageRule.from.indexOf(".")+1))
			packageRule.classes.forEach[classRule |
				sourcePack.EClassifiers.filter(EClass).filter[name == classRule.from].forEach[ clazz |
					
					//Change name for properties
					classRule.properties.forEach[propertyRule |
						var EStructuralFeature target = clazz.EReferences.findFirst[name == propertyRule.from]
						if(target == null) target = clazz.EAttributes.findFirst[name == propertyRule.from]
						
						if(target != null) target.name = propertyRule.to
					]
					
					//Change name for classes
					clazz.name = classRule.to
				]
			]
		]
		
		//Build new package hierachy
		val oldRootName = modelRoot.name
		val renamedPackages = new HashSet<EPackage>() 
		val targetedPackages = new HashSet<EPackage>()
		mappingRules.forEach[ packageRule |
			val oldPackages = packageRule.from.split("\\.")
			val newPackages = packageRule.to.split("\\.")

			//Register source packages
			var current = modelRoot
			for(var int i = 1; i < oldPackages.size; i++){
				val packName = oldPackages.get(i)
				current = current.ESubpackages.findFirst[name == packName]
			}
			renamedPackages.add(current)
			
			//Register targeted packages & Creates new packages
			current = modelRoot
			targetedPackages.add(current)
			for(var int i = 1; i < newPackages.size; i++){
				val packName = newPackages.get(i)
				var nextCurrent = current.ESubpackages.findFirst[name == packName]
				if(nextCurrent == null){
					nextCurrent = EcoreFactory.eINSTANCE.createEPackage
					nextCurrent.name = packName
					nextCurrent.nsPrefix = packName
					nextCurrent.nsURI = current.nsURI+packName+"/"
					current.ESubpackages.add(nextCurrent)
				}
				current = nextCurrent
				targetedPackages.add(current)
			}
			
			if(newPackages.head != modelRoot.name){
				modelRoot.name = newPackages.head
			}
		]
		
		//Register classes to be moved
		val movedClasses = HashBasedTable.create
		val movedPackages = HashBasedTable.create
		mappingRules.forEach[ packageRule |
			val sourcePack = if(oldRootName == packageRule.from) modelRoot else modelRoot.findSubPackage(packageRule.from.substring(packageRule.from.indexOf(".")+1))
			val targetPack = if(modelRoot.name == packageRule.to) modelRoot else modelRoot.findSubPackage(packageRule.to.substring(packageRule.to.indexOf(".")+1))
			
			if(sourcePack != targetPack){
				val classes = new ArrayList(sourcePack.EClassifiers)
				movedClasses.put(sourcePack,targetPack,classes)
				
				val subPackages = new ArrayList(sourcePack.ESubpackages)
				subPackages.removeAll(targetedPackages)
				subPackages.removeAll(renamedPackages)
				movedPackages.put(sourcePack,targetPack,subPackages)
			}
		]
		
		//Move classes
		movedClasses.cellSet.forEach[cell |
			val sourcePack = cell.rowKey
			val targetPack = cell.columnKey
			val classes = cell.value
			targetPack.EClassifiers.addAll(classes)
			sourcePack.EClassifiers.remove(classes)
			
		]
		//Move subpackages
		movedPackages.cellSet.forEach[cell |
			val sourcePack = cell.rowKey
			val targetPack = cell.columnKey
			val subPackages = cell.value
			targetPack.ESubpackages.addAll(subPackages)
			sourcePack.ESubpackages.remove(subPackages)
			
			//Deleted renamed packages
			if(!targetedPackages.contains(sourcePack)){
				sourcePack.ESuperPackage.ESubpackages.remove(sourcePack)
			}
		]
		
	}

	/**
	 * Initialize syntax & semantics
	 */
	def void initialize(Language language) {
		
		language.syntax = MelangeFactory.eINSTANCE.createMetamodel
		if (language.isGeneratedByMelange) {
			language.syntax.ecoreUri = language.externalEcoreUri
			language.syntax.genmodelUris += language.externalGenmodelUri 
		} else {
			val importClause = language.operators.filter(Import).head
			if (importClause !== null){
				language.syntax.ecoreUri = importClause.ecoreUri
				language.syntax.genmodelUris += importClause.genmodelUris
			}
		}
		
		language.semantics.clear
		language.semantics += language.operators.filter(Weave)
		.filter[aspectTypeRef?.type instanceof JvmDeclaredType]
		.map[w |
			// FIXME: Some checks needed here
			MelangeFactory.eINSTANCE.createAspect => [
				aspectTypeRef = typesBuilder.cloneWithProxies(w.aspectTypeRef)
				val className = aspectTypeRef.aspectAnnotationValue
				if (className !== null){
					aspectedClass = language.syntax.findClass(className)
				}
			]
		]
	}
}
