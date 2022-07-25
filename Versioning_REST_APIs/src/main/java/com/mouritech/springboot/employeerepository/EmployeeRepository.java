package com.mouritech.springboot.employeerepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mouritech.springboot.enity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
