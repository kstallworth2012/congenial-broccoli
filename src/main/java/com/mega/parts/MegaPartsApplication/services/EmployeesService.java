package com.mega.parts.MegaPartsApplication.services;

import java.util.List;
import java.util.Optional;

import com.mega.parts.MegaPartsApplication.domain.entities.EmployeesEntity;

public interface EmployeesService {

	
	
		EmployeesEntity createEmployee(EmployeesEntity _employees);
	
		List<EmployeesEntity> findAll();



		 Optional<EmployeesEntity> findOne(Long id);
		 
		 boolean isExists(Long id);
}
