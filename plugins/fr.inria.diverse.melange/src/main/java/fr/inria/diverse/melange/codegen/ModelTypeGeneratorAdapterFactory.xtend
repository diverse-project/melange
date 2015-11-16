package fr.inria.diverse.melange.codegen

import org.eclipse.emf.codegen.ecore.genmodel.generator.GenBaseGeneratorAdapter
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenModelGeneratorAdapterFactory

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
