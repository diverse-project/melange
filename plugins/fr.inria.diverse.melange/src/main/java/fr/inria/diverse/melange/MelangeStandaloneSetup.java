package fr.inria.diverse.melange ;

import org.eclipse.emf.ecore.EPackage ;

import com.google.inject.Injector ;

public class MelangeStandaloneSetup extends MelangeStandaloneSetupGenerated
{
	public static void doSetup() {
		new MelangeStandaloneSetup().createInjectorAndDoEMFRegistration() ;
	}

        @Override
	public void register(Injector injector) {
		if (!EPackage.Registry.INSTANCE.containsKey("http://www.inria.fr/diverse/melange"))
			EPackage.Registry.INSTANCE.put("http://www.inria.fr/diverse/melange", fr.inria.diverse.melange.metamodel.melange.MelangePackage.eINSTANCE) ;

		super.register(injector) ;
	}
}
