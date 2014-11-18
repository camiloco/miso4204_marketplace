/* ========================================================================
 * Copyright 2014 miso4204
 *
 * Licensed under the MIT, The MIT License (MIT)
 * Copyright (c) 2014 miso4204

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
 * ========================================================================


Source generated by CrudMaker version 1.0.0.qualifier

*/

package co.edu.uniandes.csw.miso4204.wishlistitem.persistence.converter;

import java.util.ArrayList;
import java.util.List;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;


import co.edu.uniandes.csw.miso4204.wishlistitem.logic.dto.WishListItemDTO;
import co.edu.uniandes.csw.miso4204.wishlistitem.persistence.entity.WishListItemEntity;

public abstract class _WishListItemConverter {

	public static WishListItemDTO entity2PersistenceDTO(WishListItemEntity entity){
		if (entity != null) {
			WishListItemDTO dto = new WishListItemDTO();
					dto.setId(entity.getId());
					dto.setProductId(entity.getProductId());
			return dto;
		}else{
			return null;
		}
	}
	
	public static WishListItemEntity persistenceDTO2Entity(WishListItemDTO dto){
		if(dto!=null){
			WishListItemEntity entity=new WishListItemEntity();
					entity.setId(dto.getId());
			
					entity.setProductId(dto.getProductId());
			
			return entity;
		}else {
			return null;
		}
	}
	
	public static List<WishListItemDTO> entity2PersistenceDTOList(List<WishListItemEntity> entities){
		List<WishListItemDTO> dtos=new ArrayList<WishListItemDTO>();
		for(WishListItemEntity entity:entities){
			dtos.add(entity2PersistenceDTO(entity));
		}
		return dtos;
	}
	
	public static List<WishListItemEntity> persistenceDTO2EntityList(List<WishListItemDTO> dtos){
		List<WishListItemEntity> entities=new ArrayList<WishListItemEntity>();
		for(WishListItemDTO dto:dtos){
			entities.add(persistenceDTO2Entity(dto));
		}
		return entities;
	}
}