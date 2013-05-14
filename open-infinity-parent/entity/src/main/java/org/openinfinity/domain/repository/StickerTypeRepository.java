package org.openinfinity.domain.repository;

import java.util.Collection;

import org.openinfinity.domain.entity.StickerType;

public interface StickerTypeRepository {

		String saveStickerType(StickerType type);
		
		void removeStickerType(StickerType type);
		
		Collection<StickerType> findAll();

}
