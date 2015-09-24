package test

import fr.inria.diverse.iot2.IoT2StandaloneSetup
import fr.inria.diverse.iot2.iot2.iot2.IntegerVariable
import fr.inria.diverse.iot2.iot2.iot2.Iot2Package
import fr.inria.diverse.iot2.iot2.iot2.System
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl

import static extension fr.inria.diverse.iot2.iot2.aspects.ActivityAspect.*

class Test {
	def static void main(String[] args) {
//		EPackage.Registry.INSTANCE.put(Iot2Package.eNS_URI, Iot2Package.eINSTANCE)
//		Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("xmi", new XMIResourceFactoryImpl)
//
//		val rs = new ResourceSetImpl
//		val res = rs.getResource(URI::createURI("System.xmi"), true)
//		val system = res.contents.head as System
//
//		val sketch = system.sketch.activity
//
//		sketch.main(#[])
//		println("-- Done --")
		mainXtext
	}

	def static void mainXtext() {
		EPackage.Registry.INSTANCE.put(Iot2Package.eNS_URI, Iot2Package.eINSTANCE)
		Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("xmi", new XMIResourceFactoryImpl)
		IoT2StandaloneSetup::doSetup

		val rs = new ResourceSetImpl
		val res = rs.getResource(URI::createURI("Example.iot2"), true)
		val system = res.contents.head as System

		val sketch = system.sketch.activity

		sketch.main(#[])
	}
}