package fr.inria.diverse.melange.processors

import fr.inria.diverse.melange.ast.MetamodelExtensions

import fr.inria.diverse.melange.metamodel.melange.Metamodel

import fr.inria.diverse.melange.utils.AspectCopier

import javax.inject.Inject

import org.eclipse.xtext.common.types.JvmDeclaredType

import org.eclipse.xtext.xbase.jvmmodel.JvmTypeReferenceBuilder

class AspectsCopier extends DispatchMelangeProcessor
{
	@Inject AspectCopier copier
	@Inject extension MetamodelExtensions
	@Inject JvmTypeReferenceBuilder.Factory builderFactory

	def dispatch void preProcess(Metamodel mm) {
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
}
