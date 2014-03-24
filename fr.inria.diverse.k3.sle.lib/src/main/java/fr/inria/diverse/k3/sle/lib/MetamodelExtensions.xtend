package fr.inria.diverse.k3.sle.lib

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl

import org.eclipse.emf.common.util.URI

import java.util.Map
import java.util.HashMap

class MetamodelExtensions
{
	// FIXME: re static-type me please
	def static <MT extends IModelType, MM/*extends MT*/> MT load(Class<MM> mm, String uri, Class<MT> mt) throws ModelTypeException {
		val resSet = new ResourceSetImpl
		val res = resSet.getResource(URI.createURI(uri), true)

		if (AdaptersRegistry.instance.getAdapter(mm.name, mt.name) === null)
			throw new ModelTypeException("Cannot find adapter for " + mm + " towards " + mt)

		val ret = AdaptersRegistry.instance.getAdapter(mm.name, mt.name).declaredConstructors.head.newInstance as GenericAdapter<Resource>
		ret.setAdaptee(res)

		return ret as MT
	}
}

class AdaptersRegistry {
	static AdaptersRegistry registry = new AdaptersRegistry
	Map<Pair<String, String>, Class<? extends GenericAdapter<Resource>>> adaptersRegistry = new HashMap<Pair<String, String>, Class<? extends GenericAdapter<Resource>>>

	static def getInstance() { registry }

	def registerAdapter(String mm, String mt, Class<? extends GenericAdapter<Resource>> adapter) {
		adaptersRegistry.put(mm -> mt, adapter)
	}

	def getAdapter(String mm, String mt) {
		adaptersRegistry.get(mm -> mt)
	}
}
