package fr.inria.diverse.melange;

import org.eclipse.xtext.resource.IDerivedStateComputer;
import org.eclipse.xtext.xbase.compiler.XbaseCompiler;
import org.eclipse.xtext.xbase.typesystem.computation.SynonymTypesProvider;

public class MelangeRuntimeModule extends fr.inria.diverse.melange.AbstractMelangeRuntimeModule
{
	@Override
	public Class<? extends IDerivedStateComputer> bindIDerivedStateComputer() {
		return fr.inria.diverse.melange.processors.MelangeDerivedStateComputer.class ;
	}

	public Class<? extends SynonymTypesProvider> bindSynonymTypesProvider() {
		return fr.inria.diverse.melange.typesystem.MelangeSynonymTypesProvider.class ;
	}

	public Class<? extends XbaseCompiler> bindXbaseCompiler() {
		return fr.inria.diverse.melange.compiler.ModelOrientedXbaseCompiler.class ;
	}
}
