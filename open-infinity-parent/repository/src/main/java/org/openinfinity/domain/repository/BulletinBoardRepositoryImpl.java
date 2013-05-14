package org.openinfinity.domain.repository;

import java.util.Collection;

import org.openinfinity.domain.entity.BulletinBoard;
import org.openinfinity.domain.entity.Sticker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

@Repository
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
		
		BulletinBoard board = dbManager
				.findById(new Query(Criteria.where("id").is(board_id)), BulletinBoard.class);
		board.addSticker(sticker);
		dbManager.save(sticker);
		dbManager.findAndModify(new Query(Criteria.where("id").is(board_id)), 
				Update.update("stickers", board.getStickers()), BulletinBoard.class);
		
	}

	@Override
	public Collection<Sticker> findAllStickers(String board_id){
		BulletinBoard board = dbManager
				.findById(new Query(Criteria.where("id").is(board_id)), BulletinBoard.class);
		return board.getStickers();
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