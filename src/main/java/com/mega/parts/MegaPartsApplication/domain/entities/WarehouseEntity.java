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
@Table(name = "warehouses")
public class WarehouseEntity{

	@Id
	private UUID warehouse_id;
	private String warehouse_spec;
	private String warehouse_name;
	private String location_id;
	private String wh_geo_location;

	
	
	public String getWarehouse_spec() {
		return warehouse_spec;
	}
	public void setWarehouse_spec(String warehouse_spec) {
		this.warehouse_spec = warehouse_spec;
	}
	public String getLocation_id() {
		return location_id;
	}
	public void setLocation_id(String location_id) {
		this.location_id = location_id;
	}
	public String getWh_geo_location() {
		return wh_geo_location;
	}
	public void setWh_geo_location(String wh_geo_location) {
		this.wh_geo_location = wh_geo_location;
	}
	UUID getWarehouse_id() {
		return warehouse_id;
	}
	public void setWarehouse_id(UUID warehouse_id) {
		this.warehouse_id = warehouse_id;
	}
	public String getWarehouse_name() {
		return warehouse_name;
	}
	public void setWarehouse_name(String warehouse_name) {
		this.warehouse_name = warehouse_name;
	}
	
	
	
	
}