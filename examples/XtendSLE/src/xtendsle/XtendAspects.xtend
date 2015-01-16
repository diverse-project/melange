package xtendsle

import com.google.inject.Guice

import fr.inria.diverse.k3.al.annotationprocessor.Aspect

import org.eclipse.xtend.core.XtendStandaloneSetup

import org.eclipse.xtend.core.xtend.XtendFile

import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.JavaIoFileSystemAccess

@Aspect(className = XtendFile)
class XtendCompilerAspect {
	static final String OUTPUT_PATH = "sle-gen/xtend"

	def void compile() {
		val injector = new XtendStandaloneSetup().createInjectorAndDoEMFRegistration
		val generator = injector.getInstance(typeof(IGenerator))
		val fsa = new JavaIoFileSystemAccess

		fsa.outputPath = _self.OUTPUT_PATH
		Guice.createInjector(new EncodingProviderModule).injectMembers(fsa)

		generator.doGenerate(_self.eResource, fsa)
	}
}

@Aspect(className = XtendFile)
class XtendDbcCompilerAspect {
	static final String OUTPUT_PATH = "sle-gen/xtend-dbc"

	def void compile() {
		val injector = new XtendDbcStandaloneSetup().createInjectorAndDoEMFRegistration
		val generator = injector.getInstance(typeof(IGenerator))
		val fsa = new JavaIoFileSystemAccess

		fsa.outputPath = _self.OUTPUT_PATH
		Guice.createInjector(new EncodingProviderModule).injectMembers(fsa)

		generator.doGenerate(_self.eResource, fsa)
	}
}
