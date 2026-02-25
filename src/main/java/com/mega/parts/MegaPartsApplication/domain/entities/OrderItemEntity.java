package com.mega.parts.MegaPartsApplication.domain.entities;

import java.util.UUID;

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
	private UUID line_item_id;
	@OneToOne
	@JoinColumn(name = "product__info_id")
	private ProductInformationEntity product_id;
	private Double unit_price;
	
	
	public UUID getLine_item_id() {
		return line_item_id;
	}
	public void setLine_item_id(UUID line_item_id) {
		this.line_item_id = line_item_id;
	}
	public ProductInformationEntity getProduct_id() {
		return product_id;
	}
	public void setProduct_id(ProductInformationEntity product_id) {
		this.product_id = product_id;
	}
	
	
	

}