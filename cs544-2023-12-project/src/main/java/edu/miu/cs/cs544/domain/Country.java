package edu.miu.cs.cs544.domain;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
@Entity
@Data
public class Country {
	
	@Id
	private String code;
	
	private String name;
	
	private Integer population;
	@Embedded
	private AuditData auditData;

	
}
