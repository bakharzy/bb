package org.openinfinity.domain.repository;

import java.util.Collection;

import org.openinfinity.domain.entity.BulletinBoard;
import org.openinfinity.domain.entity.Sticker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

public class BulletinBoardRepositoryImpl implements BulletinBoardRepository {

	@Autowired
	MongoTemplate dbManager;
	
	@Override
	public String saveBulletinBoard(BulletinBoard board) {
		dbManager.save(board);
		return board.getId();
	}

	@Override
	public void addSticker(String board_id,Sticker sticker) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Sticker findStickerById(String sticker_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Sticker> findAllStickers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Sticker addStickerToBoard(Sticker sticker) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeStickerFromBoard(Sticker sticker) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Sticker updateStickerOfBoard(Sticker sticker) {
		// TODO Auto-generated method stub
		return null;
	}

}
