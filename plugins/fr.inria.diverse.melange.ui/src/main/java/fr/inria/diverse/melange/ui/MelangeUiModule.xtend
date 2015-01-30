package fr.inria.diverse.melange.ui

import org.eclipse.core.runtime.IStatus
import org.eclipse.core.runtime.Status
import org.eclipse.ui.plugin.AbstractUIPlugin

import fr.inria.diverse.melange.ui.internal.MelangeActivator

class MelangeUiModule extends AbstractMelangeUiModule
{
	new(AbstractUIPlugin plugin) {
		super(plugin)
	}

	def Class<? extends org.eclipse.xtext.ui.editor.preferences.LanguageRootPreferencePage> bindLanguageRootPreferencePage() {
	    return typeof(fr.inria.diverse.melange.ui.preferences.MelangePreferencePage)
	}

	def static void logErrorMessage(String message, Throwable e) {
		MelangeActivator.instance.log.log(
			new Status(
				IStatus::ERROR,
				MelangeActivator.instance.bundle.symbolicName,
				IStatus::ERROR, message,
				e
			)
		)
	}
}
