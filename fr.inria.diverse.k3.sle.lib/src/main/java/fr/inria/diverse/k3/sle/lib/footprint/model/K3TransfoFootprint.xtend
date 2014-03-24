package fr.inria.diverse.k3.sle.lib.footprint.model

import java.util.List
import java.util.Set
import org.eclipse.xtext.common.types.JvmFormalParameter
import org.eclipse.xtext.common.types.JvmIdentifiableElement
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.xbase.XExpression
import static extension fr.inria.diverse.k3.sle.lib.footprint.model.__SlicerAspect__.*


class K3TransfoFootprint{

	public val Set<String> footprint = newHashSet
	public val List<String> pkgs = newArrayList
	private def addQN(String qn) {
		if(qn!=null && !qn.startsWith("java.") && !qn.startsWith("com.google.") &&
			!qn.startsWith("sun.") && !qn.startsWith("javax.") && !qn.startsWith("com.sun") &&
			!qn.startsWith("com.oracle") && !qn.startsWith("sunw."))
			footprint.add(qn)
	}

	val List<JvmFormalParameter> inputJvmFormalParameter
	val List<JvmTypeReference> inputJvmTypeReference
	val List<XExpression> inputXExpression

	new(List<JvmFormalParameter> inputJvmFormalParameter,List<JvmTypeReference> inputJvmTypeReference,List<XExpression> inputXExpression){
		this.inputJvmFormalParameter = inputJvmFormalParameter
		this.inputJvmTypeReference = inputJvmTypeReference
		this.inputXExpression = inputXExpression
	}

	def void slice(){
		onStart
		inputJvmFormalParameter?.forEach[visitToAddClasses(this)]
		inputJvmTypeReference?.forEach[visitToAddClasses(this)]
		inputXExpression?.forEach[visitToAddClasses(this)]
		inputJvmFormalParameter?.forEach[visitToAddRelations(this)]
		inputJvmTypeReference?.forEach[visitToAddRelations(this)]
		inputXExpression?.forEach[visitToAddRelations(this)]
		onEnd
	}

	def void onJvmTypeReferenceSliced(JvmTypeReference type){
		addQN(type.getQualifiedName)
	}
	def void onJvmIdentifiableElementSliced(JvmIdentifiableElement ident){
		addQN(ident.getQualifiedName)
	}

	protected def void onStart(){
	}

	protected def void onEnd(){
	}

}
