package fr.inria.diverse.melange.codegen

import java.util.List
import org.eclipse.emf.codegen.ecore.generator.GeneratorAdapterFactory
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenPackageGeneratorAdapter

/**
 * A specialized {@link GenPackageGeneratorAdapter} that registers a specialized
 * JavaJet template for generated {@link EFactory} used for the generation of
 * {@link ModelType}s. Using this template, the generated factory will always
 * throw an exception when trying to create a new model element (via
 * {@code createX()} methods), as {@link ModelType} are inherently abstract
 * and it does not make sense to call the factory methods on them.
 */
class ModelTypeGenPackageGeneratorAdapter extends GenPackageGeneratorAdapter {
	new(GeneratorAdapterFactory generatorAdapterFactory) {
		super(generatorAdapterFactory)
	}

	override addBaseTemplatePathEntries(List<String> templatePath) {
		templatePath.add("platform:/plugin/fr.inria.diverse.melange/templates");
		super.addBaseTemplatePathEntries(templatePath)
	}

	override getJETEmitter(JETEmitterDescriptor[] jetEmitterDescriptors, int id) {
		if (id == GenPackageGeneratorAdapter::FACTORY_CLASS_ID) {
			if (jetEmitters.get(id) === null) {
				val factoryClassJet = new JETEmitterDescriptor("model/FactoryClass.javajet", "")
				jetEmitters.set(id, createJETEmitter(factoryClassJet))
			}
		}

		return super.getJETEmitter(jetEmitterDescriptors, id)
	}
}
