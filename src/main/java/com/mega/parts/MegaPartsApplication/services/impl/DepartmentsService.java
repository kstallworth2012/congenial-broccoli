package com.mega.parts.MegaPartsApplication.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.stereotype.Service;

import com.mega.parts.MegaPartsApplication.domain.entities.DepartmentsEntity;
import com.mega.parts.MegaPartsApplication.repositories.DepartmentsRepository;

@Service
public class DepartmentsService implements com.mega.parts.MegaPartsApplication.services.DepartmentsService {

	
	private DepartmentsRepository departmentsRepository;
	
	@Override
	public DepartmentsEntity createDepartments(DepartmentsEntity _departments) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DepartmentsEntity> findAll() {
		// TODO Auto-generated method stub
		return StreamSupport.stream(departmentsRepository.findAll().spliterator(),false).collect(Collectors.toList());
	}

	@Override
	public Optional<DepartmentsEntity> findOne(String id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean isExists(String id) {
		// TODO Auto-generated method stub
		return false;
	}

}
