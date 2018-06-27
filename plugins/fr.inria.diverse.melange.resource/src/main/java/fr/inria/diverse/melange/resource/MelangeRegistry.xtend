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
		def String getXmofURI()
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
