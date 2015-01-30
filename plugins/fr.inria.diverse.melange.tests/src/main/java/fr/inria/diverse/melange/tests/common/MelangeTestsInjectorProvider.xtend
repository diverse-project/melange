package fr.inria.diverse.melange.tests.common

import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.xtext.xbase.compiler.OnTheFlyJavaCompiler
import org.eclipse.xtext.xbase.compiler.OnTheFlyJavaCompiler.EclipseRuntimeDependentJavaCompiler

import com.google.inject.Guice

import fr.inria.diverse.melange.MelangeInjectorProvider
import fr.inria.diverse.melange.MelangeRuntimeModule
import fr.inria.diverse.melange.MelangeStandaloneSetup

class MelangeTestsInjectorProvider extends MelangeInjectorProvider
{
	override internalCreateInjector() {
		return new MelangeStandaloneSetup() {
			override createInjector() {
				return Guice.createInjector(new MelangeRuntimeModule() {
					override bindClassLoaderToInstance() {
						return typeof(MelangeTestsInjectorProvider).classLoader
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
