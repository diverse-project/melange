package fr.inria.diverse.melange.tests.attributes.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.melange.annotation.Containment
import fr.inria.diverse.melange.annotation.Opposite
import fr.inria.diverse.melange.annotation.Unique

import rootpkg.A
import rootpkg.B
import other.rootpkg2.Token
import org.eclipse.emf.common.util.EList

@Aspect(className=A)
class AAspect {
	@Unique
	public val EList<A> toA = null
	
	@Opposite(value="toA")
	public B toB = null
}

@Aspect(className=B)
class BAspect {
	@Opposite(value="toB")
	@Containment
	public EList<A> toA
	
	public EList<B> toB = null
}

@Aspect(className=Token)
class TokenAspect {
	public String myName
}


