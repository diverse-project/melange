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
package fr.inria.diverse.melange.lib.slicing.melange

import static extension fr.inria.diverse.melange.lib.slicing.melange.__SlicerAspect__.*

class MelangeFootprint
{
	public val java.util.Set<String> footprint = newHashSet
	private def addQN(String qn) {
		if(qn!==null && !qn.startsWith("java.") && !qn.startsWith("com.google.") && 
			!qn.startsWith("sun.") && !qn.startsWith("javax.") && !qn.startsWith("com.sun") &&
			!qn.startsWith("com.oracle") && !qn.startsWith("sunw."))
			return footprint.add(qn)
	} 
	
	val java.util.List<org.eclipse.xtext.common.types.JvmFormalParameter> inputJvmFormalParameter
	val java.util.List<org.eclipse.xtext.common.types.JvmTypeReference> inputJvmTypeReference
	val java.util.List<org.eclipse.xtext.xbase.XExpression> inputXExpression

	val org.eclipse.emf.ecore.EObject _root

	new(org.eclipse.emf.ecore.EObject metamodelRoot, java.util.List<org.eclipse.xtext.common.types.JvmFormalParameter> inputJvmFormalParameter,java.util.List<org.eclipse.xtext.common.types.JvmTypeReference> inputJvmTypeReference,java.util.List<org.eclipse.xtext.xbase.XExpression> inputXExpression){
		this.inputJvmFormalParameter = inputJvmFormalParameter
		this.inputJvmTypeReference = inputJvmTypeReference
		this.inputXExpression = inputXExpression
		if(metamodelRoot===null) throw new IllegalArgumentException
		this._root = metamodelRoot
	}

	def void slice(){
//		_root.feedOpposites
//		onStart
		inputJvmFormalParameter?.forEach[visitToAddClasses(this)]
		inputJvmTypeReference?.forEach[visitToAddClasses(this)]
		inputXExpression?.forEach[visitToAddClasses(this)]
		inputJvmFormalParameter?.forEach[visitToAddRelations(this)]
		inputJvmTypeReference?.forEach[visitToAddRelations(this)]
		inputXExpression?.forEach[visitToAddRelations(this)]
//		onEnd
	}

	def void onJvmTypeReferenceSliced(org.eclipse.xtext.common.types.JvmTypeReference type){
		addQN(type.getQualifiedName)
	}
	def void onJvmIdentifiableElementSliced(org.eclipse.xtext.common.types.JvmIdentifiableElement ident){
		addQN(ident.getQualifiedName)
	}
	def void onifSliced(org.eclipse.xtext.xbase.XIfExpression theSrc, org.eclipse.xtext.xbase.XExpression theTgt){
		 
	}
	def void onthenSliced(org.eclipse.xtext.xbase.XIfExpression theSrc, org.eclipse.xtext.xbase.XExpression theTgt){
		 
	}
	def void onelseSliced(org.eclipse.xtext.xbase.XIfExpression theSrc, org.eclipse.xtext.xbase.XExpression theTgt){
		 
	}
	def void onswitchSliced(org.eclipse.xtext.xbase.XSwitchExpression theSrc, org.eclipse.xtext.xbase.XExpression theTgt){
		 
	}
	def void oncasesSliced(org.eclipse.xtext.xbase.XSwitchExpression theSrc, org.eclipse.xtext.xbase.XCasePart theTgt){
		 
	}
	def void ondefaultSliced(org.eclipse.xtext.xbase.XSwitchExpression theSrc, org.eclipse.xtext.xbase.XExpression theTgt){
		 
	}
	def void ondeclaredParamSliced(org.eclipse.xtext.xbase.XSwitchExpression theSrc, org.eclipse.xtext.common.types.JvmFormalParameter theTgt){
		 
	}
	def void oncaseSliced(org.eclipse.xtext.xbase.XCasePart theSrc, org.eclipse.xtext.xbase.XExpression theTgt){
		 
	}
	def void onthenSliced(org.eclipse.xtext.xbase.XCasePart theSrc, org.eclipse.xtext.xbase.XExpression theTgt){
		 
	}
	def void ontypeGuardSliced(org.eclipse.xtext.xbase.XCasePart theSrc, org.eclipse.xtext.common.types.JvmTypeReference theTgt){
		 
	}
	def void onexpressionsSliced(org.eclipse.xtext.xbase.XBlockExpression theSrc, org.eclipse.xtext.xbase.XExpression theTgt){
		 
	}
	def void ontypeSliced(org.eclipse.xtext.xbase.XVariableDeclaration theSrc, org.eclipse.xtext.common.types.JvmTypeReference theTgt){
		 
	}
	def void onrightSliced(org.eclipse.xtext.xbase.XVariableDeclaration theSrc, org.eclipse.xtext.xbase.XExpression theTgt){
		 
	}
	def void onfeatureSliced(org.eclipse.xtext.xbase.XAbstractFeatureCall theSrc, org.eclipse.xtext.common.types.JvmIdentifiableElement theTgt){
		 
	}
	def void ontypeArgumentsSliced(org.eclipse.xtext.xbase.XAbstractFeatureCall theSrc, org.eclipse.xtext.common.types.JvmTypeReference theTgt){
		 
	}
	def void onimplicitReceiverSliced(org.eclipse.xtext.xbase.XAbstractFeatureCall theSrc, org.eclipse.xtext.xbase.XExpression theTgt){
		 
	}
	def void onimplicitFirstArgumentSliced(org.eclipse.xtext.xbase.XAbstractFeatureCall theSrc, org.eclipse.xtext.xbase.XExpression theTgt){
		 
	}
	def void onmemberCallTargetSliced(org.eclipse.xtext.xbase.XMemberFeatureCall theSrc, org.eclipse.xtext.xbase.XExpression theTgt){
		 
	}
	def void onmemberCallArgumentsSliced(org.eclipse.xtext.xbase.XMemberFeatureCall theSrc, org.eclipse.xtext.xbase.XExpression theTgt){
		 
	}
	def void onfeatureCallArgumentsSliced(org.eclipse.xtext.xbase.XFeatureCall theSrc, org.eclipse.xtext.xbase.XExpression theTgt){
		 
	}
	def void onconstructorSliced(org.eclipse.xtext.xbase.XConstructorCall theSrc, org.eclipse.xtext.common.types.JvmConstructor theTgt){
		 
	}
	def void onargumentsSliced(org.eclipse.xtext.xbase.XConstructorCall theSrc, org.eclipse.xtext.xbase.XExpression theTgt){
		 
	}
	def void ontypeArgumentsSliced(org.eclipse.xtext.xbase.XConstructorCall theSrc, org.eclipse.xtext.common.types.JvmTypeReference theTgt){
		 
	}
	def void onelementsSliced(org.eclipse.xtext.xbase.XCollectionLiteral theSrc, org.eclipse.xtext.xbase.XExpression theTgt){
		 
	}
	def void ondeclaredFormalParametersSliced(org.eclipse.xtext.xbase.XClosure theSrc, org.eclipse.xtext.common.types.JvmFormalParameter theTgt){
		 
	}
	def void onexpressionSliced(org.eclipse.xtext.xbase.XClosure theSrc, org.eclipse.xtext.xbase.XExpression theTgt){
		 
	}
	def void onimplicitFormalParametersSliced(org.eclipse.xtext.xbase.XClosure theSrc, org.eclipse.xtext.common.types.JvmFormalParameter theTgt){
		 
	}
	def void ontypeSliced(org.eclipse.xtext.xbase.XCastedExpression theSrc, org.eclipse.xtext.common.types.JvmTypeReference theTgt){
		 
	}
	def void ontargetSliced(org.eclipse.xtext.xbase.XCastedExpression theSrc, org.eclipse.xtext.xbase.XExpression theTgt){
		 
	}
	def void onleftOperandSliced(org.eclipse.xtext.xbase.XBinaryOperation theSrc, org.eclipse.xtext.xbase.XExpression theTgt){
		 
	}
	def void onrightOperandSliced(org.eclipse.xtext.xbase.XBinaryOperation theSrc, org.eclipse.xtext.xbase.XExpression theTgt){
		 
	}
	def void onoperandSliced(org.eclipse.xtext.xbase.XUnaryOperation theSrc, org.eclipse.xtext.xbase.XExpression theTgt){
		 
	}
	def void onoperandSliced(org.eclipse.xtext.xbase.XPostfixOperation theSrc, org.eclipse.xtext.xbase.XExpression theTgt){
		 
	}
	def void onforExpressionSliced(org.eclipse.xtext.xbase.XForLoopExpression theSrc, org.eclipse.xtext.xbase.XExpression theTgt){
		 
	}
	def void oneachExpressionSliced(org.eclipse.xtext.xbase.XForLoopExpression theSrc, org.eclipse.xtext.xbase.XExpression theTgt){
		 
	}
	def void ondeclaredParamSliced(org.eclipse.xtext.xbase.XForLoopExpression theSrc, org.eclipse.xtext.common.types.JvmFormalParameter theTgt){
		 
	}
	def void oneachExpressionSliced(org.eclipse.xtext.xbase.XBasicForLoopExpression theSrc, org.eclipse.xtext.xbase.XExpression theTgt){
		 
	}
	def void onexpressionSliced(org.eclipse.xtext.xbase.XBasicForLoopExpression theSrc, org.eclipse.xtext.xbase.XExpression theTgt){
		 
	}
	def void oninitExpressionsSliced(org.eclipse.xtext.xbase.XBasicForLoopExpression theSrc, org.eclipse.xtext.xbase.XExpression theTgt){
		 
	}
	def void onupdateExpressionsSliced(org.eclipse.xtext.xbase.XBasicForLoopExpression theSrc, org.eclipse.xtext.xbase.XExpression theTgt){
		 
	}
	def void onpredicateSliced(org.eclipse.xtext.xbase.XAbstractWhileExpression theSrc, org.eclipse.xtext.xbase.XExpression theTgt){
		 
	}
	def void onbodySliced(org.eclipse.xtext.xbase.XAbstractWhileExpression theSrc, org.eclipse.xtext.xbase.XExpression theTgt){
		 
	}
	def void ontypeSliced(org.eclipse.xtext.xbase.XTypeLiteral theSrc, org.eclipse.xtext.common.types.JvmType theTgt){
		 
	}
	def void ontypeSliced(org.eclipse.xtext.xbase.XInstanceOfExpression theSrc, org.eclipse.xtext.common.types.JvmTypeReference theTgt){
		 
	}
	def void onexpressionSliced(org.eclipse.xtext.xbase.XInstanceOfExpression theSrc, org.eclipse.xtext.xbase.XExpression theTgt){
		 
	}
	def void onexpressionSliced(org.eclipse.xtext.xbase.XThrowExpression theSrc, org.eclipse.xtext.xbase.XExpression theTgt){
		 
	}
	def void onexpressionSliced(org.eclipse.xtext.xbase.XTryCatchFinallyExpression theSrc, org.eclipse.xtext.xbase.XExpression theTgt){
		 
	}
	def void onfinallyExpressionSliced(org.eclipse.xtext.xbase.XTryCatchFinallyExpression theSrc, org.eclipse.xtext.xbase.XExpression theTgt){
		 
	}
	def void oncatchClausesSliced(org.eclipse.xtext.xbase.XTryCatchFinallyExpression theSrc, org.eclipse.xtext.xbase.XCatchClause theTgt){
		 
	}
	def void onexpressionSliced(org.eclipse.xtext.xbase.XCatchClause theSrc, org.eclipse.xtext.xbase.XExpression theTgt){
		 
	}
	def void ondeclaredParamSliced(org.eclipse.xtext.xbase.XCatchClause theSrc, org.eclipse.xtext.common.types.JvmFormalParameter theTgt){
		 
	}
	def void onassignableSliced(org.eclipse.xtext.xbase.XAssignment theSrc, org.eclipse.xtext.xbase.XExpression theTgt){
		 
	}
	def void onvalueSliced(org.eclipse.xtext.xbase.XAssignment theSrc, org.eclipse.xtext.xbase.XExpression theTgt){
		 
	}
	def void onexpressionSliced(org.eclipse.xtext.xbase.XReturnExpression theSrc, org.eclipse.xtext.xbase.XExpression theTgt){
		 
	}
	def void onexpressionSliced(org.eclipse.xtext.xbase.XSynchronizedExpression theSrc, org.eclipse.xtext.xbase.XExpression theTgt){
		 
	}
	def void onparamSliced(org.eclipse.xtext.xbase.XSynchronizedExpression theSrc, org.eclipse.xtext.xbase.XExpression theTgt){
		 
	}
	def void onarrayTypeSliced(org.eclipse.xtext.common.types.JvmComponentType theSrc, org.eclipse.xtext.common.types.JvmArrayType theTgt){
		 
	}
	def void oncomponentTypeSliced(org.eclipse.xtext.common.types.JvmArrayType theSrc, org.eclipse.xtext.common.types.JvmComponentType theTgt){
		 
	}
	def void onsuperTypesSliced(org.eclipse.xtext.common.types.JvmDeclaredType theSrc, org.eclipse.xtext.common.types.JvmTypeReference theTgt){
		 
	}
	def void onmembersSliced(org.eclipse.xtext.common.types.JvmDeclaredType theSrc, org.eclipse.xtext.common.types.JvmMember theTgt){
		 
	}
	def void ondeclaratorSliced(org.eclipse.xtext.common.types.JvmTypeParameter theSrc, org.eclipse.xtext.common.types.JvmTypeParameterDeclarator theTgt){
		 
	}
	def void ontypeParametersSliced(org.eclipse.xtext.common.types.JvmTypeParameterDeclarator theSrc, org.eclipse.xtext.common.types.JvmTypeParameter theTgt){
		 
	}
	def void onconstraintsSliced(org.eclipse.xtext.common.types.JvmConstraintOwner theSrc, org.eclipse.xtext.common.types.JvmTypeConstraint theTgt){
		 
	}
	def void ontypeReferenceSliced(org.eclipse.xtext.common.types.JvmTypeConstraint theSrc, org.eclipse.xtext.common.types.JvmTypeReference theTgt){
		 
	}
	def void onownerSliced(org.eclipse.xtext.common.types.JvmTypeConstraint theSrc, org.eclipse.xtext.common.types.JvmConstraintOwner theTgt){
		 
	}
	def void onliteralsSliced(org.eclipse.xtext.common.types.JvmEnumerationType theSrc, org.eclipse.xtext.common.types.JvmEnumerationLiteral theTgt){
		 
	}
	def void onargumentsSliced(org.eclipse.xtext.common.types.JvmParameterizedTypeReference theSrc, org.eclipse.xtext.common.types.JvmTypeReference theTgt){
		 
	}
	def void ontypeSliced(org.eclipse.xtext.common.types.JvmParameterizedTypeReference theSrc, org.eclipse.xtext.common.types.JvmType theTgt){
		 
	}
	def void oncomponentTypeSliced(org.eclipse.xtext.common.types.JvmGenericArrayTypeReference theSrc, org.eclipse.xtext.common.types.JvmTypeReference theTgt){
		 
	}
	def void ontypeSliced(org.eclipse.xtext.common.types.JvmAnyTypeReference theSrc, org.eclipse.xtext.common.types.JvmType theTgt){
		 
	}
	def void ondeclaringTypeSliced(org.eclipse.xtext.common.types.JvmMember theSrc, org.eclipse.xtext.common.types.JvmDeclaredType theTgt){
		 
	}
	def void onlocalClassesSliced(org.eclipse.xtext.common.types.JvmFeature theSrc, org.eclipse.xtext.common.types.JvmGenericType theTgt){
		 
	}
	def void ontypeSliced(org.eclipse.xtext.common.types.JvmField theSrc, org.eclipse.xtext.common.types.JvmTypeReference theTgt){
		 
	}
	def void onparametersSliced(org.eclipse.xtext.common.types.JvmExecutable theSrc, org.eclipse.xtext.common.types.JvmFormalParameter theTgt){
		 
	}
	def void onexceptionsSliced(org.eclipse.xtext.common.types.JvmExecutable theSrc, org.eclipse.xtext.common.types.JvmTypeReference theTgt){
		 
	}
	def void onreturnTypeSliced(org.eclipse.xtext.common.types.JvmOperation theSrc, org.eclipse.xtext.common.types.JvmTypeReference theTgt){
		 
	}
	def void ondefaultValueSliced(org.eclipse.xtext.common.types.JvmOperation theSrc, org.eclipse.xtext.common.types.JvmAnnotationValue theTgt){
		 
	}
	def void onparameterTypeSliced(org.eclipse.xtext.common.types.JvmFormalParameter theSrc, org.eclipse.xtext.common.types.JvmTypeReference theTgt){
		 
	}
	def void onannotationsSliced(org.eclipse.xtext.common.types.JvmAnnotationTarget theSrc, org.eclipse.xtext.common.types.JvmAnnotationReference theTgt){
		 
	}
	def void onannotationSliced(org.eclipse.xtext.common.types.JvmAnnotationReference theSrc, org.eclipse.xtext.common.types.JvmAnnotationType theTgt){
		 
	}
	def void onexplicitValuesSliced(org.eclipse.xtext.common.types.JvmAnnotationReference theSrc, org.eclipse.xtext.common.types.JvmAnnotationValue theTgt){
		 
	}
	def void onoperationSliced(org.eclipse.xtext.common.types.JvmAnnotationValue theSrc, org.eclipse.xtext.common.types.JvmOperation theTgt){
		 
	}
	def void onvaluesSliced(org.eclipse.xtext.common.types.JvmTypeAnnotationValue theSrc, org.eclipse.xtext.common.types.JvmTypeReference theTgt){
		 
	}
	def void onvaluesSliced(org.eclipse.xtext.common.types.JvmAnnotationAnnotationValue theSrc, org.eclipse.xtext.common.types.JvmAnnotationReference theTgt){
		 
	}
	def void onvaluesSliced(org.eclipse.xtext.common.types.JvmEnumAnnotationValue theSrc, org.eclipse.xtext.common.types.JvmEnumerationLiteral theTgt){
		 
	}
	def void ondelegateSliced(org.eclipse.xtext.common.types.JvmDelegateTypeReference theSrc, org.eclipse.xtext.common.types.JvmTypeReference theTgt){
		 
	}
	def void onequivalentSliced(org.eclipse.xtext.common.types.JvmSpecializedTypeReference theSrc, org.eclipse.xtext.common.types.JvmTypeReference theTgt){
		 
	}
	def void ontypeSliced(org.eclipse.xtext.common.types.JvmCompoundTypeReference theSrc, org.eclipse.xtext.common.types.JvmType theTgt){
		 
	}
	def void onreferencesSliced(org.eclipse.xtext.common.types.JvmCompoundTypeReference theSrc, org.eclipse.xtext.common.types.JvmTypeReference theTgt){
		 
	}
	def void onouterSliced(org.eclipse.xtext.common.types.JvmInnerTypeReference theSrc, org.eclipse.xtext.common.types.JvmParameterizedTypeReference theTgt){
		 
	}

	protected def void onStart(){
	}

	protected def void onEnd(){
	}

	def void reinit() {
		_root.reinit
	}
}
