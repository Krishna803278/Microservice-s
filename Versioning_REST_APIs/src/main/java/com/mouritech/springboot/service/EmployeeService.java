package com.mouritech.springboot.service;

import java.util.List;

import com.mouritech.springboot.payload.EmployeeDto;

public interface EmployeeService {
	
	EmployeeDto createEmploye (EmployeeDto employeeDto);
	List<EmployeeDto> fetchAllEmloyee();
	EmployeeDto findByEmployeId(Long id);
	EmployeeDto upDateEmployeDetails(Long id,EmployeeDto employeeDto);
	void deleteEmployeeById(Long id);
	

}
