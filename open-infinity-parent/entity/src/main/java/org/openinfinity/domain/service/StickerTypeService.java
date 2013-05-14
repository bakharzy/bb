package org.openinfinity.domain.service;

import java.util.Collection;

import org.openinfinity.domain.entity.StickerType;

public interface StickerTypeService {

		String saveStickerType(StickerType type);
		
		void removeStickerType(StickerType type);
		
		Collection<StickerType> findAll();
		
		void updateStickerType(StickerType type);
}
