package fr.inria.diverse.melange.processors

import fr.inria.diverse.melange.ast.MetamodelExtensions
import fr.inria.diverse.melange.metamodel.melange.Metamodel
import fr.inria.diverse.melange.utils.AspectCopier
import javax.inject.Inject
import org.apache.log4j.Logger
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.xbase.jvmmodel.JvmTypeReferenceBuilder
import fr.inria.diverse.melange.utils.ErrorHelper

class AspectsCopier extends DispatchMelangeProcessor
{
	@Inject AspectCopier copier
	@Inject extension MetamodelExtensions
	@Inject JvmTypeReferenceBuilder.Factory builderFactory
	@Inject ErrorHelper errorHelper
	static Logger log = Logger.getLogger(AspectsCopier)

	def dispatch void preProcess(Metamodel mm) {
		try{
			if (!mm.isGeneratedByMelange || mm.runtimeHasBeenGenerated) {
				mm.aspects.forEach[asp |
					if (asp.aspectTypeRef?.type instanceof JvmDeclaredType) {
						if (!asp.isDefinedOver(mm) && asp.canBeCopiedFor(mm)) {
							val typeRefBuilder = builderFactory.create(mm.eResource.resourceSet)
							val newAspectFqn = copier.copyAspectTo(asp, mm)
							val newAspectRef = typeRefBuilder.typeRef(newAspectFqn)
							asp.aspectTypeRef = newAspectRef
						}
					}
				]
			}
		} catch (Exception e) {
			log.error("Unexpected error", e)
			errorHelper.addError(mm, "Unexpected error in AspectsCopier: "+e.message+", please analyze the log", null)
		}
	}
}
