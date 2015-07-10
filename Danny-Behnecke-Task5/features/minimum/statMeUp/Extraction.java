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

}
