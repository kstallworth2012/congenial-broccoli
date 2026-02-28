package com.mega.parts.MegaPartsApplication.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.mega.parts.MegaPartsApplication.domain.entities.DepartmentsEntity;
import com.mega.parts.MegaPartsApplication.repositories.DepartmentsRepository;

@Service
public class DepartmentsService implements com.mega.parts.MegaPartsApplication.services.DepartmentsService {

	
	private DepartmentsRepository departmentsRepository;
	
	@Override
	public DepartmentsEntity createDepartments(DepartmentsEntity _departments) {
		// TODO Auto-generated method stub
		return departmentsRepository.save(_departments);
	}

	@Override
	public List<DepartmentsEntity> findAll() {
		// TODO Auto-generated method stub
		return StreamSupport.stream(departmentsRepository.findAll().spliterator(),false).collect(Collectors.toList());
	}

	@Override
	public Optional<DepartmentsEntity> findOne(UUID id) {
		// TODO Auto-generated method stub
		return departmentsRepository.findById(id);
	}

	@Override
	public boolean isExists(UUID id) {
		// TODO Auto-generated method stub
		return departmentsRepository.existsById(id);
	}

	@Override
	public Page<DepartmentsEntity> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DepartmentsEntity partialUpdate(UUID _id, DepartmentsEntity _departments) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(UUID _id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public DepartmentsEntity save(DepartmentsEntity _dept) {
		// TODO Auto-generated method stub
		return null;
	}

}
