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
		store.setDefault(MelangePreferencesConstants.GENERATE_ADAPTERS_CODE, true)
	}
}
