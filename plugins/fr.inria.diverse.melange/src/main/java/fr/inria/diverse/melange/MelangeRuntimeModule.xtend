package fr.inria.diverse.melange

import org.eclipse.xtext.resource.IDerivedStateComputer
import org.eclipse.xtext.xbase.compiler.XbaseCompiler
import org.eclipse.xtext.xbase.typesystem.computation.SynonymTypesProvider

class MelangeRuntimeModule extends fr.inria.diverse.melange.AbstractMelangeRuntimeModule
{
	override Class<? extends IDerivedStateComputer> bindIDerivedStateComputer() {
		return typeof(fr.inria.diverse.melange.resource.MelangeDerivedStateComputer)
	}

	def Class<? extends SynonymTypesProvider> bindSynonymTypesProvider() {
		return typeof(fr.inria.diverse.melange.typesystem.MelangeSynonymTypesProvider)
	}

	def Class<? extends XbaseCompiler> bindXbaseCompiler() {
		return typeof(fr.inria.diverse.melange.compiler.ModelOrientedXbaseCompiler)
	}
}
