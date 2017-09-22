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

import fr.inria.diverse.melange.metamodel.melange.ImportDsl
import org.eclipse.gemoc.dsl.SimpleValue
import fr.inria.diverse.melange.metamodel.melange.MelangeFactory
import com.google.inject.Inject
import org.eclipse.xtext.xbase.jvmmodel.JvmTypeReferenceBuilder
import org.eclipse.xtext.scoping.IScopeProvider
import org.eclipse.xtext.naming.IQualifiedNameConverter

/**
 * Initialise the wrapping Language with informations from the Dsl file
 */
class ImportDslProcessor extends DispatchMelangeProcessor
{
	
	@Inject
	JvmTypeReferenceBuilder.Factory builderFactory
	
	@Inject
	extension IQualifiedNameConverter
	
	@Inject
	IScopeProvider scopeProvider
	
	def dispatch void preProcess(ImportDsl language, boolean isPreLinkingPhase) {
		
//		val dslRef = language.eClass.EReferences.findFirst[name == "dsl"]
//		val scope = scopeProvider.getScope(language,dslRef)
//		val candidates = scope.getElements(language.name.toQualifiedName).toList
		
		val dsl = language.dsl
		
		val ecoreUris =
			dsl
			?.abstractSyntax
			?.values
			?.filter(SimpleValue)
			?.filter[value | value.name == "ecore"]
			?.head
			?.values
		
		val aspects =
			dsl
			?.semantic
			?.values
			?.filter(SimpleValue)
			?.filter[value | value.name == "k3"]
			?.head
			?.values


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