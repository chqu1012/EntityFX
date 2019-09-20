package de.dc.entity.lang.ui.project.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class NewProjectModel extends ModelObject {

	private String name;
	private String entityName;
	private boolean useSpring = true;
	private boolean showDetailsPane = true;
	private boolean useSearchPane = true;
	private boolean generateDemo = true;
	private boolean useGradle = false;
	
	public boolean isUseGradle() {
		return useGradle;
	}

	public void setUseGradle(boolean useGradle) {
		firePropertyChange("useGradle", this.useGradle, this.useGradle = useGradle);
	}

	public boolean isGenerateDemo() {
		return generateDemo;
	}

	public void setGenerateDemo(boolean generateDemo) {
		firePropertyChange("generateDemo", this.generateDemo, this.generateDemo = generateDemo);
	}

	public boolean isUseSpring() {
		return useSpring;
	}

	public void setUseSpring(boolean useSpring) {
		firePropertyChange("useSpring", this.useSpring, this.useSpring = useSpring);
	}

	public boolean isShowDetailsPane() {
		return showDetailsPane;
	}

	public void setShowDetailsPane(boolean showDetailsPane) {
		firePropertyChange("showDetailsPane", this.showDetailsPane, this.showDetailsPane = showDetailsPane);
	}

	public boolean isUseSearchPane() {
		return useSearchPane;
	}

	public void setUseSearchPane(boolean useSearchPane) {
		firePropertyChange("useSearchPane", this.useSearchPane, this.useSearchPane = useSearchPane);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		firePropertyChange("name", this.name, this.name = name);
	}

	public String getEntityName() {
		return entityName;
	}

	public void setEntityName(String entityName) {
		firePropertyChange("entityName", this.entityName, this.entityName = entityName);
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
