package com.mega.parts.MegaPartsApplication.services;

import java.util.List;
import java.util.Optional;

import com.mega.parts.MegaPartsApplication.domain.entities.ProductInformationEntity;

public interface ProductInformationService {
	
	ProductInformationEntity createProductInformation(ProductInformationEntity _ProductInformation);
	
	List<ProductInformationEntity> findAll();
	

	Optional<ProductInformationEntity> findOne(String id);
		 
	boolean isExists(String id);

}
