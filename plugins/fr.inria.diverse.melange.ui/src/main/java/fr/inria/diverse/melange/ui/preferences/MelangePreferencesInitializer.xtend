package fr.inria.diverse.melange.ui.preferences

import fr.inria.diverse.melange.ui.internal.MelangeActivator
import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer

class MelangePreferencesInitializer extends AbstractPreferenceInitializer
{
	new() {
		super()
	}

	override initializeDefaultPreferences() {
		val store = MelangeActivator.instance.preferenceStore
		store.setDefault(MelangePreferences.EMF_COMPLIANT_INTERFACES, true)
		store.setDefault(MelangePreferences.GENERATE_EMF_ARTIFACTS, true)
	}
}
