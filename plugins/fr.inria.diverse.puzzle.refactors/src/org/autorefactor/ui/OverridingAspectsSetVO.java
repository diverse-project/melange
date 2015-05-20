package org.autorefactor.ui;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.autorefactor.refactoring.RefactoringRule;
import org.eclipse.core.resources.IProject;

public class OverridingAspectsSetVO {

	private RefactoringUnit baseRefactoringUnit;
	private List<RefactoringUnit> extensionRefactoringUnits;
	private RefactoringUnit mergedRefactoringUnit;
	private List<RefactoringRule> refactoringRulesToApply;
	private File targetFolderAspects;
	private IProject targetProject;
	private String baseClass;
	private List<String> extensionClass;
	
	public OverridingAspectsSetVO(RefactoringUnit baseRefactoringUnit, RefactoringUnit mergedRefactoringUnit, 
			List<RefactoringRule> refactoringRulesToApply, File targetFolderAspects, IProject targetProject, String baseClass){
		this.baseRefactoringUnit = baseRefactoringUnit;
		this.extensionRefactoringUnits = new ArrayList<RefactoringUnit>();
		this.mergedRefactoringUnit = mergedRefactoringUnit;
		this.refactoringRulesToApply = refactoringRulesToApply;
		this.targetFolderAspects = targetFolderAspects;
		this.targetProject = targetProject;
		this.baseClass = baseClass;
		this.extensionClass = new ArrayList<String>();
	}

	public RefactoringUnit getBaseRefactoringUnit() {
		return baseRefactoringUnit;
	}

	public void setBaseRefactoringUnit(RefactoringUnit baseRefactoringUnit) {
		this.baseRefactoringUnit = baseRefactoringUnit;
	}

	public List<RefactoringUnit>  getExtensionRefactoringUnit() {
		return extensionRefactoringUnits;
	}

	public void setExtensionRefactoringUnit(List<RefactoringUnit>  extensionRefactoringUnits) {
		this.extensionRefactoringUnits = extensionRefactoringUnits;
	}

	public RefactoringUnit getMergedRefactoringUnit() {
		return mergedRefactoringUnit;
	}

	public void setMergedRefactoringUnit(RefactoringUnit mergedRefactoringUnit) {
		this.mergedRefactoringUnit = mergedRefactoringUnit;
	}

	public List<RefactoringRule> getRefactoringRulesToApply() {
		return refactoringRulesToApply;
	}

	public void setRefactoringRulesToApply(
			List<RefactoringRule> refactoringRulesToApply) {
		this.refactoringRulesToApply = refactoringRulesToApply;
	}

	public File getTargetFolderAspects() {
		return targetFolderAspects;
	}

	public void setTargetFolderAspects(File targetFolderAspects) {
		this.targetFolderAspects = targetFolderAspects;
	}

	public IProject getTargetProject() {
		return targetProject;
	}

	public void setTargetProject(IProject targetProject) {
		this.targetProject = targetProject;
	}

	public String getBaseClass() {
		return baseClass;
	}

	public void setBaseClass(String baseClass) {
		this.baseClass = baseClass;
	}

	public List<String> getExtensionClass() {
		return extensionClass;
	}

	public void setExtensionClass(List<String> extensionClass) {
		this.extensionClass = extensionClass;
	}
}
