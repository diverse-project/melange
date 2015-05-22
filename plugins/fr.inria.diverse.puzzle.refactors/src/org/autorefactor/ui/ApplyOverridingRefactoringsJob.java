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
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
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
public class ApplyOverridingRefactoringsJob {

    private final List<RefactoringRule> refactoringRulesToApply;
    private final RefactoringUnit baseRefactoringUnit;
    private final List<RefactoringUnit> extensionRefactoringUnits;
    private final RefactoringUnit mergedRefactoringUnit;
    private final IProject targetProject;
    private final String baseClass;
    private final List<String> extensionClass;
    
    /**
     * Builds an instance of this class.
     *
     * @param refactoringUnits the units to automatically refactor
     * @param refactoringRulesToApply the refactorings to apply
     */
    public ApplyOverridingRefactoringsJob(OverridingAspectsSetVO overridingAspectSet) {
        this.baseRefactoringUnit = overridingAspectSet.getBaseRefactoringUnit();
        this.extensionRefactoringUnits = overridingAspectSet.getExtensionRefactoringUnit();
        this.mergedRefactoringUnit = overridingAspectSet.getMergedRefactoringUnit();
        this.refactoringRulesToApply = overridingAspectSet.getRefactoringRulesToApply();
        this.targetProject = overridingAspectSet.getTargetProject();
        this.baseClass = overridingAspectSet.getBaseClass();
        this.extensionClass = overridingAspectSet.getExtensionClass();
    }

    /** {@inheritDoc} */
    protected ArrayList<RefactoringPatternVO> run(IProgressMonitor monitor) {
    	ArrayList<RefactoringPatternVO> patterns = new ArrayList<RefactoringPatternVO>();
        final int startSize = 2;
        monitor.beginTask("", startSize);
        try {
        	if(extensionRefactoringUnits != null && baseRefactoringUnit != null && mergedRefactoringUnit != null){
        		ICompilationUnit extensionCompilationUnit = extensionRefactoringUnits.get(0).getCompilationUnit();
        		ICompilationUnit baseCompilationUnit = baseRefactoringUnit.getCompilationUnit();
        		ICompilationUnit mergedCompilationUnit = mergedRefactoringUnit.getCompilationUnit();
            	IType extensionPrimaryType = extensionCompilationUnit.findPrimaryType();
            	IType basePrimaryType = baseCompilationUnit.findPrimaryType();
            	IType mergedPrimaryType = mergedCompilationUnit.findPrimaryType();
            	
//            	System.out.println("ApplyOverridingRefactoringsJob.run0 " + "extension: " + extensionCompilationUnit.getElementName()
//            			+ " base: " + baseCompilationUnit.getElementName());
//            	System.out.println("ApplyOverridingRefactoringsJob.run0 " + "extension: " + extensionCompilationUnit.getJavaProject().getElementName()
//            			+ " base: " + baseCompilationUnit.getJavaProject().getElementName());
            	
            	IMethod extensionMethod = null;
            	IMethod privExtensionMethod = null;
            	
            	IMethod baseMethod = null;
            	IMethod privBaseMethod = null;
            	
            	IMethod mergedMethod = null;
            	IMethod privMergedMethod = null;
            	
            	for(IMethod _overridingMethod : extensionPrimaryType.getMethods()){
            		IAnnotation overrideAnnotation = null;
            		
            		for(IAnnotation _annotation : _overridingMethod.getAnnotations()){
            			if(_annotation.getElementName().equals("OverrideSuperAspectMethod"))
            				overrideAnnotation = _annotation;
            		}
            		
            		if(overrideAnnotation != null){
            			extensionMethod = _overridingMethod;
            			
//            			System.out.println("ApplyOverridingRefactoringsJob.extensionMethod: " + extensionMethod);
//                    	if(extensionMethod!=null)
//                    		System.out.println("ApplyOverridingRefactoringsJob.extensionMethod: " + extensionMethod.getSource());
                    	
                    	for(IMethod _overridingMethod2 : extensionPrimaryType.getMethods()){
            				if(_overridingMethod2.getElementName().equals("_privk3_" + extensionMethod.getElementName()))
            				privExtensionMethod = _overridingMethod2;
            			}
                    	
                    	for(IMethod _method : basePrimaryType.getMethods()){
                    		if(_method.getElementName().equals(extensionMethod.getElementName())
                    				&& _method.getNumberOfParameters() == extensionMethod.getNumberOfParameters()){
                    			baseMethod = _method;
                    		}
                    	}
                    	
                    	for(IMethod _method : basePrimaryType.getMethods()){
                    		if(_method.getElementName().equals(privExtensionMethod.getElementName())
                    				&& _method.getNumberOfParameters() == privExtensionMethod.getNumberOfParameters()){
                    			privBaseMethod = _method;
                    		}
                    	}
                    	
                    	for(IMethod _method : mergedPrimaryType.getMethods()){
                    		if(_method.getElementName().equals(baseMethod.getElementName())
                    				&& _method.getNumberOfParameters() == baseMethod.getNumberOfParameters()){
                    			mergedMethod = _method;
                    		}
                    	}
                    	
                    	for(IMethod _method : mergedPrimaryType.getMethods()){
                    		if(_method.getElementName().equals(privBaseMethod.getElementName())
                    				&& _method.getNumberOfParameters() == privBaseMethod.getNumberOfParameters()){
                    			privMergedMethod = _method;
                    		}
                    	}
                    	
            			mergedMethod.delete(true, monitor);
            			
            			String baseReturnType = baseMethod.getReturnType();
            			String baseElementName = baseMethod.getElementName();
            			String newMethodSource = baseMethod.getSource().replace(" " + baseElementName, " super_" + baseElementName);
            			String returnType = getTypeBySignature(baseReturnType);
            			String _return = "";
            			if(!returnType.equals("void"))
            				_return = "return";
            			String parameters = getParameters(baseMethod);
            			String newMethodBase = "   public static " + returnType + " " + baseElementName + "(" + parameters + "){ \n";
            			
            			int i = 0;
            			for(String _extensionClass : extensionClass){
            				if(i == 0) newMethodBase += "      if (_self instanceof " + _extensionClass + "){\n";
            				else newMethodBase += " else if (_self instanceof " + _extensionClass + "){\n";
                			newMethodBase += "         " +_return + " " + _extensionClass + "Aspect." + baseElementName + "(" + getParameterNames(baseMethod, _extensionClass) + ");\n";
                			newMethodBase += "      }";
                			i++;
            			}
            			
            			newMethodBase += " else if (_self instanceof " + baseClass + "){\n";
            			newMethodBase += "        " +_return + " super_" + baseElementName + "(" + getParameterNames(baseMethod, baseClass) + ");\n";
            			newMethodBase += "      }\n";
            			
            			if(!returnType.equals("void"))
            				newMethodBase += "      else \n        return " + getDefaultValueBySignature(baseReturnType) + ";";
            			
            			RefactoringPatternVO superPatternVO = new RefactoringPatternVO();
            			superPatternVO.setSourcePattern(baseClass + "Aspect" + "." + baseElementName + "(_self");
            			superPatternVO.setTargetPattern(baseClass + "Aspect" + ".super_" + baseElementName + "(_self");
            			
            			if(!patterns.contains(superPatternVO))
            				patterns.add(superPatternVO);
            			
            			if(!methodExists(newMethodBase, mergedPrimaryType))
            				mergedPrimaryType.createMethod(newMethodBase, null, false, monitor);
            			
            			mergedPrimaryType.createMethod(newMethodSource + "}", null, true, monitor);
            			
            			// Adding the additional methods included by the extension
                    	for(IMethod _method : extensionCompilationUnit.findPrimaryType().getMethods()){
                    		IAnnotation extensionAnnotation = null;
                    		for(IAnnotation _annotation : _method.getAnnotations()){
                    			if(_annotation.getElementName().equals("AddExtensionMethod"))
                    				extensionAnnotation = _annotation;
                    		}
                    		if(extensionAnnotation != null){
//                    			System.out.println("Creating the AddExtensionMethod in the merged: " + _method.getElementName());
                    			IMethod _baseMethod = getMethodByName(mergedRefactoringUnit, _method.getElementName());
                        		if(_baseMethod == null){
                    				mergedRefactoringUnit.getCompilationUnit().findPrimaryType().createMethod(_method.getSource(), null, true, monitor);
                    				
                    				IMethod privk3baseMethod = getMethodByName(extensionRefactoringUnits.get(0), "_privk3_" + _method.getElementName());
//                    				System.out.println("privk3baseMethod: " + privk3baseMethod);
                            		if(privk3baseMethod != null){
                            			mergedRefactoringUnit.getCompilationUnit().findPrimaryType().createMethod(privk3baseMethod.getSource(), null, true, monitor);
                            		}
                        		}
                    		}
                    	}
            			
                    	// Adding the imports needed by the injected code
                    	for(IImportDeclaration _import : extensionCompilationUnit.getImports()){
                    		if(!mergedRefactoringUnit.getCompilationUnit().getImport(_import.getElementName()).exists()){
                    			mergedRefactoringUnit.getCompilationUnit().createImport(_import.getElementName(), null, monitor);
                    		}
                    	}
            		}
            	}
            	
            	
        	}
        }catch(Exception e){
        	e.printStackTrace();
        }finally {
            monitor.done();
        }
        return patterns;
    }

    private IMethod getMethodByName(RefactoringUnit baseRefactoringUnit,
			String name) throws JavaModelException {
		for(IMethod _method : baseRefactoringUnit.getCompilationUnit().findPrimaryType().getMethods()){
			if(_method.getElementName().equals(name))
				return _method;
		}
		return null;
	}
    
	private boolean methodExists(String methodSource, IType primaryType) throws JavaModelException {
		for(IMethod _method : primaryType.getMethods()){
			if(_method.getSource().equals(methodSource))
				return true;
		}
		return false;
	}

	/**
     * Returns the type of an operation based on the signature: 
     * 
     * TypeSignature ::=
     *	"B"  // byte
   	 *	| "C"  // char
   	 *	| "D"  // double
   	 *	| "F"  // float
   	 *	| "I"  // int
   	 *	| "J"  // long
   	 *	| "S"  // short
   	 *	| "V"  // void
   	 *	| "Z"  // boolean
   	 *	| "T" + Identifier + ";" // type variable
   	 *	| "[" + TypeSignature  // array X[]
   	 *	| "!" + TypeSignature  // capture-of ?
   	 *	| "|" + TypeSignature + (":" + TypeSignature)+ // intersection type
   	 *	| ResolvedClassTypeSignature
   	 *	| UnresolvedClassTypeSignature
     *
     * @param baseReturnType
     * @return
     */
	private String getTypeBySignature(String baseReturnType) {
		if(baseReturnType.equals("V"))
			return "void";
		else if(baseReturnType.equals("B"))
			return "byte";
		else if(baseReturnType.equals("C"))
			return "char";
		else if(baseReturnType.equals("D"))
			return "double";
		else if(baseReturnType.equals("F"))
			return "float";
		else if(baseReturnType.equals("I"))
			return "int";
		else if(baseReturnType.equals("J"))
			return "long";
		else if(baseReturnType.equals("S"))
			return "short";
		else if(baseReturnType.equals("Z"))
			return "boolean";
		else
			return baseReturnType;
	}

	private String getDefaultValueBySignature(String baseReturnType) {
		if(baseReturnType.equals("V"))
			return "null";
		else if(baseReturnType.equals("B"))
			return "0";
		else if(baseReturnType.equals("C"))
			return "0";
		else if(baseReturnType.equals("D"))
			return "0";
		else if(baseReturnType.equals("F"))
			return "0";
		else if(baseReturnType.equals("I"))
			return "0";
		else if(baseReturnType.equals("J"))
			return "0";
		else if(baseReturnType.equals("S"))
			return "0";
		else if(baseReturnType.equals("Z"))
			return "false";
		else
			return "null";
	}
	
	private String getParameters(IMethod method) throws JavaModelException {
    	String params = "";
    	int i = 0;
    	for(String _paramName : method.getParameterNames()){
    		params += "final " + fixParamName(method.getParameterTypes()[i]) + " " + _paramName + ",";
    		i++;
    	}
    	
    	if(params.endsWith(","))
    		params = params.substring(0, params.length() - 1);
    	
		return params;
	}
	
	private String getParameterNames(IMethod method, String clazz) throws JavaModelException {
		String params = "";
    	for(String _paramName : method.getParameterNames()){
    		
    		if(_paramName.equals("_self"))
    			params += "(" + clazz + ")" + _paramName + ",";
    		else
    			params += _paramName + ",";
    	}
    	
    	if(params.endsWith(","))
    		params = params.substring(0, params.length() - 1);
    	
		return params;
	}
    
    private String fixParamName(String paramName){
    	String fixedParamName = paramName.substring(1,paramName.length()-1);
    	if(fixedParamName.contains("<") && fixedParamName.contains(">")){
    		String newInternType = "<";
    		String into = fixedParamName.substring(fixedParamName.indexOf("<") + 1, fixedParamName.indexOf(">"));
    		String[] intoArray = into.split(";");
    		for (String _up : intoArray) {
    			newInternType += _up.substring(1,_up.length()) + ",";
			}
    		newInternType = newInternType.substring(0,newInternType.length()-1) + ">";
    		fixedParamName = fixedParamName.replace("<" + into + ">", newInternType);
    	}
    	
    	
    	return fixedParamName;
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
                /*
                 * Cannot read the source when a file is not synchronized,
                 * Let's ignore this file to avoid problems when:
                 * - doing string manipulation with the source text
                 * - applying automated refactorings to such files
                 */
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
