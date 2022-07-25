package com.example.mouri.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mouri.entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
	Teacher findByTeacherId(long uid);
}
