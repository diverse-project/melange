package fr.inria.diverse.k3.sle.tests.common

import fr.inria.diverse.k3.sle.metamodel.k3sle.ModelTypingSpace
import fr.inria.diverse.k3.sle.metamodel.k3sle.Metamodel
import fr.inria.diverse.k3.sle.metamodel.k3sle.ModelType
import fr.inria.diverse.k3.sle.metamodel.k3sle.Transformation

import org.eclipse.xtext.xbase.compiler.CompilationTestHelper$Result

class K3SLETestHelper
{
	def mm(ModelTypingSpace root, String mmName) {
		root.elements.filter(Metamodel).findFirst[name == mmName]
	}

	def mt(ModelTypingSpace root, String mtName) {
		root.elements.filter(ModelType).findFirst[name == mtName]
	}

	def t(ModelTypingSpace root, String tName) {
		root.elements.filter(Transformation).findFirst[name == tName]
	}

	def initialize(Result res, String cls) {
		val String[] p = null
		res.getCompiledClass(cls)?.getMethod("main", typeof(String[]))?.invoke(null, p as Object)
	}

	def invokeTransfo(Result res, String cls, Object... params) {
		res.getCompiledClass(cls)?.getMethod("call", params.map[it.class])?.invoke(null, params)
	}
}
