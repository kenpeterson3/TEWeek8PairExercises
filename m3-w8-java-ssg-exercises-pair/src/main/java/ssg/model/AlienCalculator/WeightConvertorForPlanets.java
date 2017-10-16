package ssg.model.AlienCalculator;

import java.math.BigDecimal;


public class WeightConvertorForPlanets {
	
	private static final int MERCURY = 0;
	private static final int VENUS = 1;
	private static final int EARTH = 2;
	private static final int MARS = 3;
	private static final int JUPITER = 4;
	private static final int SATURN = 5;
	private static final int URANUS = 6;
	private static final int NEPTUNE = 7;
	private static final int PLUTO = 8;
	
	private static final String[] PLANETS = {"mercury","venus","earth", "mars", "jupiter", "saturn", "uranus", "neptune", "pluto"};
	private static final double[] RELATIVE_G_VALUES_COMPARED_TO_EARTH = {.378,.907,1,.166,.377,2.36,.916,.889,1.12,.071};
	
	private int desiredPlanetIndex;
	private double weightToConvert;

	public WeightConvertorForPlanets(String desiredPlanet, double weightToConvert) {
		this.weightToConvert = weightToConvert;
		this.desiredPlanetIndex = getPlanetIndex(desiredPlanet);
	}
	
	public double getConvertedWeightAtPlanet(){
		return weightToConvert * RELATIVE_G_VALUES_COMPARED_TO_EARTH[desiredPlanetIndex];
		
	
	}
	
	public String getPlanet(){
		return PLANETS[desiredPlanetIndex];
		
	}
	
	 private int getPlanetIndex(String planet){
		 for(int i =0; i < PLANETS.length; i++){
			 if(PLANETS[i].equalsIgnoreCase(planet)){
				 return i;
			 }
				 
		 }
		return -1; 
	 }

	public int getDesiredPlanetIndex() {
		return desiredPlanetIndex;
	}

	public void setDesiredPlanetIndex(int desiredPlanetIndex) {
		this.desiredPlanetIndex = desiredPlanetIndex;
	}

	public double getWeightToConvert() {
		return weightToConvert;
	}

	public void setWeightToConvert(double weightToConvert) {
		this.weightToConvert = weightToConvert;
	}

}
