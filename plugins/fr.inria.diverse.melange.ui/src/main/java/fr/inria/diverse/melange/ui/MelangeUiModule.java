package fr.inria.diverse.melange.ui;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import fr.inria.diverse.melange.ui.internal.MelangeActivator;

public class MelangeUiModule extends fr.inria.diverse.melange.ui.AbstractMelangeUiModule
{
	public MelangeUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}

	public Class<? extends org.eclipse.xtext.ui.editor.preferences.LanguageRootPreferencePage> bindLanguageRootPreferencePage() {
	    return fr.inria.diverse.melange.ui.preferences.MelangePreferencePage.class;
	}
	
	public static void logErrorMessage(String message, Throwable e) {
		if (message == null)
			message= "";
		
		// eclipse logger
		MelangeActivator.getInstance().getLog().log(new Status(IStatus.ERROR, MelangeActivator.getInstance().getBundle().getSymbolicName(), IStatus.ERROR, message, e));		
	}
}
