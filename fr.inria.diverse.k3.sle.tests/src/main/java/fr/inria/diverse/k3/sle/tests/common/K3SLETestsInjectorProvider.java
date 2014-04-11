package fr.inria.diverse.k3.sle.tests.common;

import org.eclipse.core.resources.ResourcesPlugin;

import org.eclipse.xtext.xbase.compiler.OnTheFlyJavaCompiler;
import org.eclipse.xtext.xbase.compiler.OnTheFlyJavaCompiler.EclipseRuntimeDependentJavaCompiler;
import org.eclipse.xtext.xbase.junit.evaluation.AbstractXbaseEvaluationTest;
import org.eclipse.xtext.xbase.lib.Functions;

import com.google.inject.Guice;
import com.google.inject.Injector;

import fr.inria.diverse.k3.sle.K3SLEInjectorProvider;
import fr.inria.diverse.k3.sle.K3SLERuntimeModule;
import fr.inria.diverse.k3.sle.K3SLEStandaloneSetup;

public class K3SLETestsInjectorProvider extends K3SLEInjectorProvider
{
	public Injector internalCreateInjector() {
		return new K3SLEStandaloneSetup() {
			@Override
			public Injector createInjector() {
				return Guice.createInjector(new K3SLERuntimeModule() {
					@Override
					public ClassLoader bindClassLoaderToInstance() {
						return K3SLETestsInjectorProvider.class.getClassLoader();
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
