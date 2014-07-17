package fr.inria.diverse.k3.sle.ast

import com.google.inject.Inject

import com.google.common.collect.Lists

import fr.inria.diverse.k3.sle.lib.EcoreExtensions
import fr.inria.diverse.k3.sle.lib.MatchingHelper
import fr.inria.diverse.k3.sle.lib.ModelUtils

import fr.inria.diverse.k3.sle.metamodel.k3sle.AspectImport
import fr.inria.diverse.k3.sle.metamodel.k3sle.Metamodel
import fr.inria.diverse.k3.sle.metamodel.k3sle.ModelType

import fr.inria.diverse.k3.sle.utils.AspectToEcore

import java.io.IOException

import java.util.Collection
import java.util.Collections
import java.util.List

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

import org.eclipse.xtext.naming.QualifiedName

class MetamodelExtensions
{
	@Inject extension EcoreExtensions
	@Inject extension ModelTypeExtensions
	@Inject extension NamingHelper
	@Inject extension AspectToEcore
	@Inject ModelUtils modelUtils
	@Inject MatchingHelper matchingHelper

	def List<AspectImport> allAspects(Metamodel mm) {
		val ret = newArrayList

		ret += mm.aspects

		if (mm.hasSuperMetamodel)
			ret += mm.inheritanceRelation.superMetamodel.allAspects

		return ret
	}

	// FIXME: More than one pkg bro
	def typedBy(Metamodel mm, ModelType mt) {
		matchingHelper.match(mm.exactType.pkgs.head, mt.pkgs.head)
	}

	def hasSuperMetamodel(Metamodel mm) {
		mm.inheritanceRelation?.superMetamodel !== null
	}

	def getAspectAnnotationValue(AspectImport asp) {
		return (asp.aspectRef.type as JvmDeclaredType)?.aspectAnnotationValue
	}

	def getAspectAnnotationValue(JvmDeclaredType t) {
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

	def findClass(Metamodel mm, String clsName) {
		mm.allClasses.filter(EClass).findFirst[name == clsName]
	}

	def findClassifier(Metamodel mm, String clsName) {
		mm.allClassifiers.filter(EClassifier).findFirst[name == clsName]
	}

	def findClassifierFor(Metamodel mm, String clsName) {
		val cls = mm.findClass(clsName)
		if (cls !== null)
			return cls

		val dt = EcorePackage.eINSTANCE.findClassifier("E" + clsName.toFirstUpper)
		if (dt !== null)
			return dt
	}

	def getFqnFor(Metamodel mm, EClassifier cls) {
		val qnRet = new StringBuilder
		val pkg = mm.pkgs.findFirst[EClassifiers.exists[name == cls.name]]

		mm.genmodels.forEach[gm |
			val allGp = newArrayList
			getAllGenPkgs(gm, allGp)

			allGp.forEach[gp |
				if (gp.getEcorePackage.nsURI == pkg.nsURI)
					if (gp?.basePackage !== null)
						qnRet.append(QualifiedName.create(gp.basePackage, gp.prefix, cls.name).normalize.toString)
					else
						qnRet.append(QualifiedName.create(gp.prefix, cls.name).normalize.toString)
			]
		]

		return qnRet.toString
	}

	def getAllSubPkgs(Metamodel mm) {
		val allSubPkgs = newArrayList
		mm.pkgs.head.getAllSubPkgs(allSubPkgs)

		return allSubPkgs
	}

	def getPackageFqn(Metamodel mm) {
		// TODO: Multiple genmodels
		val genPkg = mm.genmodels.head.genPackages.head

		return if (genPkg.basePackage !== null)
				QualifiedName.create(genPkg.basePackage, genPkg.prefix, genPkg.prefix + "Package").normalize.toString
			else
				QualifiedName.create(genPkg.prefix, genPkg.prefix + "Package").normalize.toString
	}

	def getFactoryFqn(Metamodel mm) {
		// TODO: Multiple genmodels
		val genPkg = mm.genmodels.head.genPackages.head

		return if (genPkg.basePackage !== null)
				QualifiedName.create(genPkg.basePackage, genPkg.prefix, genPkg.prefix + "Factory").normalize.toString
			else
				QualifiedName.create(genPkg.prefix, genPkg.prefix + "Factory").normalize.toString
	}

	def getFactoryFqnFor(Metamodel mm, EPackage pkg) {
		val allGp = newArrayList
		getAllGenPkgs(mm.genmodels.head, allGp)

		val genPkg = allGp.findFirst[gp | gp.getEcorePackage.nsURI == pkg.nsURI]

		return if (genPkg.basePackage !== null)
				QualifiedName.create(genPkg.basePackage, genPkg.prefix, genPkg.prefix + "Factory").normalize.toString
			else
				QualifiedName.create(genPkg.prefix, genPkg.prefix + "Factory").normalize.toString

	}

	def hasAdapterFor(Metamodel mm, ModelType mt, EClassifier cls) {
		mm.hasAdapterFor(mt, cls.name)
	}

	def hasAdapterFor(Metamodel mm, ModelType mt, String find) {
		   mm.^implements.exists[name == mt.name]
		&& mm.allClasses.exists[name == find]
		&& mt.allClasses.exists[name == find]
	}

	def getAllClassifiers(Metamodel mm) {
		mm.pkgs.map[EClassifiers].flatten
	}

	def getAllClasses(Metamodel mm) {
		mm.allClassifiers.filter(EClass)
	}

	def isUml(Metamodel mm, EClassifier cls) {
		val pkg = mm.pkgs.findFirst[EClassifiers.exists[name == cls.name]]
		return pkg.name == "uml"
	}

	// FIXME: Create referenced EClass if they don't exist yet
	// FIXME: Consider finding EClassifier, not EClass
	def weaveAspect(Metamodel mm, EClass cls, JvmDeclaredType asp) {
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

	def createEcore(EPackage pkg, String uri) {
		val resSet = new ResourceSetImpl
    	val res = resSet.createResource(URI.createURI(uri))
    	res.contents.add(pkg.copy)

		try {
			res.save(null)
		} catch (IOException e) {
			e.printStackTrace
		}
	}

	def createEcore(Metamodel mm) {
		val resSet = new ResourceSetImpl
    	val res = resSet.createResource(URI.createURI(mm.generationFolder + mm.name + ".ecore"))
    	res.contents.add(mm.pkgs.head.copy)

		try {
			res.save(null)
		} catch (IOException e) {
			e.printStackTrace
		}
	}

	def createExtendedMetamodel(Metamodel mm, String uri) {
		val resSet = new ResourceSetImpl
		val res = resSet.createResource(URI.createURI(uri))
		res.contents.addAll(mm.pkgs.map[copy])

		try {
			res.save(null)
		} catch (IOException e) {
			e.printStackTrace
		}
	}

	def createGenModel(EPackage pkg, Metamodel mm, String ecoreLocation, String genModelLocation, String modelDirectory) {
		val genModel = GenModelFactory.eINSTANCE.createGenModel => [
			it.complianceLevel = GenJDKLevel.JDK70_LITERAL
			it.modelDirectory = modelDirectory
			it.foreignModel.add(ecoreLocation)
			it.modelName = mm.name
			it.usedGenPackages += mm.inheritanceRelation?.superMetamodel?.genmodels.head.genPackages
			it.initialize(Collections.singleton(pkg))
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

	def createGenModel(EPackage pkg, Metamodel mm, String ecoreLocation, String genModelLocation) {
		createGenModel(pkg, mm, ecoreLocation, genModelLocation, '''/«mm.name»Generated/src/''')
	}

	def createExtendedGenmodel(Metamodel mm, String ecoreLocation, String genModelLocation, String modelDirectory) {
		// FIXME: Stupid fix -> reopen the Ecore here to avoid Xtext-style cross-references in the genmodel
		val pkgs = modelUtils.loadAllPkgs(ecoreLocation)
		val parentGm = modelUtils.loadGenmodel(mm.inheritanceRelation?.superMetamodel?.ecore?.genmodelUris.head)

		val genModel = GenModelFactory.eINSTANCE.createGenModel => [
			it.complianceLevel = GenJDKLevel.JDK70_LITERAL
			it.modelDirectory = modelDirectory
			it.modelName = mm.name
			//it.modelPluginID = mm.name
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

	def generateCode(GenModel genModel) {
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

	def getGenerationFolder(Metamodel mm) {
		//return '''platform:/resource/«mm.project.name»/generated/«mm.name»/'''
		return '''platform:/resource/«mm.name»Generated/model/«mm.name»/'''
	}

	def getProject(Metamodel mm) {
		val platformString = mm.eResource.URI.toPlatformString(true)
		return ResourcesPlugin.workspace.root.getFile(new Path(platformString)).project
	}
}
