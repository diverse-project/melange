package fr.inria.diverse.melange.adapters

import org.eclipse.emf.ecore.EObject

/**
 * Generic interface for the creation of adapters for a given {@link EObject}
 * type.
 */
interface AdaptersFactory
{
	def GenericAdapter<EObject> createAdapter(EObject o)
}
