package com.isquarebs.logtracker.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "devicelogs_1_2024")
public class DeviceLogs {
	
	@Id
	@Column(name = "devicelogid")
	private int deviceLogId;
	@Column(name = "downloaddate")
	private LocalDateTime downloadDate;
	@Column(name = "deviceid")
	private Long deviceId;
	@Column(name = "userid")
	private String userId;
	@Column(name = "logdate")
	private LocalDateTime logDate;
	private String direction;
	private String attDirection;
	private String c1;
	private String c2;
	private String c3;
	private String c4;
	private String c5;
	private String c6;
	private String c7;
	private String workCode;
	@Column(name = "updateflag")
	private Long updateFlag;
	@Column(name = "isapproved")
	private Long isApproved;
	private String employeeImage;
	private String fileName;
	private String longitude;
	private String latitude;
	@Column(name = "createddate")
	private LocalDateTime createdDate;
	@Column(name = "lastmodifieddate")
	private LocalDateTime lastModifiedDate;
	private String locationAddress;
	@Column(name = "bodytemperature")
	private Double bodyTemperature;
	@Column(name = "ismaskon")
	private Double isMaskOn;
	
	public DeviceLogs() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DeviceLogs(Integer deviceLogId, LocalDateTime downloadDate, Long deviceId, String userId,
			LocalDateTime logDate, String direction, String attDirection, String c1, String c2, String c3, String c4,
			String c5, String c6, String c7, String workCode, Long updateFlag, Long isApproved, String employeeImage,
			String fileName, String longitude, String latitude, LocalDateTime createdDate,
			LocalDateTime lastModifiedDate, String locationAddress, Double bodyTemperature, Double isMaskOn) {
		super();
		this.deviceLogId = deviceLogId;
		this.downloadDate = downloadDate;
		this.deviceId = deviceId;
		this.userId = userId;
		this.logDate = logDate;
		this.direction = direction;
		this.attDirection = attDirection;
		this.c1 = c1;
		this.c2 = c2;
		this.c3 = c3;
		this.c4 = c4;
		this.c5 = c5;
		this.c6 = c6;
		this.c7 = c7;
		this.workCode = workCode;
		this.updateFlag = updateFlag;
		this.isApproved = isApproved;
		this.employeeImage = employeeImage;
		this.fileName = fileName;
		this.longitude = longitude;
		this.latitude = latitude;
		this.createdDate = createdDate;
		this.lastModifiedDate = lastModifiedDate;
		this.locationAddress = locationAddress;
		this.bodyTemperature = bodyTemperature;
		this.isMaskOn = isMaskOn;
	}

	public Integer getDeviceLogId() {
		return deviceLogId;
	}

	public void setDeviceLogId(Integer deviceLogId) {
		this.deviceLogId = deviceLogId;
	}

	public LocalDateTime getDownloadDate() {
		return downloadDate;
	}

	public void setDownloadDate(LocalDateTime downloadDate) {
		this.downloadDate = downloadDate;
	}

	public Long getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(Long deviceId) {
		this.deviceId = deviceId;
	}

	public String getUserid() {
		return userId;
	}

	public void setUserId(String userid) {
		this.userId = userid;
	}

	public LocalDateTime getLogDate() {
		return logDate;
	}

	public void setLogDate(LocalDateTime logDate) {
		this.logDate = logDate;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public String getAttDirection() {
		return attDirection;
	}

	public void setAttDirection(String attDirection) {
		this.attDirection = attDirection;
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

	public String getWorkCode() {
		return workCode;
	}

	public void setWorkCode(String workCode) {
		this.workCode = workCode;
	}

	public Long getUpdateFlag() {
		return updateFlag;
	}

	public void setUpdateFlag(Long updateFlag) {
		this.updateFlag = updateFlag;
	}

	public Long getIsApproved() {
		return isApproved;
	}

	public void setIsApproved(Long isApproved) {
		this.isApproved = isApproved;
	}

	public String getEmployeeImage() {
		return employeeImage;
	}

	public void setEmployeeImage(String employeeImage) {
		this.employeeImage = employeeImage;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDateTime getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(LocalDateTime lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public String getLocationAddress() {
		return locationAddress;
	}

	public void setLocationAddress(String locationAddress) {
		this.locationAddress = locationAddress;
	}

	public Double getBodyTemperature() {
		return bodyTemperature;
	}

	public void setBodyTemperature(Double bodyTemperature) {
		this.bodyTemperature = bodyTemperature;
	}

	public Double getIsMaskOn() {
		return isMaskOn;
	}

	public void setIsMaskOn(Double isMaskOn) {
		this.isMaskOn = isMaskOn;
	}
	
}
