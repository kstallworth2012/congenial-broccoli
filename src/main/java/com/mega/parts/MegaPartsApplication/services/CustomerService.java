package com.mega.parts.MegaPartsApplication.services;

import java.util.List;
import java.util.Optional;

import com.mega.parts.MegaPartsApplication.domain.entities.CustomerEntity;

public interface CustomerService {
	
	
	CustomerEntity createCustomer(CustomerEntity _customer);
	
	List<CustomerEntity> findAll();
	
	 Optional<CustomerEntity> findOne(String id);
	 
	 boolean isExists(String id);

}
