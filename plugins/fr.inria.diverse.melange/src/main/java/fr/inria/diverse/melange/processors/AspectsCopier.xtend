package fr.inria.diverse.melange.processors

import com.google.inject.Inject
import fr.inria.diverse.melange.ast.MetamodelExtensions
import fr.inria.diverse.melange.metamodel.melange.Metamodel
import fr.inria.diverse.melange.utils.AspectCopier
import java.util.List
import org.eclipse.jdt.core.IType
import org.eclipse.jdt.core.search.IJavaSearchConstants
import org.eclipse.jdt.core.search.SearchEngine
import org.eclipse.jdt.core.search.SearchMatch
import org.eclipse.jdt.core.search.SearchPattern
import org.eclipse.jdt.core.search.SearchRequestor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypeReferenceBuilder

class AspectsCopier extends DispatchMelangeProcessor
{
	@Inject AspectCopier copier
	@Inject extension MetamodelExtensions
	@Inject JvmTypeReferenceBuilder.Factory builderFactory

	def dispatch void preProcess(Metamodel mm) {
		if (!mm.isGeneratedByMelange || mm.runtimeHasBeenGenerated) {
			mm.aspects.forEach[asp |
				if (asp.isComplete) {
					if (asp.hasAspectAnnotation && !asp.isDefinedOver(mm) && asp.canBeCopiedFor(mm)) {
						val typeRefBuilder = builderFactory.create(mm.eResource.resourceSet)
						val newAspectFqn = copier.copyAspectTo(asp, mm)
						val newAspectRef = typeRefBuilder.typeRef(newAspectFqn)
						asp.aspectTypeRef = newAspectRef
					}
				}
			]
		}
	}

	private def List<String> resolveWildcardImport(String wildcardImport) {
		val matches = newArrayList
		val engine = new SearchEngine

		val requestor = new SearchRequestor() {
			override acceptSearchMatch(SearchMatch match) {
				if (match.element instanceof IType) {
					val type = match.element as IType
					val fqn = type.fullyQualifiedName
					val name = type.elementName

					// No Context/Properties classes generated from  @Aspect
					if (!(
						   (name.endsWith("Context")
						&& name.substring(0, (name.length - 7) / 2) == name.substring((name.length - 7) / 2, name.length - 7))
						|| (name.endsWith("Properties")
						&& name.substring(0, (name.length - 10) / 2) == name.substring((name.length - 10) / 2, name.length - 10))	
					))
						matches.add(type.fullyQualifiedName)
				}
			}
		}

		val pattern = SearchPattern.createPattern(
			wildcardImport,
			IJavaSearchConstants.CLASS,
			IJavaSearchConstants.DECLARATIONS,
			SearchPattern.R_PATTERN_MATCH
		)

		engine.search(
			pattern,
			#[SearchEngine.defaultSearchParticipant],
			SearchEngine.createWorkspaceScope,
			requestor,
			null
		)

		return matches
	}
}
