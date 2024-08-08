package com.checkmate.mapper;

import com.checkmate.dto.TableStructDTO;
import com.checkmate.entity.TableStructEntity;

public class TableStructMapper {

	public static TableStructEntity dtoToEntity(TableStructDTO tableStructDTO) {
		TableStructEntity tablestruct = new TableStructEntity();
		tablestruct.setDifftabid(tableStructDTO.getDifftabid());
		tablestruct.setTaskid(tableStructDTO.getTaskid());
		tablestruct.setRunid(tableStructDTO.getRunid());
		tablestruct.setTname(tableStructDTO.getTname());
		tablestruct.setTstructnewsys(tableStructDTO.getTstructnewsys());
		tablestruct.setTstructoldsys(tableStructDTO.getTstructoldsys());
		tablestruct.setDifference(tableStructDTO.getDifference());
		 
		 
		return tablestruct;
	}

	public static TableStructDTO entityToDto(TableStructEntity tablestructEntity) {
		TableStructDTO tableStructDTO = new TableStructDTO();
		 
		tableStructDTO.setDifftabid(tablestructEntity.getDifftabid());
		tableStructDTO.setTaskid(tablestructEntity.getTaskid());
		tableStructDTO.setRunid(tablestructEntity.getRunid());
		tableStructDTO.setTname(tablestructEntity.getTname());
		tableStructDTO.setTstructnewsys(tablestructEntity.getTstructnewsys());
		tableStructDTO.setTstructoldsys(tablestructEntity.getTstructoldsys());
		tableStructDTO.setDifference(tablestructEntity.getDifference());
		
		 
		return tableStructDTO;
	}
}
