package fr.inria.diverse.iot.xtext.resource

import fr.inria.diverse.iot.iotlang.iot.IotFactory
import fr.inria.diverse.iot.iotlang.iot.EPackage
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.resource.DerivedStateAwareResource
import org.eclipse.xtext.resource.IDerivedStateComputer

class IoTDerivedStateComputer implements IDerivedStateComputer
{
	override discardDerivedState(DerivedStateAwareResource resource) {
	}
	
	override installDerivedState(DerivedStateAwareResource resource, boolean preLinkingPhase) {
		val root = resource.contents.head as EPackage
		root.complete
	}

	def dispatch void complete(EPackage it) {
		val fact = IotFactory.eINSTANCE

		nsPrefix = name
		nsURI = '''http://«name»'''
		EFactoryInstance = fact.createEFactory
		println(name + " initialized")
	}

	def dispatch void complete(EObject o) {
		println("Completing " + o)
		// sh...
	}
}
