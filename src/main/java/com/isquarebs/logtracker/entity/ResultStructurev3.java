package com.isquarebs.logtracker.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.stereotype.Component;

@Component
public class ResultStructurev3 {
	private String userid;
	private LocalDate localdate;
	private LocalTime firstintime;
	private LocalTime lastouttime;
	private LocalTime productivetime;
	private LocalTime nonproductivetime;
	public ResultStructurev3() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ResultStructurev3(String userid, LocalDate localdate, LocalTime firstintime, LocalTime lastouttime,
			LocalTime productivetime, LocalTime nonproductivetime) {
		super();
		this.userid = userid;
		this.localdate = localdate;
		this.firstintime = firstintime;
		this.lastouttime = lastouttime;
		this.productivetime = productivetime;
		this.nonproductivetime = nonproductivetime;
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
	public LocalTime getNonproductivetime() {
		return nonproductivetime;
	}
	public void setNonproductivetime(LocalTime nonproductivetime) {
		this.nonproductivetime = nonproductivetime;
	}
	@Override
	public String toString() {
		return "ResultStructurev3 [userid=" + userid + ", localdate=" + localdate + ", firstintime=" + firstintime
				+ ", lastouttime=" + lastouttime + ", productivetime=" + productivetime + ", nonproductivetime="
				+ nonproductivetime + "]";
	}
}
