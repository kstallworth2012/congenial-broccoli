package com.mega.parts.MegaPartsApplication.repositories;





import com.mega.parts.MegaPartsApplication.domain.entities.JobsEntity;
import org.springframework.data.repository.CrudRepository;

public interface JobRepository extends CrudRepository<JobsEntity, Long> {
}
