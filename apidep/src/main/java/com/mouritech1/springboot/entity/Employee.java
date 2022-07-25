package com.mouritech1.springboot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "emp")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "emp_Id")
	private Integer empId;
	@Column(name = "emp_Name")
	private String empName;
	@Column(name = "Emp_Adress")
	private String empAdress;
	@Column(name = "emp_Phonenumber")
	private String empPhonenumber;
	@Column(name = "emp_Salary")
	private Long empSalary;

	@ManyToOne
	@JoinColumn(name = "dept_Id")
	private Department department;
	
//	@ManyToOne
//	@JoinColumn(name = "state_id")
//	private State state;
}
