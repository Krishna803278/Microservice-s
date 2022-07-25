package com.mouritech.springboot.serviceImpl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mouritech.springboot.dto.MasterDataDTO;
import com.mouritech.springboot.entity.MasterData;
import com.mouritech.springboot.repository.MasterDataRepository;
import com.mouritech.springboot.service.MasterDataService;

@Service
public class MasterDataServiceImpl implements MasterDataService {

	private ModelMapper modelMapper = new ModelMapper();

	@Autowired
	private MasterDataRepository masterDataREpository;

	@Override
	public List<MasterDataDTO> getMasterDate(String enumType) {
		List<MasterData> enumRecord = masterDataREpository.fetchMasterData(enumType);
		if (!enumRecord.isEmpty()) {
			List<MasterDataDTO> adminUserDTO = modelMapper.map(enumRecord, new TypeToken<List<MasterDataDTO>>() {
			}.getType());
			return adminUserDTO;
		}
		return null;

	}

}
