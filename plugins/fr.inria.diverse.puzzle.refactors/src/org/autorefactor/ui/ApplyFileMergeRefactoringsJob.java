/*
 * AutoRefactor - Eclipse plugin to automatically refactor Java code bases.
 *
 * Copyright (C) 2014-2015 Jean-Noël Rouvignac - initial API and implementation
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program under LICENSE-GNUGPL.  If not, see
 * <http://www.gnu.org/licenses/>.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution under LICENSE-ECLIPSE, and is
 * available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.autorefactor.ui;

import java.io.File;
import java.util.ArrayList;

import org.autorefactor.AutoRefactorPlugin;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IField;
import org.eclipse.jdt.core.IImportDeclaration;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.JavaModelException;

/**
 * Eclipse job that applies the provided refactoring rules in background.
 * Several such jobs might be started and run in parallel to form a worker pool,
 * with all workers accepting work items ({@link RefactoringUnit}) from a queue provided by the partitioner
 * ({@link PrepareApplyRefactoringsJob}).
 */
public class ApplyFileMergeRefactoringsJob {

    private final IProject targetProject;
    private final IJavaElement mergedPropertiesJavaElement;
    private final ArrayList<IJavaElement> javaElementsToMerge;
    
    /**
     * Builds an instance of this class.
     *
     * @param refactoringUnits the units to automatically refactor
     * @param refactoringRulesToApply the refactorings to apply
     */
    public ApplyFileMergeRefactoringsJob(IJavaElement mergedPropertiesJavaElement,
    		ArrayList<IJavaElement> javaElementsToMerge, File targetFolderAspects, IProject targetProject) {
    	
    	this.mergedPropertiesJavaElement = mergedPropertiesJavaElement;
    	this.javaElementsToMerge = javaElementsToMerge;
        this.targetProject = targetProject;
    }

    /**
     * Executes the refactoring according to the information stored in the attributes/
     * @param monitor ProgressMonitor
     * @return
     */
    protected IStatus run(IProgressMonitor monitor) {
        try {
        	if (monitor.isCanceled()) {
                return Status.CANCEL_STATUS;
            }
        	// Performing the merge of the properties files *.* 
        	ICompilationUnit mergedPropertiesCompilationUnit = (ICompilationUnit) this.mergedPropertiesJavaElement;
        	for(IJavaElement _currentJavaElement : this.javaElementsToMerge){
        		ICompilationUnit currentPropertiesToMergeCompilationUnit = (ICompilationUnit) _currentJavaElement;
        		
        		if(currentPropertiesToMergeCompilationUnit.findPrimaryType() != null){
        			for(IField _field : currentPropertiesToMergeCompilationUnit.findPrimaryType().getFields()){
//        				IField _existingField = currentPropertiesToMergeCompilationUnit.findPrimaryType().getField(_field.getElementName());
//        				if(!_existingField.exists())
        				try{
        					mergedPropertiesCompilationUnit.findPrimaryType().createField(_field.getSource(), null, false, monitor);
        				}catch(JavaModelException e){
        					// coucou
        				}
        					
            		}
            		for(IMethod _method : currentPropertiesToMergeCompilationUnit.findPrimaryType().getMethods()){
            			try{
            				mergedPropertiesCompilationUnit.findPrimaryType().createMethod(_method.getSource(), null, false, monitor);
            			}catch(Exception e){
            				// coucou
            			}
            		}
            		for(IImportDeclaration _import : currentPropertiesToMergeCompilationUnit.getImports()){
                		if(!mergedPropertiesCompilationUnit.getImport(_import.getElementName()).exists()){
                			mergedPropertiesCompilationUnit.createImport(_import.getElementName(), null, monitor);
                		}
                	}
        		}
        	}
        	targetProject.refreshLocal(IResource.DEPTH_INFINITE, null);
        } catch (Exception e) {
        	e.printStackTrace();
            return new Status(IStatus.ERROR, AutoRefactorPlugin.PLUGIN_ID, e.getMessage(), e);
        } finally {
            monitor.done();
        }
        return Status.OK_STATUS;
    }    
}