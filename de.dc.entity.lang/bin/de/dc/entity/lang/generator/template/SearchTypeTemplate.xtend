package de.dc.entity.lang.generator.template

import de.dc.entity.model.Entity

class SearchTypeTemplate implements IGenerator<Entity>{
	
	override filename(Entity t) '''«t.name.toFirstUpper»SearchType'''
	
	override gen(Entity t) '''
	package «t.packagePath».filter;
	
	public enum «t.name.toFirstUpper»SearchType {
		START_WITH,
		CONTAINS,
		ENDS_WITH,
		EQUALS_TO,
		NOT_EQUALS_TO,
		GREATER_THAN,
		GREATER_THAN_OR_EQUALS,
		LESS_THAN,
		LESS_THAN_OR_EQUALS
		;
	}
	'''
	
}