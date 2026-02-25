package com.mega.parts.MegaPartsApplication.domain.entities;
//https://github.com/lerocha/chinook-database/blob/master/ChinookDatabase/DataSources/CreatePostgreSql.bat


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
import java.time.LocalDate;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "customers")
public class CustomerEntity{
	@Id
	private UUID customer_id;
	// private String customer_id; // not null number(6),
	private String cust_first_name; // not null varchar2(20),
	private String cust_last_name; // not null varchar2(20),
	private String cust_address; // cust_address_typ,
	private String phone_numbers; // phone_list_typ,
	private String nls_language; // varchar2(3),
	private String nls_territory; // varchar2(30),
	private Integer credit_limit; // number(9,2),
	private String cust_email;  //varchar2(30),
	private Integer account_mgr_id; //  number(6),
	private String cust_geo_location; // mdsys.sdo_geometry,
	private LocalDate date_of_birth; // date,
	private String marital_status; // varchar2(20),
	private String gender; // varchar2(1),
	private String income_level; // varchar2(20)
	
	
	public UUID getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(UUID customer_id) {
		this.customer_id = customer_id;
	}
	public String getCust_last_name() {
		return cust_last_name;
	}
	public void setCust_last_name(String cust_last_name) {
		this.cust_last_name = cust_last_name;
	}
	
	
	
	
	
}