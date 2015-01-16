package fr.inria.diverse.melange.ast

import com.google.inject.Inject

import fr.inria.diverse.melange.metamodel.melange.ModelingElement

import fr.inria.diverse.melange.utils.EPackageRegistry

import java.util.List

import org.eclipse.emf.ecore.EPackage

class ModelingElementExtensions
{
	@Inject EPackageRegistry registry

	def List<EPackage> getPkgs(ModelingElement m) {
		return registry.getPackages(m)
	}
}
