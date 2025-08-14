package com.mega.parts.MegaPartsApplication.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductInformationDTO {

	
	
	private Long product_info_id;
	private String product_name;
	private String product_description;
	private String category_id;
	private String weight_class;
	private String warranty_period;
	private String supplier_id;
	private String product_status;
	private Double list_price;
	private Double min_price;
	private String catalog_url;
}
