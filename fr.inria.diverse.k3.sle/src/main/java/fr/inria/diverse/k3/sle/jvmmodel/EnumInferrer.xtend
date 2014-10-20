package fr.inria.diverse.k3.sle.jvmmodel

import com.google.inject.Inject

import fr.inria.diverse.k3.sle.ast.NamingHelper

import fr.inria.diverse.k3.sle.metamodel.k3sle.ModelType

import org.eclipse.emf.ecore.EEnum

import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder

class EnumInferrer extends AbstractModelInferrer
{
	@Inject extension JvmTypesBuilder
	@Inject extension NamingHelper

	def void generateEnum(ModelType mt, EEnum enu, IJvmDeclaredTypeAcceptor acceptor) {
		acceptor.accept(mt.toEnumerationType(mt.getFqnFor(enu))[
			enu.ELiterals.forEach[lit |
				members += mt.toEnumerationLiteral(lit.name)[l |

				]
			]
		])
	}
}
