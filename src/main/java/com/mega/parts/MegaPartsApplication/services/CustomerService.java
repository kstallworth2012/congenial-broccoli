package com.mega.parts.MegaPartsApplication.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.mega.parts.MegaPartsApplication.domain.entities.CustomerEntity;

public interface CustomerService {
	
	
	CustomerEntity createCustomer(CustomerEntity _customer);
	
	List<CustomerEntity> findAll();
	
	 Optional<CustomerEntity> findOne(UUID id);
	 
	 boolean isExists(UUID id);
	 
		
	Page<CustomerEntity> findAll(Pageable pageable);

	CustomerEntity partialUpdate(UUID _id, CustomerEntity _customer);
    void delete(UUID _id);
	CustomerEntity save(CustomerEntity _customer);
		
		

}
