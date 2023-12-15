package edu.miu.cs.cs544.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String line1;
	
	private String line2;
	
	private String city;
	
	private String postalCode;
	@Embedded
	private AuditData auditData;
	@ManyToOne
	private State state;
	
}
