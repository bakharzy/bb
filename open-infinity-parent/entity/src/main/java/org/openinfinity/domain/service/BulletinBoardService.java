package org.openinfinity.domain.service;

import java.util.Collection;
import org.openinfinity.domain.entity.BuildingComplex;
import org.openinfinity.domain.entity.BulletinBoard;
import org.openinfinity.domain.entity.Sticker;

public interface BulletinBoardService {


	String createBulletinBoard(String buildingComplexId);
		
	void addStickerToBoard(String bulletin_id,Sticker sticker);	
	
	Sticker findStickerById(String bulletin_id, String sticker_id);
	
	Collection<Sticker> findAllStickers(String bulletin_id);
		
	void removeStickerFromBoard(Sticker sticker);
	
	
}
