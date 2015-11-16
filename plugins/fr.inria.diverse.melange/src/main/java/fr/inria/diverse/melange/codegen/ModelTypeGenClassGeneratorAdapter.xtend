package fr.inria.diverse.melange.codegen

import org.eclipse.emf.codegen.ecore.generator.GeneratorAdapterFactory
import org.eclipse.emf.codegen.ecore.genmodel.GenClass
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenClassGeneratorAdapter
import org.eclipse.emf.common.util.Monitor

class ModelTypeGenClassGeneratorAdapter extends GenClassGeneratorAdapter {
	new(GeneratorAdapterFactory generatorAdapterFactory) {
		super(generatorAdapterFactory)
	}

	override generateClass(GenClass genClass, Monitor monitor) {
		// We don't want to generate implementation classes
		// as each implementing language will provide its own
		// set of adapters
	}
}
