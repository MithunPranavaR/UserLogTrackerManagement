package com.isquarebs.logtracker.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.isquarebs.logtracker.entity.EmployeeLogs;

public interface EmployeeLogsRepository extends JpaRepository<EmployeeLogs,Integer>{

	@Query(value="SELECT * FROM employees",nativeQuery=true)
	public List<EmployeeLogs> getAllEmployees();
	
	@Query(value="SELECT * FROM employees WHERE numericcode = ?1",nativeQuery=true)
	public List<EmployeeLogs> getEmployeeByCode(int numericCode);
	
	@Query(value="SELECT * FROM employees WHERE employeename LIKE %:empname%",nativeQuery=true)
	public List<EmployeeLogs> getRequiredEmployeeNames(@Param("empname") String empname);
}
