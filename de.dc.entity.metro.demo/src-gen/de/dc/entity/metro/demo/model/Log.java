package de.dc.entity.metro.demo.model;

import java.util.*;
import java.time.*;
import org.apache.commons.lang.builder.ToStringBuilder;
import javax.persistence.*;

@Entity
public class Log{

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
	@Column(nullable = true)
	private LocalDateTime updatedOn;
	
	public Log() {
	}
		
	public Log(String name, String message, Integer status, LocalDateTime createdOn, LocalDateTime updatedOn) {
		this.name = name;
		this.message = message;
		this.status = status;
		this.createdOn = createdOn;
		this.updatedOn = updatedOn;
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
	public LocalDateTime getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(LocalDateTime updatedOn) {
		this.updatedOn = updatedOn;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
