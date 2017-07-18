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
package fr.inria.diverse.melange.typesystem

import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.Multimap

import fr.inria.diverse.melange.metamodel.melange.ModelType

import java.util.Collection

import com.google.inject.Singleton

/**
 * Stores the implementation relations between {@link Language}s and
 * {@link ModelType}s and the subtyping relations between {@link ModelType}s
 * to be used in the specialized Xbase type system and compiler.
 * 
 * @see MelangeSynonymTypesProvider
 */
@Singleton
class MelangeTypesRegistry
{
	/**
	 * <MM, MT> <=> MM implements MT
	 */
	Multimap<String, ModelType> implementationRelations = ArrayListMultimap.create

	/**
	 * <MT, MT'> <=> MT subtypeOf MT'
	 */
	Multimap<String, ModelType> subtypingRelations = ArrayListMultimap.create

	def void registerImplementation(String mm, ModelType mt) {
		if (!implementationRelations.containsEntry(mm, mt))
			implementationRelations.put(mm, mt)
	}

	def void registerSubtyping(String subType, ModelType superType) {
		if (!subtypingRelations.containsEntry(subType, superType))
			subtypingRelations.put(subType, superType)
	}

	def Collection<ModelType> getImplementations(String mmFqn) {
		return implementationRelations.get(mmFqn)
	}

	def Collection<ModelType> getSubtypings(String mtFqn) {
		return subtypingRelations.get(mtFqn)
	}

	def void clear() {
		implementationRelations.clear
		subtypingRelations.clear
	}
}
