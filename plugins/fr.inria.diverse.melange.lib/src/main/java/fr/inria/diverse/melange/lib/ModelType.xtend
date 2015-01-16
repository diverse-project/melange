package fr.inria.diverse.melange.lib

import java.io.IOException

import org.eclipse.emf.common.util.EList

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource

interface IFactory
{}

interface IMetamodel
{
	def Resource getResource()
	def void setResource(Resource res)
}

interface IModelType
{
	def EList<EObject> getContents()
	def IFactory getFactory()
	def void save(String uri) throws IOException
}

class ModelTypeException extends Exception
{
	new(String msg) {
		super(msg)
	}
}
