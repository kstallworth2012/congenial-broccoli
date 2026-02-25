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
@Table(name="departments")
public class DepartmentsEntity{

@Id
private UUID department_id;
private String department_name;
private String manager_id;



public UUID getDepartment_id() {
	return department_id;
}
public void setDepartment_id(UUID department_id) {
	this.department_id = department_id;
}
public String getDepartment_name() {
	return department_name;
}
public void setDepartment_name(String department_name) {
	this.department_name = department_name;
}




}