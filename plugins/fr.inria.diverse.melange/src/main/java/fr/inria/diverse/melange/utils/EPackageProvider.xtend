package fr.inria.diverse.melange.utils

import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.google.inject.Inject
import com.google.inject.Singleton
import fr.inria.diverse.melange.ast.LanguageExtensions
import fr.inria.diverse.melange.ast.ModelTypeExtensions
import fr.inria.diverse.melange.eclipse.EclipseProjectHelper
import fr.inria.diverse.melange.lib.EcoreExtensions
import fr.inria.diverse.melange.lib.ModelUtils
import fr.inria.diverse.melange.metamodel.melange.Inheritance
import fr.inria.diverse.melange.metamodel.melange.Metamodel
import fr.inria.diverse.melange.metamodel.melange.ModelType
import fr.inria.diverse.melange.metamodel.melange.ModelingElement
import java.util.List
import org.eclipse.emf.codegen.ecore.genmodel.GenModel
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.util.EcoreUtil

@Singleton
class EPackageProvider
{
	@Inject ModelUtils modelUtils
	@Inject extension EcoreExtensions
	@Inject extension ModelTypeExtensions
	@Inject extension LanguageExtensions
	@Inject extension EclipseProjectHelper
	private ListMultimap<ModelingElement, EPackage> packages = ArrayListMultimap.create
	private ListMultimap<Metamodel, GenModel> genmodels = ArrayListMultimap.create

	def void reset() {
		packages = ArrayListMultimap.create
		genmodels = ArrayListMultimap.create
	}

	def List<EPackage> getPackages(ModelingElement m) {
		if (!packages.containsKey(m)) {
			if (m instanceof Metamodel) {
				val project = m.eResource.project
				if (m.owningLanguage.isGeneratedByMelange && project !== null)
					if (project.getFile(m.owningLanguage.localEcorePath).exists)
						m.ecoreUri = m.owningLanguage.localEcoreUri
					else if (project.getFile(m.owningLanguage.externalEcorePath).exists)
						m.ecoreUri = m.owningLanguage.externalEcoreUri
			}

			switch (m) {
				case m.ecoreUri !== null: {
					val root = modelUtils.loadPkg(m.ecoreUri)

					if (root !== null) {
						val pkgs = newArrayList

						pkgs += root
						pkgs += root.referencedPkgs.filter[!pkgs.exists[p | nsURI == p.nsURI]]

						packages.putAll(m, pkgs)
						packages.putAll(m, pkgs.map[allSubPkgs].flatten.filter[!pkgs.exists[p | nsURI == p.nsURI]])
						pkgs.forEach[ESubpackages.clear]
					}
				}
				Metamodel:
					if (m.owningLanguage.hasSuperLanguage) {
						val pkgsCopy = m.owningLanguage.operators.filter(Inheritance).map[superLanguage.syntax.packages.map[
							val copy = EcoreUtil::copy(it)
							copy.name = m.owningLanguage.name.toLowerCase
							copy.nsPrefix = copy.name
							copy.nsURI = '''http://«copy.name»'''
							return copy
						]].flatten

//						val newUri = m.createEcore(pkgsCopy.head)
//						val newGmUri = newUri.trimFileExtension.appendFileExtension("genmodel").toString
//						pkgsCopy.head.createGenModel(m, newUri.toString, newGmUri)

//						m.ecoreUri = newUri.toString
//						m.genmodelUris += newGmUri

						packages.putAll(m, pkgsCopy)
					}
				ModelType:
					if (m.isExtracted) {
						val copy = EcoreUtil::copyAll( m.extracted.syntax.packages.filter[ESuperPackage == null].toList)
						packages.putAll(m, copy)
					}
			}
		}

		return packages.get(m)
	}

	def List<GenModel> getGenModels(Metamodel mm) {
		if (!genmodels.containsKey(mm)) {
			if (mm.genmodelUris.size == 0 && mm.ecoreUri !== null)
				mm.genmodelUris += mm.ecoreUri.substring(0, mm.ecoreUri.lastIndexOf(".")) + ".genmodel"
			else {
				val project = mm.eResource.project
				if (mm.owningLanguage.isGeneratedByMelange && project !== null)
					if (project.getFile(mm.owningLanguage.localGenmodelPath).exists)
						mm.genmodelUris += mm.owningLanguage.localGenmodelUri
					else if (project.getFile(mm.owningLanguage.externalGenmodelPath).exists)
						mm.genmodelUris += mm.owningLanguage.externalGenmodelUri
			}
			mm.genmodelUris.forEach[genmodels.put(mm, modelUtils.loadGenmodel(it))]
		}
		return genmodels.get(mm)
	}
	
	/**
	 * Register {@link root} and its sub EPackages as packages of {@link modElem} 
	 */
	def void registerPackages(ModelingElement modElem, EPackage root){
		if (!packages.containsKey(modElem) && root !== null) {
			val pkgs = newArrayList

			pkgs += root
			pkgs += root.referencedPkgs.filter[!pkgs.exists[p | nsURI == p.nsURI]]

			packages.putAll(modElem, pkgs)
			packages.putAll(modElem, pkgs.map[allSubPkgs].flatten.filter[!pkgs.exists[p | nsURI == p.nsURI]])
//			pkgs.forEach[ESubpackages.clear]
		}
	}
}
