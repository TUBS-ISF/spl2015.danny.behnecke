package statMeUp;

import java.util.Arrays;


/**
 * The Class Set.
 */
/**
 * @author Danny Behnecke
 *
 */
public class Set {


private double median;

/**
 * Instantiates a new sets the.
 *
 * @param set the set
 */
public Set(String name,double[] set){
	setMedian(calc.median(set));
}

/**
 * Gets the median.
 *
 * @return the median
 */
public double getMedian() {
	return median;
}


/**
 * Sets the median.
 *
 * @param median the new median
 */
public void setMedian(double median) {
	this.median = median;
}


public String getAttributes(){
	String result=original();
	result+="median "+ getMedian() +" | ";
	
	return result;
	
}

}
