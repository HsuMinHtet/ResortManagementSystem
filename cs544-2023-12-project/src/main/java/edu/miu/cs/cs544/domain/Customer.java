package edu.miu.cs.cs544.domain;

import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String firstName;
	
	private String lastName;

	private String email;
	@Embedded
	private AuditData auditData;
	@ManyToOne
	private Address billingAddress;
	@ManyToOne
	private Address physicalAddress;
	
}
