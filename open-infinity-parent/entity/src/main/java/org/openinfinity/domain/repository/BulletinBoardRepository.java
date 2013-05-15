package org.openinfinity.domain.repository;

import java.util.Collection;
import org.openinfinity.domain.entity.BuildingComplex;
import org.openinfinity.domain.entity.BulletinBoard;
import org.openinfinity.domain.entity.Sticker;

public interface BulletinBoardRepository {


	String saveBulletinBoard(BulletinBoard board);
		
	void addStickerToBoard(String board_id,Sticker sticker);
	
	Sticker findStickerById(String bulletin_id,String sticker_id);
	
	Collection<Sticker> findAllStickers(String board_id);
	
	void removeStickerFromBoard(Sticker sticker);
	
}
