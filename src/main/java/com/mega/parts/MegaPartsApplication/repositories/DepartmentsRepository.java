package com.mega.parts.MegaPartsApplication.repositories;





import com.mega.parts.MegaPartsApplication.domain.entities.DepartmentsEntity;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface DepartmentsRepository extends CrudRepository<DepartmentsEntity,UUID>,
PagingAndSortingRepository<DepartmentsEntity,UUID>{
}
