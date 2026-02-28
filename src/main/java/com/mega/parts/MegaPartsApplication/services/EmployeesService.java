package com.mega.parts.MegaPartsApplication.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.mega.parts.MegaPartsApplication.domain.entities.EmployeesEntity;

public interface EmployeesService {

	
	
		EmployeesEntity createEmployee(EmployeesEntity _employees);
	
		List<EmployeesEntity> findAll();



		 Optional<EmployeesEntity> findOne(UUID id);
		 
		 boolean isExists(UUID id);
		 
			
			Page<EmployeesEntity> findAll(Pageable pageable);

		    EmployeesEntity partialUpdate(UUID _id, EmployeesEntity _employee);
			void delete(UUID _id);
			EmployeesEntity save(EmployeesEntity Entity);
			
			
}
