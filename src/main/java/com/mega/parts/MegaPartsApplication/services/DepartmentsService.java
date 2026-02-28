package com.mega.parts.MegaPartsApplication.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.mega.parts.MegaPartsApplication.domain.entities.DepartmentsEntity;

public interface DepartmentsService {
		
	
		DepartmentsEntity createDepartments(DepartmentsEntity _departments);
		
		List<DepartmentsEntity> findAll();

		 Optional<DepartmentsEntity> findOne(UUID id);
		 
		 boolean isExists(UUID id);
		 
			
		Page<DepartmentsEntity> findAll(Pageable pageable);

		DepartmentsEntity partialUpdate(UUID _id, DepartmentsEntity _departments);
		void delete(UUID _id);
		DepartmentsEntity save(DepartmentsEntity _dept);
			
			
}
