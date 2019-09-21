package de.dc.entity.lang.generator.template;

import de.dc.entity.lang.generator.template.resource.*;
import de.dc.entity.model.Entity;

public enum ResourceTemplate {
	CREATE_SQL(new CreateSqlTemplate(), "/init/"),
	FXML_SEARCH_PANEL(new FxmlSearchPaneTemplate(), "/filter/"),
	FXML_EXTENDED_DEMO(new ExtendedFxmlDemoApplicationPaneTemplate(), "/extended/"),
	; 
	
	private IGenerator<Entity> template;
	private String exportPath;
	
	private ResourceTemplate(IGenerator<Entity> template, String exportPath) {
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
