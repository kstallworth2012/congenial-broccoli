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
@Table(name = "productinformation")
public class ProductInformationEntity{


	@Id
	private UUID product_info_id;
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
	public UUID getProduct_info_id() {
		return product_info_id;
	}
	public void setProduct_info_id(UUID product_info_id) {
		this.product_info_id = product_info_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	
	
	
	
	
}