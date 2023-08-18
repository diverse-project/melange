/*******************************************************************************
 * Copyright (c) 2017 Inria and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Inria - initial API and implementation
 *******************************************************************************/
package fr.inria.diverse.melange.preferences

import org.eclipse.core.runtime.Platform
import org.eclipse.core.runtime.preferences.IPreferencesService

/**
 * So ugly, but Xtext doesn't appear to
 * provide something cleaner
 */
class MelangePreferencesAccess {
	static final String PREFS_ID = "fr.inria.diverse.melange.ui"
	static MelangePreferencesAccess instance
	IPreferencesService preferencesService
	
	boolean isUserLaunch

	private new() {
		preferencesService = Platform.preferencesService
		isUserLaunch = false
	}

	synchronized static def MelangePreferencesAccess getInstance() {
		if (instance === null)
			instance = new MelangePreferencesAccess

		return instance
	}

	def boolean isGenerateAdaptersCode() {
		return
			if (preferencesService !== null)
				preferencesService.getBoolean(
					PREFS_ID,
					MelangePreferencesConstants.GENERATE_ADAPTERS_CODE,
					true,
					null)
			else true
	}
	
	
	/**
	 * Return true if the user request a full compilation.
	 * Should return false if the compilation process is automatically launched 
	 */
	def boolean isUserLaunch() {
		return isUserLaunch
	}

	def void enableCodeGenerator() {
		isUserLaunch = true
	}
	
	def void disableCodeGenerator() {
		isUserLaunch = false
	}
}
