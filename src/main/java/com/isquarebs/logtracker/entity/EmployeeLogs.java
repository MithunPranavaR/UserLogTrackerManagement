package com.isquarebs.logtracker.entity;

import java.time.LocalDateTime;
import java.util.Arrays;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employees")
public class EmployeeLogs {
	@Column(name="employeeid")
	private int employeeId;
	@Column(name="employeename")
	private String employeeName;
	@Column(name="employeecode")
	private String employeeCode;
	@Column(name="stringcode")
	private String stringCode;
	@Id
	@Column(name="numericcode")
	private int numericCode;
	//@Column(name="Designation")
	private String gender;
	private int companyId;
	private int departmentId;
	@Column(name="Designation")
	private String designation;
	private int categoryId;
	private LocalDateTime doj;
	private LocalDateTime dor;
	private LocalDateTime doc;
	private String employeeCodeInDevice;
	private String employeeRFIDNumber;
	@Column(name="employementtype")
	private String employementType;
	private String status;
	private String employeeDevicePassword;
	private String employeeDeviceGroup;
	private String fatherName;
	private String motherName;
	private String residentialAddress;
	private String permanentAddress;
	@Column(name="contactno")
	private String contactNo;
	private String email;
	private LocalDateTime dob;
	private String placeOfBirth;
	private String nomenee1;
	private String nomenee2;
	private String remarks;
	private int recordStatus;
	private String c1;
	private String c2;
	private String c3;
	private String c4;
	private String c5;
	private String c6;
	private String c7;
	private String location;
	private String bloodGroup;
	private String workPlace;
	private String extensionNo;
	private String loginName;
	private String loginPassword;
	private String grade;
	private String team;
	private byte isRecieveNotification;
	private double holidayGroup;
	private double shiftGroupId;
	private int shiftRosterId;
	private String lastModifiedBy;
	private String aadhaarNumber;
	private byte[] employeePhoto;
	private double masterDeviceId;
	private String bioPhoto1;
	private byte[] bioPhotoPic;
	private double deviceExpiryRule;
	private LocalDateTime deviceExpiryStartDate;
	private LocalDateTime deviceExpiryEndDate;
	private double deviceId;
	private LocalDateTime enrolledDate;
	private double migrateToOtherCryptography;
	private double geofenceId;
	
	public EmployeeLogs() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeLogs(int employeeId, String employeeName, String employeeCode, String stringCode, int numericCode,
			String gender, int companyId, int departmentId, String designation, int categoryId, LocalDateTime doj,
			LocalDateTime dor, LocalDateTime doc, String employeeCodeInDevice, String employeeRFIDNumber,
			String employementType, String status, String employeeDevicePassword, String employeeDeviceGroup,
			String fatherName, String motherName, String residentialAddress, String permanentAddress, String contactNo,
			String email, LocalDateTime dob, String placeOfBirth, String nomenee1, String nomenee2, String remarks,
			int recordStatus, String c1, String c2, String c3, String c4, String c5, String c6, String c7,
			String location, String bloodGroup, String workPlace, String extensionNo, String loginName,
			String loginPassword, String grade, String team, byte isRecieveNotification, double holidayGroup,
			double shiftGroupId, int shiftRosterId, String lastModifiedBy, String aadhaarNumber, byte[] employeePhoto,
			double masterDeviceId, String bioPhoto1, byte[] bioPhotoPic, double deviceExpiryRule,
			LocalDateTime deviceExpiryStartDate, LocalDateTime deviceExpiryEndDate, double deviceId,
			LocalDateTime enrolledDate, double migrateToOtherCryptography, double geofenceId) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeCode = employeeCode;
		this.stringCode = stringCode;
		this.numericCode = numericCode;
		this.gender = gender;
		this.companyId = companyId;
		this.departmentId = departmentId;
		this.designation = designation;
		this.categoryId = categoryId;
		this.doj = doj;
		this.dor = dor;
		this.doc = doc;
		this.employeeCodeInDevice = employeeCodeInDevice;
		this.employeeRFIDNumber = employeeRFIDNumber;
		this.employementType = employementType;
		this.status = status;
		this.employeeDevicePassword = employeeDevicePassword;
		this.employeeDeviceGroup = employeeDeviceGroup;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.residentialAddress = residentialAddress;
		this.permanentAddress = permanentAddress;
		this.contactNo = contactNo;
		this.email = email;
		this.dob = dob;
		this.placeOfBirth = placeOfBirth;
		this.nomenee1 = nomenee1;
		this.nomenee2 = nomenee2;
		this.remarks = remarks;
		this.recordStatus = recordStatus;
		this.c1 = c1;
		this.c2 = c2;
		this.c3 = c3;
		this.c4 = c4;
		this.c5 = c5;
		this.c6 = c6;
		this.c7 = c7;
		this.location = location;
		this.bloodGroup = bloodGroup;
		this.workPlace = workPlace;
		this.extensionNo = extensionNo;
		this.loginName = loginName;
		this.loginPassword = loginPassword;
		this.grade = grade;
		this.team = team;
		this.isRecieveNotification = isRecieveNotification;
		this.holidayGroup = holidayGroup;
		this.shiftGroupId = shiftGroupId;
		this.shiftRosterId = shiftRosterId;
		this.lastModifiedBy = lastModifiedBy;
		this.aadhaarNumber = aadhaarNumber;
		this.employeePhoto = employeePhoto;
		this.masterDeviceId = masterDeviceId;
		this.bioPhoto1 = bioPhoto1;
		this.bioPhotoPic = bioPhotoPic;
		this.deviceExpiryRule = deviceExpiryRule;
		this.deviceExpiryStartDate = deviceExpiryStartDate;
		this.deviceExpiryEndDate = deviceExpiryEndDate;
		this.deviceId = deviceId;
		this.enrolledDate = enrolledDate;
		this.migrateToOtherCryptography = migrateToOtherCryptography;
		this.geofenceId = geofenceId;
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

	public String getEmployeeCode() {
		return employeeCode;
	}

	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}

	public String getStringCode() {
		return stringCode;
	}

	public void setStringCode(String stringCode) {
		this.stringCode = stringCode;
	}

	public int getNumericCode() {
		return numericCode;
	}

	public void setNumericCode(int numericCode) {
		this.numericCode = numericCode;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
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

	public LocalDateTime getDoc() {
		return doc;
	}

	public void setDoc(LocalDateTime doc) {
		this.doc = doc;
	}

	public String getEmployeeCodeInDevice() {
		return employeeCodeInDevice;
	}

	public void setEmployeeCodeInDevice(String employeeCodeInDevice) {
		this.employeeCodeInDevice = employeeCodeInDevice;
	}

	public String getEmployeeRFIDNumber() {
		return employeeRFIDNumber;
	}

	public void setEmployeeRFIDNumber(String employeeRFIDNumber) {
		this.employeeRFIDNumber = employeeRFIDNumber;
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

	public String getEmployeeDevicePassword() {
		return employeeDevicePassword;
	}

	public void setEmployeeDevicePassword(String employeeDevicePassword) {
		this.employeeDevicePassword = employeeDevicePassword;
	}

	public String getEmployeeDeviceGroup() {
		return employeeDeviceGroup;
	}

	public void setEmployeeDeviceGroup(String employeeDeviceGroup) {
		this.employeeDeviceGroup = employeeDeviceGroup;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getResidentialAddress() {
		return residentialAddress;
	}

	public void setResidentialAddress(String residentialAddress) {
		this.residentialAddress = residentialAddress;
	}

	public String getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
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

	public LocalDateTime getDob() {
		return dob;
	}

	public void setDob(LocalDateTime dob) {
		this.dob = dob;
	}

	public String getPlaceOfBirth() {
		return placeOfBirth;
	}

	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}

	public String getNomenee1() {
		return nomenee1;
	}

	public void setNomenee1(String nomenee1) {
		this.nomenee1 = nomenee1;
	}

	public String getNomenee2() {
		return nomenee2;
	}

	public void setNomenee2(String nomenee2) {
		this.nomenee2 = nomenee2;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public int getRecordStatus() {
		return recordStatus;
	}

	public void setRecordStatus(int recordStatus) {
		this.recordStatus = recordStatus;
	}

	public String getC1() {
		return c1;
	}

	public void setC1(String c1) {
		this.c1 = c1;
	}

	public String getC2() {
		return c2;
	}

	public void setC2(String c2) {
		this.c2 = c2;
	}

	public String getC3() {
		return c3;
	}

	public void setC3(String c3) {
		this.c3 = c3;
	}

	public String getC4() {
		return c4;
	}

	public void setC4(String c4) {
		this.c4 = c4;
	}

	public String getC5() {
		return c5;
	}

	public void setC5(String c5) {
		this.c5 = c5;
	}

	public String getC6() {
		return c6;
	}

	public void setC6(String c6) {
		this.c6 = c6;
	}

	public String getC7() {
		return c7;
	}

	public void setC7(String c7) {
		this.c7 = c7;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getWorkPlace() {
		return workPlace;
	}

	public void setWorkPlace(String workPlace) {
		this.workPlace = workPlace;
	}

	public String getExtensionNo() {
		return extensionNo;
	}

	public void setExtensionNo(String extensionNo) {
		this.extensionNo = extensionNo;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public byte getIsRecieveNotification() {
		return isRecieveNotification;
	}

	public void setIsRecieveNotification(byte isRecieveNotification) {
		this.isRecieveNotification = isRecieveNotification;
	}

	public double getHolidayGroup() {
		return holidayGroup;
	}

	public void setHolidayGroup(double holidayGroup) {
		this.holidayGroup = holidayGroup;
	}

	public double getShiftGroupId() {
		return shiftGroupId;
	}

	public void setShiftGroupId(double shiftGroupId) {
		this.shiftGroupId = shiftGroupId;
	}

	public int getShiftRosterId() {
		return shiftRosterId;
	}

	public void setShiftRosterId(int shiftRosterId) {
		this.shiftRosterId = shiftRosterId;
	}

	public String getLastModifiedBy() {
		return lastModifiedBy;
	}

	public void setLastModifiedBy(String lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}

	public String getAadhaarNumber() {
		return aadhaarNumber;
	}

	public void setAadhaarNumber(String aadhaarNumber) {
		this.aadhaarNumber = aadhaarNumber;
	}

	public byte[] getEmployeePhoto() {
		return employeePhoto;
	}

	public void setEmployeePhoto(byte[] employeePhoto) {
		this.employeePhoto = employeePhoto;
	}

	public double getMasterDeviceId() {
		return masterDeviceId;
	}

	public void setMasterDeviceId(double masterDeviceId) {
		this.masterDeviceId = masterDeviceId;
	}

	public String getBioPhoto1() {
		return bioPhoto1;
	}

	public void setBioPhoto1(String bioPhoto1) {
		this.bioPhoto1 = bioPhoto1;
	}

	public byte[] getBioPhotoPic() {
		return bioPhotoPic;
	}

	public void setBioPhotoPic(byte[] bioPhotoPic) {
		this.bioPhotoPic = bioPhotoPic;
	}

	public double getDeviceExpiryRule() {
		return deviceExpiryRule;
	}

	public void setDeviceExpiryRule(double deviceExpiryRule) {
		this.deviceExpiryRule = deviceExpiryRule;
	}

	public LocalDateTime getDeviceExpiryStartDate() {
		return deviceExpiryStartDate;
	}

	public void setDeviceExpiryStartDate(LocalDateTime deviceExpiryStartDate) {
		this.deviceExpiryStartDate = deviceExpiryStartDate;
	}

	public LocalDateTime getDeviceExpiryEndDate() {
		return deviceExpiryEndDate;
	}

	public void setDeviceExpiryEndDate(LocalDateTime deviceExpiryEndDate) {
		this.deviceExpiryEndDate = deviceExpiryEndDate;
	}

	public double getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(double deviceId) {
		this.deviceId = deviceId;
	}

	public LocalDateTime getEnrolledDate() {
		return enrolledDate;
	}

	public void setEnrolledDate(LocalDateTime enrolledDate) {
		this.enrolledDate = enrolledDate;
	}

	public double getMigrateToOtherCryptography() {
		return migrateToOtherCryptography;
	}

	public void setMigrateToOtherCryptography(double migrateToOtherCryptography) {
		this.migrateToOtherCryptography = migrateToOtherCryptography;
	}

	public double getGeofenceId() {
		return geofenceId;
	}

	public void setGeofenceId(double geofenceId) {
		this.geofenceId = geofenceId;
	}

	@Override
	public String toString() {
		return "EmployeeLogs [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeCode="
				+ employeeCode + ", stringCode=" + stringCode + ", numericCode=" + numericCode + ", gender=" + gender
				+ ", companyId=" + companyId + ", departmentId=" + departmentId + ", designation=" + designation
				+ ", categoryId=" + categoryId + ", doj=" + doj + ", dor=" + dor + ", doc=" + doc
				+ ", employeeCodeInDevice=" + employeeCodeInDevice + ", employeeRFIDNumber=" + employeeRFIDNumber
				+ ", employementType=" + employementType + ", status=" + status + ", employeeDevicePassword="
				+ employeeDevicePassword + ", employeeDeviceGroup=" + employeeDeviceGroup + ", fatherName=" + fatherName
				+ ", motherName=" + motherName + ", residentialAddress=" + residentialAddress + ", permanentAddress="
				+ permanentAddress + ", contactNo=" + contactNo + ", email=" + email + ", dob=" + dob
				+ ", placeOfBirth=" + placeOfBirth + ", nomenee1=" + nomenee1 + ", nomenee2=" + nomenee2 + ", remarks="
				+ remarks + ", recordStatus=" + recordStatus + ", c1=" + c1 + ", c2=" + c2 + ", c3=" + c3 + ", c4=" + c4
				+ ", c5=" + c5 + ", c6=" + c6 + ", c7=" + c7 + ", location=" + location + ", bloodGroup=" + bloodGroup
				+ ", workPlace=" + workPlace + ", extensionNo=" + extensionNo + ", loginName=" + loginName
				+ ", loginPassword=" + loginPassword + ", grade=" + grade + ", team=" + team
				+ ", isRecieveNotification=" + isRecieveNotification + ", holidayGroup=" + holidayGroup
				+ ", shiftGroupId=" + shiftGroupId + ", shiftRosterId=" + shiftRosterId + ", lastModifiedBy="
				+ lastModifiedBy + ", aadhaarNumber=" + aadhaarNumber + ", employeePhoto="
				+ Arrays.toString(employeePhoto) + ", masterDeviceId=" + masterDeviceId + ", bioPhoto1=" + bioPhoto1
				+ ", bioPhotoPic=" + Arrays.toString(bioPhotoPic) + ", deviceExpiryRule=" + deviceExpiryRule
				+ ", deviceExpiryStartDate=" + deviceExpiryStartDate + ", deviceExpiryEndDate=" + deviceExpiryEndDate
				+ ", deviceId=" + deviceId + ", enrolledDate=" + enrolledDate + ", migrateToOtherCryptography="
				+ migrateToOtherCryptography + ", geofenceId=" + geofenceId + "]";
	}
	
}
