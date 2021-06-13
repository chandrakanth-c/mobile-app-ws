package com.appsdeveloperblog.app.ws.ui.model.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserDetailsRequestModel {
	@NotNull(message="First Name cannot be empty")
	@Size(min=2,message = "First name should not be less than 2 characters")
	private String firstName;
	@NotNull(message="Last Name cannot be empty")
	@Size(min=2,message = "Last name should not be less than 2 characters")
	private String lastName;
	@NotNull(message="Email cannot be empty")
	@Email
	private String email;
	@Size(min=8,max=16,message="Password must be greater than 8 and lesser than 16")
	private String password;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
