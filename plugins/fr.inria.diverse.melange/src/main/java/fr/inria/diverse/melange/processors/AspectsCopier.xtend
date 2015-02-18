package fr.inria.diverse.melange.processors

import fr.inria.diverse.melange.ast.MetamodelExtensions

import fr.inria.diverse.melange.metamodel.melange.Metamodel

import fr.inria.diverse.melange.utils.AspectCopier

import javax.inject.Inject

import org.eclipse.xtext.common.types.JvmDeclaredType

class AspectsCopier extends DispatchMelangeProcessor
{
	@Inject AspectCopier copier
	@Inject extension MetamodelExtensions

	def dispatch void preProcess(Metamodel mm) {
		mm.aspects.forEach[asp |
			if (asp.aspectTypeRef?.type instanceof JvmDeclaredType) {
				if (!asp.isDefinedOver(mm) && asp.canBeCopiedFor(mm)) {
					copier.copyAspectTo(asp, mm)
				}
			}
		]
	}
}
