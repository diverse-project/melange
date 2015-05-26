package fr.inria.diverse.puzzle

import org.eclipse.ui.plugin.AbstractUIPlugin
import org.osgi.framework.BundleContext
import org.eclipse.jface.resource.ImageDescriptor

class ComposeActivator extends AbstractUIPlugin{
	
	// The plug-in ID
	public static final String PLUGIN_ID = "fr.inria.diverse.sle.puzzle.ui"; //$NON-NLS-1$

	// The shared instance
	private static ComposeActivator plugin;
	
	new(){
		
	}
	
	override void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}
	
	override void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}
	
	def static ComposeActivator getDefault() {
		return plugin;
	}
	
	def static ImageDescriptor getImageDescriptor(String path) {
		return imageDescriptorFromPlugin(PLUGIN_ID, path);
	}
	
}