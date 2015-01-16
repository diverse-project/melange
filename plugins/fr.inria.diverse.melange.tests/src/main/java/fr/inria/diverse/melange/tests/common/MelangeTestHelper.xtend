package fr.inria.diverse.melange.tests.common

import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace
import fr.inria.diverse.melange.metamodel.melange.Metamodel
import fr.inria.diverse.melange.metamodel.melange.ModelType
import fr.inria.diverse.melange.metamodel.melange.Transformation

import org.eclipse.xtext.xbase.compiler.CompilationTestHelper$Result

import java.util.List

class MelangeTestHelper
{
	def Metamodel mm(ModelTypingSpace root, String mmName) {
		return root.elements.filter(Metamodel).findFirst[name == mmName]
	}

	def ModelType mt(ModelTypingSpace root, String mtName) {
		return root.elements.filter(ModelType).findFirst[name == mtName]
	}

	def Transformation t(ModelTypingSpace root, String tName) {
		return root.elements.filter(Transformation).findFirst[name == tName]
	}

	def void initialize(Result res, String cls) {
		val String[] p = null

		try {
			res.getCompiledClass(cls)?.getMethod("main", typeof(String[]))?.invoke(null, p as Object)
		} catch (Exception e) {
			// ...
		}
	}

	def <T> T invokeTransfo(Result res, String cls) {
		try {
			return res.getCompiledClass(cls)?.getMethod("call", null)?.invoke(null, null) as T
		} catch (Exception e) {
			// ...
		}
	}

	def <T> T invokeTransfo(Result res, String cls, List<String> pTypes, List<Object> pValues) {
		try {
			return res.getCompiledClass(cls)?.getMethod("call", pTypes.map[res.getCompiledClass(it)])?.invoke(null, pValues?.toArray) as T
		} catch (Exception e) {
			// ...
		}
	}
}
