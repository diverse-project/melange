package fr.inria.diverse.melange.codegen

import org.eclipse.emf.codegen.ecore.genmodel.generator.GenBaseGeneratorAdapter
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenModelGeneratorAdapterFactory

/**
 * A specialized {@link GenModelGeneratorAdapterFactory} that is used to tune
 * the generation of the Java code of {@link ModelType}.
 * 
 * @see ModelTypeGenPackageGeneratorAdapter
 * @see ModelTypeGenClassGeneratorAdapter
 */
class ModelTypeGeneratorAdapterFactory extends GenModelGeneratorAdapterFactory {
	protected GenBaseGeneratorAdapter overridedGenPackageGeneratorAdapter
	protected GenBaseGeneratorAdapter overridedGenClassGeneratorAdapter

	override createGenPackageAdapter() {
		if (overridedGenPackageGeneratorAdapter === null)
			overridedGenPackageGeneratorAdapter = new ModelTypeGenPackageGeneratorAdapter(this)

		return overridedGenPackageGeneratorAdapter
	}

	override createGenClassAdapter() {
		if (overridedGenClassGeneratorAdapter === null)
			overridedGenClassGeneratorAdapter = new ModelTypeGenClassGeneratorAdapter(this)

		return overridedGenClassGeneratorAdapter
	}
}
