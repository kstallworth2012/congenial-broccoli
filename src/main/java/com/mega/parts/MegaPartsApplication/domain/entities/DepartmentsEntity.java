package com.mega.parts.MegaPartsApplication.domain.entities;






import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DepartmentsEntity{

private Long department_id;
private String department_name;
private Employees manager_id;

}