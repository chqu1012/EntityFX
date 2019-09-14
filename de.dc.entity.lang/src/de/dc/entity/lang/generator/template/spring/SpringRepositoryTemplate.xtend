package de.dc.entity.lang.generator.template.spring

import de.dc.entity.model.Entity
import de.dc.entity.lang.generator.template.IGenerator

class SpringRepositoryTemplate implements IGenerator<Entity>{
	
	override filename(Entity t) {
		t.name.toFirstUpper+'Repository'
	}
	
	override gen(Entity t)'''
	package «t.packagePath».repository;
	
	import «t.packagePath».model.*;
	import java.util.List;
	
	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.stereotype.Repository;
	
	«val name = t.name.toFirstUpper»
	@Repository
	public interface «name»Repository extends JpaRepository<«name», Long>{
	}
	'''
	
}