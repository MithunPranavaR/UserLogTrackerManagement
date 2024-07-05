package com.isquarebs.logtracker.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.isquarebs.logtracker.entity.DeviceLogs;

public interface DeviceLogsRepository extends JpaRepository<DeviceLogs, Integer>{

	@Query(value = "SELECT * FROM devicelogs_1_2024", nativeQuery = true)
	public List<DeviceLogs> findAlldevicelogs();
	
	@Query(value = "SELECT * FROM devicelogs_1_2024 t WHERE t.userid = ?1", nativeQuery = true)
	public List<DeviceLogs> findAllByUserId(String userId);

	@Query(value="SELECT userid,logdate,c1,c5 from devicelogs_1_2024 WHERE userid = ?1",nativeQuery=true)
	public List<DeviceLogs> findReqByUserId(String userId);
	
	
}
