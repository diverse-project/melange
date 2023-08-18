/*******************************************************************************
 * Copyright (c) 2017 Inria and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Inria - initial API and implementation
 *******************************************************************************/
package fr.inria.diverse.melange.tools.xtext.testing

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
annotation XtextTest
{
	Class<?> rootType
	String   inputFile
	boolean withValidation = true
	String[] ignoreSelfImplement = #[]
}

class XtextTestProcessor extends AbstractClassProcessor
{
	TypeReference rootType
	String inputFile
	boolean withValidation
	String[] ignoreSelfImplement

	override void doTransform(MutableClassDeclaration cls, extension TransformationContext ctx) {
		val ann = cls.annotations.findFirst[annotationTypeDeclaration == XtextTest.newTypeReference.type]

		if (ann === null) {
			cls.addError("Couldn't find annotation type XtextTest")
			return
		}

		rootType = ann.getClassValue("rootType")
		inputFile = ann.getStringValue("inputFile")
		withValidation = ann.getBooleanValue("withValidation")
		ignoreSelfImplement = ann.getStringArrayValue("ignoreSelfImplement")

		cls.generateFields(ctx)
		cls.generateSetupMethod(ctx)
		cls.generateEmfValidationTest(ctx)
		cls.generateSelfImplement(ctx)
		cls.generateImplementSuperType(ctx)

		if (withValidation)
			cls.generateParsingTest(ctx)
	}

	def void generateSetupMethod(MutableClassDeclaration cls, extension TransformationContext ctx) {
		cls.addMethod("setUp")[
			primarySourceElement = cls
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

	def void generateParsingTest(MutableClassDeclaration cls, extension TransformationContext ctx) {
		cls.addMethod("testParsing")[
			primarySourceElement = cls
			addAnnotation(findTypeGlobally("org.junit.Test").newAnnotationReference)
			body = '''
				this._validationTestHelper.assertNoErrors(this.root);
			'''
		]
	}

	def void generateEmfValidationTest(MutableClassDeclaration cls, extension TransformationContext ctx) {
		cls.addMethod("testEmfValidation")[
			primarySourceElement = cls
			addAnnotation(findTypeGlobally("org.junit.Test").newAnnotationReference)
			body = '''
				org.junit.Assert.assertEquals(org.eclipse.emf.ecore.util.Diagnostician.INSTANCE.validate(root).getCode(), org.eclipse.emf.common.util.Diagnostic.OK);
			'''
		]
	}
	
	def void generateSelfImplement(MutableClassDeclaration cls, extension TransformationContext ctx){
		cls.addMethod("testSelfImplement")[
			primarySourceElement = cls
			addAnnotation(findTypeGlobally("org.junit.Test").newAnnotationReference)
			val languages = ignoreSelfImplement.map["\""+it+"\""].join(",")
			body = '''
				java.util.List<String> ignored = java.util.Arrays.asList(«languages»);
				for(fr.inria.diverse.melange.metamodel.melange.Element e : root.getElements()){
					if(e instanceof fr.inria.diverse.melange.metamodel.melange.Language){
						fr.inria.diverse.melange.metamodel.melange.Language l = (fr.inria.diverse.melange.metamodel.melange.Language) e;
						if(!ignored.contains(l.getName()))
							org.junit.Assert.assertTrue(l.getName()+" doesn't implement itself",l.getImplements().contains(l.getExactType()));
					}
				}
			'''
		]
	}
	
	def void generateImplementSuperType(MutableClassDeclaration cls, extension TransformationContext ctx){
		cls.addMethod("testImplementSuperType")[
			primarySourceElement = cls
			addAnnotation(findTypeGlobally("org.junit.Test").newAnnotationReference)
			body = '''
				for(fr.inria.diverse.melange.metamodel.melange.Element e : root.getElements()){
					if(e instanceof fr.inria.diverse.melange.metamodel.melange.Language){
						fr.inria.diverse.melange.metamodel.melange.Language l = (fr.inria.diverse.melange.metamodel.melange.Language) e;
						for(fr.inria.diverse.melange.metamodel.melange.Operator operator : l.getOperators()){
							if(operator instanceof fr.inria.diverse.melange.metamodel.melange.Inheritance){
								fr.inria.diverse.melange.metamodel.melange.Inheritance inherit = (fr.inria.diverse.melange.metamodel.melange.Inheritance) operator;
								org.junit.Assert.assertTrue(l.getName()+" doesn't implement inherited Language "+inherit.getTargetLanguage().getName(),
									l.getImplements().contains(inherit.getTargetLanguage().getExactType()));
							}
						}
					}
				}
			'''
		]
	}

	def void generateFields(MutableClassDeclaration cls, extension TransformationContext ctx) {
		// ValidationTestHelper
		cls.addField("_validationTestHelper")[
			primarySourceElement = cls
			addAnnotation(findTypeGlobally("com.google.inject.Inject").newAnnotationReference)
			addAnnotation(findTypeGlobally("org.eclipse.xtext.xbase.lib.Extension").newAnnotationReference)
			type = findTypeGlobally("org.eclipse.xtext.junit4.validation.ValidationTestHelper").newTypeReference
		]

		// ValidationTestHelper
		cls.addField("_compilationTestHelper")[
			primarySourceElement = cls
			addAnnotation(findTypeGlobally("com.google.inject.Inject").newAnnotationReference)
			addAnnotation(findTypeGlobally("org.eclipse.xtext.xbase.lib.Extension").newAnnotationReference)
			type = findTypeGlobally("org.eclipse.xtext.xbase.compiler.CompilationTestHelper").newTypeReference
		]

		// ParseHelper
		cls.addField("_parseHelper")[
			primarySourceElement = cls
			addAnnotation(findTypeGlobally("com.google.inject.Inject").newAnnotationReference)
			addAnnotation(findTypeGlobally("org.eclipse.xtext.xbase.lib.Extension").newAnnotationReference)
			type = newTypeReference("org.eclipse.xtext.junit4.util.ParseHelper", rootType)
		]

		// Input sequence
		cls.addField("inputSequence")[
			primarySourceElement = cls
			type = StringBuffer.newTypeReference
		]

		// Root element
		cls.addField("root")[
			primarySourceElement = cls
			type = rootType
		]
	}
}
