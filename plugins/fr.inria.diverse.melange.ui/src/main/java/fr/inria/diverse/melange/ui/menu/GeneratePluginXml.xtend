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
package fr.inria.diverse.melange.ui.menu

import org.eclipse.core.commands.AbstractHandler
import org.eclipse.core.commands.ExecutionEvent
import org.eclipse.core.commands.ExecutionException
import java.lang.reflect.InvocationTargetException
import org.apache.log4j.Logger
import fr.inria.diverse.melange.ui.builder.MelangeBuilder
import org.eclipse.ui.handlers.HandlerUtil
import org.eclipse.jface.dialogs.ProgressMonitorDialog
import org.eclipse.jface.operation.IRunnableWithProgress
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.core.resources.IResource
import com.google.inject.Inject
import org.eclipse.xtext.ui.resource.XtextResourceSetProvider
import org.eclipse.emf.common.util.URI
import org.eclipse.xtext.resource.DerivedStateAwareResource

class GeneratePluginXml extends AbstractHandler {
	@Inject MelangeBuilder builder
	@Inject XtextResourceSetProvider rsProvider
	private static final Logger log = Logger.getLogger(MelangeBuilder)
	
	override execute(ExecutionEvent event) throws ExecutionException {
		val shell = HandlerUtil.getActiveWorkbenchWindow(event).shell
		try {
			new ProgressMonitorDialog(shell).run(true, true, new IRunnableWithProgress() {
				override run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
					val sel = HandlerUtil.getCurrentSelection(event)
					val selection = sel as IStructuredSelection
					val resource = selection.firstElement as IResource
					val project = resource.project
					val rs = rsProvider.get(project)
					val res = rs.getResource(URI::createPlatformResourceURI(resource.fullPath.toString, true), true) as DerivedStateAwareResource
	
					builder.generatePluginXml(res, project, monitor)
				}
			})
		} catch (InvocationTargetException e) {
			log.error("Error while generating", e)
			throw e // forward  error in order to be able to test it
		} catch (InterruptedException e) {
			log.error("Generation was interrupted", e)
		}

		return null
	}
	
}