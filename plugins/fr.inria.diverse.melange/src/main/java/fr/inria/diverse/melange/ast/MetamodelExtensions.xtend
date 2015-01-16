package fr.inria.diverse.melange.ast

import com.google.common.collect.Lists

import com.google.inject.Inject

import fr.inria.diverse.melange.algebra.ModelTypeAlgebra

import fr.inria.diverse.melange.lib.EcoreExtensions
import fr.inria.diverse.melange.lib.ModelUtils

import fr.inria.diverse.melange.metamodel.melange.Aspect
import fr.inria.diverse.melange.metamodel.melange.Metamodel
import fr.inria.diverse.melange.metamodel.melange.ModelType

import fr.inria.diverse.melange.utils.AspectToEcore
import fr.inria.diverse.melange.utils.EPackageRegistry

import java.io.IOException

import java.util.Collection
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
import org.eclipse.emf.ecore.EcoreFactory
import org.eclipse.emf.ecore.EcorePackage

import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl

import org.eclipse.xtext.common.types.JvmCustomAnnotationValue
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.common.types.JvmTypeAnnotationValue
import org.eclipse.xtext.common.types.JvmTypeParameterDeclarator
import org.eclipse.xtext.common.types.JvmVisibility

class MetamodelExtensions
{
	@Inject extension ModelingElementExtensions
	@Inject extension EcoreExtensions
	@Inject extension ModelTypeExtensions
	@Inject extension AspectToEcore
	@Inject ModelUtils modelUtils
	@Inject ModelTypeAlgebra algebra
	@Inject EPackageRegistry registry

	def List<GenModel> getGenmodels(Metamodel mm) {
		return registry.getGenModels(mm)
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
	def void weaveAspect(Metamodel mm, EClass cls, JvmDeclaredType asp) {
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
	}

	def void createEcore(EPackage pkg, String uri) {
		val resSet = new ResourceSetImpl
    	val res = resSet.createResource(URI.createURI(uri))
    	res.contents.add(pkg.copy)

		try {
			res.save(null)
		} catch (IOException e) {
			e.printStackTrace
		}
	}

	def void createEcore(Metamodel mm) {
		val resSet = new ResourceSetImpl
    	val res = resSet.createResource(URI.createURI(mm.generationFolder + mm.name + ".ecore"))
    	res.contents.add(mm.pkgs.head.copy)

		try {
			res.save(null)
		} catch (IOException e) {
			e.printStackTrace
		}
	}

	def void createExtendedMetamodel(Metamodel mm, String uri) {
		val resSet = new ResourceSetImpl
		val res = resSet.createResource(URI.createURI(uri))
		res.contents.addAll(mm.pkgs.map[copy])

		try {
			res.save(null)
		} catch (IOException e) {
			e.printStackTrace
		}
	}

	def void createGenModel(EPackage pkg, Metamodel mm, String ecoreLocation, String genModelLocation, String modelDirectory) {
		// FIXME: Stupid fix -> reopen the Ecore here to avoid Xtext-style cross-references in the genmodel
		val pkgs = modelUtils.loadAllPkgs(ecoreLocation)

		val genModel = GenModelFactory.eINSTANCE.createGenModel => [
			it.complianceLevel = GenJDKLevel.JDK70_LITERAL
			it.modelDirectory = modelDirectory
			it.foreignModel.add(ecoreLocation)
			it.modelName = mm.name
			//it.usedGenPackages += mm.inheritanceRelation?.superMetamodel?.genmodels.head.genPackages
			it.initialize(Lists.newArrayList(pkgs))
		]

		val resSet = new ResourceSetImpl
		val res = resSet.createResource(URI.createURI(genModelLocation))
		res.contents.add(genModel)

		try {
			res.save(null)
			//genModel.generateCode
		} catch (IOException e) {
			e.printStackTrace
		}
	}

	def void createGenModel(EPackage pkg, Metamodel mm, String ecoreLocation, String genModelLocation) {
		//createGenModel(pkg, mm, ecoreLocation, genModelLocation, '''/«mm.name»Generated/src/''')
		createGenModel(pkg, mm, ecoreLocation, genModelLocation, '''/«mm.project.name»/emf-gen''')
	}

	def void createExtendedGenmodel(Metamodel mm, String ecoreLocation, String genModelLocation, String modelDirectory) {
		// FIXME: Stupid fix -> reopen the Ecore here to avoid Xtext-style cross-references in the genmodel
		val pkgs = modelUtils.loadAllPkgs(ecoreLocation)
		val parentGm = modelUtils.loadGenmodel(mm.inheritanceRelation?.superMetamodel?.genmodelUris.head)

		val genModel = GenModelFactory.eINSTANCE.createGenModel => [
			it.complianceLevel = GenJDKLevel.JDK70_LITERAL
			it.modelDirectory = modelDirectory
			it.modelName = mm.name
			it.modelPluginID = mm.name
			it.usedGenPackages += parentGm.genPackages
			it.foreignModel.add(ecoreLocation)
			it.initialize(Lists.newArrayList(pkgs))
			it.genPackages.forEach[basePackage = mm.name.toLowerCase]
		]

		val resSet = new ResourceSetImpl
		val res = resSet.createResource(URI.createURI(genModelLocation))
		res.contents.add(genModel)

		try {
			res.save(null)
			//genModel.generateCode
		} catch (IOException e) {
			e.printStackTrace
		}
	}

	def void generateCode(GenModel genModel) {
		genModel.reconcile
		genModel.canGenerate = true
		genModel.validateModel = true

		val generator = GenModelUtil.createGenerator(genModel)
		generator.generate(
			genModel,
			GenBaseGeneratorAdapter.MODEL_PROJECT_TYPE,
			new BasicMonitor.Printing(System.out)
		)
	}

	def String getGenerationFolder(Metamodel mm) {
		//return '''platform:/resource/«mm.project.name»/generated/«mm.name»/'''
		//return '''platform:/resource/«mm.name»Generated/model/'''
		return '''platform:/resource/«mm.project.name»/model-gen/«mm.name»/'''
	}

	def IProject getProject(Metamodel mm) {
		val platformString = mm.eResource.URI.toPlatformString(true)
		return ResourcesPlugin.workspace.root.getFile(new Path(platformString)).project
	}
}
