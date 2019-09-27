package de.dc.entity.lang.generator

import com.google.inject.Inject
import de.dc.entity.lang.templates.ResourceTemplate
import de.dc.entity.lang.templates.Templates
import de.dc.entity.lang.templates.base.metro.MetroAppTemplates
import de.dc.entity.lang.templates.base.metro.MetroResourceTemplates
import de.dc.entity.lang.templates.base.metro.MetroTemplates
import de.dc.entity.lang.templates.spring.SpringTemplates
import de.dc.entity.lang.templates.spring.SpringEntityTemplate
import de.dc.entity.model.Entity
import de.dc.entity.model.Metro
import de.dc.entity.model.SpringMetro
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.xbase.compiler.JvmModelGenerator

class EntityDslGenerator implements IGenerator {
	
	@Inject package JvmModelGenerator jvmModelGenerator
	@Inject extension IQualifiedNameProvider

	override void doGenerate(Resource input, IFileSystemAccess fsa) { 
		jvmModelGenerator.doGenerate(input, fsa)
		
		generateEntity(input, fsa)
		generateMetro(input, fsa)
		generateSpringMetro(input, fsa)
	}
	
	def generateSpringMetro(Resource resource, IFileSystemAccess fsa) {
		for(item : resource.allContents.toIterable.filter(SpringMetro)){
			SpringTemplates.values.forEach[tpl|
				val exportPath = item.packagePath.replace('.', '/')
				val tplPath = tpl.getExportPath(item)
				val content = tpl.template.gen(item)
				fsa.generateFile(exportPath+'/'+tplPath, content);
			]
		}
	}
	
	def generateMetro(Resource resource, IFileSystemAccess fsa) {
		for(item : resource.allContents.toIterable.filter(Metro)){
			MetroAppTemplates.values.forEach[tpl|
				val exportPath = item.packagePath.replace('.', '/')
				val tplPath = tpl.getExportPath(item)
				val content = tpl.template.gen(item)
				fsa.generateFile(exportPath+'/'+tplPath, content);
			]
		}
	}
	
	def generateEntity(Resource input, IFileSystemAccess fsa) {
		for(entity : input.allContents.toIterable.filter(Entity)){
			val exportPath = entity.packagePath.replace('.', '/')
			if(entity.useSpring){
				SpringEntityTemplate.values.forEach[tpl|
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
			
//			MetroTemplates.values.forEach[tpl|
//				val tplPath = tpl.getExportPath(entity)
//				val content = tpl.template.gen(entity)
//				fsa.generateFile(exportPath+'/'+tplPath, content);
//			]
//			
//			MetroResourceTemplates.values.forEach[tpl|
//					val tplPath = tpl.getExportPath(entity)
//					val content = tpl.template.gen(entity)
//					fsa.generateFile(exportPath+'/'+tplPath, content);
//			]
		}
	}
}
