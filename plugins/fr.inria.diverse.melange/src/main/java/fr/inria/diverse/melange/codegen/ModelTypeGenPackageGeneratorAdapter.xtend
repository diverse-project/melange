package fr.inria.diverse.melange.codegen

import java.util.List
import org.eclipse.emf.codegen.ecore.generator.GeneratorAdapterFactory
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenPackageGeneratorAdapter

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
