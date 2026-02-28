package com.mega.parts.MegaPartsApplication.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.mega.parts.MegaPartsApplication.domain.entities.CustomerEntity;
import com.mega.parts.MegaPartsApplication.repositories.CustomerRepository;
import com.mega.parts.MegaPartsApplication.services.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	
	
	private CustomerRepository customerRepository;
	
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	
	@Override
	public CustomerEntity createCustomer(CustomerEntity _customer) {
		// TODO Auto-generated method stub
		return customerRepository.save(_customer);
	}


	@Override
	public List<CustomerEntity> findAll() {
		// TODO Auto-generated method stub
		return StreamSupport.stream(customerRepository.findAll().spliterator(),false).collect(Collectors.toList());

	}



	@Override
	public Optional<CustomerEntity> findOne(UUID id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}


	@Override
	public boolean isExists(UUID id) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public Page<CustomerEntity> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public CustomerEntity partialUpdate(UUID _id, CustomerEntity _customer) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void delete(UUID _id) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public CustomerEntity save(CustomerEntity _customer) {
		// TODO Auto-generated method stub
		return null;
	}

}
