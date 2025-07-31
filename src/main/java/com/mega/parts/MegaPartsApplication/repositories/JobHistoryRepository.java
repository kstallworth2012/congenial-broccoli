package com.mega.parts.MegaPartsApplication.repositories;





import com.mega.parts.MegaPartsApplication.domain.entities.JobHistoryEntity;
import org.springframework.data.repository.CrudRepository;

public interface JobHistoryRepository extends CrudRepository<JobHistoryEntity,Long> {
}
