package fr.inria.diverse.melange.ui.preferences

import com.google.inject.Inject
import org.eclipse.xtext.ui.editor.preferences.IPreferenceStoreAccess

class MelangePreferences
{
	/* --- Constants --- */
	public static final String EMF_COMPLIANT_INTERFACES = "emfCompliantInterfaces"
	public static final String GENERATE_EMF_ARTIFACTS = "generateEmfArtifacts"

	@Inject
	IPreferenceStoreAccess store

	def boolean isEmfCompliantInterfaces() {
		return store.preferenceStore.getBoolean(EMF_COMPLIANT_INTERFACES)
	}

	def boolean isGenerateEmfArtifacts() {
		return store.preferenceStore.getBoolean(GENERATE_EMF_ARTIFACTS)
	}

	def void setEmfCompliantInterfaces(boolean value) {
		store.writablePreferenceStore.setValue(EMF_COMPLIANT_INTERFACES, value)
	}

	def void setGenerateEmfArtifacts(boolean value) {
		store.writablePreferenceStore.setValue(GENERATE_EMF_ARTIFACTS, value)
	}
}
