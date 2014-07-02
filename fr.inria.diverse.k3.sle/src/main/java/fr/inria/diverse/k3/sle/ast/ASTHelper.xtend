package fr.inria.diverse.k3.sle.ast

import fr.inria.diverse.k3.sle.metamodel.k3sle.Metamodel
import fr.inria.diverse.k3.sle.metamodel.k3sle.ModelType
import fr.inria.diverse.k3.sle.metamodel.k3sle.ModelTypingSpace
import fr.inria.diverse.k3.sle.metamodel.k3sle.Transformation

import java.util.Collections
import java.util.Comparator

import org.apache.log4j.Logger

import org.eclipse.emf.common.util.URI

import org.eclipse.emf.ecore.EClass

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl

import org.eclipse.emf.ecore.util.EcoreUtil

import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl

class ASTHelper
{
	Logger logger = Logger.getLogger(ASTHelper)

	def saveAs(ModelTypingSpace root, String uri) {
		Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("*", new XMIResourceFactoryImpl)
		val rs = new ResourceSetImpl
		val res = rs.createResource(URI.createURI(uri))

		res.contents.add(EcoreUtil.copy(root))
		res.save(Collections.EMPTY_MAP)
	}

	def printDebug(ModelTypingSpace root) {
		root.metamodels.forEach[mm |
			logger.debug('''MM «mm.name»''')
			logger.debug('''\tpkgs = «mm.pkgs.map[name].join(", ")»''')
			logger.debug('''\tgenmodels = «mm.genmodels.map[it.class].join(", ")»''')
			logger.debug('''\texactType = «mm.exactType.name»''')
			logger.debug('''\timplements = «mm.^implements.map[name].join(", ")»''')
			logger.debug('''\tsuperMM = «mm.inheritanceRelation?.superMetamodel?.name»''')
			logger.debug('''\taspects = «mm.aspects.map[aspectRef.simpleName].join(", ")»''')
		]

		root.modelTypes.forEach[mt |
			logger.debug('''MT «mt.name»''')
			logger.debug('''pkgs = «mt.pkgs.map[name].join(", ")»''')
			logger.debug('''extracted = «mt.extracted?.name»''')
			logger.debug('''superTypes = «mt.subtypingRelations.map[superType?.name].join(", ")»''')
		]
	}

	def getMetamodels(ModelTypingSpace root) {
		root.elements.filter(Metamodel)
	}

	def getModelTypes(ModelTypingSpace root) {
		root.elements.filter(ModelType)
	}

	def getTransformations(ModelTypingSpace root) {
		root.elements.filter(Transformation)
	}

	def Iterable<EClass> sortByClassInheritance(Iterable<EClass> classes) {
		classes.sort(new ClassInheritanceComparator())
	}
}

// What about multiple inheritance?
class ClassInheritanceComparator implements Comparator<EClass> {
	override int compare(EClass clsA, EClass clsB)
	{
		if (clsA.EAllSuperTypes.contains(clsB))
			return -1
		else if (clsB.EAllSuperTypes.contains(clsA))
			return 1
		else
			return 0
	}
}

class ASTProcessingException extends Exception
{
	new(String msg) {
		super(msg)
	}
}
