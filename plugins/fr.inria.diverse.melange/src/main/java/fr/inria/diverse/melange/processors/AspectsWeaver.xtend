package fr.inria.diverse.melange.processors

import com.google.inject.Inject
import fr.inria.diverse.melange.algebra.ModelTypeAlgebra
import fr.inria.diverse.melange.ast.MetamodelExtensions
import fr.inria.diverse.melange.metamodel.melange.Metamodel
import fr.inria.diverse.melange.utils.AspectToEcore
import org.eclipse.xtext.common.types.JvmDeclaredType

class AspectsWeaver extends DispatchMelangeProcessor
{
	@Inject ModelTypeAlgebra algebra
	@Inject extension MetamodelExtensions
	@Inject extension AspectToEcore

	def dispatch void preProcess(Metamodel mm) {
		mm.aspects.forEach[asp |
			if (asp.aspectTypeRef?.type instanceof JvmDeclaredType) {
				if (!asp.isDefinedOver(mm) && asp.canBeCopiedFor(mm)) {
					asp.copyFor(mm)
				}
				
				val className = asp.aspectAnnotationValue
				val cls = mm.findClass(className)
				asp.aspectedClass = cls

				if (asp.aspectedClass !== null) {
					asp.inferEcoreFragment
					algebra.weaveAspect(mm, asp)
				}
			}
		]
	}
}
