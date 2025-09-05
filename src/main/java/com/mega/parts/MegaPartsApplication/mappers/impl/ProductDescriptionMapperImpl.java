package com.mega.parts.MegaPartsApplication.mappers.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.mega.parts.MegaPartsApplication.domain.dto.ProductDescriptionDTO;
import com.mega.parts.MegaPartsApplication.domain.entities.ProductDescriptionEntity;
import com.mega.parts.MegaPartsApplication.mappers.Mapper;

@Component
public class ProductDescriptionMapperImpl implements Mapper<ProductDescriptionEntity, ProductDescriptionDTO> {

	
	private ModelMapper modelMapper;
	
	
	
	
	public ProductDescriptionMapperImpl(ModelMapper modelMapper) {
		this.modelMapper = modelMapper;
	}

	@Override
	public ProductDescriptionDTO mapTo(ProductDescriptionEntity a) {
		// TODO Auto-generated method stub
		return modelMapper.map(a,ProductDescriptionDTO.class);
	}

	@Override
	public ProductDescriptionEntity mapFrom(ProductDescriptionDTO b) {
		// TODO Auto-generated method stub
		return modelMapper.map(b,ProductDescriptionEntity.class);
	}

}
