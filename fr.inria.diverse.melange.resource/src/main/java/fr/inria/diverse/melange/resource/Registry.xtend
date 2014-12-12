package fr.inria.diverse.melange.resource

import fr.inria.diverse.melange.lib.ResourceAdapter

import java.util.HashMap
import java.util.Map

interface ModelTypeAdapter
{
	interface Registry extends Map<Pair<String, String>, Class<? extends ResourceAdapter>> {
		// Make it global
		Registry INSTANCE = ModelTypeAdapterRegistryImpl.getInstance()
	}

	static class ModelTypeAdapterRegistryImpl extends HashMap<Pair<String, String>, Class<? extends ResourceAdapter>> implements ModelTypeAdapter.Registry {
		static ModelTypeAdapter.Registry instance

		def static ModelTypeAdapter.Registry getInstance() {
			if (instance === null)
				instance = new ModelTypeAdapterRegistryImpl

			return instance
		}
	}
}
