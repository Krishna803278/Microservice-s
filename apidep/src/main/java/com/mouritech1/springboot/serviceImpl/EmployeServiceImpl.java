package com.mouritech1.springboot.serviceImpl;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.mouritech1.springboot.entity.Employee;
@Service
public class EmployeServiceImpl implements JpaRepository<Employee, Integer>{

}
