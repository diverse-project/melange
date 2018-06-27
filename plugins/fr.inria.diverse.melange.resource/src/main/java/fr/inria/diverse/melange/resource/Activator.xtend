/*******************************************************************************
 * Copyright (c) 2017 Inria and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Inria - initial API and implementation
 *******************************************************************************/
package fr.inria.diverse.melange.resource

import fr.inria.diverse.melange.adapters.ResourceAdapter
import fr.inria.diverse.melange.resource.MelangeRegistry.LanguageDescriptor
import fr.inria.diverse.melange.resource.MelangeRegistry.ModelTypeDescriptor
import fr.inria.diverse.melange.resource.MelangeRegistryImpl.LanguageDescriptorImpl
import fr.inria.diverse.melange.resource.MelangeRegistryImpl.ModelTypeDescriptorImpl
import org.eclipse.core.runtime.Platform
import org.osgi.framework.BundleActivator
import org.osgi.framework.BundleContext

class Activator implements BundleActivator
{
	private static BundleContext context
	private static final String LANGUAGE_EXTENSION_ID = "fr.inria.diverse.melange.language"
	private static final String MODELTYPE_EXTENSION_ID = "fr.inria.diverse.melange.modeltype"

	def static BundleContext getContext() {
		return context
	}

	override void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext

		// Populate the model type registry with plugin contributions
		Platform.extensionRegistry.getConfigurationElementsFor(MODELTYPE_EXTENSION_ID).forEach[c |
			val newModelType = new ModelTypeDescriptorImpl(
				c.getAttribute("id"),
				c.getAttribute("description"),
				c.getAttribute("uri")
			) => [
				c.getChildren("subtyping").forEach[s |
					addSuperType(s.getAttribute("modeltypeId"))
				]
			]

			MelangeRegistry.INSTANCE.modelTypeMap.put(
				c.getAttribute("id"),
				newModelType as ModelTypeDescriptor // Xtend bug, explicit cast needed
			)
		]

		// Populate the language registry with plugin contributions
		Platform.extensionRegistry.getConfigurationElementsFor(LANGUAGE_EXTENSION_ID).forEach[c |
			val newLanguage = new LanguageDescriptorImpl(
				c.getAttribute("id"),
				c.getAttribute("description"),
				c.getAttribute("uri"),
				c.getAttribute("exactType"),
				c.getAttribute("xmofURI")
			) => [
				c.getChildren("adapter").forEach[a |
					addAdapter(
						a.getAttribute("modeltypeId"),
						a.createExecutableExtension("class").class as Class<? extends ResourceAdapter>
					)
				]
			]

			MelangeRegistry.INSTANCE.languageMap.put(
				c.getAttribute("id"),
				newLanguage as LanguageDescriptor // Xtend bug, need to explicitly cast
			)
		]
	}

	override void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null
	}
}
