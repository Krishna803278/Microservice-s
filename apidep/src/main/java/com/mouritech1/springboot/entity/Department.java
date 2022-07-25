package com.mouritech1.springboot.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.mouritech1.springboot.entity.Employee;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "dep")
@Builder
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "dept_Id")
	private Integer deptId;
	@Column(name = "dept_Name")
	private String deptName;
	@Column(name = "dept_Location")
	private String deptLocation;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "department")
	private List<Employee> employees;

//	@OneToMany(cascade = CascadeType.ALL, mappedBy = "state")
//	private List<City> cities;
}
