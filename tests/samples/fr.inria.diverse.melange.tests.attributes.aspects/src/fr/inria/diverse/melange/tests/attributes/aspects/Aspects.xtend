package fr.inria.diverse.melange.tests.attributes.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect

import org.eclipse.emf.common.util.UniqueEList
import org.eclipse.emf.common.util.BasicEList
import rootpkg.A
import rootpkg.B
import other.rootpkg2.Token
import fr.inria.diverse.k3.al.annotationprocessor.Containment

@Aspect(className=A)
class AAspect {
	public val BasicEList<A> toA = null
}

@Aspect(className=B)
class BAspect {
	@Containment
	public UniqueEList<A> toA = new UniqueEList<A>
}

@Aspect(className=Token)
class TokenAspect {
	public String myName
}

