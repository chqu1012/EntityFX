package de.dc.entity.lang.generator.template

import de.dc.entity.model.Entity

class SearchPaneTemplate implements IGenerator<Entity>{
	
	override filename(Entity t) '''«t.name.toFirstUpper»SearchPane'''
	
	override gen(Entity t) '''
	package «t.packagePath».filter;
	
	import javafx.collections.FXCollections;
	import javafx.collections.ObservableList;
	import javafx.event.ActionEvent;
	import javafx.fxml.FXML;
	import javafx.fxml.FXMLLoader;
	import javafx.scene.control.Button;
	import javafx.scene.control.CheckBox;
	import javafx.scene.control.ComboBox;
	import javafx.scene.control.Hyperlink;
	import javafx.scene.control.TextField;
	import javafx.scene.layout.HBox;
	import javafx.scene.layout.VBox;
	import java.io.IOException;
	import java.util.Optional;
	
	public class «t.name.toFirstUpper»SearchPane extends VBox{
	
	    @FXML
	    protected VBox paneContent;
	
	    @FXML
	    protected Button buttonAccept;
	
	    @FXML
	    protected Hyperlink linkCancel;
	
	    @FXML
	    protected VBox root;
	    «FOR field: t.field»
	    @FXML
	    protected HBox hbox«field.name.toFirstUpper»;

	    @FXML
	    protected CheckBox checkbox«field.name.toFirstUpper»;

	    @FXML
	    protected ComboBox<«t.name.toFirstUpper»SearchType> combobox«field.name.toFirstUpper»;

	    @FXML
	    protected TextField text«field.name.toFirstUpper»;
	    «ENDFOR»
	    
	    private ObservableList<«t.name.toFirstUpper»SearchContent> content = FXCollections.observableArrayList();
	     
		public static final String FXML = "/«t.packagePath.replace('.', '/')»/filter/«t.name.toFirstUpper»SearchPane.fxml";

		public «t.name.toFirstUpper»SearchPane() {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(FXML));
			fxmlLoader.setRoot(this);
			fxmlLoader.setController(this);
			
			try {
				fxmlLoader.load();
			} catch (IOException exception) {
				exception.printStackTrace();
			}
			«FOR field : t.field»
			hbox«field.name.toFirstUpper».disableProperty().bind(checkbox«field.name.toFirstUpper».selectedProperty().not());
			combobox«field.name.toFirstUpper».setItems(FXCollections.observableArrayList(«t.name.toFirstUpper»SearchType.values()));
			combobox«field.name.toFirstUpper».getSelectionModel().selectFirst();
			«ENDFOR»
		}
	     
	    @FXML
	    protected void onActionEvent(ActionEvent event) {
	    	if (event.getSource()==buttonAccept) {
	    		content.clear();
				«FOR field : t.field»
				if(checkbox«field.name.toFirstUpper».isSelected()){
					String value = text«field.name.toFirstUpper».getText();
					String name = checkbox«field.name.toFirstUpper».getText();
					«t.name.toFirstUpper»SearchType type = combobox«field.name.toFirstUpper».getSelectionModel().getSelectedItem();
					content.add(new «t.name.toFirstUpper»SearchContent(name, value, type));
				}
				«ENDFOR»
				
				String select = "SELECT * FROM CONTACT WHERE ";
				Optional<String> result = content.stream().map(e-> e.getName()+" = '"+e.getValue()+"'").reduce((e1,e2) -> e1 +" OR "+e2);
				result.ifPresent(e-> System.out.println(select+e));
			}
	    	root.toBack();
	    }
	}
	'''
	
}