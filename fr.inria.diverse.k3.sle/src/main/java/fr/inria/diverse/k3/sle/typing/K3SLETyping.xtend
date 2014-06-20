package fr.inria.diverse.k3.sle.typing

import fr.inria.diverse.k3.sle.ast.ASTProcessingException

import fr.inria.diverse.k3.sle.lib.ModelUtils

import fr.inria.diverse.k3.sle.metamodel.k3sle.K3sleFactory
import fr.inria.diverse.k3.sle.metamodel.k3sle.ModelTypingSpace
import fr.inria.diverse.k3.sle.metamodel.k3sle.Transformation
import fr.inria.diverse.k3.sle.metamodel.k3sle.ModelType
import fr.inria.diverse.k3.sle.metamodel.k3sle.Metamodel
import fr.inria.diverse.k3.sle.metamodel.k3sle.ResourceType

import org.eclipse.emf.compare.DifferenceKind
import org.eclipse.emf.compare.EMFCompare
import org.eclipse.emf.compare.merge.BatchMerger
import org.eclipse.emf.compare.merge.IMerger
import org.eclipse.emf.compare.scope.DefaultComparisonScope

import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.ecore.EcoreFactory
import org.eclipse.emf.ecore.EClass

import org.eclipse.xtext.common.types.JvmDeclaredType

import static extension fr.inria.diverse.k3.sle.ast.ASTHelper.*
import static extension fr.inria.diverse.k3.sle.ast.MetamodelExtensions.*
import static extension fr.inria.diverse.k3.sle.ast.ModelTypeExtensions.*
import static extension fr.inria.diverse.k3.sle.lib.EcoreExtensions.*
import static extension fr.inria.diverse.k3.sle.utils.AspectToEcore.*

class K3SLETyping
{
	def inferTypingRelations(ModelTypingSpace root) {
		root.modelTypes
		.forEach[mt1 |
			root.modelTypes
			.filter[mt2 | mt2 != mt1 && !mt1.subtypingRelations.exists[superType?.name == mt2?.name] && mt1.subtypeOf(mt2)]
			.forEach[mt2 |
				mt1.subtypingRelations += K3sleFactory.eINSTANCE.createSubtyping => [
					subType = mt1
					superType = mt2
				]
			]

			root.metamodels
			.filter[mm | !mm.^implements.exists[name == mt1.name] && mm.typedBy(mt1)]
			.forEach[mm |
				mm.^implements += mt1
			]
		]
	}

	def dispatch void complete(ModelTypingSpace root) {
		val newMTs = newArrayList

		root.metamodels.forEach[mm |
			val newMT = K3sleFactory.eINSTANCE.createModelType => [
				name = mm.exactTypeRef
			]

			if (!root.modelTypes.exists[name == newMT.name])
				newMTs += newMT
		]

		root.elements += newMTs
		root.metamodels.forEach[mm |
			mm.exactType = root.modelTypes.findFirst[name == mm.exactTypeRef]
		]

		root.elements.forEach[complete]
	}

	def dispatch void complete(Metamodel mm) {
		if (mm.hasSuperMetamodel) {
			// EMF resource = extension with inheritance
			if (mm.resourceType == ResourceType.EMF) {
				val pkg = ModelUtils.loadPkg(mm.inheritanceRelation.superMetamodel.ecore.uri)

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
						]
					]
				]

				if (!mm.pkgs.exists[nsURI == newPkg.nsURI])
					mm.pkgs += newPkg

				mm.aspects.forEach[asp |
					if (!(asp.aspectRef.type instanceof JvmDeclaredType))
						throw new ASTProcessingException("Aspect must be a generic type: " + asp.aspectRef?.type)

					val className = asp.aspectAnnotationValue

					if (className === null)
						throw new ASTProcessingException("Cannot find annotation value for " + asp.aspectRef?.type)

					val cls = mm.findClass(className)

					if (cls === null)
						throw new ASTProcessingException("Cannot find aspectized class for " + asp.aspectRef?.type)

					asp.aspectedClass = cls

					mm.weaveAspect(asp.aspectedClass, asp.aspectRef.type as JvmDeclaredType)
				]

				val copy = EcoreUtil.copy(mm.pkgs.head)
				val ecoreUri = '''platform:/resource/«mm.project.name»/model/«mm.name».ecore'''
				val genmodelUri = '''platform:/resource/«mm.project.name»/model/«mm.name».genmodel'''
				val srcFolder = '''«mm.project.name»/src'''
				copy.createEcore(ecoreUri)
				copy.createGenModel(mm, ecoreUri, genmodelUri, srcFolder)

				throw new ASTProcessingException("Gemoc: stop here")
			} else {
				val rootPkg = mm.inheritanceRelation.superMetamodel.pkgs.head.copy(mm.name)

				val pkg = rootPkg
				if (!mm.pkgs.exists[nsURI == pkg.nsURI])
					mm.pkgs += pkg

				pkg.referencedPkgs.filterNull.forEach[p |
					if (!mm.pkgs.exists[nsURI == p.nsURI])
						mm.pkgs += p
				]

				// For each aspect, infer the corresponding ecore fragment
				// and merge it into the base metamodel
				mm.aspects.forEach[asp |
					if (asp.aspectRef.type instanceof JvmDeclaredType) {
						val className = asp.aspectAnnotationValue

						if (className !== null) {
							val cls = mm.findClass(className)

							if (cls !== null) {
								asp.aspectedClass = cls
								asp.inferEcoreFragment

								// TODO: Move that in an model algebra service
								try {
									val scope = new DefaultComparisonScope(asp.ecoreFragment, mm.pkgs.head, null)
									val comparison = EMFCompare.builder.build.compare(scope)

									val diffs = comparison.differences
									diffs.filter[
										   kind != DifferenceKind.ADD
										&& !requires.exists[r | r.kind == DifferenceKind.ADD]
									].forEach[
										discard
									]

									val mergerRegistry = IMerger$RegistryImpl.createStandaloneInstance
									val merger = new BatchMerger(mergerRegistry)
									merger.copyAllLeftToRight(diffs, null)
								} catch (Exception e) {
									println("Got exception:")
									e.printStackTrace
								}
							}
						}
					}
				]

				mm.createEcore
				mm.pkgs.head.createGenModel(mm, mm.generationFolder + mm.name + ".ecore", mm.generationFolder + mm.name + ".genmodel")

				val gm = ModelUtils.loadGenmodel(mm.generationFolder + mm.name + ".genmodel")
				if (!mm.genmodels.exists[genPackages.exists[gp | gm.genPackages.exists[gpp | gpp.getEcorePackage?.nsURI == gp.getEcorePackage?.nsURI]]])
					mm.genmodels += gm
			}
		} else {
			val pkg = ModelUtils.loadPkg(mm.ecore.uri)

			// TODO: Check that loaded pkgs/genmodels match
			if (!mm.pkgs.exists[nsURI == pkg.nsURI])
				mm.pkgs += pkg

			pkg.referencedPkgs.forEach[p |
				if (!mm.pkgs.exists[nsURI == p.nsURI])
					mm.pkgs += p
			]

			mm.allSubPkgs.forEach[p |
				if (!mm.pkgs.exists[nsURI == p.nsURI])
					mm.pkgs += p
			]

			mm.^implements.forEach[mt |
				mt.complete
				mm.exactType.complete

				if (!mm.typedBy(mt))
					throw new ASTProcessingException('''«mm.name» doesn't match interface «mt.name»''')
			]

			if (mm.ecore.genmodelUris.size == 0) {
				// FIXME
				mm.ecore.genmodelUris += mm.ecore.uri.substring(0, mm.ecore.uri.lastIndexOf(".")) + ".genmodel"
			}

			mm.ecore.genmodelUris.forEach[
				val gm = ModelUtils.loadGenmodel(it)
				if (!mm.genmodels.exists[genPackages.exists[gp | gm.genPackages.exists[gpp | gpp.getEcorePackage?.nsURI == gp.getEcorePackage?.nsURI]]])
					mm.genmodels += gm
			]

			// For each aspect, infer the corresponding ecore fragment
			// and merge it into the base metamodel
			mm.aspects.forEach[asp |
				if (asp.aspectRef.type instanceof JvmDeclaredType) {
					val className = asp.aspectAnnotationValue

					if (className !== null) {
						val cls = mm.findClass(className)

						if (cls !== null) {
							asp.aspectedClass = cls
							asp.inferEcoreFragment

							// TODO: Move that in an model algebra service
							try {
								val scope = new DefaultComparisonScope(asp.ecoreFragment, mm.pkgs.head, null)
								val comparison = EMFCompare.builder.build.compare(scope)

								val diffs = comparison.differences
								diffs.filter[
									   kind != DifferenceKind.ADD
									&& !requires.exists[r | r.kind == DifferenceKind.ADD]
								].forEach[
									discard
								]

								val mergerRegistry = IMerger$RegistryImpl.createStandaloneInstance
								val merger = new BatchMerger(mergerRegistry)
								merger.copyAllLeftToRight(diffs, null)
							} catch (Exception e) {
								println("Got exception:")
								e.printStackTrace
							}
						}
					}
				}
			]
		}
	}

	def dispatch void complete(ModelType mt) {
		if(mt.isImported) {
			val pkg = ModelUtils.loadPkg(mt.ecore.uri)

			if (!mt.pkgs.exists[nsURI == pkg.nsURI])
				mt.pkgs += pkg

			pkg.referencedPkgs.forEach[p |
				if (!mt.pkgs.exists[nsURI == p.nsURI])
					mt.pkgs += p
			]
		} else if (mt.isExtracted) {
			mt.extracted.pkgs.forEach[p |
				if (!mt.pkgs.exists[nsURI == p.nsURI])
					mt.pkgs += p.copy
			]
		}
	}

	def dispatch void complete(Transformation t) {

	}

	def dispatch boolean isValid(ModelTypingSpace root) {
		   !root.name.empty
		&& !root.metamodels.exists[mm | root.metamodels.exists[mm_ | mm != mm_ && mm.name == mm_.name]]
		&& !root.modelTypes.exists[mt | root.modelTypes.exists[mt_ | mt != mt_ && mt.name == mt_.name]]
		&& !root.transformations.exists[t | root.transformations.exists[t_ | t != t_ && t.name == t_.name]]
		&& root.elements.forall[isValid]
	}

	def dispatch boolean isValid(Metamodel mm) {
		   mm !== null
		&& !mm.name.empty
		&& (mm.inheritanceRelation !== null || mm.ecore?.uri !== null)
		&& mm.aspects.forall[it !== null && aspectRef?.type instanceof JvmDeclaredType && aspectedClass !== null]
		&& !mm.exactTypeRef.empty
		&& mm.exactType !== null
		&& mm.^implements.forall[it !== null]
		&& mm.genmodels.forall[it !== null]
		&& mm.pkgs.forall[it !== null]
	}

	def dispatch boolean isValid(ModelType mt) {
		   mt !== null
		&& !mt.name.empty
		&& (mt.ecore?.uri !== null
			|| mt.extracted !== null)
		&& mt.subtypingRelations.forall[it !== null]
		&& mt.pkgs.forall[it !== null]
	}

	def dispatch boolean isValid(Transformation t) {
		   t !== null
		&& !t.name.empty
		&& t.parameters.forall[it !== null]
		&& t.body !== null
		// t.input / t.output?
	}
}
