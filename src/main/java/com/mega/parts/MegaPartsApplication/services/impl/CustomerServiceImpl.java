package com.mega.parts.MegaPartsApplication.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

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
	public Optional<CustomerEntity> findOne(Long id) {
		// TODO Auto-generated method stub
		return customerRepository.findById(id);
	}

	@Override
	public boolean isExists(Long id) {
		// TODO Auto-generated method stub
		return customerRepository.existsById(id);
	}

}
