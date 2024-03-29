/*
 * generated by Xtext 2.25.0
 */
package fr.inria.diverse.melange.ide

import com.google.inject.Guice
import fr.inria.diverse.melange.MelangeRuntimeModule
import fr.inria.diverse.melange.MelangeStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class MelangeIdeSetup extends MelangeStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new MelangeRuntimeModule, new MelangeIdeModule))
	}
	
}
