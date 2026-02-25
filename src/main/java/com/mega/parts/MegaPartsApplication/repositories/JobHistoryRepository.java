package com.mega.parts.MegaPartsApplication.repositories;





import com.mega.parts.MegaPartsApplication.domain.entities.JobHistoryEntity;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface JobHistoryRepository extends CrudRepository<JobHistoryEntity,UUID>,
PagingAndSortingRepository<JobHistoryEntity,UUID>{
}
