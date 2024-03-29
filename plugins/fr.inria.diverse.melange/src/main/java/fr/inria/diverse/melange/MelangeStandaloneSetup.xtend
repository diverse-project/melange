/*
 * generated by Xtext 2.25.0
 */
package fr.inria.diverse.melange

import com.google.inject.Injector
import org.eclipse.emf.ecore.EPackage

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class MelangeStandaloneSetup extends MelangeStandaloneSetupGenerated {

	def static void doSetup() {
		new MelangeStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
	
	override register(Injector injector) {
		if (!EPackage.Registry.INSTANCE.containsKey("http://www.inria.fr/diverse/melange"))
			EPackage.Registry.INSTANCE.put("http://www.inria.fr/diverse/melange", fr.inria.diverse.melange.metamodel.melange.MelangePackage.eINSTANCE) ;

		super.register(injector) ;
	}
}
