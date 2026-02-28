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
@Table(name = "product_desc")
public class ProductDescriptionEntity{

	@Id
	private UUID product_id;
	private String language_id;
	private String translated_name;
	private String translated_description;
	
	
	
	
	public String getTranslated_name() {
		return translated_name;
	}
	public void setTranslated_name(String translated_name) {
		this.translated_name = translated_name;
	}
	public String getTranslated_description() {
		return translated_description;
	}
	public void setTranslated_description(String translated_description) {
		this.translated_description = translated_description;
	}
	public UUID getProduct_id() {
		return product_id;
	}
	public void setProduct_id(UUID product_id) {
		this.product_id = product_id;
	}
	public String getLanguage_id() {
		return language_id;
	}
	public void setLanguage_id(String language_id) {
		this.language_id = language_id;
	}
	
}