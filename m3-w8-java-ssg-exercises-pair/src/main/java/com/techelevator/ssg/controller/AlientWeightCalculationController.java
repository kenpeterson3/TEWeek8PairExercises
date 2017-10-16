package com.techelevator.ssg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ssg.model.AlienCalculator.WeightConvertorForPlanets;
@Controller
public class AlientWeightCalculationController {

	@RequestMapping("/alienWeightInput")
	public String showAlienWeightInputPage() {
		return "alienWeightInput";
	}
	
	@RequestMapping("/alienWeightResults")
	public String showAlienWeightResultsPage(@RequestParam String planet, @RequestParam double weight, ModelMap modelHolder) {
		WeightConvertorForPlanets calculator = new WeightConvertorForPlanets(planet,weight);
		modelHolder.put("calculator", calculator);
		
		return "alienWeightResults";
	}
	
	
	
}
