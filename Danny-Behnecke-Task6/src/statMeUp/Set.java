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

private String name  = "DEFAULT";
	



/** The set. */
private double[] set;//@TODO arraylist for changing set

/** The calc. */
private Extraction calc = new Extraction();


/**
 * Instantiates a new sets the.
 *
 * @param set the set
 */
public Set(String name,double[] set){
	setName(name);
	setSet(set);
}

public Set(){
	this("DEFAULT",new double[]{0.0,0.0,0.0
			//#ifdef minimum
//@			,0.0
			//#endif
			//#ifdef maximum
//@			,0.0
			//#endif
			});
}

public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


/**
 * Gets the sets the.
 *
 * @return the sets the
 */
public double[] getSet() {
	return set;
}


/**
 * Sets the sets the.
 *
 * @param set the new sets the
 */
public void setSet(double[] set) {
	this.set = set;
}


public String toString(){
	String result="";
	
	result+="Name: " + getName() + "\n";
	result+="Data: " + Arrays.toString(getSet()) +"\n";
	result+="Attributes: " + getAttributes();
	
	return result;
}

public String getAttributes(){
	String result="[";
		

	result+="]\n";
	
	return result;
	
}

public Extraction getCalc() {
	return calc;
}

}
