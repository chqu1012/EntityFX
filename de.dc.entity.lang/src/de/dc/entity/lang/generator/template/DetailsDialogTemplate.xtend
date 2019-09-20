package de.dc.entity.lang.generator.template

import de.dc.entity.model.Entity

class DetailsDialogTemplate implements IGenerator<Entity>{
	
	override filename(Entity t)'''«t.name»Dialog'''
	
	override gen(Entity t)'''
	package «t.packagePath».dialog;
	
	import com.google.inject.Inject;
	
	import «t.packagePath».model.*;
	import javafx.geometry.Insets;
	import javafx.scene.control.*;
	import javafx.scene.layout.GridPane;
	import javafx.util.Pair;
	
	public class «t.name»Dialog extends Dialog<Pair<String, String>>{
	
		@Inject
		public «t.name»Dialog(«t.name»FX context) {
			setTitle("«t.name» Dialog");
			
			getDialogPane().getButtonTypes().addAll(ButtonType.OK, ButtonType.CANCEL);
	
			GridPane grid = new GridPane();
			grid.setHgap(10);
			grid.setVgap(10);
			grid.setPadding(new Insets(20, 150, 10, 10));
	
			«FOR i : 0..(t.field.size-1) SEPARATOR '\n'»
			grid.add(new Label("«t.field.get(i).name»:"), 0, «i»);
			TextField «t.field.get(i).name.toLowerCase»Text = new TextField();
			«t.field.get(i).name.toLowerCase»Text.setText(String.valueOf(context.get«t.field.get(i).name»Property().get()));
			grid.add(«t.field.get(i).name.toLowerCase»Text, 1, «i»);
			«ENDFOR»
			
			getDialogPane().setContent(grid);
		}
	}
	'''
	
}