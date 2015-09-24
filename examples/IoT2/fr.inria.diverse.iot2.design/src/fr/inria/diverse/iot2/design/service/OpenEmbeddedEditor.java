package fr.inria.diverse.iot2.design.service;

import fr.inria.diverse.iot2.ui.internal.IoT2Activator;
import org.obeonetwork.dsl.viewpoint.xtext.support.action.OpenXtextEmbeddedEditor;

import com.google.inject.Injector;

public class OpenEmbeddedEditor extends OpenXtextEmbeddedEditor {

	@Override
	protected Injector getInjector() {
		 return  IoT2Activator.getInstance().getInjector("fr.inria.diverse.iot2.IoT2");
	}

}
