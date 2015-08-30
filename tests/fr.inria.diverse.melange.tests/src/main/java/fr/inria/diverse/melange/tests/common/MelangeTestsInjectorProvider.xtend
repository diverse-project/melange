package fr.inria.diverse.melange.tests.common

import com.google.inject.Guice
import fr.inria.diverse.melange.MelangeInjectorProvider
import fr.inria.diverse.melange.MelangeRuntimeModule
import fr.inria.diverse.melange.MelangeStandaloneSetup
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.xtext.xbase.compiler.IGeneratorConfigProvider
import org.eclipse.xtext.xbase.compiler.OnTheFlyJavaCompiler
import org.eclipse.xtext.xbase.compiler.OnTheFlyJavaCompiler.EclipseRuntimeDependentJavaCompiler

class MelangeTestsInjectorProvider extends MelangeInjectorProvider
{
	override internalCreateInjector() {
		return new MelangeStandaloneSetup() {
			override createInjector() {
				return Guice.createInjector(new MelangeRuntimeModule() {
					override bindClassLoaderToInstance() {
						return typeof(MelangeTestsInjectorProvider).classLoader
					}

					def Class<? extends IGeneratorConfigProvider> bindIGeneratorConfigProvider() {
						return typeof(MelangeTestsGeneratorConfigProvider)
					}

					def bindOnTheFlyJavaCompiler() {
						try {
							if (ResourcesPlugin.workspace !== null) {
								return typeof(EclipseRuntimeDependentJavaCompiler)
							}
						} catch (Exception e) {
							// ignore
						}
						return typeof(OnTheFlyJavaCompiler)
					}
				})
			}
		}.createInjectorAndDoEMFRegistration
	}
}
