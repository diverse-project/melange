package fr.inria.diverse.k3.sle.algebra

import com.google.inject.ImplementedBy

import org.eclipse.emf.ecore.EPackage

/**
 * Just to simplify some common operations for now
 * 
 * Should then be defined only in terms of metamodels/modeltypes
 * which will require important modifications to the metalanguage
 */
@ImplementedBy(EmfCompareAlgebra)
interface ModelTypeAlgebra
{
	def void weaveAspect(EPackage base, EPackage aspect)
}
