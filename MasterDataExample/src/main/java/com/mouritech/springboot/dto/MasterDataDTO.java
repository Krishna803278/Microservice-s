package com.mouritech.springboot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MasterDataDTO {
	private long enumId;
	private String enumCode;
	private String enumTypeId;

	private String enumDescription;

}
