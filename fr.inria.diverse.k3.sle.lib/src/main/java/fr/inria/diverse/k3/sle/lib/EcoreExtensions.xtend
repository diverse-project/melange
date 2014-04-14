package fr.inria.diverse.k3.sle.lib

import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EcoreFactory
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.EReference
import java.util.ArrayList
import org.eclipse.emf.ecore.ENamedElement
import org.eclipse.emf.ecore.EClassifier

class EcoreExtensions
{
	static def findClass(EPackage pkg, String clsName) {
		pkg.EClassifiers.filter(EClass).findFirst[name == clsName]
	}

	static def findClassifier(EPackage pkg, String clsName) {
		pkg.EClassifiers.filter(EClassifier).findFirst[name == clsName]
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

		println("pkg.eResource="+pkg.eResource)
		println("pkg.eContainer="+pkg.eContainer)

		println("Trying to copy " + pkg)
		pkg.EClassifiers.filter(EClass).forEach[cls |
			//if (cls.eIsProxy)
			//	EcoreUtil.resolve(cls, pkg)

			//println("cls.eContainer="+(cls.eContainer as ENamedElement).name)

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
