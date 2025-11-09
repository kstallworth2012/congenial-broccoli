package com.mega.parts.MegaPartsApplication.services;

import java.util.List;
import java.util.Optional;

import com.mega.parts.MegaPartsApplication.domain.entities.DepartmentsEntity;

public interface DepartmentsService {
		
	
		DepartmentsEntity createDepartments(DepartmentsEntity _departments);
		
		List<DepartmentsEntity> findAll();

		 Optional<DepartmentsEntity> findOne(String id);
		 
		 boolean isExists(String id);
}
