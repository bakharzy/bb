package org.openinfinity.domain.repository;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.openinfinity.domain.entity.BuildingComplex;
import org.openinfinity.domain.entity.BulletinBoard;
import org.openinfinity.domain.entity.Sticker;

public class BulletinBoardRepositoryTest {

	BulletinBoardRepository boardRepo = new SimpleBulletinBoardRepository();
	@Before
	public void setUp() throws Exception {
	}
	@Test
	public void testSaveBulletinBoard() {
		BulletinBoard expected = createBulletinBoard();
		String id = boardRepo.saveBulletinBoard(expected);
		BulletinBoard actual = boardRepo.findBoardById(id);
		assertEquals(expected.getBuilding_id(),actual.getBuilding_id());
		assertEquals(expected.getId(),actual.getId());
		assertNotNull(actual.getId());
	}
	@Test
	public void testAddStickerToBoard() {
		BulletinBoard expected = createBulletinBoard();
		Sticker sticker = createSticker();
		String id = boardRepo.saveBulletinBoard(expected);
		boardRepo.addStickerToBoard(id, sticker);
		BulletinBoard actual = boardRepo.findBoardById(id);
		assertTrue(actual.getStickers().contains(sticker));
	}
//	@Test
//	public void testFindStickerById() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testFindAllStickers() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testRemoveStickerFromBoard() {
//		fail("Not yet implemented");
//	}
	private BulletinBoard createBulletinBoard(){
		BulletinBoard board = new BulletinBoard();
		board.setBuilding_id("test building id");
		return board;
	}
	
	private Sticker createSticker(){
		Sticker sticker = new Sticker();
		sticker.setPassword("pass");
		sticker.setBulletin_id("old id");
		return sticker;
	}
}
