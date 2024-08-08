package com.checkmate.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.checkmate.dto.TableStructDTO;
import com.checkmate.entity.DiffEntity;
import com.checkmate.entity.DpListenEntity;
import com.checkmate.entity.TableStructEntity;

@Repository
public interface TableStructRepository extends CrudRepository<TableStructEntity, Integer> {

	@Query(value = "select * from Diff_Table_struct d where d.taskid =:taskid  and d.runid=:runid and d.difference!='[]'  ", nativeQuery = true)

	List<TableStructEntity> findAllDiff(String taskid, String runid);

	@Query(value = "select * from Diff_Table_struct d where d.taskid =:taskid  and d.runid=:runid   and d.tname  like %:tname% ", nativeQuery = true)

	List<TableStructEntity> findAllDiffbyTname(String taskid, String runid, String tname);
	
	@Query(value = "select count(*) from Diff_Table_struct d where d.taskid =:taskid  and d.runid=:runid    ", nativeQuery = true)

	long countLines(String taskid, String runid);

}
