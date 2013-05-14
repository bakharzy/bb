package org.openinfinity.domain.repository;

import java.util.Collection;

import org.openinfinity.domain.entity.Sticker;
import org.openinfinity.domain.entity.StickerType;



public interface StickerRepository {

		String create(Sticker sticker);
		
		void delete (Sticker sticker);
		
		String update (Sticker sticker);
		
		String reportSticker(Sticker sticker);
		
		Sticker findStickerById(String id);
		
		Collection<Sticker> findAll();
		
		Collection<Sticker> findByType(StickerType type);				
}
