package ^dispatch.melange.l2

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import dispatchroot.A
import ^dispatch.melange.l1.AAspect

@Aspect(className=A)
class L2_AAspect extends AAspect{
	override void foo(){
		println("L2 - A.foo()")
	}
}
