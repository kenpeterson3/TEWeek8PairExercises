package com.techelevator.ssg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AlienTravelCalculatorController {
	
		@RequestMapping("/alienTravel")
		public String travelInput() {
			return "alienTravelInput";
		}
		
		@RequestMapping("/alienTravelResult")
		public String ageResult(@RequestParam String planet, @RequestParam String transport, @RequestParam int age, ModelMap modelHolder){
			AlienTravelCalculator calc=new AlienTravelCalculator(planet, transport, age);
			modelHolder.put("calculator", calc); 
			return "alienTravelResult";
		}
	}

