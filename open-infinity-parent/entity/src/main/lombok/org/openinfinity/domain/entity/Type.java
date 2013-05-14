package org.openinfinity.domain.entity;

import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.NonNull;

import org.openinfinity.core.annotation.NotScript;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Type {

	@Id @NotScript
	private String id;
	
	@Id @NotScript @NotNull @NonNull
	private String name;
	
}
