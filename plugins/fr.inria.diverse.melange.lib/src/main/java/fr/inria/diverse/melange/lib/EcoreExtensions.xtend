package fr.inria.diverse.melange.lib

import com.google.inject.Inject
import java.util.ArrayList
import java.util.List
import org.eclipse.emf.codegen.ecore.genmodel.GenModel
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenBaseGeneratorAdapter
import org.eclipse.emf.codegen.ecore.genmodel.util.GenModelUtil
import org.eclipse.emf.common.util.Diagnostic
import org.eclipse.emf.common.util.Monitor
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.emf.ecore.EDataType
import org.eclipse.emf.ecore.EEnum
import org.eclipse.emf.ecore.EModelElement
import org.eclipse.emf.ecore.ENamedElement
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EOperation
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.EcoreFactory
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.emf.ecore.util.EcoreUtil

class EcoreExtensions
{
	@Inject ModelUtils modelUtils

	def boolean emfEquals(EObject o1, EObject o2) {
		return EcoreUtil.equals(o1, o2)
	}

	def Iterable<EClass> sortByClassInheritance(Iterable<EClass> classes) {
		return classes.sortWith[clsA, clsB |
			if (clsA.EAllSuperTypes.contains(clsB))
				return -1
			else if (clsB.EAllSuperTypes.contains(clsA))
				return 1
			else
				return 0
		]
	}

	def Iterable<EOperation> sortByOverridingPriority(Iterable<EOperation> ops) {
		return ops.sortWith[opA, opB |
			val retA = opA.EType
			val retB = opB.EType

			if (retA instanceof EClass) {
				if (!(retB instanceof EClass))
					return 1
				else if (retA.EAllSuperTypes.contains(retB))
					return -1
			} else {
				if (retB instanceof EClass)
					return -1
				else return 1
			}

			return 0
		]
	}
	
	/**
	 * Search a subPackage in @{link root} named {@link fqn}.
	 * @param fqn In the form of 'subpackage(.subpackage)*'
	 */
	def EPackage findSubPackage(EPackage root, String fqn){
		
		val splitName = fqn.split("\\.")
		
		if(splitName.length == 1){
			return root.ESubpackages.findFirst[name == fqn]
		}
		else{
			val subRoot = root.ESubpackages.findFirst[name == splitName.get(0)]
			val subFqn = fqn.substring(splitName.get(0).length+1)
			return findSubPackage(subRoot, subFqn)
		}
	}

	def EClass findClass(EPackage pkg, String clsName) {
		return pkg.EClassifiers.filter(EClass).findFirst[name == clsName]
	}

	def EClassifier findClassifier(EPackage pkg, String clsName) {
		return pkg.EClassifiers.findFirst[name == clsName]
	}

	def List<EClassifier> getAllClassifiers(List<EPackage> pkgs) {
		return pkgs.map[EClassifiers].flatten.toList
	}

	def dispatch String getUniqueId(EPackage it) {
		return '''«IF ESuperPackage !== null»«ESuperPackage.uniqueId»_«ENDIF»«name»'''
	}

	def dispatch String getUniqueId(EClassifier it) {
		return '''«EPackage.uniqueId»_«name»'''
	}

	def dispatch String getUniqueId(EOperation it) {
		return '''«EContainingClass.uniqueId»_«name»'''
	}

	def dispatch String getUniqueId(EStructuralFeature it) {
		return '''«EContainingClass.uniqueId»_«name»'''
	}

	def boolean isInstantiable(EClass cls) {
		return !cls.^abstract && !cls.^interface && cls.abstractable
	}

	def boolean isAbstractable(EClass cls) {
		return cls.name != "EObject" && cls.instanceClass === null && cls.instanceTypeName === null
	}

	def boolean isAspectSpecific(ENamedElement f) {
		return f.EAnnotations.exists[source == "aspect"]
	}

	def boolean hasSuppressedVisibility(ENamedElement f) {
		return f.getGenmodelAnnotationValue("suppressedVisibility") == "true"
	}

	def boolean needsUnsetter(EStructuralFeature f) {
		return
			   f.unsettable
			&& f.getGenmodelAnnotationValue("suppressedUnsetVisibility") != "true"
	}

	def boolean needsUnsetterChecker(EStructuralFeature f) {
		return
			   f.unsettable
			&& f.getGenmodelAnnotationValue("suppressedIsSetVisibility") != "true"
	}

	def String getGenmodelAnnotationValue(EModelElement e, String key) {
		return
			e.getEAnnotation("http://www.eclipse.org/emf/2002/GenModel")
			?.details?.findFirst[d | d.key == key]
			?.value ?: ""
	}

	def void generateCode(GenModel genModel) {
		genModel.reconcile
		genModel.canGenerate = true
		genModel.validateModel = true

		val generator = GenModelUtil::createGenerator(genModel)
		generator.generate(
			genModel,
			GenBaseGeneratorAdapter::MODEL_PROJECT_TYPE,
			// NullMonitor
			new Monitor() {
				override beginTask(String name, int totalWork) {}
				override clearBlocked() {}
				override done() {}
				override internalWorked(double work) {}
				override isCanceled() { return false }
				override setBlocked(Diagnostic reason) {}
				override setCanceled(boolean value) {}
				override setTaskName(String name) {}
				override subTask(String name) {}
				override worked(int work) {}
			}
		)
	}

	def EClass getOrCreateClass(EPackage pkg, String name) {
		val find = pkg.EClassifiers.filter(EClass).findFirst[it.name == name]

		if (find !== null) {
			return find
		} else {
			val newCls = EcoreFactory.eINSTANCE.createEClass => [cls |
				cls.name = name
			]

			pkg.EClassifiers += newCls

			return newCls
		}
	}

	def EClassifier getOrCreateDataType(EPackage pkg, String name, String instanceTypeName) {
		val primitiveTypes = #[
			"java.lang.Boolean", "java.lang.Byte",
			"java.lang.Double",  "java.lang.Float",
			"java.lang.Integer", "java.lang.Long",
			"java.lang.Short"
		]

		val ecoreDtName = "E" + name.toFirstUpper + if (primitiveTypes.contains(instanceTypeName)) "Object" else ""
		val find = pkg.EClassifiers.filter(EDataType).findFirst[it.name == name && it.instanceTypeName == instanceTypeName]
		val findDt = EcorePackage.eINSTANCE.findClassifier(ecoreDtName)

		if (find !== null) {
			return find
		} else if (name != "Object" && findDt !== null) {
			return findDt
		} else {
			val newDt = EcoreFactory.eINSTANCE.createEDataType => [dt |
				dt.name = name
				dt.instanceTypeName = instanceTypeName
			]

			pkg.EClassifiers += newDt

			return newDt
		}
	}

	def EClassifier getOrCreateEnum(EPackage pkg, String name, Iterable<String> literals) {
		val find = pkg.EClassifiers.filter(EEnum).findFirst[it.name == name]

		if (find !== null) {
			return find
		} else {
			val newE = EcoreFactory.eINSTANCE.createEEnum => [e |
				e.name = name
				e.ELiterals += literals.map[litValue | EcoreFactory.eINSTANCE.createEEnumLiteral => [lit |
					lit.name = litValue
				]]
			]

			pkg.EClassifiers += newE

			return newE
		}
	}

	def EPackage copy(EPackage pkg) {
		return pkg.copy(pkg.name, pkg.name, pkg.nsURI)
	}

	def EPackage copy(EPackage pkg, String name) {
		return pkg.copy(name, name.toLowerCase, '''http://«name.toLowerCase»/''')
	}

	def EPackage copy(EPackage pkg, String pkgName, String prefix, String uri) {
		val newPkg = EcoreFactory.eINSTANCE.createEPackage => [
			name = pkgName.toLowerCase
			nsPrefix = prefix
			nsURI = uri
		]

		newPkg.EClassifiers.addAll(EcoreUtil.copyAll(pkg.EClassifiers))

		return newPkg
	}

	def EPackage createSubPackage(String pkgUri, String pkgName) {
		val newPkg = EcoreFactory.eINSTANCE.createEPackage => [
			name = pkgName.toLowerCase
			nsPrefix = pkgName.toLowerCase
			nsURI = '''http://«pkgName.toLowerCase»/'''
		]

		val pkg = modelUtils.loadPkg(pkgUri)
		pkg.EClassifiers.filter(EClass).forEach[cls |
			newPkg.EClassifiers += EcoreFactory.eINSTANCE.createEClass => [
				^abstract = cls.^abstract
				^interface = cls.^interface
				name = cls.name
				ESuperTypes += cls
			]
		]

		return newPkg
	}

	def List<EPackage> getReferencedPkgs(EPackage pkg) {
		val ret = new ArrayList<EPackage>
		getReferencedPkgsRec(pkg, ret)
		return ret
	}

	def void getReferencedPkgsRec(EPackage pkg, List<EPackage> ret) {
		EcoreUtil.ExternalCrossReferencer.find(pkg).filter[o, s | o instanceof EClass].forEach[cls, s|
			var container = cls

			while (container !== null && !(container instanceof EPackage))
				container = container.eContainer

			val referenced = container as EPackage

			if (referenced !== null && !ret.exists[nsURI == referenced.nsURI] && !referenced.isEcore) {
				ret += referenced
				referenced.getReferencedPkgsRec(ret)
			}
		]
	}
	
	def List<EClass> getAllClasses(EPackage pkg) {
		val ret = newArrayList
		
		ret.addAll(pkg.EClassifiers.filter(EClass))
		ret.addAll(pkg.allSubPkgs.map[EClassifiers].flatten.filter(EClass))
		
		return ret
	}

	def List<EPackage> getAllSubPkgs(EPackage pkg) {
		val ret = newArrayList
		getAllSubPkgsRec(pkg, ret)
		return ret
	}

	def void getAllSubPkgsRec(EPackage pkg, List<EPackage> ret) {
		pkg.ESubpackages.forEach[p |
			getAllSubPkgsRec(p, ret)
			ret.add(p)
		]
	}

	def List<GenPackage> getAllGenPkgs(GenModel gm) {
		val ret = newArrayList
		getAllGenPkgsRec(gm, ret)
		return ret
	}

	def void getAllGenPkgsRec(GenModel gm, List<GenPackage> ret) {
		gm.genPackages.filter[gp | !ret.exists[getEcorePackage.nsURI == gp.getEcorePackage.nsURI]].forEach[gp |
			ret.add(gp)
			getAllGenPkgsRec(gp, ret)
		]
		gm.usedGenPackages.filter[gp | gp !== null && gp.getEcorePackage !== null && !ret.exists[getEcorePackage.nsURI == gp.getEcorePackage.nsURI]].forEach[gp |
			ret.add(gp)
			getAllGenPkgsRec(gp.genModel, ret)
			getAllGenPkgsRec(gp, ret)
		]
	}

	def void getAllGenPkgsRec(GenPackage gp, List<GenPackage> ret) {
		gp.subGenPackages.filter[gpp | !ret.exists[getEcorePackage.nsURI == gpp.getEcorePackage.nsURI]].forEach[gpp |
			ret.add(gpp)
			getAllGenPkgsRec(gpp, ret)
		]
	}

	def boolean needsSetter(EStructuralFeature attr) {
		// TODO: Checks against EMF generation
		return attr.changeable && !attr.many
	}

	def boolean isEMFMapDetails(EReference ref) {
		return ref?.name == "details" && ref.EReferenceType?.name == "EStringToStringMapEntry"
	}

	def boolean isEcore(EPackage pkg) {
		return pkg.nsURI == "http://www.eclipse.org/emf/2002/Ecore"
	}

	def boolean isUml(EPackage pkg) {
		return pkg.name == "uml"
	}

	def void replaceLocalEObjectReferencesToEcoreEObjectReferences(EPackage pkg) {
		val eObject = pkg.findClass("EObject")

		if (eObject !== null) {
			EcoreUtil.UsageCrossReferencer::find(eObject, pkg).forEach[setting |
				val ref = setting.EObject
				if (ref instanceof EReference) {
					val replacement = EcoreUtil::copy(ref) => [
						EType = EcorePackage.Literals.EOBJECT
					]
					EcoreUtil::replace(ref, replacement)
				}
			]
			EcoreUtil::delete(eObject)
		}
	}

	/**
	 * Replaces a datatype with a new EClass and update the pointing references
	 */
	def void replaceDataTypeWithEClass(EPackage pkg, EDataType dt) {
		val dtName = dt.name
		val find = pkg.findClass(dtName)

		val replacement =
			if (find !== null)
				find
			else
				EcoreFactory.eINSTANCE.createEClass => [
					name = dtName
				]
		EcoreUtil.UsageCrossReferencer::find(dt, pkg).forEach[setting |
			val attr = setting.EObject
			if (attr instanceof EAttribute) {
				val featureReplacement = EcoreFactory.eINSTANCE.createEReference => [ref |
					ref.name = attr.name
					ref.lowerBound = attr.lowerBound
					ref.upperBound = attr.upperBound
					ref.EType = replacement
				]
				EcoreUtil::replace(attr, featureReplacement)
			}
		]

		if (find !== null)
			EcoreUtil::delete(dt)
		else
			EcoreUtil::replace(dt, replacement)
	}
}
