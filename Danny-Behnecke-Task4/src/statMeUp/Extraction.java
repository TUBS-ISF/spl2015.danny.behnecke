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
	 * Mean.
	 *
	 * @param dataset
	 *            the dataset
	 * @return the double
	 */
	public double mean(double[] dataset) {
		double result = 0;

		for (int i = 0; i < dataset.length; i++) {

			result += dataset[i];
		}
		result /= dataset.length;

		return result;
	}

	/**
	 * Modal.
	 *
	 * @param dataset
	 *            the dataset
	 * @return the double
	 */
	public double modal(double[] set) {
		double[] dataset = set;
		double modal = 0;
		double mfreq = 0;
		for (double i : dataset) {
			// Is this value the most frequent we've found so far?
			int freq = 0;
			for (double j : dataset) {
				if (j == i) {
					freq++;
				}
			}
			if (freq > mfreq) {
				modal = i;
				mfreq = freq;
			}
		}
		return modal;

	}

	/**
	 * Median.
	 *
	 * @param dataset
	 *            the dataset
	 * @return the double
	 */
	public double median(double[] dataset) {

		double[] sortSet = dataset;
		Arrays.sort(sortSet);

		if (sortSet.length % 2 == 0) {
			return (sortSet[(sortSet.length / 2) - 1] + sortSet[sortSet.length / 2]) / 2.0;
		} else {
			return sortSet[sortSet.length / 2];
		}

	}

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

	/**
	 * Standard deviation.
	 *
	 * @param dataset
	 *            the dataset
	 * @return the double
	 */
	public double standardDeviation(double[] dataset) {

		return Math.sqrt(variance(dataset));
	}

	/**
	 * @param dataset
	 *            the dataset
	 * @return the maximum value from the set
	 */
	public double getMax(double[] dataset) {

		double result = 0;

		for (int i = 0; i < dataset.length; i++) {

			if (dataset[i] >= result) {
				result = dataset[i];
			}

		}

		return result;
	}

	/**
	 * @param dataset
	 *            the dataset
	 * @return the minimum value from the set
	 * 
	 * */
	public double getMin(double[] dataset) {

		double result = 0;

		for (int i = 0; i < dataset.length; i++) {

			if (dataset[i] <= result) {
				result = dataset[i];
			}

		}

		return result;
	}

	public double[] sort(double[] dataset
	// #ifdef descending
//@			, boolean mode
	// #endif
	) {

		// #ifdef descending
//@		if (mode) {
//@			Comparator cmp = java.util.Collections.reverseOrder();
//@			Arrays.sort(dataset, cmp);
//@		} else {
//@			Arrays.sort(dataset);
//@
//@		}
		// #endif
		// #ifndef descending
		Arrays.sort(dataset);
		// #endif
		return dataset;

	}

}
