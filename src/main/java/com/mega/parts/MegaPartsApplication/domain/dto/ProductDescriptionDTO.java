package com.mega.parts.MegaPartsApplication.domain.dto;

import com.mega.parts.MegaPartsApplication.domain.entities.ProductInformationEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductDescriptionDTO {

	
	private Long line_item_id;

	private ProductInformationEntity product_id;
	private Double unit_price;
}
