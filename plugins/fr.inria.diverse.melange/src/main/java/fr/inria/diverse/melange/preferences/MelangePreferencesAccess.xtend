package fr.inria.diverse.melange.preferences

import org.eclipse.core.runtime.Platform
import org.eclipse.core.runtime.preferences.IPreferencesService

/**
 * So ugly, but Xtext doesn't appear to
 * provide something cleaner
 */
class MelangePreferencesAccess {
	static private final String PREFS_ID = "fr.inria.diverse.melange.ui"
	static MelangePreferencesAccess instance
	IPreferencesService preferencesService

	private new() {
		preferencesService = Platform.preferencesService
	}

	synchronized static def MelangePreferencesAccess getInstance() {
		if (instance === null)
			instance = new MelangePreferencesAccess

		return instance
	}

	def boolean isGenerateAdaptersCode() {
		return preferencesService.getBoolean(PREFS_ID, MelangePreferencesConstants.GENERATE_ADAPTERS_CODE, true, null)
	}
}
