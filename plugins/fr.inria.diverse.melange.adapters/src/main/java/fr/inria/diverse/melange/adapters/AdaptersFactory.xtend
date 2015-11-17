package fr.inria.diverse.melange.adapters

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource

/**
 * Generic interface for the creation of adapters for a given {@link EObject}
 * type.
 */
interface AdaptersFactory
{
	def EObjectAdapter<EObject> createAdapter(EObject o, Resource res)
}
