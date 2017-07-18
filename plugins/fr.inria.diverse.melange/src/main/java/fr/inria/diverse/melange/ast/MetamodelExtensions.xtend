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
package fr.inria.diverse.melange.ast

import com.google.inject.Inject
import fr.inria.diverse.melange.metamodel.melange.Metamodel
import java.io.IOException
import org.apache.log4j.Logger
import org.eclipse.emf.codegen.ecore.genmodel.GenJDKLevel
import org.eclipse.emf.codegen.ecore.genmodel.GenModel
import org.eclipse.emf.codegen.ecore.genmodel.GenModelFactory
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.xtext.naming.IQualifiedNameProvider

/**
 * A collection of utilities around {@link Metamodel}s
 */
class MetamodelExtensions
{
	@Inject extension IQualifiedNameProvider
	@Inject extension LanguageExtensions
	@Inject extension ModelingElementExtensions

	private static final Logger log = Logger.getLogger(MetamodelExtensions)

	/**
	 * Checks whether the given {@link Metamodel} {@code mm} is well-formed,
	 * ie. it has at least one package and associated genmodel.
	 */
	def boolean isValid(Metamodel mm) {
		return
			   !mm.pkgs.filterNull.empty
			&& !mm.genmodels.filterNull.empty
	}

	/**
	 * Generates and serializes a {@link GenModel} at the location {@code gmUri}
	 * for the {@link Metamodel} {@code mm} whose Ecore file is located at
	 * {@code ecoreUri}, using {@code targetModelDirectory} as its model directory.
	 */
	def void createGenmodel(Metamodel mm, String ecoreUri,
			String gmUri, String targetModelDirectory) {
		val resSet = new ResourceSetImpl
		val pkgRes = resSet.getResource(URI::createURI(ecoreUri), true)
		val pkgs = pkgRes.contents.map[it as EPackage]

		val genmodel = GenModelFactory.eINSTANCE.createGenModel => [
			complianceLevel = GenJDKLevel.JDK70_LITERAL
			modelDirectory = targetModelDirectory
				.replaceFirst("platform:/resource", "").replaceFirst("..", "")
			foreignModel += ecoreUri
			modelName = mm.owningLanguage.name
			modelPluginID = mm.owningLanguage.externalRuntimeName
			initialize(pkgs)
			genPackages.forEach[gp |
				gp.basePackage = mm.owningLanguage.fullyQualifiedName.toLowerCase.toString
				if (!mm.owningLanguage.fileExtension.nullOrEmpty)
					gp.fileExtensions = mm.owningLanguage.fileExtension 
				else
					gp.fileExtensions = mm.owningLanguage.name.toLowerCase.toString
			]
		]

		val res = resSet.createResource(URI::createURI(gmUri))
		res.contents += genmodel

		try {
			res.save(null)
		} catch (IOException e) {
			log.error("Error while serializing new genmodel", e)
		}
	}
}
