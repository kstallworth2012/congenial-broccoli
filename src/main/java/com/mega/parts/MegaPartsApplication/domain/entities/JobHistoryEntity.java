package com.mega.parts.MegaPartsApplication.domain.entities;

import com.mega.parts.MegaPartsApplication.domain.entities.DepartmentsEntity;
import com.mega.parts.MegaPartsApplication.domain.entities.EmployeesEntity;
import com.mega.parts.MegaPartsApplication.domain.entities.JobsEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;
import jakarta.persistence.OneToOne;
import jakarta.persistence.ManyToOne;
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
//----------
@Entity
@Table(name="Job_history")
public class JobHistoryEntity{

@Id
//@GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "jobHistory_id_seq")
private Long jobHistoryId;


@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "employee_id", referencedColumnName = "employee_id")
private EmployeesEntity employee_id;

private LocalDateTime start_date;
private LocalDateTime end_date;


//jobhistory can have many jobs 
@ManyToOne(cascade = CascadeType.ALL)
@JoinColumn(name = job_id)
private JobsEntity job_id;


//Job History can have many departments?
@ManyToOne(cascade = CascadeType.ALL)
@JoinColumn(name = department_id)
private DepartmentsEntity department_id;

}