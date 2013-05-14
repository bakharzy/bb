package org.openinfinity.domain.repository;

import java.util.Collection;
import org.openinfinity.domain.entity.BuildingComplex;
import org.openinfinity.domain.entity.BulletinBoard;
import org.openinfinity.domain.entity.Sticker;

public interface BulletinBoardRepository {


	String saveBulletinBoard(BulletinBoard board);
		
	void addSticker(String board_id,Sticker sticker);	
	
	Collection<Sticker> findAllStickers(String board_id);
	
	Sticker addStickerToBoard(Sticker sticker);
	
	void removeStickerFromBoard(Sticker sticker);
	
	Sticker updateStickerOfBoard(Sticker sticker);
	
}
