package com.isquarebs.logtracker.services;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isquarebs.logtracker.entity.DeviceLogs;
import com.isquarebs.logtracker.entity.EmployeeLogs;
import com.isquarebs.logtracker.entity.ResultStructure;
import com.isquarebs.logtracker.entity.ResultStructurev2;
import com.isquarebs.logtracker.entity.ResultStructurev3;
import com.isquarebs.logtracker.repository.DeviceLogsRepository;
import com.isquarebs.logtracker.repository.EmployeeLogsRepository;
import com.isquarebs.logtracker.utilities.DeviceLogsv2Utilities;

@Service
public class DeviceLogsServiceImpl implements DeviceLogsService {
	
	public DeviceLogsServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Autowired
	private final DeviceLogsRepository deviceLogsRepository = null;
	
	@Autowired
	private final DeviceLogsv2Utilities deviceLogsv2Utilities = null;
	
	@Autowired
	private final EmployeeLogsRepository employeeLogsRepository = null;

	@Override
	public List<DeviceLogs> getDeviceLogsByUserId(String userId) {
		
		List<DeviceLogs> deviceLogs = new ArrayList<>();
		deviceLogs = deviceLogsRepository.findAllByUserId(userId);
		//deviceLogs = deviceLogsRepository.findAll();
		return deviceLogs;
	}
	
	
	public List<DeviceLogs> getReqDeviceLogsByUserId(String userId) {
		
		List<DeviceLogs> deviceLogs = new ArrayList<>();
		deviceLogs = deviceLogsRepository.findReqByUserId(userId);
		return deviceLogs;
	}
	
	
	public List<ResultStructurev3> getProductiveHours(String userId)
	{
		List<DeviceLogs> reqentry = new ArrayList<>();
		reqentry=getDeviceLogsByUserId(userId);
		//System.out.println(reqentry);
		List<ResultStructure> res = deviceLogsv2Utilities.calcEmpTimev2(reqentry);//testing
		List<ResultStructurev3> resv2=deviceLogsv2Utilities.calcEmpTimev3(res);
		return resv2;
	}

	@Override
	public List<ResultStructurev2> getReqEmployeesInOut(String userId, LocalDate logDate) {
		//List<EmployeeLogs> alldetailsfromEmp=employeeLogsRepository.getAllEmployees();
		List<DeviceLogs> alldetailsfromDev=deviceLogsRepository.findAlldevicelogs();
		List<ResultStructurev2> inout=new ArrayList<>();
		for(int i=0;i<alldetailsfromDev.size();i++)
		{
			if(alldetailsfromDev.get(i).getUserid().equals(userId) && deviceLogsv2Utilities.getDate(alldetailsfromDev.get(i)).equals(logDate))
			{
				inout.add(new ResultStructurev2(deviceLogsv2Utilities.getTime(alldetailsfromDev.get(i)),alldetailsfromDev.get(i).getC1()));
			}
			/*if(alldetailsfromDev.get(i+1)==null)
				break;
			*/
		}
		return inout;
	}
}
