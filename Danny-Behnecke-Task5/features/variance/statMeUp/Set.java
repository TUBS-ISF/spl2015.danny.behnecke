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
private double variance;

/**
 * Instantiates a new sets the.
 *
 * @param set the set
 */
public Set(String name,double[] set){
	setVariance(calc.variance(set));
	
}

/**
 * Gets the variance.
 *
 * @return the variance
 */
public double getVariance() {
	return variance;
}


/**
 * Sets the variance.
 *
 * @param variance the new variance
 */
public void setVariance(double variance) {
	this.variance = variance;
}


public String getAttributes(){
	String result=original();
	result+="variance "+ getVariance() +" | ";
	
	
	return result;
	
}

}
