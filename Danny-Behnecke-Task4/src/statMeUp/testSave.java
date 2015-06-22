/**
 * 
 */
package statMeUp;

import java.util.Random;

/**
 * @author Danny
 *
 */
public class testSave {
public static void main(String[]args){
	
	Random r = new Random();
	double rangeMin = 1;
	double rangeMax = 100;
	double[] data = new double[(int)rangeMax];
	
	
	
	for(int i=0;i<rangeMax;i++){
		
	data[i] = rangeMin + (rangeMax - rangeMin) * r.nextDouble();	
	System.out.println(data[i]);
		
	}
	
	Set set = new Set("RANDOM", data);
	
	saveSet saver = new saveJSON();
	
	saver.saveResult(set, "D:\\test.json");
	
	System.out.println("Save Test");
	
	
}
}
