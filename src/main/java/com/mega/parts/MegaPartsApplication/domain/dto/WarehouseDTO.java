package com.mega.parts.MegaPartsApplication.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WarehouseDTO {
	private Long warehouse_id;
	private String warehouse_spec;
	private String warehouse_name;
	private String location_id;
	private String wh_geo_location;
}
