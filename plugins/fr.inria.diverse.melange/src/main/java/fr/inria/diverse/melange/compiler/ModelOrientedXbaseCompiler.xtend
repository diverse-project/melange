package fr.inria.diverse.melange.compiler

import com.google.inject.Inject
import fr.inria.diverse.melange.lib.IMetamodel
import fr.inria.diverse.melange.lib.IModelType
import fr.inria.diverse.melange.typesystem.MelangeTypesRegistry
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.xbase.XCastedExpression
import org.eclipse.xtext.xbase.XExpression
import org.eclipse.xtext.xbase.compiler.XbaseCompiler
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable

/**
 * Specializes the type system and the code generator of Xbase to emulate
 * model-oriented object manipulation in the code of {@link XbaseTransformation}s.
 * 
 * @deprecated Shouldn't be used anymore as {@link XbaseTransformation}s will
 * eventually disappear from Melange.
 */
class ModelOrientedXbaseCompiler extends XbaseCompiler
{
	@Inject extension IQualifiedNameProvider
	@Inject MelangeTypesRegistry typesRegistry

	/**
	 * Whenever we can't find a match between expected and returned modeltypes,
	 * let's see if we have an adapter for that purpose
	 */
	override internalToConvertedExpression(XExpression expr, ITreeAppendable appendable) {
		val expected = getLightweightExpectedType(expr)
		val returned = getLightweightReturnType(expr)

		val wrap =
			   expected !== null && returned !== null
			&& expected.identifier != returned.identifier
			&& expected.isSubtypeOf(IModelType)

		val isImplements =
			   wrap
			&& returned.isSubtypeOf(IMetamodel)
			&& typesRegistry.getImplementations(returned.identifier)
			   .exists[fullyQualifiedName.toString == expected.identifier]

		val isSubtype =
			   wrap
			&& returned.isSubtypeOf(IModelType)
			&& typesRegistry.getSubtypings(returned.identifier)
			   .exists[fullyQualifiedName.toString == expected.identifier]

		if (isSubtype) {
			// FIXME: Generated code is invalid
			appendable.append('''((fr.inria.diverse.melange.lib.GenericAdapter<XXX>) ''')
		}

		super.internalToConvertedExpression(expr, appendable)

		if (isImplements) {
			val match =
				typesRegistry.getImplementations(returned.identifier)
				.findFirst[fullyQualifiedName.toString == expected.identifier]

			appendable.append('''.to«match.name»()''')
		}
		else if (isSubtype) {
			val match =
				typesRegistry.getSubtypings(returned.identifier)
				.findFirst[fullyQualifiedName.toString == expected.identifier]

			appendable.append(''').getAdaptee().to«match.name»()''')
		}
	}

	/**
	 * If the cast operation involves metamodels and modeltypes,
	 * let's use the appropriate adapters
	 */
	override _toJavaExpression(XCastedExpression expr, ITreeAppendable b) {
		val type = getLightweightType(expr.target)
		val expectedType = getLightweightType(expr)

		if (
			   expectedType.isSubtypeOf(IModelType)
			&& type.isSubtypeOf(IMetamodel)
			&& typesRegistry.getImplementations(type.identifier).exists[fullyQualifiedName.toString == expectedType.identifier]
		) { // implements
			val match = typesRegistry.getImplementations(type.identifier).findFirst[fullyQualifiedName.toString == expectedType.identifier]
			internalToConvertedExpression(expr.target, b, expectedType)
			b.append('''.to«match.name»()''')
		}
		else if (
			   expectedType.isSubtypeOf(IModelType)
			&& type.isSubtypeOf(IModelType)
			&& typesRegistry.getSubtypings(type.identifier).exists[fullyQualifiedName.toString == expectedType.identifier]
		) { // subtypeOf
				val match = typesRegistry.getSubtypings(type.identifier).findFirst[fullyQualifiedName.toString == expectedType.identifier]
				// FIXME: Generated code is invalid
				b.append('''((fr.inria.diverse.melange.lib.GenericAdapter<XXX>) ''')
				internalToConvertedExpression(expr.target, b, expectedType)
				b.append(''').getAdaptee().to«match.name»()''')
		}
		else {
			super._toJavaExpression(expr, b)
		}
	}
}
