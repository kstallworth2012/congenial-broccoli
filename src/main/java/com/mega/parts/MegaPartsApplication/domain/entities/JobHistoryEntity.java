package com.mega.parts.MegaPartsApplication.domain.entities;

import com.mega.parts.MegaPartsApplication.domain.entities.DepartmentsEntity;
import com.mega.parts.MegaPartsApplication.domain.entities.EmployeesEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
//----------
@Entity
@Table(name="Job_history")
public class JobHistoryEntity{

@Id
//@GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "jobHistory_id_seq")
private Long jobHistoryId;
/*
private Employees employee_id;
private LocalDateTime start_date;
private LocalDateTime end_date;


//jobhistory can have many jobs 
@ManyToOne(cascade = CascadeType.ALL)
private Jobs job_id;


//Job History can have many departments?
@ManyToOne(cascade = CascadeType.ALL)
private Department department_id;
*/
}