package com.mega.parts.MegaPartsApplication.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.stereotype.Service;

import com.mega.parts.MegaPartsApplication.domain.entities.EmployeesEntity;
import com.mega.parts.MegaPartsApplication.repositories.EmployeesRepository;
import com.mega.parts.MegaPartsApplication.services.EmployeesService;

@Service
public class EmployeesServiceImpl implements EmployeesService {

	
	 private EmployeesRepository  employeesRepository;
	 
	 
	 
	public EmployeesServiceImpl(EmployeesRepository employeesRepository) {
		this.employeesRepository = employeesRepository;
	}

	@Override
	public EmployeesEntity createEmployee(EmployeesEntity _employees) {
		// TODO Auto-generated method stub
		return employeesRepository.save(_employees);
	}

	@Override
	public List<EmployeesEntity> findAll() {
		// TODO Auto-generated method stub
		return StreamSupport.stream(employeesRepository.findAll().spliterator(),false).collect(Collectors.toList());
	}

	@Override
	public Optional<EmployeesEntity> findOne(Long id) {
		// TODO Auto-generated method stub
		return employeesRepository.findById(id);
	}

	@Override
	public boolean isExists(Long id) {
		// TODO Auto-generated method stub
		return employeesRepository.existsById(id);
	}

}
