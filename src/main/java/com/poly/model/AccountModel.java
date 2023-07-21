package com.poly.model;

import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AccountModel {
	@NotEmpty(message = "Please enter your username")
	String username;
	
	@NotEmpty(message = "Please enter your password")
	private String password;
	
	@NotEmpty(message = "Please enter your fullname")
	private String fullname;
	
	@NotEmpty(message = "Please enter your Email")
	private String email;

	private String photo;
	private boolean admin;
	private boolean activated;
}
