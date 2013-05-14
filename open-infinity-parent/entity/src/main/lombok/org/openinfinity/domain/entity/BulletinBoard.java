package org.openinfinity.domain.entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import lombok.Data;

import org.openinfinity.core.annotation.NotScript;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class BulletinBoard {

	@Id @NotScript
	private String id;
	
	@NotScript 
	private String building_id;
	
	
	private Collection<Sticker> stickers = Collections.checkedCollection(new ArrayList<Sticker>(), Sticker.class);
		
	public void addSticker(Sticker sticker){
		this.stickers.add(sticker);
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBuilding_id() {
		return building_id;
	}

	public void setBuilding_id(String building_id) {
		this.building_id = building_id;
	}
	
	
	
}
