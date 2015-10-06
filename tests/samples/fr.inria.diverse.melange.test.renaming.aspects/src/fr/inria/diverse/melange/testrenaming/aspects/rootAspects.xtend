package fr.inria.diverse.melange.testrenaming.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect

import static extension fr.inria.diverse.melange.testrenaming.aspects.ClassAAspect.*
import some.basepackage.root.ClassA
import some.basepackage.root.subpackage.ClassB
import some.basepackage.root.subpackage.SuperB

@Aspect(className=ClassA)
class ClassAAspect {
	public ClassB toB
}

@Aspect(className=ClassB)
class ClassBAspect extends SuperBAspect{
	public ClassA toA
}

@Aspect(className=SuperB)
class SuperBAspect {
	public String attrib
}




