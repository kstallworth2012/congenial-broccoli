package com.mega.parts.MegaPartsApplication.domain.entities;


import java.time.LocalDateTime;

import com.mega.parts.MegaPartsApplication.domain.entities.CustomerEntity;

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
@Table(name="orders") 
public class OrderEntity{


				@Id 
				private Long order_id;
	
				private LocalDateTime order_date;
				private String order_mode;
//				@OneToOne
//				@JoinColumn(name = customer_id)
				private String customer_id;
				private String order_status;
				private Integer order_total;
				private String sales_rep_id;
				private String promotion_id;


	
}