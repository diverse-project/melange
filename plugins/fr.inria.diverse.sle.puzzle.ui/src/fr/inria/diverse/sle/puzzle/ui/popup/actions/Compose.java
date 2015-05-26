package fr.inria.diverse.sle.puzzle.ui.popup.actions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

import org.eclipse.core.resources.IResource;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import fr.inria.diverse.sle.puzzle.ui.popup.actions.impl.ComposeImpl;
import fr.inria.diverse.sle.puzzle.ui.popup.actions.impl.IncompatibleLanguagesException;

/**
 * Class for the definition of the ComposeLangauge action
 * 
 * @author David Mendez Acuna
 */
public class Compose implements IObjectActionDelegate {

	// --------------------------------------------------
	// Attributes
	// --------------------------------------------------

	/**
	 * The shell this action is hosted in.
	 */
	private Shell shell;
	
	/**
	 * Selected {@link IFile}s.
	 */
	private Collection<IResource> selectedResources = Collections.emptySet();
	
	// --------------------------------------------------
	// Constructor
	// --------------------------------------------------

	/**
	 * Constructor by default class Compose
	 */
	public Compose() {
		super();
	}

	// --------------------------------------------------
	// Methods
	// --------------------------------------------------

	/**
	 * Obtains the shell to use for opening dialogs.
	 * @return my shell
	 */
	protected Shell getShell() {
		return shell;
	}
	
	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		try {
			ComposeImpl.getInstance().compose(
					(IResource) ((ArrayList<IResource>) selectedResources).get(0));
			MessageDialog.openInformation(shell, "Ui",
					"Generate extensions was executed.");
		} catch (IncompatibleLanguagesException e) {
			MessageDialog.openInformation(
					shell,
					"Incompatible Languages",
					"");
			e.printStackTrace();
		} catch (Exception e) {
			MessageDialog.openInformation(
					shell,
					"Ui",
					"Errors ocurred during the execution of the action. \n"
							+ e.getMessage());
			e.printStackTrace();
		}
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		selectedResources = Collections.emptySet();

		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			selectedResources = new ArrayList<IResource>();

			for (Iterator<?> iter = structuredSelection.iterator(); iter
					.hasNext();) {
				Object next = iter.next();

				if (next instanceof IResource) {
					selectedResources.add((IResource) next);
				}
			}
		}
	}
}