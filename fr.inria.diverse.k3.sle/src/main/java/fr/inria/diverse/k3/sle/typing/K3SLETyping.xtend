package fr.inria.diverse.k3.sle.typing

import fr.inria.diverse.k3.sle.metamodel.k3sle.K3sleFactory
import fr.inria.diverse.k3.sle.metamodel.k3sle.ModelTypingSpace
import fr.inria.diverse.k3.sle.metamodel.k3sle.Transformation
import fr.inria.diverse.k3.sle.metamodel.k3sle.ModelType
import fr.inria.diverse.k3.sle.metamodel.k3sle.Metamodel

import static extension fr.inria.diverse.k3.sle.ast.ASTHelper.*
import static extension fr.inria.diverse.k3.sle.ast.MetamodelExtensions.*
import static extension fr.inria.diverse.k3.sle.ast.ModelTypeExtensions.*

import static extension fr.inria.diverse.k3.sle.lib.EcoreExtensions.*
import fr.inria.diverse.k3.sle.lib.ModelUtils
import fr.inria.diverse.k3.sle.ast.ASTProcessingException
import org.eclipse.xtext.common.types.JvmDeclaredType

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
			val rootPkg = mm.inheritanceRelation.superMetamodel.pkgs.head.copy(mm.name)

			val pkg = rootPkg
			if (!mm.pkgs.exists[nsURI == pkg.nsURI])
				mm.pkgs += pkg

			pkg.referencedPkgs.filterNull.forEach[p |
				if (!mm.pkgs.exists[nsURI == p.nsURI])
					mm.pkgs += p
			]

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

			mm.createEcore
			mm.pkgs.head.createGenModel(mm, mm.generationFolder + mm.name + ".ecore", mm.generationFolder + mm.name + ".genmodel")

			val gm = ModelUtils.loadGenmodel(mm.generationFolder + mm.name + ".genmodel")
			if (!mm.genmodels.exists[genPackages.exists[gp | gm.genPackages.exists[gpp | gpp.getEcorePackage?.nsURI == gp.getEcorePackage?.nsURI]]])
				mm.genmodels += gm
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
