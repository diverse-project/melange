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
import fr.inria.diverse.melange.metamodel.melange.Language
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
				ModelType case m.isExtracted:
					packages.putAll(m.fqn, m.extracted.syntax.packages)
				Metamodel case m.owningLanguage.hasSuperLanguage: {
					val pkgsCopy = m.owningLanguage.operators.filter(Inheritance).map[targetLanguage.syntax.packages.map[
						val copy = EcoreUtil::copy(it)
						copy.name = m.owningLanguage.name.toLowerCase
						copy.nsPrefix = copy.name
						copy.nsURI = '''http://«copy.name»'''
						return copy
					]].flatten

//					val newUri = m.createEcore(pkgsCopy.head)
//					val newGmUri = newUri.trimFileExtension.appendFileExtension("genmodel").toString
//					pkgsCopy.head.createGenModel(m, newUri.toString, newGmUri)

//					m.ecoreUri = newUri.toString
//					m.genmodelUris += newGmUri

					packages.putAll(m.fqn, pkgsCopy)
				}
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
			}
		}

		return packages.get(m.fqn)
	}

	def List<GenModel> getGenModels(ModelingElement m) {
		if (!genmodels.containsKey(m.fqn)) {
			if (m.genmodelUris.size == 0 && m.ecoreUri !== null)
				m.genmodelUris += m.ecoreUri.substring(0, m.ecoreUri.lastIndexOf(".")) + ".genmodel"
			else if (m instanceof Metamodel) {
				val project = m.eResource.project
				if (m.owningLanguage.isGeneratedByMelange && project !== null)
					if (project.getFile(m.owningLanguage.localGenmodelPath).exists)
						m.genmodelUris += m.owningLanguage.localGenmodelUri
					else if (project.getFile(m.owningLanguage.externalGenmodelPath).exists)
						m.genmodelUris += m.owningLanguage.externalGenmodelUri
			}
			m.genmodelUris.forEach[
				val gm = modelUtils.loadGenmodel(it.toPlatformURI)

				if (gm !== null)
					genmodels.put(m.fqn, gm)
			]
		}

		return genmodels.get(m.fqn)
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

	def String getFqn(ModelingElement m) {
		return
			if (m instanceof Metamodel)
				(m.eContainer as Language).fullyQualifiedName.toString
			else if (m instanceof ModelType)
				m.fullyQualifiedName.toString
	}

	private def String toPlatformURI(String uri) {
		return '''«IF uri.startsWith("/")»platform:/resource«ENDIF»«uri»'''
	}
}
