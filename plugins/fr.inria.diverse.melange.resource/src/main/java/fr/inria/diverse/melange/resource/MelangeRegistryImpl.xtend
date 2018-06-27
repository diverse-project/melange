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
import java.util.List
import java.util.Map
import org.eclipse.xtend.lib.annotations.Accessors

class MelangeRegistryImpl implements MelangeRegistry {
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
		String xmofURI
		Map<String, Class<? extends ResourceAdapter>> adapters = newHashMap

		new(String i, String d, String u, String e, String x) {
			identifier = i
			description = d
			uri = u
			exactType = e
			xmofURI = x
		}

		override getAdapterFor(String mt) {
			return adapters.get(mt)
		}

		override addAdapter(String mt, Class<? extends ResourceAdapter> adap) {
			adapters.put(mt, adap)
		}

		override getXmofURI() {
			return xmofURI
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
