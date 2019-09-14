package de.dc.entity.lang.generator.template

import de.dc.entity.model.Entity
import org.eclipse.xtext.common.types.JvmTypeReference

class EntityConstantTemplate implements IGenerator<Entity>{
	
	override filename(Entity t)'''«t.name»Constant'''
	
	override gen(Entity t)'''
	package «t.packagePath».model;
	
	public class «t.name.toFirstUpper»Constant {
	  «val name = t.name.splitCamelCaseString.map[it.toUpperCase].reduce[p1, p2|p1+'_'+p2]»
	  public static final String SQL_FIND_ALL = "SELECT * FROM «name» ORDER BY ID DESC";
	  
	  public static final String SQL_FIND_BY_ID = "SELECT * FROM «name» WHERE ID = %s";
	  «val parameters = t.field.filter[useByRepository].map[it.name.splitCamelCaseString.map[it].reduce[p1, p2|p1+'_'+p2].toUpperCase].reduce[p1, p2|p1+', '+p2]»
	  «val marks = t.field.filter[useByRepository].map['?'].reduce[p1, p2|p1+', '+p2]»
	  public static final String SQL_INSERT = "INSERT INTO «name» («parameters») VALUES («marks»)";
	  
	  public static final String SQL_MERGE = "MERGE INTO «name» KEY (ID) VALUES («marks», ?)";
	  
	  public static final String SQL_DELETE_BY_ID = "DELETE «name» WHERE ID = ?";
	  «val createParameters = t.field.filter[useByRepository].map[it.name.splitCamelCaseString.map[it].reduce[p1, p2|p1+'_'+p2].toUpperCase+ ' ' + datatype.sqlValue].reduce[p1, p2|p1+', '+p2]»
	  public static final String SQL_CREATE = "CREATE TABLE IF NOT EXISTS «name»(ID BIGINT AUTO_INCREMENT, «createParameters»);";
	  «IF t.repository!==null»
	  «FOR statements : t.repository.statement»
	  public static final String SQL_«statements.name.splitCamelCaseString.map[it.toUpperCase].reduce[p1, p2|p1+'_'+p2]» = "«statements.query»";
	  «ENDFOR»
	  «ENDIF»
	}
	'''
	
	def static getSqlValue(JvmTypeReference reference){
		switch (reference.simpleName) {
			case 'String': return 'VARCHAR'
			case 'Integer': return 'BIGINT'
			case 'int': return 'BIGINT'
			case 'LocalDateTime': return 'TIMESTAMP'
			case 'LocalDate': return 'TIMESTAMP'
			case 'Boolean': return 'BOOLEAN'
			case 'bool': return 'BOOLEAN'
			case 'Float': return 'FLOAT'
			case 'float': return 'FLOAT'
			case 'Double': return 'Double'
			case 'double': return 'Double'
			default: return 'VARCHAR'
		}
	}
	
	def static splitCamelCaseString(String s) {
  		s.split("(?<!(^|[A-Z]))(?=[A-Z])|(?<!^)(?=[A-Z][a-z])")
  	}
	
}