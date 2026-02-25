package com.mega.parts.MegaPartsApplication.domain.entities;





import java.util.UUID;

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
@Entity
@Table(name = "jobs")
public class JobsEntity{

@Id 
private UUID job_id;
private String job_title;
private Double min_salary;
private Double max_salary;


public UUID getJob_id() {
	return job_id;
}
public void setJob_id(UUID job_id) {
	this.job_id = job_id;
}
public String getJob_title() {
	return job_title;
}
public void setJob_title(String job_title) {
	this.job_title = job_title;
}





}