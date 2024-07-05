package com.isquarebs.logtracker.entity;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

@Component
public class ResultStructureEmployeeLogs {
	private int numericCode;
	private int employeeId;
	private String employeeName;
	private String designation;
	private String gender;
	private LocalDateTime doj;
	private LocalDateTime dor;
	private String employementType;
	private String status;
	private String contactNo;
	private String email;
	
	public ResultStructureEmployeeLogs() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ResultStructureEmployeeLogs(int numericCode, int employeeId, String employeeName, String designation,
			String gender, LocalDateTime doj, LocalDateTime dor, String employementType, String status,
			String contactNo, String email) {
		super();
		this.numericCode = numericCode;
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.designation = designation;
		this.gender = gender;
		this.doj = doj;
		this.dor = dor;
		this.employementType = employementType;
		this.status = status;
		this.contactNo = contactNo;
		this.email = email;
	}

	public int getNumericCode() {
		return numericCode;
	}

	public void setNumericCode(int numericCode) {
		this.numericCode = numericCode;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDateTime getDoj() {
		return doj;
	}

	public void setDoj(LocalDateTime doj) {
		this.doj = doj;
	}

	public LocalDateTime getDor() {
		return dor;
	}

	public void setDor(LocalDateTime dor) {
		this.dor = dor;
	}

	public String getEmployementType() {
		return employementType;
	}

	public void setEmployementType(String employementType) {
		this.employementType = employementType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "ResultStructureEmployeeLogs [numericCode=" + numericCode + ", employeeId=" + employeeId
				+ ", employeeName=" + employeeName + ", designation=" + designation + ", gender=" + gender + ", doj="
				+ doj + ", dor=" + dor + ", employementType=" + employementType + ", status=" + status + ", contactNo="
				+ contactNo + ", email=" + email + "]";
	}
}
