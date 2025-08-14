package com.mega.parts.MegaPartsApplication.domain.dto;

import java.time.LocalDateTime;

import com.mega.parts.MegaPartsApplication.domain.entities.CustomerEntity;

import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderDTO {

	private Long order_id;

	private LocalDateTime order_date;
	private String order_mode;

	private CustomerEntity customer_id;
	private String order_status;
	private Integer order_total;
	private String sales_rep_id;
	private String promotion_id;

}
