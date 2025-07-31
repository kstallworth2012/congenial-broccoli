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
	private Long product_info_id;
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
	
}