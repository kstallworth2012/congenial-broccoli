package com.mega.parts.MegaPartsApplication.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
//----------
//@Entity
//@Table(name="Job_history")
public class JobHistoryEntity{

//@Id
//@GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "_id_seq")
private Long jobHistoryId;
/*
private Employees employee_id;
private DateTime start_date;
private DateTime end_date;


//jobhistory can have many jobs 
@ManyToOne(cascade = CascadeType.ALL)
private Jobs job_id;


//Job History can have many departments?
@ManyToOne(cascade = CascadeType.ALL)
private Department department_id;
*/
}