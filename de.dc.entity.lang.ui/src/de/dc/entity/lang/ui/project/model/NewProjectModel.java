package de.dc.entity.lang.ui.project.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class NewProjectModel extends ModelObject{

	private String name;
	private String packagePath;
	private boolean useSpring;
	private boolean showDetailsPane;
	private boolean useSearchPane;
	
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

	public String getPackagePath() {
		return packagePath;
	}

	public void setPackagePath(String packagePath) {
		firePropertyChange("packagePath", this.packagePath, this.packagePath = packagePath);
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
