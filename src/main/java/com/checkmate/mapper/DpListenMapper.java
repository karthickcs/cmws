package com.checkmate.mapper;

import com.checkmate.dto.DpListenDTO;
import com.checkmate.entity.DpListenEntity;

public class DpListenMapper {

	public static DpListenEntity dtoToEntity(DpListenDTO dpListenDTO) {
		DpListenEntity dpListenTable = new DpListenEntity();
		dpListenTable.setTaskname(dpListenDTO.getTaskname());
		dpListenTable.setTaskid(dpListenDTO.getTaskid());
		dpListenTable.setFilelocation(dpListenDTO.getFilelocation());
		dpListenTable.setStatus(dpListenDTO.getStatus());
		dpListenTable.setInsertts(dpListenDTO.getInsertts());
		dpListenTable.setUpdatets(dpListenDTO.getUpdatets());
		dpListenTable.setRowcount(dpListenDTO.getRowcount());
		dpListenTable.setRunid(dpListenDTO.getRunid());
		dpListenTable.setFilelocationt2(dpListenDTO.getFilelocationt2());
		return dpListenTable;
	}

	public static DpListenDTO entityToDto(DpListenEntity dpListenTable) {
		DpListenDTO dpListenDTO = new DpListenDTO();
		dpListenDTO.setTaskname(dpListenTable.getTaskname());
		dpListenDTO.setTaskid(dpListenTable.getTaskid());
		dpListenDTO.setFilelocation(dpListenTable.getFilelocation());
		dpListenDTO.setStatus(dpListenTable.getStatus());
		dpListenDTO.setInsertts(dpListenTable.getInsertts());
		dpListenDTO.setUpdatets(dpListenTable.getUpdatets());
		dpListenDTO.setRowcount(dpListenTable.getRowcount());
		dpListenDTO.setRunid(dpListenTable.getRunid());
		dpListenDTO.setFilelocationt2(dpListenTable.getFilelocationt2());
		return dpListenDTO;
	}
}
