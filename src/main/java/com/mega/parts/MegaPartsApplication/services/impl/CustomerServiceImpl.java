package com.mega.parts.MegaPartsApplication.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.mega.parts.MegaPartsApplication.domain.entities.CustomerEntity;
import com.mega.parts.MegaPartsApplication.services.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Override
	public CustomerEntity createCustomer(CustomerEntity _customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CustomerEntity> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<CustomerEntity> findOne(String id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean isExists(String id) {
		// TODO Auto-generated method stub
		return false;
	}

}
