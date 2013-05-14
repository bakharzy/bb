package org.openinfinity.domain.repository;

import java.util.Collection;

import org.openinfinity.domain.entity.StickerType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StickerTypeRepositoryImpl implements StickerTypeRepository {

    @Autowired 
    MongoTemplate dbManager;
    
	@Override
	public String saveStickerType(StickerType type) {
		dbManager.save(type);
		return type.getId();
	}

	@Override
	public void removeStickerType(StickerType type) {
		dbManager.remove(type);
		
	}

	@Override
	public Collection<StickerType> findAll() {
		
		return dbManager.findAll(StickerType.class);
	}



}
