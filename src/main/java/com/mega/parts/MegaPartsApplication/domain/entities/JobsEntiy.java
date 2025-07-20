


package com.mega.parts.MegaPartsApplication.domain.entities;






import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class JobsEntity{


private Long job_id;
private String job_title;
private Double min_salary;
private Double max_salary;

}