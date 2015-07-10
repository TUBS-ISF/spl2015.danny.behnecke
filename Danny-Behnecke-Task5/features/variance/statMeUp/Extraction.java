/*
 * 
 */
package statMeUp;

/**
 * 
 */

import java.util.Arrays;
import java.util.Comparator;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

/**
 * The Class Extraction.
 *
 * @author Danny Behnecke
 */
public class Extraction {

	/**
	 * Variance.
	 *
	 * @param dataset
	 *            the dataset
	 * @return the double
	 */
	public double variance(double[] dataset) {

		double degreeOfFreedom = dataset.length;
		double var = 0;
		double mean = mean(dataset);

		for (int i = 0; i < dataset.length; i++) {
			var += Math.pow(dataset[i] - mean, 2);
		}

		var /= degreeOfFreedom;

		return var;
	}

}
