package fr.inria.diverse.melange.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;

public class MelangeUiModule extends fr.inria.diverse.melange.ui.AbstractMelangeUiModule
{
	public MelangeUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}

	public Class<? extends org.eclipse.xtext.ui.editor.preferences.LanguageRootPreferencePage> bindLanguageRootPreferencePage() {
	    return fr.inria.diverse.melange.ui.preferences.MelangePreferencePage.class;
	}
}
