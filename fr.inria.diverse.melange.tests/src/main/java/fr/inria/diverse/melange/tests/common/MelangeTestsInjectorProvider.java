package fr.inria.diverse.melange.tests.common;

import org.eclipse.core.resources.ResourcesPlugin;

import org.eclipse.xtext.xbase.compiler.OnTheFlyJavaCompiler;
import org.eclipse.xtext.xbase.compiler.OnTheFlyJavaCompiler.EclipseRuntimeDependentJavaCompiler;
import org.eclipse.xtext.xbase.junit.evaluation.AbstractXbaseEvaluationTest;
import org.eclipse.xtext.xbase.lib.Functions;

import com.google.inject.Guice;
import com.google.inject.Injector;

import fr.inria.diverse.melange.MelangeInjectorProvider;
import fr.inria.diverse.melange.MelangeRuntimeModule;
import fr.inria.diverse.melange.MelangeStandaloneSetup;

public class MelangeTestsInjectorProvider extends MelangeInjectorProvider
{
	public Injector internalCreateInjector() {
		return new MelangeStandaloneSetup() {
			@Override
			public Injector createInjector() {
				return Guice.createInjector(new MelangeRuntimeModule() {
					@Override
					public ClassLoader bindClassLoaderToInstance() {
						return MelangeTestsInjectorProvider.class.getClassLoader();
					}

					public Class<? extends OnTheFlyJavaCompiler> bindOnTheFlyJavaCompiler() {
						try {
							if (ResourcesPlugin.getWorkspace() != null) {
								return EclipseRuntimeDependentJavaCompiler.class;
							}
						} catch (Exception e) {
							// ignore
						}
						return OnTheFlyJavaCompiler.class;
					}
				});
			}
		}.createInjectorAndDoEMFRegistration();
	}
}
