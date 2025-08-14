package com.mega.parts.MegaPartsApplication.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class InventoryDTO {
	private Long inventory_id;
	private Integer warehouse_id;
	private Integer product_id;
	private Integer quantity_on_hand;
}
