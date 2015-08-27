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
import org.eclipse.xtext.naming.IQualifiedNameProvider

@Singleton
class EPackageProvider
{
	@Inject ModelUtils modelUtils
	@Inject extension EcoreExtensions
	@Inject extension ModelTypeExtensions
	@Inject extension LanguageExtensions
	@Inject extension EclipseProjectHelper
	@Inject extension IQualifiedNameProvider
	private ListMultimap<String, EPackage> packages = ArrayListMultimap.create
	private ListMultimap<String, GenModel> genmodels = ArrayListMultimap.create

	def void reset() {
		packages = ArrayListMultimap.create
		genmodels = ArrayListMultimap.create
	}

	def List<EPackage> getPackages(ModelingElement m) {
		if (!packages.containsKey(m.fqn)) {
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
					val root = modelUtils.loadPkg(m.ecoreUri.toPlatformURI)

					if (root !== null) {
						val pkgs = newArrayList

						pkgs += root
						pkgs += root.referencedPkgs.filter[!pkgs.exists[p | nsURI == p.nsURI]]

						packages.putAll(m.fqn, pkgs)
						packages.putAll(m.fqn, pkgs.map[allSubPkgs].flatten.filter[!pkgs.exists[p | nsURI == p.nsURI]])
						pkgs.forEach[ESubpackages.clear]
					}
				}
				Metamodel:
					if (m.owningLanguage.hasSuperLanguage) {
						val pkgsCopy = m.owningLanguage.operators.filter(Inheritance).map[targetLanguage.syntax.packages.map[
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

						packages.putAll(m.fqn, pkgsCopy)
					}
				ModelType:
					if (m.isExtracted) {
						val copy = EcoreUtil::copyAll( m.extracted.syntax.packages.filter[ESuperPackage == null].toList)
						packages.putAll(m.fqn, copy)
					}
			}
		}

		return packages.get(m.fqn)
	}

	def List<GenModel> getGenModels(Metamodel mm) {
		if (!genmodels.containsKey(mm.fqn)) {
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
			mm.genmodelUris.forEach[
				val gm = modelUtils.loadGenmodel(it.toPlatformURI)

				if (gm !== null)
					genmodels.put(mm.fqn, gm)
			]
		}

		return genmodels.get(mm.fqn)
	}
	
	/**
	 * Register {@link root} and its sub EPackages as packages of {@link modElem} 
	 */
	def void registerPackages(ModelingElement modElem, EPackage root) {
		if (!packages.keySet.contains(modElem.fqn) && root !== null) {
			val pkgs = newArrayList

			pkgs += root
			pkgs += root.referencedPkgs.filter[!pkgs.exists[p | nsURI == p.nsURI]]

			packages.putAll(modElem.fqn, pkgs)
			packages.putAll(modElem.fqn, pkgs.map[allSubPkgs].flatten.filter[!pkgs.exists[p | nsURI == p.nsURI]])
//			pkgs.forEach[ESubpackages.clear]
		}
	}

	def dispatch String getFqn(Metamodel mm) {
		return mm.owningLanguage.fullyQualifiedName?.toString
	}

	def dispatch String getFqn(ModelType mt) {
		return mt.fullyQualifiedName?.toString
	}

	private def String toPlatformURI(String uri) {
		return '''«IF uri.startsWith("/")»platform:/resource«ENDIF»«uri»'''
	}
}
