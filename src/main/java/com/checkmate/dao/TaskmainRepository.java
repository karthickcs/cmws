package com.checkmate.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.checkmate.entity.TaskmainEntity;

@Repository
public interface TaskmainRepository extends CrudRepository<TaskmainEntity, Integer> {
}
