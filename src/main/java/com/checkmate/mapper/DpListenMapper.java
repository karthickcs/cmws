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
		dpListenTable.setRowcountsys2(dpListenDTO.getRowcountsys2());
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

		dpListenTable.setTablenameclobsys2(dpListenDTO.getTablenameClobsys2());
		dpListenTable.setStarttsclobsys2(  dpListenDTO.getStarttsClobsys2());
		dpListenTable.setEndtsclobsys2(    dpListenDTO.getEndtsClobsys2());
		dpListenTable.setTablenameonlinesys2(dpListenDTO.getTablenameOnlinesys2());
		dpListenTable.setStarttsonlinesys2(  dpListenDTO.getStarttsOnlinesys2());
		dpListenTable.setEndtsonlinesys2(    dpListenDTO.getEndtsOnlinesys2());
		
		dpListenTable.setTablenameclobsys1(dpListenDTO.getTablenameClobsys1());
		dpListenTable.setStarttsclobsys1(  dpListenDTO.getStarttsClobsys1());
		dpListenTable.setEndtsclobsys1(    dpListenDTO.getEndtsClobsys1());
		dpListenTable.setTablenameonlinesys1(dpListenDTO.getTablenameOnlinesys1());
		dpListenTable.setStarttsonlinesys1(  dpListenDTO.getStarttsOnlinesys1());
		dpListenTable.setEndtsonlinesys1(    dpListenDTO.getEndtsOnlinesys1());
		dpListenTable.setGenerateMetadata(    dpListenDTO.getGenerateMetadata());
		
		dpListenTable.setBatchtime(    dpListenDTO.getBatchtime());
		dpListenTable.setComparetime(dpListenDTO.getComparetime());
		dpListenTable.setDataloadtime(  dpListenDTO.getDataloadtime());
		dpListenTable.setReportgentime(    dpListenDTO.getReportgentime());
		dpListenTable.setRowsprocessed(    dpListenDTO.getRowsprocessed());
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
		dpListenDTO.setRowcountsys2(dpListenTable.getRowcountsys2());
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
		dpListenDTO.setTablenameClobsys2(dpListenTable.getTablenameclobsys2());
		dpListenDTO.setStarttsClobsys2(  dpListenTable.getStarttsclobsys2());
		dpListenDTO.setEndtsClobsys2(    dpListenTable.getEndtsclobsys2());
		dpListenDTO.setTablenameOnlinesys2(dpListenTable.getTablenameonlinesys2());
		dpListenDTO.setStarttsOnlinesys2(  dpListenTable.getStarttsonlinesys2());
		dpListenDTO.setEndtsOnlinesys2(    dpListenTable.getEndtsonlinesys2());
		
		dpListenDTO.setTablenameClobsys1(dpListenTable.getTablenameclobsys1());
		dpListenDTO.setStarttsClobsys1(  dpListenTable.getStarttsclobsys1());
		dpListenDTO.setEndtsClobsys1(    dpListenTable.getEndtsclobsys1());
		dpListenDTO.setTablenameOnlinesys1(dpListenTable.getTablenameonlinesys1());
		dpListenDTO.setStarttsOnlinesys1(  dpListenTable.getStarttsonlinesys1());
		dpListenDTO.setEndtsOnlinesys1(    dpListenTable.getEndtsonlinesys1());
		dpListenDTO.setGenerateMetadata(    dpListenTable.getGenerateMetadata());
		
		dpListenDTO.setBatchtime(    dpListenTable.getBatchtime());
		dpListenDTO.setComparetime(dpListenTable.getComparetime());
		dpListenDTO.setDataloadtime(  dpListenTable.getDataloadtime());
		dpListenDTO.setReportgentime(    dpListenTable.getReportgentime());
		dpListenDTO.setRowsprocessed(    dpListenTable.getRowsprocessed());
		return dpListenDTO;
	}
}
