package com.mega.parts.MegaPartsApplication.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.mega.parts.MegaPartsApplication.domain.entities.EmployeesEntity;
import com.mega.parts.MegaPartsApplication.services.EmployeesService;

@Service
public class EmployeesServiceImpl implements EmployeesService {

	@Override
	public EmployeesEntity createEmployee(EmployeesEntity _employees) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EmployeesEntity> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<EmployeesEntity> findOne(String id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean isExists(String id) {
		// TODO Auto-generated method stub
		return false;
	}

}
