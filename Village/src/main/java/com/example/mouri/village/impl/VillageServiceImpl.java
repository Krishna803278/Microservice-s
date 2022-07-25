package com.example.mouri.village.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mouri.entity.Village;
import com.example.mouri.exception.VillageException;
import com.example.mouri.repository.VillageRepository;
import com.example.mouri.service.VillageService;

@Service
public class VillageServiceImpl implements VillageService {

	@Autowired
	private VillageRepository villageRepository;

	@Override
	public Village saveVillage(Village village) {

		return villageRepository.save(village);
	}

	@Override
	public List<Village> getAllVillages() {
		// TODO Auto-generated method stub
		return villageRepository.findAll();
	}

	@Override
	public Village getVillageById(Long id) {
		// TODO Auto-generated method stub;
		return villageRepository.findById(id).orElseThrow(() -> new VillageException("ID", "id", id));
	}

	@Override
	public Village updateVillage(Village village, Long id) {

		Village village2 = villageRepository.findById(id).orElseThrow(() -> new VillageException("ID", "id", id));

//		village2.setVillageId(village.getVillageId());
		village2.setVillageName(village.getVillageName());

		Village updateVillage = villageRepository.save(village2);

		return updateVillage;
	}

	@Override
	public void deleteVillage(Long id) {
		villageRepository.findById(id).orElseThrow(() -> new VillageException("ID", "id", id));
		villageRepository.deleteById(id);

	}

}
