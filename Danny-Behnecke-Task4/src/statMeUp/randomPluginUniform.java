package statMeUp;

import java.util.Random;

public class randomPluginUniform implements variable {
	
	public double getRandom(double rangeMin, double rangeMax, double seed){
		
		double result=0;
		result= rangeMin + (rangeMax - rangeMin) * new Random().nextDouble();

	
		return result;
	}
	

}
