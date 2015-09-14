package subpackage.aspect

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import toppkg.subpkg1.Subpkg1Class1

@Aspect(className = Subpkg1Class1)
class Subpkg1Class1Aspect {
	public String changeableYes
}