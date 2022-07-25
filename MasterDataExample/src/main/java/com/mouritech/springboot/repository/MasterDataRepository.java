package com.mouritech.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mouritech.springboot.entity.MasterData;
@Repository
public interface MasterDataRepository extends JpaRepository<MasterData,Long> {
	
	@Query("SELECT e from MasterData e where LOWER(e.enumTypeId)=:enumType" )
	List<MasterData> fetchMasterData(@Param("enumType") String enumType) ;
		
	}


