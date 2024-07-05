package com.isquarebs.logtracker.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.stereotype.Component;

@Component
public class ResultStructure {
	private String userid;
	private LocalDate localdate;
	private LocalTime firstintime;
	private LocalTime lastouttime;
	private LocalTime productivetime;
	public ResultStructure() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ResultStructure(String userid, LocalDate localdate, LocalTime firstintime, LocalTime lastouttime,
			LocalTime productivetime) {
		super();
		this.userid = userid;
		this.localdate = localdate;
		this.firstintime = firstintime;
		this.lastouttime = lastouttime;
		this.productivetime = productivetime;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public LocalDate getLocaldate() {
		return localdate;
	}
	public void setLocaldate(LocalDate localdate) {
		this.localdate = localdate;
	}
	public LocalTime getFirstintime() {
		return firstintime;
	}
	public void setFirstintime(LocalTime firstintime) {
		this.firstintime = firstintime;
	}
	public LocalTime getLastouttime() {
		return lastouttime;
	}
	public void setLastouttime(LocalTime lastouttime) {
		this.lastouttime = lastouttime;
	}
	public LocalTime getProductivetime() {
		return productivetime;
	}
	public void setProductivetime(LocalTime productivetime) {
		this.productivetime = productivetime;
	}
	@Override
	public String toString() {
		return "ResultStructure [userid=" + userid + ", localdate=" + localdate + ", firstintime=" + firstintime
				+ ", lastouttime=" + lastouttime + ", productivetime=" + productivetime + "]";
	}
}
