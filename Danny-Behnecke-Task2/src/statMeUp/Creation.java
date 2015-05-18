/**
 * 
 */
package statMeUp;

import java.util.Random;

/**
 * @author Danny Behnecke
 *
 */
public class Creation {
	
	private Random r = new Random(); //TODO create getter?
	
	public double variable(double rangeMin, double rangeMax){
		
		
		return rangeMin + (rangeMax - rangeMin) * r.nextDouble();
	}
	
	public double[] set(double rangeMin, double rangeMax, int size){
		double[] result = new double[size];
		
		for(int i=0;i<size;i++){
			
			result[i]=rangeMin + (rangeMax - rangeMin) * r.nextDouble();
		}
		
		return result;
		
	}

}
