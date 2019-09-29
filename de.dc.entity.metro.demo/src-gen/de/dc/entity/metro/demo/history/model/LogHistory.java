package de.dc.entity.metro.demo.history.model;

import java.util.*;
import java.time.*;
import org.apache.commons.lang.builder.ToStringBuilder;
import javax.persistence.*;

@Entity
public class LogHistory{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", nullable = false, columnDefinition = "BIGINT")
	private Long id;
	@Column(nullable = true)
	private String name;
	@Column(nullable = true)
	private String message;
	@Column(nullable = true)
	private Integer status;
	@Column(nullable = true)
	private LocalDateTime createdOn;
	
	public LogHistory() {
	}
		
	public LogHistory(String name, String message, Integer status, LocalDateTime createdOn) {
		this.name = name;
		this.message = message;
		this.status = status;
		this.createdOn = createdOn;
	}
	
	public Long getId(){
		return id;
	}
	
	public void setId(Long id){
		this.id=id;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
	public LocalDateTime getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(LocalDateTime createdOn) {
		this.createdOn = createdOn;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
