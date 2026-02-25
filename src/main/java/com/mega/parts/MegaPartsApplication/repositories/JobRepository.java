package com.mega.parts.MegaPartsApplication.repositories;





import com.mega.parts.MegaPartsApplication.domain.entities.JobsEntity;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface JobRepository extends CrudRepository<JobsEntity, UUID>,
PagingAndSortingRepository<JobsEntity, UUID>{
}
