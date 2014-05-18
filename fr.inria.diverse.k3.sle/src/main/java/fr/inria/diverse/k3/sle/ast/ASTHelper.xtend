package fr.inria.diverse.k3.sle.ast

import fr.inria.diverse.k3.sle.metamodel.k3sle.ModelTypingSpace
import fr.inria.diverse.k3.sle.metamodel.k3sle.Metamodel
import fr.inria.diverse.k3.sle.metamodel.k3sle.ModelType
import fr.inria.diverse.k3.sle.metamodel.k3sle.Transformation
import fr.inria.diverse.k3.sle.metamodel.k3sle.K3sleFactory

import org.eclipse.emf.common.util.URI

import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.util.EcoreUtil

import java.util.Collections

import org.apache.log4j.Logger

import static extension fr.inria.diverse.k3.sle.ast.MetamodelExtensions.*
import static extension fr.inria.diverse.k3.sle.ast.ModelTypeExtensions.*
import static extension fr.inria.diverse.k3.sle.ast.TransformationExtensions.*

class ASTHelper
{
	static Logger logger = Logger.getLogger(ASTHelper)

	static def saveAs(ModelTypingSpace root, String uri) {
		Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("*", new XMIResourceFactoryImpl)
		val rs = new ResourceSetImpl
		val res = rs.createResource(URI.createURI(uri))

		res.contents.add(EcoreUtil.copy(root))
		res.save(Collections.EMPTY_MAP)
	}

	static def printDebug(ModelTypingSpace root) {
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

	static def getMetamodels(ModelTypingSpace root) {
		root.elements.filter(Metamodel)
	}

	static def getModelTypes(ModelTypingSpace root) {
		root.elements.filter(ModelType)
	}

	static def getTransformations(ModelTypingSpace root) {
		root.elements.filter(Transformation)
	}

	static def Iterable<EClass> sortByClassInheritance(Iterable<EClass> classes) {
		classes.sort(new ClassInheritanceComparator())
	}
}

// What about multiple inheritance?
class ClassInheritanceComparator implements java.util.Comparator<EClass> {
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
