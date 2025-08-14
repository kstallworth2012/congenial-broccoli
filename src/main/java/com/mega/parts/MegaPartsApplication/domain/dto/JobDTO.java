package com.mega.parts.MegaPartsApplication.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class JobDTO {
	private Long job_id;
	private String job_title;
	private Double min_salary;
	private Double max_salary;
}
