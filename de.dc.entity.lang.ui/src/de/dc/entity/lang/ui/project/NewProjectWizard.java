package de.dc.entity.lang.ui.project;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

import de.dc.entity.lang.ui.project.model.NewProjectModel;

public class NewProjectWizard extends Wizard implements INewWizard {

	private WizardNewProjectCreationPage _pageOne;
	private EntityFXWizardPage _pageEntityFX;

	private NewProjectModel model = new NewProjectModel();
	
	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
	}

	@Override
	public void addPages() {
		super.addPages();

		_pageOne = new WizardNewProjectCreationPage(model);
		_pageEntityFX = new EntityFXWizardPage(model);
				
		addPage(_pageOne);
		addPage(_pageEntityFX);
	}

	@Override
	public boolean performFinish() {
//		ProjectUtil.createForJava(_pageOne.getProjectName());
		System.out.println(model);
		return true;
	}

}
