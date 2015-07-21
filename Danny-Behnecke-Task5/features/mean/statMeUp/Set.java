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

/** The standard deviation. */
private double mean;

/**
 * Instantiates a new sets the.
 *
 * @param set the set
 */
public Set(String name,double[] set){
	setMean(calc.mean(set));
}

/**
 * Gets the mean.
 *
 * @return the mean
 */
public double getMean() {
	return mean;
}


/**
 * Sets the mean.
 *
 * @param mean the new mean
 */
public void setMean(double mean) {
	this.mean = mean;
}


public String getAttributes(){
	String result=original();
		
	result+="mean: " + getMean() +" | ";
	
	
	return result;
	
}

}
