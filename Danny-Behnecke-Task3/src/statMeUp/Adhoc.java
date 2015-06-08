/**
 * 
 */
package statMeUp;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Danny Behnecke
 *
 */
public class Adhoc {
	
	public double[] readIn(Scanner s){
		
		System.out.println("How big shall the data set be?");
		int size = s.nextInt();
		
		double[] data = new double[size];
		
		for(int i =0;i<data.length;i++){
			System.out.println("Enter the " +i +". value:\n");//TODO data type exception loop
			data[i] = s.nextDouble();
			
		}
	
		return data;
		
	}

}
