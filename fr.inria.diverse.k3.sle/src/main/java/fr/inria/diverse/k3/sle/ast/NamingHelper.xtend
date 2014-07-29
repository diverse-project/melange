package fr.inria.diverse.k3.sle.ast

import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EOperation
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EStructuralFeature

import org.eclipse.xtext.common.types.JvmOperation

import org.eclipse.xtext.naming.QualifiedName

class NamingHelper
{
	def normalize(QualifiedName name) {
		name.skipLast(1).toLowerCase.append(name.lastSegment.toFirstUpper)
	}

	def getGetterName(EStructuralFeature f) {
		switch (f) {
			EAttribute:
				if (#["java.lang.Boolean", "boolean"].contains(f.EAttributeType.instanceClassName) && !f.many)
					'''is«f.name.toFirstUpper»'''.toString
				else
					'''get«f.name.toFirstUpper»'''.toString
			EReference:
				'''get«f.name.toFirstUpper»'''.toString
		}
	}

	def getGetterName(JvmOperation op) {
		if (#["java.lang.Boolean", "boolean"].contains(op.returnType.type.simpleName))
			'''is«op.simpleName.toFirstUpper»'''.toString
		else
			'''get«op.simpleName.toFirstUpper»'''.toString
	}

	def getUmlGetterName(EStructuralFeature f) {
		switch (f) {
			EAttribute:
				if (#["java.lang.Boolean", "boolean"].contains(f.EAttributeType.instanceClassName))
					'''«f.name.toFirstUpper»'''.toString
				else
					'''get«f.name.toFirstUpper»'''.toString
			EReference:
				'''get«f.formatUmlReferenceName.toFirstUpper»'''.toString
		}
	}

	def getSetterName(EStructuralFeature f) {
		'''set«f.name.toFirstUpper»'''.toString
	}

	def getSetterName(JvmOperation op) {
		'''set«op.simpleName.toFirstUpper»'''.toString
	}

	def formatUmlOperationName(EOperation op) {
		val opName = op.name.toCamelCase

		if (op.EParameters.head?.EType?.name == "EDiagnosticChain") {
			return '''validate«opName.toFirstUpper»'''.toString
		}

		return opName
	}

	def formatUmlReferenceName(EReference ref) {
		if (ref.name == "class")
			return "class_"
		else if (ref.many) {
			if (ref.name.endsWith("es"))
				'''«ref.name.toFirstUpper»es'''.toString
			else if (ref.name.endsWith("y"))
				'''«ref.name.substring(0, ref.name.length - 1).toFirstUpper»ies'''.toString
			else if (ref.name.endsWith("ex"))
				'''«ref.name.substring(0, ref.name.length - 2).toFirstUpper»ices'''.toString
			else
				'''«ref.name.toFirstUpper»s'''.toString
		}
		else
			return ref.name
	}

	def toCamelCase(String s) {
		val parts = s.split("_")
		val res = new StringBuilder

		parts.forEach[p, i |
			res.append(if (i == 0) p else p.toFirstUpper)
		]

		return res.toString
	}
}
