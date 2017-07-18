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
