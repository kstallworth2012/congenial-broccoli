package com.mega.parts.MegaPartsApplication.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
	public Optional<EmployeesEntity> findOne(UUID id) {
		// TODO Auto-generated method stub
		return employeesRepository.findById(id);
	}

	@Override
	public boolean isExists(UUID id) {
		// TODO Auto-generated method stub
		return employeesRepository.existsById(id);
	}

	@Override
	public Page<EmployeesEntity> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeesEntity partialUpdate(UUID _id, EmployeesEntity _employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(UUID _id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public EmployeesEntity save(EmployeesEntity Entity) {
		// TODO Auto-generated method stub
		return null;
	}

}
