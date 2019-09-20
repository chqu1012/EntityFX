package de.dc.entity.lang.generator.template

import de.dc.entity.model.Entity
import de.dc.entity.model.Field
import de.dc.entity.model.Binding

class FormularTemplate implements IGenerator<Entity>{
	
	override filename(Entity t) {
		t.name.toFirstUpper+'Formular'
	}
	
	override gen(Entity t)'''
	package «t.packagePath».control;
	
	import com.google.inject.Inject;
	
	import «t.packagePath».model.*;
	import «t.packagePath».repository.*;
	import javafx.geometry.Insets;
	import javafx.scene.control.*;
	import javafx.scene.layout.*;
	import javafx.scene.input.MouseEvent;
	
	«val name = t.name.toFirstUpper»
	public class «name»Formular extends VBox{
	
		private «name»FX context;
		private «name»Repository «name.toFirstLower»Repository;
		
		@Inject
		public «name»Formular(«name»FX context, «name»Repository «name.toFirstLower»Repository) {
			this.context = context;
			this.«name.toFirstLower»Repository = «name.toFirstLower»Repository;
			
			setPadding(new Insets(10));
			«FOR field : t.field»
			«IF field.control !== null»
			«val control = field.control»
			«val controlName = '''«IF control.name!==null»«control.name»«ELSE»«field.name»«ENDIF»'''»
			getChildren().add(new Label("«controlName»:"));
			«control.control.qualifiedName» «controlName.toFirstLower»«control.control.simpleName» = new «control.control.qualifiedName»();
			«controlName.toFirstLower»«control.control.simpleName».setPromptText("Please enter a «field.name»");
			«IF control.binding === null || control.binding == Binding::TEXT_PROPERTY»
			«controlName.toFirstLower»«control.control.simpleName».textProperty().bindBidirectional(context.get«field.name»Property() «field.format»);
			«ELSE»
			«controlName.toFirstLower»«control.control.simpleName».«control.binding.toString»().bindBidirectional(context.get«field.name»Property());
			«ENDIF»
			getChildren().add(«controlName.toFirstLower»«control.control.simpleName»);
			«ENDIF»
			«ENDFOR»
			
			Button clearButton = new Button("Reset");
			clearButton.setOnMouseClicked(this::onButtonReset);
			clearButton.disableProperty().bind(context.getEnabledSubmitProperty().not());
			
			Button submitButton = new Button("Submit");
			submitButton.setOnMouseClicked(this::onButtonSubmit);
			submitButton.disableProperty().bind(context.getEnabledSubmitProperty().not());
	
			HBox hbox = new HBox(5);
			hbox.getChildren().addAll(clearButton, submitButton);
			getChildren().addAll(hbox);
		}
		
		public void onButtonReset(MouseEvent e) {
			context.clear();
		}
	
		public void onButtonSubmit(MouseEvent e) {
			EventLog eventLog = context.getEventLog ();
			eventLogRepository.save(eventLog);
			context.getMasterData().add(eventLog);
			context.clear();
		}
	}
	'''
	
	def String getFormat(Field field){
		val type = field.datatype.simpleName
		if(type.equals('LocalDateTime')){
			return ", java.text.DateFormat.getInstance()";
		}else if(type.equals('Long') || type.equals('long')){
			return ", java.text.NumberFormat.getInstance()";
		}else if(type.equals('Integer') || type.equals('int')){
			return ", java.text.NumberFormat.getInstance()";
		}else if(type.equals('Float') || type.equals('float')){
			return ", java.text.NumberFormat.getInstance()";
		}
		return "";
	}
}