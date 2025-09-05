package com.mega.parts.MegaPartsApplication.mappers.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.mega.parts.MegaPartsApplication.domain.dto.ProductInformationDTO;
import com.mega.parts.MegaPartsApplication.domain.entities.ProductInformationEntity;
import com.mega.parts.MegaPartsApplication.mappers.Mapper;

@Component
public class ProductInformationMapperImpl implements Mapper<ProductInformationEntity, ProductInformationDTO> {

	private ModelMapper modelMapper;
	
	
	
	
	public ProductInformationMapperImpl(ModelMapper modelMapper) {
		this.modelMapper = modelMapper;
	}

	@Override
	public ProductInformationDTO mapTo(ProductInformationEntity a) {
		// TODO Auto-generated method stub
		return modelMapper.map(a,ProductInformationDTO.class);
	}

	@Override
	public ProductInformationEntity mapFrom(ProductInformationDTO b) {
		// TODO Auto-generated method stub
		return modelMapper.map(b,ProductInformationEntity.class);
	}

}
