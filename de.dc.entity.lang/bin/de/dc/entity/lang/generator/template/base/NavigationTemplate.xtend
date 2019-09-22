package de.dc.entity.lang.generator.template.base

import de.dc.entity.model.Entity
import java.util.List

class NavigationTemplate{
	
	def static String gen(List<Entity> entities)'''
	package «entities.get(0).packagePath»;
	
	public enum NavigationType {
		«FOR entity : entities»
		«entity.name»("«entity.packagePath»"),
		«ENDFOR»
		;
		
		private String packagePath;
		
		private NavigationType(String packagePath) {
			this.packagePath = packagePath;
		}
		
		public String getPackagePath() {
			return packagePath;
		}
	}
	'''
}