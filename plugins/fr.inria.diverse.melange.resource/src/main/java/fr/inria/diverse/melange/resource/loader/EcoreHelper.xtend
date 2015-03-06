package fr.inria.diverse.melange.resource.loader

import org.eclipse.emf.ecore.EClassifier

class EcoreHelper
{
	// FIXME: How ugly is that!
	static def Class<?> getImplementationClass(EClassifier cls) {
		val clsInterface = cls.instanceClass
		try {
			val className = '''«clsInterface.package.name».impl.«clsInterface.simpleName»Impl'''
			val c = clsInterface.classLoader.loadClass(className)
			return c
//			return Class.forName('''«clsInterface.package.name».impl.«clsInterface.simpleName»Impl''')
		} catch (Exception e) {
			// ...
		}

		return null
	}
}
