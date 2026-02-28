package com.mega.parts.MegaPartsApplication.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
	public Optional<ProductDescriptionEntity> findOne(UUID id) {
		// TODO Auto-generated method stub
		return productDescriptionRepository.findById(id);
	}

	@Override
	public boolean isExists(UUID id) {
		// TODO Auto-generated method stub
		return productDescriptionRepository.existsById(id);
	}

	@Override
	public Page<ProductDescriptionEntity> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductDescriptionEntity partialUpdate(UUID _id, ProductDescriptionEntity productDescription) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(UUID _id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ProductDescriptionEntity save(ProductDescriptionEntity productDescription) {
		// TODO Auto-generated method stub
		return null;
	}

}
