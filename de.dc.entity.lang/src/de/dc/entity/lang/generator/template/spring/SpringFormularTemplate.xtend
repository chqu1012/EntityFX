package de.dc.entity.lang.generator.template.spring

import de.dc.entity.model.Entity
import de.dc.entity.model.Field
import de.dc.entity.model.Binding
import de.dc.entity.lang.generator.template.IGenerator

class SpringFormularTemplate implements IGenerator<Entity>{
	
	override filename(Entity t) {
		t.name.toFirstUpper+'Formular'
	}
	
	override gen(Entity t)'''
	package «t.packagePath».control;
	
	import «t.packagePath».model.*;
	import «t.packagePath».repository.*;
	import javafx.geometry.Insets;
	import javafx.scene.control.Button;
	import javafx.scene.control.Label;
	import javafx.scene.control.TextField;
	import javafx.scene.layout.VBox;
	import javafx.scene.input.MouseEvent;
	
	import javax.annotation.PostConstruct;
	
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
	import org.springframework.context.ConfigurableApplicationContext;
	import org.springframework.stereotype.Component;
	
	«val name = t.name.toFirstUpper»
	@Component
	public class «name»Formular extends VBox{
	
		@Autowired private «name»FX context;
		@Autowired private «name»Repository «name.toFirstLower»Repository;
		
		@PostConstruct
		public void init() {
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
			
			Button submitButton = new Button("Submit");
			submitButton.setOnMouseClicked(this::onButtonSubmit);
			submitButton.disableProperty().bind(context.getEnabledSubmitProperty().not());
			getChildren().add(submitButton);
		}
		
		public void onButtonSubmit(MouseEvent e) {
			«name» «name.toFirstLower» = context.get«name» ();
			«name.toFirstLower»Repository.save(«name.toFirstLower»);
			context.getMasterData().add(«name.toFirstLower»);
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