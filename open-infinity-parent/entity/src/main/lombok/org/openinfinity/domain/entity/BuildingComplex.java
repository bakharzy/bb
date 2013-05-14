package org.openinfinity.domain.entity;

import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.NonNull;

import org.openinfinity.core.annotation.NotScript;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class BuildingComplex {
	@Id @NotScript
	private String id;
	
	@NotScript @NotNull @NonNull
	private String address;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
