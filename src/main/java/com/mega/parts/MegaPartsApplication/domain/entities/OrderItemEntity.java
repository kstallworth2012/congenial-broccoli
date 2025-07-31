package com.mega.parts.MegaPartsApplication.domain.entities;

import com.mega.parts.MegaPartsApplication.domain.entities.ProductInformationEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;
import jakarta.persistence.OneToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;
import jakarta.persistence.CascadeType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "orderitems")
public class OrderItemEntity{

	@Id
	private Long line_item_id;
	@OneToOne
	@JoinColumn(name = "product__info_id")
	private ProductInformationEntity product_id;
	private Double unit_price;
	

}