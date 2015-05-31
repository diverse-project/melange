/*
 * AutoRefactor - Eclipse plugin to automatically refactor Java code bases.
 *
 * Copyright (C) 2015 Jean-Noël Rouvignac - initial API and implementation
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
import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.autorefactor.AutoRefactorPlugin;
import org.autorefactor.refactoring.JavaProjectOptions;
import org.autorefactor.refactoring.RefactoringRule;
import org.autorefactor.refactoring.rules.AllRefactoringRules;
import org.autorefactor.util.NotImplementedException;
import org.autorefactor.util.UnhandledException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;

/**
 * Eclipse job that prepares and partitions work for
 * {@link ApplyOverloadingRefactoringsJob}.
 */
public class PrepareApplyRefactoringsJob extends Job {

	private final List<RefactoringRule> refactoringRulesToApply;
	private ArrayList<RefactoringPatternVO> patterns;
	private final File targetFolderAspects;
	private final Map<IJavaElement, JavaProjectOptions> javaProjects = new HashMap<IJavaElement, JavaProjectOptions>();
	private final IProject targetProject;
	private final List<OverlappingAspectsVO> overlappingAspects;
	private final List<OverridingAspectsVO> overridingAspects;
	private final Hashtable<String, PropertiesSetVO> propertiesFiles;

	/**
	 * Builds an instance of this class.
	 *
	 * @param javaElements
	 *            the java elements selected for automatic refactoring
	 * @param refactoringRulesToApply
	 *            the refactorings to apply
	 */
	public PrepareApplyRefactoringsJob(
			List<OverlappingAspectsVO> overlappingAspects,
			List<OverridingAspectsVO> overridingAspects,
			ArrayList<RefactoringPatternVO> patterns,
			Hashtable<String, PropertiesSetVO> propertiesFiles,
			File targetFolderAspects, IProject targetProject) {
		super("Prepare Auto Refactor");
		this.refactoringRulesToApply = AllRefactoringRules
				.getConfiguredRefactoringRules();
		setPriority(Job.SHORT);
		this.overlappingAspects = overlappingAspects;
		this.patterns = patterns;
		this.targetFolderAspects = targetFolderAspects;
		this.targetProject = targetProject;
		this.overridingAspects = overridingAspects;
		this.propertiesFiles = propertiesFiles;
	}

	/** {@inheritDoc} */
	protected IStatus run(IProgressMonitor monitor) {
		AutoRefactorPlugin.register(this);
		try {
			List<String> additionalVariablesList = new ArrayList<String>();
			// Collecting the information concerning the properties files and
			// applying the corresponding merge.
			Iterator<String> keys = this.propertiesFiles.keySet().iterator();
			while (keys.hasNext()) {
				String currentKey = keys.next();
				PropertiesSetVO propertiesSet = this.propertiesFiles
						.get(currentKey);

				String mergedPropertiesPathString = propertiesSet
						.getMergedPropertiesFile().replace(
								this.targetProject.getWorkspace().getRoot()
										.getLocation().toString(), "");
				IPath mergedPropertiesPath = new Path(
						mergedPropertiesPathString);
				IJavaElement mergedPropertiesJavaElement = JavaCore
						.create(this.targetProject.getWorkspace().getRoot()
								.getFile(mergedPropertiesPath));

				ArrayList<IJavaElement> javaElementsToMerge = new ArrayList<IJavaElement>();
				for (String _propertiesFileToMerge : propertiesSet
						.getAllPropertiesFiles()) {
					String propertiesPathString = _propertiesFileToMerge
							.replace(this.targetProject.getWorkspace()
									.getRoot().getLocation().toString(), "");
					IPath propertiesPath = new Path(propertiesPathString);
					IJavaElement currentJavaElement = JavaCore
							.create(this.targetProject.getWorkspace().getRoot()
									.getFile(propertiesPath));
					javaElementsToMerge.add(currentJavaElement);
				}
				targetProject.refreshLocal(IResource.DEPTH_INFINITE, null);
				
				new ApplyFileMergeRefactoringsJob(mergedPropertiesJavaElement,
						javaElementsToMerge, targetProject, additionalVariablesList)
						.run(monitor);
			}
			
			for (OverlappingAspectsVO overlappingAspectVO : overlappingAspects) {
				ArrayList<IJavaElement> javaElements = new ArrayList<IJavaElement>();
				javaElements.add(overlappingAspectVO.extensionElement);
				javaElements.add(overlappingAspectVO.mergedElement);

				if (!javaElements.isEmpty()) {
					final List<RefactoringUnit> toRefactor = collectRefactoringUnits(javaElements);
					new ApplyOverloadingRefactoringsJob(toRefactor.get(1),
							toRefactor.get(0), refactoringRulesToApply,
							patterns, targetFolderAspects, targetProject, additionalVariablesList)
							.run(monitor);
				}
			}

			ArrayList<RefactoringPatternVO> morePatterns = null;
			ArrayList<OverridingAspectsSetVO> overridingAspectsSet = new ArrayList<OverridingAspectsSetVO>();
			for (OverridingAspectsVO overridingAspectVO : overridingAspects) {
				ArrayList<IJavaElement> javaElements = new ArrayList<IJavaElement>();
				if (overridingAspectVO.extensionElement != null
						&& overridingAspectVO.baseElement != null
						&& overridingAspectVO.mergedElement != null) {
					javaElements.add(overridingAspectVO.extensionElement);
					javaElements.add(overridingAspectVO.baseElement);
					javaElements.add(overridingAspectVO.mergedElement);

					final List<RefactoringUnit> toRefactor = collectRefactoringUnits(javaElements);
					OverridingAspectsSetVO _overridingAspectsSet = findOverridingAspectByBaseClass(overridingAspectsSet,overridingAspectVO.baseAspectClassName);
					if (_overridingAspectsSet == null) {
						OverridingAspectsSetVO _newOverridingAspectsSet = new OverridingAspectsSetVO(
								toRefactor.get(1), toRefactor.get(2), refactoringRulesToApply, targetFolderAspects, targetProject, overridingAspectVO.baseAspectClassName);
						_newOverridingAspectsSet.getExtensionRefactoringUnit().add(toRefactor.get(0));
						_newOverridingAspectsSet.getExtensionClass().add(overridingAspectVO.leftAspectClassName);
						overridingAspectsSet.add(_newOverridingAspectsSet);
					} else {
						_overridingAspectsSet.getExtensionRefactoringUnit().add(toRefactor.get(0));
						_overridingAspectsSet.getExtensionClass().add(overridingAspectVO.leftAspectClassName);
					}
				}
			}

			for (OverridingAspectsSetVO overridingAspectsSetVO : overridingAspectsSet) {
				morePatterns = new ApplyOverridingRefactoringsJob(
						overridingAspectsSetVO).run(monitor);
			}

			new ApplyStringRefactoringsJob(null, null, refactoringRulesToApply,
					patterns, morePatterns, targetFolderAspects, targetProject)
					.run(monitor);

			return Status.OK_STATUS;
		} catch (Exception e) {
			e.printStackTrace();
			return new Status(IStatus.ERROR, AutoRefactorPlugin.PLUGIN_ID,
					e.getMessage(), e);
		} finally {
			AutoRefactorPlugin.unregister(this);
		}
	}

	private OverridingAspectsSetVO findOverridingAspectByBaseClass(
			ArrayList<OverridingAspectsSetVO> overridingAspectsSet,
			String baseClassName) {
		for (OverridingAspectsSetVO overridingAspectsSetVO : overridingAspectsSet) {
			if (overridingAspectsSetVO.getBaseClass().equals(baseClassName))
				return overridingAspectsSetVO;
		}
		return null;
	}

	private List<RefactoringUnit> collectRefactoringUnits(
			List<IJavaElement> javaElements) {
		try {
			final List<RefactoringUnit> results = new ArrayList<RefactoringUnit>();
			addAll(results, javaElements);
			return results;
		} catch (Exception e) {
			throw new UnhandledException(null, e);
		}
	}

	private void addAll(List<RefactoringUnit> results,
			List<IJavaElement> javaElements) throws JavaModelException {
		for (IJavaElement javaElement : javaElements) {
			final JavaProjectOptions options = getJavaProjectOptions(javaElement);
			if (javaElement instanceof ICompilationUnit) {
				add(results, (ICompilationUnit) javaElement, options);
			} else if (javaElement instanceof IPackageFragment) {
				final IPackageFragment pf = (IPackageFragment) javaElement;
				addAll(results, pf.getCompilationUnits(), options);
			} else if (javaElement instanceof IPackageFragmentRoot) {
				final IPackageFragmentRoot pfr = (IPackageFragmentRoot) javaElement;
				addAll(results, Arrays.asList(pfr.getChildren()));
			} else if (javaElement instanceof IJavaProject) {
				IJavaProject javaProject = (IJavaProject) javaElement;
				for (IPackageFragment pf : javaProject.getPackageFragments()) {
					addAll(results, pf.getCompilationUnits(), options);
				}
			}
		}
	}

	private void addAll(final List<RefactoringUnit> results,
			ICompilationUnit[] cus, JavaProjectOptions options)
			throws JavaModelException {
		for (ICompilationUnit cu : cus) {
			add(results, cu, options);
		}
	}

	private void add(final List<RefactoringUnit> results, ICompilationUnit cu,
			JavaProjectOptions options) throws JavaModelException {
		if (!cu.isConsistent()) {
			cu.makeConsistent(null);
		}
		if (!cu.isReadOnly()) {
			results.add(new RefactoringUnit(cu, options));
		}
	}

	@SuppressWarnings("unchecked")
	private JavaProjectOptions getJavaProjectOptions(IJavaElement javaElement) {
		final IJavaProject javaProject = getIJavaProject(javaElement);
		JavaProjectOptions options = javaProjects.get(javaProject);
		if (options == null) {
			options = new JavaProjectOptionsImpl(javaProject.getOptions(true));
			javaProjects.put(javaProject, options);
		}
		return options;
	}

	private IJavaProject getIJavaProject(IJavaElement javaElement) {
		if (javaElement instanceof ICompilationUnit
				|| javaElement instanceof IPackageFragment
				|| javaElement instanceof IPackageFragmentRoot) {
			return getIJavaProject(javaElement.getParent());
		} else if (javaElement instanceof IJavaProject) {
			return (IJavaProject) javaElement;
		}
		throw new NotImplementedException(null, javaElement);
	}
}
