package com.example.mouri.service;

import java.util.List;

import com.example.mouri.entity.Village;

public interface VillageService {
	
	Village saveVillage(Village village);	
	
	List<Village> getAllVillages();
	
	Village getVillageById(Long id);

	Village updateVillage(Village village, Long id);

	void deleteVillage(Long id);
	
	
}
