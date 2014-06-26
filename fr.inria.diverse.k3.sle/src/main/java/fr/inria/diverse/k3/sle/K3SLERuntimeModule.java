package fr.inria.diverse.k3.sle ;

import org.eclipse.xtext.resource.IDerivedStateComputer ;

public class K3SLERuntimeModule extends fr.inria.diverse.k3.sle.AbstractK3SLERuntimeModule
{
	@Override
	public Class<? extends IDerivedStateComputer> bindIDerivedStateComputer() {
		return fr.inria.diverse.k3.sle.postprocessing.K3SLEPostProcessor.class ;
	}
}
