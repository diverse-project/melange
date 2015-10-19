package fr.inria.diverse.melange.slicing.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import root.SuperA
import root.A
import root.SubA
import root.B

@Aspect(className=SuperA)
class SuperAAspect{
	public String attrib1
}

@Aspect(className=A)
class AAspect{
	public String attrib2
}

@Aspect(className=SubA)
class SubAAspect{
	public String attrib3
}

@Aspect(className=B)
class BAspect{
	public String attrib4
}