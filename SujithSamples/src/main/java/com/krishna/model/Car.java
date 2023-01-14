package com.krishna.model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Car {

	private Map currentBooking = new HashMap();

	private String carRegNo;
	private String carOwner;
	private Date parkingTime;
	
	public String getCarRegNo() {
		return carRegNo;
	}
	public void setCarRegNo(String carRegNo) {
		this.carRegNo = carRegNo;
	}
	public String getCarOwner() {
		return carOwner;
	}
	public void setCarOwner(String carOwner) {
		this.carOwner = carOwner;
	}
	public Date getParkingTime() {
		return parkingTime;
	}
	public void setParkingTime(Date parkingTime) {
		this.parkingTime = parkingTime;
	}
	public Map getCurrentBooking() {
		return currentBooking;
	}
	public void setCurrentBooking(Map currentBooking) {
		this.currentBooking = currentBooking;
	}
	
	
		
}
