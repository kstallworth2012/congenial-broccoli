package com.mega.parts.MegaPartsApplication.services.impl;

import java.util.List;
import java.util.Optional;

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
		return null;
	}

	@Override
	public List<ProductInformationEntity> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<ProductInformationEntity> findOne(String id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean isExists(String id) {
		// TODO Auto-generated method stub
		return false;
	}

}
