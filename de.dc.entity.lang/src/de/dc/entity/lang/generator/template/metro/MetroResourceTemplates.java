package de.dc.entity.lang.generator.template.metro;

import de.dc.entity.lang.generator.template.IGenerator;
import de.dc.entity.lang.generator.template.resource.CreateSqlTemplate;
import de.dc.entity.lang.generator.template.resource.FxmlSearchPaneTemplate;
import de.dc.entity.model.Entity;

public enum MetroResourceTemplates {
	FXML(new MetroFxmlTemplate(), "/control/metro/"),
	CSS(new MetroCssTemplate(), "/control/metro/"),
	;
	
	private IGenerator<Entity> template;
	private String exportPath;
	
	private MetroResourceTemplates(IGenerator<Entity> template, String exportPath) {
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
