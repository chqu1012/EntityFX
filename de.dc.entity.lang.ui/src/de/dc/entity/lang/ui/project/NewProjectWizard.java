package de.dc.entity.lang.ui.project;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;

import de.dc.entity.lang.ui.project.util.ProjectUtil;

public class NewProjectWizard extends Wizard implements INewWizard {

	private WizardNewProjectCreationPage _pageOne;

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
	}

	@Override
	public void addPages() {
		super.addPages();

		_pageOne = new WizardNewProjectCreationPage("EntityFX Project Project Wizard");
		_pageOne.setTitle("EntityFX Project");
		_pageOne.setDescription("Create new EntityFX Project.");

		addPage(_pageOne);
	}

	@Override
	public boolean performFinish() {
		ProjectUtil.createForJava(_pageOne.getProjectName());
		return true;
	}

}
