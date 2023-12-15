package edu.miu.cs.cs544.domain;

import java.util.List;

import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data
public class Reservation {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@ManyToOne
	private Customer customer;
	@OneToMany
	private List<Item> items;
	@Embedded
	private AuditData auditData;
	
}
