package com.checkmate.mapper;

import com.checkmate.dto.DiffTableDTO;
import com.checkmate.dto.DpListenDTO;
import com.checkmate.entity.DiffEntity;
import com.checkmate.entity.DpListenEntity;

public class DiffTableMapper {
	public static DiffTableDTO entityToDto(DiffEntity diffTable) {
		DiffTableDTO diffTableDTO = new DiffTableDTO();
		diffTableDTO.setDiffid(diffTable.getDiffid());
		diffTableDTO.setTaskid(diffTable.getTaskid());
		diffTableDTO.setInsertts(diffTable.getInsertts());
		diffTableDTO.setMaintranid(diffTable.getMaintranid());
		diffTableDTO.setNewtranid(diffTable.getNewtranid());
		diffTableDTO.setSequence(diffTable.getSequence());
		diffTableDTO.setDifference(diffTable.getDifference());
		diffTableDTO.setCountval(diffTable.getCountval());
		diffTableDTO.setThreadid(diffTable.getThreadid());
		diffTableDTO.setRunid(diffTable.getRunid());
		return diffTableDTO;
	}

	public static DiffEntity dtoToEntity(DiffTableDTO diffTableDto) {
		DiffEntity newDiffTable = new DiffEntity();
		newDiffTable.setDiffid(diffTableDto.getDiffid());
		newDiffTable.setTaskid(diffTableDto.getTaskid());
		newDiffTable.setInsertts(diffTableDto.getInsertts());
		newDiffTable.setMaintranid(diffTableDto.getMaintranid());
		newDiffTable.setNewtranid(diffTableDto.getNewtranid());
		newDiffTable.setSequence(diffTableDto.getSequence());
		newDiffTable.setDifference(diffTableDto.getDifference());
		newDiffTable.setCountval(diffTableDto.getCountval());
		newDiffTable.setThreadid(diffTableDto.getThreadid());
		newDiffTable.setRunid(diffTableDto.getRunid());
		return newDiffTable;
	}
}
