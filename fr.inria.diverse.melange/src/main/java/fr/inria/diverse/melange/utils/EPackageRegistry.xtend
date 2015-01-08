package fr.inria.diverse.melange.utils

import com.google.common.collect.HashMultimap
import com.google.common.collect.SetMultimap

import com.google.inject.Inject
import com.google.inject.Singleton

import fr.inria.diverse.melange.ast.ModelTypeExtensions

import fr.inria.diverse.melange.lib.EcoreExtensions
import fr.inria.diverse.melange.lib.ModelUtils

import fr.inria.diverse.melange.metamodel.melange.Metamodel
import fr.inria.diverse.melange.metamodel.melange.ModelType
import fr.inria.diverse.melange.metamodel.melange.ModelingElement

import java.util.Collection
import java.util.Collections
import java.util.List

import org.eclipse.emf.codegen.ecore.genmodel.GenModel

import org.eclipse.emf.ecore.EPackage

import org.eclipse.emf.ecore.util.EcoreUtil

@Singleton
class EPackageRegistry
{
	@Inject ModelUtils modelUtils
	@Inject extension EcoreExtensions
	@Inject extension ModelTypeExtensions
	private SetMultimap<String, EPackage> packages = HashMultimap.create
	private SetMultimap<String, GenModel> genmodels = HashMultimap.create

	def List<EPackage> getPackages(ModelingElement m) {
		if (!packages.containsKey(m.name)) {
			switch (m) {
				case m.ecoreUri !== null: {
					val root = modelUtils.loadPkg(m.ecoreUri)

					packages.put(m.name, root)
					root.referencedPkgs.filter[nsURI != root.nsURI].forEach[packages.putAll(m.name, Collections::singletonList(it).copyAndAttach)]
					root.allSubPkgs.filter[nsURI != root.nsURI].forEach[packages.put(m.name, it)]
				}
				Metamodel:
					if (m.inheritanceRelation.superMetamodel !== null) {
						packages.putAll(m.name, m.inheritanceRelation.superMetamodel.packages.copyAndAttach)
					}
				ModelType:
					if (m.isExtracted) {
						packages.putAll(m.name, m.extracted.packages.copyAndAttach)
					}
			}
		}

		return packages.get(m.name).toList
	}

	def List<GenModel> getGenModels(Metamodel mm) {
		if (!genmodels.containsKey(mm.name)) {
			if (mm.genmodelUris.size == 0 && mm.ecoreUri !== null) {
				mm.genmodelUris += mm.ecoreUri.substring(0, mm.ecoreUri.lastIndexOf(".")) + ".genmodel"
			}

			mm.genmodelUris.forEach[genmodels.put(mm.name, modelUtils.loadGenmodel(it))]
		}

		return genmodels.get(mm.name).toList
	}

	private def Collection<EPackage> copyAndAttach(Collection<EPackage> coll) {
		val copies = EcoreUtil::copyAll(coll)
		/*copies.forEach[
			val rs = new ResourceSetImpl
			// Transient resource, we just need a container
			// for Xtext's JvmModelAssociator
			// FIXME: Or we may just disable source/target association
			//         in the inferrer
			val res = rs.createResource(URI::createURI("Stub.ecore"))
			res.contents += it
		]*/
		return copies
	}
}
