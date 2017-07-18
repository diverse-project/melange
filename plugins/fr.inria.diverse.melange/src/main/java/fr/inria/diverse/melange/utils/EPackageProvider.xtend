/*******************************************************************************
 * Copyright (c) 2017 Inria and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Inria - initial API and implementation
 *******************************************************************************/
package fr.inria.diverse.melange.utils

import com.google.common.collect.HashMultimap
import com.google.common.collect.SetMultimap
import com.google.inject.Inject
import com.google.inject.Singleton
import fr.inria.diverse.melange.ast.LanguageExtensions
import fr.inria.diverse.melange.ast.ModelTypeExtensions
import fr.inria.diverse.melange.ast.ModelingElementExtensions
import fr.inria.diverse.melange.eclipse.EclipseProjectHelper
import fr.inria.diverse.melange.lib.EcoreExtensions
import fr.inria.diverse.melange.lib.ModelUtils
import fr.inria.diverse.melange.metamodel.melange.Inheritance
import fr.inria.diverse.melange.metamodel.melange.Language
import fr.inria.diverse.melange.metamodel.melange.Metamodel
import fr.inria.diverse.melange.metamodel.melange.ModelType
import fr.inria.diverse.melange.metamodel.melange.ModelingElement
import java.util.Set
import org.eclipse.emf.codegen.ecore.genmodel.GenModel
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.naming.IQualifiedNameProvider
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace
import java.util.HashMap
import java.util.Map
import org.eclipse.emf.ecore.resource.Resource

@Singleton
class EPackageProvider
{
	@Inject ModelUtils modelUtils
	@Inject extension EcoreExtensions
	@Inject extension ModelTypeExtensions
	@Inject extension ModelingElementExtensions
	@Inject extension LanguageExtensions
	@Inject extension EclipseProjectHelper
	@Inject extension IQualifiedNameProvider
	
	private Map<Resource,SetMultimap<String, EPackage>> dispatchPackages = new HashMap
	private Map<Resource,SetMultimap<String, GenModel>> dispatchGenmodels = new HashMap


	def Set<EPackage> getPackages(ModelingElement m) {
		val packages = getPackageRegistry(m.eResource)
		if (!packages.containsKey(m.fqn)) {
			if (m instanceof Metamodel) {
				val project = m.eResource.project
				if (m.owningLanguage.isGeneratedByMelange && project !== null)
					if (project.getFile(m.owningLanguage.externalEcorePath).exists)
						m.ecoreUri = m.owningLanguage.externalEcoreUri
			}

			switch (m) {
				ModelType case m.isExtracted:
					packages.putAll(m.fqn, m.extracted.syntax.packages)
				Metamodel case !m.owningLanguage.superLanguages.empty: {
					val pkgsCopy = m.owningLanguage.operators.filter(Inheritance).map[targetLanguage.syntax.packages.map[
						val copy = EcoreUtil::copy(it)
						copy.name = it.name
						copy.nsPrefix = it.name
						copy.nsURI = '''«m.owningLanguage.externalPackageUri»«it.uniqueId.replace('.','/')»/'''
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
						registerPackages(m,root)
					}
				}
			}
		}

		return packages.get(m.fqn)
	}

	def Set<GenModel> getGenModels(ModelingElement m) {
		val genmodels = getGenmodelRegistry(m.eResource)
		if (!genmodels.containsKey(m.fqn)) {
			// If it's an Xcore file, the genmodel can be found directly within it
			if (m.isXcore) {
				val gm = modelUtils.loadGenmodelFromXcore(m.ecoreUri.toPlatformURI)

				if (gm !== null)
					genmodels.put(m.fqn, gm)
			} else {
				if (m.genmodelUris.size == 0 && m.ecoreUri !== null)
					m.genmodelUris += m.ecoreUri.substring(0, m.ecoreUri.lastIndexOf(".")) + ".genmodel"
				else if (m instanceof Metamodel) {
					val project = m.eResource.project
					if (m.owningLanguage.isGeneratedByMelange && project !== null)
						if (project.getFile(m.owningLanguage.externalGenmodelPath).exists)
							m.genmodelUris += m.owningLanguage.externalGenmodelUri
				}
				m.genmodelUris.forEach[
					val gm = modelUtils.loadGenmodel(it.toPlatformURI)
					if (gm !== null)
						genmodels.put(m.fqn, gm)
				]
				
				//Create transient gemodel by default for exactTypes
				if (!genmodels.containsKey(m.fqn)) {
					if (m instanceof ModelType) {
						if (m.isExtracted) {
							genmodels.put(m.fqn, m.createTransientGenmodel)
						}
					}
				}
			}
		}

		return genmodels.get(m.fqn)
	}
	
	/**
	 * Register {@link root} and its sub EPackages as packages of {@link modElem} 
	 */
	def void registerPackages(ModelingElement modElem, EPackage root) {
		val packages = getPackageRegistry(modElem.eResource)
		
		val collider = packages.get(modElem.fqn)?.findFirst[uniqueId == root.uniqueId]
		if (collider === null && root !== null) {
			val pkgs = newArrayList

			pkgs += root
			pkgs += root.referencedPkgs.filter[!pkgs.exists[p | uniqueId == p.uniqueId]]

			packages.putAll(modElem.fqn, pkgs)
			packages.putAll(modElem.fqn, pkgs.map[allSubPkgs].flatten.filter[!pkgs.exists[p | uniqueId == p.uniqueId]])
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
	
	private def getPackageRegistry(Resource root) {
		var res = dispatchPackages.get(root)
		if(res == null){
			res = HashMultimap.create
			dispatchPackages.put(root,res)
		}
		return res
	}
	
	private def getGenmodelRegistry(Resource root) {
		var res = dispatchGenmodels.get(root)
		if(res == null){
			res = HashMultimap.create
			dispatchGenmodels.put(root,res)
		}
		return res
	}
	
	def void resetFor(Resource r) {
		dispatchPackages.put(r,HashMultimap.create)
		dispatchGenmodels.put(r,HashMultimap.create)
	}
}
