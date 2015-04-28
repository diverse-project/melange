package fr.inria.diverse.melange.lib

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl

class MetamodelExtensions
{
	def static <MM extends IMetamodel> MM load(Class<MM> mmCls, String uri) throws InstantiationException, IllegalAccessException {
            val mm = mmCls.newInstance
            val rs = new ResourceSetImpl
            val res = rs.getResource(URI.createURI(uri), true)

            mm.resource = res

            return mm
    }
}
