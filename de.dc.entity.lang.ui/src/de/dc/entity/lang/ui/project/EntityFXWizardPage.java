package de.dc.entity.lang.ui.project;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.beans.BeanProperties;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import de.dc.entity.lang.ui.project.model.NewProjectModel;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class EntityFXWizardPage extends WizardPage {
	private DataBindingContext m_bindingContext;
	private Text textEntityName;
	private NewProjectModel model;
	private Button btnUseSpring;
	private Button btnShowDetailsView;
	private Button btnUseSearchDialog;
	private Button btnGenerateDemoApplication;
	private Button btnUseHistory;

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
		btnShowDetailsView.setSelection(true);
		btnShowDetailsView.setText("Use Details Dialog");
		new Label(container, SWT.NONE);
		
		btnUseSearchDialog = new Button(container, SWT.CHECK);
		btnUseSearchDialog.setSelection(true);
		btnUseSearchDialog.setText("Use Search Dialog");
		new Label(container, SWT.NONE);
		
		btnGenerateDemoApplication = new Button(container, SWT.CHECK);
		btnGenerateDemoApplication.setSelection(true);
		btnGenerateDemoApplication.setText("Generate Demo Application");
		new Label(container, SWT.NONE);
		
		btnUseHistory = new Button(container, SWT.CHECK);
		btnUseHistory.setText("Use History");
		btnUseHistory.setSelection(true);
		m_bindingContext = initDataBindings();
	}
	protected DataBindingContext initDataBindings() {
		DataBindingContext bindingContext = new DataBindingContext();
		//
		IObservableValue observeSelectionBtnUseSpringObserveWidget = WidgetProperties.selection().observe(btnUseSpring);
		IObservableValue useSpringModelObserveValue = BeanProperties.value("useSpring").observe(model);
		bindingContext.bindValue(observeSelectionBtnUseSpringObserveWidget, useSpringModelObserveValue, null, null);
		//
		IObservableValue observeSelectionBtnShowDetailsViewObserveWidget = WidgetProperties.selection().observe(btnShowDetailsView);
		IObservableValue showDetailsPaneModelObserveValue = BeanProperties.value("showDetailsPane").observe(model);
		bindingContext.bindValue(observeSelectionBtnShowDetailsViewObserveWidget, showDetailsPaneModelObserveValue, null, null);
		//
		IObservableValue observeSelectionBtnUseSearchDialogObserveWidget = WidgetProperties.selection().observe(btnUseSearchDialog);
		IObservableValue useSearchPaneModelObserveValue = BeanProperties.value("useSearchPane").observe(model);
		bindingContext.bindValue(observeSelectionBtnUseSearchDialogObserveWidget, useSearchPaneModelObserveValue, null, null);
		//
		IObservableValue observeSelectionBtnGenerateDemoApplicationObserveWidget = WidgetProperties.selection().observe(btnGenerateDemoApplication);
		IObservableValue generateDemoModelObserveValue = BeanProperties.value("generateDemo").observe(model);
		bindingContext.bindValue(observeSelectionBtnGenerateDemoApplicationObserveWidget, generateDemoModelObserveValue, null, null);
		//
		IObservableValue observeTextTextEntityNameObserveWidget = WidgetProperties.text(SWT.Modify).observe(textEntityName);
		IObservableValue entityNameModelObserveValue = BeanProperties.value("entityName").observe(model);
		bindingContext.bindValue(observeTextTextEntityNameObserveWidget, entityNameModelObserveValue, null, null);
		//
		IObservableValue observeSelectionBtnUseHistoryObserveWidget = WidgetProperties.selection().observe(btnUseHistory);
		IObservableValue useHistoryModelObserveValue = BeanProperties.value("useHistory").observe(model);
		bindingContext.bindValue(observeSelectionBtnUseHistoryObserveWidget, useHistoryModelObserveValue, null, null);
		//
		return bindingContext;
	}
}
