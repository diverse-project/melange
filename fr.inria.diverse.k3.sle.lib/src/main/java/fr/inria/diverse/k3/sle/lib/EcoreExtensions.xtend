package fr.inria.diverse.k3.sle.lib

import org.eclipse.emf.codegen.ecore.genmodel.GenPackage
import org.eclipse.emf.codegen.ecore.genmodel.GenModel

import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EcoreFactory
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.ENamedElement
import org.eclipse.emf.ecore.EDataType
import org.eclipse.emf.ecore.EcorePackage

import java.util.ArrayList
import java.util.List

class EcoreExtensions
{
	static def findClass(EPackage pkg, String clsName) {
		pkg.EClassifiers.filter(EClass).findFirst[name == clsName]
	}

	static def findClassifier(EPackage pkg, String clsName) {
		pkg.EClassifiers.findFirst[name == clsName]
	}

	static def isInstantiable(EClass cls) {
		!cls.^abstract && !cls.^interface && cls.instanceClass === null
	}

	static def isAbstractable(EClass cls) {
		cls.instanceClass === null && cls.instanceTypeName === null
	}

	static def isAspectSpecific(ENamedElement f) {
		f.EAnnotations.exists[source == "aspect"]
	}

	static def getOrCreateClass(EPackage pkg, String name) {
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

	static def getOrCreateDataType(EPackage pkg, String name, String instanceTypeName) {
		val find = pkg.EClassifiers.filter(EDataType).findFirst[it.name == name && it.instanceTypeName == instanceTypeName]
		val findDt = EcorePackage.eINSTANCE.findClassifier("E" + name.toFirstUpper)

		if (find !== null) {
			return find
		} else if (findDt !== null) {
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

	static def copy(EPackage pkg) {
		pkg.copy(pkg.name, pkg.name, pkg.nsURI)
	}

	static def copy(EPackage pkg, String name) {
		pkg.copy(name, name.toLowerCase, '''http://«name.toLowerCase»/''')
	}

	static def copy(EPackage pkg, String pkgName, String prefix, String uri) {
		val newPkg = EcoreFactory.eINSTANCE.createEPackage => [
			name = pkgName.toLowerCase
			nsPrefix = prefix
			nsURI = uri
		]

		newPkg.EClassifiers.addAll(EcoreUtil.copyAll(pkg.EClassifiers))

		return newPkg
	}

	static def createSubPackage(String pkgUri, String pkgName) {
		val newPkg = EcoreFactory.eINSTANCE.createEPackage => [
			name = pkgName.toLowerCase
			nsPrefix = pkgName.toLowerCase
			nsURI = '''http://«pkgName.toLowerCase»/'''
		]

		val pkg = ModelUtils.loadPkg(pkgUri)
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

	static def getReferencedPkgs(EPackage pkg) {
		val ret = new ArrayList<EPackage>

		EcoreUtil$ExternalCrossReferencer.find(pkg).filter[o, s | o instanceof EClass].forEach[cls, s|
			var container = cls
			while (container !== null && !(container instanceof EPackage))
				container = container.eContainer

			if (container !== null && !ret.contains(container))
				ret += container as EPackage
		]

		return ret
	}

	static def void getAllSubPkgs(EPackage pkg, List<EPackage> ret) {
		pkg.ESubpackages.forEach[p |
			getAllSubPkgs(p, ret)
			ret.add(p)
		]
	}

	static def void getAllGenPkgs(GenModel gm, List<GenPackage> ret) {
		gm.genPackages.forEach[gp |
			getAllGenPkgs(gp, ret)
			ret.add(gp)
		]
	}

	static def void getAllGenPkgs(GenPackage gp, List<GenPackage> ret) {
		gp.subGenPackages.forEach[gpp |
			getAllGenPkgs(gpp, ret)
			ret.add(gpp)
		]
	}

	static def needsSetter(EStructuralFeature attr) {
		// TODO: Checks against EMF generation
		switch (attr) {
			EAttribute:
				    attr.changeable
				//&& !attr.derived
			EReference:
				    attr.changeable
				//&& !attr.derived
				&& !attr.many
		}
	}

	static def isEMFMapDetails(EReference ref) {
		ref?.name == "details" && ref.EReferenceType?.name == "EStringToStringMapEntry"
	}
}
