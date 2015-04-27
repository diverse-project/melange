package fr.inria.diverse.melange.ui.preferences

import fr.inria.diverse.melange.ui.internal.MelangeActivator
import fr.inria.diverse.melange.preferences.MelangePreferencesConstants
import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer

class MelangePreferencesInitializer extends AbstractPreferenceInitializer
{
	new() {
		super()
	}

	override initializeDefaultPreferences() {
		val store = MelangeActivator.instance.preferenceStore
		store.setDefault(MelangePreferencesConstants.EMF_COMPLIANT_INTERFACES, true)
		store.setDefault(MelangePreferencesConstants.GENERATE_EMF_ARTIFACTS, true)
	}
}
