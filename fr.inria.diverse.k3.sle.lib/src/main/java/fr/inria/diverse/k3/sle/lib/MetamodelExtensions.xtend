package fr.inria.diverse.k3.sle.lib

import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.common.util.URI

class MetamodelExtensions
{
	def static <MT extends IModelType, MM extends MT> MT load(Class<MM> mm, String uri, Class<MT> mt) {
		val resSet = new ResourceSetImpl
		val res = resSet.getResource(URI.createURI(uri), true)

		return mm.declaredConstructors.head.newInstance(res) as MT
	}
}
