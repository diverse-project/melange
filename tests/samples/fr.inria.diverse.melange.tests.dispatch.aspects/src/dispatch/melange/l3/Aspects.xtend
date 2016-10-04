package ^dispatch.melange.l3

import dispatchroot.A
import dispatchroot.B
import dispatchroot.C
import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import ^dispatch.melange.l1.BAspect
import ^dispatch.melange.l1.CAspect

import static extension ^dispatch.melange.l1.AAspect.*
import static extension ^dispatch.melange.l3.L3_A2Aspect.*

@Aspect(className=A)
class L3_A2Aspect {
	def void bar(){
		println("L3 - A2.bar()")
	}
}

@Aspect(className=B)
class L3_BAspect extends BAspect{
	override void foo(){
		println("L3 - B.foo()")
	}
}

@Aspect(className=C)
class L3_CAspect extends CAspect{
	override void bar(A a){
		print("L3 - C.bar() calling : ")
		a.foo()
		a.bar()
	}
}