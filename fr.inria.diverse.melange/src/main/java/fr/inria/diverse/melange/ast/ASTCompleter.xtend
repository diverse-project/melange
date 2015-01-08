package fr.inria.diverse.melange.ast

import com.google.inject.Inject

import fr.inria.diverse.melange.algebra.ModelTypeAlgebra

import fr.inria.diverse.melange.ast.ASTHelper
import fr.inria.diverse.melange.ast.ASTProcessingException
import fr.inria.diverse.melange.ast.MetamodelExtensions
import fr.inria.diverse.melange.ast.ModelTypeExtensions

import fr.inria.diverse.melange.lib.EcoreExtensions
import fr.inria.diverse.melange.lib.ModelUtils

import fr.inria.diverse.melange.metamodel.melange.MelangeFactory
//import fr.inria.diverse.melange.metamodel.melange.KomprenSlicer
import fr.inria.diverse.melange.metamodel.melange.Metamodel
import fr.inria.diverse.melange.metamodel.melange.ModelType
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace
import fr.inria.diverse.melange.metamodel.melange.ResourceType
import fr.inria.diverse.melange.metamodel.melange.XbaseTransformation

import fr.inria.diverse.melange.utils.AspectToEcore

import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EcoreFactory

import org.eclipse.xtext.common.types.JvmDeclaredType

import org.eclipse.xtext.util.internal.Stopwatches

class ASTCompleter
{
	@Inject extension ASTHelper
	@Inject extension MetamodelExtensions
	@Inject extension ModelTypeExtensions
	@Inject extension ModelingElementExtensions
	@Inject extension EcoreExtensions
	@Inject extension AspectToEcore
	@Inject ModelUtils modelUtils
	@Inject ModelTypeAlgebra algebra

	def void inferTypingRelations(ModelTypingSpace root) {
		val task = Stopwatches.forTask("infering typing relations")
		task.start

		root.modelTypes
		.forEach[mt1 |
			root.modelTypes
			.filter[mt2 | mt2 != mt1 && !mt1.subtypingRelations.exists[superType?.name == mt2?.name] && mt1.isSubtypeOf(mt2)]
			.forEach[mt2 |
				mt1.subtypingRelations += MelangeFactory.eINSTANCE.createSubtyping => [
					subType = mt1
					superType = mt2
				]
			]

			root.metamodels
			.filter[mm | !mm.^implements.exists[name == mt1.name] && mm.isTypedBy(mt1)]
			.forEach[mm |
				mm.^implements += mt1
			]
		]

		task.stop
	}

	def dispatch void complete(ModelTypingSpace root) throws ASTProcessingException {
		val task = Stopwatches.forTask("Completing AST")
		task.start

		root.metamodels.forEach[complete]
		root.modelTypes.forEach[complete]
		root.transformations.forEach[complete]

		task.stop
	}

	def dispatch void complete(Metamodel mm) throws ASTProcessingException {
		if (mm.hasSuperMetamodel) {
			// EMF resource = extension with inheritance
			if (mm.resourceType == ResourceType.EMF) {
				val pkg = mm.pkgs.head

				val newPkg = EcoreFactory.eINSTANCE.createEPackage => [
					name = mm.name.toLowerCase
					nsURI = mm.resourceUri ?: '''http://«mm.name.toLowerCase»'''
					nsPrefix = mm.name.toLowerCase

					pkg.EClassifiers.filter(EClass).forEach[cls |
						EClassifiers += EcoreFactory.eINSTANCE.createEClass => [newCls |
							newCls.name = cls.name
							newCls.^abstract = cls.^abstract
							newCls.^interface = cls.^interface
							newCls.ESuperTypes += cls

							if (cls.name == "EStringToStringMapEntry") { // Stupid workaround
								newCls.instanceClassName = "java.util.Map$Entry"
								newCls.instanceTypeName = "java.util.Map$Entry"
							}
						]
					]
				]

				pkg.referencedPkgs.filterNull.forEach[p |
					val nPkg = EcoreFactory.eINSTANCE.createEPackage => [
						name = p.name
						nsURI = p.nsURI + "/extended" // Naively suffix all the packages so that
						                              // they don't clash with the previous ones
						nsPrefix = p.nsPrefix

						p.EClassifiers.filter(EClass).forEach[cls |
							EClassifiers += EcoreFactory.eINSTANCE.createEClass => [newCls |
								newCls.name = cls.name
								newCls.^abstract = cls.^abstract
								newCls.^interface = cls.^interface
								newCls.ESuperTypes += cls

								if (cls.name == "EStringToStringMapEntry") { // Stupid workaround
									newCls.instanceClassName = "java.util.Map$Entry"
									newCls.instanceTypeName = "java.util.Map$Entry"
								}
							]
						]
					]
				]

				mm.aspects.forEach[asp |
					if (!(asp.aspectTypeRef.type instanceof JvmDeclaredType))
						throw new ASTProcessingException("Aspect must be a generic type: " + asp.aspectTypeRef?.type)

					val className = asp.aspectAnnotationValue

					if (className === null)
						throw new ASTProcessingException("Cannot find annotation value for " + asp.aspectTypeRef?.type)

					val cls = mm.findClass(className)

					if (cls === null)
						throw new ASTProcessingException("Cannot find aspectized class for " + asp.aspectTypeRef?.type)

					asp.aspectedClass = cls

					mm.weaveAspect(asp.aspectedClass, asp.aspectTypeRef.type as JvmDeclaredType)
				]

				// Once everything's done, recreate the aspect hierarchy
				// FIXME: Actually, we should look for the with=#[] parameter, not the only extendedClass
				mm.aspects
					.filter[(aspectTypeRef.type as JvmDeclaredType).extendedClass !== null]
					.forEach[
						val superAspect = (aspectTypeRef.type as JvmDeclaredType).extendedClass.type as JvmDeclaredType
						val superClsName = superAspect.aspectAnnotationValue
						if (superClsName !== null) {
							val superCls = mm.findClass(superClsName)
							if (superCls !== null)
								aspectedClass.ESuperTypes += superCls
						}
					]

				val ecoreUri = '''platform:/resource/«mm.project.name»/model/«mm.name».ecore'''
				val genmodelUri = '''platform:/resource/«mm.project.name»/model/«mm.name».genmodel'''
				val srcFolder = '''/«mm.project.name»/src'''
				mm.createExtendedMetamodel(ecoreUri)
				mm.createExtendedGenmodel(ecoreUri, genmodelUri, srcFolder)
				throw new ASTProcessingException("Can't generate code for inheritance-based extended metamodels")
			} else {
				val pkg = mm.pkgs.head

				// For each aspect, infer the corresponding ecore fragment
				// and merge it into the base metamodel
				mm.aspects.forEach[asp |
					if (!(asp.aspectTypeRef.type instanceof JvmDeclaredType))
						throw new ASTProcessingException("Aspect must be a generic type: " + asp.aspectTypeRef?.type)

					val className = asp.aspectAnnotationValue

					if (className === null)
						throw new ASTProcessingException("Cannot find annotation value for " + asp.aspectTypeRef?.type)

					val cls = mm.findClass(className)

					if (cls === null)
						throw new ASTProcessingException("Cannot find aspectized class for " + asp.aspectTypeRef?.type)

					asp.aspectedClass = cls
					asp.inferEcoreFragment

					// FIXME: _not_ .head, could be any of them
					algebra.weaveAspect(mm, asp)
				]

				mm.createEcore
				mm.pkgs.head.createGenModel(mm, mm.generationFolder + mm.name + ".ecore", mm.generationFolder + mm.name + ".genmodel")

				val gm = modelUtils.loadGenmodel(mm.generationFolder + mm.name + ".genmodel")
				if (!mm.genmodels.exists[genPackages.exists[gp | gm.genPackages.exists[gpp | gpp.getEcorePackage?.nsURI == gp.getEcorePackage?.nsURI]]])
					mm.genmodels += gm
			}
		} else {
			// For each aspect, infer the corresponding ecore fragment
			// and merge it into the base metamodel
			mm.aspects.forEach[asp |
				if (!(asp.aspectTypeRef.type instanceof JvmDeclaredType))
					throw new ASTProcessingException("Aspect must be a generic type: " + asp.aspectTypeRef?.type)

				val className = asp.aspectAnnotationValue

				if (className === null)
					throw new ASTProcessingException("Cannot find annotation value for " + asp.aspectTypeRef?.type)

				val cls = mm.findClass(className)

				if (cls === null)
					throw new ASTProcessingException("Cannot find aspectized class for " + asp.aspectTypeRef?.type)

				asp.aspectedClass = cls
				asp.inferEcoreFragment

				// FIXME: _not_ .head, could be any of them
				algebra.weaveAspect(mm, asp)
			]
		}
	}

	def dispatch void complete(ModelType mt) {
		// ...
	}

	def dispatch void complete(XbaseTransformation t) {
		// ...
	}

//	def dispatch void complete(KomprenSlicer t) {
//		// ...
//	}
}
