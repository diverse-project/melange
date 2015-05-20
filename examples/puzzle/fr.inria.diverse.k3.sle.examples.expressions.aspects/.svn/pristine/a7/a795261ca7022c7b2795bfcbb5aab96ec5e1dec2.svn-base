package Expressions

import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.common.util.URI
import java.util.Hashtable

import static extension Expressions.ExpressionAspect.*

class ExpressionsInterpreter implements IExpressionsInterprete{
	
	override eval(String modelPath){
		var fact = new XMIResourceFactoryImpl
		if (!EPackage.Registry.INSTANCE.containsKey(ExpressionsPackage.eNS_URI)) {
			EPackage.Registry.INSTANCE.put(ExpressionsPackage.eNS_URI, ExpressionsPackage.eINSTANCE);
		}
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", fact);
		
		var rs = new ResourceSetImpl()

		var uri = URI.createFileURI(modelPath);
		var res = rs.getResource(uri, true);
		var Expression _expression = res.contents.get(0) as Expression
		var Hashtable<String, Object> context = new Hashtable<String, Object>()
		
		_expression.eval(context)
		
		for(Object _key : context.keySet){
			println("Key: " + _key + " - Object: " + context.get(_key))
		}
	}
}