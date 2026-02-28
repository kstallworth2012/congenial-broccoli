package com.mega.parts.MegaPartsApplication.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.mega.parts.MegaPartsApplication.domain.entities.ProductDescriptionEntity;

public interface ProductDescriptionService {
	
	ProductDescriptionEntity createProductDescription(ProductDescriptionEntity _ProductDescription);
	
	List<ProductDescriptionEntity> findAll();
	
	 Optional<ProductDescriptionEntity> findOne(UUID id);
	 
	 boolean isExists(UUID id);
	 
	
	Page<ProductDescriptionEntity> findAll(Pageable pageable);

	ProductDescriptionEntity partialUpdate(UUID _id, ProductDescriptionEntity productDescription);
    void delete(UUID _id);
	ProductDescriptionEntity save(ProductDescriptionEntity productDescription);
		
		

}
