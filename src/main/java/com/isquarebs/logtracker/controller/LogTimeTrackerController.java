package com.isquarebs.logtracker.controller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isquarebs.logtracker.entity.DeviceLogs;
import com.isquarebs.logtracker.entity.DeviceLogsv2;
import com.isquarebs.logtracker.entity.EmployeeLogs;
import com.isquarebs.logtracker.entity.ResultStructure;
import com.isquarebs.logtracker.entity.ResultStructureEmployeeLogs;
import com.isquarebs.logtracker.entity.ResultStructurev2;
import com.isquarebs.logtracker.entity.ResultStructurev3;
//import com.isquarebs.logtracker.services.DeviceEmployeeServiceImpl;
import com.isquarebs.logtracker.services.DeviceLogsServiceImpl;
import com.isquarebs.logtracker.services.EmployeeLogsServiceImpl;

@RestController
@RequestMapping("/api/logs")
public class LogTimeTrackerController {
	
	@Autowired
	private DeviceLogsServiceImpl deviceLogsServiceImpl=new DeviceLogsServiceImpl() ;
	@Autowired
	private EmployeeLogsServiceImpl employeeLogsServiceImpl=new EmployeeLogsServiceImpl(); 
	@Autowired
	//private DeviceEmployeeServiceImpl deviceEmployeeServiceImpl=new DeviceEmployeeServiceImpl();
	
	public LogTimeTrackerController(DeviceLogsServiceImpl deviceLogsServiceImpl) {
		this.deviceLogsServiceImpl = deviceLogsServiceImpl;
	}


	@GetMapping(value = "/user/{id}")
	public List<DeviceLogs> getAllUsers(@PathVariable("id") String userId) {
	    return deviceLogsServiceImpl.getDeviceLogsByUserId(userId);
	}
	/*@GetMapping(value = "/users/{id}")
	public List<DeviceLogs> getReqUsers(@PathVariable("id") String userId) {
	    return deviceLogsServiceImpl.getReqDeviceLogsByUserId(userId);
	}*/
	@CrossOrigin(origins = "*")
	@GetMapping(value = "/usersv3/{id}")
	public List<ResultStructurev3> getProductiveTime(@PathVariable("id") String userId) {
	    return deviceLogsServiceImpl.getProductiveHours(userId);
	}

	@GetMapping(value="/employees/details")
	public List<EmployeeLogs> getEmployeeDet()
	{
		return employeeLogsServiceImpl.getEmployeesDet();
	}
	
	@CrossOrigin(origins = "*")
	@GetMapping(value="/employees/names")
	public List<String> getEmployeeNames()
	{
		return employeeLogsServiceImpl.getEmployees();
	}
	
	@GetMapping(value="/employees/names/{id}")
	public String getEmployeeByNumCode(@PathVariable("id") int numericCode)
	{
		return employeeLogsServiceImpl.getEmployeeByNumCode(numericCode);
	}
	@CrossOrigin(origins = "*")
	@GetMapping(value="/employees/reqdet")
	public List<ResultStructureEmployeeLogs> getEmployeeReqDet()
	{
		return employeeLogsServiceImpl.getEmployeesReq();
	}
	
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@PostMapping(value="/employees/inout")
	public List<ResultStructurev2> getEmployeeInOut(@RequestBody DeviceLogsv2 deviceLogsv2)
	{
		return deviceLogsServiceImpl.getReqEmployeesInOut(deviceLogsv2.getUserId(),deviceLogsv2.getLogDate());
	}
	
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@GetMapping(value="/employees/inout/{id}/{date}")
	public List<ResultStructurev2> getEmployeeInOut(@PathVariable("id") String id,@PathVariable("date") LocalDate date)
	{
		return deviceLogsServiceImpl.getReqEmployeesInOut(id,date);
	}
	
	@CrossOrigin(origins = "*")
	@GetMapping(value="/employees/reqnames/{name}")
	public List<ResultStructureEmployeeLogs> getEmployeeReqNames(@PathVariable("name") String empname)
	{
		return employeeLogsServiceImpl.implementNamingConvention(empname);
	}
}
