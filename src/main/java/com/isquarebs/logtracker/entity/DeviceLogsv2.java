package com.isquarebs.logtracker.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

@Component
public class DeviceLogsv2 {
	private String userId;
	private LocalDate logDate;
	public DeviceLogsv2() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DeviceLogsv2(String userId, LocalDate logDate) {
		super();
		this.userId = userId;
		this.logDate = logDate;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public LocalDate getLogDate() {
		return logDate;
	}
	public void setLogDate(LocalDate logDate) {
		this.logDate = logDate;
	}
	@Override
	public String toString() {
		return "DeviceLogsv2 [userId=" + userId + "]";
	}
	
}
