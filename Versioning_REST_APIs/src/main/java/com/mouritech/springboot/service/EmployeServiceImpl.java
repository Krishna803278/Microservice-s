package com.mouritech.springboot.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mouritech.springboot.employeerepository.EmployeeRepository;
import com.mouritech.springboot.enity.Employee;
import com.mouritech.springboot.exception.ResourceNotFoundException;
import com.mouritech.springboot.payload.EmployeeDto;

@Service
public class EmployeServiceImpl implements EmployeeService {
	@Autowired
	private ModelMapper mapper;
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public EmployeeDto createEmploye(EmployeeDto employeeDto) {
		
		Employee employee = dtoToEntity(employeeDto);
		employeeRepository.save(employee);

		return entityToDto(employee);
	}

	@Override
	public List<EmployeeDto> fetchAllEmloyee() {
		List<Employee> employees = employeeRepository.findAll();
		
		return employees.stream().map(employe -> entityToDto(employe)).collect(Collectors.toList());
	}

	@Override
	public EmployeeDto findByEmployeId(Long id) {
		Employee employee = employeeRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("employe", "employe", "id"));

		return entityToDto(employee);
	}

	@Override
	public EmployeeDto upDateEmployeDetails(Long id, EmployeeDto employeeDto) {
		Employee employee = employeeRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("employe", "employe", "id"));

		employee.setCompany(employeeDto.getCompany());
		employee.setName(employeeDto.getFirstName());
		employee.setId(employeeDto.getId());
		
		Employee updateEmploye = employeeRepository.save(employee);
		
		return entityToDto(updateEmploye);
	}

	@Override
	public void deleteEmployeeById(Long id) {
		Employee employee = employeeRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("employe", "employe", "id"));

		employeeRepository.deleteById(id);

	}

	///////////////////////////////// CONVERTED ENTITY TO DTO ///////////////////////////////////////

	private Employee dtoToEntity(EmployeeDto employeeDTO) {
		Employee employee = mapper.map(employeeDTO, Employee.class);
		return employee;
	}

	private EmployeeDto entityToDto(Employee employee) {
		EmployeeDto employeeDTO = mapper.map(employee, EmployeeDto.class);
		return employeeDTO;
	}
}
