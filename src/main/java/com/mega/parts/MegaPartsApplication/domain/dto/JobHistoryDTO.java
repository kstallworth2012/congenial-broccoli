package com.mega.parts.MegaPartsApplication.domain.dto;

import java.time.LocalDateTime;

import com.mega.parts.MegaPartsApplication.domain.entities.DepartmentsEntity;
import com.mega.parts.MegaPartsApplication.domain.entities.EmployeesEntity;
import com.mega.parts.MegaPartsApplication.domain.entities.JobsEntity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class JobHistoryDTO {

	
	private Long jobHistoryId;



	private EmployeesEntity employee_id;

	private LocalDateTime start_date;
	private LocalDateTime end_date;



	private JobsEntity job_id;
	private DepartmentsEntity department_id;
}
