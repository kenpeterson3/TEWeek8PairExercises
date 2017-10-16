
package com.techelevator.ssg.controller;

import java.util.HashMap;
import java.util.Map;

public class AlienTravelCalculator  {
	private long distance;
	private int speed;
	private String planet;
	private Map<String, Long> planetMultiplier;
	private Map<String, Integer> speedForTransport;
	private String transport;
	private int age;
	
	public AlienTravelCalculator(String planet, String transport, int age) {
		
		this.setTransport(transport);
		this.planet = planet;
		this.age = age;
		
		planetMultiplier = new HashMap<String, Long>();
		planetMultiplier.put("mercury", 56974146l);
		planetMultiplier.put("venus", 25724767l);
		planetMultiplier.put("earth", 1l);
		planetMultiplier.put("mars", 48678219l);
		planetMultiplier.put("jupiter", 390674710l);
		planetMultiplier.put("saturn", 792248270l);
		planetMultiplier.put("uranus", 1692662530l);
		planetMultiplier.put("neptune", 2703959960l);
		planetMultiplier.put("pluto", 4670000000l);
		
		this.distance =planetMultiplier.get(planet);
		speedForTransport = new HashMap<String, Integer>();
		speedForTransport.put("walk", 3);
		speedForTransport.put("car", 100);
		speedForTransport.put("bullet train", 200);
		speedForTransport.put("boeing 747", 570);
		speedForTransport.put("concorde", 1350);
		
		this.speed= speedForTransport.get(transport);
		
		
	}
	
	
	
	public long getDistance() {
		return distance;
	}

	public void setDistance(long distance) {
		this.distance = distance;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getPlanet() {
		return planet;
	}

	public void setPlanet(String planet) {
		this.planet = planet;
	}
	
	public double getTimeTravelTime(){
		return Math.round(distance/(double)speed*100)/(100.00*24*365);
	}
	public double getAgeAfterTravel() {
		return getTimeTravelTime() + age;
	}


	public String getTransport() {
		return transport;
	}



	public void setTransport(String transport) {
		this.transport = transport;
	}
	
	
	
	
}
