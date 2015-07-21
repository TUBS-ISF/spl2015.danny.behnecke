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
private double maximum;

/** The calc. */
private Extraction calc = new Extraction();


/**
 * Instantiates a new sets the.
 *
 * @param set the set
 */
public Set(String name,double[] set){
	setMaximum(calc.getMax(set));
}

public String getAttributes(){
	String result=original();
	result += "maximum" + getMaximum();

	
	return result;
	
}


public double getMaximum() {
	return maximum;
}

public void setMaximum(double maximum) {
	this.maximum = maximum;
}

}
