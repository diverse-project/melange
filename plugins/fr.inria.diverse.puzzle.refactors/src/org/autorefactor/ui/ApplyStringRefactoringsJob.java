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

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import org.autorefactor.refactoring.RefactoringRule;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

/**
 * Eclipse job that applies the provided refactoring rules in background.
 * Several such jobs might be started and run in parallel to form a worker pool,
 * with all workers accepting work items ({@link RefactoringUnit}) from a queue provided by the partitioner
 * ({@link PrepareApplyRefactoringsJob}).
 */
public class ApplyStringRefactoringsJob {

    private ArrayList<RefactoringPatternVO> patterns;
    private ArrayList<RefactoringPatternVO> morePatterns;
    private final File targetFolderAspects;
    private final IProject targetProject;
    
    /**
     * Builds an instance of this class.
     *
     * @param refactoringUnits the units to automatically refactor
     * @param refactoringRulesToApply the refactorings to apply
     */
    public ApplyStringRefactoringsJob(
    		RefactoringUnit baseRefactoringUnit, RefactoringUnit extensionRefactoringUnit, 
    		List<RefactoringRule> refactoringRulesToApply, ArrayList<RefactoringPatternVO> patterns, ArrayList<RefactoringPatternVO> morePatterns,
    		File targetFolderAspects, IProject targetProject) {
        this.patterns = patterns;
        this.morePatterns = morePatterns;
        this.targetFolderAspects = targetFolderAspects;
        this.targetProject = targetProject;
    }

    /** {@inheritDoc} */
    protected IStatus run(IProgressMonitor monitor) {
        try {
        	if (monitor.isCanceled()) 
                return Status.CANCEL_STATUS;
        	
        	ArrayList<RefactoringPatternVO> _patterns = new ArrayList<RefactoringPatternVO>();
        	for (RefactoringPatternVO refactoringPatternVO : patterns) {
				_patterns.add(refactoringPatternVO);
			}
        	patternBasedFileRefactoringBatch(targetFolderAspects, _patterns);
        	
        	ArrayList<RefactoringPatternVO> _MorePatterns = new ArrayList<RefactoringPatternVO>();
        	if(morePatterns != null){
        		for (RefactoringPatternVO refactoringPatternVO : morePatterns) {
            		_MorePatterns.add(refactoringPatternVO);
    			}
        	}
        	patternBasedFileRefactoringBatch(targetFolderAspects, _MorePatterns);
        	targetProject.refreshLocal(IResource.DEPTH_INFINITE, null);
            
        } catch (Exception e) {
			e.printStackTrace();
		} finally {
            monitor.done();
        }
        return Status.OK_STATUS;
    }
    
    private void patternBasedFileRefactoringBatch(File file, ArrayList<RefactoringPatternVO> _patterns) throws IOException{
		if(!file.isDirectory()){
			if(file.getName().endsWith(".java")){
				String newContent = "";
				BufferedReader br = new BufferedReader(new FileReader(file));
				String line = br.readLine();

		        while (line != null) {
		        	for(RefactoringPatternVO pattern : _patterns){
		        		if(pattern.getSourcePattern().contains("(\\s\\w+)")){
		        			if(!line.matches(pattern.getPivotPattern()) && !line.contains("Aspect"))
		        				line = line.replaceAll(pattern.getSourcePattern(), pattern.getTargetPattern());
		        		}
		        		else
		        			line = line.replace(pattern.getSourcePattern(), pattern.getTargetPattern()); 
		        	}
		        	
		        	newContent = newContent + line + "\n";
					line = br.readLine();
		        }
		        br.close();
		        
				PrintWriter writer = new PrintWriter(file);
				writer.print(newContent);
				writer.close();
			}
		}
		else{
			File[] files = file.listFiles();
			for(File _file : files){
				patternBasedFileRefactoringBatch(_file, _patterns);
			}
		}
	}
}
