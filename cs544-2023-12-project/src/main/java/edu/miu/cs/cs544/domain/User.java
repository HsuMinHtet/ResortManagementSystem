package edu.miu.cs.cs544.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column
	private String userName;

	@Column
	private String userPass;
	
	@Column
	private Boolean active;

	@OneToOne
	private Customer customer;

	@Enumerated(value = EnumType.STRING)
	private UserType type;

	@Embedded
	private AuditData auditData;

}
