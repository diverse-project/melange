package fr.inria.diverse.melange.tests.common

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.xbase.compiler.GeneratorConfigProvider
import org.eclipse.xtext.xbase.compiler.JavaVersion

/**
 * Ensures that Java code generated from the tests
 * complies to Java 8
 */
class MelangeTestsGeneratorConfigProvider extends GeneratorConfigProvider
{
	override get(EObject obj) {
		return super.get(obj) => [
			javaSourceVersion = JavaVersion::JAVA8
		]
	}
}
