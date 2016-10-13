package ^dispatch.melange.l4

import ^extension.dispatchroot.SubB
import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import ^dispatch.melange.l1.BAspect

@Aspect(className=SubB)
class SubBAspect extends BAspect{
	def void foo(){
		println("L4 - SubB.foo()")
	}
}