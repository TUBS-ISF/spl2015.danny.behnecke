/**
 * 
 */
package statMeUp;

import java.util.Random;

/**
 * @author Danny Behnecke
 *
 */
public class Creation  {
	private Random r = new Random(); //TODO create getter?

	
	
	public double variable(double rangeMin, double rangeMax
			//#if normalDistributed && exponentialDistributed 
//@			, int mode
			//#endif
			//#ifdef exponentialDistributed
//@			, double variance
			//#endif
			){
		
		double result; 
		result= rangeMin + (rangeMax - rangeMin) * r.nextDouble();
		//#if normalDistributed && exponentialDistributed
//@		if(mode == 0){
		//#endif
		result= rangeMin + (rangeMax - rangeMin) * r.nextDouble();
		//#if normalDistributed && exponentialDistributed
//@		}else if(mode == 1){
//@		result = -1* Math.log(result)/variance;
//@		}
		//#endif
		
		return result;
	}
	
	public double[] set(double rangeMin, double rangeMax, int size){
		double[] result = new double[size];
		
		for(int i=0;i<size;i++){
			
			result[i]=rangeMin + (rangeMax - rangeMin) * r.nextDouble();
		}
		
		return result;
		
	}

}
