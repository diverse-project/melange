package fr.inria.diverse.melange.processors

import com.google.inject.Inject
import fr.inria.diverse.melange.ast.ASTHelper
import fr.inria.diverse.melange.ast.LanguageExtensions
import fr.inria.diverse.melange.ast.ModelTypeExtensions
import fr.inria.diverse.melange.metamodel.melange.MelangeFactory
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace
import fr.inria.diverse.melange.typesystem.MelangeTypesRegistry
import org.eclipse.xtext.naming.IQualifiedNameProvider

/**
 * This class computes and store the typing hierarchy of Model types
 */
class TypingInferrer extends DispatchMelangeProcessor
{
	@Inject extension ASTHelper
	@Inject extension ModelTypeExtensions
	@Inject extension IQualifiedNameProvider
	@Inject extension LanguageExtensions
	@Inject MelangeTypesRegistry typesRegistry

	def dispatch void preProcess(ModelTypingSpace root, boolean preLinkingPhase) {
		typesRegistry.clear

		root.modelTypes
		.filter[name !== null]
		.forEach[mt1 |
			root.modelTypes
			.filter[mt2 | mt2 != mt1 && !mt1.subtypingRelations.exists[superType.name == mt2.name] && mt1.isSubtypeOf(mt2)]
			.forEach[mt2 |
				mt1.subtypingRelations += MelangeFactory.eINSTANCE.createSubtyping => [
					subType = mt1
					superType = mt2
				]

				typesRegistry.registerSubtyping(mt1.fullyQualifiedName.toString, mt2)
			]

			root.languages
			.filter[l | l.name !== null && !l.^implements.exists[name == mt1.name] && l.doesImplement(mt1)]
			.forEach[l |
				l.^implements += mt1

				typesRegistry.registerImplementation(l.fullyQualifiedName.toString, mt1)
			]
		]
	}

	def dispatch void postProcess(ModelTypingSpace root) {
		root.languages.forEach[^implements.clear]
		root.modelTypes.forEach[subtypingRelations.clear]
	}
}
