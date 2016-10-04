package ^dispatch.melange.l4

import ^extension.dispatchroot.SubB
import fr.inria.diverse.k3.al.annotationprocessor.Aspect

@Aspect(className=SubB)
class SubBAspect {
	def void foo(){
		println("L4 - SubB.foo()")
	}
}