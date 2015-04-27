package fr.inria.diverse.melange.ui.preferences

import com.google.inject.Inject
import fr.inria.diverse.melange.preferences.MelangePreferencesConstants
import org.eclipse.xtext.ui.editor.preferences.IPreferenceStoreAccess

class MelangePreferences
{
	@Inject
	IPreferenceStoreAccess store

	def boolean isGenerateAdaptersCode() {
		return store.preferenceStore.getBoolean(MelangePreferencesConstants.GENERATE_ADAPTERS_CODE)
	}

	def void setGenerateAdaptersCode(boolean value) {
		store.writablePreferenceStore.setValue(MelangePreferencesConstants.GENERATE_ADAPTERS_CODE, value)
	}
}
