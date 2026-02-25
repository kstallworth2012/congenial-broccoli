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
@Table(name="locations")
public class LocationEntity {


	@Id 
	private UUID locations_id;
	private String street_address;
	private String postal_code;
	private String city;
	private String state_province;
	private String country_id;
	public UUID getLocations_id() {
		return locations_id;
	}
	public void setLocations_id(UUID locations_id) {
		this.locations_id = locations_id;
	}
	public String getStreet_address() {
		return street_address;
	}
	public void setStreet_address(String street_address) {
		this.street_address = street_address;
	}
	
	
	
	
	
}