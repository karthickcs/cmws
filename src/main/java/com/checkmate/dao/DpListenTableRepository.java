package com.checkmate.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;

import com.checkmate.entity.DpListenEntity;

@Repository
public interface DpListenTableRepository extends CrudRepository<DpListenEntity, Integer> {

	@Query(value = "select max(d.runid) from DP_LISTEN_TABLE d where d.taskid =:taskid ", nativeQuery = true)
	Integer findRunid(Integer taskid);

	@Query(value = "select * from DP_LISTEN_TABLE d where d.taskid =:taskid  and d.runid>0 and status !='FAILED' and status !='CREATED'  ", nativeQuery = true)
	List<DpListenEntity> findAllRunid(Integer taskid);

	@Query(value = "select * from DP_LISTEN_TABLE d where d.taskid =:taskid  and   d.runid=:runid  ", nativeQuery = true)
	List<DpListenEntity> findAllMeta(Integer taskid,Integer runid);
	
	@Transactional
	@Modifying
	@Query(value = "update DP_LISTEN_TABLE set status='FAILED' where status='INPROGRESS' or  status='CREATED' ", nativeQuery = true)
	void cleanup();
	
	@Transactional
	@Modifying(clearAutomatically = true)
	@Query(value = "delete from  DP_LISTEN_TABLE  d where d.taskid =:taskid  and d.runid=:runid ", nativeQuery = true)
	void deleteOldmeta(Integer taskid,Integer runid);

}
