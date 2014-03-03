package fr.inria.diverse.k3.sle.jvmmodel

import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.Path

import org.eclipse.emf.common.util.BasicMonitor
import org.eclipse.emf.common.util.URI

import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EcoreFactory
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.ecore.resource.Resource

import org.eclipse.emf.codegen.ecore.genmodel.GenModelFactory
import org.eclipse.emf.codegen.ecore.genmodel.GenJDKLevel
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenBaseGeneratorAdapter
import org.eclipse.emf.codegen.ecore.genmodel.util.GenModelUtil
import org.eclipse.emf.codegen.ecore.genmodel.GenModel

import fr.inria.diverse.k3.sle.metamodel.k3sle.Metamodel
import fr.inria.diverse.k3.sle.metamodel.k3sle.ModelType
import fr.inria.diverse.k3.sle.metamodel.k3sle.EcoreImport
import fr.inria.diverse.k3.sle.metamodel.k3sle.AspectImport
import fr.inria.diverse.k3.sle.metamodel.k3sle.MegamodelRoot
import fr.inria.diverse.k3.sle.metamodel.k3sle.Transformation

import fr.inria.diverse.k3.sle.lib.ModelUtils
import fr.inria.diverse.k3.sle.lib.MatchingHelper

import org.eclipse.xtext.naming.QualifiedName

import org.eclipse.xtext.common.types.JvmCustomAnnotationValue
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.common.types.JvmFormalParameter

import java.util.Collections
import java.util.ArrayList

import java.io.IOException

class K3SLEJvmModelInferrerHelper
{
	static def normalize(QualifiedName name) {
		name.skipLast(1).toLowerCase.append(name.lastSegment.toFirstUpper)
	}

	static def boolean subtypeOf(EPackage pkgA, EPackage pkgB) {
		new MatchingHelper(pkgA, pkgB).match
	}

	static def dispatch getFactoryName(EPackage pkg) {
		"I" + pkg.name.toFirstUpper + "Factory"
	}

	static def dispatch getFactoryName(Metamodel mm) {
		mm.name + "Factory"
	}

	static def getterName(EAttribute attr) {
		if (#["java.lang.Boolean", "boolean"].contains(attr.EAttributeType.instanceClassName))
			"is" + attr.name.toFirstUpper
		else
			"get" + attr.name.toFirstUpper
	}

	static def setterName(EAttribute attr) {
		"set" + attr.name.toFirstUpper
	}

	static def getterName(EReference attr) {
		"get" + attr.name.toFirstUpper
	}

	static def setterName(EReference attr) {
		"set" + attr.name.toFirstUpper
	}

	static def getAllEcores(Metamodel mm) {
		val ret = new ArrayList<EcoreImport>

		if (mm.ecore !== null)
			ret.add(mm.ecore)

		if (mm.inheritanceRelation?.superMetamodel !== null)
			ret.add(mm.inheritanceRelation.superMetamodel.ecore)

		return ret
	}

	static def getAllAspects(Metamodel mm) {
		val ret = new ArrayList<AspectImport>

		ret.addAll(mm.aspects)

		if (mm.inheritanceRelation?.superMetamodel !== null)
			ret.addAll(mm.inheritanceRelation.superMetamodel.aspects)

		return ret
	}

	static def getUri(Metamodel mm) {
		if (mm?.ecore === null && mm?.inheritanceRelation?.superMetamodel !== null)
			'''platform:/resource/«mm.generationFolder»/model/«mm.name».ecore'''
		else if (mm?.ecore !== null)
			mm.ecore.uri
	}

	static def dispatch getInferredPkg(Metamodel mm) {
		if (mm.ecore === null && mm.inheritanceRelation?.superMetamodel !== null)
		{
			val superMM = mm.inheritanceRelation?.superMetamodel
			val superPkg = ModelUtils.loadPkg(superMM.ecore.uri)
			val pkg = superPkg.copy(mm.name)
			val uri = mm.uri
			val genModelUri = '''platform:/resource/«mm.generationFolder»/model/«mm.name».genmodel'''

			pkg.createEcore(uri.toString)
			pkg.createGenModel(mm, uri.toString, genModelUri)

			return pkg
		} else {
			val uri = mm.ecore.uri
			val pkg = ModelUtils.loadPkg(uri)

			return pkg
		}
	}

	static def getInferredGenModel(Metamodel mm) {
		if (mm.ecore === null && mm.inheritanceRelation?.superMetamodel?.ecore !== null) {
			return ModelUtils.loadGenModel(mm.inheritanceRelation.superMetamodel.ecore.genmodelUri)
		} else {
			return ModelUtils.loadGenModel(mm.ecore.genmodelUri)
		}
	}

	static def dispatch getInferredPkg(ModelType mt) {
		if (mt.ecore === null && mt.extracted !== null)
			return mt.extracted.pkg.copy
		else if (mt.ecore !== null && mt.extracted === null)
			return ModelUtils.loadPkg(mt.ecore.uri)
	}

	static def copy(EPackage pkg) {
		copy(pkg, pkg.name)
	}

	static def copy(EPackage pkg, String pkgName) {
		val newPkg = EcoreFactory.eINSTANCE.createEPackage => [
			name = pkgName.toLowerCase
			nsPrefix = pkgName.toLowerCase
			nsURI = '''http://«pkgName.toLowerCase»/'''
		]

		newPkg.EClassifiers.addAll(EcoreUtil.copyAll(pkg.EClassifiers))

		return newPkg
	}

	static def createEcore(EPackage pkg, String uri) {
		val resSet = new ResourceSetImpl
    	val res = resSet.createResource(org.eclipse.emf.common.util.URI.createURI(uri))
    	res.contents.add(pkg)

		try {
			res.save(null)
		} catch (IOException e) {
			e.printStackTrace
		}
	}

	static def createGenModel(EPackage pkg, Metamodel mm, String ecoreLocation, String genModelLocation) {
		val genModelFact = GenModelFactory.eINSTANCE
		val genModel = genModelFact.createGenModel

		genModel.complianceLevel = GenJDKLevel.JDK70_LITERAL
		genModel.modelDirectory = '''/«mm.project.name»/src-gen/'''
		genModel.foreignModel.add(ecoreLocation)
		genModel.modelName = mm.name
		genModel.initialize(Collections.singleton(pkg))

		val genPackage = genModel.genPackages.head
		genPackage.prefix = mm.name.toLowerCase.toFirstUpper

		val resSet = new ResourceSetImpl
		val res = resSet.createResource(org.eclipse.emf.common.util.URI.createURI(genModelLocation))
		res.contents.add(genModel)

		try {
			res.save(null)
			genModel.generateCode
		} catch (IOException e) {
			e.printStackTrace
		}
	}

	static def generateCode(GenModel genModel) {
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

	static def getGenerationFolder(Metamodel mm) {
		return '''/«mm.project.name»/generated/«mm.name»'''
	}

	static def getProject(Metamodel mm) {
		val platformString = mm.eResource.URI.toPlatformString(true)
		return ResourcesPlugin.workspace.root.getFile(new Path(platformString)).project
	}

	// TODO: fixme
	static def weaveAspects(EPackage pkg, Metamodel mm) {
		mm.allAspects.forEach[asp |
			val aspectized = pkg.EClassifiers.filter(EClass).findFirst[aspectizedBy(asp)]

			if (aspectized !== null) {
				(asp.aspectRef.type as JvmGenericType).declaredOperations
				.filter[op | !op.simpleName.startsWith("priv") && !op.simpleName.startsWith("super_")]
				.forEach[op |
					// Create an attribute is these are getters/setters
					aspectized.EOperations.add(
						EcoreFactory.eINSTANCE.createEOperation => [
							val retType = pkg.getClassifierFor(op.returnType.simpleName)

							name = op.simpleName
							op.parameters.forEach[p, i |
								if (i > 0) {
									val pType = pkg.getClassifierFor(p.parameterType.simpleName)

									EParameters += EcoreFactory.eINSTANCE.createEParameter => [pp |
										pp.name = p.simpleName
										pp.EType = if (pType !== null) pType else EcorePackage.eINSTANCE.getClassifierFor("E" + p.parameterType.simpleName.toFirstUpper)
									]
								}
							]
							EType = if (retType !== null) retType else EcorePackage.eINSTANCE.getClassifierFor("E" + op.returnType.simpleName.toFirstUpper)
						]
					)
				]
			}
		]
	}

	static def getClassifierFor(EPackage pkg, String name) {
		return pkg.EClassifiers.findFirst[it.name == name]
	}

	static def boolean inferGenModel(Metamodel mm) {
		// !!!
		if (mm.ecore?.genmodelUri !== null)
			return true
		else if (mm.ecore?.uri !== null && mm.ecore?.uri.endsWith(".ecore")) {
			val speculativeGenmodelPath = mm.ecore.uri.substring(0, mm.ecore.uri.lastIndexOf(".")) + ".genmodel"

			try {
				if (ModelUtils.loadGenModel(speculativeGenmodelPath) !== null) {
					mm.ecore.genmodelUri = speculativeGenmodelPath
					return true
				}
			} catch (Exception e) {}
		} else if (mm.inheritanceRelation !== null && mm.inheritanceRelation.superMetamodel.isValid)
			return true

		return false
	}

	static def dispatch boolean isValid(Metamodel mm) {
		mm.inferGenModel
		&&
		  (mm.ecore?.uri !== null ||
		  	(mm.inheritanceRelation?.superMetamodel !== null && mm.inheritanceRelation.superMetamodel.isValid))
		&& mm.aspects.forall[aspectRef.type instanceof JvmGenericType]
		&& (mm.ecore?.genmodelUri !== null ||
			(mm.inheritanceRelation?.superMetamodel !== null && mm.inheritanceRelation.superMetamodel.isValid))
	}

	static def dispatch boolean isValid(ModelType mt) {
		(mt.extracted === null && mt.ecore?.uri !== null)
		|| (mt.extracted !== null && mt.extracted.isValid)
	}

	static def dispatch boolean isValid(Transformation t) {
		true
	}

	static def dispatch boolean isValid(MegamodelRoot root) {
		root.elements.forall[isValid]
	}

	static def aspectizedBy(EClass cls, AspectImport asp) {
		if (asp.aspectRef?.type !== null
			&& asp.aspectRef.type instanceof JvmGenericType
			&& (asp.aspectRef.type as JvmGenericType).annotations.size > 0
		) {
			val className =
				(asp.aspectRef.type as JvmGenericType).annotations
					.findFirst[annotation.qualifiedName == "fr.inria.diverse.k3.al.annotationprocessor.Aspect"]
					?.values.filter(JvmCustomAnnotationValue)
					?.head?.values?.head?.toString

			return cls.name == className || cls.EAllSuperTypes.exists[name == className]
		}

		return false
	}

	static def serializeAs(MegamodelRoot root, String uri) {
		Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("*", new XMIResourceFactoryImpl)

		val rs = new ResourceSetImpl
		val res = rs.createResource(URI.createURI(uri))
		res.contents += root

		try {
			res.save(null)
		} catch (IOException e) {
			e.printStackTrace
		}
	}

	static def getFqnFor(Metamodel mm, EClass cls) {
		val genPkg = mm.genmodel.genPackages.head

		return if (genPkg.basePackage !== null)
				QualifiedName.create(genPkg.basePackage, genPkg.prefix, cls.name).normalize.toString
			else
				QualifiedName.create(genPkg.prefix, cls.name).normalize.toString
	}

	static def getPackageFqn(Metamodel mm) {
		val genPkg = mm.genmodel.genPackages.head

		return if (genPkg.basePackage !== null)
				QualifiedName.create(genPkg.basePackage, genPkg.prefix, genPkg.prefix + "Package").normalize.toString
			else
				QualifiedName.create(genPkg.prefix, genPkg.prefix + "Package").normalize.toString
	}

	static def getFactoryFqn(Metamodel mm) {
		val genPkg = mm.genmodel.genPackages.head

		return if (genPkg.basePackage !== null)
				QualifiedName.create(genPkg.basePackage, genPkg.prefix, genPkg.prefix + "Factory").normalize.toString
			else
				QualifiedName.create(genPkg.prefix, genPkg.prefix + "Factory").normalize.toString
	}

	static def Iterable<EClass> sortByClassInheritance(Iterable<EClass> classes) {
		classes.sort(new ClassInheritanceComparator())
	}

	static def Iterable<JvmFormalParameter> filterModelTypes(Iterable<JvmFormalParameter> l) {
		l.filter[p | p.parameterType.type instanceof JvmGenericType]
		 .filter[p | (p.parameterType.type as JvmGenericType).extendedInterfaces.exists[i | i.simpleName == "IModelType"]]
	}

	static def hasAdapterFor(Metamodel mm, ModelType mt, EClass cls) {
		   mm.pkg.EClassifiers.filter(EClass).exists[name == cls.name]
		&& mt.pkg.EClassifiers.filter(EClass).exists[name == cls.name]
	}
}

// What about multiple inheritance?
class ClassInheritanceComparator implements java.util.Comparator<EClass> {
        override int compare(EClass clsA, EClass clsB)
        {
                if (clsA.EAllSuperTypes.contains(clsB))
                        return -1
                else if (clsB.EAllSuperTypes.contains(clsA))
                        return 1
                else
                        return 0
        }
}

