package fr.inria.diverse.melange.processors

import com.google.inject.Inject
import fr.inria.diverse.melange.algebra.ModelTypeAlgebra
import fr.inria.diverse.melange.ast.MetamodelExtensions
import fr.inria.diverse.melange.metamodel.melange.Metamodel
import fr.inria.diverse.melange.utils.AspectToEcore

/**
 * This class merges all aspects into the Metamodel
 */
class AspectsWeaver extends DispatchMelangeProcessor
{
	@Inject ModelTypeAlgebra algebra
	@Inject extension MetamodelExtensions
	@Inject extension AspectToEcore

	def dispatch void preProcess(Metamodel mm, boolean preLinkingPhase) {
		mm.aspects
		.filter[isComplete]
		// First, create all the new meta-classes
		// then, weave aspects
		.sortWith[aspA, aspB |
			if (aspA.hasAspectAnnotation)
				1
			else
				-1
		].forEach[asp |
			val className = asp.aspectAnnotationValue

			if (className !== null)
				asp.aspectedClass = mm.findClass(className)

			asp.ecoreFragment = asp.inferEcoreFragment(mm)
			algebra.weaveAspect(mm, asp)
		]
	}
}
