package com.mega.parts.MegaPartsApplication.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DepartmentsDTO {

	private Long department_id;
	private String department_name;
	private String manager_id;

}
