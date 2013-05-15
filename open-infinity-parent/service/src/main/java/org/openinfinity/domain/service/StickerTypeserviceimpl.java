package org.openinfinity.domain.service;

import java.util.Collection;

import org.openinfinity.domain.entity.StickerType;
import org.openinfinity.domain.repository.StickerTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StickerTypeserviceimpl implements StickerTypeService{
	@Autowired
	StickerTypeRepository repo;

	@Override
	public String saveStickerType(StickerType type) {
		repo.saveStickerType(type);
		return type.getId();
	}

	@Override
	public void removeStickerType(StickerType type) {
		repo.removeStickerType(type);		
	}

	@Override
	public Collection<StickerType> findAll() {
		return repo.findAll();
	}


}
