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
import com.google.inject.Injector

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
	
	@Inject ModelTypingSpaceBuilder builder
	
	def dispatch void preProcess(ModelTypingSpace root, boolean isPreLinkingPhase) {
		typeRefBuilder = typeRefBuilderFactory.create(root.eResource.resourceSet)
		
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
