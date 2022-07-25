package com.mouritech.springboot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "masterdata_info")
public class MasterData {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name = "enum_Id")
	private long enumId;
	@Column(name = "enum_Code")
	private String  enumCode;
	@Column(name = "enum_Type")
	private String  enumTypeId;
	@Column(name = "enum_Description")
	private String  enumDescription;

}
