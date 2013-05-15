package org.openinfinity.domain.entity;

import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.NonNull;

import org.openinfinity.core.annotation.NotScript;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Sticker {

	@Id @NotScript
	private String id;
	@NotScript 
	private String bulletin_id;
	@NotScript 
	private String type_Id;
	@NotScript @NotNull 
	private String email;
	@NotScript @NotNull 
	private String password;
	@NotScript 
	private int reportCount;
	@NotScript 
	private String summary;
	@NotScript @NotNull 
	private String title;
	@NotScript @NotNull 
	private String description;
	@NotScript @NotNull 
	private String expiration_date;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBulletin_id() {
		return bulletin_id;
	}
	public void setBulletin_id(String bulletin_id) {
		this.bulletin_id = bulletin_id;
	}
	public String getType_Id() {
		return type_Id;
	}
	public void setType_Id(String type_Id) {
		this.type_Id = type_Id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getReportCount() {
		return reportCount;
	}
	public void increaseReporCount() {
		this.reportCount++;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getExpiration_date() {
		return expiration_date;
	}
	public void setExpiration_date(String expiration_date) {
		this.expiration_date = expiration_date;
	}
	
	
	
}
