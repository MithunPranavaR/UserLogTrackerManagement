package com.isquarebs.logtracker.services;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.isquarebs.logtracker.entity.DeviceLogs;
import com.isquarebs.logtracker.entity.ResultStructure;
import com.isquarebs.logtracker.entity.ResultStructurev2;
import com.isquarebs.logtracker.entity.ResultStructurev3;

@Service
public interface DeviceLogsService {
	
	public List<DeviceLogs> getDeviceLogsByUserId(String userId);

	public List<DeviceLogs> getReqDeviceLogsByUserId(String userId);

	public List<ResultStructurev3> getProductiveHours(String userId);
	
	public List<ResultStructurev2> getReqEmployeesInOut(String userId, LocalDate logDate);
}
