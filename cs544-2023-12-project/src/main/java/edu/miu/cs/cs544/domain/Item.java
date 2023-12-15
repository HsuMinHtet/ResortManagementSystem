package edu.miu.cs.cs544.domain;

import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;

@Entity
@Data
public class Item {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private Integer occupants;
	
	private LocalDate checkinDate;

	private LocalDate checkoutDate;
	@ManyToOne
	private Reservation order;
	@Embedded
	private AuditData auditData;
	@ManyToOne
	private Product product;
	
}
