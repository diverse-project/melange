package fr.inria.diverse.melange.builder

import com.google.inject.Inject
import com.google.inject.Injector
import fr.inria.diverse.melange.metamodel.melange.Language
import java.util.Map
import com.google.inject.Singleton
import fr.inria.diverse.melange.experimental.CustomBuilder
import java.util.List

@Singleton
class ModelTypingSpaceBuilder {
	@Inject Injector injector
	Map<Language, LanguageBuilder> registry = newHashMap
	List<String> operatorRegistry = newArrayList
	
	new(){
		operatorRegistry.add("slice2") //TODO:replace me by Eclipse's extension point
	}

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
	def findBuilder(Language l){
		return registry.get(l)
	}
	
	def List<String> getOperatorRegistry(){
		return operatorRegistry
	}
}
