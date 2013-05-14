package org.openinfinity.domain.service;

import java.util.Collection;
import org.openinfinity.domain.entity.BuildingComplex;
import org.openinfinity.domain.entity.BulletinBoard;
import org.openinfinity.domain.entity.Sticker;

public interface BulletinBoardService {


	String createBulletinBoard(String buildingComplexId);
		
	void addSticker(Sticker sticker);
	
	void deleteSticker(Sticker sticker);
	
	Sticker findStickerById(String sticker_id);
	
	Collection<Sticker> findAllStickers();
	
	//---- Mohammad
	void deleteBulletinBoard(BulletinBoard bulletinBoard);
	//we should delete all the stickers related to the board
	
	Sticker addStickerToBoard(Sticker sticker);
	
	void removeStickerFromBoard(Sticker sticker);
	
	Sticker updateStickerOfBoard(Sticker sticker);
	
}
