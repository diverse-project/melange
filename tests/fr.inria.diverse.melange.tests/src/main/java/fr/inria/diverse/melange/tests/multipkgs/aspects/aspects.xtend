package fr.inria.diverse.melange.tests.multipkgs.aspects

import extended.toppkg.ClassA
import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import org.eclipse.emf.common.util.EList

@Aspect(className=ClassA)
class TopClassAAspect {
	
	public EList<extended.toppkg.subpkg2.subpkg3.ClassA> toSubClassA
	
	def void visit(){
		println(_self.eClass.name)
	}
}

@Aspect(className=extended.toppkg.subpkg2.subpkg3.ClassA)
class SubClassAAspect {
	
	public ClassA toUpperClassA
	
	def void visit(){
		println(_self.eClass.name)
	}
}