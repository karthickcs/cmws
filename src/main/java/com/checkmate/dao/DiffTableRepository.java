package com.checkmate.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.checkmate.entity.DiffEntity;
import com.checkmate.entity.DpListenEntity;

@Repository
public interface DiffTableRepository extends CrudRepository<DiffEntity, Integer> {

	 @Query(value = "select * from diff_table d where d.taskid =:taskid  and d.runid=:runid", 
		        nativeQuery = true
		)
		    List<DiffEntity> findAllDiff(String taskid, Integer runid);
	
			  

}
