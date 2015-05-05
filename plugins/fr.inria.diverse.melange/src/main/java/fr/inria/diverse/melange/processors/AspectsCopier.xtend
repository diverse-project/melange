package fr.inria.diverse.melange.processors

import com.google.inject.Inject
import fr.inria.diverse.melange.ast.MetamodelExtensions
import fr.inria.diverse.melange.metamodel.melange.Metamodel
import fr.inria.diverse.melange.utils.AspectCopier
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
}
