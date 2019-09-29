package de.dc.entity.metro.demo.history.filter;

import org.apache.commons.lang.builder.ToStringBuilder;

public class LogHistorySearchContent {

	private String name;
	private String value;
	private LogHistorySearchType type;

	public LogHistorySearchContent(String name, String value, LogHistorySearchType type) {
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

	public LogHistorySearchType getType() {
		return type;
	}

	public void setType(LogHistorySearchType type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
