package org.autorefactor.refactoring.rules;

import static org.autorefactor.refactoring.ASTHelper.VISIT_SUBTREE;

import org.eclipse.jdt.core.dom.MethodDeclaration;

public class RemoveMethod extends AbstractRefactoringRule{

	private String methodName;
	
	public void setMethodName(String methodName){
		this.methodName = methodName;
	}
	
	@Override
	public boolean visit(MethodDeclaration node){
		if(node.getName().toString().equals(methodName)){
			 ctx.getRefactorings().remove(node);
		}
        return VISIT_SUBTREE;
	}
}
