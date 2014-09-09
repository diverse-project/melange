package fr.inria.diverse.k3.sle.lib

import java.util.List

import java.io.IOException

interface IFactory
{}

interface IModelType
{
	def List<Object> getContents()
	def IFactory getFactory()
	def void save(String uri) throws IOException
}

class ModelTypeException extends Exception
{
	new(String msg) {
		super(msg)
	}
}
