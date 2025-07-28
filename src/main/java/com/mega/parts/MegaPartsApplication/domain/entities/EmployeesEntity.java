package com.mega.parts.MegaPartsApplication.domain.entities;

import com.mega.parts.MegaPartsApplication.domain.entities.DepartmentsEntity;
import com.mega.parts.MegaPartsApplication.domain.entities.JobsEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;
import jakarta.persistence.OneToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;
import jakarta.persistence.CascadeType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="employees")
public class EmployeesEntity{

			@Id	
			private Long employee_id;
			private String first_name;
			private String last_name;
			private String email;
			private String phone_number;
			private LocalDateTime hire_date;


			@OneToOne(cascade = CascadeType.ALL)
			@JoinColumn(name = "job_id", referencedColumnName = "job_id")
			private JobsEntity job_id;
			private double salary;
			private double commission_pct;
			private String manager_id;
			
			
			@OneToOne(cascade = CascadeType.ALL)
			@JoinColumn(name = "department_id", referencedColumnName = "department_id")
			private DepartmentsEntity department_id;
			
}