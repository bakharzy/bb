package org.openinfinity.domain.repository;

import java.util.Collection;
import java.util.LinkedList;
import java.util.UUID;

import org.openinfinity.domain.entity.Comment;
import org.openinfinity.domain.entity.StickerType;

public class SimpleStickerTypeRepository implements StickerTypeRepository {

	
	Collection<StickerType> stManager = new LinkedList<StickerType>();
	
	@Override
	public String saveStickerType(StickerType type) {
		type.setId(UUID.randomUUID().toString());
		stManager.add(type);
		return type.getId();
	}

	@Override
	public void removeStickerType(StickerType type) {
		stManager.remove(type);
	}

	@Override
	public Collection<StickerType> findAll() {
		return stManager;
	}

}
