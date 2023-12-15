package edu.miu.cs.cs544.domain;

import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String name; 
	
	private String description;
	
	private String excerpt;
	@Enumerated(EnumType.STRING)
	private ProductType type;
	@Embedded
	private AuditData auditData;
	
}
