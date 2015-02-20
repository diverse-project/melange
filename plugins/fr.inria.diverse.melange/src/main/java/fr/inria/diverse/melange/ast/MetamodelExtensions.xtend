package fr.inria.diverse.melange.ast

import com.google.common.collect.Lists

import com.google.inject.Inject

import fr.inria.diverse.melange.algebra.ModelTypeAlgebra

import fr.inria.diverse.melange.lib.EcoreExtensions

import fr.inria.diverse.melange.metamodel.melange.Aspect
import fr.inria.diverse.melange.metamodel.melange.Metamodel
import fr.inria.diverse.melange.metamodel.melange.ModelType

import fr.inria.diverse.melange.utils.EPackageProvider

import java.io.IOException

import java.util.List

import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.ResourcesPlugin

import org.eclipse.core.runtime.Path

import org.eclipse.emf.codegen.ecore.genmodel.GenJDKLevel
import org.eclipse.emf.codegen.ecore.genmodel.GenModel
import org.eclipse.emf.codegen.ecore.genmodel.GenModelFactory
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenBaseGeneratorAdapter

import org.eclipse.emf.codegen.ecore.genmodel.util.GenModelUtil

import org.eclipse.emf.common.util.BasicMonitor
import org.eclipse.emf.common.util.URI

import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EcorePackage

import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl

import org.eclipse.xtext.common.types.JvmCustomAnnotationValue
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.common.types.JvmTypeAnnotationValue

import org.eclipse.xtext.naming.IQualifiedNameConverter
import org.eclipse.xtext.naming.QualifiedName

import org.eclipse.xtext.xbase.XFeatureCall

class MetamodelExtensions
{
	@Inject extension ModelingElementExtensions
	@Inject extension EcoreExtensions
	@Inject extension ModelTypeExtensions
	@Inject extension IQualifiedNameConverter
	@Inject extension NamingHelper
	@Inject ModelTypeAlgebra algebra
	@Inject EPackageProvider provider

	def List<GenModel> getGenmodels(Metamodel mm) {
		return provider.getGenModels(mm)
	}

	def boolean getCanGenerate(Metamodel mm) {
		return !mm.pkgs.empty && !mm.genmodels.empty && mm.aspects.forall[aspectedClass !== null]
	}

	def List<Aspect> allAspects(Metamodel mm) {
		val ret = newArrayList

		ret += mm.aspects

		if (mm.hasSuperMetamodel)
			ret += mm.inheritanceRelation.superMetamodel.allAspects

		return ret
	}

	def boolean isTypedBy(Metamodel mm, ModelType mt) {
		return algebra.isTypedBy(mm, mt)
	}

	def boolean hasSuperMetamodel(Metamodel mm) {
		return mm.inheritanceRelation?.superMetamodel !== null
	}

	def String getAspectAnnotationValue(Aspect asp) {
		return (asp.aspectTypeRef.type as JvmDeclaredType)?.aspectAnnotationValue
	}

	def String getAspectAnnotationValue(JvmDeclaredType t) {
		// TODO: Remove hard-stringed dependency
		val aspAnn = t.annotations.findFirst[annotation?.qualifiedName == "fr.inria.diverse.k3.al.annotationprocessor.Aspect"]
		val aspClassName = aspAnn?.values?.findFirst[valueName == "className"]
		val aspVal = switch aspClassName {
			JvmTypeAnnotationValue: aspClassName.values?.head?.simpleName
			JvmCustomAnnotationValue: aspClassName.values?.head?.toString
		}

		if (aspVal !== null && aspVal.contains("."))
			return aspVal.substring(aspVal.lastIndexOf(".") + 1, aspVal.length)

		return aspVal
	}

	def String getAspectAnnotationValueType(JvmDeclaredType t) {
		val aspAnn = t.annotations.findFirst[annotation?.qualifiedName == "fr.inria.diverse.k3.al.annotationprocessor.Aspect"]
		val aspClassName = aspAnn?.values?.findFirst[valueName == "className"]
		val aspVal = switch aspClassName {
			JvmTypeAnnotationValue: aspClassName.values?.head?.qualifiedName
			JvmCustomAnnotationValue: {
				val feature = aspClassName.values?.head as XFeatureCall
				feature.feature.qualifiedName
			}
		}

		return aspVal
	}

	def QualifiedName getTargetedNamespace(Aspect asp) {
		return (asp.aspectTypeRef.type as JvmDeclaredType).aspectAnnotationValueType.toQualifiedName.skipLast(1)
	}

	def boolean isDefinedOver(Aspect asp, Metamodel mm) {
		return mm.packageFqn.toQualifiedName.skipLast(1).toString == asp.targetedNamespace.toString
	}

	// FIXME: We should check that the original mm is a super-type of mm
	// Hard to find the metamodel declaration or the corresponding Ecore file
	// in the workspace...
	def boolean canBeCopiedFor(Aspect asp, Metamodel mm) {
		return true
	}


	def EClass findClass(Metamodel mm, String clsName) {
		return mm.allClasses.filter(EClass).findFirst[name == clsName]
	}

	def EClassifier findClassifier(Metamodel mm, String clsName) {
		return mm.allClassifiers.filter(EClassifier).findFirst[name == clsName]
	}

	def EClassifier findClassifierFor(Metamodel mm, String clsName) {
		val cls = mm.findClass(clsName)
		if (cls !== null)
			return cls

		val dt = EcorePackage.eINSTANCE.findClassifier("E" + clsName.toFirstUpper)
		if (dt !== null)
			return dt
	}

	def List<EPackage> getAllSubPkgs(Metamodel mm) {
		return mm.pkgs.head.allSubPkgs
	}

	def boolean hasAdapterFor(Metamodel mm, ModelType mt, EClassifier cls) {
		return mm.hasAdapterFor(mt, cls.name)
	}

	def boolean hasAdapterFor(Metamodel mm, ModelType mt, String find) {
		return
		   mm.^implements.exists[name == mt.name]
		&& mm.allClasses.exists[name == find]
		&& mt.allClasses.exists[name == find]
	}

	def Iterable<EClassifier> getAllClassifiers(Metamodel mm) {
		return mm.pkgs.map[EClassifiers].flatten
	}

	def Iterable<EClass> getAllClasses(Metamodel mm) {
		return mm.allClassifiers.filter(EClass)
	}

	def boolean isUml(Metamodel mm, EClassifier cls) {
		return mm.pkgs.findFirst[EClassifiers.exists[name == cls.name]] == "uml"
	}

	// FIXME: Create referenced EClass if they don't exist yet
	// FIXME: Consider finding EClassifier, not EClass
	/*def void weaveAspect(Metamodel mm, EClass cls, JvmDeclaredType asp) {
		asp.declaredOperations
		.filter[
			   !simpleName.startsWith("_privk3")
			&& !simpleName.startsWith("super_")
			//&& parameters.head?.name == "_self"
			&& !annotations.exists[annotation.simpleName == "OverrideAspectMethod"]
			&& visibility == JvmVisibility.PUBLIC
		]
		.forEach[op |
			val featureName = findFeatureNameFor(asp, op)
			if (featureName === null) {
				val retCls = mm.findClassifierFor(op.returnType.simpleName)

				// FIXME
				if (!cls.EOperations.exists[name == op.simpleName]) {
					cls.EOperations += EcoreFactory.eINSTANCE.createEOperation => [
						name = op.simpleName
						op.parameters.forEach[p, i |
							if (i > 0) {
								val attrCls = mm.findClassifierFor(p.parameterType.simpleName)

								EParameters += EcoreFactory.eINSTANCE.createEParameter => [pp |
									pp.name = p.simpleName
									pp.EType = if (attrCls !== null) attrCls else cls.EPackage.getOrCreateDataType(p.parameterType.simpleName, p.parameterType.qualifiedName)
								]
							}
						]
						if (op.returnType.simpleName != "void")
							EType = if (retCls !== null) retCls else cls.EPackage.getOrCreateDataType(op.returnType.simpleName, op.returnType.qualifiedName)
						EAnnotations += EcoreFactory.eINSTANCE.createEAnnotation => [source = "aspect"]
					]
				}
			} else if (!cls.EStructuralFeatures.exists[name == featureName]) {
				val retType =
					if (op.simpleName.startsWith("get") || op.parameters.size == 1)
						op.returnType.type
					else
						op.parameters.get(1).parameterType.type
				val upperB = if (Collection.isAssignableFrom(retType.class)) -1 else 1
				val realType =
					if (
						   Collection.isAssignableFrom(retType.class)
						&& retType instanceof JvmTypeParameterDeclarator
					)
						(retType as JvmTypeParameterDeclarator).typeParameters.head
					else
						retType

				val find = mm.findClass(realType.simpleName)
				val dt = EcorePackage.eINSTANCE.findClassifier("E" + realType.simpleName.toFirstUpper)
				if (find !== null) {
					// Create EReference
					cls.EStructuralFeatures += EcoreFactory.eINSTANCE.createEReference => [
						name = featureName
						EType = find
						upperBound = upperB
						EAnnotations += EcoreFactory.eINSTANCE.createEAnnotation => [source = "aspect"]
					]
				} else if (dt !== null) {
					// Create EAttribute
					cls.EStructuralFeatures += EcoreFactory.eINSTANCE.createEAttribute => [
						name = featureName
						EType = dt
						upperBound = upperB
						EAnnotations += EcoreFactory.eINSTANCE.createEAnnotation => [source = "aspect"]
					]
				} else {
					// Create new EClass or fix the referenced type
					// For now, create appropriate datatype with instanceTypeName
					cls.EStructuralFeatures += EcoreFactory.eINSTANCE.createEAttribute => [
						name = featureName
						EType = cls.EPackage.getOrCreateDataType(realType.simpleName, realType.qualifiedName)
						upperBound = upperB
						EAnnotations += EcoreFactory.eINSTANCE.createEAnnotation => [source = "aspect"]
					]
				}
			}
		]
	}*/

	def void createLocalEcore(Metamodel mm) {
		mm.createEcore(mm.localEcoreUri)
	}

	def void createLocalGenmodel(Metamodel mm) {
		mm.createGenmodel(mm.localEcoreUri, mm.localGenmodelUri, mm.localGenerationPath)
	}

	def void createExternalEcore(Metamodel mm) {
		mm.createEcore(mm.externalEcoreUri)
	}

	def void createExternalGenmodel(Metamodel mm) {
		mm.createGenmodel(mm.externalEcoreUri, mm.externalGenmodelUri, mm.externalGenerationPath)
	}

	def String getLocalEcorePath(Metamodel mm) {
		return '''../«mm.project.name»/model-gen/«mm.name».ecore'''
	}

	def String getLocalGenmodelPath(Metamodel mm) {
		return '''../«mm.project.name»/model-gen/«mm.name».genmodel'''
	}

	def String getLocalGenerationPath(Metamodel mm) {
		return '''../«mm.project.name»/emf-gen/'''
	}

	def String getExternalEcorePath(Metamodel mm) {
		return '''../«mm.externalRuntimeName»/model/«mm.name».ecore'''
	}

	def String getExternalGenmodelPath(Metamodel mm) {
		return '''../«mm.externalRuntimeName»/model/«mm.name».genmodel'''
	}

	def String getExternalGenerationPath(Metamodel mm) {
		return '''../«mm.externalRuntimeName»/src/'''
	}

	def String getLocalEcoreUri(Metamodel mm) {
		return '''platform:/resource/«mm.project.name»/model-gen/«mm.name».ecore'''
	}

	def String getLocalGenmodelUri(Metamodel mm) {
		return '''platform:/resource/«mm.project.name»/model-gen/«mm.name».genmodel'''
	}

	def String getExternalEcoreUri(Metamodel mm) {
		return '''platform:/resource/«mm.externalRuntimeName»/model/«mm.name».ecore'''
	}

	def String getExternalGenmodelUri(Metamodel mm) {
		return '''platform:/resource/«mm.externalRuntimeName»/model/«mm.name».genmodel'''
	}

	def String getExternalRuntimeName(Metamodel mm) {
		if (mm.ecoreUri !== null) {
			val originalProjectName = URI::createURI(mm.ecoreUri).segment(1)

			return originalProjectName
		} else if (mm.inheritanceRelation.superMetamodel.ecoreUri !== null) {
			val originalProjectName = URI::createURI(mm.inheritanceRelation.superMetamodel.ecoreUri).segment(1)
			val newProjectName = originalProjectName.toQualifiedName.skipLast(1).append(mm.name.toLowerCase).append("model")

			return newProjectName.toString
		}
	}

	def String getExternalAspectsRuntimeName(Metamodel mm) {
		return mm.name.toLowerCase + ".aspects"
	}

	def boolean isGeneratedByMelange(Metamodel mm) {
		return mm.inheritanceRelation?.superMetamodel !== null
	}

	def boolean getRuntimeHasBeenGenerated(Metamodel mm) {
		if (mm.isGeneratedByMelange) {
			val segments = newArrayList
			val gp = mm.genmodels.head?.genPackages?.head

			if (gp === null)
				return false

			if (gp.basePackage !== null && gp.basePackage.length > 0)
				segments += gp.basePackage
			if (gp.prefix !== null && gp.prefix.length > 0)
				segments += gp.prefix

			val fqn = QualifiedName::create(segments).toString.toLowerCase
			if ((
				   mm.project.getFile(mm.localEcorePath).exists
				&& mm.project.getFile(mm.localGenmodelPath).exists
				&& mm.project.getFolder(mm.localGenerationPath + fqn).exists
			) || (
				   mm.project.getFile(mm.externalEcorePath).exists
				&& mm.project.getFile(mm.externalGenmodelPath).exists
				&& mm.project.getFolder(mm.externalGenerationPath + fqn).exists
			))
				return true
			else return false
		} else
			return true
	}

	def void generateCode(GenModel genModel) {
		genModel.reconcile
		genModel.canGenerate = true
		genModel.validateModel = true

		val generator = GenModelUtil::createGenerator(genModel)
		generator.generate(
			genModel,
			GenBaseGeneratorAdapter::MODEL_PROJECT_TYPE,
			new BasicMonitor.Printing(System::out)
		)
	}

	def IProject getProject(Metamodel mm) {
		val res = mm.eResource

		return
			if (res !== null)
				ResourcesPlugin.workspace.root.getFile(new Path(res.URI.toPlatformString(true))).project
			else null
	}

	def private void createEcore(Metamodel mm, String uri) {
		val resSet = new ResourceSetImpl
		val res = resSet.createResource(URI::createURI(uri))
		res.contents += mm.pkgs.head

		try {
			res.save(null)
		} catch (IOException e) {
			e.printStackTrace
		}
	}

	def private void createGenmodel(Metamodel mm, String ecoreUri, String gmUri, String modelDirectory) {
		val genmodel = GenModelFactory.eINSTANCE.createGenModel => [
			it.complianceLevel = GenJDKLevel.JDK70_LITERAL
			it.modelDirectory = modelDirectory.replaceFirst("platform:/resource", "").replaceFirst("..", "")
			it.foreignModel += ecoreUri
			it.modelName = mm.name
			it.modelPluginID = mm.externalRuntimeName
			it.initialize(Lists::newArrayList(mm.pkgs))
		]

		val resSet = new ResourceSetImpl
		val res = resSet.createResource(URI::createURI(gmUri))
		res.contents += genmodel

		try {
			res.save(null)
		} catch (IOException e) {
			e.printStackTrace
		}
	}
}
