package com.isquarebs.logtracker.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.isquarebs.logtracker.entity.EmployeeLogs;
import com.isquarebs.logtracker.entity.ResultStructureEmployeeLogs;

@Service
public interface EmployeeLogsService {
	public List<String> getEmployees();
	public List<EmployeeLogs> getEmployeesDet();
	public List<ResultStructureEmployeeLogs> getEmployeesReq();
	public String getEmployeeByNumCode(int numericCode);
	public List<ResultStructureEmployeeLogs> implementNamingConvention(String empname);
}
