package statMeUp;


/**
 * The Class Set.
 */
/**
 * @author Danny Behnecke
 *
 */
public class Set {

/** The set. */
private double[] set;//@TODO arraylist for changing set

/** The standard deviation. */
private double mean, median, modal, variance, standardDeviation;

/** The calc. */
private Extraction calc = new Extraction();


/**
 * Instantiates a new sets the.
 *
 * @param set the set
 */
public Set(double[] set){
	
	setSet(set);
	setVariance(calc.variance(this.set));
	setMean(calc.mean(this.set));
	setMedian(calc.median(this.set));
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


}
