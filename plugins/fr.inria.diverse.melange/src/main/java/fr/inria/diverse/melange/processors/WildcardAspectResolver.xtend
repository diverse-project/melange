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
import fr.inria.diverse.melange.metamodel.melange.MelangeFactory
import fr.inria.diverse.melange.metamodel.melange.Weave
import java.util.List
import org.apache.log4j.Logger
import org.eclipse.core.runtime.CoreException
import org.eclipse.jdt.core.IPackageFragment
import org.eclipse.jdt.core.JavaModelException
import org.eclipse.jdt.core.search.IJavaSearchConstants
import org.eclipse.jdt.core.search.SearchEngine
import org.eclipse.jdt.core.search.SearchMatch
import org.eclipse.jdt.core.search.SearchPattern
import org.eclipse.jdt.core.search.SearchRequestor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypeReferenceBuilder

/**
 * Parses the wildcard imports of aspects ({@code with x.y.*}), retrieves
 * the actual aspects hidden behind the wildcard and adds them to the appropriate
 * {@link Language}.
 */
class WildcardAspectResolver extends DispatchMelangeProcessor
{
	@Inject JvmTypeReferenceBuilder.Factory builderFactory
	static final Logger log = Logger.getLogger(WildcardAspectResolver)

	def dispatch void preProcess(Weave w, boolean preLinkingPhase) {
		val typeRefBuilder = builderFactory.create(w.eResource.resourceSet)

		if (w.aspectWildcardImport !== null) {
			resolveWildcardImport(w.aspectWildcardImport).forEach[typeRef |
				w.owningLanguage.operators +=
					MelangeFactory.eINSTANCE.createWeave => [
						aspectTypeRef = typeRefBuilder.typeRef(typeRef)
					]
			]
		}
	}

	private def List<String> resolveWildcardImport(String wildcardImport) {
		val matches = newArrayList
		val engine = new SearchEngine

		val requestor = new SearchRequestor() {
			override acceptSearchMatch(SearchMatch match) {
				if (match.element instanceof IPackageFragment) {
					val pkg = match.element as IPackageFragment

					try {
						matches +=
							pkg.children
							// We don't want the Context/Properties from K3
							.filter[
								   !elementName.endsWith("AspectContext.java")
								&& !elementName.endsWith("AspectProperties.java")
							]
							.map[
								// Remove 'Aspect' suffix
								val trimmedAspectName = elementName.substring(
									0, elementName.length - 5)

								'''«pkg.elementName».«trimmedAspectName»'''
							]
					} catch (JavaModelException e) {
						log.error(e)
					}
				}
			}
		}

		val pattern = SearchPattern.createPattern(
			wildcardImport.substring(0, wildcardImport.length - 2),
			IJavaSearchConstants.PACKAGE,
			IJavaSearchConstants.DECLARATIONS,
			SearchPattern.R_EXACT_MATCH
			//.bitwiseOr(SearchPattern.R_CASE_SENSITIVE)
		)

		try {
			engine.search(
				pattern,
				#[SearchEngine.defaultSearchParticipant],
				SearchEngine.createWorkspaceScope,
				requestor,
				null
			)
		} catch (CoreException e) {
			log.error(e)
		}

		return matches
	}
}
