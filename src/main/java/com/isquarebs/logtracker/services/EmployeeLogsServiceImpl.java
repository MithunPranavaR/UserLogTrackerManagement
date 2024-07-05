package com.isquarebs.logtracker.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isquarebs.logtracker.entity.EmployeeLogs;
import com.isquarebs.logtracker.entity.ResultStructureEmployeeLogs;
import com.isquarebs.logtracker.entity.ResultStructurev2;
import com.isquarebs.logtracker.repository.EmployeeLogsRepository;

@Service
public class EmployeeLogsServiceImpl implements EmployeeLogsService{
	
	public EmployeeLogsServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Autowired
	private final EmployeeLogsRepository employeeLogsRepository= null;
	
	@SuppressWarnings("null")
	public List<String> getEmployees()
	{
		List<EmployeeLogs> allEmplDet=employeeLogsRepository.getAllEmployees();
		List<String> allEmpl = new ArrayList<>();
		
		for(int i=0;i<allEmplDet.size();i++)
		{
			allEmpl.add(allEmplDet.get(i).getEmployeeName());
			System.out.println(allEmplDet.get(i).getEmployeeName());
		}
		return allEmpl;
	}
	
	public List<ResultStructureEmployeeLogs> getEmployeesReq()
	{
		List<EmployeeLogs> allEmplDet=employeeLogsRepository.getAllEmployees();
		List<ResultStructureEmployeeLogs> emplreqdet = new ArrayList<>();
		
		for(int i=0;i<allEmplDet.size();i++)
		{
			emplreqdet.add(new ResultStructureEmployeeLogs(allEmplDet.get(i).getNumericCode(),allEmplDet.get(i).getEmployeeId(),allEmplDet.get(i).getEmployeeName(),allEmplDet.get(i).getDesignation(),allEmplDet.get(i).getGender(),allEmplDet.get(i).getDoj(),allEmplDet.get(i).getDor(),allEmplDet.get(i).getEmployementType(),allEmplDet.get(i).getStatus(),allEmplDet.get(i).getContactNo(),allEmplDet.get(i).getEmail()));
			//System.out.println(allEmplDet.get(i).getEmployeeName());
		}
		return emplreqdet;
	}
	
	public List<EmployeeLogs> getEmployeesDet()
	{
		//List<EmployeeLogs> allEmplDet=employeeLogsRepository.getAllEmployees();
		return employeeLogsRepository.getAllEmployees();
	}
	
	public String getEmployeeByNumCode(int numericCode)
	{
		List<EmployeeLogs> reqEmpl=employeeLogsRepository.getEmployeeByCode(numericCode);
		return reqEmpl.get(0).getEmployeeName();
	}
	
	public List<String> implementNamingConvention(List<String> empname)
	{
		String modifiedname;
		List<String> modified =new ArrayList<>();
		//modified.stream().filter().map(name->)
		return modified;
	}

	@Override
	public List<ResultStructureEmployeeLogs> implementNamingConvention(String empname) {
		List<EmployeeLogs> emplogs=employeeLogsRepository.getRequiredEmployeeNames(empname);
		List<ResultStructureEmployeeLogs> names=new ArrayList<>();
		for(int i=0;i<emplogs.size();i++)
		{
			names.add(new ResultStructureEmployeeLogs(emplogs.get(i).getNumericCode(),emplogs.get(i).getEmployeeId(),emplogs.get(i).getEmployeeName(),emplogs.get(i).getDesignation(),emplogs.get(i).getGender(),emplogs.get(i).getDoj(),emplogs.get(i).getDor(),emplogs.get(i).getEmployementType(),emplogs.get(i).getStatus(),emplogs.get(i).getContactNo(),emplogs.get(i).getEmail()));
		}
		return names;
	}
}
