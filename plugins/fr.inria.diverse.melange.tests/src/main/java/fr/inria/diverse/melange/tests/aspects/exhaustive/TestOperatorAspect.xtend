package fr.inria.diverse.melange.tests.aspects.exhaustive

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import exhaustive.OperationsTest
import exhaustive.AttributesTest
import exhaustive.ReferencesTest
import exhaustive.MultipleSuperTest
import exhaustive.InterfaceTest
import exhaustive.AbstractTest
import exhaustive.GenericTest

@Aspect(className = OperationsTest)
class SuperLangAspect {
	public AttributesTest addedReference
}

@Aspect(className = OperationsTest)
class LangAspect {
	public ReferencesTest addedReference
}

@Aspect(className = OperationsTest)
class SubLangAspect {
	public MultipleSuperTest addedReference
}

@Aspect(className = InterfaceTest)
class OtherAspect {
	public AbstractTest addedReference
}

@Aspect(className = InterfaceTest)
class SubOtherAspect {
	public GenericTest addedReference
}