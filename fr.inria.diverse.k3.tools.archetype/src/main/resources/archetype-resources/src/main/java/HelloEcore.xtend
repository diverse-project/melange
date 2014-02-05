package ${package}

import fr.inria.triskell.k3.Aspect
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EcoreFactory
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl

import static extension ${package}.EPackageAspect.*

class HelloEcore{

	public def run() {
		//Load Ecore Model
		var fact = new EcoreResourceFactoryImpl
		if (!EPackage.Registry.INSTANCE.containsKey(EcorePackage.eNS_URI)) {
			EPackage.Registry.INSTANCE.put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE);
		}
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", fact);
		var rs = new ResourceSetImpl()
		var uri = URI.createURI("fsm.ecore");
		var res = rs.getResource(uri, true);

		var EPackage p = res.contents.get(0) as EPackage
		//properties are shared between instances
		p.start		

		p = EcoreFactory.eINSTANCE.createEPackage
		p.start		
		p.sayHello("k3")

	}

	def static void main(String[] args) {
		println('Hello Kermeta on top of Xtend!')
		new HelloEcore().run()
	}
	

}



@Aspect(className=typeof(EPackage))
class EPackageAspect {
	
	//i has a value persistance is static
	static int i = 0;
	
	//j is local
	int j;

	public def void start() {
		_self.i= _self.i + 1
		println(_self.i)
		_self.j = _self.j + 1;
		println(_self.j)
		
	}

	public def void sayHello(String say) {
		println(say)		
	}

}

