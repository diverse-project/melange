package fr.inria.diverse.k3.sle.lib

import java.util.List

interface IModelType
{
	def List<Object> getContents()
}

interface IFactory
{}

class ModelTypeException extends Exception
{
	new(String msg) {
		super(msg)
	}
}
