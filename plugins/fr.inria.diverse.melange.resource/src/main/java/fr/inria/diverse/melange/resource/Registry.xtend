package fr.inria.diverse.melange.resource

import fr.inria.diverse.melange.adapters.ResourceAdapter
import java.util.List
import java.util.Map
import org.eclipse.xtend.lib.annotations.Accessors

interface MelangeRegistry
{
	MelangeRegistry INSTANCE = MelangeRegistryImpl.getInstance()

	def Map<String, MelangeRegistry.LanguageDescriptor> getLanguageMap()
	def Map<String, MelangeRegistry.ModelTypeDescriptor> getModelTypeMap()

	def MelangeRegistry.LanguageDescriptor getLanguageByIdentifier(String identifier)
	def MelangeRegistry.LanguageDescriptor getLanguageByUri(String uri)
	def MelangeRegistry.ModelTypeDescriptor getModelTypeByIdentifier(String identifier)
	def MelangeRegistry.ModelTypeDescriptor getModelTypeByUri(String uri)

	interface LanguageDescriptor
	{
		def String getIdentifier()
		def String getDescription()
		def String getUri()
		def String getExactType()
		def Class<? extends ResourceAdapter> getAdapterFor(String mt)
		def void addAdapter(String mt, Class<? extends ResourceAdapter> adap)
	}

	interface ModelTypeDescriptor
	{
		def String getIdentifier()
		def String getDescription()
		def String getUri()
		def List<String> getSuperTypes()
		def void addSuperType(String mt)
	}
}

class MelangeRegistryImpl implements MelangeRegistry
{
	Map<String, MelangeRegistry.LanguageDescriptor> languageMap = newHashMap
	Map<String, MelangeRegistry.ModelTypeDescriptor> modelTypeMap = newHashMap

	private static MelangeRegistry INSTANCE = MelangeRegistryImpl.getInstance()

	synchronized static def MelangeRegistry getInstance() {
		if (INSTANCE === null)
			INSTANCE = new MelangeRegistryImpl

		return INSTANCE
	}

	private new() {
		
	}

	override getLanguageMap() {
		return languageMap
	}

	override getModelTypeMap() {
		return modelTypeMap
	}

	override getLanguageByIdentifier(String identifier) {
		return languageMap.get(identifier)
	}

	override getLanguageByUri(String uri) {
		return languageMap.values.findFirst[it.uri == uri]
	}

	override getModelTypeByIdentifier(String identifier) {
		return modelTypeMap.get(identifier)
	}

	override getModelTypeByUri(String uri) {
		return modelTypeMap.values.findFirst[it.uri == uri]
	}

	@Accessors
	static class LanguageDescriptorImpl implements MelangeRegistry.LanguageDescriptor {
		String identifier
		String description
		String uri
		String exactType
		Map<String, Class<? extends ResourceAdapter>> adapters = newHashMap

		new(String i, String d, String u, String e) {
			identifier = i
			description = d
			uri = u
			exactType = e
		}
		
		override getAdapterFor(String mt) {
			return adapters.get(mt)
		}

		override addAdapter(String mt, Class<? extends ResourceAdapter> adap) {
			adapters.put(mt, adap)
		}
	}

	@Accessors
	static class ModelTypeDescriptorImpl implements MelangeRegistry.ModelTypeDescriptor {
		String identifier
		String description
		String uri
		List<String> superTypes = newArrayList

		new(String i, String d, String u) {
			identifier = i
			description = d
			uri = u
		}

		override addSuperType(String mt) {
			superTypes += mt
		}
	}
}
