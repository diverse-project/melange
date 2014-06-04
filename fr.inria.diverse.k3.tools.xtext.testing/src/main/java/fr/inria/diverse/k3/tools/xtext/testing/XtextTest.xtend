package fr.inria.diverse.k3.tools.xtext.testing

import org.eclipse.xtend.lib.macro.Active
import org.eclipse.xtend.lib.macro.AbstractClassProcessor
import org.eclipse.xtend.lib.macro.TransformationContext
import org.eclipse.xtend.lib.macro.declaration.MutableClassDeclaration
import org.eclipse.xtend.lib.macro.declaration.TypeReference

import java.lang.annotation.ElementType
import java.lang.annotation.RetentionPolicy
import java.lang.annotation.Retention
import java.lang.annotation.Target

@Target(ElementType::TYPE)
@Active(XtextTestProcessor)
@Retention(RetentionPolicy.SOURCE)
public annotation XtextTest
{
	Class<?> rootType
	String   inputFile
	boolean  withValidation = true
}

class XtextTestProcessor extends AbstractClassProcessor
{
	private TypeReference rootType
	private String inputFile
	private boolean withValidation

	override void doTransform(MutableClassDeclaration cls, extension TransformationContext ctx) {
		val ann = cls.annotations.findFirst[annotationTypeDeclaration == XtextTest.newTypeReference.type]

		if (ann == null) {
			cls.addError("Couldn't find annotation type XtextTest")
			return
		}

		rootType = ann.getClassValue("rootType")
		inputFile = ann.getStringValue("inputFile")
		withValidation = ann.getBooleanValue("withValidation")

		cls.generateFields(ctx)
		cls.generateSetupMethod(ctx)
		cls.generateEmfValidationTest(ctx)

		if (withValidation)
			cls.generateParsingTest(ctx)
	}

	def generateSetupMethod(MutableClassDeclaration cls, extension TransformationContext ctx) {
		cls.addMethod("setUp")[
			addAnnotation(findTypeGlobally("org.junit.Before").newAnnotationReference)
			body = '''
				try {
					java.io.BufferedReader br = new java.io.BufferedReader(new java.io.FileReader("«inputFile»"));
					StringBuffer sb = new StringBuffer();
					String line = null;

					while ((line = br.readLine()) != null)
						sb.append(line).append("\n") ;

					this.root = this._parseHelper.parse(sb);
					this.inputSequence = sb;
				} catch (Throwable _e) {
					throw org.eclipse.xtext.xbase.lib.Exceptions.sneakyThrow(_e);
				}
			'''
		]
	}

	def generateParsingTest(MutableClassDeclaration cls, extension TransformationContext ctx) {
		cls.addMethod("testParsing")[
			addAnnotation(findTypeGlobally("org.junit.Test").newAnnotationReference)
			body = '''
				this._validationTestHelper.assertNoErrors(this.root);
			'''
		]
	}

	def generateEmfValidationTest(MutableClassDeclaration cls, extension TransformationContext ctx) {
		cls.addMethod("testEmfValidation")[
			addAnnotation(findTypeGlobally("org.junit.Test").newAnnotationReference)
			body = '''
				org.junit.Assert.assertEquals(org.eclipse.emf.ecore.util.Diagnostician.INSTANCE.validate(root).getCode(), org.eclipse.emf.common.util.Diagnostic.OK);
			'''
		]
	}

	def generateFields(MutableClassDeclaration cls, extension TransformationContext ctx) {
		// ValidationTestHelper
		if (withValidation)
			cls.addField("_validationTestHelper")[
				addAnnotation(findTypeGlobally("com.google.inject.Inject").newAnnotationReference)
				addAnnotation(findTypeGlobally("org.eclipse.xtext.xbase.lib.Extension").newAnnotationReference)
				type = findTypeGlobally("org.eclipse.xtext.junit4.validation.ValidationTestHelper").newTypeReference
			]

		// ValidationTestHelper
		cls.addField("_compilationTestHelper")[
			addAnnotation(findTypeGlobally("com.google.inject.Inject").newAnnotationReference)
			addAnnotation(findTypeGlobally("org.eclipse.xtext.xbase.lib.Extension").newAnnotationReference)
			type = findTypeGlobally("org.eclipse.xtext.xbase.compiler.CompilationTestHelper").newTypeReference
		]

		// ParseHelper
		cls.addField("_parseHelper")[
			addAnnotation(findTypeGlobally("com.google.inject.Inject").newAnnotationReference)
			addAnnotation(findTypeGlobally("org.eclipse.xtext.xbase.lib.Extension").newAnnotationReference)
			type = newTypeReference("org.eclipse.xtext.junit4.util.ParseHelper", rootType)
		]

		// Input sequence
		cls.addField("inputSequence")[
			type = StringBuffer.newTypeReference
		]

		// Root element
		cls.addField("root")[
			type = rootType
		]
	}
}
