package com.mouritech.springboot.service;

import java.util.List;

import com.mouritech.springboot.dto.MasterDataDTO;

public interface MasterDataService {

	List<MasterDataDTO> getMasterDate(String enumType);
		
	
}
