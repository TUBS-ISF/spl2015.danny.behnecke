package statMeUp;

import java.util.Random;

public class randomPluginExponential implements variable {//TODO add throwable for if double is below 0

	@Override
	public double getRandom(double rangeMin, double rangeMax, double seed) {
		double result=0;
		result= rangeMin + (rangeMax - rangeMin) * new Random().nextDouble();
		
		if(seed != 0){
			result = -1* Math.log(result)/seed;	
		}
		return result;
	}

}
