package xtendsle

import com.google.inject.Guice

import fr.inria.diverse.k3.al.annotationprocessor.Aspect

import org.eclipse.xtend.core.XtendStandaloneSetup

import org.eclipse.xtend.core.xtend.XtendFile

import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.JavaIoFileSystemAccess

import org.eclipse.xtext.parser.IEncodingProvider

import org.eclipse.xtext.service.AbstractGenericModule

@Aspect(className = XtendFile)
class XtendCompilerAspect {
	static final String OUTPUT_PATH = "sle-gen"

	def void compile() {
		val injector = new XtendStandaloneSetup().createInjectorAndDoEMFRegistration
		val generator = injector.getInstance(typeof(IGenerator))
		val fsa = new JavaIoFileSystemAccess

		fsa.outputPath = _self.OUTPUT_PATH
		Guice.createInjector(new EncodingProviderModule).injectMembers(fsa)

		print("Compiling code...     ")
		generator.doGenerate(_self.eResource, fsa)
		println("Done.")
	}
}

class EncodingProviderModule extends AbstractGenericModule {
	def Class<? extends IEncodingProvider> bindIEncodingProvider() {
		return typeof(IEncodingProvider.Runtime)
	}
}
