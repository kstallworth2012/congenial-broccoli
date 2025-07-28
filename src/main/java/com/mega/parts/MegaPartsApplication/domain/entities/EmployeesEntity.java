package com.mega.parts.MegaPartsApplication.domain.entities;

import com.mega.parts.MegaPartsApplication.domain.entities.DepartmentsEntity;
import com.mega.parts.MegaPartsApplication.domain.entities.JobsEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmployeesEntity{
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