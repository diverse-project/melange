package fr.inria.diverse.melange.tests.attributes.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect

import rootpkg.A
import rootpkg.B
import other.rootpkg2.Token
import fr.inria.diverse.k3.al.annotationprocessor.Containment
import org.eclipse.emf.common.util.EList
import fr.inria.diverse.k3.al.annotationprocessor.Unique
import fr.inria.diverse.k3.al.annotationprocessor.Opposite

@Aspect(className=A)
class AAspect {
	@Unique
	public val EList<A> toA = null
	
	@Opposite(value="toA")
	public EList<B> toB = null
}

@Aspect(className=B)
class BAspect {
	@Opposite(value="toB")
	@Containment
	public EList<A> toA
}

@Aspect(className=Token)
class TokenAspect {
	public String myName
}


