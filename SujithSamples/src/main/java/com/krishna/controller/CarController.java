package com.krishna.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.krishna.model.Car;

@Controller
public class CarController {
	
	@Autowired
	private Car carObject;
	
	
	@RequestMapping("/")
	public String home() {
		return "index.jsp";
	}
	
	@RequestMapping("/booking")
	public String booking(@ModelAttribute("obj") Car car, Model carModel) {
		
		System.out.println("Current map Value "+carObject.getCurrentBooking());
		carObject.getCurrentBooking().put(car.getCarRegNo(), car);
		System.out.println("After Adding map Value "+carObject.getCurrentBooking());
		System.out.println(" Car added -- "+car.getCarRegNo());
		carModel.addAttribute("carObject",carObject);
		
		
		return "results.jsp";
	}

}
