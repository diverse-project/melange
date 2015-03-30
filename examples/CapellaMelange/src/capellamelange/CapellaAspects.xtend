package capellamelange

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import org.polarsys.capella.core.data.capellamodeller.Project

@Aspect(className = Project)
class ProjectAspect {
	def void foo() {
		println("ActivityAspect::foo()")
	}
}
