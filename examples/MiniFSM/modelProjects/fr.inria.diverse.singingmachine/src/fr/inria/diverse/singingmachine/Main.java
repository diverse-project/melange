package fr.inria.diverse.singingmachine;

import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

import fr.inria.diverse.MiniFSMStandaloneSetup;
import fr.inria.diverse.melange.resource.MelangeResourceImpl;
import fr.inria.diverse.melanger.StandaloneSetup;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.FSM;

public class Main {
	public static void main(String[] args) {
		/*
		 * Melange registrations
		 */
		StandaloneSetup.doSetup();
		
		/*
		 * Get XtextResourceSet 
		 */
		new org.eclipse.emf.mwe.utils.StandaloneSetup().setPlatformUri("../"); //needed for platform:/resource in standalone mode 
		Injector injector = new MiniFSMStandaloneSetup().createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		
		MelangeResourceImpl r = (MelangeResourceImpl) resourceSet.getResource(URI.createURI("melange:/resource/fr.inria.diverse.singingmachine/model/99bottles.minifsm?mt=fr.inria.diverse.melanger.MelangedLangMT"),true);
		
		Map<URI, Resource> map = resourceSet.getURIResourceMap();
		/*
		 * Needed for _self.getInitialState(); 'cause FSM.initialState is an eProxy
		 * and the resolver don't know "platform:/resource/fr.inria.diverse.singingmachine/model/99bottles.minifsm|0"
		 */
		map.put(URI.createURI("platform:/resource/fr.inria.diverse.singingmachine/model/99bottles.minifsm"),r.getWrappedResource()); 
		
		/*
		 * Execution
		 */
		FSM root = (FSM) r.getContents().get(0);
		BasicEList<String> events = new BasicEList<String>();
		events.add("one event");
		root.execute(events);
	}
}
