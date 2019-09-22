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
import de.dc.entity.lang.generator.template.base.NavigationTemplate
import java.util.Arrays

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
					if(!entity.generateDemo && (tpl==Templates.Demo || 
						tpl==Templates.ExtendedDemoApplication ||tpl==Templates.ExtendedDemoApplicationPane || 
						tpl==Templates.ExtendedDemoBaseApplicationPane)){
					}else{
						val tplPath = tpl.getExportPath(entity)
						val content = tpl.template.gen(entity)
						fsa.generateFile(exportPath+'/'+tplPath, content);
					}
				]
				
				ResourceTemplate.values().forEach[tpl|
					if(!entity.generateDemo && (tpl==ResourceTemplate.FXML_EXTENDED_DEMO || tpl==ResourceTemplate.CSS)){
						return
					}else{
						val tplPath = tpl.getExportPath(entity)
						val content = tpl.template.gen(entity)
						fsa.generateFile(exportPath+'/'+tplPath, content);
					}
				]
			}
		}
	}
}
