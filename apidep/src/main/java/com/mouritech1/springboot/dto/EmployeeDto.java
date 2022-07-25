package com.mouritech1.springboot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {

	private Long empId;
	private String empName;
	private String empAdress;
	private String empPhonenumber;
	private Long empSalary;

}
