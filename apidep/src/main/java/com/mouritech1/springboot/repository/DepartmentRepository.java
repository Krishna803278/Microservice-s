package com.mouritech1.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mouritech1.springboot.entity.Department;



public interface DepartmentRepository extends JpaRepository<Department, Integer> {

	
}
