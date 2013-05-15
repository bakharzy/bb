package org.openinfinity.domain.service;

import java.util.Collection;

import org.openinfinity.domain.entity.BulletinBoard;
import org.openinfinity.domain.entity.Sticker;
import org.openinfinity.domain.repository.BulletinBoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BulletinBoardServiceImpl implements BulletinBoardService {

	@Autowired
	BulletinBoardRepository repo;
	
	@Override
	public String createBulletinBoard(String buildingComplexId) {
		BulletinBoard board = new BulletinBoard();
		board.setBuilding_id(buildingComplexId);
		repo.saveBulletinBoard(board);
		return board.getId();
	}

	@Override
	public void addStickerToBoard(String bulletin_id,Sticker sticker) {
		repo.addStickerToBoard(bulletin_id, sticker);		
	}

	@Override
	public Sticker findStickerById(String bulletin_id,String sticker_id) {		
		return repo.findStickerById(bulletin_id,sticker_id);
	}

	@Override
	public Collection<Sticker> findAllStickers(String bulletin_id) {		
		return repo.findAllStickers(bulletin_id);
	}

	@Override
	public void removeStickerFromBoard(Sticker sticker) {
		repo.removeStickerFromBoard(sticker);
		
	}

	@Override
	public Collection<BulletinBoard> listAllBoards() {
		
		return repo.listAllBoards();
	}

	@Override
	public BulletinBoard findBoardById(String board_id) {
		
		return repo.findBoardById(board_id);
	}

}
