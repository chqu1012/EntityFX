package de.dc.entity.lang.generator.template

import de.dc.entity.model.Entity

class SearchContentTemplate implements IGenerator<Entity>{
	
	override filename(Entity t) '''«t.name.toFirstUpper»SearchContent'''
	
	override gen(Entity t) '''
	package «t.packagePath».filter;
	
	import org.apache.commons.lang.builder.ToStringBuilder;
	
	public class «t.name.toFirstUpper»SearchContent {
	
		private String name;
		private String value;
		private «t.name.toFirstUpper»SearchType type;
	
		public «t.name.toFirstUpper»SearchContent(String name, String value, «t.name.toFirstUpper»SearchType type) {
			this.name = name;
			this.value = value;
			this.type = type;
		}
	
		public String getName() {
			return name;
		}
	
		public void setName(String name) {
			this.name = name;
		}
	
		public String getValue() {
			return value;
		}
	
		public void setValue(String value) {
			this.value = value;
		}
	
		public «t.name.toFirstUpper»SearchType getType() {
			return type;
		}
	
		public void setType(«t.name.toFirstUpper»SearchType type) {
			this.type = type;
		}
		
		@Override
		public String toString() {
			return ToStringBuilder.reflectionToString(this);
		}
	}
	'''
	
}