package com.mega.parts.MegaPartsApplication.repositories;





import com.mega.parts.MegaPartsApplication.domain.entities.EmployeesEntity;
import org.springframework.data.repository.CrudRepository;

public interface EmployeesRepository extends CrudRepository<EmployeesEntity, Long> {
}