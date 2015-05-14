/*
 * 
 */
package statMeUp;

/**
 * 
 */


import java.util.Arrays;

/**
 * The Class Extraction.
 *
 * @author Danny Behnecke
 */
public class Extraction {

	/**
	 * Mean.
	 *
	 * @param dataset the dataset
	 * @return the double
	 */
	public double mean(double[] dataset) {
		double result = 0;

		for (int i = 0; i < dataset.length; i++) {

			result += dataset[i];
		}
		result /= dataset.length;

		if (result - Math.floor(result) < 0.5) {
			return Math.floor(result);
		} else {
			return Math.ceil(result);
		}
	}

	/**
	 * Modal.
	 *
	 * @param dataset the dataset
	 * @return the double
	 */
	public double modal(double[] dataset) {
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
	 * @param dataset the dataset
	 * @return the double
	 */
	public double median(double[] dataset) {

		double[] sortSet = dataset;
		Arrays.sort(sortSet);
		int index = sortSet.length / 2 + 1;
		return sortSet[index];

	}

	/**
	 * Variance.
	 *
	 * @param dataset the dataset
	 * @return the double
	 */
	public double variance(double[] dataset) {

		double degreeOfFreedom = dataset.length - 1;
		double var = 0;
		double mean = mean(dataset);

		for (int i = 0; i < dataset.length; i++) {
			var += Math.pow(dataset[i] - mean, 2);
		}

		return var / degreeOfFreedom;
	}

	/**
	 * Standard deviation.
	 *
	 * @param dataset the dataset
	 * @return the double
	 */
	public double standardDeviation(double[] dataset) {

		return Math.sqrt(variance(dataset));
	}
}
