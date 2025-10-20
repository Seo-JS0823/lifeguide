package com.lifeguide.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

@Entity
@Data
@Builder
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue
	@Column(name = "users_seq")
	private Long id;
	
	@Column(name = "user_nickname")
	private String nickname;
	
	@Column(name = "user_id", unique = true)
	private String userid;
	
	@Column(name = "user_pwd")
	private String password;
	
	@Column(name = "user_email")
	private String email;
	
	
}
