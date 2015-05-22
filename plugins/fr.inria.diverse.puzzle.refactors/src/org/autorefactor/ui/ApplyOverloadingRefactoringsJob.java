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

import static org.autorefactor.refactoring.ASTHelper.getFileName;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.autorefactor.AutoRefactorPlugin;
import org.autorefactor.refactoring.JavaProjectOptions;
import org.autorefactor.refactoring.RefactoringRule;
import org.autorefactor.refactoring.Refactorings;
import org.autorefactor.refactoring.rules.AggregateASTVisitor;
import org.autorefactor.refactoring.rules.RefactoringContext;
import org.autorefactor.refactoring.rules.RemoveMethod;
import org.autorefactor.util.IllegalStateException;
import org.eclipse.core.filebuffers.FileBuffers;
import org.eclipse.core.filebuffers.ITextFileBuffer;
import org.eclipse.core.filebuffers.ITextFileBufferManager;
import org.eclipse.core.filebuffers.LocationKind;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jdt.core.IAnnotation;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IImportDeclaration;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jface.text.IDocument;

/**
 * Eclipse job that applies the provided refactoring rules in background.
 * Several such jobs might be started and run in parallel to form a worker pool,
 * with all workers accepting work items ({@link RefactoringUnit}) from a queue provided by the partitioner
 * ({@link PrepareApplyRefactoringsJob}).
 */
public class ApplyOverloadingRefactoringsJob {

    private final List<RefactoringRule> refactoringRulesToApply;
    private final RefactoringUnit baseRefactoringUnit;
    private final RefactoringUnit extensionRefactoringUnit;
    private final IProject targetProject;
    
    /**
     * Builds an instance of this class.
     *
     * @param refactoringUnits the units to automatically refactor
     * @param refactoringRulesToApply the refactorings to apply
     */
    public ApplyOverloadingRefactoringsJob(
    		RefactoringUnit baseRefactoringUnit, RefactoringUnit extensionRefactoringUnit, 
    		List<RefactoringRule> refactoringRulesToApply, ArrayList<RefactoringPatternVO> patterns, 
    		File targetFolderAspects, IProject targetProject) {
        this.baseRefactoringUnit = baseRefactoringUnit;
        this.extensionRefactoringUnit = extensionRefactoringUnit;
        this.refactoringRulesToApply = refactoringRulesToApply;
        this.targetProject = targetProject;
    }

    /** {@inheritDoc} 
     * @param methodHierarchy */
    protected IStatus run(IProgressMonitor monitor) {
        try {
            return run0(monitor);
        } catch (Exception e) {
        	e.printStackTrace();
            return new Status(IStatus.ERROR, AutoRefactorPlugin.PLUGIN_ID, e.getMessage(), e);
        }
    }

    private IStatus run0(IProgressMonitor monitor) throws Exception {

        final int startSize = 2;
        monitor.beginTask("", startSize);
        try {
        	if (monitor.isCanceled()) {
                return Status.CANCEL_STATUS;
            }
        	
        	if(extensionRefactoringUnit != null && baseRefactoringUnit != null){
        		ICompilationUnit extensionCompilationUnit = extensionRefactoringUnit.getCompilationUnit();
        		ICompilationUnit baseCompilationUnit = baseRefactoringUnit.getCompilationUnit();
            	IType primaryType = extensionCompilationUnit.findPrimaryType();
            	
//            	System.out.println("ApplyOverloadingRefactoringsJob.run0 " + "extension: " + extensionCompilationUnit.getElementName()
//            			+ " base: " + baseCompilationUnit.getElementName());
//            	System.out.println("ApplyOverloadingRefactoringsJob.run0 " + "extension: " + extensionCompilationUnit.getJavaProject().getElementName()
//            			+ " base: " + baseCompilationUnit.getJavaProject().getElementName());
//            	System.out.println("ApplyOverloadingRefactoringsJob.run0 " + "base SRC: " + baseCompilationUnit.getSource());
            	
//            	for(IMethod _method : baseRefactoringUnit.getCompilationUnit().findPrimaryType().getMethods()){
//            		System.out.println("_baseMethod: " + _method.getElementName());
//            	}
            	
            	for(IMethod _overridingMethod : primaryType.getMethods()){
//            		System.out.println("_overridingMethod " + _overridingMethod.getElementName());
            		
            		IAnnotation overrideAnnotation = null;
            		for(IAnnotation _annotation : _overridingMethod.getAnnotations()){
            			if(_annotation.getElementName().equals("OverrideRequiredAspectMethod"))
            				overrideAnnotation = _annotation;
            		}
            		
            		if(overrideAnnotation != null){
            			IMethod realOverridingMethod = null;
            			
            			for(IMethod _overridingMethod2 : primaryType.getMethods()){
            				if(_overridingMethod2.getElementName().equals("_privk3_" + _overridingMethod.getElementName()))
            					realOverridingMethod = _overridingMethod2;
            			}
            			
                    	IMethod toRemove = null;
                    	
                    	for(IMethod _method : baseRefactoringUnit.getCompilationUnit().findPrimaryType().getMethods()){
                    		if(_method.getElementName().equals(realOverridingMethod.getElementName())
                    				/*&& _method.getNumberOfParameters() == realOverridingMethod.getNumberOfParameters()
                    					&& areParametersEquivalent(_method.getParameterTypes(), realOverridingMethod.getParameterTypes())*/){
                    			toRemove = _method;
                    		}
                    	}
                    	
                    	IMethod oldOriginal = null;
                    	
                    	for(IMethod _method : baseRefactoringUnit.getCompilationUnit().findPrimaryType().getMethods()){
                    		if(_method.getElementName().endsWith("_original_" + _overridingMethod.getElementName())
                    				/*&& _method.getNumberOfParameters() == _overridingMethod.getNumberOfParameters()
                    					&& areParametersEquivalent(_method.getParameterTypes(), _overridingMethod.getParameterTypes())*/){
                    			oldOriginal = _method;
                    		}
                    	}
                    	
                    	if(toRemove != null && oldOriginal == null){
//                    		System.out.println("overriding original");
//                    		System.out.println("oldOriginal: " + realOverridingMethod.getSource());
//                    		System.out.println("toRemove: " + toRemove.getSource());
                    		overrideRequiredMethod(baseRefactoringUnit, toRemove, realOverridingMethod, monitor);
                    	}
                    	else if(toRemove != null && oldOriginal != null){
//                    		System.out.println("pushing original");
//                    		System.out.println("oldOriginal: " + oldOriginal.getSource());
//                    		System.out.println("toRemove: " + toRemove.getSource());
                    		ArrayList<IMethod> originalMethods = getAllOriginalMethods(baseRefactoringUnit, _overridingMethod.getElementName());
                        	overrideRequiredMethodOriginal(baseRefactoringUnit, toRemove, realOverridingMethod, originalMethods.size(), monitor);
                    	}
                    	targetProject.refreshLocal(IResource.DEPTH_INFINITE, monitor);
            		}
            	}
            	
            	// Adding the additional methods included by the extension
            	for(IMethod _method : extensionRefactoringUnit.getCompilationUnit().findPrimaryType().getMethods()){
            		IAnnotation extensionAnnotation = null;
            		for(IAnnotation _annotation : _method.getAnnotations()){
            			if(_annotation.getElementName().equals("AddExtensionMethod"))
            				extensionAnnotation = _annotation;
            		}
            		if(extensionAnnotation != null){
            			IMethod baseMethod = getMethodByName(baseRefactoringUnit, _method.getElementName());
                		if(baseMethod == null || (baseMethod != null &&!baseMethod.exists())){
            				baseRefactoringUnit.getCompilationUnit().findPrimaryType().createMethod(_method.getSource(), null, true, monitor);
            				
            				IMethod privk3baseMethod = getMethodByName(extensionRefactoringUnit, "_privk3_" + _method.getElementName());
                    		if(privk3baseMethod != null){
                				baseRefactoringUnit.getCompilationUnit().findPrimaryType().createMethod(privk3baseMethod.getSource(), null, true, monitor);
                    		}
                		}
            		}
            	}
            	
            	// Adding the imports needed by the injected code
            	for(IImportDeclaration _import : extensionCompilationUnit.getImports()){
            		if(!baseCompilationUnit.getImport(_import.getElementName()).exists()){
            			baseCompilationUnit.createImport(_import.getElementName(), null, monitor);
            		}
            	}
            	
//            	System.out.println("ApplyOverloadingRefactoringsJob.run0.after " + "extension: " + extensionCompilationUnit.getElementName()
//            			+ " base: " + baseCompilationUnit.getElementName());
//            	System.out.println("ApplyOverloadingRefactoringsJob.run0.after " + "extension: " + extensionCompilationUnit.getJavaProject().getElementName()
//            			+ " base: " + baseCompilationUnit.getJavaProject().getElementName());
            	
//            	for(IMethod _method : baseRefactoringUnit.getCompilationUnit().findPrimaryType().getMethods()){
//            		System.out.println("_baseMethod: " + _method.getElementName());
//            	}
        	}
        } finally {
            monitor.done();
        }
        return Status.OK_STATUS;
    }

    private void overrideRequiredMethodOriginal(
			RefactoringUnit baseRefactoringUnit, IMethod baseMethod,
			IMethod extensionMethod, int legacyLevel, IProgressMonitor monitor) throws Exception {
    	
    	final ICompilationUnit baseCompilationUnit = baseRefactoringUnit.getCompilationUnit();
    	String baseName = extensionMethod.getElementName().replace("_privk3_", "");
    	final JavaProjectOptions options = baseRefactoringUnit.getOptions();
    	
    	// All current original methods go down!
    	int i = legacyLevel;
    	while(i > 0){
			pushMethod(i, baseName, baseCompilationUnit, options, monitor);
			i--;
    	}
    	
    	// The old base private is now the upper original
		IMethod _priv = getMethodByName(baseRefactoringUnit, baseMethod.getElementName());
		String privSource = _priv.getSource().replace("_original_", "_original__original_");
		privSource = privSource.replace("_privk3_", "_original_");
		privSource = privSource.replace("_original_" + baseName + "(_self,", "_original_" + baseName + "(_self_, _self,");
		baseCompilationUnit.findPrimaryType().createMethod(privSource, null, true, monitor);
		
		// The extension private is now the new base private 
		RemoveMethod removingOldPrivRule = ((RemoveMethod)this.refactoringRulesToApply.get(0));
		removingOldPrivRule.setMethodName(_priv.getElementName());
        final AggregateASTVisitor removingOldPrivRefactoring = new AggregateASTVisitor(refactoringRulesToApply);
        applyRefactoring(baseCompilationUnit, removingOldPrivRefactoring, options);
        
		String newPrivSource = extensionMethod.getSource();
		newPrivSource = newPrivSource.replace("_original_" + baseName + "(_self,", "_original_" + baseName + "(_self_, _self,");
		baseCompilationUnit.findPrimaryType().createMethod(newPrivSource, null, true, monitor);
	}

    private void pushMethod(int level, String baseName, ICompilationUnit baseCompilationUnit, JavaProjectOptions options, IProgressMonitor monitor) throws Exception{
    	String prefix = getPrefix(level);
		IMethod toPush = getMethodByName(baseRefactoringUnit, prefix + baseName);
//		System.out.println("baseRefactoringUnit, prefix + baseName: " + prefix + baseName);
//		System.out.println("toPush: " + toPush);
		String toPushName = toPush.getElementName();
		
		String toNewPushSource = toPush.getSource().replace("_original_" + baseName + "(_self,", "_original_" + baseName + "(_self_, _self,");
		toNewPushSource = toNewPushSource.replace("_original_", "_original__original_");
		baseCompilationUnit.findPrimaryType().createMethod(toNewPushSource, null, true, monitor);
		
		RemoveMethod rule = ((RemoveMethod)this.refactoringRulesToApply.get(0));
        rule.setMethodName(toPushName);
        final AggregateASTVisitor refactoring = new AggregateASTVisitor(refactoringRulesToApply);
        applyRefactoring(baseCompilationUnit, refactoring, options);
    }
    
	private IMethod getMethodByName(RefactoringUnit baseRefactoringUnit,
			String name) throws JavaModelException {
		for(IMethod _method : baseRefactoringUnit.getCompilationUnit().findPrimaryType().getMethods()){
			if(_method.getElementName().equals(name))
				return _method;
		}
		return null;
	}

	private String getPrefix(int i) {
		String answer = "";
		int count = i;
		while(count>0){
			answer += "_original_";
			count--;
		}
		return answer;
	}

	private ArrayList<IMethod> getAllOriginalMethods(
			RefactoringUnit baseRefactoringUnit, String baseMethodName) throws JavaModelException {
		ArrayList<IMethod> methods = new ArrayList<IMethod>();
		for(IMethod _method : baseRefactoringUnit.getCompilationUnit().findPrimaryType().getMethods()){
			if(_method.getElementName().endsWith("_original_" + baseMethodName)){
				methods.add(_method);
	    	}
		}
		return methods;
	}

	private boolean areParametersEquivalent(String[] baseParameters,
			String[] extensionParameters) {
    	
    	int i = 0;
    	for(String _parameter : baseParameters){
    		if(!_parameter.equals(extensionParameters[i])){
    			return false;
    		}
    		i++;
    	}
    	return true;
	}

	private void overrideRequiredMethod(RefactoringUnit baseRefactoringUnit,
    		IMethod baseMethod, IMethod extensionMethod, IProgressMonitor monitor){
    	 try {
             // Deleting the base method from the base compilation unit.
    		 String baseMethodSource = baseMethod.getSource();
    		 
    		 if(baseMethod.getSource() != null && extensionMethod.getSource() != null){
	        	 final JavaProjectOptions options = baseRefactoringUnit.getOptions();
	             final ICompilationUnit baseCompilationUnit = baseRefactoringUnit.getCompilationUnit();
	             RemoveMethod rule = ((RemoveMethod)this.refactoringRulesToApply.get(0));
	             rule.setMethodName(baseMethod.getElementName());
	             final AggregateASTVisitor refactoring = new AggregateASTVisitor(refactoringRulesToApply);
	             applyRefactoring(baseCompilationUnit, refactoring, options);
	             
	             // Creating the new method in the base compilation unit from the extension method.
	             String newSource = extensionMethod.getSource().replace("@OverrideRequiredAspectMethod", "");
	             String baseMethodName = baseMethod.getElementName().replace("_privk3_", "");
	             
	        	 newSource = newSource.replace("_original_" + baseMethodName + "(_self,", 
	            		 "_original_" + baseMethodName + "(_self_, _self,");
	             baseCompilationUnit.findPrimaryType().createMethod(newSource, null, true, monitor);
	             
	             String originalMethodSource = baseMethodSource;
	             if(!originalMethodSource.equals(newSource)){
	            	 originalMethodSource = baseMethodSource.replace("_privk3_", "_original_");
	                 baseCompilationUnit.findPrimaryType().createMethod(originalMethodSource, null, true, monitor);
	             }
    		 }
    	 }catch (Exception e) {
             // coucou! 
    		 e.printStackTrace();
         }
    }
    
    private void applyRefactoring(ICompilationUnit compilationUnit, AggregateASTVisitor refactoringToApply,
            JavaProjectOptions options) throws Exception {
        final ITextFileBufferManager bufferManager = FileBuffers.getTextFileBufferManager();
        final IPath path = compilationUnit.getPath();
        final LocationKind locationKind = LocationKind.NORMALIZE;
        try {
            bufferManager.connect(path, locationKind, null);
            final ITextFileBuffer textFileBuffer = bufferManager.getTextFileBuffer(path, locationKind);
            if (!textFileBuffer.isSynchronized()) {
                AutoRefactorPlugin.logError(
                    "File \"" + compilationUnit.getPath() + "\" is not synchronized with the file system."
                        + " Automated refactorings will not be applied to it.");
                return;
            }
            final IDocument document = textFileBuffer.getDocument();
            applyRefactoring(document, compilationUnit, refactoringToApply, options);
        } finally {
            bufferManager.disconnect(path, locationKind, null);
        }
    }

    /**
     * Applies the refactorings provided inside the {@link AggregateASTVisitor} to the provided
     * {@link ICompilationUnit}.
     *
     * @param document the document where the compilation unit comes from
     * @param compilationUnit the compilation unit to refactor
     * @param refactoring the {@link AggregateASTVisitor} to apply to the compilation unit
     * @param options the Java project options used to compile the project
     * @throws Exception if any problem occurs
     *
     * @see <a
     * href="http://help.eclipse.org/indigo/index.jsp?topic=%2Forg.eclipse.jdt.doc.isv%2Fguide%2Fjdt_api_manip.htm"
     * >Eclipse JDT core - Manipulating Java code</a>
     * @see <a href="
     * http://help.eclipse.org/indigo/index.jsp?topic=/org.eclipse.platform.doc.isv/guide/workbench_cmd_menus.htm"
     * > Eclipse Platform Plug-in Developer Guide > Plugging into the workbench
     * > Basic workbench extension points using commands > org.eclipse.ui.menus</a>
     * @see <a
     * href="http://www.eclipse.org/articles/article.php?file=Article-JavaCodeManipulation_AST/index.html"
     * >Abstract Syntax Tree > Write it down</a>
     */
    public void applyRefactoring(IDocument document, ICompilationUnit compilationUnit, AggregateASTVisitor refactoring,
            JavaProjectOptions options) throws Exception {
        final ASTParser parser = ASTParser.newParser(AST.JLS4);
        resetParser(compilationUnit, parser, options);

        CompilationUnit astRoot = (CompilationUnit) parser.createAST(null);

        int totalNbLoops = 0;
        List<ASTVisitor> lastLoopVisitors = Collections.emptyList();
        int nbLoopsWithSameVisitors = 0;
        while (true) {
            if (totalNbLoops > 100) {
                final String errorMsg = "An infinite loop has been detected for file "
                        + getFileName(astRoot) + "."
                        + " A possible cause is that code is being incorrectly"
                        + " refactored one way then refactored back to what it was."
                        + " Fix the code before pursuing."
                        + getPossibleCulprits(nbLoopsWithSameVisitors, lastLoopVisitors);
                AutoRefactorPlugin.logError(errorMsg, new IllegalStateException(astRoot, errorMsg));
                break;
            }

            final RefactoringContext ctx = new RefactoringContext(compilationUnit, astRoot.getAST(), options);
            refactoring.setRefactoringContext(ctx);

            final Refactorings refactorings = refactoring.getRefactorings(astRoot);
            if (!refactorings.hasRefactorings()) {
                return;
            }

            refactorings.applyTo(document);
            final boolean hadUnsavedChanges = compilationUnit.hasUnsavedChanges();
            compilationUnit.getBuffer().setContents(document.get());
            if (!hadUnsavedChanges) {
                compilationUnit.save(null, true);
            }
            resetParser(compilationUnit, parser, options);
            astRoot = (CompilationUnit) parser.createAST(null);
            ++totalNbLoops;


            final List<ASTVisitor> thisLoopVisitors = refactoring.getVisitorsContributingRefactoring();
            if (!thisLoopVisitors.equals(lastLoopVisitors)) {
                lastLoopVisitors = new ArrayList<ASTVisitor>(thisLoopVisitors);
                nbLoopsWithSameVisitors = 0;
            } else {
                ++nbLoopsWithSameVisitors;
            }
        }
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
