package com.mega.parts.MegaPartsApplication.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.mega.parts.MegaPartsApplication.domain.entities.ProductInformationEntity;
import com.mega.parts.MegaPartsApplication.repositories.ProductInformationRepository;
import com.mega.parts.MegaPartsApplication.services.ProductInformationService;


@Service
public class ProductInformationServiceImpl implements ProductInformationService {

	
	private ProductInformationRepository  productIfoRepository;
	
	
	
	public ProductInformationServiceImpl(ProductInformationRepository productIfoRepository) {
		this.productIfoRepository = productIfoRepository;
	}

	@Override
	public ProductInformationEntity createProductInformation(ProductInformationEntity _ProductInformation) {
		// TODO Auto-generated method stub
		return productIfoRepository.save(_ProductInformation);
	}

	@Override
	public List<ProductInformationEntity> findAll() {
		// TODO Auto-generated method stub
		return StreamSupport.stream(productIfoRepository.findAll().spliterator(),false).collect(Collectors.toList());	}

	@Override
	public Optional<ProductInformationEntity> findOne(UUID id) {
		// TODO Auto-generated method stub
		return productIfoRepository.findById(id);
	}

	@Override
	public boolean isExists(UUID id) {
		// TODO Auto-generated method stub
		return productIfoRepository.existsById(id);
	}

	@Override
	public Page<ProductInformationEntity> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductInformationEntity partialUpdate(UUID _id, ProductInformationEntity _productInformation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(UUID _id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ProductInformationEntity save(ProductInformationEntity productInformation) {
		// TODO Auto-generated method stub
		return null;
	}

}
