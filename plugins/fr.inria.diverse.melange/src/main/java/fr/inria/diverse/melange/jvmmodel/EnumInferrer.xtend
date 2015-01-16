package fr.inria.diverse.melange.jvmmodel

import com.google.inject.Inject

import fr.inria.diverse.melange.ast.NamingHelper

import fr.inria.diverse.melange.metamodel.melange.ModelType

import org.eclipse.emf.ecore.EEnum

import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.eclipse.xtext.xbase.jvmmodel.JvmTypeReferenceBuilder

class EnumInferrer
{
	@Inject extension JvmTypesBuilder
	@Inject extension NamingHelper

	def void generateEnum(ModelType mt, EEnum enu, IJvmDeclaredTypeAcceptor acceptor, extension JvmTypeReferenceBuilder builder) {
		acceptor.accept(mt.toEnumerationType(mt.getFqnFor(enu))[
			enu.ELiterals.forEach[lit |
				members += mt.toEnumerationLiteral(lit.name)[l |

				]
			]
		])
	}
}
