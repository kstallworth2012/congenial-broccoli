package com.mega.parts.MegaPartsApplication.domain.dto;

import com.mega.parts.MegaPartsApplication.domain.entities.ProductInformationEntity;

import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderItemDTO {
	private Long line_item_id;

	private ProductInformationEntity product_id;
	private Double unit_price;
}
