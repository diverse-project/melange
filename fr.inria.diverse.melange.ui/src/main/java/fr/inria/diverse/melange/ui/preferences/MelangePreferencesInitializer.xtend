package fr.inria.diverse.melange.ui.preferences

import com.google.inject.Inject
import org.eclipse.xtext.ui.editor.preferences.IPreferenceStoreAccess
import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer

class MelangePreferencesInitializer extends AbstractPreferenceInitializer
{
	@Inject IPreferenceStoreAccess access

	override initializeDefaultPreferences() {
		
	}
}
