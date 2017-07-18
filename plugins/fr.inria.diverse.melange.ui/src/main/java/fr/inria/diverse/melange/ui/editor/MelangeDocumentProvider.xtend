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
package fr.inria.diverse.melange.ui.editor

import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.jface.text.IDocument
import org.eclipse.xtext.xbase.ui.editor.XbaseDocumentProvider
import fr.inria.diverse.melange.processors.ExtensionPointProcessor
import com.google.inject.Inject
import org.eclipse.xtext.ui.editor.model.XtextDocument
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace

class MelangeDocumentProvider extends XbaseDocumentProvider{
	
	@Inject ExtensionPointProcessor extensionProcessor
	
	override protected doSaveDocument(IProgressMonitor monitor, Object element, IDocument document, boolean overwrite) throws CoreException {
		super.doSaveDocument(monitor, element, document, overwrite)
		
		//Post save process
		try{
			val xtextDoc = document as XtextDocument
			xtextDoc.readOnly([res |
				val root = res.contents.head as ModelTypingSpace
				extensionProcessor.preProcess(root, false)
				return null
			])
		}
		catch(Exception e){
			println(e)
		}
	}
}