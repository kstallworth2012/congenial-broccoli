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
	
	
	public String getCust_first_name() {
		return cust_first_name;
	}
	public void setCust_first_name(String cust_first_name) {
		this.cust_first_name = cust_first_name;
	}
	public String getCust_address() {
		return cust_address;
	}
	public void setCust_address(String cust_address) {
		this.cust_address = cust_address;
	}
	public String getPhone_numbers() {
		return phone_numbers;
	}
	public void setPhone_numbers(String phone_numbers) {
		this.phone_numbers = phone_numbers;
	}
	public String getNls_language() {
		return nls_language;
	}
	public void setNls_language(String nls_language) {
		this.nls_language = nls_language;
	}
	public String getNls_territory() {
		return nls_territory;
	}
	public void setNls_territory(String nls_territory) {
		this.nls_territory = nls_territory;
	}
	public Integer getCredit_limit() {
		return credit_limit;
	}
	public void setCredit_limit(Integer credit_limit) {
		this.credit_limit = credit_limit;
	}
	public String getCust_email() {
		return cust_email;
	}
	public void setCust_email(String cust_email) {
		this.cust_email = cust_email;
	}
	public Integer getAccount_mgr_id() {
		return account_mgr_id;
	}
	public void setAccount_mgr_id(Integer account_mgr_id) {
		this.account_mgr_id = account_mgr_id;
	}
	public String getCust_geo_location() {
		return cust_geo_location;
	}
	public void setCust_geo_location(String cust_geo_location) {
		this.cust_geo_location = cust_geo_location;
	}
	public LocalDate getDate_of_birth() {
		return date_of_birth;
	}
	public void setDate_of_birth(LocalDate date_of_birth) {
		this.date_of_birth = date_of_birth;
	}
	public String getMarital_status() {
		return marital_status;
	}
	public void setMarital_status(String marital_status) {
		this.marital_status = marital_status;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getIncome_level() {
		return income_level;
	}
	public void setIncome_level(String income_level) {
		this.income_level = income_level;
	}
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