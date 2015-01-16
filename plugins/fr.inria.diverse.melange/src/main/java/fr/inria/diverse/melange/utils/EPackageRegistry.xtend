package fr.inria.diverse.melange.utils

import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap

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
	private ListMultimap<ModelingElement, EPackage> packages = ArrayListMultimap.create
	private ListMultimap<Metamodel, GenModel> genmodels = ArrayListMultimap.create

	def void reset() {
		packages = ArrayListMultimap.create
		genmodels = ArrayListMultimap.create
	}

	def List<EPackage> getPackages(ModelingElement m) {
		if (!packages.containsKey(m)) {
			switch (m) {
				case m.ecoreUri !== null: {
					val root = modelUtils.loadPkg(m.ecoreUri)
					val pkgs = newArrayList

					pkgs += root
					pkgs += root.referencedPkgs.filter[!pkgs.exists[p | nsURI == p.nsURI]].map[EcoreUtil::copy(it)]

					packages.putAll(m, pkgs)
					packages.putAll(m, pkgs.map[allSubPkgs].flatten.filter[!pkgs.exists[p | nsURI == p.nsURI]])
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

		return packages.get(m)
	}

	def List<GenModel> getGenModels(Metamodel mm) {
		if (!genmodels.containsKey(mm)) {
			if (mm.genmodelUris.size == 0 && mm.ecoreUri !== null) {
				mm.genmodelUris += mm.ecoreUri.substring(0, mm.ecoreUri.lastIndexOf(".")) + ".genmodel"
			}

			mm.genmodelUris.forEach[genmodels.put(mm, modelUtils.loadGenmodel(it))]
		}

		return genmodels.get(mm)
	}
}
