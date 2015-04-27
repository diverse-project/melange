package fr.inria.diverse.melange.ui.preferences

import com.google.inject.Inject
import fr.inria.diverse.melange.preferences.MelangePreferencesConstants
import org.eclipse.xtext.ui.editor.preferences.IPreferenceStoreAccess

class MelangePreferences
{
	@Inject
	IPreferenceStoreAccess store

	def boolean isEmfCompliantInterfaces() {
		return store.preferenceStore.getBoolean(MelangePreferencesConstants.EMF_COMPLIANT_INTERFACES)
	}

	def boolean isGenerateEmfArtifacts() {
		return store.preferenceStore.getBoolean(MelangePreferencesConstants.GENERATE_EMF_ARTIFACTS)
	}

	def void setEmfCompliantInterfaces(boolean value) {
		store.writablePreferenceStore.setValue(MelangePreferencesConstants.EMF_COMPLIANT_INTERFACES, value)
	}

	def void setGenerateEmfArtifacts(boolean value) {
		store.writablePreferenceStore.setValue(MelangePreferencesConstants.GENERATE_EMF_ARTIFACTS, value)
	}
}
