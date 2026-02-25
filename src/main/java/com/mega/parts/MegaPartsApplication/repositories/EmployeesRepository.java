package com.mega.parts.MegaPartsApplication.repositories;





import com.mega.parts.MegaPartsApplication.domain.entities.EmployeesEntity;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface EmployeesRepository extends CrudRepository<EmployeesEntity, UUID>,
PagingAndSortingRepository<EmployeesEntity, UUID>{
}