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
private double minimum;

/**
 * Instantiates a new sets the.
 *
 * @param set the set
 */
public Set(String name,double[] set){
	setMinimum(calc.getMin(set));
}

public String getAttributes(){
	String result=original();
		

result +="minimum " + getMinimum();

	
	return result;
	
}


public double getMinimum() {
	return minimum;
}

public void setMinimum(double minimum) {
	this.minimum = minimum;
}

}
