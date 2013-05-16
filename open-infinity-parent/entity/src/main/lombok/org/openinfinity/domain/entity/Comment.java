package org.openinfinity.domain.entity;

import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.NonNull;

import org.openinfinity.core.annotation.NotScript;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Comment {
	
	@Id @NotScript
	private String id;
	@NotScript @NotNull 
	private String sticker_id;
	@NotScript @NotNull 
	private String commentor_name;
	@NotScript @NotNull 
	private String comment_text;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSticker_id() {
		return sticker_id;
	}
	public void setSticker_id(String sticker_id) {
		this.sticker_id = sticker_id;
	}
	public String getCommentor_name() {
		return commentor_name;
	}
	public void setCommentor_name(String commentor_name) {
		this.commentor_name = commentor_name;
	}
	public String getComment_text() {
		return comment_text;
	}
	public void setComment_text(String comment_text) {
		this.comment_text = comment_text;
	}
	
	
	
}
