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
package fr.inria.diverse.melange.formatting

import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter
import org.eclipse.xtext.formatting.impl.FormattingConfig

//import com.google.inject.Inject
//import fr.inria.diverse.melange.services.MelangeGrammarAccess

class MelangeFormatter extends AbstractDeclarativeFormatter
{
	//@Inject extension MelangeGrammarAccess

	override protected void configureFormatting(FormattingConfig c) {
	// It's usually a good idea to activate the following three statements.
	// They will add and preserve newlines around comments
	//		c.setLinewrap(0, 1, 2).before(SL_COMMENTRule)
	//		c.setLinewrap(0, 1, 2).before(ML_COMMENTRule)
	//		c.setLinewrap(0, 1, 1).after(ML_COMMENTRule)
	}
}
