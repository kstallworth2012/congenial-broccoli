package com.mega.parts.MegaPartsApplication.mappers.impl;

import org.springframework.stereotype.Component;

import com.mega.parts.MegaPartsApplication.domain.dto.ProductInformationDTO;
import com.mega.parts.MegaPartsApplication.domain.entities.ProductInformationEntity;
import com.mega.parts.MegaPartsApplication.mappers.Mapper;

@Component
public class ProductInformationMapperImpl implements Mapper<ProductInformationEntity, ProductInformationDTO> {

	@Override
	public ProductInformationDTO mapTo(ProductInformationEntity a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductInformationEntity mapFrom(ProductInformationDTO b) {
		// TODO Auto-generated method stub
		return null;
	}

}
