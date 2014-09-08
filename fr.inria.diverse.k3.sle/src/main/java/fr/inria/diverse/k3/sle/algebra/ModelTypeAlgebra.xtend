package fr.inria.diverse.k3.sle.algebra

import com.google.inject.ImplementedBy

import fr.inria.diverse.k3.sle.metamodel.k3sle.Metamodel
import fr.inria.diverse.k3.sle.metamodel.k3sle.Aspect

/**
 * Just to simplify some common operations for now
 *
 * Should then be defined only in terms of metamodels/modeltypes
 * which will require important modifications to the metalanguage
 */
@ImplementedBy(EmfCompareAlgebra)
interface ModelTypeAlgebra
{
	def void weaveAspect(Metamodel mm, Aspect aspect)
}
