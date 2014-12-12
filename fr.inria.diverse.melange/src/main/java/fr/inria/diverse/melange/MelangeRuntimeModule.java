package fr.inria.diverse.melange;

import org.eclipse.xtext.resource.IDerivedStateComputer;

public class MelangeRuntimeModule extends fr.inria.diverse.melange.AbstractMelangeRuntimeModule
{
	@Override
	public Class<? extends IDerivedStateComputer> bindIDerivedStateComputer() {
		return fr.inria.diverse.melange.processors.MelangeDerivedStateComputer.class ;
	}
}
