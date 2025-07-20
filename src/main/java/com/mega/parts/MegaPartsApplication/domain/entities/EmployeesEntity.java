






package com.mega.parts.MegaPartsApplication.domain.entities;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


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
private DateTime hire_date;
private Jobs job_id;
private double salary;
private double commission_pct;
private Employees manager_id;
private Departments department_id;

}