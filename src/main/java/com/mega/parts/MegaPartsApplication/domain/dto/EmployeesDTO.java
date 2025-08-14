package com.mega.parts.MegaPartsApplication.domain.dto;

import java.time.LocalDateTime;

import com.mega.parts.MegaPartsApplication.domain.entities.DepartmentsEntity;
import com.mega.parts.MegaPartsApplication.domain.entities.JobsEntity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmployeesDTO {

	
	
	
	private Long employee_id;
	private String first_name;
	private String last_name;
	private String email;
	private String phone_number;
	private LocalDateTime hire_date;



	private JobsEntity job_id;
	private double salary;
	private double commission_pct;
	private String manager_id;
	
	

	private DepartmentsEntity department_id;
}
