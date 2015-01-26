package fr.inria.diverse.melange.ast

import com.google.inject.Inject

import fr.inria.diverse.melange.algebra.ModelTypeAlgebra

import fr.inria.diverse.melange.ast.ASTHelper
import fr.inria.diverse.melange.ast.ASTProcessingException
import fr.inria.diverse.melange.ast.MetamodelExtensions
import fr.inria.diverse.melange.ast.ModelTypeExtensions

import fr.inria.diverse.melange.metamodel.melange.MelangeFactory
//import fr.inria.diverse.melange.metamodel.melange.KomprenSlicer
import fr.inria.diverse.melange.metamodel.melange.Metamodel
import fr.inria.diverse.melange.metamodel.melange.ModelType
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace
import fr.inria.diverse.melange.metamodel.melange.XbaseTransformation

import fr.inria.diverse.melange.utils.AspectToEcore

import org.eclipse.xtext.common.types.JvmDeclaredType

import org.eclipse.xtext.util.internal.Stopwatches
import fr.inria.diverse.melange.typesystem.MelangeTypesRegistry
import org.eclipse.xtext.naming.IQualifiedNameProvider

class ASTCompleter
{
	@Inject extension ASTHelper
	@Inject extension MetamodelExtensions
	@Inject extension ModelTypeExtensions
	@Inject extension AspectToEcore
	@Inject ModelTypeAlgebra algebra
	@Inject MelangeTypesRegistry typesRegistry
	@Inject extension IQualifiedNameProvider

	def void inferTypingRelations(ModelTypingSpace root) {
		val task = Stopwatches.forTask("infering typing relations")
		task.start

		root.modelTypes
		.forEach[mt1 |
			root.modelTypes
			.filter[mt2 | mt2 != mt1 && !mt1.subtypingRelations.exists[superType?.name == mt2?.name] && mt1.isSubtypeOf(mt2)]
			.forEach[mt2 |
				mt1.subtypingRelations += MelangeFactory.eINSTANCE.createSubtyping => [
					subType = mt1
					superType = mt2
				]

				typesRegistry.registerSubtyping(mt1.fullyQualifiedName.toString, mt2)
			]

			root.metamodels
			.filter[mm | !mm.^implements.exists[name == mt1.name] && mm.isTypedBy(mt1)]
			.forEach[mm |
				mm.^implements += mt1

				typesRegistry.registerImplementation(mm.fullyQualifiedName.toString, mt1)
			]
		]

		task.stop
	}

	def dispatch void complete(ModelTypingSpace root) throws ASTProcessingException {
		val task = Stopwatches.forTask("Completing AST")
		task.start

		root.metamodels.forEach[complete]
		root.modelTypes.forEach[complete]
		root.transformations.forEach[complete]

		task.stop
	}

	def dispatch void complete(Metamodel mm) throws ASTProcessingException {
		mm.aspects.forEach[asp |
			if (!(asp.aspectTypeRef.type instanceof JvmDeclaredType))
				throw new ASTProcessingException("Aspect must be a generic type: " + asp.aspectTypeRef?.type)

			val className = asp.aspectAnnotationValue

			if (className === null)
				throw new ASTProcessingException("Cannot find annotation value for " + asp.aspectTypeRef?.type)

			val cls = mm.findClass(className)

			if (cls === null)
				throw new ASTProcessingException("Cannot find aspectized class for " + asp.aspectTypeRef?.type)

			asp.aspectedClass = cls
			asp.inferEcoreFragment

			// FIXME: _not_ .head, could be any of them
			algebra.weaveAspect(mm, asp)
		]
	}

	def dispatch void complete(ModelType mt) {
		// ...
	}

	def dispatch void complete(XbaseTransformation t) {
		// ...
	}

//	def dispatch void complete(KomprenSlicer t) {
//		// ...
//	}
}
