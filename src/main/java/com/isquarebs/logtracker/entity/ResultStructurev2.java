package com.isquarebs.logtracker.entity;

import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;

@Component
public class ResultStructurev2 {
	private LocalTime logTime;
	private String c1;
	public ResultStructurev2() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ResultStructurev2(LocalTime logTime, String c1) {
		super();
		this.logTime = logTime;
		this.c1 = c1;
	}
	public LocalTime getLogTime() {
		return logTime;
	}
	public void setLogTime(LocalTime logTime) {
		this.logTime = logTime;
	}
	public String getC1() {
		return c1;
	}
	public void setC1(String c1) {
		this.c1 = c1;
	}
	@Override
	public String toString() {
		return "ResultStructurev2 [logTime=" + logTime + ", c1=" + c1 + "]";
	}
}
