package fr.inria.diverse.melange.builder

import com.google.inject.Inject
import com.google.inject.Injector
import fr.inria.diverse.melange.metamodel.melange.Language
import java.util.Map
import com.google.inject.Singleton
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace

/**
 * Wololo, wololo wololo.
 */
@Singleton
class ModelTypingSpaceBuilder {
	@Inject Injector injector
	Map<Language, LanguageBuilder> registry = newHashMap

	/**
	 * Creates and returns a builder to construct a model for {@code l}.
	 * Always returns the same builder for a given language.
	 */
	def LanguageBuilder getBuilder(Language l) {
		var res = registry.get(l)

		if (res === null) {
			res = new LanguageBuilder(l, this)
			injector.injectMembers(res)
			registry.put(l, res)
		}

		return res
	}

	def void resetFor(ModelTypingSpace root) {
		root.elements.filter(Language).forEach[registry.remove(it)]
	}

	/**
	 * Return the builder corresponding to {@code l}, or null if it cannot be
	 * retrieved.
	 */
	def LanguageBuilder findBuilder(Language l){
		return registry.get(l)
	}
}
