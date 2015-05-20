package org.autorefactor.ui;

import org.eclipse.jdt.core.IMethod;

public class MethodHierarchy {

	private IMethod method;
	
	private MethodHierarchy child;

	public IMethod getMethod() {
		return method;
	}

	public void setMethod(IMethod method) {
		this.method = method;
	}

	public MethodHierarchy getChild() {
		return child;
	}

	public void setChild(MethodHierarchy child) {
		this.child = child;
	}
}
