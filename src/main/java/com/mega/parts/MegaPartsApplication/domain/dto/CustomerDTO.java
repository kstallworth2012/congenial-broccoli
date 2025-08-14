package com.mega.parts.MegaPartsApplication.domain.dto;


import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerDTO {
	private Long customer_id;
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
}
