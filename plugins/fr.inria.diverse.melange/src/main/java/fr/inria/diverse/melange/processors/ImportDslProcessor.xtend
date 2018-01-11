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
import fr.inria.diverse.melange.metamodel.melange.ImportDsl
import fr.inria.diverse.melange.metamodel.melange.MelangeFactory
import org.eclipse.xtext.xbase.jvmmodel.JvmTypeReferenceBuilder

/**
 * Initialise the wrapping Language with informations from the Dsl file
 */
class ImportDslProcessor extends DispatchMelangeProcessor
{
	
	@Inject
	JvmTypeReferenceBuilder.Factory builderFactory
	
	def dispatch void preProcess(ImportDsl language, boolean isPreLinkingPhase) {
		
		val dsl = language.dsl
		
		val ecoreUris = 
			dsl
			?.entries
			?.filter[entry | entry.key == "ecore"]
			?.head
			?.value
			?.split(",")
			?.map[uri | uri.trim]
			
		val aspects = 
			dsl
			?.entries
			?.filter[entry | entry.key == "k3"]
			?.head
			?.value
			?.split(",")
			?.map[uri | uri.trim]
			
		language.name = dsl.name
		ecoreUris?.forEach[uri |
			language.operators +=
				MelangeFactory.eINSTANCE.createImport => [
					ecoreUri = uri
				]
		]
		
		val typeRefBuilder = builderFactory.create(language.eResource.resourceSet)
		aspects?.forEach[aspectClassName |
			language.operators +=
				MelangeFactory.eINSTANCE.createWeave => [
					aspectTypeRef = typeRefBuilder.typeRef(aspectClassName)
				]
		]
	}
}