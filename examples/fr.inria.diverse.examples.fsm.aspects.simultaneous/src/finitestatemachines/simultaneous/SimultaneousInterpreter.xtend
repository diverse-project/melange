package finitestatemachines.simultaneous

import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.Resource
import finitestatemachines.FinitestatemachinesPackage
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.common.util.URI
import finitestatemachines.StateMachine

import FSM.interfaces.Interpreter

import static extension finitestatemachines.simultaneous.StateMachineAspect.*

class SimultaneousInterpreter implements Interpreter {
	
	override execute(String modelPath, String input){
		var String expression = input
		var finitestatemachines.simultaneous.Context context = new Context(expression)
		
		var fact = new XMIResourceFactoryImpl
		if (!EPackage.Registry.INSTANCE.containsKey(FinitestatemachinesPackage.eNS_URI)) {
			EPackage.Registry.INSTANCE.put(FinitestatemachinesPackage.eNS_URI, FinitestatemachinesPackage.eINSTANCE);
		}
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", fact);
		
		var rs = new ResourceSetImpl()

		var uri = URI.createFileURI(modelPath);
		var res = rs.getResource(uri, true);
		var StateMachine _stateMachine = res.contents.get(0) as StateMachine
		var String filePath = modelPath + "-results" + System.currentTimeMillis + ".pdf"
		
		_stateMachine.eval(context, filePath)
		
	}
	
}