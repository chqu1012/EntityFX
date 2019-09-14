package de.dc.entity.lang.generator

import com.google.inject.Inject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.xbase.compiler.JvmModelGenerator
import de.dc.entity.model.Entity
import de.dc.entity.lang.generator.template.Templates
import de.dc.entity.lang.generator.template.ResourceTemplate
import de.dc.entity.lang.generator.template.spring.SpringTemplates

class EntityDslGenerator implements IGenerator {
	
	@Inject package JvmModelGenerator jvmModelGenerator
	@Inject extension IQualifiedNameProvider

	override void doGenerate(Resource input, IFileSystemAccess fsa) { 
		jvmModelGenerator.doGenerate(input, fsa)
		for(entity : input.allContents.toIterable.filter(Entity)){
			val exportPath = entity.packagePath.replace('.', '/')
			if(entity.useSpring){
				SpringTemplates.values.forEach[tpl|
					if((entity.generateDemo && tpl==SpringTemplates.Demo)){
						return
					}
					val tplPath = tpl.getExportPath(entity)
					val content = tpl.template.gen(entity)
					fsa.generateFile(exportPath+'/'+tplPath, content);
				]			
			}else{
				Templates.values().forEach[tpl|
					val tplPath = tpl.getExportPath(entity)
					val content = tpl.template.gen(entity)
					fsa.generateFile(exportPath+'/'+tplPath, content);
				]
				
				ResourceTemplate.values().forEach[tpl|
					val tplPath = tpl.getExportPath(entity)
					val content = tpl.template.gen(entity)
					fsa.generateFile(exportPath+'/'+tplPath, content);
				]
			}
		}
	}
}
