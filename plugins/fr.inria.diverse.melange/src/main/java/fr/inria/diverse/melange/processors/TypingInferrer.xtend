package fr.inria.diverse.melange.processors

import com.google.inject.Inject
import fr.inria.diverse.melange.ast.ASTHelper
import fr.inria.diverse.melange.ast.MetamodelExtensions
import fr.inria.diverse.melange.ast.ModelTypeExtensions
import fr.inria.diverse.melange.metamodel.melange.MelangeFactory
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace
import fr.inria.diverse.melange.typesystem.MelangeTypesRegistry
import org.eclipse.xtext.naming.IQualifiedNameProvider

class TypingInferrer extends DispatchMelangeProcessor
{
	@Inject extension ASTHelper
	@Inject extension ModelTypeExtensions
	@Inject extension IQualifiedNameProvider
	@Inject extension MetamodelExtensions
	@Inject MelangeTypesRegistry typesRegistry

	def dispatch void preProcess(ModelTypingSpace root) {
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

			root.metamodels
			.filter[mm | mm.name !== null && !mm.^implements.exists[name == mt1.name] && mm.isTypedBy(mt1)]
			.forEach[mm |
				mm.^implements += mt1

				typesRegistry.registerImplementation(mm.fullyQualifiedName.toString, mt1)
			]
		]
	}

	def dispatch void postProcess(ModelTypingSpace root) {
		root.metamodels.forEach[^implements.clear]
		root.modelTypes.forEach[subtypingRelations.clear]
		typesRegistry.clear
	}
}
