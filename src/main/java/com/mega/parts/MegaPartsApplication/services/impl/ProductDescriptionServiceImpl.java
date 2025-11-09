package com.mega.parts.MegaPartsApplication.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

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
		return productDescriptionRepository.save(_ProductDescription);
	}

	@Override
	public List<ProductDescriptionEntity> findAll() {
		// TODO Auto-generated method stub
		return StreamSupport.stream(productDescriptionRepository.findAll().spliterator(),false).collect(Collectors.toList());	}

	@Override
	public Optional<ProductDescriptionEntity> findOne(String id) {
		// TODO Auto-generated method stub
		return productDescriptionRepository.findById(id);
	}

	@Override
	public boolean isExists(String id) {
		// TODO Auto-generated method stub
		return productDescriptionRepository.existsById(id);
	}

}
