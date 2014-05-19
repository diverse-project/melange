package fr.inria.diverse.k3.sle.lib

import org.eclipse.emf.ecore.EPackage

class PackageMerge
{
	// TODO
	static def mergeWith(EPackage base, EPackage ext) {
		return base
	}
}

class PackageMergeException extends Exception
{
	new(String msg) {
		super(msg)
	}
}

