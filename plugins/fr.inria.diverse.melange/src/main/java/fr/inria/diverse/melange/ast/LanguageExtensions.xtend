package fr.inria.diverse.melange.ast

import com.google.inject.Inject
import fr.inria.diverse.melange.algebra.ModelTypeAlgebra
import fr.inria.diverse.melange.eclipse.EclipseProjectHelper
import fr.inria.diverse.melange.metamodel.melange.Aspect
import fr.inria.diverse.melange.metamodel.melange.Import
import fr.inria.diverse.melange.metamodel.melange.Inheritance
import fr.inria.diverse.melange.metamodel.melange.Language
import fr.inria.diverse.melange.metamodel.melange.MelangeFactory
import fr.inria.diverse.melange.metamodel.melange.Merge
import fr.inria.diverse.melange.metamodel.melange.ModelType
import fr.inria.diverse.melange.metamodel.melange.Slice
import fr.inria.diverse.melange.metamodel.melange.Weave
import fr.inria.diverse.melange.utils.AspectCopier
import java.util.List
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.xtext.naming.IQualifiedNameConverter
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.xbase.jvmmodel.JvmTypeReferenceBuilder
import fr.inria.diverse.melange.metamodel.melange.PackageBinding
import fr.inria.diverse.melange.metamodel.melange.Operator
import org.eclipse.core.resources.IWorkspace
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.IWorkspaceRoot
import org.eclipse.jdt.core.JavaCore
import org.eclipse.jdt.core.IClasspathEntry
import org.eclipse.core.runtime.Path
import org.eclipse.jdt.core.dom.ASTParser
import org.eclipse.jdt.core.dom.AST
import org.eclipse.jdt.core.dom.CompilationUnit
import org.eclipse.jdt.core.dom.ASTVisitor
import org.eclipse.jdt.core.dom.ImportDeclaration
import org.eclipse.text.edits.TextEdit
import org.eclipse.jface.text.Document
import org.eclipse.jdt.core.dom.Name
import fr.inria.diverse.melange.utils.AspectRenamer

class LanguageExtensions
{
	@Inject extension ModelingElementExtensions
	@Inject extension MetamodelExtensions
	@Inject extension AspectExtensions
	@Inject extension ModelTypeExtensions
	@Inject extension IQualifiedNameConverter
	@Inject extension EclipseProjectHelper
	@Inject ModelTypeAlgebra algebra
	@Inject AspectCopier copier
	@Inject AspectRenamer renamer
	@Inject JvmTypeReferenceBuilder.Factory builderFactory

	def List<Language> getSuperLanguages(Language l) {
		return l.operators.filter(Inheritance).map[superLanguage].toList
	}

	def boolean getIsComplete(Language l) {
		return l.syntax !== null && l.syntax.isComplete
	}

	/**
	 * Get all aspects defined on the language.
	 * The priority order is: <br>
	 * 1) Aspects explicitly defined in the definition of {@link l}, in top->bottom order <br>
	 * 2) From Merge relations, in top->bottom order
	 * 3) From Inheritance relations, in the left->right order <br>
	 */
	def List<Aspect> allAspects(Language l) {
		val res = newArrayList
		
		res.addAll(l.semantics)
		res.addAll(
			l.operators.map[op |
				if (op instanceof Slice)
					op.slicedLanguage.allAspects
				else if (op instanceof Merge)
					op.mergedLanguage.allAspects
				else
					newArrayList
			].flatten
		)
		res.addAll(l.superLanguages.map[allAspects].flatten)
		
		return res
	}

	def Iterable<Aspect> findAspectsOn(Language l, EClass cls) {
		return
			l.allAspects.filter[asp |
				asp.aspectedClass?.name !== null
				&& (
				   asp.aspectedClass.name == cls.name
				|| cls.EAllSuperTypes.exists[asp.aspectedClass.name == name]
				)
			]
	}

	def boolean isTypedBy(Language l, ModelType mt) {
		return algebra.isTypedBy(l, mt)
	}

	def boolean hasSuperLanguage(Language l) {
		return l.operators.filter(Inheritance).exists[superLanguage !== null]
	}

	def boolean hasAdapterFor(Language l, ModelType mt, EClassifier cls) {
		return l.hasAdapterFor(mt, cls.name)
	}

	def boolean hasAdapterFor(Language l, ModelType mt, String find) {
		return
		   l.^implements.exists[name == mt.name]
		&& l.syntax.allClasses.exists[name == find]
		&& mt.allClasses.exists[name == find]
	}

	def boolean isUml(Language l, EClassifier cls) {
		return l.syntax.pkgs.findFirst[EClassifiers.exists[name == cls.name]] == "uml"
	}

	def void createLocalEcore(Language l) {
		l.syntax.createEcore(l.localEcoreUri)
	}

	def void createLocalGenmodel(Language l) {
		l.syntax.createGenmodel(l.localEcoreUri, l.localGenmodelUri, l.localGenerationPath)
	}

	def void createExternalEcore(Language l) {
		l.syntax.createEcore(l.externalEcoreUri)
	}

	def void createExternalGenmodel(Language l) {
		l.syntax.createGenmodel(l.externalEcoreUri, l.externalGenmodelUri, l.externalGenerationPath)
	}

	def String getLocalEcorePath(Language l) {
		return '''../«l.eResource.project.name»/model-gen/«l.name».ecore'''
	}

	def String getLocalGenmodelPath(Language l) {
		return '''../«l.eResource.project.name»/model-gen/«l.name».genmodel'''
	}

	def String getLocalGenerationPath(Language l) {
		return '''../«l.eResource.project.name»/emf-gen/'''
	}

	def String getExternalEcorePath(Language l) {
		return '''../«l.externalRuntimeName»/model/«l.name».ecore'''
	}

	def String getExternalGenmodelPath(Language l) {
		return '''../«l.externalRuntimeName»/model/«l.name».genmodel'''
	}

	def String getExternalGenerationPath(Language l) {
		return '''../«l.externalRuntimeName»/src/'''
	}

	def String getLocalEcoreUri(Language l) {
		return '''platform:/resource/«l.eResource.project.name»/model-gen/«l.name».ecore'''
	}

	def String getLocalGenmodelUri(Language l) {
		return '''platform:/resource/«l.eResource.project.name»/model-gen/«l.name».genmodel'''
	}

	def String getExternalEcoreUri(Language l) {
		return '''platform:/resource/«l.externalRuntimeName»/model/«l.name».ecore'''
	}

	def String getExternalGenmodelUri(Language l) {
		return '''platform:/resource/«l.externalRuntimeName»/model/«l.name».genmodel'''
	}

	/**
	 * Get the name of the project containing Java classes reifying the metamodel {@link mm}
	 */
	def String getExternalRuntimeName(Language l) {
		if (l.syntax.ecoreUri !== null) {
			val originalProjectName = URI::createURI(l.syntax.ecoreUri).segment(1)

			return originalProjectName
		}
		else{
			return l.name + "_Gen"
		}
//		 else if (mm.inheritanceRelation.superMetamodel.ecoreUri !== null) {
//			val originalProjectName = URI::createURI(mm.inheritanceRelation.superMetamodel.ecoreUri).segment(1)
//			
//			// compute a name as smartly as possible and try to follow the user naming convention
//			if (originalProjectName.toQualifiedName.segmentCount == 1){
//				return mm.name.toLowerCase
//			} else { 
//				if(originalProjectName.toQualifiedName.lastSegment.equals("model")){
//					return originalProjectName.toQualifiedName.skipLast(1).append(mm.name.toLowerCase).append("model").toString
//				} else {
//					return originalProjectName.toQualifiedName.append(mm.name.toLowerCase).toString
//				}
//				
//			}
//		}
	}

	def String getExternalAspectsRuntimeName(Language l) {
		val externalRuntimeName = l.externalRuntimeName.toQualifiedName
		if ("model" == externalRuntimeName.lastSegment)
			return externalRuntimeName.skipLast(1).append("aspects").toString
		else
			return externalRuntimeName.append("aspects").toString
	}

	/**
	 * Returns true if {@link l} must be generated by Melange.
	 */
	def boolean isGeneratedByMelange(Language l) {
		return
			   !l.operators.filter(Inheritance).empty
			|| !l.operators.filter(Merge).empty
			|| !l.operators.filter(Slice).empty
			|| l.operators.filter(Import).size > 1
	}

	/**
	 * Return true if ecore, genmodel & generated EMF packages can be found
	 * for the language {@link l}.
	 */
	def boolean getRuntimeHasBeenGenerated(Language l) {
		if (l.isGeneratedByMelange) {
			val segments = newArrayList
			val gp = l.syntax.genmodels.head?.genPackages?.head
			val project = l.eResource.project

			if (gp === null || project === null)
				return false

			if (gp.basePackage !== null && gp.basePackage.length > 0)
				segments += gp.basePackage
			if (gp.prefix !== null && gp.prefix.length > 0)
				segments += gp.prefix

			val fqn = QualifiedName::create(segments).toString.toLowerCase
			if ((
				   project.getFile(l.localEcorePath).exists
				&& project.getFile(l.localGenmodelPath).exists
				&& project.getFolder(l.localGenerationPath + fqn).exists
			) || (
				   project.getFile(l.externalEcorePath).exists
				&& project.getFile(l.externalGenmodelPath).exists
				&& project.getFolder(l.externalGenerationPath + fqn).exists
			))
				return true
			else return false
		} else
			return false
	}

	/**
	 * Copy aspects defined on {@link l} into generated project <br>
	 * Return a list of created Aspects with type references to the copied classes
	 */
	def List<Aspect> createExternalAspects(Language l) {
		val res = newArrayList
		val classesAlreadyWeaved = newArrayList
		
		//Copy sem
		res += simpleCopyAsp(l,l.semantics,classesAlreadyWeaved,null,null)
		//Copy+rename op
		l.operators.forEach[op |
				var List<Aspect> aspects = null
				var List<PackageBinding> renamingRules = null
				if (op instanceof Slice){
					aspects = (op as Slice).slicedLanguage.allAspects
					renamingRules= (op as Slice).mappingRules
				} 
				else if (op instanceof Merge){
					aspects = (op as Merge).mergedLanguage.allAspects
					renamingRules= (op as Merge).mappingRules
				}
				
				if(aspects != null){
					if(renamingRules != null){ 
						//Copy with Renaming
						//TODO: classes, packages & features
						val List<Pair<String,String>> classRules = newArrayList
						val List<Pair<String,String>> packageRules = newArrayList
						renamingRules.forEach[packRule |
							packageRules += packRule.from -> packRule.to
							packRule.classes.forEach[classRule |
								classRules += packRule.from+"."+classRule.from -> packRule.to+"."+classRule.to
							]
						]
						res += simpleCopyAsp(l,aspects,classesAlreadyWeaved,classRules,packageRules)
						
						aspects.forEach[asp |
							renamer.processRenaming(asp,l,classRules,packageRules)
						]
					}
					else{
						//Copy without renaming
						res += simpleCopyAsp(l,aspects,classesAlreadyWeaved,null,null)
					}
				}
			]
		//Copy super lang
		res += simpleCopyAsp(l,l.superLanguages.map[allAspects].flatten,classesAlreadyWeaved,null,null)
		
		return res
	}
	
	/**
	 * Copy aspects defined on {@link l} into generated project <br>
	 * Return a list of created Aspects with type references to the copied classes
	 */
	private def List<Aspect> simpleCopyAsp(Language l, Iterable<Aspect> aspects, List<String> classesAlreadyWeaved, List<Pair<String,String>> classRenaming, List<Pair<String,String>> packageRenaming){
		val res = newArrayList
		aspects.forEach[asp |
			if (asp.isComplete) {
				if (asp.canBeCopiedFor(l.syntax)) {
					
					var className = asp.aspectAnnotationValue
					val renaming = classRenaming.findFirst[it.key == asp.aspectedClassFqName]
					if(renaming != null) className = renaming.value.substring(renaming.value.lastIndexOf(".")+1)
					
					if(!classesAlreadyWeaved.contains(className) && (l.syntax.findClass(className) !== null)){
						classesAlreadyWeaved.add(className)
						
						val typeRefBuilder = builderFactory.create(l.eResource.resourceSet)
						val newAspectFqn = copier.copyAspectTo(asp, l)
						res += MelangeFactory.eINSTANCE.createAspect => [
									aspectTypeRef = typeRefBuilder.typeRef(newAspectFqn)
								]
					}
				}
			}
		]
		return res
	}
}
