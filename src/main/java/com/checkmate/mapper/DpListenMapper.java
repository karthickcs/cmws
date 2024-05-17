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
		
		dpListenTable.setJdbcurlsys1(  dpListenDTO.getJdbcurlsys1());
		dpListenTable.setUsernamesys1( dpListenDTO.getUsernamesys1());
		dpListenTable.setPasswordsys1( dpListenDTO.getPasswordsys1());
		dpListenTable.setDbtypesys1(   dpListenDTO.getDbtypesys1());
		dpListenTable.setTablenamesys1(dpListenDTO.getTablenamesys1());
		dpListenTable.setStarttssys1(  dpListenDTO.getStarttssys1());
		dpListenTable.setEndtssys1(    dpListenDTO.getEndtssys1());
		dpListenTable.setJdbcurlsys2(  dpListenDTO.getJdbcurlsys2());
		dpListenTable.setUsernamesys2( dpListenDTO.getUsernamesys2());
		dpListenTable.setPasswordsys2( dpListenDTO.getPasswordsys2());
		dpListenTable.setDbtypesys2(   dpListenDTO.getDbtypesys2());
		dpListenTable.setTablenamesys2(dpListenDTO.getTablenamesys2());
		dpListenTable.setStarttssys2(  dpListenDTO.getStarttssys2());
		dpListenTable.setEndtssys2(    dpListenDTO.getEndtssys2());
		dpListenTable.setSys1type(     dpListenDTO.getSys1type());
		dpListenTable.setSys2type(     dpListenDTO.getSys2type());

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
		
		dpListenDTO.setJdbcurlsys1(  dpListenTable.getJdbcurlsys1());
		dpListenDTO.setUsernamesys1( dpListenTable.getUsernamesys1());
		dpListenDTO.setPasswordsys1( dpListenTable.getPasswordsys1());
		dpListenDTO.setDbtypesys1(   dpListenTable.getDbtypesys1());
		dpListenDTO.setTablenamesys1(dpListenTable.getTablenamesys1());
		dpListenDTO.setStarttssys1(  dpListenTable.getStarttssys1());
		dpListenDTO.setEndtssys1(    dpListenTable.getEndtssys1());
		dpListenDTO.setJdbcurlsys2(  dpListenTable.getJdbcurlsys2());
		dpListenDTO.setUsernamesys2( dpListenTable.getUsernamesys2());
		dpListenDTO.setPasswordsys2( dpListenTable.getPasswordsys2());
		dpListenDTO.setDbtypesys2(   dpListenTable.getDbtypesys2());
		dpListenDTO.setTablenamesys2(dpListenTable.getTablenamesys2());
		dpListenDTO.setStarttssys2(  dpListenTable.getStarttssys2());
		dpListenDTO.setEndtssys2(    dpListenTable.getEndtssys2());
		dpListenDTO.setSys1type(     dpListenTable.getSys1type());
		dpListenDTO.setSys2type(     dpListenTable.getSys2type());

		return dpListenDTO;
	}
}
