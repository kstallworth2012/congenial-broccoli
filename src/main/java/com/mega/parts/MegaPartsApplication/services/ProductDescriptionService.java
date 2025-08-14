package com.mega.parts.MegaPartsApplication.services;

import java.util.List;
import java.util.Optional;

import com.mega.parts.MegaPartsApplication.domain.entities.ProductDescriptionEntity;

public interface ProductDescriptionService {
	
	ProductDescriptionEntity createProductDescription(ProductDescriptionEntity _ProductDescription);
	
	List<ProductDescriptionEntity> findAll();
	
	 Optional<ProductDescriptionEntity> findOne(String id);
	 
	 boolean isExists(String id);

}
