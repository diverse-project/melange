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

import com.google.inject.Inject
import fr.inria.diverse.melange.ast.ASTHelper
import fr.inria.diverse.melange.metamodel.melange.MelangeFactory
import fr.inria.diverse.melange.metamodel.melange.ModelType
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace
import java.util.List
import org.eclipse.emf.ecore.util.EcoreUtil
import fr.inria.diverse.melange.metamodel.melange.Language
import fr.inria.diverse.melange.metamodel.melange.ExternalLanguage
import fr.inria.diverse.melange.metamodel.melange.Import
import fr.inria.diverse.melange.ast.ModelTypeExtensions

/**
 * For each {@link Language} in the current {@link Resource}, extract its
 * exact {@link ModelType}. The new model type is named $LanguageName$MT, or
 * can be explicitly specified by the user using the 'exactType' clause.
 */
class ExactTypeInferrer extends DispatchMelangeProcessor
{
	@Inject extension ASTHelper
	@Inject extension ModelTypeExtensions
	
	List<ModelType> inferredMTs = newArrayList

	def dispatch void preProcess(ModelTypingSpace root, boolean preLinkingPhase) {
		inferredMTs = newArrayList

		root.languages.forEach[l |
			if (l.exactTypeName === null)
				l.exactTypeName = l.name + "MT"

			val newMT = MelangeFactory.eINSTANCE.createModelType => [
				name = l.exactTypeName
			]

			if (!root.modelTypes.exists[name == newMT.name])
				inferredMTs += newMT
		]

		root.elements += inferredMTs
		root.languages.forEach[l |
			l.exactType = root.modelTypes.findFirst[name == l.exactTypeName]
			l.initializeExactType
		]
		root.mappings.forEach[m |
			m.to = root.modelTypes.findFirst[name == m.to?.name]
		]
		
	}

	def dispatch void postProcess(ModelTypingSpace root) {
		inferredMTs.forEach[EcoreUtil::remove(it)]
	}
	
	/**
	 * Initializes the #ecoreUri of the exact {@link ModelType} of the supplied
	 * {@code language}.
	 */
	private def void initializeExactType(Language language) {
		if(language instanceof ExternalLanguage)
			language.exactType.ecoreUri = language.operators.filter(Import).head?.ecoreUri
		else if (language.exactType !== null)
			language.exactType.ecoreUri = language.exactType.inferredEcoreUri
	}
}
