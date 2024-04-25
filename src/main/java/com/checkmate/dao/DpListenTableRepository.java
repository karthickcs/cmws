package com.checkmate.dao;
 
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.checkmate.entity.DpListenEntity;
 

@Repository
public interface DpListenTableRepository extends CrudRepository<DpListenEntity, Integer> {
	
	 
	 @Query(value = "select max(d.runid) from DP_LISTEN_TABLE d where d.taskid =:taskid ", 
		        nativeQuery = true
		)
		    Integer findRunid(Integer taskid);
	
			 
	 @Query(value = "select * from DP_LISTEN_TABLE d where d.taskid =:taskid ", 
		        nativeQuery = true
		)
		    List<DpListenEntity> findAllRunid(Integer taskid);
	
			  
}
