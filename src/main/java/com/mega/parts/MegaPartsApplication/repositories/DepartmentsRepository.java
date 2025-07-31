package com.mega.parts.MegaPartsApplication.repositories;





import com.mega.parts.MegaPartsApplication.domain.entities.DepartmentsEntity;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentsRepository extends CrudRepository<DepartmentsEntity, Long> {
}
