package fr.inria.diverse.melange.tests.common

import fr.inria.diverse.melange.metamodel.melange.Language
import fr.inria.diverse.melange.metamodel.melange.ModelType
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace
import fr.inria.diverse.melange.metamodel.melange.Transformation
import java.io.IOException
import java.util.List
import javax.inject.Inject
import org.eclipse.xtext.util.IAcceptor
import org.eclipse.xtext.xbase.compiler.CompilationTestHelper
import org.eclipse.xtext.xbase.compiler.CompilationTestHelper.Result
import org.junit.Assert

class MelangeTestHelper
{
	@Inject extension CompilationTestHelper

	def Language l(ModelTypingSpace root, String languageName) {
		return root.elements.filter(Language).findFirst[name == languageName]
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

	def void assertCompilesTo(CharSequence source, String filename, CharSequence expected) throws IOException {
		compile(source, new IAcceptor<CompilationTestHelper.Result>() {
			override void accept(Result r) {
				Assert.assertEquals(expected.toString, r.getGeneratedCode(filename))
			}
		})
	}

	def void assertGeneratedCodeContains(CharSequence source, String filename, CharSequence expected) throws IOException {
		compile(source, new IAcceptor<CompilationTestHelper.Result>() {
			override void accept(Result r) {
				Assert.assertTrue(r.getGeneratedCode(filename).contains(expected.toString))
			}
		})
	}
}
