package com.mouritech.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mouritech.springboot.dto.MasterDataDTO;
import com.mouritech.springboot.serviceImpl.MasterDataServiceImpl;

@RequestMapping
@RestController
public class MasterDataController {
	@Autowired
	private MasterDataServiceImpl masterDataServiceImpl;

	@GetMapping("/enum/{enumType}")
	public List<MasterDataDTO> getAllenunApi(@PathVariable ("enumType") String enumType){
		return masterDataServiceImpl.getMasterDate(enumType.toLowerCase());
	//return masterDataServiceImpl.getEnumMasterDataApi(enumType.toLowerCase());

	}
}
