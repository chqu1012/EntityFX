package de.dc.entity.lang.generator.template;

import de.dc.entity.model.Entity;

public enum Templates {
	BaseRepository(new BaseRepositoryTemplates(), "/repository/"),
	ModelRepository(new ModelRepositoryTemplate(), "/repository/"),
	TableView(new TableViewTemplate(), "/control/"),
	FilteredTableView(new FilteredTableViewTemplate(), "/control/"),
	Formular(new FormularTemplate(), "/control/"),
	Model(new ModelTemplate(), "/model/"),
	ModelFX(new ModelFXTemplate(), "/model/"),
	EntityConstant(new EntityConstantTemplate(), "/model/"),
	DI(new DITemplate(), "/di/"),
	DIPlatform(new DIPlatformTemplate(), "/di/"),
	Demo(new DemoTemplate(), "/"),
	TableInitializer(new TableInitializerTemplate(), "/init/"),
	SearchContent(new SearchContentTemplate(), "/filter/"),
	SearchType(new SearchTypeTemplate(), "/filter/"),
	SearchPane(new SearchPaneTemplate(),"/filter/"),
	Exporter(new ExporterTemplate(), "/util/"),
	DetailsDialog(new DetailsDialogTemplate(), "/dialog/")
	;
	
	private IGenerator<Entity> template;
	private String exportPath;
	
	private Templates(IGenerator<Entity> template, String exportPath) {
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
