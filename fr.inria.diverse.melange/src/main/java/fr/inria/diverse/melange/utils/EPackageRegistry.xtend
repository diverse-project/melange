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
	private SetMultimap<ModelingElement, EPackage> packages = HashMultimap.create
	private SetMultimap<Metamodel, GenModel> genmodels = HashMultimap.create

	def void reset() {
		packages = HashMultimap.create
		genmodels = HashMultimap.create
	}

	def List<EPackage> getPackages(ModelingElement m) {
		if (!packages.containsKey(m)) {
			switch (m) {
				case m.ecoreUri !== null: {
					val root = modelUtils.loadPkg(m.ecoreUri)

					packages.put(m, root)
					packages.putAll(m, root.referencedPkgs.filter[nsURI != root.nsURI].map[EcoreUtil::copy(it)])
					packages.putAll(m, root.allSubPkgs.filter[nsURI != root.nsURI])
				}
				Metamodel:
					if (m.inheritanceRelation.superMetamodel !== null) {
						packages.putAll(m, m.inheritanceRelation.superMetamodel.packages.map[EcoreUtil::copy(it)])
					}
				ModelType:
					if (m.isExtracted) {
						packages.putAll(m, m.extracted.packages.map[EcoreUtil::copy(it)])
					}
			}
		}

		return packages.get(m).toList
	}

	def List<GenModel> getGenModels(Metamodel mm) {
		if (!genmodels.containsKey(mm)) {
			if (mm.genmodelUris.size == 0 && mm.ecoreUri !== null) {
				mm.genmodelUris += mm.ecoreUri.substring(0, mm.ecoreUri.lastIndexOf(".")) + ".genmodel"
			}

			mm.genmodelUris.forEach[genmodels.put(mm, modelUtils.loadGenmodel(it))]
		}

		return genmodels.get(mm).toList
	}
}
