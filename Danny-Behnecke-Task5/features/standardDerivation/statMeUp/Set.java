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
private double  standardDeviation;

/**
 * Instantiates a new sets the.
 *
 * @param set the set
 */
public Set(String name,double[] set){
	setStandardDeviation(calc.standardDeviation(set));
}




/**
 * Gets the standard deviation.
 *
 * @return the standard deviation
 */
public double getStandardDeviation() {
	return standardDeviation;
}


/**
 * Sets the standard deviation.
 *
 * @param standardDeviation the new standard deviation
 */
public void setStandardDeviation(double standardDeviation) {
	this.standardDeviation = standardDeviation;
}



public String getAttributes(){
	String result=original();		

	result+="standard deviation "+ getStandardDeviation();

	
	return result;
	
}




}
