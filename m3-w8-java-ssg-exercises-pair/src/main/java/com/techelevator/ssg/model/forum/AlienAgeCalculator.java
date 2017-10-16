package com.techelevator.ssg.model.forum;

import java.util.HashMap;
import java.util.Map;

public class AlienAgeCalculator {
	private int age;
	private String planet;
	private Map<String, Double> planetMultiplier;
	
	public AlienAgeCalculator(int age, String planet) {
		this.age =age;
		this.planet = planet;
		
		planetMultiplier = new HashMap<String, Double>();
		planetMultiplier.put("mercury", 0.24);
		planetMultiplier.put("venus", 0.62);
		planetMultiplier.put("earth", 1.00);
		planetMultiplier.put("mars", 1.88);
		planetMultiplier.put("jupiter", 11.86);
		planetMultiplier.put("saturn", 29.46);
		planetMultiplier.put("uranus", 164.81);
		planetMultiplier.put("neptune",84.07 );
		planetMultiplier.put("pluto", 247.7);
		
	}
	
	public double getAlienAge() {
		return age / planetMultiplier.get(planet);
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPlanet() {
		return planet;
	}
	public void setPlanet(String planet) {
		this.planet = planet;
	}
	
	
}
