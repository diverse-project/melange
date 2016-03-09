package fr.inria.diverse.melange.builder

import com.google.inject.Inject
import com.google.inject.Injector
import fr.inria.diverse.melange.metamodel.melange.Language
import java.util.Map
import com.google.inject.Singleton

@Singleton
class ModelTypingSpaceBuilder {
	@Inject Injector injector
	Map<Language, LanguageBuilder> registry = newHashMap

	/**
	 * Get a builder to construct a model for {@link l}.
	 * Return always the same builder for a same Language.
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
	
	def void reset(){
		registry = newHashMap
	}
	
	/**
	 * Return the builder corresponding to {@link l}.
	 * Return null if not found.
	 */
	def LanguageBuilder findBuilder(Language l){
		return registry.get(l)
	}
}
