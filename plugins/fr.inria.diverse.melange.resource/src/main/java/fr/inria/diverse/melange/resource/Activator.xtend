package fr.inria.diverse.melange.resource

import fr.inria.diverse.melange.adapters.ResourceAdapter
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.Platform
import org.osgi.framework.BundleActivator
import org.osgi.framework.BundleContext

class Activator implements BundleActivator
{
	private static BundleContext context
	private static final String LANGUAGE_EXTENSION_ID = "fr.inria.diverse.melange.language"

	def static BundleContext getContext() {
		return context
	}

	override void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext

		// Populate the language registry with plugin contributions
		Platform.extensionRegistry.getConfigurationElementsFor(LANGUAGE_EXTENSION_ID).forEach[c |
			val pkgUri = c.getAttribute("uri")

			c.getChildren("adapter").forEach[a |
				try {
					val mtId = a.getAttribute("modeltypeId")
					val adapter = a.createExecutableExtension("class").class as Class<? extends ResourceAdapter>

					ModelTypeAdapter.Registry.INSTANCE.registerAdapter(pkgUri, mtId, adapter)
				} catch (CoreException e) {
					// ...
					e.printStackTrace
				}	
			]
		]
	}

	override void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null
	}
}
