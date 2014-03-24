package fr.inria.diverse.k3.sle.lib

import java.util.List

interface IFactory
{}

interface IModelType
{
	def List<Object> getContents()
	def IFactory getFactory()
}

class ModelTypeException extends Exception
{
	new(String msg) {
		super(msg)
	}
}
