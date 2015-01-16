package xtendsle

import com.google.inject.Guice

import org.eclipse.xtend.core.XtendRuntimeModule
import org.eclipse.xtend.core.XtendStandaloneSetup

import org.eclipse.xtext.common.types.JvmOperation

import org.eclipse.xtext.generator.IGenerator

import org.eclipse.xtext.parser.IEncodingProvider

import org.eclipse.xtext.service.AbstractGenericModule

import org.eclipse.xtext.xbase.compiler.GeneratorConfig
import org.eclipse.xtext.xbase.compiler.JvmModelGenerator

import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable

class XtendDbcStandaloneSetup extends XtendStandaloneSetup
{
	override createInjector() {
		return Guice.createInjector(new XtendDbcRuntimeModule)
	}
}

class XtendDbcRuntimeModule extends XtendRuntimeModule {
	override Class<? extends IGenerator> bindIGenerator() {
		return typeof(XtendDbcGenerator)
	}
}

class XtendDbcGenerator extends JvmModelGenerator
{
	override dispatch generateMember(JvmOperation it, ITreeAppendable appendable, GeneratorConfig config) {
		appendable.newLine
		appendable.append("// Pre-check goes here")
		super.generateMember(it, appendable, config)
		appendable.append("// Post-check goes here")
		appendable.newLine
		appendable
	}
}

class EncodingProviderModule extends AbstractGenericModule {
	def Class<? extends IEncodingProvider> bindIEncodingProvider() {
		return typeof(IEncodingProvider.Runtime)
	}
}
