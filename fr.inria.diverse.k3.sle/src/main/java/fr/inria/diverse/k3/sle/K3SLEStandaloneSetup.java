package fr.inria.diverse.k3.sle ;

import org.eclipse.emf.ecore.EPackage ;

import com.google.inject.Injector ;

public class K3SLEStandaloneSetup extends K3SLEStandaloneSetupGenerated
{
	public static void doSetup() {
		new K3SLEStandaloneSetup().createInjectorAndDoEMFRegistration() ;
	}

        @Override
	public void register(Injector injector) {
		if (!EPackage.Registry.INSTANCE.containsKey("http://www.inria.fr/diverse/k3/sle"))
			EPackage.Registry.INSTANCE.put("http://www.inria.fr/diverse/k3/sle", fr.inria.diverse.k3.sle.metamodel.k3sle.K3slePackage.eINSTANCE) ;

		super.register(injector) ;
	}
}
