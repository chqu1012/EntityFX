package de.dc.entity.lang.generator.template.spring;

import de.dc.entity.lang.generator.template.IGenerator;
import de.dc.entity.model.Entity;

public enum SpringTemplates {
	TableView(new SpringTableViewTemplate(), "/control/"),
	Formular(new SpringFormularTemplate(), "/control/"),
	Model(new SpringModelTemplate(), "/model/"),
	ModelFX(new SpringModelFXTemplate(), "/model/"),
	Demo(new SpringDemoTemplate(), "/"),
	SearchContent(new SpringSearchContentTemplate(), "/filter/"),
	SearchType(new SpringSearchTypeTemplate(), "/filter/"),
	SearchPane(new SpringSearchPaneTemplate(),"/filter/"),
	Repository(new SpringRepositoryTemplate(), "/repository/"),
	;
	private IGenerator<Entity> template;
	private String exportPath;
	
	private SpringTemplates(IGenerator<Entity> template, String exportPath) {
		this.template = template;
		this.exportPath = exportPath;
	}

	public String getExportPath(Entity t) {
		return exportPath+getTemplate().filename(t)+".java";
	}
	
	public IGenerator<Entity> getTemplate() {
		return template;
	}
}
