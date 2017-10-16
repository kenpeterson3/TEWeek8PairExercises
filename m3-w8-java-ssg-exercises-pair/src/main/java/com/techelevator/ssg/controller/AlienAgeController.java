package com.techelevator.ssg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.techelevator.ssg.model.forum.AlienAgeCalculator;




@Controller
public class AlienAgeController{
	
	@RequestMapping("/alienAge")
	public String ageInput() {
		return "alienAgeInput";
	}
	
	@RequestMapping("/alienAgeResult")
	public String ageResult(@RequestParam String planet, @RequestParam int age, ModelMap modelHolder){
		AlienAgeCalculator calc=new AlienAgeCalculator(age, planet);
		modelHolder.put("calculator", calc); 
		return "alienAgeResult";
	}
}