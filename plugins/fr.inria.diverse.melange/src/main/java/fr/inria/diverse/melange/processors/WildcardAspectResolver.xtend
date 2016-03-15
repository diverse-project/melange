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

class WildcardAspectResolver extends DispatchMelangeProcessor
{
	@Inject JvmTypeReferenceBuilder.Factory builderFactory
	private static final Logger log = Logger.getLogger(WildcardAspectResolver)

	def dispatch void preProcess(Weave w, boolean preLinkingPhase) {
		val typeRefBuilder = builderFactory.create(w.eResource.resourceSet)
		if (w.aspectWildcardImport !== null) {
			resolveWildcardImport(w.aspectWildcardImport).forEach[typeRef |
				w.owningLanguage.operators += MelangeFactory.eINSTANCE.createWeave => [
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
							// No Context/Properties classes generated from  @Aspect
							.filter[!elementName.endsWith("AspectContext.java")
									&& !elementName.endsWith("AspectProperties.java")]
							.map['''«pkg.elementName».«elementName.substring(0, elementName.length - 5)»''']
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
			SearchPattern.R_EXACT_MATCH//.bitwiseOr(SearchPattern.R_CASE_SENSITIVE)
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
