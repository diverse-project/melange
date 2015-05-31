package fr.inria.diverse.examples.citizenwatch

import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.emf.ecore.EPackage
import CompleteFSM.CompleteFSMPackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.common.util.URI
import CompleteFSM.StateMachine 

import static extension CompleteFSM.StateMachineAspect.* 
  
class Watch { 
	 
	public def run(String modelPath) {
		var fact = new XMIResourceFactoryImpl
		if (!EPackage.Registry.INSTANCE.containsKey(CompleteFSMPackage.eNS_URI)) {
			EPackage.Registry.INSTANCE.put(CompleteFSMPackage.eNS_URI, CompleteFSMPackage.eINSTANCE);
		}
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", fact);

		var rs = new ResourceSetImpl()
 
		//var uri = URI.createURI(args.get(0));
		var uri = URI.createURI(modelPath);
		var res = rs.getResource(uri, true);
		var StateMachine watch = res.contents.get(0) as StateMachine
		 
		watch.evalStateMachine() 
	}  

	def static void main(String[] args) {
		println('Citizen watch simulator in K3!')
		new Watch().run("ToolDemo-StateMachine-2.xmi")
	}
}