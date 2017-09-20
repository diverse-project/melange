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
package fr.inria.diverse.melange.ui.wizards

class MelangeFilesTemplates
{
	def public static String getBuildProperties() {
		return '''
			source.. = src/,\
			           src-gen/
			bin.includes = plugin.xml,\
			               META-INF/,\
			               model-gen/,\
			               .
		'''
	}

	def public static String getK3SLEStub(String pkgName, String ecoreUri, String mmName) {
		return '''
			package «pkgName»

			language «mmName» {
				syntax «ecoreUri»
				exactType «mmName»MT
			}
			
		'''
	}

	def	public static String getEclipseResourcePrefs() {
		return '''
			eclipse.preferences.version=1
			encoding/<project>=UTF-8
		'''
	}
}
