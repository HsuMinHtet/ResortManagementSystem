package edu.miu.cs.cs544.domain;

import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data
public class State {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String code;
	
	private String name;
	@Embedded
	private AuditData auditData;
	@ManyToOne
	private Country country;
	
}
