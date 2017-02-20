/*******************************************************************************
 * Copyright (c) 2006, 2013 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     Code 9 Corporation - ongoing development
 *     Volker Wegert - bug 243087
 *******************************************************************************/
package fr.inria.diverse.melange.ui.templates;

import org.eclipse.osgi.util.NLS;

public class MelangeTemplateMessages extends NLS {
	private static final String BUNDLE_NAME = "fr.inria.diverse.melange.ui.templates.melangeresources"; //$NON-NLS-1$

	static {
		// load message values from bundle file
		NLS.initializeMessages(BUNDLE_NAME, MelangeTemplateMessages.class);
	}
		
	// FSMSample constants
	public static String FSMMelangeSampleNewWizard_wtitle;
	public static String FSMMelangeSampleTemplate_packageName;
	public static String FSMMelangeSampleTemplate_className;
	public static String FSMMelangeSampleTemplate_aspectClassName;
	public static String FSMMelangeSampleTemplate_title;
	public static String FSMMelangeSampleTemplate_desc;
	
	// UserEcoreBasicMelange constants
	public static String SimpleMTTemplate_packageName;
	public static String SimpleMTTemplate_packageNameToolTip;
	public static String SimpleMTTemplate_melangeFileName;
	public static String SimpleMTTemplate_melangeFileNameTooltip;
	public static String SimpleMTTemplate_melangeMetamodelName;
	public static String SimpleMTTemplate_melangeMetamodelNameToolTip;
	public static String SimpleMTTemplate_ecoreFileLocation;
	public static String SimpleMTTemplate_ecoreFileLocationTooltip;
	public static String SimpleMTTemplate_title;
	public static String SimpleMTTemplate_desc;
	public static String SimpleMTTemplate_wtitle;
	

}