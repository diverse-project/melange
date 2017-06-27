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
package fr.inria.diverse.melange.processors

import com.google.common.collect.ArrayListMultimap
import fr.inria.diverse.melange.ast.ASTHelper
import fr.inria.diverse.melange.ast.LanguageExtensions
import fr.inria.diverse.melange.ast.ModelTypeExtensions
import fr.inria.diverse.melange.ast.ModelingElementExtensions
import fr.inria.diverse.melange.ast.NamingHelper
import fr.inria.diverse.melange.eclipse.EclipseProjectHelper
import fr.inria.diverse.melange.metamodel.melange.Language
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace
import fr.inria.diverse.melange.utils.PluginXmlChanger
import javax.inject.Inject
import org.apache.log4j.Logger
import org.eclipse.core.runtime.CoreException
import org.eclipse.pde.internal.core.PDECore
import org.eclipse.pde.internal.core.plugin.WorkspacePluginModel
import org.eclipse.pde.internal.core.project.PDEProject
import org.eclipse.xtext.documentation.IEObjectDocumentationProvider
import org.eclipse.xtext.naming.IQualifiedNameProvider
import fr.inria.diverse.melange.metamodel.melange.ExternalLanguage

/**
 * For each {@link ModelType}, creates the corresponding
 * 'fr.inria.diverse.melange.modeltype' contribution in plugin.xml.
 * For each {@link Language}, creates the corresponding
 * 'fr.inria.diverse.melange.language' contribution in plugin.xml,
 * with the list of adapters towards implemented model types.
 */
class ExtensionPointProcessor extends DispatchMelangeProcessor
{
	@Inject extension NamingHelper
	@Inject extension ModelingElementExtensions
	@Inject extension LanguageExtensions
	@Inject extension ModelTypeExtensions
	@Inject extension ASTHelper
	@Inject extension EclipseProjectHelper
	@Inject extension IQualifiedNameProvider
	@Inject IEObjectDocumentationProvider documentationProvider

	private static final Logger log = Logger.getLogger(ExtensionPointProcessor)

	private static final String MELANGE_RESOURCE_PLUGIN =
		"fr.inria.diverse.melange.resource"
	private static final String LANGUAGE_EXTENSION_POINT =
		"fr.inria.diverse.melange.language"
	private static final String MODELTYPE_EXTENSION_POINT =
		"fr.inria.diverse.melange.modeltype"

	def dispatch void preProcess(ModelTypingSpace root, boolean preLinkingPhase) {
		val project = root.eResource.project

		if (project !== null && !preLinkingPhase) {
			val pluginXml = PDEProject::getPluginXml(project)
			
			val changer = new PluginXmlChanger
			changer.load(pluginXml.location.toString)
			
			val pluginModel = PDECore::getDefault.modelManager.findModel(project)
			val fModel = new WorkspacePluginModel(pluginXml, false)
			val pluginBase = fModel.pluginBase

			val melangeResourcePlugin =
				PDECore::getDefault.modelManager.allModels.findFirst[
					bundleDescription.name == MELANGE_RESOURCE_PLUGIN
				]
			val languageExtensionPoint =
				melangeResourcePlugin.extensions.extensionPoints.findFirst[
					fullId == LANGUAGE_EXTENSION_POINT
				]
			val modeltypeExtensionPoint =
				melangeResourcePlugin.extensions.extensionPoints.findFirst[
					fullId == MODELTYPE_EXTENSION_POINT
				]

			fModel.editable = true
			fModel.load

			if (pluginModel !== null && pluginBase !== null) {
				val modelTypes = root.modelTypes.filter[isValid]
				val languages = root.languages.filter[isValid]

				if (modelTypes.size > 0 && modeltypeExtensionPoint !== null) {
					
					changer.deleteExtensions(MODELTYPE_EXTENSION_POINT)
					val extensionTag = changer.addExtension(
						MODELTYPE_EXTENSION_POINT)

					modelTypes.forEach[mt |
						try {
							val fqn = mt.fullyQualifiedName.toString
							val doc = documentationProvider.getDocumentation(mt)
							
							val modelTypeTag = changer.addChild(extensionTag,
								"modeltype")
							changer.addAttribute(modelTypeTag, "id", fqn)
							changer.addAttribute(modelTypeTag, "uri", mt.uri)

							if (doc !== null && !doc.empty)
								changer.addAttribute(
									modelTypeTag,
									"description",
									doc
								)
							
							// Register subtyping relations
							mt.subtypingRelations.forEach[superMt |
								val subtypingTag = changer.addChild(modelTypeTag,
									"subtyping")
								changer.addAttribute(
									subtypingTag,
									"modeltypeId",
									superMt.superType.fullyQualifiedName.toString
								)
							]
							
							log.debug('''Registered new modeltype contribution «
							»<«fqn», «mt.uri»> in plugin.xml''')
						} catch (CoreException e) {
							log.error(
							'''Failed to register new model type contribution''',
							e)
						}
					]
				}

				if (languages.size > 0 && languageExtensionPoint !== null) {
					changer.deleteExtensions(LANGUAGE_EXTENSION_POINT)
					val extensionTag = changer.addExtension(LANGUAGE_EXTENSION_POINT)

					languages.forEach[l |
						try {
							val fqn = l.fullyQualifiedName.toString
							val doc = documentationProvider.getDocumentation(l)
							
							val languageTag = changer.addChild(extensionTag,
								"language")
							changer.addAttribute(
								languageTag,
								"id",
								fqn
							)
							changer.addAttribute(
								languageTag,
								"exactType",
								l.exactType.fullyQualifiedName.toString
							)
							changer.addAttribute(
								languageTag,
								"uri",
								l.syntax.pkgs.head.nsURI
							)

							if (doc !== null && !doc.empty)
								changer.addAttribute(
									languageTag,
									"description",
									doc
								)

							changer.addAttribute(
								languageTag,
								"entryPoints", 
								l.entryPoints
								.map[
									val args =
										parameters
										.map[parameterType.type.qualifiedName]
										.join(",")

									'''«declaringType.qualifiedName».«simpleName»(«args»)'''
								]
								.join(';')
							)

							changer.addAttribute(
								languageTag,
								"aspects",
								l.serializedAspects
							)

							// Register adapters
							l.implements
							.filter[mt | !(l instanceof ExternalLanguage && l.exactType == mt)]
							.forEach[mt |
								val adapterTag = changer.addChild(languageTag,
									"adapter")

								changer.addAttribute(
									adapterTag,
									"modeltypeId",
									mt.fullyQualifiedName.toString
								)
								changer.addAttribute(
									adapterTag,
									"class",
									l.syntax.adapterNameFor(mt)
								)
							]

							log.debug('''Registered new language contribution «
							»<«fqn»> in plugin.xml''')
						} catch (CoreException e) {
							log.debug(
							'''Failed to register language contribution''', e)
						}
					]
				}
			}

			changer.save(2)
		}
	}
	
	/**
	 * Returns all the fully qualified name of the aspects woven on the
	 * {@link Language} {@code lang}, following the template:
	 * <br>
	 * aspectizedClass:aspect,...,aspect;...;aspectizedClass:aspect,...,aspect
	 */
	def private String getSerializedAspects(Language lang) {
		val mapping = ArrayListMultimap.create

		lang.semantics.forEach[asp |
			val aspName = asp.aspectTypeRef?.qualifiedName 
			val targetName = asp.aspectedClass?.name

			if (aspName !== null && targetName !== null)
				mapping.put(targetName, aspName)
		]

		return
			mapping.keySet
			.map[target |
				val aspects = mapping.get(target).join(",")
				'''«target»:«aspects»'''
			]
			.join(";")
	}
}
