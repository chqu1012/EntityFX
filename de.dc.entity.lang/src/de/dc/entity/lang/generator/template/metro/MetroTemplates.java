package de.dc.entity.lang.generator.template.metro;

import de.dc.entity.lang.generator.template.IGenerator;
import de.dc.entity.model.Entity;

public enum MetroTemplates {
	Pane(new MetroPaneTemplate(), "/control/metro/"),
	Demo(new MetroPaneApplicationTemplate(), "/"),
	;
	
	private IGenerator<Entity> template;
	private String exportPath;
	
	private MetroTemplates(IGenerator<Entity> template, String exportPath) {
		this.template = template;
		this.exportPath = exportPath;
	}

	public String getExportPath(Entity t) {
		return exportPath+getTemplate().filename(t);
	}
	
	public IGenerator<Entity> getTemplate() {
		return template;
	}
}
