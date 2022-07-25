package com.mouritech.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mouritech.springboot.entity.Students;

public interface StudentRepository extends JpaRepository<Students, Long>{


	

}
