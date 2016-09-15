package ^dispatch.melange.l1

import dispatchroot.A
import dispatchroot.B
import dispatchroot.C
import fr.inria.diverse.k3.al.annotationprocessor.Aspect

import static extension ^dispatch.melange.l1.AAspect.*

@Aspect(className=A)
class AAspect {
	def void foo(){
		println("L1 - A.foo()")
	}
}

@Aspect(className=B)
class BAspect extends AAspect {
	
	def void foo(){
		println("L1 - B.foo()")
	}
}

@Aspect(className=C)
class CAspect {
	def void bar(A a){
		print("L1 - C.bar() calling : ")
		a.foo()
	}
}



