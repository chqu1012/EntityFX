package de.dc.entity.lang.ui.project;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import de.dc.entity.lang.ui.project.model.NewProjectModel;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.core.databinding.beans.PojoProperties;

public class EntityFXWizardPage extends WizardPage {
	private DataBindingContext m_bindingContext;
	
	private Text textPackage;
	private Text textEntityName;
	private NewProjectModel model;
	private Button btnUseSpring;
	private Button btnShowDetailsView;
	private Button btnUseSearchDialog;

	public EntityFXWizardPage(NewProjectModel model) {
		super("wizardPage");
		this.model = model;
		setTitle("EntityFX Properties");
		setDescription("Create an example EntityFX DSL file");
	}

	@Override
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);

		setControl(container);
		container.setLayout(new GridLayout(2, false));
		
		Label lblEntityName = new Label(container, SWT.NONE);
		lblEntityName.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblEntityName.setText("Package:");
		
		WizardNewProjectCreationPage page1 = (WizardNewProjectCreationPage) getWizard().getPages()[0];
		
		textPackage = new Text(container, SWT.BORDER);
		textPackage.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		textPackage.setText(page1.getProjectName());
		Label label = new Label(container, SWT.NONE);
		label.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		label.setText("Entity Name:");
		
		textEntityName = new Text(container, SWT.BORDER);
		textEntityName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(container, SWT.NONE);
		
		btnUseSpring = new Button(container, SWT.CHECK);
		btnUseSpring.setText("Use Spring");
		new Label(container, SWT.NONE);
		
		btnShowDetailsView = new Button(container, SWT.CHECK);
		btnShowDetailsView.setText("Use Details Dialog");
		new Label(container, SWT.NONE);
		
		btnUseSearchDialog = new Button(container, SWT.CHECK);
		btnUseSearchDialog.setText("Use Search Dialog");
		m_bindingContext = initDataBindings();
	}
	protected DataBindingContext initDataBindings() {
		DataBindingContext bindingContext = new DataBindingContext();
		//
		IObservableValue observeTextTextPackageObserveWidget = WidgetProperties.text(SWT.Modify).observe(textPackage);
		IObservableValue packagePathModelObserveValue = PojoProperties.value("packagePath").observe(model);
		bindingContext.bindValue(observeTextTextPackageObserveWidget, packagePathModelObserveValue, null, null);
		//
		IObservableValue observeTextTextEntityNameObserveWidget = WidgetProperties.text(SWT.Modify).observe(textEntityName);
		IObservableValue nameModelObserveValue = PojoProperties.value("name").observe(model);
		bindingContext.bindValue(observeTextTextEntityNameObserveWidget, nameModelObserveValue, null, null);
		//
		IObservableValue observeSelectionBtnUseSpringObserveWidget = WidgetProperties.selection().observe(btnUseSpring);
		IObservableValue useSpringModelObserveValue = PojoProperties.value("useSpring").observe(model);
		bindingContext.bindValue(observeSelectionBtnUseSpringObserveWidget, useSpringModelObserveValue, null, null);
		//
		IObservableValue observeSelectionBtnShowDetailsViewObserveWidget = WidgetProperties.selection().observe(btnShowDetailsView);
		IObservableValue showDetailsPaneModelObserveValue = PojoProperties.value("showDetailsPane").observe(model);
		bindingContext.bindValue(observeSelectionBtnShowDetailsViewObserveWidget, showDetailsPaneModelObserveValue, null, null);
		//
		IObservableValue observeSelectionBtnUseSearchDialogObserveWidget = WidgetProperties.selection().observe(btnUseSearchDialog);
		IObservableValue useSearchPaneModelObserveValue = PojoProperties.value("useSearchPane").observe(model);
		bindingContext.bindValue(observeSelectionBtnUseSearchDialogObserveWidget, useSearchPaneModelObserveValue, null, null);
		//
		return bindingContext;
	}
}
