package com.mouritech.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mouritech.springboot.entity.Students;
import com.mouritech.springboot.entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {

	

}
