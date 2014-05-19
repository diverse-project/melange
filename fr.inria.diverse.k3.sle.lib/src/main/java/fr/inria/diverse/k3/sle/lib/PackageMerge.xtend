package fr.inria.diverse.k3.sle.lib

import org.eclipse.emf.ecore.EPackage

import static extension fr.inria.diverse.k3.sle.lib.EcoreExtensions.*
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.util.EcoreUtil

class PackageMerge
{
	// TODO: Enums? Datatypes?
	// TODO: Annotations? Generics?
	// TODO: Subpackages?
	static def mergeWith(EPackage base, EPackage ext) {
		val res = EcoreUtil.copy(base)

		// 1: copy all classes
		ext.EClassifiers.filter(EClass).forEach[cls |
			val baseCls = res.findClass(cls.name)

			if (baseCls === null) { // New class, import it
				res.EClassifiers += EcoreUtil.copy(cls)
			} else { // Existing class, merge it
				baseCls.mergeWith(cls)
			}
		]

		// 2: re-attach references and inheritance links in the new type group
		ext.EClassifiers.filter(EClass).forEach[cls |
			val baseCls = res.findClass(cls.name)
			if (baseCls !== null) {
				baseCls.EReferences.forEach[ref |
					val refCls = res.findClass(ref.EReferenceType.name)

					if (refCls !== null)
						ref.EType = refCls
				]

				baseCls.ESuperTypes.forEach[t |
					val baseT = res.findClass(t.name)

					if (baseT !== null) {
						baseCls.ESuperTypes.remove(t)
						baseCls.ESuperTypes.add(baseT)
					}
				]
			}
		]

		return res
	}

	static def mergeWith(EClass base, EClass ext) {

	}
}

class PackageMergeException extends Exception
{
	new(String msg) {
		super(msg)
	}
}

