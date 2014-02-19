package fr.inria.diverse.k3.sle.tests

import fr.inria.diverse.k3.sle.K3SLEInjectorProvider

import fr.inria.diverse.k3.sle.metamodel.k3sle.MegamodelRoot
import fr.inria.diverse.k3.sle.metamodel.k3sle.Transformation

import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper

import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.InMemoryFileSystemAccess

import org.eclipse.xtext.xbase.compiler.CompilationTestHelper

import java.lang.reflect.Modifier

import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

import com.google.inject.Inject

import static org.junit.Assert.*

@RunWith(XtextRunner)
@InjectWith(K3SLEInjectorProvider)
class TransformationTest
{
	@Inject extension ParseHelper<MegamodelRoot>
	@Inject extension ValidationTestHelper
	@Inject IGenerator generator
	@Inject CompilationTestHelper compiler
	CharSequence input
	MegamodelRoot root

	@Before
	def void setUp() {
		input = '''
		package foo

		import static extension fr.inria.diverse.k3.sle.lib.MetamodelExtensions.*

		transformation foo() {
			val x = 2
			bar.call("foo")
		}

		transformation bar(String s) {
			System.out.println(s)
		}

		transformation String baz() {
			return "baz"
		}

		@Main
		transformation main() {
			val x = "bar"

			foo.call
			bar.call(x)
			bar.call(baz.call)
		}

		transformation int add(int a, int b) {
			return a + b
		}
		'''

		root = input.parse

		compiler.setJavaCompilerClassPath(
			org.eclipse.emf.ecore.resource.Resource,
			org.eclipse.emf.common.notify.Notifier,
			org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
		)
	}

	@Test
	def testParsing() {
		root.assertNoErrors
	}

	@Test
	def testStructure() {
		(0..4).forEach[assertTrue(root.elements.get(it) instanceof Transformation)]
	}

	// Just to show how we can generate code
	@Test
	def testGeneration() {
		val fsa = new InMemoryFileSystemAccess
		generator.doGenerate(root.eResource, fsa)

		assertEquals(fsa.allFiles.size, 5)

		// Debug output
		fsa.allFiles.forEach[filename, content |
			println('''
				Generated «filename»:
				«content»
			''')
		]
	}

	@Test
	def testFooCompilation() {
		compiler.compile(input)[
			val foo = getCompiledClass("foo.foo")

			assertNotNull(foo)
			assertEquals(foo.declaredMethods.size, 2)

			val call = foo.declaredMethods.findFirst[name == "call"]
			assertNotNull(call)
			assertEquals(call.name, "call")
			assertEquals(call.returnType, Void::TYPE)
			assertEquals(call.parameterTypes.size, 0)
			assertTrue(Modifier.isStatic(call.modifiers))
			assertTrue(Modifier.isPublic(call.modifiers))

			val callw = foo.declaredMethods.findFirst[name == "call_wrapped"]
			assertNotNull(callw)
			assertEquals(callw.name, "call_wrapped")
			assertEquals(callw.returnType, Void::TYPE)
			assertEquals(callw.parameterTypes.size, 0)
			assertTrue(Modifier.isStatic(callw.modifiers))
			assertTrue(Modifier.isPublic(callw.modifiers))
		]
	}

	@Test
	def testBarCompilation() {
		compiler.compile(input)[
			val bar = getCompiledClass("foo.bar")

			assertNotNull(bar)
			assertEquals(bar.declaredMethods.size, 2)

			val call = bar.declaredMethods.findFirst[name == "call"]
			assertNotNull(call)
			assertEquals(call.name, "call")
			assertEquals(call.returnType, Void::TYPE)
			assertEquals(call.parameterTypes.size, 1)
			assertEquals(call.parameterTypes.head, typeof(String))
			assertTrue(Modifier.isStatic(call.modifiers))
			assertTrue(Modifier.isPublic(call.modifiers))

			val callw = bar.declaredMethods.findFirst[name == "call_wrapped"]
			assertNotNull(callw)
			assertEquals(callw.name, "call_wrapped")
			assertEquals(callw.returnType, Void::TYPE)
			assertEquals(callw.parameterTypes.size, 1)
			assertEquals(callw.parameterTypes.head, typeof(String))
			assertTrue(Modifier.isStatic(callw.modifiers))
			assertTrue(Modifier.isPublic(callw.modifiers))
		]
	}

	@Test
	def testBazCompilation() {
		compiler.compile(input)[
			val baz = getCompiledClass("foo.baz")

			assertNotNull(baz)
			assertEquals(baz.declaredMethods.size, 2)

			val call = baz.declaredMethods.findFirst[name == "call"]
			assertNotNull(call)
			assertEquals(call.name, "call")
			assertEquals(call.returnType, typeof(String))
			assertEquals(call.parameterTypes.size, 0)
			assertTrue(Modifier.isStatic(call.modifiers))
			assertTrue(Modifier.isPublic(call.modifiers))

			val callw = baz.declaredMethods.findFirst[name == "call_wrapped"]
			assertNotNull(callw)
			assertEquals(callw.name, "call_wrapped")
			assertEquals(callw.returnType, typeof(String))
			assertEquals(callw.parameterTypes.size, 0)
			assertTrue(Modifier.isStatic(callw.modifiers))
			assertTrue(Modifier.isPublic(callw.modifiers))
		]
	}

	@Test
	def testMainCompilation() {
		compiler.compile(input)[
			val mainC = getCompiledClass("foo.main")

			assertNotNull(mainC)
			assertEquals(mainC.declaredMethods.size, 2)

			val call = mainC.declaredMethods.findFirst[name == "call_wrapped"]
			assertNotNull(call)
			assertEquals(call.name, "call_wrapped")
			assertEquals(call.returnType, Void::TYPE)
			assertTrue(Modifier.isStatic(call.modifiers))
			assertTrue(Modifier.isPublic(call.modifiers))

			val main = mainC.declaredMethods.findFirst[name == "main"]
			assertNotNull(main)
			assertEquals(main.name, "main")
			assertEquals(main.returnType, Void::TYPE)
			assertEquals(main.parameterTypes.size, 1)
			assertEquals(main.parameterTypes.head, typeof(String[]))
			assertTrue(Modifier.isStatic(main.modifiers))
			assertTrue(Modifier.isPublic(main.modifiers))
		]
	}

	@Test
	def testAddCompilation() {
		compiler.compile(input)[
			val add = getCompiledClass("foo.add")

			assertNotNull(add)
			assertEquals(add.declaredMethods.size, 2)

			val call = add.declaredMethods.findFirst[name == "call"]
			assertNotNull(call)
			assertEquals(call.name, "call")
			assertEquals(call.returnType, typeof(int))
			assertEquals(call.parameterTypes.size, 2)
			assertTrue(call.parameterTypes.forall[it == typeof(int)])
			assertTrue(Modifier.isStatic(call.modifiers))
			assertTrue(Modifier.isPublic(call.modifiers))

			val callw = add.declaredMethods.findFirst[name == "call_wrapped"]
			assertNotNull(callw)
			assertEquals(callw.name, "call_wrapped")
			assertEquals(callw.returnType, typeof(int))
			assertEquals(callw.parameterTypes.size, 2)
			assertTrue(callw.parameterTypes.forall[it == typeof(int)])
			assertTrue(Modifier.isStatic(callw.modifiers))
			assertTrue(Modifier.isPublic(callw.modifiers))
		]
	}

	@Test
	def testFooRuntime() {
		compiler.compile(input)[
			val call = getCompiledClass("foo.foo").declaredMethods.head

			assertNull(call.invoke(null))
		]
	}

	@Test
	def testBarRuntime() {
		compiler.compile(input)[
			val call = getCompiledClass("foo.bar").declaredMethods.head

			assertNull(call.invoke(null, "bar"))
		]
	}

	@Test
	def testBazRuntime() {
		compiler.compile(input)[
			val call = getCompiledClass("foo.baz").declaredMethods.head

			assertEquals(call.invoke(null), "baz")
		]
	}

	@Test
	def testAddRuntime() {
		compiler.compile(input)[
			val call = getCompiledClass("foo.add").declaredMethods.head

			assertEquals(call.invoke(null, 27, 15), 42)
		]
	}
}
