package fr.inria.diverse.melange.tools.xtext.testing

import java.lang.annotation.ElementType
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import java.lang.annotation.Target
import org.eclipse.xtend.lib.macro.AbstractMethodProcessor
import org.eclipse.xtend.lib.macro.Active
import org.eclipse.xtend.lib.macro.TransformationContext
import org.eclipse.xtend.lib.macro.declaration.MutableMethodDeclaration
import org.eclipse.xtend.lib.macro.declaration.Visibility
import org.junit.Test

@Target(ElementType::METHOD)
@Active(OnlyIfUIProcessor)
@Retention(RetentionPolicy.SOURCE)
annotation OnlyIfUI {}

class OnlyIfUIProcessor extends AbstractMethodProcessor
{
	override void doTransform(MutableMethodDeclaration method, extension TransformationContext context) {
		val ann = method.annotations.findFirst[
			annotationTypeDeclaration == org.junit.Test.newAnnotationReference.annotationTypeDeclaration
		]
		method.removeAnnotation(ann)
		method.declaringType.addMethod('''wrap«method.simpleName.toFirstUpper»''')[
			addAnnotation(Test.newAnnotationReference)
			visibility = Visibility.PUBLIC
			primarySourceElement = method
			body = '''
				// Ignore if UI isn't started
				try {
					org.eclipse.ui.PlatformUI.getWorkbench() ;
				} catch (Throwable t) {
					org.junit.Assume.assumeNoException(t) ;
				}
				
				«method.simpleName»() ;
			'''
		]
	}
}
