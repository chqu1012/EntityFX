package de.dc.entity.lang.generator.template.resource

import de.dc.entity.lang.generator.template.EntityConstantTemplate
import de.dc.entity.lang.generator.template.IGenerator
import de.dc.entity.model.Entity
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime
import java.time.format.DateTimeFormatter
import java.util.Random
import java.util.UUID
import org.eclipse.xtext.common.types.JvmTypeReference

class CreateSqlTemplate implements IGenerator<Entity>{
	
	val formatter = DateTimeFormatter.ofPattern('ddMMyyyy hh:mm')
	
	override filename(Entity t)'''create.sql'''
	
	override gen(Entity t)'''
	«val parametersWithDatatype = t.field.filter[useByRepository].map[it.name.splitCamelCaseString.map[it].reduce[p1, p2|p1+'_'+p2].toUpperCase+' '+it.datatype.value].reduce[p1, p2|p1+', '+p2]»
	«val parameters = t.field.filter[useByRepository].map[it.name.splitCamelCaseString.map[it].reduce[p1, p2|p1+'_'+p2].toUpperCase].reduce[p1, p2|p1+', '+p2]»
	CREATE TABLE IF NOT EXISTS «t.name.splitCamelCaseString.map[it].reduce[p1, p2|p1+'_'+p2].toUpperCase»(ID BIGINT AUTO_INCREMENT, «parametersWithDatatype»);
	«IF t.repository!==null»
	«IF t.repository.generateDummyInsert»
	«FOR i : 1..50»
	INSERT INTO «t.name.toUpperCase»(«parameters») VALUES(«t.parameterValues»);
	«ENDFOR»
	«ENDIF»
	«ENDIF»
	'''
	
	def getParameterValues(Entity t){
		t.field.filter[useByRepository].map[it.datatype.randomValue].reduce[p1, p2|p1+', '+p2]
	}
	
	val Random random = new Random
	
	def getRandomValue(JvmTypeReference reference){
		switch (reference.simpleName) {
			case 'String': return "\'"+UUID.randomUUID().toString+"\'"
			case 'Integer': return random.nextInt(50)
			case 'int': return random.nextInt(50)
			case 'LocalDateTime': return '''PARSEDATETIME('«randomeLocalDateTime»', 'ddMMyyyy hh:mm')'''
			case 'LocalDate': return '''PARSEDATETIME('«randomeLocalDateTime»', 'ddMMyyyy hh:mm')'''
			case 'Boolean': return random.nextBoolean
			case 'bool': return random.nextBoolean
			case 'Float': return random.nextInt(50)+'f'
			case 'float': return random.nextInt(50)+'f'
			case 'Double': return random.nextInt(50)+'d'
			case 'double': return random.nextInt(50)+'d'
			case 'Long': return random.nextInt(50)+'l'
			case 'long': return random.nextInt(50)+'l'
			default: return "\'"+UUID.randomUUID().toString+"\'"
		}
	}
	
	def String getRandomeLocalDateTime(){
		val time = LocalDateTime.of(LocalDate.now(), 
            LocalTime.of(random.nextInt(24), random.nextInt(60),
            random.nextInt(60), random.nextInt(999999999 + 1)));
        time.format(formatter)
	}
	
	def String getValue(JvmTypeReference type){
		EntityConstantTemplate::getSqlValue(type)
	}
	
	def splitCamelCaseString(String s) {
		EntityConstantTemplate::splitCamelCaseString(s)
	}
}