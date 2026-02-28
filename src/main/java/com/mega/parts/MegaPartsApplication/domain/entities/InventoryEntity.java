package com.mega.parts.MegaPartsApplication.domain.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;
import jakarta.persistence.OneToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;

import java.util.UUID;

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
@Table(name="Inventory")
public class InventoryEntity{

	@Id
	private UUID inventory_id;
	private Integer warehouse_id;
	private Integer product_id;
	private Integer quantity_on_hand;
	
	
	public Integer getProduct_id() {
		return product_id;
	}
	public void setProduct_id(Integer product_id) {
		this.product_id = product_id;
	}
	public Integer getQuantity_on_hand() {
		return quantity_on_hand;
	}
	public void setQuantity_on_hand(Integer quantity_on_hand) {
		this.quantity_on_hand = quantity_on_hand;
	}
	public UUID getInventory_id() {
		return inventory_id;
	}
	public void setInventory_id(UUID inventory_id) {
		this.inventory_id = inventory_id;
	}
	public Integer getWarehouse_id() {
		return warehouse_id;
	}
	public void setWarehouse_id(Integer warehouse_id) {
		this.warehouse_id = warehouse_id;
	}
	
	
	
	
	
}