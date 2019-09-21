package de.dc.entity.lang.generator.template

import de.dc.entity.model.Entity
import de.dc.entity.model.Field

class ModelFXTemplate implements IGenerator<Entity>{
	
	override filename(Entity t)'''«t.name»FX'''
	
	override gen(Entity t)'''
	package «t.packagePath».model;
	
	import «t.packagePath».model.*;
	import javafx.beans.binding.BooleanBinding;
	import javafx.beans.property.*;
	import javafx.collections.FXCollections;
	import javafx.collections.ObservableList;
	import javafx.collections.transformation.FilteredList;
	
	«FOR field : t.field»	
	«IF field.useByRepository»
	import «field.datatype.qualifiedName»;
	«ENDIF»
	«ENDFOR»

	«val name = t.name.toFirstUpper»
	public class «name»FX {
		
	  private «name» «name.toFirstLower»;
	  private ObjectProperty<«name»> «name.toFirstLower»Property = new SimpleObjectProperty<>();
	  private ObservableList<«name»> masterData = FXCollections.observableArrayList();
	  private FilteredList<«name»> filteredMasterData = new FilteredList<>(masterData, p-> true);
	  
	  private LongProperty idProperty = new SimpleLongProperty();
	  private BooleanProperty enableSubmitProperty = new SimpleBooleanProperty(false);
	  
	  // UI configurations
	  private BooleanProperty showSearchPanelMenu = new SimpleBooleanProperty(«t.showSearchPanel»);
	  private BooleanProperty showDetailsPanelMenu = new SimpleBooleanProperty(«t.showDetailsPanel»);

	  «FOR field : t.field»
	  «IF field.useByRepository»
	  private «field.declaredProperty» «field.name.toFirstLower»Property = new «field.instanceProperty»();
	  «ELSEIF field.datatype.qualifiedName.contains('java.util.List')»
	  private «field.datatype.qualifiedName.replace('java.util.List', 'ListProperty')» «field.name.toFirstLower»Property = new SimpleListProperty<>();
	  «ENDIF»
	  «ENDFOR»
	  
	  public «name»FX() {
	    this(new «name»());
	  }
	  
	  public «name»FX(«name» «name.toFirstLower») {
	    this.«name.toFirstLower»=«name.toFirstLower»;
	    this.«name.toFirstLower»Property.set(«name.toFirstLower»);
	    
		this.«name.toFirstLower»Property.addListener((observable, oldValue, newValue) -> {
			if (newValue!=null) {
				«FOR field : t.field»
				«IF field.datatype.qualifiedName.contains('java.util.List')»
				«field.name.toFirstLower»Property.set(FXCollections.observableArrayList(newValue.get«field.name.toFirstUpper»()));
				«ELSE»
				«field.name.toFirstLower»Property.set(newValue.get«field.name.toFirstUpper»());
				«ENDIF»
				«ENDFOR»
			}
		});
		«val filteredFields = t.field.filter[useByRepository].filter[datatype.simpleName=='String']»
	    «val fields = filteredFields.map[it.name.toFirstLower+'Property.isNotEmpty()'].reduce[p1, p2|p1+'.and('+p2+')']»
	    «IF !filteredFields.isEmpty»
	    BooleanBinding isEnabled = «fields»;
	    this.enableSubmitProperty.bind(isEnabled);
	    «ELSE»
	    this.enableSubmitProperty.set(true);
	    «ENDIF»
	    clear();
	  }
	
	  public ObjectProperty<«name»> get«name»Property() {
	    return «name.toFirstLower»Property;
	  }

	  public BooleanProperty getEnabledSubmitProperty() {
	    return enableSubmitProperty;
	  }
	  
	  public ObservableList<«name»>  getMasterData(){
	  	return masterData;
	  }

	  public FilteredList<«name»> getFilteredMasterData(){
	  	return filteredMasterData;
	  }
	  
	  public «name» get«name»() {
	  	this.«name.toFirstLower» = new «name.toFirstUpper»();
	  	«FOR field : t.field»
	  	«IF field.useByRepository || field.datatype.qualifiedName.contains('java.util.List')»
	  	this.«name.toFirstLower».set«field.name.toFirstUpper»(«field.name.toFirstLower»Property.getValue());
	  	«ENDIF»
	  	«ENDFOR»
	    return this.«name.toFirstLower»;
	  }
	  
	  public LongProperty getIdProperty(){
	  	return idProperty;
	  }
	  
	  public void setIdProperty(LongProperty idProperty){
	  	this.idProperty = idProperty;
	  }
	  
	  «FOR field : t.field»
	  «IF field.useByRepository || field.datatype.qualifiedName.contains('java.util.List')»
	  public «field.declaredProperty» get«field.name.toFirstUpper»Property() {
	    return this.«field.name.toFirstLower»Property;
	  }
	  
	  public void set«field.name.toFirstUpper»Property(«field.declaredProperty» «field.name.toFirstLower»Property) {
	    this.«field.name.toFirstLower»Property = «field.name.toFirstLower»Property;
	  }
	  «ENDIF»
  	  «ENDFOR»
	
	  public BooleanProperty getShowSearchPanelMenu() {
		return showSearchPanelMenu;
	  }

	  public void setShowSearchPanelMenu(BooleanProperty showSearchPanelMenu) {
		this.showSearchPanelMenu = showSearchPanelMenu;
	  }

	  public BooleanProperty getShowDetailsPanelMenu() {
		return showDetailsPanelMenu;
	  }

	  public void setShowDetailsPanelMenu(BooleanProperty showDetailsPanelMenu) {
		this.showDetailsPanelMenu = showDetailsPanelMenu;
	  }
	
	  public void clear() {
	  	  «FOR field : t.field»
	  	  «IF field.useByRepository»
	  	  this.«field.name.toFirstLower»Property.set(«field.resetPropertyValue»);
		  «ENDIF»
		  «ENDFOR»
	  }
	
	  public String toString() {
	    return  org.apache.commons.lang.builder.ToStringBuilder.reflectionToString(get«name»());
	  }
	}
	'''
	
	def String getResetPropertyValue(Field field){
		switch (field.datatype.simpleName) {
			case "String": return '''""'''
			case "Integer": return "0"
			case "int": return "0"
			case "Float": return "0f"
			case "float": return "0f"
			case "Double": return "0d"
			case "double": return "0d"
			case "Long": return "0l"
			case "long": return "0l"
			case "List": return "ObservableList"
			case "LocalDate": return "java.time.LocalDate.now()"
			case "LocalDateTime": return "java.time.LocalDateTime.now()"
			default: return "Property"
		}
	}
	
	def String getDeclaredProperty(Field field){
		if(field.datatype.qualifiedName.contains('java.util.List')){
			return field.datatype.qualifiedName.replace('java.util.List', 'ListProperty')
		}
		switch (field.datatype.simpleName) {
			case "String": return "StringProperty"
			case "Integer": return "IntegerProperty"
			case "int": return "IntegerProperty"
			case "Float": return "FloatProperty"
			case "float": return "FloatProperty"
			case "Double": return "DoubleProperty"
			case "double": return "DoubleProperty"
			case "Long": return "LongProperty"
			case "long": return "LongProperty"
			case "List": return "ObservableList"
			case "LocalDate": return "ObjectProperty<java.time.LocalDate>"
			case "LocalDateTime": return "ObjectProperty<java.time.LocalDateTime>"
			default: return "Property"
		}
	}
	
	def String getInstanceProperty(Field field){
		if(field.datatype.qualifiedName.contains('java.util.List')){
			return 'SimpleListProperty<>'
		}
		switch (field.datatype.simpleName) {
			case "String": return "SimpleStringProperty"
			case "Integer": return "SimpleIntegerProperty"
			case "int": return "SimpleIntegerProperty"
			case "Float": return "SimpleFloatProperty"
			case "float": return "SimpleFloatProperty"
			case "Double": return "SimpleDoubleProperty"
			case "double": return "SimpleDoubleProperty"
			case "Long": return "SimpleLongProperty"
			case "long": return "SimpleLongProperty"
			case "List": return "FXCollections.observableArrayList"
			case "LocalDate": return "SimpleObjectProperty<>"
			case "LocalDateTime": return "SimpleObjectProperty<>"
			default: return "Property"
		}
	}
	
}