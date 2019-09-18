package de.dc.entity.lang.generator.template.spring

import de.dc.entity.model.Entity
import de.dc.entity.lang.generator.template.IGenerator

class SpringModelTemplate implements IGenerator<Entity>{
	
	override filename(Entity t)'''«t.name»'''
	
	override gen(Entity t)'''
	package «t.packagePath».model;
	
	import java.util.*;
	import java.time.*;
	import org.apache.commons.lang.builder.ToStringBuilder;
	import javax.persistence.*;
	
	@Entity
	public class «t.name»{
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "ID", nullable = false, columnDefinition = "BIGINT")
		private Long id;
		«FOR field : t.field»
		«IF field.useByRepository»
		«IF field.isIsClob»@Lob«ENDIF»
		@Column(nullable = «field.isRequired»)
		private «field.datatype.simpleName» «field.name.toFirstLower»;
		«ELSEIF field.datatype.qualifiedName.contains('java.util.List')»
		@Transient
		private «field.datatype.qualifiedName» «field.name.toFirstLower» = new java.util.ArrayList<>();
		«ENDIF»
		«ENDFOR»
		
		public «t.name»() {
		}
			
		«val param1 = t.field.filter[useByRepository && isRequired].map[it.datatype.simpleName +" "+ it.name.toFirstLower].reduce[p1, p2|p1+', '+p2]»
		public «t.name»(«param1») {
			«FOR field : t.field»
			«IF field.useByRepository»
			this.«field.name.toFirstLower» = «field.name.toFirstLower»;
			«ENDIF»
			«ENDFOR»
		}
		
		public Long getId(){
			return id;
		}
		
		public void setId(Long id){
			this.id=id;
		}
		«FOR field : t.field»
		«IF field.useByRepository»
		public «field.datatype.simpleName» get«field.name.toFirstUpper»() {
			return «field.name.toFirstLower»;
		}

		public void set«field.name.toFirstUpper»(«field.datatype.simpleName» «field.name.toFirstLower») {
			this.«field.name.toFirstLower» = «field.name.toFirstLower»;
		}
		«ELSEIF field.datatype.qualifiedName.contains('java.util.List')»
		public «field.datatype.qualifiedName» get«field.name.toFirstUpper»() {
			return «field.name.toFirstLower»;
		}

		public void set«field.name.toFirstUpper»(«field.datatype.qualifiedName» «field.name.toFirstLower») {
			this.«field.name.toFirstLower»=«field.name.toFirstLower»;
		}
		«ENDIF»
		«ENDFOR»
	
		@Override
		public String toString() {
			return ToStringBuilder.reflectionToString(this);
		}
	}
	'''
	
}