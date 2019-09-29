package de.dc.entity.metro.demo.filter;

import org.apache.commons.lang.builder.ToStringBuilder;

public class LogSearchContent {

	private String name;
	private String value;
	private LogSearchType type;

	public LogSearchContent(String name, String value, LogSearchType type) {
		this.name = name;
		this.value = value;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public LogSearchType getType() {
		return type;
	}

	public void setType(LogSearchType type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
