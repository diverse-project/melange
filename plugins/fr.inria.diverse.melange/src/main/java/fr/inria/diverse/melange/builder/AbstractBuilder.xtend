package fr.inria.diverse.melange.builder

import java.util.List
import org.eclipse.emf.ecore.EPackage
import java.util.Set

/**
 * Default implementation of {@link Builder}. An {@link EPackage} {@code model}
 * is attached to the builder that correspond to what has been built.
 * <br>
 * Implementors must later implement the {@link Builder#make} method.
 */
abstract class AbstractBuilder implements Builder {
	/**
	 * A set of {@link EPackage} containing the chunk of syntax generated
	 * from this builder. Each {@link EPackage} is a root of the chunk.
	 */
	protected Set<EPackage> model = newHashSet
	/**
	 * {@link BuilderError} collected during the build.
	 */
	protected List<BuilderError> errors = newArrayList

	override preBuild() {
		model = newHashSet
		errors = newArrayList
	}

	override postBuild() {
	}

	def Set<EPackage> getModel() {
		return model
	}

	override getErrors() {
		return errors
	}

	def final void build() {
		preBuild()
		make()
		postBuild()
	}
}
