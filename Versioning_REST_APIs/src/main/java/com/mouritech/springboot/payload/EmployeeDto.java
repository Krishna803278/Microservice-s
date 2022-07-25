package com.mouritech.springboot.payload;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class EmployeeDto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@NotNull
	@Size(min = 2, message = "First Name should have atleast 2 characters")
	private String firstName;
	@NotNull
	@Size(min = 2, message = "Last Name should have atleast 2 characters")
	private String lastName;
	
	private String company;
	@Email
	@NotBlank
	private String email;

}
