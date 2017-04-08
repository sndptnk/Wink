package org.wink.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class User {

	@Column
	private String loginId;
	
	@Column
	private String provider;
	
	@Column
	private String docJson;
}
