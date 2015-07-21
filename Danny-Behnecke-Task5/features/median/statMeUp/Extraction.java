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

}
