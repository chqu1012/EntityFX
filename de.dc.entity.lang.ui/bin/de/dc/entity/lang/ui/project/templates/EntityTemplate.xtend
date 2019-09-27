package de.dc.entity.lang.ui.project.templates

import de.dc.entity.lang.ui.project.model.NewProjectModel

class EntityTemplate {
	
	def static String genMetroDemo(NewProjectModel model)'''
	packagePath «model.name.toLowerCase»
	
	Metro «model.entityName»{
		title: "My Application"
		subtitle: "Small description for this application"
		mainNavigation: «model.entityName»
		«IF model.isUseHistory»
		navigations: «model.entityName»History
		«ENDIF»
	}
	'''
	
	def static String gen(NewProjectModel model)'''
	packagePath «model.name»
	
	Entity «model.entityName»{
		useSpring: «model.useSpring» 
	  	showDetailsPanel: «model.showDetailsPane»
	  	showSearchPanel: «model.useSearchPane»
	  	
	  	generateDemo: «model.generateDemo»
	  	
		Field(name: Name, datatype:String, required: true, useByTableView: true, useByRepository: true)[ 
			control: javafx.scene.control.TextField
		] 
		Field(name: Message, datatype:String, required: true, useByTableView: true, useByRepository: true)[ 
			control: javafx.scene.control.TextField
		]
		Field(name: Status, datatype:Integer, required: true, useByTableView: true, useByRepository: true)[ 
			control: javafx.scene.control.TextField
			]
		Field(name: CreatedOn, datatype:java.time.LocalDateTime, required: true, useByTableView: true, useByRepository: true)[ 
			control: jfxtras.scene.control.LocalDateTimeTextField
			binding: localDateTimeProperty
		]
		Field(name: UpdatedOn, datatype:java.time.LocalDateTime, required: true, useByTableView: true, useByRepository: true)[ 
			control: jfxtras.scene.control.LocalDateTimeTextField
			binding: localDateTimeProperty
		]
		
		Repository{
			jdbcUrl: "jdbc:h2:file:./data/Repository;DB_CLOSE_ON_EXIT=true;"
		}
	}
	'''

	def static String genHistory(NewProjectModel model)'''
	packagePath «model.name».history
	
	Entity «model.entityName»History{
		useSpring: «model.useSpring» 
	  	showDetailsPanel: false
	  	showSearchPanel: false
	  	
	  	generateDemo: false
		
		Field(name: Name, datatype:String, required: true, useByTableView: true, useByRepository: true)[ 
			control: javafx.scene.control.TextField
		] 
		Field(name: Message, datatype:String, required: true, useByTableView: true, useByRepository: true)[ 
			control: javafx.scene.control.TextField
		]
		Field(name: Status, datatype:Integer, required: true, useByTableView: true, useByRepository: true)[ 
			control: javafx.scene.control.TextField
		]
		
		Field(name: CreatedOn, datatype:java.time.LocalDateTime, required: true, useByTableView: true, useByRepository: true)[ 
			control: jfxtras.scene.control.LocalDateTimeTextField
			binding: localDateTimeProperty
		]
				
		Repository{
			jdbcUrl: "jdbc:h2:file:./data/Repository;DB_CLOSE_ON_EXIT=true;"
		}
	}
	'''
}