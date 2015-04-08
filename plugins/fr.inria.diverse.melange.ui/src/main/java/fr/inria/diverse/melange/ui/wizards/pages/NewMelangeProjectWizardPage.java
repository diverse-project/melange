package fr.inria.diverse.melange.ui.wizards.pages;

import java.util.Arrays;
import java.util.List;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class NewMelangeProjectWizardPage extends WizardPage {

	protected NewMelangeProjectWizardFields		context;
	
	protected static final List<String> FILE_EXTENSIONS = Arrays.asList(new String [] { "ecore" });
	protected boolean 	enableNext = true;
	
	protected Composite 	container;
	protected Label 		lblProjectName;
//	protected Label 		lblTemplateEcore;
	protected Text 			txtProjectName;
	protected Text 			txtProjectLocation;
//	protected Text 			txtPathEcore;
	protected Button		btnBrowseLocation;
//	protected Button 		btnBrowseEcore;
	//protected Button 		btnCreateEmfProject;
	protected Button 		btnCheckLocation;
	

	protected Group 		grpGeneral;
//	protected Button 		btnCheckEcore;
//	protected Button 		btnCheckSLE;
/*	protected Button 		btnCheckEMF;
	protected Button 		btnCheckKMF;
	protected Button 		btnRadioStandAlone;
	protected Button 		btnRadioPlugIn;
	protected Button 		btnRadioMaven;
//	protected Combo 		combo;
	protected Group 		grpGeneral;
	protected Group 		grpKindOfProject;
	protected Group 		grpModelingOptions;
//protected Group 		grpSLEOptions;
	protected Group 		grpTemplateOptions;*/

	public NewMelangeProjectWizardPage(NewMelangeProjectWizardFields context){
		super("wizardPage");
		this.context = context;
		setTitle("New Melange project");
		setDescription("This wizard creates a new Melange project");
	}
	
	/**
	 * Constructor for KermetaNewWizardDashboard.
	 * @param pageName
	 */
	public NewMelangeProjectWizardPage(ISelection selection) {
		super("wizardPage");
		setTitle("New Melange project");
		setDescription("This wizard creates a new Melange project");
		setPageComplete(true);
	}

	@Override
	public void createControl(Composite parent) {
		container = new Composite(parent, SWT.NULL);
		container.setLayout(new GridLayout(1, false));
		
		
		//-----------------------------------------------
		grpGeneral = new Group(container, SWT.NONE);
		grpGeneral.setText("General");
		grpGeneral.setLayout(new GridLayout(4, false));

		lblProjectName = new Label(grpGeneral, SWT.NONE);
		lblProjectName.setText("Project name");
		new Label(grpGeneral, SWT.NONE);
		new Label(grpGeneral, SWT.NONE);
		new Label(grpGeneral, SWT.NONE);
		
		txtProjectName = new Text(grpGeneral, SWT.BORDER);
		txtProjectName.setText(this.context.projectName);
		txtProjectName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 3, 1));
		new Label(grpGeneral, SWT.NONE);
				
		txtProjectName.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent arg0) {
				checkPageFields();
				updateNameProject(txtProjectName.getText());
			}
		});
		
		btnCheckLocation = new Button(grpGeneral, SWT.CHECK);
		btnCheckLocation.setText("Use default location");
		btnCheckLocation.setSelection(true);
		new Label(grpGeneral, SWT.NONE);
		new Label(grpGeneral, SWT.NONE);
		new Label(grpGeneral, SWT.NONE);
		
		btnCheckLocation.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (btnCheckLocation.getSelection()) {
					txtProjectLocation.setEnabled(false);
					btnBrowseLocation.setEnabled(false);
				}
				else {
					txtProjectLocation.setEnabled(true);
					btnBrowseLocation.setEnabled(true);
				} 
			}
		});
		txtProjectLocation = new Text(grpGeneral, SWT.BORDER);
		txtProjectLocation.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 3, 1));
		txtProjectLocation.setText(this.context.projectLocation);
		
		btnBrowseLocation = new Button(grpGeneral, SWT.NONE);
		btnBrowseLocation.setText("Browse...");
		
		btnBrowseLocation.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				txtProjectLocation.setText(locationDialog());
			}
		});
		
		//-----------------------------------------------
/*
		grpKindOfProject = new Group(container, SWT.NONE);
		grpKindOfProject.setText("Dependency management / Project kind");
		grpKindOfProject.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		btnRadioPlugIn = new Button(grpKindOfProject, SWT.RADIO);
		btnRadioPlugIn.setText("Plug-in");
		btnRadioPlugIn.setToolTipText("Eclipse plugin project, external dependencies will be specified using manifest.mf.");
		btnRadioPlugIn.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				updateKindsOfProject(NewK3ProjectWizardFields.KindsOfProject.PLUGIN);
			}
		});
		
		btnRadioStandAlone = new Button(grpKindOfProject, SWT.RADIO);
		btnRadioStandAlone.setText("Stand alone");
		btnRadioStandAlone.setToolTipText("Standard java project. Dependencies jars will be copied and embedded.");
		btnRadioStandAlone.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				updateKindsOfProject(NewK3ProjectWizardFields.KindsOfProject.STANDALONE);
			}
		});
		
		btnRadioMaven = new Button(grpKindOfProject, SWT.RADIO);
		btnRadioMaven.setText("Maven");
		btnRadioMaven.setToolTipText("Standard java maven project, external dependencies will be specified using pom.xml.");
		btnRadioMaven.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				updateKindsOfProject(NewK3ProjectWizardFields.KindsOfProject.MAVEN);
			}
		});

		
		
		//-----------------------------------------------
		grpModelingOptions = new Group(container, SWT.NONE);
		grpModelingOptions.setText("Modeling options");
		grpModelingOptions.setLayout(new GridLayout(4, false));
		
		btnCheckEMF = new Button(grpModelingOptions, SWT.CHECK);
		btnCheckEMF.setText("Use EMF");
		btnCheckEMF.setSelection(context.useEMF);
		btnCheckEMF.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				updateUseEMF(btnCheckEMF.getSelection()); 
			}
		});
		btnCheckKMF = new Button(grpModelingOptions, SWT.CHECK);
		btnCheckKMF.setText("Use KMF");
		btnCheckKMF.setEnabled(false); // not supported yet
		btnCheckKMF.setSelection(context.useKMF);
		btnCheckKMF.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				updateUseKMF(btnCheckKMF.getSelection()); 
			}
		});
		new Label(grpModelingOptions, SWT.NONE);
		new Label(grpModelingOptions, SWT.NONE);
	*/	
	/*	btnCheckEcore = new Button(grpModelingOptions, SWT.CHECK);
		btnCheckEcore.setText("reference an existing ecore file");
		new Label(grpModelingOptions, SWT.NONE);
		new Label(grpModelingOptions, SWT.NONE);
		new Label(grpModelingOptions, SWT.NONE);
		
		btnCheckEcore.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				updateBtnCheckEcore(); 
			}
		});
		
		txtPathEcore = new Text(grpModelingOptions, SWT.READ_ONLY | SWT.BORDER);
		txtPathEcore.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 3, 1));
		
		btnBrowseEcore = new Button(grpModelingOptions, SWT.NONE);
		btnBrowseEcore.setBounds(349, 137, 75, 25);
		btnBrowseEcore.setText("Browse...");
		
		btnBrowseEcore.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (workspaceDialog() || !txtPathEcore.getText().isEmpty()) {
					setPageComplete(true);
				}
			}
		});
		*/
		
		//-----------------------------------------------
/*		grpSLEOptions = new Group(container, SWT.NONE);
		grpSLEOptions.setText("Language engineering options");
		grpSLEOptions.setLayout(new GridLayout(4, false));
		
		btnCheckSLE = new Button(grpSLEOptions, SWT.CHECK);
		btnCheckSLE.setText("Enable \"Modeling in the large\" features");
		btnCheckSLE.setToolTipText("SLE offers model manipulation features");
		btnCheckSLE.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				updateUseSLE(btnCheckSLE.getSelection()); 
			}
		});
	*/	
	/*	grpTemplateOptions = new Group(container, SWT.NONE);
		grpTemplateOptions.setText("Template options");
		grpTemplateOptions.setLayout(new GridLayout(4, false));
	//	lblTemplateEcore = new Label(grpTemplateOptions, SWT.NONE);
	//	lblTemplateEcore.setText("use a template based on ecore file");
		new Label(grpTemplateOptions, SWT.NONE);
		new Label(grpTemplateOptions, SWT.NONE);
		new Label(grpTemplateOptions, SWT.NONE);
		
		combo = new Combo(grpTemplateOptions, SWT.NONE);
		combo.setItems(new String[] {"None", "Aspect class from ecore file", "Customize"});
		combo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 3, 1));
		new Label(grpTemplateOptions, SWT.NONE);
		combo.select(0);
		
		combo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(combo.getSelectionIndex() == 2) {
			//		updateNextButton (true);
				}
				else {
			//		updateNextButton (false);
				}
			}
		});
	*/	
		//-----------------------------------------------
		
		//initialization of enabled state of controls
		txtProjectLocation.setEnabled(false);
		btnBrowseLocation.setEnabled(false);
	//	btnBrowseEcore.setEnabled(false);
	//	txtPathEcore.setEnabled(false);
	//	lblTemplateEcore.setEnabled(false);
		//btnCreateEmfProject.setEnabled(false);
	//	combo.setEnabled(false);
	//	btnRadioPlugIn.setSelection(true);
	//	btnCheckSLE.setEnabled(true);
		
		//check if the name of the project is legal
		checkPageFields();
		
		// Required to avoid an error in the system
		setControl(container);
		setPageComplete(true);
	}
	
	protected String locationDialog () {
		DirectoryDialog dirDialog = new DirectoryDialog(new Shell());
	    dirDialog.setText("Select location directory");
	    this.context.projectLocation = dirDialog.open();
	    return this.context.projectLocation;
	}
	/*  
	protected boolean workspaceDialog() {
		boolean bResult = false;
		
		final IWorkbenchWindow workbenchWindow = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		Object selection = null;
		if(workbenchWindow.getSelectionService().getSelection() instanceof IStructuredSelection){
			selection = ((IStructuredSelection)workbenchWindow.getSelectionService().getSelection()).getFirstElement();	
		}
		
		final IFile selectedEcoreFile = 
				selection != null && selection instanceof IFile && FILE_EXTENSIONS.contains(((IFile)selection).getFileExtension()) ? (IFile)selection : null;
		
		ViewerFilter viewerFilter = new ViewerFilter() {
			@Override
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				if (element instanceof IFile) {
					IFile file = (IFile)element;
					return FILE_EXTENSIONS.contains	(file.getFileExtension()) &&
													(selectedEcoreFile == null ||
													!selectedEcoreFile.getFullPath().equals(file.getFullPath()));
				}
				return true;
			}
		};
		
		final IFile[] files = WorkspaceResourceDialog.openFileSelection	(workbenchWindow.getShell(), 
																		null, 
																		Ecore2EcoreEditorPlugin.INSTANCE.getString("_UI_SelectOutputEcoreModels_label"), 
																		true, 
																		null, 
																		Collections.singletonList(viewerFilter));
		if (files.length > 0) {
			for (int i = 0; i < files.length; i++) {
				this.context.ecoreIFile = files[i];				
				txtPathEcore.setText(files[i].getFullPath().toOSString());
				this.context.ecoreProjectPath = files[i].getProject().getFullPath().toOSString();
				activErrorMessage (1, false);
			}
			bResult = true;
		}
		return bResult;
	}
	*/
	
	
	
	protected boolean existNameProject () {
		boolean bFinder = false;
		int i = 0;
		while (bFinder == false && i < ResourcesPlugin.getWorkspace().getRoot().getProjects().length) {
  		  if (ResourcesPlugin.getWorkspace().getRoot().getProjects()[i].getName().contentEquals(txtProjectName.getText())) {
  			  bFinder = true;
  		  }
  		  i++;
		}
		return bFinder;
	}
	
	
	/**
	 * verifies the fields data and indicates if the page can be completed or not
	 */
	protected void checkPageFields(){
		if (existNameProject()) {
			setErrorMessage("A project already exist with this name");
			setPageComplete(false);
		}
		else {
			setErrorMessage(null);
			setPageComplete(true);					
		}
	}
	
	
	protected void updateNameProject (String nameProject) {
		this.context.projectName = nameProject;
	}
	
/*	protected void updateNextButton (boolean enable) {
		enableNext = enable;
		canFlipToNextPage();
		getWizard().getContainer().updateButtons();
		this.context.indexTransfomation = this.combo.getSelectionIndex();
	}*/
	
	
	
	@Override
	public boolean canFlipToNextPage () {
		return enableNext;
	}
	

	public void setProjectName(String nameProject) {
		this.txtProjectName.setText(nameProject);
		this.context.projectName = nameProject;
	}
	
	
}
