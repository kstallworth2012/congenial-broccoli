package com.mega.parts.MegaPartsApplication.domain.entities;


import java.time.LocalDateTime;
import java.util.UUID;

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
				private UUID order_id;
	
				private LocalDateTime order_date;
				private String order_mode;
//				@OneToOne
//				@JoinColumn(name = customer_id)
				private String customer_id;
				private String order_status;
				private Integer order_total;
				private String sales_rep_id;
				private String promotion_id;
				
				
				
				public LocalDateTime getOrder_date() {
					return order_date;
				}
				public void setOrder_date(LocalDateTime order_date) {
					this.order_date = order_date;
				}
				public String getOrder_mode() {
					return order_mode;
				}
				public void setOrder_mode(String order_mode) {
					this.order_mode = order_mode;
				}
				public String getOrder_status() {
					return order_status;
				}
				public void setOrder_status(String order_status) {
					this.order_status = order_status;
				}
				public Integer getOrder_total() {
					return order_total;
				}
				public void setOrder_total(Integer order_total) {
					this.order_total = order_total;
				}
				public String getSales_rep_id() {
					return sales_rep_id;
				}
				public void setSales_rep_id(String sales_rep_id) {
					this.sales_rep_id = sales_rep_id;
				}
				public String getPromotion_id() {
					return promotion_id;
				}
				public void setPromotion_id(String promotion_id) {
					this.promotion_id = promotion_id;
				}
				public UUID getOrder_id() {
					return order_id;
				}
				public void setOrder_id(UUID order_id) {
					this.order_id = order_id;
				}
				public String getCustomer_id() {
					return customer_id;
				}
				public void setCustomer_id(String customer_id) {
					this.customer_id = customer_id;
				}
				


	
}