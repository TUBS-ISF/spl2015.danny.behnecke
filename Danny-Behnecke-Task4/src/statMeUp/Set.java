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

/** The standard deviation. */
private double mean, median, modal, variance, standardDeviation, minimum, maximum;

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
	setVariance(calc.variance(this.set));
	setStandardDeviation(calc.standardDeviation(this.set));
	setMean(calc.mean(this.set));
	setMedian(calc.median(this.set));
	setModal(calc.modal(this.set));
	//#ifdef minimum
//@	setMinimum(calc.getMin(this.set));
	//#endif
	//#ifdef maximum
//@	setMaximum(calc.getMax(this.set));
	//#endif
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


/**
 * Gets the modal.
 *
 * @return the modal
 */
public double getModal() {
	return modal;
}


/**
 * Sets the modal.
 *
 * @param modal the new modal
 */
public void setModal(double modal) {
	this.modal = modal;
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

public String toString(){
	String result="";
	
	result+="Name: " + getName() + "\n";
	result+="Data: " + Arrays.toString(getSet()) +"\n";
	result+="Attributes: " + getAttributes();
	
	return result;
}

public String getAttributes(){
	String result="[";
		
	result+="mean: " + getMean() +" | ";
	result+="median "+ getMedian() +" | ";
	if(Configuration.isMODAL())result+="modal"+ getModal() +" | ";
	result+="variance "+ getVariance() +" | ";
	result+="standard deviation "+ getStandardDeviation();
	//#ifdef minimum
//@	result +="minimum " + getMinimum();
	//#endif
	//#ifdef maximum
//@	result += "maximum" + getMaximum();
	//#endif
	result+="]\n";
	
	return result;
	
}


public double getMinimum() {
	return minimum;
}

public void setMinimum(double minimum) {
	this.minimum = minimum;
}

public double getMaximum() {
	return maximum;
}

public void setMaximum(double maximum) {
	this.maximum = maximum;
}

}
