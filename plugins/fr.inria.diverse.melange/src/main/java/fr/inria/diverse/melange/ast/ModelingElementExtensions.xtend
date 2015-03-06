package fr.inria.diverse.melange.ast

import com.google.inject.Inject
import fr.inria.diverse.melange.metamodel.melange.ModelingElement
import fr.inria.diverse.melange.utils.EPackageProvider
import java.io.IOException
import java.util.List
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl

class ModelingElementExtensions
{
	@Inject EPackageProvider registry

	def List<EPackage> getPkgs(ModelingElement m) {
		return registry.getPackages(m)
	}

	def void createEcore(ModelingElement m, String uri) {
		m.createEcore(uri, null)
	}

	def void createEcore(ModelingElement m, String uri, String pkgUri) {
		val resSet = new ResourceSetImpl
		val res = resSet.createResource(URI::createURI(uri))
		val rootPkg = m.pkgs.head

		if (pkgUri !== null)
			rootPkg.nsURI = pkgUri

		res.contents += rootPkg

		try {
			res.save(null)
		} catch (IOException e) {
			e.printStackTrace
		}
	}
}
