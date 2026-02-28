package com.mega.parts.MegaPartsApplication.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.mega.parts.MegaPartsApplication.domain.entities.ProductInformationEntity;

public interface ProductInformationService {
	
	ProductInformationEntity createProductInformation(ProductInformationEntity _ProductInformation);
	
	List<ProductInformationEntity> findAll();
	

	Optional<ProductInformationEntity> findOne(UUID id);
		 
	boolean isExists(UUID id);
	
	
	Page<ProductInformationEntity> findAll(Pageable pageable);

    ProductInformationEntity partialUpdate(UUID _id, ProductInformationEntity _productInformation);
	void delete(UUID _id);
	ProductInformationEntity save(ProductInformationEntity productInformation);
	
	

}
