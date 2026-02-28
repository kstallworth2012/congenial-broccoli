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
	
	
	
	
	
	public String getProduct_description() {
		return product_description;
	}
	public void setProduct_description(String product_description) {
		this.product_description = product_description;
	}
	public String getCategory_id() {
		return category_id;
	}
	public void setCategory_id(String category_id) {
		this.category_id = category_id;
	}
	public String getWeight_class() {
		return weight_class;
	}
	public void setWeight_class(String weight_class) {
		this.weight_class = weight_class;
	}
	public String getWarranty_period() {
		return warranty_period;
	}
	public void setWarranty_period(String warranty_period) {
		this.warranty_period = warranty_period;
	}
	public String getSupplier_id() {
		return supplier_id;
	}
	public void setSupplier_id(String supplier_id) {
		this.supplier_id = supplier_id;
	}
	public String getProduct_status() {
		return product_status;
	}
	public void setProduct_status(String product_status) {
		this.product_status = product_status;
	}
	public Double getList_price() {
		return list_price;
	}
	public void setList_price(Double list_price) {
		this.list_price = list_price;
	}
	public Double getMin_price() {
		return min_price;
	}
	public void setMin_price(Double min_price) {
		this.min_price = min_price;
	}
	public String getCatalog_url() {
		return catalog_url;
	}
	public void setCatalog_url(String catalog_url) {
		this.catalog_url = catalog_url;
	}
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