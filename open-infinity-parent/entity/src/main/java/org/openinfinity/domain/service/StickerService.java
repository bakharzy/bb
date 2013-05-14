package org.openinfinity.domain.service;

import org.openinfinity.domain.entity.Sticker;



public interface StickerService {

		String create(Sticker sticker);
		
		void delete (Sticker sticker);
		
		String update (Sticker sticker);
		
		
}
