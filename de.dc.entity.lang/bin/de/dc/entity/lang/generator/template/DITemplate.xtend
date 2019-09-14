package de.dc.entity.lang.generator.template

import de.dc.entity.model.Entity

class DITemplate implements IGenerator<Entity>{
	
	override filename(Entity t)'''«t.name»Module'''
	
	override gen(Entity t)'''
	package «t.packagePath».di;
	
	import com.google.inject.AbstractModule;
	
	import «t.packagePath».control.*;
	import «t.packagePath».model.*;
	import «t.packagePath».repository.*;
	
	public class «t.name.toFirstUpper»Module extends AbstractModule{
	
		@Override
		protected void configure() {
			bind(«t.name.toFirstUpper»FX.class).asEagerSingleton();
			
			bind(«t.name.toFirstUpper»Repository.class).asEagerSingleton();
			
			bind(«t.name.toFirstUpper»TableView.class).asEagerSingleton();
			bind(«t.name.toFirstUpper»Formular.class).asEagerSingleton();
		}
	}
	
	'''
	
}