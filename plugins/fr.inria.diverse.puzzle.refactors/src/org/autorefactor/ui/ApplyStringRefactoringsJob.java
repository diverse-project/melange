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
import java.util.Iterator;
import java.util.List;

import org.autorefactor.AutoRefactorPlugin;
import org.autorefactor.refactoring.JavaProjectOptions;
import org.autorefactor.refactoring.RefactoringRule;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.ASTVisitor;

/**
 * Eclipse job that applies the provided refactoring rules in background.
 * Several such jobs might be started and run in parallel to form a worker pool,
 * with all workers accepting work items ({@link RefactoringUnit}) from a queue provided by the partitioner
 * ({@link PrepareApplyRefactoringsJob}).
 */
public class ApplyStringRefactoringsJob {

    private final List<RefactoringRule> refactoringRulesToApply;
    private final RefactoringUnit baseRefactoringUnit;
    private final RefactoringUnit extensionRefactoringUnit;
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
        System.out.println("RUNNING");
        this.baseRefactoringUnit = baseRefactoringUnit;
        this.extensionRefactoringUnit = extensionRefactoringUnit;
        this.refactoringRulesToApply = refactoringRulesToApply;
        this.patterns = patterns;
        this.morePatterns = morePatterns;
        this.targetFolderAspects = targetFolderAspects;
        this.targetProject = targetProject;
    }

    /** {@inheritDoc} */
    protected IStatus run(IProgressMonitor monitor) {
        try {
        	System.out.println("protected IStatus run(IProgressMonitor monitor)");
            return run0(monitor);
        } catch (Exception e) {
            final String msg = "Error while applying refactorings.\n\n"
                    + "Please look at the Eclipse workspace logs and "
                    + "report the stacktrace to the AutoRefactor project.\n"
                    + "Please provide sample java code that triggers the error.\n\n";
            return new Status(IStatus.ERROR, AutoRefactorPlugin.PLUGIN_ID, msg, e);
        }
    }

    private IStatus run0(IProgressMonitor monitor) throws Exception {

        final int startSize = 2;
        monitor.beginTask("", startSize);
        try {
        	
        	if (monitor.isCanceled()) {
                return Status.CANCEL_STATUS;
            }
        	
        	ArrayList<RefactoringPatternVO> _patterns = new ArrayList<RefactoringPatternVO>();
        	for (RefactoringPatternVO refactoringPatternVO : patterns) {
				_patterns.add(refactoringPatternVO);
			}
        	patternBasedFileRefactoringBatch(targetFolderAspects, _patterns);
        	
        	ArrayList<RefactoringPatternVO> _MorePatterns = new ArrayList<RefactoringPatternVO>();
        	for (RefactoringPatternVO refactoringPatternVO : morePatterns) {
        		System.out.println("Patrones de la discordia: " + refactoringPatternVO.getSourcePattern() + ".." + refactoringPatternVO.getTargetPattern());
        		_MorePatterns.add(refactoringPatternVO);
			}
        	patternBasedFileRefactoringBatch(targetFolderAspects, _MorePatterns);
        	
        	targetProject.refreshLocal(IResource.DEPTH_INFINITE, null);
            
        } finally {
            monitor.done();
        }
        return Status.OK_STATUS;
    }
    
    public void patternBasedFileRefactoringBatch(File file, ArrayList<RefactoringPatternVO> _patterns) throws IOException{
		if(!file.isDirectory()){
			if(file.getName().endsWith(".java")){
				String newContent = "";
				BufferedReader br = new BufferedReader(new FileReader(file));
				String line = br.readLine();

		        while (line != null) {
		        	newContent = newContent + line + "\n";
					line = br.readLine();
		        }
		        br.close();
		        
	        	for(RefactoringPatternVO pattern : _patterns){
					 newContent = newContent.replace(pattern.getSourcePattern(), pattern.getTargetPattern()); 
				}
				
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
    

    private static void resetParser(ICompilationUnit cu, ASTParser parser, JavaProjectOptions options) {
        parser.setSource(cu);
        parser.setResolveBindings(true);
        parser.setCompilerOptions(options.getCompilerOptions());
    }

    private String getPossibleCulprits(int nbLoopsWithSameVisitors, List<ASTVisitor> lastLoopVisitors) {
        if (nbLoopsWithSameVisitors < 100 || lastLoopVisitors.isEmpty()) {
            return "";
        }
        final StringBuilder sb = new StringBuilder(" Possible culprit ASTVisitor classes are: ");
        final Iterator<ASTVisitor> iter = lastLoopVisitors.iterator();
        sb.append(iter.next().getClass().getName());
        while (iter.hasNext()) {
            sb.append(", ").append(iter.next().getClass().getName());
        }
        return sb.toString();
    }
}
