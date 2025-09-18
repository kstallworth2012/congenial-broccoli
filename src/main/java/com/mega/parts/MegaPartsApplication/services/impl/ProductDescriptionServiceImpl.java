package com.mega.parts.MegaPartsApplication.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.mega.parts.MegaPartsApplication.domain.entities.ProductDescriptionEntity;
import com.mega.parts.MegaPartsApplication.repositories.ProductDescriptionRepository;
import com.mega.parts.MegaPartsApplication.services.ProductDescriptionService;


@Service
public class ProductDescriptionServiceImpl implements ProductDescriptionService {

	
	
	
	private ProductDescriptionRepository productDescriptionRepository;
	
	
	public ProductDescriptionServiceImpl(ProductDescriptionRepository productDescriptionRepository) {
		this.productDescriptionRepository = productDescriptionRepository;
	}

	@Override
	public ProductDescriptionEntity createProductDescription(ProductDescriptionEntity _ProductDescription) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductDescriptionEntity> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<ProductDescriptionEntity> findOne(String id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean isExists(String id) {
		// TODO Auto-generated method stub
		return false;
	}

}
